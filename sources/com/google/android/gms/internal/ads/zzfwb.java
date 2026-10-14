package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwb {
    private final boolean zza;
    private final zzfsc zzb;

    public /* synthetic */ zzfwb(boolean z10, zzfsc zzfscVar, zzfwa zzfwaVar) {
        this.zza = z10;
        this.zzb = zzfscVar;
    }

    public final zzfwm zza(Callable callable, Executor executor) {
        return new zzfvp(this.zzb, this.zza, executor, callable);
    }
}
