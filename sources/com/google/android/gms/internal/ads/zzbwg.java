package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwg extends zzbvt {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbwh zzb;

    public zzbwg(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbwh zzbwhVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzg() {
        zzbwh zzbwhVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbwhVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbwhVar);
    }
}
