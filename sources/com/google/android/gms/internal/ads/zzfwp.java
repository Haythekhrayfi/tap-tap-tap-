package com.google.android.gms.internal.ads;

import androidx.fragment.app.w;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class zzfwp extends zzfuv {
    private final ExecutorService zza;

    public zzfwp(ExecutorService executorService) {
        Objects.requireNonNull(executorService);
        this.zza = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.zza.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.zza.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.zza.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.zza.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.zza.shutdownNow();
    }

    public final String toString() {
        return w.a(super.toString(), "[", String.valueOf(this.zza), "]");
    }
}
