package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzgb implements Runnable {
    public final /* synthetic */ zzac zza;
    public final /* synthetic */ zzgq zzb;

    public zzgb(zzgq zzgqVar, zzac zzacVar) {
        this.zzb = zzgqVar;
        this.zza = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzb.zza.zzN(this.zza);
        } else {
            this.zzb.zza.zzT(this.zza);
        }
    }
}
