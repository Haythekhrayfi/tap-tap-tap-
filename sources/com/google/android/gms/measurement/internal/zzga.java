package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzga implements Runnable {
    public final /* synthetic */ zzac zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzgq zzc;

    public zzga(zzgq zzgqVar, zzac zzacVar, zzq zzqVar) {
        this.zzc = zzgqVar;
        this.zza = zzacVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzc.zza.zzO(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzU(this.zza, this.zzb);
        }
    }
}
