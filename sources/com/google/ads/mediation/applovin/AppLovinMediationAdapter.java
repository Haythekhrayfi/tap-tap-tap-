package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.BuildConfig;
import com.applovin.mediation.rtb.AppLovinRtbInterstitialRenderer;
import com.applovin.mediation.rtb.AppLovinRtbRewardedRenderer;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.google.ads.mediation.applovin.d.a;
import com.google.ads.mediation.applovin.e.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4.f;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinMediationAdapter extends RtbAdapter {
    public static final String APPLOVIN_SDK_ERROR_DOMAIN = "com.applovin.sdk";
    public static final int ERROR_AD_ALREADY_REQUESTED = 105;
    public static final int ERROR_AD_FORMAT_UNSUPPORTED = 108;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 101;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.applovin";
    public static final int ERROR_EMPTY_BID_TOKEN = 104;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 110;
    public static final String ERROR_MSG_BANNER_SIZE_MISMATCH = "Failed to request banner with unsupported size.";
    public static final String ERROR_MSG_MISSING_SDK = "Missing or invalid SDK Key.";
    public static final int ERROR_PRESENTATON_AD_NOT_READY = 106;
    private static final String TAG = "AppLovinMediationAdapter";
    public static AppLovinSdkSettings appLovinSdkSettings;
    private final p4.a appLovinAdFactory;
    private final c appLovinInitializer;
    private final p4.e appLovinSdkUtilsWrapper;
    private final f appLovinSdkWrapper;
    private b bannerAd;
    private e rewardedRenderer;
    private AppLovinRtbInterstitialRenderer rtbInterstitialRenderer;
    private AppLovinRtbRewardedRenderer rtbRewardedRenderer;
    private d waterfallInterstitialAd;

    public class a implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashSet f11608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HashSet f11609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f11610c;

        public a(AppLovinMediationAdapter appLovinMediationAdapter, HashSet hashSet, HashSet hashSet2, InitializationCompleteCallback initializationCompleteCallback) {
            this.f11608a = hashSet;
            this.f11609b = hashSet2;
            this.f11610c = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.applovin.c.b
        public void onInitializeSuccess(String str) {
            this.f11608a.add(str);
            if (this.f11608a.equals(this.f11609b)) {
                this.f11610c.onInitializationSucceeded();
            }
        }
    }

    public AppLovinMediationAdapter() {
        this.appLovinInitializer = c.a();
        this.appLovinAdFactory = new p4.a();
        this.appLovinSdkWrapper = new f();
        this.appLovinSdkUtilsWrapper = new p4.e();
    }

    public AppLovinMediationAdapter(c cVar, p4.a aVar, f fVar, p4.e eVar) {
        this.appLovinInitializer = cVar;
        this.appLovinAdFactory = aVar;
        this.appLovinSdkWrapper = fVar;
        this.appLovinSdkUtilsWrapper = eVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        MediationConfiguration configuration = rtbSignalData.getConfiguration();
        if (configuration.getFormat() == AdFormat.NATIVE) {
            AdError adError = new AdError(108, "Requested to collect signal for unsupported native ad format. Ignoring...", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            signalCallbacks.onFailure(adError);
            return;
        }
        String str = TAG;
        StringBuilder sbA = defpackage.a.a("Extras for signal collection: ");
        sbA.append(rtbSignalData.getNetworkExtras());
        Log.i(str, sbA.toString());
        String bidToken = this.appLovinInitializer.c(configuration.getServerParameters(), rtbSignalData.getContext()).getAdService().getBidToken();
        if (TextUtils.isEmpty(bidToken)) {
            AdError adError2 = new AdError(104, "Failed to generate bid token.", ERROR_DOMAIN);
            Log.e(str, adError2.getMessage());
            signalCallbacks.onFailure(adError2);
        } else {
            Log.i(str, "Generated bid token: " + bidToken);
            signalCallbacks.onSuccess(bidToken);
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        Objects.requireNonNull(this.appLovinSdkWrapper);
        String str = AppLovinSdk.VERSION;
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", str));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        return getVersionInfo(BuildConfig.ADAPTER_VERSION);
    }

    public VersionInfo getVersionInfo(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", str));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        String strRetrieveSdkKey = AppLovinUtils.retrieveSdkKey(context, null);
        if (!TextUtils.isEmpty(strRetrieveSdkKey)) {
            hashSet.add(strRetrieveSdkKey);
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(110, ERROR_MSG_MISSING_SDK, ERROR_DOMAIN);
            Log.w(TAG, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        } else {
            HashSet hashSet2 = new HashSet();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                this.appLovinInitializer.b(context, (String) it2.next(), new a(this, hashSet2, hashSet, initializationCompleteCallback));
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        AdError adError;
        c cVar = this.appLovinInitializer;
        b bVar = new b(mediationBannerAdConfiguration, mediationAdLoadCallback, cVar, this.appLovinAdFactory);
        this.bannerAd = bVar;
        bVar.f11617e = mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        String strRetrieveSdkKey = AppLovinUtils.retrieveSdkKey(bVar.f11617e, serverParameters);
        if (TextUtils.isEmpty(strRetrieveSdkKey)) {
            adError = new AdError(110, ERROR_MSG_MISSING_SDK, ERROR_DOMAIN);
        } else {
            AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(bVar.f11617e, adSize);
            if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize != null) {
                cVar.b(bVar.f11617e, strRetrieveSdkKey, new com.google.ads.mediation.applovin.a(bVar, serverParameters, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize));
                return;
            }
            adError = new AdError(101, ERROR_MSG_BANNER_SIZE_MISMATCH, ERROR_DOMAIN);
        }
        Log.e("b", adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        d dVar = new d(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory);
        this.waterfallInterstitialAd = dVar;
        dVar.f11632d = dVar.interstitialAdConfiguration.getContext();
        Bundle serverParameters = dVar.interstitialAdConfiguration.getServerParameters();
        String strRetrieveSdkKey = AppLovinUtils.retrieveSdkKey(dVar.f11632d, serverParameters);
        if (!TextUtils.isEmpty(strRetrieveSdkKey)) {
            dVar.appLovinInitializer.b(dVar.f11632d, strRetrieveSdkKey, dVar.new a(serverParameters));
            return;
        }
        AdError adError = new AdError(110, ERROR_MSG_MISSING_SDK, APPLOVIN_SDK_ERROR_DOMAIN);
        Log.e(p4.b.TAG, adError.getMessage());
        dVar.interstitialAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        e eVar = new e(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rewardedRenderer = eVar;
        Context context = eVar.adConfiguration.getContext();
        Bundle serverParameters = eVar.adConfiguration.getServerParameters();
        String strRetrieveSdkKey = AppLovinUtils.retrieveSdkKey(context, serverParameters);
        if (!TextUtils.isEmpty(strRetrieveSdkKey)) {
            eVar.appLovinInitializer.b(context, strRetrieveSdkKey, eVar.new a(serverParameters, context));
            return;
        }
        AdError adError = new AdError(110, ERROR_MSG_MISSING_SDK, APPLOVIN_SDK_ERROR_DOMAIN);
        Log.e(p4.d.TAG, adError.toString());
        eVar.adLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        AppLovinRtbInterstitialRenderer appLovinRtbInterstitialRenderer = new AppLovinRtbInterstitialRenderer(mediationInterstitialAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory);
        this.rtbInterstitialRenderer = appLovinRtbInterstitialRenderer;
        appLovinRtbInterstitialRenderer.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        AppLovinRtbRewardedRenderer appLovinRtbRewardedRenderer = new AppLovinRtbRewardedRenderer(mediationRewardedAdConfiguration, mediationAdLoadCallback, this.appLovinInitializer, this.appLovinAdFactory, this.appLovinSdkUtilsWrapper);
        this.rtbRewardedRenderer = appLovinRtbRewardedRenderer;
        appLovinRtbRewardedRenderer.loadAd();
    }
}
