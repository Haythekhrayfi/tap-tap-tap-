package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e extends p4.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap<String, WeakReference<e>> f11636d = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11637c;

    public class a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f11638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f11639b;

        public a(Bundle bundle, Context context) {
            this.f11638a = bundle;
            this.f11639b = context;
        }

        @Override // com.google.ads.mediation.applovin.c.b
        public void onInitializeSuccess(String str) {
            e eVar;
            AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitialCreate;
            e.this.f11637c = AppLovinUtils.retrieveZoneId(this.f11638a);
            e eVar2 = e.this;
            eVar2.appLovinSdk = eVar2.appLovinInitializer.c(this.f11638a, this.f11639b);
            boolean z10 = true;
            String str2 = String.format("Requesting rewarded video for zone '%s'", e.this.f11637c);
            String str3 = p4.d.TAG;
            Log.d(str3, str2);
            HashMap<String, WeakReference<e>> map = e.f11636d;
            if (!map.containsKey(e.this.f11637c)) {
                map.put(e.this.f11637c, new WeakReference<>(e.this));
                z10 = false;
            }
            if (z10) {
                AdError adError = new AdError(105, p4.d.ERROR_MSG_MULTIPLE_REWARDED_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                Log.e(str3, adError.toString());
                e.this.adLoadCallback.onFailure(adError);
                return;
            }
            if (Objects.equals(e.this.f11637c, "")) {
                eVar = e.this;
                p4.a aVar = eVar.appLovinAdFactory;
                AppLovinSdk appLovinSdk = eVar.appLovinSdk;
                Objects.requireNonNull(aVar);
                appLovinIncentivizedInterstitialCreate = AppLovinIncentivizedInterstitial.create(appLovinSdk);
            } else {
                eVar = e.this;
                p4.a aVar2 = eVar.appLovinAdFactory;
                String str4 = eVar.f11637c;
                AppLovinSdk appLovinSdk2 = eVar.appLovinSdk;
                Objects.requireNonNull(aVar2);
                appLovinIncentivizedInterstitialCreate = AppLovinIncentivizedInterstitial.create(str4, appLovinSdk2);
            }
            eVar.incentivizedInterstitial = appLovinIncentivizedInterstitialCreate;
            e eVar3 = e.this;
            eVar3.incentivizedInterstitial.preload(eVar3);
        }
    }

    public e(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, c cVar, p4.a aVar, p4.e eVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, cVar, aVar, eVar);
    }

    @Override // p4.d, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        f11636d.remove(this.f11637c);
        super.adHidden(appLovinAd);
    }

    @Override // p4.d, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        f11636d.remove(this.f11637c);
        super.failedToReceiveAd(i10);
    }

    @Override // p4.d
    public void loadAd() {
        Context context = this.adConfiguration.getContext();
        Bundle serverParameters = this.adConfiguration.getServerParameters();
        String strRetrieveSdkKey = AppLovinUtils.retrieveSdkKey(context, serverParameters);
        if (!TextUtils.isEmpty(strRetrieveSdkKey)) {
            this.appLovinInitializer.b(context, strRetrieveSdkKey, new a(serverParameters, context));
            return;
        }
        AdError adError = new AdError(110, AppLovinMediationAdapter.ERROR_MSG_MISSING_SDK, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
        Log.e(p4.d.TAG, adError.toString());
        this.adLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        String str = this.f11637c;
        if (str != null) {
            Log.d(p4.d.TAG, String.format("Showing rewarded video for zone '%s'", str));
        }
        if (this.incentivizedInterstitial.isAdReadyToDisplay()) {
            this.incentivizedInterstitial.show(context, this, this, this, this);
            return;
        }
        AdError adError = new AdError(106, p4.d.ERROR_MSG_AD_NOT_READY, AppLovinMediationAdapter.ERROR_DOMAIN);
        Log.e(p4.d.TAG, adError.toString());
        this.rewardedAdCallback.onAdFailedToShow(adError);
    }
}
