package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardedInterstitialAd;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06385i implements RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, RewardedInterstitialAd.RewardedInterstitialShowAdConfig {
    public final C06415l A00;

    public C06385i(C06415l c06415l) {
        this.A00 = c06415l;
    }

    public final C06415l A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i10) {
        this.A00.withAppOrientation(i10);
        return this;
    }
}
