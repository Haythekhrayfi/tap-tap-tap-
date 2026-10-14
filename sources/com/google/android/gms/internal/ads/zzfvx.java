package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfvx extends zzfvv implements zzfwm {
    @Override // com.google.android.gms.internal.ads.zzfvv
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm
    public final void zzc(Runnable runnable, Executor executor) {
        zzd().zzc(runnable, executor);
    }

    public abstract zzfwm zzd();
}
