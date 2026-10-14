package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwt {
    public static zzfwn zza(ExecutorService executorService) {
        if (executorService instanceof zzfwn) {
            return (zzfwn) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzfws((ScheduledExecutorService) executorService) : new zzfwp(executorService);
    }

    public static Executor zzb() {
        return zzfvq.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzfuq zzfuqVar) {
        Objects.requireNonNull(executor);
        return executor == zzfvq.INSTANCE ? executor : new zzfwo(executor, zzfuqVar);
    }
}
