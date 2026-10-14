package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqr implements zzgwe {
    private final zzdqn zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzdqr(zzdqn zzdqnVar, zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzdqnVar;
        this.zzb = zzgwrVar;
        this.zzc = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdqx zzdqxVar = (zzdqx) this.zzb.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        Set setZzd = zzdqn.zzd(zzdqxVar, zzfwnVar);
        zzgwm.zzb(setZzd);
        return setZzd;
    }
}
