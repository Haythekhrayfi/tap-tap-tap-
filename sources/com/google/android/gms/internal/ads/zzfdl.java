package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdl implements zzgwe {
    private final zzgwr zza;

    public zzfdl(zzgwr zzgwrVar) {
        this.zza = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* bridge */ /* synthetic */ Object zzb() {
        ThreadFactory threadFactory = (ThreadFactory) this.zza.zzb();
        zzfmc.zza();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        zzgwm.zzb(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
