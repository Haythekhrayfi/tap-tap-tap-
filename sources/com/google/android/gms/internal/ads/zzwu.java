package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzwu {
    public final int zza;
    public final zzcy zzb;
    public final int zzc;
    public final zzam zzd;

    public zzwu(int i10, zzcy zzcyVar, int i11) {
        this.zza = i10;
        this.zzb = zzcyVar;
        this.zzc = i11;
        this.zzd = zzcyVar.zzb(i11);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzwu zzwuVar);
}
