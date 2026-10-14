package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcbc implements Runnable {
    public final /* synthetic */ zzcbe zza;

    public zzcbc(zzcbe zzcbeVar) {
        this.zza = zzcbeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbe zzcbeVar = this.zza;
        if (zzcbeVar.zzq != null) {
            if (!zzcbeVar.zzr) {
                zzcbeVar.zzq.zzg();
                this.zza.zzr = true;
            }
            this.zza.zzq.zze();
        }
    }
}
