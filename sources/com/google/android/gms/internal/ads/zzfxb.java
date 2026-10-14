package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzfxb extends zzfwl {
    public final /* synthetic */ zzfxc zza;
    private final Callable zzb;

    public zzfxb(zzfxc zzfxcVar, Callable callable) {
        this.zza = zzfxcVar;
        Objects.requireNonNull(callable);
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final void zze(Object obj) {
        this.zza.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
