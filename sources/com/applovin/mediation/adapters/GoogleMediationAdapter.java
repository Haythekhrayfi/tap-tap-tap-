package com.applovin.mediation.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class GoogleMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter {
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int ICON_VIEW_TAG = 3;
    private static final int MEDIA_VIEW_CONTAINER_TAG = 2;
    private static final int TITLE_LABEL_TAG = 1;
    private static final AtomicBoolean initialized = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus status;
    private AdView adView;
    private AppOpenAd appOpenAd;
    private AppOpenAdListener appOpenAdListener;
    private InterstitialAd appOpenInterstitialAd;
    private AppOpenAdListener appOpenInterstitialAdListener;
    private InterstitialAd interstitialAd;
    private NativeAd nativeAd;
    private NativeAdView nativeAdView;
    private RewardedAd rewardedAd;
    private RewardedAdListener rewardedAdListener;
    private RewardedInterstitialAd rewardedInterstitialAd;
    private RewardedInterstitialAdListener rewardedInterstitialAdListener;

    public class AdViewListener extends AdListener {
        public final MaxAdFormat adFormat;
        public final MaxAdViewAdapterListener listener;
        public final String placementId;

        public AdViewListener(String str, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = str;
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleMediationAdapter.this.log(this.adFormat.getLabel() + " ad closed");
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
            GoogleMediationAdapter.this.log(this.adFormat.getLabel() + " ad (" + this.placementId + ") failed to load with error code: " + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.adFormat.getLabel());
            sb2.append(" ad shown: ");
            b.a(sb2, this.placementId, googleMediationAdapter);
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.adFormat.getLabel());
            sb2.append(" ad loaded: ");
            b.a(sb2, this.placementId, googleMediationAdapter);
            if (AppLovinSdk.VERSION_CODE < 9150000) {
                this.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.adView);
                return;
            }
            Bundle bundle = new Bundle(3);
            ResponseInfo responseInfo = GoogleMediationAdapter.this.adView.getResponseInfo();
            String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
            if (AppLovinSdkUtils.isValidString(responseId)) {
                bundle.putString("creative_id", responseId);
            }
            AdSize adSize = GoogleMediationAdapter.this.adView.getAdSize();
            if (adSize != null) {
                bundle.putInt("ad_width", adSize.getWidth());
                bundle.putInt("ad_height", adSize.getHeight());
            }
            this.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.adView, bundle);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleMediationAdapter.this.log(this.adFormat.getLabel() + " ad opened");
            this.listener.onAdViewAdClicked();
        }
    }

    public class AppOpenAdListener extends FullScreenContentCallback {
        private final MaxAppOpenAdapterListener listener;
        private final String placementId;

        public AppOpenAdListener(String str, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
            this.placementId = str;
            this.listener = maxAppOpenAdapterListener;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            b.a(defpackage.a.a("App open ad clicked: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onAppOpenAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            b.a(defpackage.a.a("App open ad hidden: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onAppOpenAdHidden();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad display failed", adError.getCode(), adError.getMessage());
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("App open ad (");
            sbA.append(this.placementId);
            sbA.append(") failed to show with error: ");
            sbA.append(maxAdapterError);
            googleMediationAdapter.log(sbA.toString());
            this.listener.onAppOpenAdDisplayFailed(maxAdapterError);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            b.a(defpackage.a.a("App open ad impression recorded: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onAppOpenAdDisplayed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            b.a(defpackage.a.a("App open ad shown: "), this.placementId, GoogleMediationAdapter.this);
        }
    }

    public class InterstitialAdListener extends FullScreenContentCallback {
        private final MaxInterstitialAdapterListener listener;
        private final String placementId;

        public InterstitialAdListener(String str, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.placementId = str;
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            b.a(defpackage.a.a("Interstitial ad clicked: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            b.a(defpackage.a.a("Interstitial ad hidden: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onInterstitialAdHidden();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", adError.getCode(), adError.getMessage());
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Interstitial ad (");
            sbA.append(this.placementId);
            sbA.append(") failed to show with error: ");
            sbA.append(maxAdapterError);
            googleMediationAdapter.log(sbA.toString());
            this.listener.onInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            b.a(defpackage.a.a("Interstitial ad impression recorded: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            b.a(defpackage.a.a("Interstitial ad shown: "), this.placementId, GoogleMediationAdapter.this);
        }
    }

    public class MaxGoogleNativeAd extends MaxNativeAd {
        public MaxGoogleNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            NativeAd nativeAd = GoogleMediationAdapter.this.nativeAd;
            if (nativeAd == null) {
                GoogleMediationAdapter.this.e("Failed to register native ad views: native ad is null.");
                return false;
            }
            GoogleMediationAdapter.this.nativeAdView = new NativeAdView(viewGroup.getContext());
            if (viewGroup instanceof MaxNativeAdView) {
                MaxNativeAdView maxNativeAdView = (MaxNativeAdView) viewGroup;
                View mainView = maxNativeAdView.getMainView();
                maxNativeAdView.removeView(mainView);
                GoogleMediationAdapter.this.nativeAdView.addView(mainView);
                maxNativeAdView.addView(GoogleMediationAdapter.this.nativeAdView);
                GoogleMediationAdapter.this.nativeAdView.setIconView(maxNativeAdView.getIconImageView());
                GoogleMediationAdapter.this.nativeAdView.setHeadlineView(maxNativeAdView.getTitleTextView());
                GoogleMediationAdapter.this.nativeAdView.setAdvertiserView(maxNativeAdView.getAdvertiserTextView());
                GoogleMediationAdapter.this.nativeAdView.setBodyView(maxNativeAdView.getBodyTextView());
                GoogleMediationAdapter.this.nativeAdView.setCallToActionView(maxNativeAdView.getCallToActionButton());
                View mediaView = getMediaView();
                if (mediaView instanceof MediaView) {
                    GoogleMediationAdapter.this.nativeAdView.setMediaView((MediaView) mediaView);
                } else if (mediaView instanceof ImageView) {
                    GoogleMediationAdapter.this.nativeAdView.setImageView(mediaView);
                }
                GoogleMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
            } else {
                for (View view : list) {
                    Object tag = view.getTag();
                    if (tag != null) {
                        int iIntValue = ((Integer) tag).intValue();
                        if (iIntValue == 1) {
                            GoogleMediationAdapter.this.nativeAdView.setHeadlineView(view);
                        } else if (iIntValue == 3) {
                            GoogleMediationAdapter.this.nativeAdView.setIconView(view);
                        } else if (iIntValue == 4) {
                            GoogleMediationAdapter.this.nativeAdView.setBodyView(view);
                        } else if (iIntValue == 5) {
                            GoogleMediationAdapter.this.nativeAdView.setCallToActionView(view);
                        } else if (iIntValue == 8) {
                            GoogleMediationAdapter.this.nativeAdView.setAdvertiserView(view);
                        }
                    }
                }
                View mediaView2 = getMediaView();
                ViewGroup viewGroup2 = mediaView2 != null ? (ViewGroup) mediaView2.getParent() : null;
                if (viewGroup2 != null && viewGroup.findViewById(viewGroup2.getId()) != null) {
                    viewGroup2.removeView(mediaView2);
                    GoogleMediationAdapter.this.nativeAdView.addView(mediaView2);
                    viewGroup2.addView(GoogleMediationAdapter.this.nativeAdView);
                    if (mediaView2 instanceof MediaView) {
                        GoogleMediationAdapter.this.nativeAdView.setMediaView((MediaView) mediaView2);
                    } else if (mediaView2 instanceof ImageView) {
                        GoogleMediationAdapter.this.nativeAdView.setImageView(mediaView2);
                    }
                    GoogleMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
                    GoogleMediationAdapter.this.nativeAdView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup2.getHeight(), 1073741824));
                    GoogleMediationAdapter.this.nativeAdView.layout(0, 0, viewGroup2.getWidth(), viewGroup2.getHeight());
                }
            }
            return true;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            prepareForInteraction(Collections.emptyList(), maxNativeAdView);
        }
    }

    public class NativeAdListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
        public final Context context;
        public final MaxNativeAdAdapterListener listener;
        public final String placementId;
        public final Bundle serverParameters;

        public NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            GoogleMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleMediationAdapter.this.log("Native ad closed");
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ad (");
            sbA.append(this.placementId);
            sbA.append(") failed to load with error: ");
            sbA.append(maxError);
            googleMediationAdapter.log(sbA.toString());
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleMediationAdapter.this.log("Native ad shown");
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleMediationAdapter.this.log("Native ad opened");
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(final NativeAd nativeAd) {
            b.a(defpackage.a.a("Native ad loaded: "), this.placementId, GoogleMediationAdapter.this);
            GoogleMediationAdapter.this.nativeAd = nativeAd;
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(nativeAd.getHeadline())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.NativeAdListener.1
                    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
                    @Override // java.lang.Runnable
                    public void run() {
                        float intrinsicWidth;
                        View view;
                        Drawable mainImage;
                        MaxNativeAd.MaxNativeAdImage maxNativeAdImage;
                        MediaContent mediaContent = nativeAd.getMediaContent();
                        List<NativeAd.Image> images = nativeAd.getImages();
                        if (mediaContent != null) {
                            MediaView mediaView = new MediaView(NativeAdListener.this.context);
                            mediaView.setMediaContent(mediaContent);
                            mainImage = mediaContent.getMainImage();
                            intrinsicWidth = mediaContent.getAspectRatio();
                            view = mediaView;
                        } else if (images == null || images.size() <= 0) {
                            intrinsicWidth = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                            view = null;
                            mainImage = null;
                        } else {
                            NativeAd.Image image = images.get(0);
                            ImageView imageView = new ImageView(NativeAdListener.this.context);
                            Drawable drawable = image.getDrawable();
                            if (drawable != null) {
                                imageView.setImageDrawable(drawable);
                                intrinsicWidth = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
                                mainImage = null;
                                view = imageView;
                            } else {
                                intrinsicWidth = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                view = null;
                                mainImage = null;
                            }
                        }
                        NativeAd.Image icon = nativeAd.getIcon();
                        if (icon != null) {
                            maxNativeAdImage = icon.getDrawable() != null ? new MaxNativeAd.MaxNativeAdImage(icon.getDrawable()) : new MaxNativeAd.MaxNativeAdImage(icon.getUri());
                        } else {
                            maxNativeAdImage = null;
                        }
                        MaxNativeAd.Builder mediaView2 = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(nativeAd.getHeadline()).setAdvertiser(nativeAd.getAdvertiser()).setBody(nativeAd.getBody()).setCallToAction(nativeAd.getCallToAction()).setIcon(maxNativeAdImage).setMediaView(view);
                        int i10 = AppLovinSdk.VERSION_CODE;
                        if (i10 >= 11040399) {
                            mediaView2.setMainImage(new MaxNativeAd.MaxNativeAdImage(mainImage));
                        }
                        if (i10 >= 11040000) {
                            mediaView2.setMediaContentAspectRatio(intrinsicWidth);
                        }
                        if (i10 >= 11070000) {
                            mediaView2.setStarRating(nativeAd.getStarRating());
                        }
                        MaxGoogleNativeAd maxGoogleNativeAd = GoogleMediationAdapter.this.new MaxGoogleNativeAd(mediaView2);
                        ResponseInfo responseInfo = nativeAd.getResponseInfo();
                        String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                        Bundle bundle = new Bundle(1);
                        bundle.putString("creative_id", responseId);
                        NativeAdListener.this.listener.onNativeAdLoaded(maxGoogleNativeAd, bundle);
                    }
                });
                return;
            }
            GoogleMediationAdapter.this.e("Native ad (" + nativeAd + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets"));
        }
    }

    public class NativeAdViewListener extends AdListener implements NativeAd.OnNativeAdLoadedListener {
        public final WeakReference<Activity> activityRef;
        public final MaxAdFormat adFormat;
        public final MaxAdViewAdapterListener listener;
        public final String placementId;
        public final Bundle serverParameters;

        public NativeAdViewListener(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.activityRef = new WeakReference<>(activity);
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" ad clicked");
            googleMediationAdapter.log(sbA.toString());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" ad closed");
            googleMediationAdapter.log(sbA.toString());
            this.listener.onAdViewAdCollapsed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" ad (");
            sbA.append(this.placementId);
            sbA.append(") failed to load with error: ");
            sbA.append(maxError);
            googleMediationAdapter.log(sbA.toString());
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" ad shown");
            googleMediationAdapter.log(sbA.toString());
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" ad opened");
            googleMediationAdapter.log(sbA.toString());
            this.listener.onAdViewAdExpanded();
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(final NativeAd nativeAd) {
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" ad loaded: ");
            sbA.append(this.placementId);
            googleMediationAdapter.log(sbA.toString());
            if (TextUtils.isEmpty(nativeAd.getHeadline())) {
                GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
                StringBuilder sbA2 = defpackage.a.a("Native ");
                sbA2.append(this.adFormat.getLabel());
                sbA2.append(" ad failed to load: Google native ad is missing one or more required assets");
                googleMediationAdapter2.log(sbA2.toString());
                this.listener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
                nativeAd.destroy();
                return;
            }
            GoogleMediationAdapter.this.nativeAd = nativeAd;
            final Activity activity = this.activityRef.get();
            final Context context = GoogleMediationAdapter.this.getContext(activity);
            final MediaView mediaView = new MediaView(context);
            MediaContent mediaContent = nativeAd.getMediaContent();
            if (mediaContent != null) {
                mediaView.setMediaContent(mediaContent);
            }
            NativeAd.Image icon = nativeAd.getIcon();
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage = null;
            if (icon != null) {
                maxNativeAdImage = icon.getDrawable() != null ? new MaxNativeAd.MaxNativeAdImage(icon.getDrawable()) : new MaxNativeAd.MaxNativeAdImage(icon.getUri());
            }
            final MaxNativeAd maxNativeAdBuild = new MaxNativeAd.Builder().setAdFormat(this.adFormat).setTitle(nativeAd.getHeadline()).setBody(nativeAd.getBody()).setCallToAction(nativeAd.getCallToAction()).setIcon(maxNativeAdImage).setMediaView(mediaView).build();
            final String string = BundleUtils.getString("template", "", this.serverParameters);
            if (string.contains("vertical") && AppLovinSdk.VERSION_CODE < 9140500) {
                GoogleMediationAdapter.this.log("Vertical native banners are only supported on MAX SDK 9.14.5 and above. Default horizontal native template will be used.");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.NativeAdViewListener.1
                @Override // java.lang.Runnable
                public void run() {
                    int i10 = AppLovinSdk.VERSION_CODE;
                    MaxNativeAdView maxNativeAdView = i10 >= 11010000 ? new MaxNativeAdView(maxNativeAdBuild, string, context) : new MaxNativeAdView(maxNativeAdBuild, string, activity);
                    GoogleMediationAdapter.this.nativeAdView = new NativeAdView(context);
                    GoogleMediationAdapter.this.nativeAdView.setIconView(maxNativeAdView.getIconContentView());
                    GoogleMediationAdapter.this.nativeAdView.setHeadlineView(maxNativeAdView.getTitleTextView());
                    GoogleMediationAdapter.this.nativeAdView.setBodyView(maxNativeAdView.getBodyTextView());
                    GoogleMediationAdapter.this.nativeAdView.setMediaView(mediaView);
                    GoogleMediationAdapter.this.nativeAdView.setCallToActionView(maxNativeAdView.getCallToActionButton());
                    GoogleMediationAdapter.this.nativeAdView.setNativeAd(nativeAd);
                    GoogleMediationAdapter.this.nativeAdView.addView(maxNativeAdView);
                    ResponseInfo responseInfo = nativeAd.getResponseInfo();
                    String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                    if (i10 < 9150000 || !AppLovinSdkUtils.isValidString(responseId)) {
                        NativeAdViewListener nativeAdViewListener = NativeAdViewListener.this;
                        nativeAdViewListener.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.nativeAdView);
                    } else {
                        Bundle bundle = new Bundle(1);
                        bundle.putString("creative_id", responseId);
                        NativeAdViewListener nativeAdViewListener2 = NativeAdViewListener.this;
                        nativeAdViewListener2.listener.onAdViewAdLoaded(GoogleMediationAdapter.this.nativeAdView, bundle);
                    }
                }
            });
        }
    }

    public class RewardedAdListener extends FullScreenContentCallback {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;
        private final String placementId;

        public RewardedAdListener(String str, MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.placementId = str;
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            b.a(defpackage.a.a("Rewarded ad clicked: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onRewardedAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            this.listener.onRewardedAdVideoCompleted();
            if (this.hasGrantedReward || GoogleMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = GoogleMediationAdapter.this.getReward();
                GoogleMediationAdapter.this.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            b.a(defpackage.a.a("Rewarded ad hidden: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onRewardedAdHidden();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", adError.getCode(), adError.getMessage());
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Rewarded ad (");
            sbA.append(this.placementId);
            sbA.append(") failed to show with error: ");
            sbA.append(maxAdapterError);
            googleMediationAdapter.log(sbA.toString());
            this.listener.onRewardedAdDisplayFailed(maxAdapterError);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            b.a(defpackage.a.a("Rewarded ad impression recorded: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            b.a(defpackage.a.a("Rewarded ad shown: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onRewardedAdVideoStarted();
        }
    }

    public class RewardedInterstitialAdListener extends FullScreenContentCallback {
        private boolean hasGrantedReward;
        private final MaxRewardedInterstitialAdapterListener listener;
        private final String placementId;

        private RewardedInterstitialAdListener(String str, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
            this.placementId = str;
            this.listener = maxRewardedInterstitialAdapterListener;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            b.a(defpackage.a.a("Rewarded interstitial ad clicked: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onRewardedInterstitialAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            this.listener.onRewardedInterstitialAdVideoCompleted();
            if (this.hasGrantedReward || GoogleMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = GoogleMediationAdapter.this.getReward();
                GoogleMediationAdapter.this.log("Rewarded interstitial ad rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            b.a(defpackage.a.a("Rewarded interstitial ad hidden: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onRewardedInterstitialAdHidden();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            MaxAdapterError maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", adError.getCode(), adError.getMessage());
            GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Rewarded interstitial ad (");
            sbA.append(this.placementId);
            sbA.append(") failed to show with error: ");
            sbA.append(maxAdapterError);
            googleMediationAdapter.log(sbA.toString());
            this.listener.onRewardedInterstitialAdDisplayFailed(maxAdapterError);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            b.a(defpackage.a.a("Rewarded interstitial ad impression recorded: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onRewardedInterstitialAdDisplayed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            b.a(defpackage.a.a("Rewarded interstitial ad shown: "), this.placementId, GoogleMediationAdapter.this);
            this.listener.onRewardedInterstitialAdVideoStarted();
        }
    }

    public GoogleMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    @SuppressLint({"ApplySharedPref"})
    private AdRequest createAdRequestWithParameters(boolean z10, MaxAdFormat maxAdFormat, MaxAdapterParameters maxAdapterParameters, Context context) {
        boolean zEqualsIgnoreCase;
        SharedPreferences.Editor editorRemove;
        AdRequest.Builder builder = new AdRequest.Builder();
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        Bundle bundle = new Bundle(6);
        if (z10) {
            zEqualsIgnoreCase = "dv360".equalsIgnoreCase(BundleUtils.getString("bidder", "", serverParameters));
            bundle.putString("query_info_type", zEqualsIgnoreCase ? "requester_type_3" : "requester_type_2");
            if (AppLovinSdk.VERSION_CODE >= 11000000 && maxAdFormat.isAdViewAd()) {
                Object obj = maxAdapterParameters.getLocalExtraParameters().get(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER);
                if ((obj instanceof String) && "true".equalsIgnoreCase((String) obj)) {
                    AdSize adSize = toAdSize(maxAdFormat, true, maxAdapterParameters, context);
                    bundle.putInt("adaptive_banner_w", adSize.getWidth());
                    bundle.putInt("adaptive_banner_h", adSize.getHeight());
                }
            }
            if (maxAdapterParameters instanceof MaxAdapterResponseParameters) {
                String bidResponse = ((MaxAdapterResponseParameters) maxAdapterParameters).getBidResponse();
                if (AppLovinSdkUtils.isValidString(bidResponse)) {
                    builder.setAdString(bidResponse);
                }
            }
        } else {
            zEqualsIgnoreCase = false;
        }
        if (serverParameters.getBoolean("set_mediation_identifier", true)) {
            builder.setRequestAgent(zEqualsIgnoreCase ? "applovin_dv360" : "applovin");
        }
        String string = BundleUtils.getString("event_id", serverParameters);
        if (AppLovinSdkUtils.isValidString(string)) {
            bundle.putString("placement_req_id", string);
        }
        Boolean boolHasUserConsent = maxAdapterParameters.hasUserConsent();
        if (boolHasUserConsent != null && !boolHasUserConsent.booleanValue()) {
            bundle.putString("npa", "1");
        }
        Boolean boolIsDoNotSell = maxAdapterParameters.isDoNotSell();
        if (boolIsDoNotSell == null || !boolIsDoNotSell.booleanValue()) {
            editorRemove = PreferenceManager.getDefaultSharedPreferences(context).edit().remove("gad_rdp");
        } else {
            bundle.putInt("rdp", 1);
            editorRemove = PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("gad_rdp", 1);
        }
        editorRemove.commit();
        if (AppLovinSdk.VERSION_CODE >= 11000000) {
            Map<String, Object> localExtraParameters = maxAdapterParameters.getLocalExtraParameters();
            Object obj2 = localExtraParameters.get("google_max_ad_content_rating");
            if (obj2 instanceof String) {
                bundle.putString("max_ad_content_rating", (String) obj2);
            }
            Object obj3 = localExtraParameters.get("google_content_url");
            if (obj3 instanceof String) {
                builder.setContentUrl((String) obj3);
            }
            Object obj4 = localExtraParameters.get("google_neighbouring_content_url_strings");
            if (obj4 instanceof List) {
                try {
                    builder.setNeighboringContentUrls((List) obj4);
                } catch (Throwable th) {
                    e("Neighbouring content URL strings extra param needs to be of type List<String>.", th);
                }
            }
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        return builder.build();
    }

    private int getAdChoicesPlacement(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        if (AppLovinSdk.VERSION_CODE < 11000000) {
            return 1;
        }
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        Object obj = localExtraParameters != null ? localExtraParameters.get("admob_ad_choices_placement") : null;
        if (isValidAdChoicesPlacement(obj)) {
            return ((Integer) obj).intValue();
        }
        return 1;
    }

    private int getAdaptiveBannerWidth(MaxAdapterParameters maxAdapterParameters, Context context) {
        if (AppLovinSdk.VERSION_CODE >= 11000000) {
            Object obj = maxAdapterParameters.getLocalExtraParameters().get("adaptive_banner_width");
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj != null) {
                StringBuilder sbA = defpackage.a.a("Expected parameter \"adaptive_banner_width\" to be of type Integer, received: ");
                sbA.append(obj.getClass());
                e(sbA.toString());
            }
        }
        return AppLovinSdkUtils.pxToDp(context, getApplicationWindowWidth(context));
    }

    public static int getApplicationWindowWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getCurrentWindowMetrics().getBounds().width();
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private boolean isValidAdChoicesPlacement(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    private void setRequestConfiguration(MaxAdapterParameters maxAdapterParameters) {
        RequestConfiguration.Builder builder = MobileAds.getRequestConfiguration().toBuilder();
        Boolean boolIsAgeRestrictedUser = maxAdapterParameters.isAgeRestrictedUser();
        if (boolIsAgeRestrictedUser != null) {
            builder.setTagForChildDirectedTreatment(boolIsAgeRestrictedUser.booleanValue() ? 1 : 0);
        }
        MobileAds.setRequestConfiguration(builder.build());
    }

    private AdFormat toAdFormat(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters) {
        MaxAdFormat adFormat = maxAdapterSignalCollectionParameters.getAdFormat();
        if (maxAdapterSignalCollectionParameters.getServerParameters().getBoolean("is_native") || adFormat == MaxAdFormat.NATIVE) {
            return AdFormat.NATIVE;
        }
        if (adFormat.isAdViewAd()) {
            return AdFormat.BANNER;
        }
        if (adFormat == MaxAdFormat.INTERSTITIAL) {
            return AdFormat.INTERSTITIAL;
        }
        if (adFormat == MaxAdFormat.REWARDED) {
            return AdFormat.REWARDED;
        }
        if (adFormat == MaxAdFormat.REWARDED_INTERSTITIAL) {
            return AdFormat.REWARDED_INTERSTITIAL;
        }
        return adFormat == MaxAdFormat.APP_OPEN ? AdFormat.APP_OPEN_AD : AdFormat.UNKNOWN;
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat, boolean z10, MaxAdapterParameters maxAdapterParameters, Context context) {
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        if (maxAdFormat == maxAdFormat2 || maxAdFormat == MaxAdFormat.LEADER) {
            if (z10) {
                return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, getAdaptiveBannerWidth(maxAdapterParameters, context));
            }
            return maxAdFormat == maxAdFormat2 ? AdSize.BANNER : AdSize.LEADERBOARD;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    public static MaxAdapterError toMaxError(AdError adError) {
        int code = adError.getCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (code == 0) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (code == 1) {
            maxAdapterError = MaxAdapterError.BAD_REQUEST;
        } else if (code == 2) {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        } else if (code != 3) {
            switch (code) {
                case 8:
                case 11:
                    maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                    break;
                case 9:
                    maxAdapterError = MaxAdapterError.NO_FILL;
                    break;
                case 10:
                    maxAdapterError = MaxAdapterError.BAD_REQUEST;
                    break;
            }
        } else {
            maxAdapterError = MaxAdapterError.NO_FILL;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), code, adError.getMessage());
    }

    private static void updateMuteState(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        if (serverParameters.containsKey("is_muted")) {
            MobileAds.setAppMuted(serverParameters.getBoolean("is_muted"));
        }
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        setRequestConfiguration(maxAdapterSignalCollectionParameters);
        Context context = getContext(activity);
        QueryInfo.generate(context, toAdFormat(maxAdapterSignalCollectionParameters), createAdRequestWithParameters(true, maxAdapterSignalCollectionParameters.getAdFormat(), maxAdapterSignalCollectionParameters, context), new QueryInfoGenerationCallback() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.2
            @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
            public void onFailure(String str) {
                GoogleMediationAdapter.this.log("Signal collection failed with error: " + str);
                maxSignalCollectionListener.onSignalCollectionFailed(str);
            }

            @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
            public void onSuccess(QueryInfo queryInfo) {
                GoogleMediationAdapter.this.log("Signal collection successful");
                maxSignalCollectionListener.onSignalCollected(queryInfo.getQuery());
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return "22.3.0.0";
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return String.valueOf(MobileAds.getVersion());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    @SuppressLint({"MissingPermission"})
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        log("Initializing Google SDK...");
        if (initialized.compareAndSet(false, true)) {
            Context context = getContext(activity);
            MobileAds.disableMediationAdapterInitialization(context);
            if (!maxAdapterInitializationParameters.getServerParameters().getBoolean("init_without_callback", false)) {
                status = MaxAdapter.InitializationStatus.INITIALIZING;
                MobileAds.initialize(context, new OnInitializationCompleteListener() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.1
                    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                    public void onInitializationComplete(InitializationStatus initializationStatus) {
                        AdapterStatus adapterStatus = initializationStatus.getAdapterStatusMap().get("com.google.android.gms.ads.MobileAds");
                        AdapterStatus.State initializationState = adapterStatus != null ? adapterStatus.getInitializationState() : null;
                        GoogleMediationAdapter.this.log("Initialization complete with status " + initializationState);
                        MaxAdapter.InitializationStatus unused = GoogleMediationAdapter.status = AdapterStatus.State.READY == initializationState ? MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS : MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN;
                        onCompletionListener.onCompletion(GoogleMediationAdapter.status, null);
                    }
                });
                return;
            } else {
                status = MaxAdapter.InitializationStatus.DOES_NOT_APPLY;
                MobileAds.initialize(context);
            }
        }
        onCompletionListener.onCompletion(status, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    @SuppressLint({"MissingPermission"})
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sbA = defpackage.a.a("Loading ");
        sbA.append(zIsValidString ? "bidding " : "");
        sbA.append(z10 ? "native " : "");
        sbA.append(maxAdFormat.getLabel());
        sbA.append(" ad for placement id: ");
        sbA.append(thirdPartyAdPlacementId);
        b.a(sbA, "...", this);
        setRequestConfiguration(maxAdapterResponseParameters);
        Context context = getContext(activity);
        AdRequest adRequestCreateAdRequestWithParameters = createAdRequestWithParameters(zIsValidString, maxAdFormat, maxAdapterResponseParameters, context);
        if (z10) {
            NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
            builder.setAdChoicesPlacement(getAdChoicesPlacement(maxAdapterResponseParameters));
            builder.setRequestMultipleImages(maxAdFormat == MaxAdFormat.MREC);
            NativeAdViewListener nativeAdViewListener = new NativeAdViewListener(maxAdapterResponseParameters, maxAdFormat, activity, maxAdViewAdapterListener);
            new AdLoader.Builder(context, thirdPartyAdPlacementId).withNativeAdOptions(builder.build()).forNativeAd(nativeAdViewListener).withAdListener(nativeAdViewListener).build().loadAd(adRequestCreateAdRequestWithParameters);
            return;
        }
        AdView adView = new AdView(context);
        this.adView = adView;
        adView.setAdUnitId(thirdPartyAdPlacementId);
        this.adView.setAdListener(new AdViewListener(thirdPartyAdPlacementId, maxAdFormat, maxAdViewAdapterListener));
        this.adView.setAdSize(toAdSize(maxAdFormat, maxAdapterResponseParameters.getServerParameters().getBoolean(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, false), maxAdapterResponseParameters, context));
        this.adView.loadAd(adRequestCreateAdRequestWithParameters);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_inter_placement");
        StringBuilder sbA = defpackage.a.a("Loading ");
        sbA.append(zIsValidString ? "bidding " : "");
        sbA.append("app open ");
        log(w0.a.a(sbA, z10 ? "interstitial " : "", "ad: ", thirdPartyAdPlacementId, "..."));
        updateMuteState(maxAdapterResponseParameters);
        setRequestConfiguration(maxAdapterResponseParameters);
        Context context = getContext(activity);
        if (z10) {
            InterstitialAd.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(zIsValidString, MaxAdFormat.INTERSTITIAL, maxAdapterResponseParameters, activity), new InterstitialAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.4
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
                    GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                    StringBuilder sbA2 = defpackage.a.a("App open interstitial ad (");
                    sbA2.append(thirdPartyAdPlacementId);
                    sbA2.append(") failed to load with error: ");
                    sbA2.append(maxError);
                    googleMediationAdapter.log(sbA2.toString());
                    maxAppOpenAdapterListener.onAppOpenAdLoadFailed(maxError);
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(InterstitialAd interstitialAd) {
                    GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                    StringBuilder sbA2 = defpackage.a.a("App open interstitial ad loaded: ");
                    sbA2.append(thirdPartyAdPlacementId);
                    sbA2.append("...");
                    googleMediationAdapter.log(sbA2.toString());
                    GoogleMediationAdapter.this.appOpenInterstitialAd = interstitialAd;
                    GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
                    googleMediationAdapter2.appOpenInterstitialAdListener = googleMediationAdapter2.new AppOpenAdListener(thirdPartyAdPlacementId, maxAppOpenAdapterListener);
                    GoogleMediationAdapter.this.appOpenInterstitialAd.setFullScreenContentCallback(GoogleMediationAdapter.this.appOpenInterstitialAdListener);
                    ResponseInfo responseInfo = GoogleMediationAdapter.this.appOpenInterstitialAd.getResponseInfo();
                    String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                    if (!AppLovinSdkUtils.isValidString(responseId)) {
                        maxAppOpenAdapterListener.onAppOpenAdLoaded();
                        return;
                    }
                    Bundle bundle = new Bundle(1);
                    bundle.putString("creative_id", responseId);
                    maxAppOpenAdapterListener.onAppOpenAdLoaded(bundle);
                }
            });
        } else {
            AppOpenAd.load(context, thirdPartyAdPlacementId, createAdRequestWithParameters(zIsValidString, MaxAdFormat.APP_OPEN, maxAdapterResponseParameters, activity), AppLovinSdkUtils.getOrientation(context), new AppOpenAd.AppOpenAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.5
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
                    GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                    StringBuilder sbA2 = defpackage.a.a("App open ad (");
                    sbA2.append(thirdPartyAdPlacementId);
                    sbA2.append(") failed to load with error: ");
                    sbA2.append(maxError);
                    googleMediationAdapter.log(sbA2.toString());
                    maxAppOpenAdapterListener.onAppOpenAdLoadFailed(maxError);
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(AppOpenAd appOpenAd) {
                    GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                    StringBuilder sbA2 = defpackage.a.a("App open ad loaded: ");
                    sbA2.append(thirdPartyAdPlacementId);
                    sbA2.append("...");
                    googleMediationAdapter.log(sbA2.toString());
                    GoogleMediationAdapter.this.appOpenAd = appOpenAd;
                    GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
                    googleMediationAdapter2.appOpenAdListener = googleMediationAdapter2.new AppOpenAdListener(thirdPartyAdPlacementId, maxAppOpenAdapterListener);
                    appOpenAd.setFullScreenContentCallback(GoogleMediationAdapter.this.appOpenAdListener);
                    ResponseInfo responseInfo = GoogleMediationAdapter.this.appOpenAd.getResponseInfo();
                    String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                    if (!AppLovinSdkUtils.isValidString(responseId)) {
                        maxAppOpenAdapterListener.onAppOpenAdLoaded();
                        return;
                    }
                    Bundle bundle = new Bundle(1);
                    bundle.putString("creative_id", responseId);
                    maxAppOpenAdapterListener.onAppOpenAdLoaded(bundle);
                }
            });
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        log(w0.a.a(defpackage.a.a("Loading "), zIsValidString ? "bidding " : "", "interstitial ad: ", thirdPartyAdPlacementId, "..."));
        updateMuteState(maxAdapterResponseParameters);
        setRequestConfiguration(maxAdapterResponseParameters);
        InterstitialAd.load(activity, thirdPartyAdPlacementId, createAdRequestWithParameters(zIsValidString, MaxAdFormat.INTERSTITIAL, maxAdapterResponseParameters, activity), new InterstitialAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.3
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Interstitial ad (");
                sbA.append(thirdPartyAdPlacementId);
                sbA.append(") failed to load with error: ");
                sbA.append(maxError);
                googleMediationAdapter.log(sbA.toString());
                maxInterstitialAdapterListener.onInterstitialAdLoadFailed(maxError);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Interstitial ad loaded: ");
                sbA.append(thirdPartyAdPlacementId);
                sbA.append("...");
                googleMediationAdapter.log(sbA.toString());
                GoogleMediationAdapter.this.interstitialAd = interstitialAd;
                GoogleMediationAdapter.this.interstitialAd.setFullScreenContentCallback(GoogleMediationAdapter.this.new InterstitialAdListener(thirdPartyAdPlacementId, maxInterstitialAdapterListener));
                ResponseInfo responseInfo = GoogleMediationAdapter.this.interstitialAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdk.VERSION_CODE < 9150000 || !AppLovinSdkUtils.isValidString(responseId)) {
                    maxInterstitialAdapterListener.onInterstitialAdLoaded();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", responseId);
                maxInterstitialAdapterListener.onInterstitialAdLoaded(bundle);
            }
        });
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    @SuppressLint({"MissingPermission"})
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        log(w0.a.a(defpackage.a.a("Loading "), zIsValidString ? "bidding " : "", " native ad for placement id: ", thirdPartyAdPlacementId, "..."));
        setRequestConfiguration(maxAdapterResponseParameters);
        Context applicationContext = activity != null ? activity.getApplicationContext() : getApplicationContext();
        AdRequest adRequestCreateAdRequestWithParameters = createAdRequestWithParameters(zIsValidString, MaxAdFormat.NATIVE, maxAdapterResponseParameters, applicationContext);
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        builder.setAdChoicesPlacement(getAdChoicesPlacement(maxAdapterResponseParameters));
        builder.setRequestMultipleImages(BundleUtils.getString("template", "", maxAdapterResponseParameters.getServerParameters()).contains("medium"));
        NativeAdListener nativeAdListener = new NativeAdListener(maxAdapterResponseParameters, applicationContext, maxNativeAdAdapterListener);
        new AdLoader.Builder(applicationContext, thirdPartyAdPlacementId).withNativeAdOptions(builder.build()).forNativeAd(nativeAdListener).withAdListener(nativeAdListener).build().loadAd(adRequestCreateAdRequestWithParameters);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        log(w0.a.a(defpackage.a.a("Loading "), zIsValidString ? "bidding " : "", "rewarded ad: ", thirdPartyAdPlacementId, "..."));
        updateMuteState(maxAdapterResponseParameters);
        setRequestConfiguration(maxAdapterResponseParameters);
        RewardedAd.load(activity, thirdPartyAdPlacementId, createAdRequestWithParameters(zIsValidString, MaxAdFormat.REWARDED, maxAdapterResponseParameters, activity), new RewardedAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.8
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Rewarded ad (");
                sbA.append(thirdPartyAdPlacementId);
                sbA.append(") failed to load with error: ");
                sbA.append(maxError);
                googleMediationAdapter.log(sbA.toString());
                maxRewardedAdapterListener.onRewardedAdLoadFailed(maxError);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedAd rewardedAd) {
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Rewarded ad loaded: ");
                sbA.append(thirdPartyAdPlacementId);
                sbA.append("...");
                googleMediationAdapter.log(sbA.toString());
                GoogleMediationAdapter.this.rewardedAd = rewardedAd;
                GoogleMediationAdapter googleMediationAdapter2 = GoogleMediationAdapter.this;
                googleMediationAdapter2.rewardedAdListener = googleMediationAdapter2.new RewardedAdListener(thirdPartyAdPlacementId, maxRewardedAdapterListener);
                GoogleMediationAdapter.this.rewardedAd.setFullScreenContentCallback(GoogleMediationAdapter.this.rewardedAdListener);
                ResponseInfo responseInfo = GoogleMediationAdapter.this.rewardedAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdk.VERSION_CODE < 9150000 || !AppLovinSdkUtils.isValidString(responseId)) {
                    maxRewardedAdapterListener.onRewardedAdLoaded();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", responseId);
                maxRewardedAdapterListener.onRewardedAdLoaded(bundle);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void loadRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean zIsValidString = AppLovinSdkUtils.isValidString(maxAdapterResponseParameters.getBidResponse());
        log(w0.a.a(defpackage.a.a("Loading "), zIsValidString ? "bidding " : "", "rewarded interstitial ad: ", thirdPartyAdPlacementId, "..."));
        updateMuteState(maxAdapterResponseParameters);
        setRequestConfiguration(maxAdapterResponseParameters);
        RewardedInterstitialAd.load(activity, thirdPartyAdPlacementId, createAdRequestWithParameters(zIsValidString, MaxAdFormat.REWARDED_INTERSTITIAL, maxAdapterResponseParameters, activity), new RewardedInterstitialAdLoadCallback() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.6
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                MaxAdapterError maxError = GoogleMediationAdapter.toMaxError(loadAdError);
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Rewarded interstitial ad (");
                sbA.append(thirdPartyAdPlacementId);
                sbA.append(") failed to load with error: ");
                sbA.append(maxError);
                googleMediationAdapter.log(sbA.toString());
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoadFailed(maxError);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
                b.a(defpackage.a.a("Rewarded interstitial ad loaded: "), thirdPartyAdPlacementId, GoogleMediationAdapter.this);
                GoogleMediationAdapter.this.rewardedInterstitialAd = rewardedInterstitialAd;
                GoogleMediationAdapter googleMediationAdapter = GoogleMediationAdapter.this;
                googleMediationAdapter.rewardedInterstitialAdListener = new RewardedInterstitialAdListener(thirdPartyAdPlacementId, maxRewardedInterstitialAdapterListener);
                GoogleMediationAdapter.this.rewardedInterstitialAd.setFullScreenContentCallback(GoogleMediationAdapter.this.rewardedInterstitialAdListener);
                ResponseInfo responseInfo = GoogleMediationAdapter.this.rewardedInterstitialAd.getResponseInfo();
                String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
                if (AppLovinSdk.VERSION_CODE <= 9150000 || !AppLovinSdkUtils.isValidString(responseId)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoaded();
                    return;
                }
                Bundle bundle = new Bundle(1);
                bundle.putString("creative_id", responseId);
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoaded(bundle);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        log("Destroy called for adapter " + this);
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(null);
            this.interstitialAd = null;
        }
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd != null) {
            appOpenAd.setFullScreenContentCallback(null);
            this.appOpenAd = null;
            this.appOpenAdListener = null;
        }
        InterstitialAd interstitialAd2 = this.appOpenInterstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.setFullScreenContentCallback(null);
            this.appOpenInterstitialAd = null;
            this.appOpenInterstitialAdListener = null;
        }
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.setFullScreenContentCallback(null);
            this.rewardedInterstitialAd = null;
            this.rewardedInterstitialAdListener = null;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.rewardedAd = null;
            this.rewardedAdListener = null;
        }
        AdView adView = this.adView;
        if (adView != null) {
            adView.destroy();
            this.adView = null;
        }
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.nativeAd = null;
        }
        NativeAdView nativeAdView = this.nativeAdView;
        if (nativeAdView != null) {
            nativeAdView.destroy();
            this.nativeAdView = null;
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxAppOpenAdapter
    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(w0.a.a(defpackage.a.a("Showing app open "), maxAdapterResponseParameters.getServerParameters().getBoolean("is_inter_placement") ? "interstitial " : "", "ad: ", thirdPartyAdPlacementId, "..."));
        InterstitialAd interstitialAd = this.appOpenInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(activity);
            return;
        }
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd != null) {
            appOpenAd.show(activity);
            return;
        }
        log("App open ad failed to show: " + thirdPartyAdPlacementId);
        maxAppOpenAdapterListener.onAppOpenAdLoadFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad display failed", 0, "App open ad not ready"));
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing interstitial ad: " + thirdPartyAdPlacementId + "...");
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(activity);
            return;
        }
        log("Interstitial ad failed to show: " + thirdPartyAdPlacementId);
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Interstitial ad not ready"));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded ad: " + thirdPartyAdPlacementId + "...");
        if (this.rewardedAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedAd.show(activity, new OnUserEarnedRewardListener() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.9
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public void onUserEarnedReward(RewardItem rewardItem) {
                    b.a(defpackage.a.a("Rewarded ad user earned reward: "), thirdPartyAdPlacementId, GoogleMediationAdapter.this);
                    GoogleMediationAdapter.this.rewardedAdListener.hasGrantedReward = true;
                }
            });
            return;
        }
        log("Rewarded ad failed to show: " + thirdPartyAdPlacementId);
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Rewarded ad not ready"));
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void showRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Showing rewarded interstitial ad: " + thirdPartyAdPlacementId + "...");
        if (this.rewardedInterstitialAd != null) {
            configureReward(maxAdapterResponseParameters);
            this.rewardedInterstitialAd.show(activity, new OnUserEarnedRewardListener() { // from class: com.applovin.mediation.adapters.GoogleMediationAdapter.7
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public void onUserEarnedReward(RewardItem rewardItem) {
                    b.a(defpackage.a.a("Rewarded interstitial ad user earned reward: "), thirdPartyAdPlacementId, GoogleMediationAdapter.this);
                    GoogleMediationAdapter.this.rewardedInterstitialAdListener.hasGrantedReward = true;
                }
            });
            return;
        }
        log("Rewarded interstitial ad failed to show: " + thirdPartyAdPlacementId);
        maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdDisplayFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Rewarded Interstitial ad not ready"));
    }
}
