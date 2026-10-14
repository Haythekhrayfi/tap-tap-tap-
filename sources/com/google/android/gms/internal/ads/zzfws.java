package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzfws extends zzfwp implements ScheduledExecutorService {
    public final ScheduledExecutorService zza;

    public zzfws(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        zzfxc zzfxcVarZzf = zzfxc.zzf(runnable, null);
        return new zzfwq(zzfxcVarZzf, this.zza.schedule(zzfxcVarZzf, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzfxc zzfxcVar = new zzfxc(callable);
        return new zzfwq(zzfxcVar, this.zza.schedule(zzfxcVar, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzfwr zzfwrVar = new zzfwr(runnable);
        return new zzfwq(zzfwrVar, this.zza.scheduleAtFixedRate(zzfwrVar, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzfwr zzfwrVar = new zzfwr(runnable);
        return new zzfwq(zzfwrVar, this.zza.scheduleWithFixedDelay(zzfwrVar, j10, j11, timeUnit));
    }
}
