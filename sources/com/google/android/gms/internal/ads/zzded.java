package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzded implements zzgwe {
    private final zzddr zza;
    private final zzgwr zzb;

    public zzded(zzddr zzddrVar, zzgwr zzgwrVar) {
        this.zza = zzddrVar;
        this.zzb = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdcm((zzcud) this.zzb.zzb(), zzcae.zzf));
        zzgwm.zzb(setSingleton);
        return setSingleton;
    }
}
