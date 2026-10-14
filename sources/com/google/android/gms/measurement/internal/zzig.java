package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
final class zzig implements Runnable {
    public final /* synthetic */ zzih zza;
    private final URL zzb;
    private final String zzc;
    private final zzfw zzd;

    public zzig(zzih zzihVar, String str, URL url, byte[] bArr, Map map, zzfw zzfwVar, byte[] bArr2) {
        this.zza = zzihVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfwVar);
        this.zzb = url;
        this.zzd = zzfwVar;
        this.zzc = str;
    }

    private final void zzb(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzif
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(i10, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.zzig] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r10;
        ?? r11;
        int responseCode;
        Throwable th;
        IOException e10;
        InputStream inputStream;
        this.zza.zzax();
        try {
            zzih zzihVar = this.zza;
            URLConnection uRLConnectionOpenConnection = this.zzb.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzihVar.zzs.zzf();
            r10 = 60000;
            r11 = 60000;
            httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            zzihVar.zzs.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i10 = inputStream.read(bArr);
                                    if (i10 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        zzb(responseCode, null, byteArray, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i10);
                                }
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
                        e10 = e11;
                        r11 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(responseCode, e10, null, r11);
                    } catch (Throwable th4) {
                        th = th4;
                        r10 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(responseCode, null, null, r10);
                        throw th;
                    }
                } catch (IOException e12) {
                    e10 = e12;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(responseCode, e10, null, r11);
                } catch (Throwable th5) {
                    th = th5;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(responseCode, null, null, r10);
                    throw th;
                }
            } catch (IOException e13) {
                e = e13;
                r11 = 0;
                IOException iOException = e;
                responseCode = 0;
                e10 = iOException;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzb(responseCode, e10, null, r11);
            } catch (Throwable th6) {
                th = th6;
                r10 = 0;
                Throwable th7 = th;
                responseCode = 0;
                th = th7;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzb(responseCode, null, null, r10);
                throw th;
            }
        } catch (IOException e14) {
            e = e14;
            httpURLConnection = null;
            r11 = 0;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            r10 = 0;
        }
    }

    public final /* synthetic */ void zza(int i10, Exception exc, byte[] bArr, Map map) {
        zzfw zzfwVar = this.zzd;
        zzfwVar.zza.zzC(this.zzc, i10, exc, bArr, map);
    }
}
