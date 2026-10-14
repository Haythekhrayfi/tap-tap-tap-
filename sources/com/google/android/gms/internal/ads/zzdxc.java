package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdxc implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzdxc(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdxb zzb() {
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzdxb(zzfwnVar, ((zzdwx) this.zzb).zzb(), (zzfel) this.zzc.zzb());
    }
}
