package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import com.applovin.mediation.adapters.facebook.BuildConfig;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import d0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q4.c;
import r4.d;
import r4.d.b;

/* JADX INFO: loaded from: classes.dex */
public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookMediationAdapter";

    public class a implements com.google.ads.mediation.facebook.a.InterfaceC0154a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f11641a;

        public a(FacebookMediationAdapter facebookMediationAdapter, InitializationCompleteCallback initializationCompleteCallback) {
            this.f11641a = initializationCompleteCallback;
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0154a
        public void a(AdError adError) {
            this.f11641a.onInitializationFailed(adError.getMessage());
        }

        @Override // com.google.ads.mediation.facebook.a.InterfaceC0154a
        public void b() {
            this.f11641a.onInitializationSucceeded();
        }
    }

    public static AdError getAdError(com.facebook.ads.AdError adError) {
        return new AdError(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads");
    }

    public static String getPlacementID(Bundle bundle) {
        String string = bundle.getString(RTB_PLACEMENT_PARAMETER);
        return string == null ? bundle.getString("pubid") : string;
    }

    public static void setMixedAudience(MediationAdConfiguration mediationAdConfiguration) {
        if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 1) {
            AdSettings.setMixedAudience(true);
        } else if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidderTokenProvider.getBidderToken(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String[] strArrSplit = AdSdkVersion.BUILD.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s.Returning 0.0.0 for SDK version.", AdSdkVersion.BUILD));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] strArrSplit = BuildConfig.VERSION_NAME.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s.Returning 0.0.0 for adapter version.", BuildConfig.VERSION_NAME));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String placementID = getPlacementID(it.next().getServerParameters());
            if (!TextUtils.isEmpty(placementID)) {
                arrayList.add(placementID);
            }
        }
        if (arrayList.isEmpty()) {
            initializationCompleteCallback.onInitializationFailed("Initialization failed. No placement IDs found.");
            return;
        }
        if (com.google.ads.mediation.facebook.a.f11642d == null) {
            com.google.ads.mediation.facebook.a.f11642d = new com.google.ads.mediation.facebook.a();
        }
        com.google.ads.mediation.facebook.a aVar = com.google.ads.mediation.facebook.a.f11642d;
        a aVar2 = new a(this, initializationCompleteCallback);
        if (aVar.f11643a) {
            aVar.f11645c.add(aVar2);
        } else {
            if (aVar.f11644b) {
                initializationCompleteCallback.onInitializationSucceeded();
                return;
            }
            aVar.f11643a = true;
            aVar.f11645c.add(aVar2);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.15.0.0").withPlacementIds(arrayList).withInitListener(aVar).initialize();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        r4.a aVar = new r4.a(mediationBannerAdConfiguration, mediationAdLoadCallback);
        String placementID = getPlacementID(aVar.f35147c.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            aVar.f35148d.onFailure(adError);
            return;
        }
        setMixedAudience(aVar.f35147c);
        try {
            aVar.f35149e = new AdView(aVar.f35147c.getContext(), placementID, aVar.f35147c.getBidResponse());
            if (!TextUtils.isEmpty(aVar.f35147c.getWatermark())) {
                aVar.f35149e.setExtraHints(new ExtraHints.Builder().mediationData(aVar.f35147c.getWatermark()).build());
            }
            Context context = aVar.f35147c.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar.f35147c.getAdSize().getWidthInPixels(context), -2);
            aVar.f35150f = new FrameLayout(context);
            aVar.f35149e.setLayoutParams(layoutParams);
            aVar.f35150f.addView(aVar.f35149e);
            AdView adView = aVar.f35149e;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(aVar).withBid(aVar.f35147c.getBidResponse()).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(111, b.a(e10, defpackage.a.a("Failed to create banner ad: ")), ERROR_DOMAIN);
            Log.e(TAG, adError2.getMessage());
            aVar.f35148d.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        r4.b bVar = new r4.b(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        String placementID = getPlacementID(bVar.f35152c.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            bVar.f35153d.onFailure(adError);
        } else {
            setMixedAudience(bVar.f35152c);
            bVar.f35154e = new InterstitialAd(bVar.f35152c.getContext(), placementID);
            if (!TextUtils.isEmpty(bVar.f35152c.getWatermark())) {
                bVar.f35154e.setExtraHints(new ExtraHints.Builder().mediationData(bVar.f35152c.getWatermark()).build());
            }
            InterstitialAd interstitialAd = bVar.f35154e;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(bVar.f35152c.getBidResponse()).withAdListener(bVar).build());
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        d dVar = new d(mediationNativeAdConfiguration, mediationAdLoadCallback);
        String placementID = getPlacementID(dVar.f35159a.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            dVar.f35160b.onFailure(adError);
            return;
        }
        setMixedAudience(dVar.f35159a);
        dVar.f35163e = new MediaView(dVar.f35159a.getContext());
        try {
            dVar.f35161c = NativeAdBase.fromBidPayload(dVar.f35159a.getContext(), placementID, dVar.f35159a.getBidResponse());
            if (!TextUtils.isEmpty(dVar.f35159a.getWatermark())) {
                dVar.f35161c.setExtraHints(new ExtraHints.Builder().mediationData(dVar.f35159a.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = dVar.f35161c;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(dVar.new b(dVar.f35159a.getContext(), dVar.f35161c)).withBid(dVar.f35159a.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(109, d0.b.a(e10, defpackage.a.a("Failed to create native ad from bid payload: ")), ERROR_DOMAIN);
            Log.w(TAG, adError2.getMessage());
            dVar.f35160b.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new q4.b(mediationRewardedAdConfiguration, mediationAdLoadCallback).b();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new c(mediationRewardedAdConfiguration, mediationAdLoadCallback).b();
    }
}
