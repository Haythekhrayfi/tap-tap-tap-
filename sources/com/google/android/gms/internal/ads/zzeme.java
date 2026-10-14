package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeme implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;

    public zzeme(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcha) this.zza).zza();
        zzbza zzbzaVar = (zzbza) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzemc(contextZza, zzbzaVar, scheduledExecutorService, zzfwnVar);
    }
}
