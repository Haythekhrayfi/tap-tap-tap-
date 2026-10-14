package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdw extends zzfy implements zzhb {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzha zzh;
    private zzgj zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    public zzcdw(String str, zzhg zzhgVar, int i10, int i11, int i12) {
        super(true);
        this.zzd = new zzcdv(this);
        this.zzs = new HashSet();
        zzdy.zzc(str);
        this.zzg = str;
        this.zzh = new zzha();
        this.zze = i10;
        this.zzf = i11;
        this.zzr = i12;
        if (zzhgVar != null) {
            zzf(zzhgVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzbzr.zzh("Unexpected error while disconnecting", e10);
            }
            this.zzj = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[Catch: IOException -> 0x008e, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e A[Catch: IOException -> 0x008e, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0084 A[Catch: IOException -> 0x008e, TRY_LEAVE, TryCatch #0 {IOException -> 0x008e, blocks: (B:2:0x0000, B:21:0x0056, B:23:0x005e, B:26:0x0069, B:27:0x006f, B:29:0x0077, B:32:0x007e, B:33:0x0083, B:34:0x0084, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws zzgx {
        int i12;
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j10 = this.zzp;
                    long j11 = this.zzn;
                    if (j10 == j11) {
                        zzc.set(bArr2);
                        break;
                    }
                    int i13 = this.zzk.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i13 == -1) {
                        throw new EOFException();
                    }
                    this.zzp += (long) i13;
                    zzg(i13);
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.zzo;
            if (j12 != -1) {
                long j13 = j12 - this.zzq;
                if (j13 != 0) {
                    i11 = (int) Math.min(i11, j13);
                    i12 = this.zzk.read(bArr, i10, i11);
                    if (i12 == -1) {
                        this.zzq += (long) i12;
                        zzg(i12);
                        return i12;
                    }
                    if (this.zzo == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i12 = this.zzk.read(bArr, i10, i11);
                if (i12 == -1) {
                    this.zzq += (long) i12;
                    zzg(i12);
                    return i12;
                }
                if (this.zzo == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e10) {
            throw new zzgx(e10, this.zzi, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7 A[Catch: IOException -> 0x0289, TryCatch #0 {IOException -> 0x0289, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:93:0x022e, B:95:0x0239, B:97:0x024a, B:100:0x0253, B:101:0x0262, B:103:0x026a, B:104:0x0271, B:105:0x0272, B:106:0x0288), top: B:110:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0102  */
    /* JADX WARN: Code duplicated, block: B:87:0x0200  */
    /* JADX WARN: Code duplicated, block: B:95:0x0239 A[Catch: IOException -> 0x0289, TryCatch #0 {IOException -> 0x0289, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:93:0x022e, B:95:0x0239, B:97:0x024a, B:100:0x0253, B:101:0x0262, B:103:0x026a, B:104:0x0271, B:105:0x0272, B:106:0x0288), top: B:110:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws zzgx {
        int responseCode;
        String headerField;
        String protocol;
        int responseCode2;
        zzgz zzgzVar;
        long j10;
        long jMax;
        this.zzi = zzgjVar;
        long j11 = 0;
        this.zzq = 0L;
        this.zzp = 0L;
        try {
            URL url = new URL(zzgjVar.zza.toString());
            long j12 = zzgjVar.zzf;
            long j13 = zzgjVar.zzg;
            boolean zZza = zzgjVar.zza(1);
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i11);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzd);
                }
                httpURLConnection.setConnectTimeout(this.zze);
                httpURLConnection.setReadTimeout(this.zzf);
                for (Map.Entry entry : this.zzh.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j12 == j11) {
                    if (j13 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.zzg);
                    if (!zZza) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzj = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.zzm = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzj.getHeaderFields();
                                zzn();
                                zzgzVar = new zzgz(this.zzm, null, null, headerFields, zzgjVar, zzfj.zzf);
                                if (this.zzm == 416) {
                                    throw zzgzVar;
                                }
                                zzgzVar.initCause(new zzgf(AdError.REMOTE_ADS_SERVICE_ERROR));
                                throw zzgzVar;
                            }
                            if (responseCode2 == 200) {
                                j10 = zzgjVar.zzf;
                                if (j10 == 0) {
                                    j10 = 0;
                                }
                            } else {
                                j10 = 0;
                            }
                            this.zzn = j10;
                            boolean zZza2 = zzgjVar.zza(1);
                            long j14 = zzgjVar.zzg;
                            if (!zZza2 && j14 == -1) {
                                HttpURLConnection httpURLConnection2 = this.zzj;
                                String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                if (TextUtils.isEmpty(headerField2)) {
                                    jMax = -1;
                                } else {
                                    try {
                                        jMax = Long.parseLong(headerField2);
                                    } catch (NumberFormatException unused) {
                                        zzbzr.zzg("Unexpected Content-Length [" + headerField2 + "]");
                                        jMax = -1;
                                    }
                                }
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    Matcher matcher = zzb.matcher(headerField3);
                                    if (matcher.find()) {
                                        try {
                                            long j15 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                            if (jMax < 0) {
                                                jMax = j15;
                                            } else if (jMax != j15) {
                                                zzbzr.zzj("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                                jMax = Math.max(jMax, j15);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            zzbzr.zzg("Unexpected Content-Range [" + headerField3 + "]");
                                        }
                                    }
                                }
                                j14 = jMax != -1 ? jMax - this.zzn : -1L;
                            }
                            this.zzo = j14;
                            try {
                                this.zzk = this.zzj.getInputStream();
                                this.zzl = true;
                                zzj(zzgjVar);
                                return this.zzo;
                            } catch (IOException e10) {
                                zzn();
                                throw new zzgx(e10, zzgjVar, 2000, 1);
                            }
                        } catch (IOException e11) {
                            zzn();
                            throw new zzgx("Unable to connect to ".concat(String.valueOf(zzgjVar.zza.toString())), e11, zzgjVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i10 = i11;
                    j11 = 0;
                } else {
                    j11 = j12;
                }
                String string = "bytes=" + j11 + "-";
                if (j13 != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append((j11 + j13) - 1);
                    string = sb2.toString();
                }
                httpURLConnection.setRequestProperty("Range", string);
                httpURLConnection.setRequestProperty("User-Agent", this.zzg);
                if (!zZza) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.zzj = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.zzm = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.zzj.getHeaderFields();
                    zzn();
                    zzgzVar = new zzgz(this.zzm, null, null, headerFields2, zzgjVar, zzfj.zzf);
                    if (this.zzm == 416) {
                        throw zzgzVar;
                    }
                    zzgzVar.initCause(new zzgf(AdError.REMOTE_ADS_SERVICE_ERROR));
                    throw zzgzVar;
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i10 = i11;
                j11 = 0;
            }
        } catch (IOException e12) {
            throw new zzgx("Unable to connect to ".concat(String.valueOf(zzgjVar.zza.toString())), e12, zzgjVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e A[Catch: Exception -> 0x0067, all -> 0x008d, TRY_LEAVE, TryCatch #0 {Exception -> 0x0067, blocks: (B:15:0x001f, B:17:0x0027, B:23:0x0036, B:25:0x0046, B:27:0x004e), top: B:45:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() throws zzgx {
        String name;
        try {
            if (this.zzk != null) {
                HttpURLConnection httpURLConnection = this.zzj;
                long j10 = this.zzo;
                if (j10 != -1) {
                    j10 -= this.zzq;
                }
                int i10 = zzfj.zza;
                if (i10 == 19 || i10 == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j10 == -1) {
                            if (inputStream.read() != -1) {
                                name = inputStream.getClass().getName();
                                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream, new Object[0]);
                                }
                            }
                            this.zzk = null;
                            zzn();
                            if (this.zzl) {
                                this.zzl = false;
                                zzh();
                            }
                            this.zzs.clear();
                            throw th;
                        }
                        if (j10 > 2048) {
                            name = inputStream.getClass().getName();
                            if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream")) {
                                Method declaredMethod2 = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(inputStream, new Object[0]);
                            } else {
                                Method declaredMethod3 = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod3.setAccessible(true);
                                declaredMethod3.invoke(inputStream, new Object[0]);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzk.close();
                } catch (IOException e10) {
                    throw new zzgx(e10, this.zzi, 2000, 3);
                }
            }
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
        } catch (Throwable th) {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy, com.google.android.gms.internal.ads.zzge
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i10) {
        this.zzr = i10;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e10) {
                    zzbzr.zzk("Failed to update receive buffer size.", e10);
                }
            }
        }
    }
}
