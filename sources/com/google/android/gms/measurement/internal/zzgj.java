package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzgj implements Runnable {
    public final /* synthetic */ zzaw zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzgq zzc;

    public zzgj(zzgq zzgqVar, zzaw zzawVar, zzq zzqVar) {
        this.zzc = zzgqVar;
        this.zza = zzawVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
