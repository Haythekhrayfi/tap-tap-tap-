package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.developer.filepicker.model.DialogConfigs;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdu extends zzcdl implements zzcbq {
    public static final /* synthetic */ int zzd = 0;
    private zzcbr zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcdd zzi;
    private long zzj;
    private long zzk;

    public zzcdu(zzcca zzccaVar, zzcbz zzcbzVar) {
        super(zzccaVar);
        zzcem zzcemVar = new zzcem(zzccaVar.getContext(), zzcbzVar, (zzcca) this.zzc.get(), null);
        zzbzr.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcemVar;
        zzcemVar.zzL(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(zzbzk.zze(str)));
    }

    private static String zzd(String str, Exception exc) {
        return q.a(str, DialogConfigs.DIRECTORY_SEPERATOR, exc.getClass().getCanonicalName(), ":", exc.getMessage());
    }

    private final void zzx(long j10) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdt
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzb();
            }
        }, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcbr zzcbrVar = this.zze;
        if (zzcbrVar != null) {
            zzcbrVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzD(int i10, int i11) {
    }

    public final zzcbr zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcbr zzcbrVar = this.zze;
        this.zze = null;
        return zzcbrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.zzcdl, com.google.android.gms.internal.ads.zzcdu] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzcdu] */
    /* JADX WARN: Type inference failed for: r2v30 */
    public final /* synthetic */ void zzb() throws Throwable {
        String str;
        zzcdu zzcduVarBooleanValue;
        zzcdu zzcduVar;
        zzcdu zzcduVar2;
        long j10;
        String str2;
        long j11;
        String strZzc = zzc(this.zzf);
        Object obj = "error";
        try {
            zzbbe zzbbeVar = zzbbm.zzx;
            zzbbk zzbbkVarZzc = com.google.android.gms.ads.internal.client.zzba.zzc();
            long jLongValue = ((Long) zzbbkVarZzc.zzb(zzbbeVar)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzw)).intValue();
            zzcduVarBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue();
            try {
                synchronized (this) {
                    try {
                        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
                        long j12 = this.zzj;
                        if (jCurrentTimeMillis - j12 <= jLongValue) {
                            try {
                                if (this.zzg) {
                                    throw new IOException("Abort requested before buffering finished. ");
                                }
                                if (!this.zzh) {
                                    if (!this.zze.zzV()) {
                                        throw new IOException("ExoPlayer was released during preloading.");
                                    }
                                    long jZzz = this.zze.zzz();
                                    if (jZzz > 0) {
                                        long jZzv = this.zze.zzv();
                                        if (jZzv != this.zzk) {
                                            try {
                                                str2 = strZzc;
                                                try {
                                                    zzo(this.zzf, strZzc, jZzv, jZzz, jZzv > 0, zzcduVarBooleanValue != 0 ? this.zze.zzA() : -1L, zzcduVarBooleanValue != 0 ? this.zze.zzx() : -1L, zzcduVarBooleanValue != 0 ? this.zze.zzB() : -1L, zzcbr.zzs(), zzcbr.zzu());
                                                    zzcduVarBooleanValue = this;
                                                    j10 = jZzv;
                                                    try {
                                                        zzcduVarBooleanValue.zzk = j10;
                                                        j11 = jZzz;
                                                        zzcduVarBooleanValue = zzcduVarBooleanValue;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        str = str2;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    zzcduVarBooleanValue = this;
                                                    str = str2;
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzcduVarBooleanValue = this;
                                                str = strZzc;
                                                throw th;
                                            }
                                        } else {
                                            j10 = jZzv;
                                            str2 = strZzc;
                                            zzcduVarBooleanValue = this;
                                            j11 = jZzz;
                                        }
                                        if (j10 >= j11) {
                                            zzcduVarBooleanValue.zzj(zzcduVarBooleanValue.zzf, str2, j11);
                                        } else if (zzcduVarBooleanValue.zze.zzw() >= jIntValue && j10 > 0) {
                                            zzcduVar2 = zzcduVarBooleanValue;
                                            zzcduVar2 = zzcduVarBooleanValue;
                                        }
                                        zzcduVar = zzcduVarBooleanValue;
                                    } else {
                                        zzcduVar2 = this;
                                    }
                                    zzcduVar2.zzx(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzy)).longValue());
                                    return;
                                }
                                zzcduVar = this;
                                com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcduVar.zzi);
                            } catch (Throwable th4) {
                                th = th4;
                                obj = zzbbkVarZzc;
                                str = j12;
                            }
                        } else {
                            str = strZzc;
                            zzcduVarBooleanValue = this;
                            try {
                                throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                            } catch (Throwable th5) {
                                th = th5;
                                obj = "downloadTimeout";
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        str = strZzc;
                        zzcduVarBooleanValue = this;
                    }
                    try {
                        throw th;
                    } catch (Exception e10) {
                        e = e10;
                        String str3 = obj;
                        zzbzr.zzj("Failed to preload url " + zzcduVarBooleanValue.zzf + " Exception: " + e.getMessage());
                        com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                        release();
                        zzcduVarBooleanValue.zzg(zzcduVarBooleanValue.zzf, str, str3, zzd(str3, e));
                        zzcduVar = zzcduVarBooleanValue;
                        com.google.android.gms.ads.internal.zzt.zzy().zzc(zzcduVar.zzi);
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e11) {
            e = e11;
            str = strZzc;
            zzcduVarBooleanValue = this;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzi(final boolean z10, final long j10) {
        final zzcca zzccaVar = (zzcca) this.zzc.get();
        if (zzccaVar != null) {
            zzcae.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcds
                @Override // java.lang.Runnable
                public final void run() {
                    zzccaVar.zzv(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzk(String str, Exception exc) {
        zzbzr.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzl(String str, Exception exc) {
        zzbzr.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzm(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzp(int i10) {
        this.zze.zzJ(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzq(int i10) {
        this.zze.zzK(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzr(int i10) {
        this.zze.zzM(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzs(int i10) {
        this.zze.zzN(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.zzcca] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.zzcdl, com.google.android.gms.internal.ads.zzcdu] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.zzcdu] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [long] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcdl] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzu(String str, String[] strArr) throws Throwable {
        ?? r10;
        String str2;
        ?? r11;
        long j10;
        ?? r12;
        String str3;
        long j11;
        ?? r13;
        ?? r15 = this;
        ?? r14 = str;
        r15.zzf = r14;
        ?? r17 = "error";
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            r15.zze.zzF(uriArr, r15.zzb);
            ?? r16 = (zzcca) r15.zzc.get();
            if (r16 != 0) {
                r16.zzt(strZzc, r15);
            }
            Clock clockZzB = com.google.android.gms.ads.internal.zzt.zzB();
            long jCurrentTimeMillis = clockZzB.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzy)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzx)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue();
            ?? r18 = -1;
            long j12 = jIntValue;
            r14 = r14;
            r15 = r15;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzB.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (r15.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!r15.zzh) {
                            if (!r15.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = r15.zze.zzz();
                            if (jZzz > 0) {
                                long jZzv = r15.zze.zzv();
                                if (jZzv != r18) {
                                    try {
                                        long j13 = jZzz;
                                        str3 = strZzc;
                                        try {
                                            zzo(str, strZzc, jZzv, j13, jZzv > 0, zBooleanValue ? r15.zze.zzA() : -1L, zBooleanValue ? r15.zze.zzx() : -1L, zBooleanValue ? r15.zze.zzB() : -1L, zzcbr.zzs(), zzcbr.zzu());
                                            r13 = jZzv;
                                            j11 = jZzz;
                                            r10 = j13;
                                        } catch (Throwable th) {
                                            th = th;
                                            r11 = this;
                                            r10 = str;
                                            str2 = str3;
                                            try {
                                                throw th;
                                            } catch (Exception e10) {
                                                e = e10;
                                                ?? r19 = r17;
                                                zzbzr.zzj("Failed to preload url " + r10 + " Exception: " + e.getMessage());
                                                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoStreamExoPlayerCache.preload");
                                                release();
                                                r11.zzg(r10, str2, r19, zzd(r19, e));
                                                return false;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r11 = this;
                                        r10 = str;
                                        str2 = strZzc;
                                    }
                                } else {
                                    str3 = strZzc;
                                    j11 = jZzz;
                                    r13 = r18;
                                    r10 = j12;
                                }
                                r11 = (jZzv > j11 ? 1 : (jZzv == j11 ? 0 : -1));
                                if (r11 >= 0) {
                                    zzj(str, str3, j11);
                                } else {
                                    try {
                                        zzcdu zzcduVar = this;
                                        r10 = str;
                                        str2 = str3;
                                        if (zzcduVar.zze.zzw() < j12 || jZzv <= 0) {
                                            r12 = r13;
                                            r11 = zzcduVar;
                                            j10 = j12;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                }
                            } else {
                                j10 = j12;
                                jLongValue2 = jLongValue2;
                                r10 = r14;
                                str2 = strZzc;
                                r11 = r15;
                                r12 = r18;
                            }
                            try {
                                try {
                                    r11.wait(jLongValue);
                                } catch (InterruptedException unused) {
                                    throw new IOException("Wait interrupted.");
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r17 = r12;
                                throw th;
                            }
                        }
                        return true;
                    } catch (Throwable th5) {
                        th = th5;
                        r10 = r14;
                        str2 = strZzc;
                        r11 = r15;
                    }
                }
                return true;
                jLongValue = jLongValue;
                r15 = r11;
                r14 = r10;
                strZzc = str2;
                j12 = j10;
                jLongValue2 = jLongValue2;
                r18 = r12;
            }
        } catch (Exception e11) {
            e = e11;
            r10 = r14;
            str2 = strZzc;
            r11 = r15;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final void zzv() {
        zzbzr.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzw(String str, String[] strArr, zzcdd zzcddVar) {
        this.zzf = str;
        this.zzi = zzcddVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcca zzccaVar = (zzcca) this.zzc.get();
            if (zzccaVar != null) {
                zzccaVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e10) {
            zzbzr.zzj("Failed to preload url " + str + " Exception: " + e10.getMessage());
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, "error", zzd("error", e10));
            return false;
        }
    }
}
