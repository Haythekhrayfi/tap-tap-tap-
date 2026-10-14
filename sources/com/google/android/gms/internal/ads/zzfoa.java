package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zzfoa extends zzfnx {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ zzfnx zzb;
    public final /* synthetic */ zzfoh zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoa(zzfoh zzfohVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfnx zzfnxVar) {
        super(taskCompletionSource);
        this.zzc = zzfohVar;
        this.zza = taskCompletionSource2;
        this.zzb = zzfnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnx
    public final void zza() {
        synchronized (this.zzc.zzg) {
            zzfoh.zzn(this.zzc, this.zza);
            if (this.zzc.zzl.getAndIncrement() > 0) {
                this.zzc.zzc.zzc("Already connected to the service.", new Object[0]);
            }
            zzfoh.zzp(this.zzc, this.zzb);
        }
    }
}
