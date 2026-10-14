package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfvo extends zzfwl {
    private final Executor zza;
    public final /* synthetic */ zzfvp zzb;

    public zzfvo(zzfvp zzfvpVar, Executor executor) {
        this.zzb = zzfvpVar;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final void zzd(Throwable th) {
        this.zzb.zza = null;
        if (th instanceof ExecutionException) {
            this.zzb.zze(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zze(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zze(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
