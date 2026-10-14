package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfuv extends AbstractExecutorService implements zzfwn {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzfxc.zzf(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzfxc(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzfwm) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzfwm) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (zzfwm) super.submit(callable);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final zzfwm zza(Runnable runnable) {
        return (zzfwm) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final zzfwm zzb(Callable callable) {
        return (zzfwm) super.submit(callable);
    }
}
