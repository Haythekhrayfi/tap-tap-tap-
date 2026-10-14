package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcps implements zzgwe {
    private final zzcpi zza;
    private final zzgwr zzb;

    public zzcps(zzcpi zzcpiVar, zzgwr zzgwrVar) {
        this.zza = zzcpiVar;
        this.zzb = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdcm((zzcqs) this.zzb.zzb(), zzcae.zzf));
        zzgwm.zzb(setSingleton);
        return setSingleton;
    }
}
