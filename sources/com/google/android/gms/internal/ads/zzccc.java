package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzccc implements Runnable {
    private final zzcbo zza;
    private boolean zzb = false;

    public zzccc(zzcbo zzcboVar) {
        this.zza = zzcboVar;
    }

    private final void zzc() {
        zzfmd zzfmdVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfmdVar.removeCallbacks(this);
        zzfmdVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
