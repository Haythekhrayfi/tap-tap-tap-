package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfcm implements zzfvy {
    public final /* synthetic */ zzfcp zza;
    public final /* synthetic */ zzfcq zzb;

    public zzfcm(zzfcq zzfcqVar, zzfcp zzfcpVar) {
        this.zzb = zzfcqVar;
        this.zza = zzfcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzfcq zzfcqVar = this.zzb;
            if (zzfcqVar.zzf == 1) {
                zzfcqVar.zzh();
            }
        }
    }
}
