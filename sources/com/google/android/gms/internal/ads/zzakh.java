package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzakh implements zzabv {
    private final zzake zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzakh(zzake zzakeVar, int i10, long j10, long j11) {
        this.zza = zzakeVar;
        this.zzb = i10;
        this.zzc = j10;
        long j12 = (j11 - j10) / ((long) zzakeVar.zzd);
        this.zzd = j12;
        this.zze = zza(j12);
    }

    private final long zza(long j10) {
        return zzfj.zzp(j10 * ((long) this.zzb), 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        long jMax = Math.max(0L, Math.min((((long) this.zza.zzc) * j10) / (((long) this.zzb) * 1000000), this.zzd - 1));
        long j11 = (((long) this.zza.zzd) * jMax) + this.zzc;
        long jZza = zza(jMax);
        zzabw zzabwVar = new zzabw(jZza, j11);
        if (jZza >= j10 || jMax == this.zzd - 1) {
            return new zzabt(zzabwVar, zzabwVar);
        }
        long j12 = jMax + 1;
        return new zzabt(zzabwVar, new zzabw(zza(j12), (((long) this.zza.zzd) * j12) + this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return true;
    }
}
