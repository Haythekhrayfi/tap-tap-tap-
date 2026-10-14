package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzakv implements Runnable {
    public final /* synthetic */ zzalk zza;
    public final /* synthetic */ zzakw zzb;

    public zzakv(zzakw zzakwVar, zzalk zzalkVar) {
        this.zzb = zzakwVar;
        this.zza = zzalkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
