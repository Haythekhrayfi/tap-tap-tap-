package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public class zzabu implements zzabv {
    private final long zza;
    private final zzabt zzb;

    public zzabu(long j10, long j11) {
        this.zza = j10;
        zzabw zzabwVar = j11 == 0 ? zzabw.zza : new zzabw(0L, j11);
        this.zzb = new zzabt(zzabwVar, zzabwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return false;
    }
}
