package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchg implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzchg(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdse zzdseVar = (zzdse) this.zza.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbz)).booleanValue() ? Collections.singleton(new zzdcm(zzdseVar, zzfwnVar)) : Collections.emptySet();
        zzgwm.zzb(setSingleton);
        return setSingleton;
    }
}
