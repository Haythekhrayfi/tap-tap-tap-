package com.applovin.mediation.rtb;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.c;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.Objects;
import p4.a;
import p4.d;
import p4.e;

/* JADX INFO: loaded from: classes.dex */
public final class AppLovinRtbRewardedRenderer extends d {
    private AppLovinAd appLovinAd;

    public AppLovinRtbRewardedRenderer(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, c cVar, a aVar, e eVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, cVar, aVar, eVar);
    }

    @Override // p4.d, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        this.appLovinAd = appLovinAd;
        super.adReceived(appLovinAd);
    }

    @Override // p4.d
    public void loadAd() {
        AppLovinSdk appLovinSdkC = this.appLovinInitializer.c(this.adConfiguration.getServerParameters(), this.adConfiguration.getContext());
        this.appLovinSdk = appLovinSdkC;
        Objects.requireNonNull(this.appLovinAdFactory);
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitialCreate = AppLovinIncentivizedInterstitial.create(appLovinSdkC);
        this.incentivizedInterstitial = appLovinIncentivizedInterstitialCreate;
        appLovinIncentivizedInterstitialCreate.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, this.adConfiguration.getWatermark());
        this.appLovinSdk.getAdService().loadNextAdForAdToken(this.adConfiguration.getBidResponse(), this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        this.incentivizedInterstitial.show(this.appLovinAd, context, this, this, this, this);
    }
}
