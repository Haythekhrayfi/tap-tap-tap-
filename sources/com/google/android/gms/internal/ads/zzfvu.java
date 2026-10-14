package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfvu extends zzfvt {
    private final zzfwm zza;

    public zzfvu(zzfwm zzfwmVar) {
        Objects.requireNonNull(zzfwmVar);
        this.zza = zzfwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.zza.cancel(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j10, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq, com.google.android.gms.internal.ads.zzfwm
    public final void zzc(Runnable runnable, Executor executor) {
        this.zza.zzc(runnable, executor);
    }
}
