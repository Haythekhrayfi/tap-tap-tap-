package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdc implements Runnable {
    public final /* synthetic */ zzcdd zza;

    public zzcdc(zzcdd zzcddVar) {
        this.zza = zzcddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzy().zzc(this.zza);
    }
}
