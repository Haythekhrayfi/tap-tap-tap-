package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzaal implements zzabv {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzaal(long j10, long j11, int i10, int i11, boolean z10) {
        long jZzb;
        this.zza = j10;
        this.zzb = j11;
        this.zzc = i11 == -1 ? 1 : i11;
        this.zze = i10;
        if (j10 == -1) {
            this.zzd = -1L;
            jZzb = -9223372036854775807L;
        } else {
            this.zzd = j10 - j11;
            jZzb = zzb(j10, j11, i10);
        }
        this.zzf = jZzb;
    }

    private static long zzb(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    public final long zza(long j10) {
        return zzb(j10, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        long j11 = this.zzd;
        if (j11 == -1) {
            zzabw zzabwVar = new zzabw(0L, this.zzb);
            return new zzabt(zzabwVar, zzabwVar);
        }
        long j12 = ((long) this.zze) * j10;
        long j13 = this.zzc;
        long jMin = ((j12 / 8000000) / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZza = zza(jMax);
        zzabw zzabwVar2 = new zzabw(jZza, jMax);
        if (this.zzd != -1 && jZza < j10) {
            long j14 = jMax + ((long) this.zzc);
            if (j14 < this.zza) {
                return new zzabt(zzabwVar2, new zzabw(zza(j14), j14));
            }
        }
        return new zzabt(zzabwVar2, zzabwVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
