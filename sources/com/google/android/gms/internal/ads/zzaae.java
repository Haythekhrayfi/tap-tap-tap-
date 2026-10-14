package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaae {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzaae(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.zza = j10;
        this.zzb = j11;
        this.zze = j13;
        this.zzf = j14;
        this.zzg = j15;
        this.zzc = j16;
        this.zzh = zzf(j11, 0L, j13, j14, j15, j16);
    }

    public static long zzf(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) (((j14 - j13) / (j12 - j11)) * (j10 - j11));
        return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
    }

    public static /* bridge */ /* synthetic */ void zzg(zzaae zzaaeVar, long j10, long j11) {
        zzaaeVar.zze = j10;
        zzaaeVar.zzg = j11;
        zzaaeVar.zzi();
    }

    public static /* bridge */ /* synthetic */ void zzh(zzaae zzaaeVar, long j10, long j11) {
        zzaaeVar.zzd = j10;
        zzaaeVar.zzf = j11;
        zzaaeVar.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
