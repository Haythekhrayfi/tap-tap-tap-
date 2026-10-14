package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzhh implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzid zzb;

    public zzhh(zzid zzidVar, long j10) {
        this.zzb = zzidVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzm().zzf.zzb(this.zza);
        this.zzb.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
