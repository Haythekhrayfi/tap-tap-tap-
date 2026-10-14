package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinRewardedInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppLovinIncentivizedInterstitial f8298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppLovinAdDisplayListener f8299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinAdClickListener f8300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdVideoPlaybackListener f8301d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f8298a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f8300c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f8299b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f8301d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f8298a.show(appLovinAd, context, appLovinAdRewardListener, this.f8301d, this.f8299b, this.f8300c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
