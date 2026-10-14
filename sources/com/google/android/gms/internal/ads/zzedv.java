package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzedv implements zzfvy {
    public final /* synthetic */ zzedw zza;

    public zzedv(zzedw zzedwVar) {
        this.zza = zzedwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zza(zzeVarZza);
        zzfbc.zzb(zzeVarZza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcpb) obj).zzj();
    }
}
