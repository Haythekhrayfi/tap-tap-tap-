package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzip implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzis zzb;

    public zzip(zzis zzisVar, long j10) {
        this.zzb = zzisVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
