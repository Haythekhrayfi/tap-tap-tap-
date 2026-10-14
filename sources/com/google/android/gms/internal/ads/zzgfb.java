package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfb implements zzgfd {
    private final zzgnk zza;
    private final zzgkp zzb;

    private zzgfb(zzgkp zzgkpVar) {
        this.zzb = zzgkpVar;
        this.zza = zzgfm.zza(zzgkpVar.zzh());
    }

    public static zzgfb zza(zzgkp zzgkpVar) {
        return new zzgfb(zzgkpVar);
    }

    public final zzgkp zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final zzgnk zzd() {
        return this.zza;
    }
}
