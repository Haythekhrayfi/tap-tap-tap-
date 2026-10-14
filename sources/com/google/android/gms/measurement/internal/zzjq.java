package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzjq implements Runnable {
    public final /* synthetic */ zzjr zza;

    public zzjq(zzjr zzjrVar) {
        this.zza = zzjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzb = null;
        this.zza.zza.zzP();
    }
}
