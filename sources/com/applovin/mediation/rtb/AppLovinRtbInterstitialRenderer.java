package com.applovin.mediation.rtb;

import android.content.Context;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.c;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.Objects;
import p4.a;
import p4.b;

/* JADX INFO: loaded from: classes.dex */
public final class AppLovinRtbInterstitialRenderer extends b {
    private AppLovinInterstitialAdDialog interstitialAd;
    private final AppLovinSdk sdk;

    public AppLovinRtbInterstitialRenderer(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, c cVar, a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, cVar, aVar);
        this.sdk = cVar.c(mediationInterstitialAdConfiguration.getServerParameters(), mediationInterstitialAdConfiguration.getContext());
    }

    @Override // p4.b
    public void loadAd() {
        a aVar = this.appLovinAdFactory;
        AppLovinSdk appLovinSdk = this.sdk;
        Context context = this.interstitialAdConfiguration.getContext();
        Objects.requireNonNull(aVar);
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(appLovinSdk, context);
        this.interstitialAd = appLovinInterstitialAdDialogCreate;
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(this);
        this.interstitialAd.setAdClickListener(this);
        this.interstitialAd.setAdVideoPlaybackListener(this);
        this.interstitialAd.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, this.interstitialAdConfiguration.getWatermark());
        this.sdk.getAdService().loadNextAdForAdToken(this.interstitialAdConfiguration.getBidResponse(), this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.sdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.interstitialAdConfiguration.getMediationExtras()));
        this.interstitialAd.showAndRender(this.appLovinInterstitialAd);
    }
}
