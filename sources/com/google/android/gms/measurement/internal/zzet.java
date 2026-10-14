package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
final class zzet implements Runnable {
    public final /* synthetic */ zzeu zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzeq zzd;
    private final String zze;
    private final Map zzf;

    public zzet(zzeu zzeuVar, String str, URL url, byte[] bArr, Map map, zzeq zzeqVar) {
        this.zza = zzeuVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzeqVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzeqVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c9 A[Catch: all -> 0x00ef, LOOP:1: B:26:0x00c3->B:28:0x00c9, LOOP_END, TryCatch #4 {all -> 0x00ef, blocks: (B:25:0x00c1, B:26:0x00c3, B:28:0x00c9, B:29:0x00cd), top: B:77:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    /* JADX WARN: Code duplicated, block: B:79:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00cd A[EDGE_INSN: B:93:0x00cd->B:29:0x00cd BREAK  A[LOOP:1: B:26:0x00c3->B:28:0x00c9], SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fc: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:42:0x00fa */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0102: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:44:0x00ff */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        int i10;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e10;
        Map map2;
        zzes zzesVar;
        zzfv zzfvVarZzaz;
        IOException iOException;
        int responseCode;
        Map map3;
        Map map4;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i11;
        this.zza.zzax();
        int i12 = 0;
        OutputStream outputStream = null;
        try {
            zzeu zzeuVar = this.zza;
            URLConnection uRLConnectionOpenConnection = this.zzb.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzeuVar.zzs.zzf();
            httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            zzeuVar.zzs.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.zzf;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.zzc != null) {
                    byte[] bArrZzy = this.zza.zzf.zzu().zzy(this.zzc);
                    zzem zzemVarZzj = this.zza.zzs.zzay().zzj();
                    int length = bArrZzy.length;
                    zzemVarZzj.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrZzy);
                        outputStream2.close();
                        responseCode = httpURLConnection.getResponseCode();
                        try {
                            try {
                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        bArr = new byte[1024];
                                        while (true) {
                                            i11 = inputStream.read(bArr);
                                            if (i11 > 0) {
                                                break;
                                            } else {
                                                byteArrayOutputStream.write(bArr, 0, i11);
                                            }
                                        }
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        zzfvVarZzaz = this.zza.zzs.zzaz();
                                        zzesVar = new zzes(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStream = null;
                                }
                            } catch (IOException e11) {
                                map2 = null;
                                iOException = e11;
                                i12 = responseCode;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e12) {
                                        this.zza.zzs.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeo.zzn(this.zze), e12);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzfvVarZzaz = this.zza.zzs.zzaz();
                                zzesVar = new zzes(this.zze, this.zzd, i12, iOException, null, map2, null);
                            } catch (Throwable th4) {
                                th = th4;
                                map = null;
                                i10 = responseCode;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e13) {
                                        this.zza.zzs.zzay().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzeo.zzn(this.zze), e13);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                this.zza.zzs.zzaz().zzp(new zzes(this.zze, this.zzd, i10, null, null, map, null));
                                throw th;
                            }
                        } catch (IOException e14) {
                            iOException = e14;
                            i12 = responseCode;
                            map2 = map4;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzfvVarZzaz = this.zza.zzs.zzaz();
                            zzesVar = new zzes(this.zze, this.zzd, i12, iOException, null, map2, null);
                        } catch (Throwable th5) {
                            th = th5;
                            i10 = responseCode;
                            map = map3;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.zza.zzs.zzaz().zzp(new zzes(this.zze, this.zzd, i10, null, null, map, null));
                            throw th;
                        }
                    } catch (IOException e15) {
                        e10 = e15;
                        map2 = null;
                        outputStream = outputStream2;
                        iOException = e10;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzfvVarZzaz = this.zza.zzs.zzaz();
                        zzesVar = new zzes(this.zze, this.zzd, i12, iOException, null, map2, null);
                        zzfvVarZzaz.zzp(zzesVar);
                    } catch (Throwable th6) {
                        th = th6;
                        i10 = 0;
                        map = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzs.zzaz().zzp(new zzes(this.zze, this.zzd, i10, null, null, map, null));
                        throw th;
                    }
                } else {
                    responseCode = httpURLConnection.getResponseCode();
                    Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    inputStream = httpURLConnection.getInputStream();
                    bArr = new byte[1024];
                    while (true) {
                        i11 = inputStream.read(bArr);
                        if (i11 > 0) {
                            break;
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i11);
                    }
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    zzfvVarZzaz = this.zza.zzs.zzaz();
                    zzesVar = new zzes(this.zze, this.zzd, responseCode, null, byteArray2, headerFields2, null);
                }
            } catch (IOException e16) {
                i12 = 0;
                map2 = null;
                iOException = e16;
            } catch (Throwable th7) {
                i10 = 0;
                map = null;
                th = th7;
            }
            zzfvVarZzaz.zzp(zzesVar);
        } catch (IOException e17) {
            e10 = e17;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            i10 = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}
