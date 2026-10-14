package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgr extends zzfy implements zzhb {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzha zzf;
    private final zzha zzg;
    private zzgj zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzgr() {
        this(null, 8000, 8000, false, null, null, false);
    }

    private zzgr(String str, int i10, int i11, boolean z10, zzha zzhaVar, zzfpi zzfpiVar, boolean z11) {
        super(true);
        this.zze = str;
        this.zzc = i10;
        this.zzd = i11;
        this.zzb = z10;
        this.zzf = zzhaVar;
        this.zzg = new zzha();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    private final HttpURLConnection zzk(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        StringBuilder sbA;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzc);
        httpURLConnection.setReadTimeout(this.zzd);
        HashMap map2 = new HashMap();
        map2.putAll(this.zzf.zza());
        map2.putAll(this.zzg.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 != 0) {
            sbA = i2.a.a("bytes=", j10, "-");
            if (j11 != -1) {
                sbA.append((j10 + j11) - 1);
            }
            string = sbA.toString();
        } else if (j11 == -1) {
            string = null;
        } else {
            j10 = 0;
            sbA = i2.a.a("bytes=", j10, "-");
            if (j11 != -1) {
                sbA.append((j10 + j11) - 1);
            }
            string = sbA.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str = this.zze;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z10 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(false);
        int i11 = zzgj.zzj;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzgj zzgjVar) throws zzgx {
        if (str == null) {
            throw new zzgx("Null location redirect", zzgjVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzgx("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzgjVar, AdError.INTERNAL_ERROR_CODE, 1);
            }
            if (this.zzb || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzgx(q.a("Disallowed cross-protocol redirect (", url.getProtocol(), " to ", protocol, ")"), zzgjVar, AdError.INTERNAL_ERROR_CODE, 1);
        } catch (MalformedURLException e10) {
            throw new zzgx(e10, zzgjVar, AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzer.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws zzgx {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzm;
            if (j10 != -1) {
                long j11 = j10 - this.zzn;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.zzj;
            int i12 = zzfj.zza;
            int i13 = inputStream.read(bArr, i10, i11);
            if (i13 == -1) {
                return -1;
            }
            this.zzn += (long) i13;
            zzg(i13);
            return i13;
        } catch (IOException e10) {
            zzgj zzgjVar = this.zzh;
            int i14 = zzfj.zza;
            throw zzgx.zza(e10, zzgjVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws zzgx {
        int i10;
        HttpURLConnection httpURLConnectionZzk;
        byte[] byteArray;
        long j10;
        this.zzh = zzgjVar;
        this.zzn = 0L;
        this.zzm = 0L;
        zzi(zzgjVar);
        try {
            URL url = new URL(zzgjVar.zza.toString());
            long j11 = zzgjVar.zzf;
            long j12 = zzgjVar.zzg;
            boolean zZza = zzgjVar.zza(1);
            try {
                if (this.zzb) {
                    URL urlZzl = url;
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        if (i11 > 20) {
                            i10 = 1;
                            throw new zzgx(new NoRouteToHostException("Too many redirects: " + i12), zzgjVar, AdError.INTERNAL_ERROR_CODE, 1);
                        }
                        long j13 = j12;
                        long j14 = j11;
                        URL url2 = urlZzl;
                        HttpURLConnection httpURLConnectionZzk2 = zzk(urlZzl, 1, null, j11, j12, zZza, false, zzgjVar.zzd);
                        int responseCode = httpURLConnectionZzk2.getResponseCode();
                        String headerField = httpURLConnectionZzk2.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnectionZzk = httpURLConnectionZzk2;
                            break;
                        }
                        i10 = 1;
                        try {
                            httpURLConnectionZzk2.disconnect();
                            urlZzl = zzl(url2, headerField, zzgjVar);
                            i11 = i12;
                            j12 = j13;
                            j11 = j14;
                        } catch (IOException e10) {
                            e = e10;
                        }
                        e = e10;
                        zzm();
                        throw zzgx.zza(e, zzgjVar, i10);
                    }
                }
                httpURLConnectionZzk = zzk(url, 1, null, j11, j12, zZza, true, zzgjVar.zzd);
                this.zzi = httpURLConnectionZzk;
                this.zzl = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i13 = this.zzl;
                if (i13 < 200 || i13 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (this.zzl == 416) {
                        if (zzgjVar.zzf == zzhc.zzb(httpURLConnectionZzk.getHeaderField("Content-Range"))) {
                            this.zzk = true;
                            zzj(zzgjVar);
                            long j15 = zzgjVar.zzg;
                            if (j15 != -1) {
                                return j15;
                            }
                            return 0L;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        if (errorStream != null) {
                            int i14 = zzfj.zza;
                            byte[] bArr = new byte[4096];
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            while (true) {
                                int i15 = errorStream.read(bArr);
                                if (i15 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i15);
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                        } else {
                            byteArray = zzfj.zzf;
                        }
                    } catch (IOException unused) {
                        byteArray = zzfj.zzf;
                    }
                    zzm();
                    throw new zzgz(this.zzl, responseMessage, this.zzl == 416 ? new zzgf(AdError.REMOTE_ADS_SERVICE_ERROR) : null, headerFields, zzgjVar, byteArray);
                }
                httpURLConnectionZzk.getContentType();
                if (this.zzl == 200) {
                    j10 = zzgjVar.zzf;
                    if (j10 == 0) {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField("Content-Encoding"));
                long j16 = zzgjVar.zzg;
                if (zEqualsIgnoreCase || j16 != -1) {
                    this.zzm = j16;
                } else {
                    long jZza = zzhc.zza(httpURLConnectionZzk.getHeaderField("Content-Length"), httpURLConnectionZzk.getHeaderField("Content-Range"));
                    this.zzm = jZza != -1 ? jZza - j10 : -1L;
                }
                try {
                    this.zzj = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.zzj = new GZIPInputStream(this.zzj);
                    }
                    this.zzk = true;
                    zzj(zzgjVar);
                    if (j10 != 0) {
                        try {
                            byte[] bArr2 = new byte[4096];
                            while (j10 > 0) {
                                int iMin = (int) Math.min(j10, 4096L);
                                InputStream inputStream = this.zzj;
                                int i16 = zzfj.zza;
                                int i17 = inputStream.read(bArr2, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzgx(new InterruptedIOException(), zzgjVar, 2000, 1);
                                }
                                if (i17 == -1) {
                                    throw new zzgx(zzgjVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                                }
                                j10 -= (long) i17;
                                zzg(i17);
                            }
                        } catch (IOException e11) {
                            zzm();
                            if (e11 instanceof zzgx) {
                                throw ((zzgx) e11);
                            }
                            throw new zzgx(e11, zzgjVar, 2000, 1);
                        }
                    }
                    return this.zzm;
                } catch (IOException e12) {
                    zzm();
                    throw new zzgx(e12, zzgjVar, 2000, 1);
                }
            } catch (IOException e13) {
                e = e13;
                i10 = 1;
            }
        } catch (IOException e14) {
            e = e14;
            i10 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004d A[Catch: Exception -> 0x0069, all -> 0x008a, TRY_LEAVE, TryCatch #0 {Exception -> 0x0069, blocks: (B:15:0x001e, B:17:0x0026, B:23:0x0035, B:25:0x0045, B:27:0x004d, B:29:0x0058), top: B:45:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() throws zzgx {
        String name;
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                long j10 = this.zzm;
                long j11 = j10 == -1 ? -1L : j10 - this.zzn;
                HttpURLConnection httpURLConnection = this.zzi;
                if (httpURLConnection != null && zzfj.zza <= 20) {
                    try {
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        if (j11 == -1) {
                            if (inputStream2.read() != -1) {
                                name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    Objects.requireNonNull(superclass);
                                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream2, new Object[0]);
                                }
                            }
                            this.zzj = null;
                            zzm();
                            if (this.zzk) {
                                this.zzk = false;
                                zzh();
                            }
                            throw th;
                        }
                        if (j11 > 2048) {
                            name = inputStream2.getClass().getName();
                            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name)) {
                                Class<? super Object> superclass2 = inputStream2.getClass().getSuperclass();
                                Objects.requireNonNull(superclass2);
                                Method declaredMethod2 = superclass2.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(inputStream2, new Object[0]);
                            } else {
                                Class<? super Object> superclass3 = inputStream2.getClass().getSuperclass();
                                Objects.requireNonNull(superclass3);
                                Method declaredMethod3 = superclass3.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod3.setAccessible(true);
                                declaredMethod3.invoke(inputStream2, new Object[0]);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    zzgj zzgjVar = this.zzh;
                    int i10 = zzfj.zza;
                    throw new zzgx(e10, zzgjVar, 2000, 3);
                }
            }
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        } catch (Throwable th) {
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy, com.google.android.gms.internal.ads.zzge
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzfsf.zzd() : new zzgp(httpURLConnection.getHeaderFields());
    }
}
