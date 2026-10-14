package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcpu implements zzgwe {
    private final zzcpi zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzcpu(zzcpi zzcpiVar, zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzcpiVar;
        this.zzb = zzgwrVar;
        this.zzc = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcqz zzcqzVar = (zzcqz) this.zzb.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzdcm(zzcqzVar, zzfwnVar);
    }
}
