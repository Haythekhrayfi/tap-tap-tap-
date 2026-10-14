package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzala implements Runnable {
    private final zzalk zza;
    private final zzalq zzb;
    private final Runnable zzc;

    public zzala(zzalk zzalkVar, zzalq zzalqVar, Runnable runnable) {
        this.zza = zzalkVar;
        this.zzb = zzalqVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzw();
        zzalq zzalqVar = this.zzb;
        if (zzalqVar.zzc()) {
            this.zza.zzo(zzalqVar.zza);
        } else {
            this.zza.zzn(zzalqVar.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
