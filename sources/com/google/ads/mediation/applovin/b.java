package com.google.ads.mediation.applovin;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class b implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f11614l = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g6.c f11615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AppLovinSdk f11616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f11617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f11619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p4.a f11620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediationBannerAdConfiguration f11621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f11622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MediationBannerAdCallback f11623k;

    public b(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, c cVar, p4.a aVar) {
        this.f11621i = mediationBannerAdConfiguration;
        this.f11622j = mediationAdLoadCallback;
        this.f11619g = cVar;
        this.f11620h = aVar;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d("b", "Banner clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f11623k;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d("b", "Banner closed fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f11623k;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d("b", "Banner displayed.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f11623k;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w("b", "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        Log.d("b", "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d("b", "Banner left application.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f11623k;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d("b", "Banner opened fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f11623k;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        StringBuilder sbA = defpackage.a.a("Banner did load ad: ");
        sbA.append(appLovinAd.getAdIdNumber());
        sbA.append(" for zone: ");
        sbA.append(this.f11618f);
        Log.d("b", sbA.toString());
        ((AppLovinAdView) this.f11615c.f30015b).renderAd(appLovinAd);
        this.f11623k = this.f11622j.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        AdError adError = AppLovinUtils.getAdError(i10);
        Log.w("b", "Failed to load banner ad with error: " + i10);
        this.f11622j.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return (AppLovinAdView) this.f11615c.f30015b;
    }
}
