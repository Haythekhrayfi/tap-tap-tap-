package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzfx implements Runnable {
    public final /* synthetic */ zzhb zza;
    public final /* synthetic */ zzfy zzb;

    public zzfx(zzfy zzfyVar, zzhb zzhbVar) {
        this.zzb = zzfyVar;
        this.zza = zzhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfy.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
