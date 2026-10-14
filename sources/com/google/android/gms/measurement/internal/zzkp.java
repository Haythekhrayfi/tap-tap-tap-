package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzkp implements Runnable {
    public final /* synthetic */ zzla zza;
    public final /* synthetic */ zzkz zzb;

    public zzkp(zzkz zzkzVar, zzla zzlaVar) {
        this.zzb = zzkzVar;
        this.zza = zzlaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz.zzy(this.zzb, this.zza);
        this.zzb.zzS();
    }
}
