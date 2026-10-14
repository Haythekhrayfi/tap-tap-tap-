package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcba implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzcbe zzc;

    public zzcba(zzcbe zzcbeVar, int i10, int i11) {
        this.zzc = zzcbeVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbe zzcbeVar = this.zzc;
        if (zzcbeVar.zzq != null) {
            zzcbeVar.zzq.zzj(this.zza, this.zzb);
        }
    }
}
