package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaac implements zzabv {
    private final zzaaf zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzaac(zzaaf zzaafVar, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.zza = zzaafVar;
        this.zzb = j10;
        this.zzc = j12;
        this.zzd = j13;
        this.zze = j14;
        this.zzf = j15;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zzb;
    }

    public final long zzf(long j10) {
        return this.zza.zza(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        zzabw zzabwVar = new zzabw(j10, zzaae.zzf(this.zza.zza(j10), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzabt(zzabwVar, zzabwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return true;
    }
}
