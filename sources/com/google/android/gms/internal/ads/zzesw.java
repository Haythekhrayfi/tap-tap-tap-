package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesw implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;

    public zzesw(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5, zzgwr zzgwrVar6, zzgwr zzgwrVar7) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
        this.zze = zzgwrVar5;
        this.zzf = zzgwrVar6;
        this.zzg = zzgwrVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbyr zzbyrVar = new zzbyr();
        int iIntValue = ((zzetu) this.zzb).zzb().intValue();
        Context contextZza = ((zzcha) this.zzc).zza();
        zzbza zzbzaVar = (zzbza) this.zzd.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zze.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzesu(zzbyrVar, iIntValue, contextZza, zzbzaVar, scheduledExecutorService, zzfwnVar, ((zzett) this.zzg).zza());
    }
}
