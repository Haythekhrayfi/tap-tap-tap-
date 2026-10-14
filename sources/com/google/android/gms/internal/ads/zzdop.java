package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdop implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzdop(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeG)).booleanValue() ? Collections.singleton(new zzdcm(((zzdpi) this.zzb).zzb(), zzfwnVar)) : Collections.emptySet();
        zzgwm.zzb(setSingleton);
        return setSingleton;
    }
}
