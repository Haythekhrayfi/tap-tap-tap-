package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfew implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzfew(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgvy zzgvyVarZza = zzgwd.zza(this.zza);
        zzgvy zzgvyVarZza2 = zzgwd.zza(this.zzb);
        Object zzfeyVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzih)).booleanValue() ? new zzfey((zzfev) zzgvyVarZza.zzb(), (ScheduledExecutorService) this.zzc.zzb()) : (zzfev) zzgvyVarZza2.zzb();
        zzgwm.zzb(zzfeyVar);
        return zzfeyVar;
    }
}
