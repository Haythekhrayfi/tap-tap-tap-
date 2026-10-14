package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdeg implements zzgwe {
    private final zzgwr zza;

    public zzdeg(zzgwr zzgwrVar) {
        this.zza = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdcm((zzdez) this.zza.zzb(), zzcae.zzf));
        zzgwm.zzb(setSingleton);
        return setSingleton;
    }
}
