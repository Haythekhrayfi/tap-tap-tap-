package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.yandex.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.yandex.mobile.ads.banner.AdSize;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.common.BidderTokenLoader;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import j1.d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class YandexMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final Map<String, String> adRequestParameters = new HashMap(3);
    private static MaxAdapter.InitializationStatus status;
    private BannerAdView adView;
    private InterstitialAd interstitialAd;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private RewardedAd rewardedAd;

    public class AdViewListener implements BannerAdEventListener {
        private final String adFormatLabel;
        private final MaxAdViewAdapterListener listener;

        public AdViewListener(String str, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormatLabel = str;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("AdView ad clicked");
            this.listener.onAdViewAdClicked();
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdFailedToLoad(AdRequestError adRequestError) {
            YandexMediationAdapter.this.log(this.adFormatLabel + " ad failed to load with error code " + adRequestError.getCode() + " and description: " + adRequestError.getDescription());
            this.listener.onAdViewAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onAdLoaded() {
            YandexMediationAdapter.this.log(this.adFormatLabel + " ad loaded");
            this.listener.onAdViewAdLoaded(YandexMediationAdapter.this.adView);
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onImpression(ImpressionData impressionData) {
            YandexMediationAdapter.this.log("AdView ad impression tracked");
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onLeftApplication() {
            YandexMediationAdapter.this.log(this.adFormatLabel + " ad left application after click");
        }

        @Override // com.yandex.mobile.ads.banner.BannerAdEventListener
        public void onReturnedToApplication() {
            YandexMediationAdapter.this.log(this.adFormatLabel + " ad returned to application");
        }
    }

    public class InterstitialAdListener implements InterstitialAdEventListener {
        private final MaxInterstitialAdapterListener listener;
        private final MaxAdapterResponseParameters parameters;

        public InterstitialAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.parameters = maxAdapterResponseParameters;
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("Interstitial ad clicked");
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdDismissed() {
            YandexMediationAdapter.this.log("Interstitial ad dismissed");
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdFailedToLoad(AdRequestError adRequestError) {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Interstitial ad failed to load with error code ");
            sbA.append(adRequestError.getCode());
            sbA.append(" and description: ");
            sbA.append(adRequestError.getDescription());
            yandexMediationAdapter.log(sbA.toString());
            this.listener.onInterstitialAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener, com.yandex.mobile.ads.impl.qx
        public void onAdLoaded() {
            YandexMediationAdapter.this.log("Interstitial ad loaded");
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onAdShown() {
            YandexMediationAdapter.this.log("Interstitial ad shown");
            if (this.parameters.isTesting()) {
                this.listener.onInterstitialAdDisplayed();
            }
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onImpression(ImpressionData impressionData) {
            YandexMediationAdapter.this.log("Interstitial ad impression tracked");
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onLeftApplication() {
            YandexMediationAdapter.this.log("Interstitial left application after click");
        }

        @Override // com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
        public void onReturnedToApplication() {
            YandexMediationAdapter.this.log("Interstitial returned to application");
        }
    }

    public class MaxYandexNativeAd extends MaxNativeAd {
        public MaxYandexNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            if (YandexMediationAdapter.this.nativeAd == null) {
                YandexMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return;
            }
            YandexMediationAdapter.this.nativeAdView = new NativeAdView(maxNativeAdView.getContext());
            View mainView = maxNativeAdView.getMainView();
            maxNativeAdView.removeView(mainView);
            YandexMediationAdapter.this.nativeAdView.addView(mainView);
            maxNativeAdView.addView(YandexMediationAdapter.this.nativeAdView);
            LinearLayout linearLayout = (LinearLayout) maxNativeAdView.getOptionsContentViewGroup().getChildAt(0);
            try {
                YandexMediationAdapter.this.nativeAd.bindNativeAd(new NativeAdViewBinder.Builder(YandexMediationAdapter.this.nativeAdView).setIconView(maxNativeAdView.getIconImageView()).setTitleView(maxNativeAdView.getTitleTextView()).setDomainView(maxNativeAdView.getAdvertiserTextView()).setBodyView(maxNativeAdView.getBodyTextView()).setMediaView((MediaView) getMediaView()).setWarningView((TextView) linearLayout.getChildAt(0)).setSponsoredView((TextView) linearLayout.getChildAt(1)).setFeedbackView((ImageView) linearLayout.getChildAt(2)).setCallToActionView(maxNativeAdView.getCallToActionButton()).build());
                YandexMediationAdapter.this.nativeAdView.setVisibility(0);
            } catch (NativeAdException e10) {
                YandexMediationAdapter.this.e("Failed to register native ad views.", e10);
            }
        }
    }

    public class NativeAdListener implements NativeAdLoadListener, NativeAdEventListener {
        private final Context applicationContext;
        private final MaxNativeAdAdapterListener listener;
        private final String placementId;
        private final Bundle serverParameters;

        private NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.applicationContext = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ad (");
            sbA.append(this.placementId);
            sbA.append(") clicked");
            yandexMediationAdapter.log(sbA.toString());
            this.listener.onNativeAdClicked();
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
        public void onAdFailedToLoad(AdRequestError adRequestError) {
            MaxAdapterError maxError = YandexMediationAdapter.toMaxError(adRequestError);
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ad (");
            sbA.append(this.placementId);
            sbA.append(") failed to load with error: ");
            sbA.append(maxError);
            yandexMediationAdapter.log(sbA.toString());
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
        public void onAdLoaded(NativeAd nativeAd) {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ad loaded: ");
            sbA.append(this.placementId);
            yandexMediationAdapter.log(sbA.toString());
            YandexMediationAdapter.this.nativeAd = nativeAd;
            nativeAd.setNativeAdEventListener(this);
            final NativeAdAssets adAssets = nativeAd.getAdAssets();
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(adAssets.getTitle())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.NativeAdListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BitmapDrawable bitmapDrawable = adAssets.getIcon() != null ? new BitmapDrawable(NativeAdListener.this.applicationContext.getResources(), adAssets.getIcon().getBitmap()) : null;
                        LinearLayout linearLayout = new LinearLayout(NativeAdListener.this.applicationContext);
                        TextView textView = new TextView(NativeAdListener.this.applicationContext);
                        TextView textView2 = new TextView(NativeAdListener.this.applicationContext);
                        textView.setText(adAssets.getWarning());
                        textView2.setText(adAssets.getSponsored());
                        linearLayout.addView(textView);
                        linearLayout.addView(textView2);
                        linearLayout.addView(new ImageView(NativeAdListener.this.applicationContext));
                        NativeAdListener.this.listener.onNativeAdLoaded(YandexMediationAdapter.this.new MaxYandexNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(adAssets.getTitle()).setAdvertiser(adAssets.getDomain()).setBody(adAssets.getBody()).setCallToAction(adAssets.getCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(bitmapDrawable)).setOptionsView(linearLayout).setMediaView(new MediaView(NativeAdListener.this.applicationContext))), null);
                    }
                });
                return;
            }
            YandexMediationAdapter.this.e("Native ad (" + nativeAd + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets"));
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
        public void onImpression(ImpressionData impressionData) {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ad (");
            sbA.append(this.placementId);
            sbA.append(") shown");
            yandexMediationAdapter.log(sbA.toString());
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
        public void onLeftApplication() {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ad (");
            sbA.append(this.placementId);
            sbA.append(") left application");
            yandexMediationAdapter.log(sbA.toString());
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
        public void onReturnedToApplication() {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ad (");
            sbA.append(this.placementId);
            sbA.append(") returned to application");
            yandexMediationAdapter.log(sbA.toString());
        }
    }

    public class RewardedAdListener implements RewardedAdEventListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;
        private final MaxAdapterResponseParameters parameters;

        public RewardedAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.parameters = maxAdapterResponseParameters;
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdClicked() {
            YandexMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdDismissed() {
            YandexMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdVideoCompleted();
            if (this.hasGrantedReward || YandexMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = YandexMediationAdapter.this.getReward();
                YandexMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdFailedToLoad(AdRequestError adRequestError) {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Rewarded ad failed to load with error code ");
            sbA.append(adRequestError.getCode());
            sbA.append(" and description: ");
            sbA.append(adRequestError.getDescription());
            yandexMediationAdapter.log(sbA.toString());
            this.listener.onRewardedAdLoadFailed(YandexMediationAdapter.toMaxError(adRequestError));
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener, com.yandex.mobile.ads.impl.qx
        public void onAdLoaded() {
            YandexMediationAdapter.this.log("Rewarded ad loaded");
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onAdShown() {
            YandexMediationAdapter.this.log("Rewarded ad shown");
            if (this.parameters.isTesting()) {
                this.listener.onRewardedAdDisplayed();
                this.listener.onRewardedAdVideoStarted();
            }
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onImpression(ImpressionData impressionData) {
            YandexMediationAdapter.this.log("Rewarded ad impression tracked");
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onLeftApplication() {
            YandexMediationAdapter.this.log("Rewarded ad left application after click");
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onReturnedToApplication() {
            YandexMediationAdapter.this.log("Rewarded ad returned to application");
        }

        @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
        public void onRewarded(Reward reward) {
            YandexMediationAdapter yandexMediationAdapter = YandexMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Rewarded user with reward: ");
            sbA.append(reward.getAmount());
            sbA.append(" ");
            sbA.append(reward.getType());
            yandexMediationAdapter.log(sbA.toString());
            this.hasGrantedReward = true;
        }
    }

    public YandexMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AdRequest createAdRequest(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        return new AdRequest.Builder().setBiddingData(maxAdapterResponseParameters.getBidResponse()).setParameters(adRequestParameters).build();
    }

    private void loadAdOnUiThread(Runnable runnable) {
        if (AppLovinSdk.VERSION_CODE >= 11080300) {
            runnable.run();
        } else {
            AppLovinSdkUtils.runOnUiThread(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER_320x50;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.BANNER_300x250;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.BANNER_728x90;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0021  */
    public static MaxAdapterError toMaxError(AdRequestError adRequestError) {
        int code = adRequestError.getCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (code != 0) {
            if (code == 1) {
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
            } else if (code == 2) {
                maxAdapterError = MaxAdapterError.BAD_REQUEST;
            } else if (code == 3) {
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
            } else if (code == 4) {
                maxAdapterError = MaxAdapterError.NO_FILL;
            } else if (code == 5) {
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
            }
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), adRequestError.getCode(), adRequestError.getDescription());
    }

    private void updateUserConsent(MaxAdapterParameters maxAdapterParameters) {
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null) {
            MobileAds.setUserConsent(boolHasUserConsent.booleanValue());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateUserConsent(maxAdapterSignalCollectionParameters);
        BidderTokenLoader.loadBidderToken(activity, new BidderTokenLoadListener() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.2
            @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
            public void onBidderTokenFailedToLoad(String str) {
                YandexMediationAdapter.this.log("Signal collection failed: " + str);
                maxSignalCollectionListener.onSignalCollectionFailed(str);
            }

            @Override // com.yandex.mobile.ads.common.BidderTokenLoadListener
            public void onBidderTokenLoaded(String str) {
                YandexMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(str);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return MobileAds.getLibraryVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (INITIALIZED.compareAndSet(false, true)) {
            StringBuilder sbA = defpackage.a.a("Initializing Yandex SDK");
            sbA.append(maxAdapterInitializationParameters.isTesting() ? " in test mode " : "");
            sbA.append("...");
            log(sbA.toString());
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            updateUserConsent(maxAdapterInitializationParameters);
            if (maxAdapterInitializationParameters.isTesting()) {
                MobileAds.enableLogging(true);
            }
            MobileAds.initialize(activity != null ? activity.getApplicationContext() : getApplicationContext(), new InitializationListener() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.1
                @Override // com.yandex.mobile.ads.common.InitializationListener
                public void onInitializationCompleted() {
                    YandexMediationAdapter.this.log("Yandex SDK initialized");
                    MaxAdapter.InitializationStatus unused = YandexMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN;
                    onCompletionListener.onCompletion(YandexMediationAdapter.status, null);
                }
            });
        } else {
            onCompletionListener.onCompletion(status, null);
        }
        Map<String, String> map = adRequestParameters;
        map.put("adapter_network_name", "applovin");
        map.put("adapter_version", getAdapterVersion());
        map.put("adapter_network_sdk_version", AppLovinSdk.VERSION);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, Activity activity, final MaxAdViewAdapterListener maxAdViewAdapterListener) {
        final String label = maxAdFormat.getLabel();
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        StringBuilder sbA = defpackage.a.a("Loading ");
        d.a(sbA, AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "", label, " ad for placement: ", thirdPartyAdPlacementId);
        sbA.append("...");
        log(sbA.toString());
        final Context applicationContext = activity != null ? activity.getApplicationContext() : getApplicationContext();
        updateUserConsent(maxAdapterResponseParameters);
        loadAdOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                YandexMediationAdapter.this.adView = new BannerAdView(applicationContext);
                YandexMediationAdapter.this.adView.setAdUnitId(thirdPartyAdPlacementId);
                YandexMediationAdapter.this.adView.setAdSize(YandexMediationAdapter.toAdSize(maxAdFormat));
                YandexMediationAdapter.this.adView.setBannerAdEventListener(YandexMediationAdapter.this.new AdViewListener(label, maxAdViewAdapterListener));
                YandexMediationAdapter.this.adView.loadAd(YandexMediationAdapter.this.createAdRequest(maxAdapterResponseParameters));
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, final Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(w0.a.a(defpackage.a.a("Loading "), AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "", "interstitial ad for placement: ", thirdPartyAdPlacementId, "..."));
        if (activity == null) {
            log("Interstitial ad load failed: Activity is null");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(new MaxAdapterError(-5601, "Missing Activity"));
        } else {
            updateUserConsent(maxAdapterResponseParameters);
            loadAdOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.3
                @Override // java.lang.Runnable
                public void run() {
                    YandexMediationAdapter.this.interstitialAd = new InterstitialAd(activity);
                    YandexMediationAdapter.this.interstitialAd.setAdUnitId(thirdPartyAdPlacementId);
                    YandexMediationAdapter.this.interstitialAd.setInterstitialAdEventListener(YandexMediationAdapter.this.new InterstitialAdListener(maxAdapterResponseParameters, maxInterstitialAdapterListener));
                    YandexMediationAdapter.this.interstitialAd.loadAd(YandexMediationAdapter.this.createAdRequest(maxAdapterResponseParameters));
                }
            });
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        final String bidResponse = maxAdapterResponseParameters.getBidResponse();
        log(w0.a.a(defpackage.a.a("Loading "), AppLovinSdkUtils.isValidString(bidResponse) ? "bidding " : "", "native ad for placement: ", thirdPartyAdPlacementId, "..."));
        final Context applicationContext = activity != null ? activity.getApplicationContext() : getApplicationContext();
        updateUserConsent(maxAdapterResponseParameters);
        loadAdOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                NativeAdLoader nativeAdLoader = new NativeAdLoader(applicationContext);
                nativeAdLoader.setNativeAdLoadListener(new NativeAdListener(maxAdapterResponseParameters, applicationContext, maxNativeAdAdapterListener));
                nativeAdLoader.loadAd(new NativeAdRequestConfiguration.Builder(thirdPartyAdPlacementId).setBiddingData(bidResponse).setParameters(YandexMediationAdapter.adRequestParameters).setShouldLoadImagesAutomatically(true).build());
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, final Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(w0.a.a(defpackage.a.a("Loading "), AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse()) ? "bidding " : "", "rewarded ad for placement: ", thirdPartyAdPlacementId, "..."));
        if (activity == null) {
            log("Rewarded ad load failed: Activity is null");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(new MaxAdapterError(-5601, "Missing Activity"));
        } else {
            updateUserConsent(maxAdapterResponseParameters);
            loadAdOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.YandexMediationAdapter.4
                @Override // java.lang.Runnable
                public void run() {
                    YandexMediationAdapter.this.rewardedAd = new RewardedAd(activity);
                    YandexMediationAdapter.this.rewardedAd.setAdUnitId(thirdPartyAdPlacementId);
                    YandexMediationAdapter.this.rewardedAd.setRewardedAdEventListener(YandexMediationAdapter.this.new RewardedAdListener(maxAdapterResponseParameters, maxRewardedAdapterListener));
                    YandexMediationAdapter.this.rewardedAd.loadAd(YandexMediationAdapter.this.createAdRequest(maxAdapterResponseParameters));
                }
            });
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.interstitialAd = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.destroy();
            this.rewardedAd = null;
        }
        BannerAdView bannerAdView = this.adView;
        if (bannerAdView != null) {
            bannerAdView.destroy();
            this.adView = null;
        }
        this.nativeAd = null;
        this.nativeAdView = null;
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAdapter
    public Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat) {
        return Boolean.TRUE;
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null && interstitialAd.isLoaded()) {
            this.interstitialAd.show();
        } else {
            log("Interstitial ad failed to load - ad not ready");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Interstitial ad not ready"));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null || !rewardedAd.isLoaded()) {
            log("Rewarded ad failed to load - ad not ready");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Rewarded ad not ready"));
        } else {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show();
        }
    }
}
