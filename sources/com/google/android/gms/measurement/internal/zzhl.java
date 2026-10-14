package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzhl implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzid zzb;

    public zzhl(zzid zzidVar, long j10) {
        this.zzb = zzidVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzL(this.zza, true);
        this.zzb.zzs.zzt().zzu(new AtomicReference());
    }
}
