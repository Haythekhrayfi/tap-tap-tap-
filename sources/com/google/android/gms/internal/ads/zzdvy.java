package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdvy implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzdvy(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdvx zzb() {
        Map mapZzd = ((zzgwl) this.zza).zzd();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzdvx(mapZzd, zzfwnVar, ((zzcya) this.zzc).zzb());
    }
}
