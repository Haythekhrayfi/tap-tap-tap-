package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfvv extends zzfrt implements Future {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return zzb().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return zzb().get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zzb().get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zzb().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zzb().isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract Future zzb();
}
