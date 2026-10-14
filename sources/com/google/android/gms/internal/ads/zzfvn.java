package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzfvn extends zzfvo {
    public final /* synthetic */ zzfvp zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvn(zzfvp zzfvpVar, Callable callable, Executor executor) {
        super(zzfvpVar, executor);
        this.zza = zzfvpVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final void zzc(Object obj) {
        this.zza.zzd(obj);
    }
}
