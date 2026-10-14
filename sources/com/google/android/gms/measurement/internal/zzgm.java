package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzgm implements Runnable {
    public final /* synthetic */ zzlc zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzgq zzc;

    public zzgm(zzgq zzgqVar, zzlc zzlcVar, zzq zzqVar) {
        this.zzc = zzgqVar;
        this.zza = zzlcVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zza() == null) {
            this.zzc.zza.zzP(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzW(this.zza, this.zzb);
        }
    }
}
