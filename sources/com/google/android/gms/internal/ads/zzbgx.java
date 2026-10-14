package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;

/* JADX INFO: loaded from: classes2.dex */
final class zzbgx implements Runnable {
    public final /* synthetic */ AdManagerAdView zza;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    public final /* synthetic */ zzbgy zzc;

    public zzbgx(zzbgy zzbgyVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zzc = zzbgyVar;
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zzb(this.zzb)) {
            this.zzc.zza.onAdManagerAdViewLoaded(this.zza);
        } else {
            zzbzr.zzj("Could not bind.");
        }
    }
}
