package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwo implements Executor {
    public final /* synthetic */ Executor zza;
    public final /* synthetic */ zzfuq zzb;

    public zzfwo(Executor executor, zzfuq zzfuqVar) {
        this.zza = executor;
        this.zzb = zzfuqVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e10) {
            this.zzb.zze(e10);
        }
    }
}
