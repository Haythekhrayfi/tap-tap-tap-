package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqs implements zzgwe {
    private final zzdqn zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzdqs(zzdqn zzdqnVar, zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzdqnVar;
        this.zzb = zzgwrVar;
        this.zzc = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdqx zzdqxVar = (zzdqx) this.zzb.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        Set setZze = zzdqn.zze(zzdqxVar, zzfwnVar);
        zzgwm.zzb(setZze);
        return setZze;
    }
}
