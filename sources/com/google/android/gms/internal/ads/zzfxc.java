package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfxc extends zzfvs implements RunnableFuture {

    @CheckForNull
    private volatile zzfwl zza;

    public zzfxc(zzfvi zzfviVar) {
        this.zza = new zzfxa(this, zzfviVar);
    }

    public zzfxc(Callable callable) {
        this.zza = new zzfxb(this, callable);
    }

    public static zzfxc zzf(Runnable runnable, Object obj) {
        return new zzfxc(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfwl zzfwlVar = this.zza;
        if (zzfwlVar != null) {
            zzfwlVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    @CheckForNull
    public final String zza() {
        zzfwl zzfwlVar = this.zza;
        return zzfwlVar != null ? j.a("task=[", zzfwlVar.toString(), "]") : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzb() {
        zzfwl zzfwlVar;
        if (zzu() && (zzfwlVar = this.zza) != null) {
            zzfwlVar.zzh();
        }
        this.zza = null;
    }
}
