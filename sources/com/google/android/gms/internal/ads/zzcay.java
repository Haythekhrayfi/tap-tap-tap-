package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcay implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzcbe zzc;

    public zzcay(zzcbe zzcbeVar, String str, String str2) {
        this.zzc = zzcbeVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbe zzcbeVar = this.zzc;
        if (zzcbeVar.zzq != null) {
            zzcbeVar.zzq.zzb(this.zza, this.zzb);
        }
    }
}
