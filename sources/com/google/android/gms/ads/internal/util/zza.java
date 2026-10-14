package com.google.android.gms.ads.internal.util;

/* JADX INFO: loaded from: classes.dex */
final class zza implements Runnable {
    public final /* synthetic */ zzb zza;

    public zza(zzb zzbVar) {
        this.zza = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb = Thread.currentThread();
        this.zza.zza();
    }
}
