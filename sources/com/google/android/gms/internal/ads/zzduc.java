package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduc implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;

    public zzduc(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdub zzb() {
        zzfwn zzfwnVar = zzcae.zzb;
        zzgwm.zzb(zzfwnVar);
        zzfwn zzfwnVar2 = zzcae.zza;
        zzgwm.zzb(zzfwnVar2);
        return new zzdub(zzfwnVar, zzfwnVar2, ((zzduq) this.zzc).zzb(), zzgwd.zza(this.zzd));
    }
}
