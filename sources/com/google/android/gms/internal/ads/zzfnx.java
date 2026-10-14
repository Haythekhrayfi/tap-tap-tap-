package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfnx implements Runnable {
    private final TaskCompletionSource zza;

    public zzfnx() {
        this.zza = null;
    }

    public zzfnx(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e10) {
            zzc(e10);
        }
    }

    public abstract void zza();

    public final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }
}
