package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d extends p4.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, WeakReference<d>> f11630f = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppLovinSdk f11631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f11632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f11633e;

    public class a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f11634a;

        public a(Bundle bundle) {
            this.f11634a = bundle;
        }

        @Override // com.google.ads.mediation.applovin.c.b
        public void onInitializeSuccess(String str) {
            d.this.zoneId = AppLovinUtils.retrieveZoneId(this.f11634a);
            HashMap<String, WeakReference<d>> map = d.f11630f;
            if (map.containsKey(d.this.zoneId) && map.get(d.this.zoneId).get() != null) {
                AdError adError = new AdError(105, p4.b.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                Log.e(p4.b.TAG, adError.getMessage());
                d.this.interstitialAdLoadCallback.onFailure(adError);
                return;
            }
            map.put(d.this.zoneId, new WeakReference<>(d.this));
            d dVar = d.this;
            dVar.f11631c = dVar.appLovinInitializer.c(this.f11634a, dVar.f11632d);
            d dVar2 = d.this;
            dVar2.f11633e = dVar2.f11633e;
            String str2 = p4.b.TAG;
            StringBuilder sbA = defpackage.a.a("Requesting interstitial for zone: ");
            sbA.append(d.this.zoneId);
            Log.d(str2, sbA.toString());
            if (TextUtils.isEmpty(d.this.zoneId)) {
                d.this.f11631c.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, d.this);
                return;
            }
            AppLovinAdService adService = d.this.f11631c.getAdService();
            d dVar3 = d.this;
            adService.loadNextAdForZoneId(dVar3.zoneId, dVar3);
        }
    }

    public d(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, c cVar, p4.a aVar) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, cVar, aVar);
    }

    public void a() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap<String, WeakReference<d>> map = f11630f;
        if (map.containsKey(this.zoneId) && equals(map.get(this.zoneId).get())) {
            map.remove(this.zoneId);
        }
    }

    @Override // p4.b, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        a();
        super.adHidden(appLovinAd);
    }

    @Override // p4.b, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        a();
        super.failedToReceiveAd(i10);
    }

    @Override // p4.b
    public void loadAd() {
        this.f11632d = this.interstitialAdConfiguration.getContext();
        Bundle serverParameters = this.interstitialAdConfiguration.getServerParameters();
        String strRetrieveSdkKey = AppLovinUtils.retrieveSdkKey(this.f11632d, serverParameters);
        if (!TextUtils.isEmpty(strRetrieveSdkKey)) {
            this.appLovinInitializer.b(this.f11632d, strRetrieveSdkKey, new a(serverParameters));
            return;
        }
        AdError adError = new AdError(110, AppLovinMediationAdapter.ERROR_MSG_MISSING_SDK, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
        Log.e(p4.b.TAG, adError.getMessage());
        this.interstitialAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f11631c.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.f11633e));
        p4.a aVar = this.appLovinAdFactory;
        AppLovinSdk appLovinSdk = this.f11631c;
        Objects.requireNonNull(aVar);
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(appLovinSdk, context);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(this);
        appLovinInterstitialAdDialogCreate.setAdClickListener(this);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd != null) {
            String str = p4.b.TAG;
            StringBuilder sbA = defpackage.a.a("Showing interstitial for zone: ");
            sbA.append(this.zoneId);
            Log.d(str, sbA.toString());
            appLovinInterstitialAdDialogCreate.showAndRender(this.appLovinInterstitialAd);
            return;
        }
        String str2 = p4.b.TAG;
        Log.d(str2, "Attempting to show interstitial before one was loaded.");
        if (TextUtils.isEmpty(this.zoneId)) {
            Log.d(str2, "Showing interstitial preloaded by SDK.");
            appLovinInterstitialAdDialogCreate.show();
        }
    }
}
