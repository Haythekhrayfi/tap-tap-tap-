package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcax implements Runnable {
    public final /* synthetic */ zzcbe zza;

    public zzcax(zzcbe zzcbeVar) {
        this.zza = zzcbeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbe zzcbeVar = this.zza;
        if (zzcbeVar.zzq != null) {
            zzcbeVar.zzq.zza();
        }
    }
}
