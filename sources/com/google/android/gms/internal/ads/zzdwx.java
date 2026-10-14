package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwx implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzdwx(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdww zzb() {
        zzfwn zzfwnVar = zzcae.zzb;
        zzgwm.zzb(zzfwnVar);
        zzfwn zzfwnVar2 = zzcae.zza;
        zzgwm.zzb(zzfwnVar2);
        return new zzdww(zzfwnVar, zzfwnVar2, ((zzdxp) this.zzc).zzb());
    }
}
