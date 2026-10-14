package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes2.dex */
final class zzdtk extends AdListener {
    public final /* synthetic */ String zza;
    public final /* synthetic */ AdView zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzdtr zzd;

    public zzdtk(zzdtr zzdtrVar, String str, AdView adView, String str2) {
        this.zzd = zzdtrVar;
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzd.zzm(zzdtr.zzl(loadAdError), this.zzc);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
