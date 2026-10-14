package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzjx implements Runnable {
    public final /* synthetic */ zzkz zza;
    public final /* synthetic */ Runnable zzb;

    public zzjx(zzjz zzjzVar, zzkz zzkzVar, Runnable runnable) {
        this.zza = zzkzVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzX();
    }
}
