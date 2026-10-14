package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzade {
    public final zzabz zza;

    public zzade(zzabz zzabzVar) {
        this.zza = zzabzVar;
    }

    public abstract boolean zza(zzfa zzfaVar) throws zzcd;

    public abstract boolean zzb(zzfa zzfaVar, long j10) throws zzcd;

    public final boolean zzf(zzfa zzfaVar, long j10) throws zzcd {
        return zza(zzfaVar) && zzb(zzfaVar, j10);
    }
}
