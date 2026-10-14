package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfen implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;

    public zzfen(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzfel(zzfwnVar, (ScheduledExecutorService) this.zzb.zzb(), ((zzfeo) this.zzc).zzb());
    }
}
