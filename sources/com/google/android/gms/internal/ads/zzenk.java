package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzenk implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;

    public zzenk(zzgwr zzgwrVar, zzgwr zzgwrVar2) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfsh zzfshVarZzm;
        zzena zzenaVarZza = zzenc.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdK)).booleanValue()) {
            zzfshVarZzm = zzfsh.zzn(new zzepg(zzenaVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdL)).intValue(), scheduledExecutorService));
        } else {
            zzfshVarZzm = zzfsh.zzm();
        }
        zzgwm.zzb(zzfshVarZzm);
        return zzfshVarZzm;
    }
}
