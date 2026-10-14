package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzerp implements zzgwe {
    private final zzgwr zza;
    private final zzgwr zzb;
    private final zzgwr zzc;
    private final zzgwr zzd;
    private final zzgwr zze;
    private final zzgwr zzf;
    private final zzgwr zzg;

    public zzerp(zzgwr zzgwrVar, zzgwr zzgwrVar2, zzgwr zzgwrVar3, zzgwr zzgwrVar4, zzgwr zzgwrVar5, zzgwr zzgwrVar6, zzgwr zzgwrVar7) {
        this.zza = zzgwrVar;
        this.zzb = zzgwrVar2;
        this.zzc = zzgwrVar3;
        this.zzd = zzgwrVar4;
        this.zze = zzgwrVar5;
        this.zzf = zzgwrVar6;
        this.zzg = zzgwrVar7;
    }

    public static zzern zza(zzbyr zzbyrVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        return new zzern(zzbyrVar, context, scheduledExecutorService, executor, i10, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbyr zzbyrVar = new zzbyr();
        Context contextZza = ((zzcha) this.zzb).zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        zzfwn zzfwnVar = zzcae.zza;
        zzgwm.zzb(zzfwnVar);
        return new zzern(zzbyrVar, contextZza, scheduledExecutorService, zzfwnVar, ((zzetu) this.zze).zzb().intValue(), ((zzetv) this.zzf).zzb().booleanValue(), ((zzetx) this.zzg).zzb().booleanValue());
    }
}
