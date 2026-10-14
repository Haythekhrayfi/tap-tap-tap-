package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzkb implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzki zzb;

    public zzkb(zzki zzkiVar, long j10) {
        this.zzb = zzkiVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzki.zzj(this.zzb, this.zza);
    }
}
