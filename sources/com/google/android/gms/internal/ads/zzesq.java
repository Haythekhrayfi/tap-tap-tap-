package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesq implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;

    public zzesq(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
        this.zze = zzgwrVar5;
    }

    public static zzeso zza(String str, zzawc zzawcVar, zzbza zzbzaVar, ScheduledExecutorService scheduledExecutorService, zzfwn zzfwnVar) {
        return new zzeso(str, zzawcVar, zzbzaVar, scheduledExecutorService, zzfwnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strZza = ((zzett) this.zza).zza();
        zzawc zzawcVar = new zzawc();
        zzbza zzbzaVar = (zzbza) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzeso(strZza, zzawcVar, zzbzaVar, scheduledExecutorService, zzfwnVar);
    }
}
