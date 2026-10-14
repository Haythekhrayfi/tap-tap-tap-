package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdfl implements zzgwe {
    private final zzgwr zza;

    public zzdfl(zzgwr zzgwrVar) {
        this.zza = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdfi) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzgwm.zzb(setSingleton);
        return setSingleton;
    }
}
