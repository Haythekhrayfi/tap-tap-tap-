package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class zzcep extends zzfy implements zzhb {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzha zzf;
    private zzgj zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    public zzcep(String str, zzhg zzhgVar, int i10, int i11, long j10, long j11) {
        super(true);
        zzdy.zzc(str);
        this.zze = str;
        this.zzf = new zzha();
        this.zzc = i10;
        this.zzd = i11;
        this.zzi = new ArrayDeque();
        this.zzr = j10;
        this.zzs = j11;
        if (zzhgVar != null) {
            zzf(zzhgVar);
        }
    }

    private final void zzl() {
        while (!this.zzi.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzi.remove()).disconnect();
            } catch (Exception e10) {
                zzbzr.zzh("Unexpected error while disconnecting", e10);
            }
        }
        this.zzh = null;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws zzgx {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzm;
            long j11 = this.zzn;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.zzo + j11;
            long j13 = i11;
            long j14 = this.zzs;
            long j15 = j12 + j13 + j14;
            long j16 = this.zzq;
            long j17 = j16 + 1;
            if (j15 > j17) {
                long j18 = this.zzp;
                if (j16 < j18) {
                    long jMin = Math.min(j18, Math.max(((this.zzr + j17) - j14) - 1, (-1) + j17 + j13));
                    zzk(j17, jMin, 2);
                    this.zzq = jMin;
                    j16 = jMin;
                }
            }
            int i12 = this.zzj.read(bArr, i10, (int) Math.min(j13, ((j16 + 1) - this.zzo) - this.zzn));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.zzn += (long) i12;
            zzg(i12);
            return i12;
        } catch (IOException e10) {
            throw new zzgx(e10, this.zzg, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws zzgx {
        long jMax;
        this.zzg = zzgjVar;
        this.zzn = 0L;
        long j10 = zzgjVar.zzf;
        long j11 = zzgjVar.zzg;
        long jMin = j11 == -1 ? this.zzr : Math.min(this.zzr, j11);
        this.zzo = j10;
        HttpURLConnection httpURLConnectionZzk = zzk(j10, (jMin + j10) - 1, 1);
        this.zzh = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    long j14 = zzgjVar.zzg;
                    if (j14 != -1) {
                        this.zzm = j14;
                        jMax = Math.max(j12, (this.zzo + j14) - 1);
                    } else {
                        this.zzm = j13 - this.zzo;
                        jMax = j13 - 1;
                    }
                    this.zzp = jMax;
                    this.zzq = j12;
                    this.zzk = true;
                    zzj(zzgjVar);
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzbzr.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcen(headerField, zzgjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0025 */
    @Override // com.google.android.gms.internal.ads.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() throws com.google.android.gms.internal.ads.zzgx {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r7.zzj     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L16
            r2.close()     // Catch: java.io.IOException -> La java.lang.Throwable -> L25
            goto L16
        La:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzgx r3 = new com.google.android.gms.internal.ads.zzgx     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.zzgj r4 = r7.zzg     // Catch: java.lang.Throwable -> L25
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L25
            throw r3     // Catch: java.lang.Throwable -> L25
        L16:
            r7.zzj = r1
            r7.zzl()
            boolean r1 = r7.zzk
            if (r1 == 0) goto L24
            r7.zzk = r0
            r7.zzh()
        L24:
            return
        L25:
            r2 = move-exception
            r7.zzj = r1
            r7.zzl()
            boolean r1 = r7.zzk
            if (r1 == 0) goto L34
            r7.zzk = r0
            r7.zzh()
        L34:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcep.zzd():void");
    }

    @Override // com.google.android.gms.internal.ads.zzfy, com.google.android.gms.internal.ads.zzge
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    public final HttpURLConnection zzk(long j10, long j11, int i10) throws zzgx {
        String string = this.zzg.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-" + j11);
            httpURLConnection.setRequestProperty("User-Agent", this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzi.add(httpURLConnection);
            String string2 = this.zzg.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzl = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzceo(this.zzl, headerFields, this.zzg, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzj != null) {
                        inputStream = new SequenceInputStream(this.zzj, inputStream);
                    }
                    this.zzj = inputStream;
                    return httpURLConnection;
                } catch (IOException e10) {
                    zzl();
                    throw new zzgx(e10, this.zzg, 2000, i10);
                }
            } catch (IOException e11) {
                zzl();
                throw new zzgx("Unable to connect to ".concat(String.valueOf(string2)), e11, this.zzg, 2000, i10);
            }
        } catch (IOException e12) {
            throw new zzgx("Unable to connect to ".concat(String.valueOf(string)), e12, this.zzg, 2000, i10);
        }
    }
}
