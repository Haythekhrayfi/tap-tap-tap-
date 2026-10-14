package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzhk implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzid zzc;

    public zzhk(zzid zzidVar, AtomicReference atomicReference, boolean z10) {
        this.zzc = zzidVar;
        this.zza = atomicReference;
        this.zzb = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzs.zzt().zzx(this.zza, this.zzb);
    }
}
