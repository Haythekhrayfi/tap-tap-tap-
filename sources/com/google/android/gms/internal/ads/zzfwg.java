package com.google.android.gms.internal.ads;

import androidx.fragment.app.w;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwg implements zzfwm {
    public static final zzfwm zza = new zzfwg(null);
    private static final Logger zzb = Logger.getLogger(zzfwg.class.getName());
    private final Object zzc;

    public zzfwg(Object obj) {
        this.zzc = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException {
        Objects.requireNonNull(timeUnit);
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return w.a(super.toString(), "[status=SUCCESS, result=[", String.valueOf(this.zzc), "]]");
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final void zzc(Runnable runnable, Executor executor) {
        zzfph.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            zzb.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", w.a("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }
}
