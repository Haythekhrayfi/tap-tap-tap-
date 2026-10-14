package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
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
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.facebook.BuildConfig;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class FacebookMediationAdapter extends MediationAdapterBase implements MaxInterstitialAdapter, MaxRewardedInterstitialAdapter, MaxRewardedAdapter, MaxAdViewAdapter, MaxSignalProvider {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static MaxAdapter.InitializationStatus sStatus;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private NativeAd mNativeAd;
    private NativeBannerAd mNativeBannerAd;
    private RewardedVideoAd mRewardedInterAd;
    private RewardedVideoAd mRewardedVideoAd;
    private final AtomicBoolean onInterstitialAdHiddenCalled;
    private final AtomicBoolean onRewardedAdHiddenCalled;
    private final AtomicBoolean onRewardedAdVideoCompletedCalled;

    public class AdViewListener implements AdListener {
        public final MaxAdFormat adFormat;
        public final MaxAdViewAdapterListener listener;

        public AdViewListener(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad clicked: " + ad2.getPlacementId());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad loaded: " + ad2.getPlacementId());
            this.listener.onAdViewAdLoaded(FacebookMediationAdapter.this.mAdView);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad (" + ad2.getPlacementId() + ") failed to load with error (" + maxError);
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter.this.log(this.adFormat.getLabel() + " ad displayed: " + ad2.getPlacementId());
            this.listener.onAdViewAdDisplayed();
        }
    }

    public class InterstitialAdListener implements InterstitialAdExtendedListener {
        private final MaxInterstitialAdapterListener listener;

        public InterstitialAdListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Interstitial ad clicked: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onInterstitialAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Interstitial ad loaded: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onInterstitialAdLoaded();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Interstitial ad (");
            sbA.append(ad2.getPlacementId());
            sbA.append(") failed to load with error: ");
            sbA.append(maxError);
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onInterstitialAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.InterstitialAdExtendedListener
        public void onInterstitialActivityDestroyed() {
            FacebookMediationAdapter.this.log("Interstitial ad Activity destroyed");
            if (FacebookMediationAdapter.this.onInterstitialAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onInterstitialAdHidden();
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Interstitial ad hidden: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            if (FacebookMediationAdapter.this.onInterstitialAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onInterstitialAdHidden();
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Interstitial ad displayed: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Interstitial ad logging impression: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdCompleted() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerFailed() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerSucceeded() {
        }
    }

    public class MaxFacebookNativeAd extends MaxNativeAd {
        private MaxFacebookNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
            FacebookMediationAdapter facebookMediationAdapter;
            String str;
            Ad ad2 = FacebookMediationAdapter.this.mNativeAd != null ? FacebookMediationAdapter.this.mNativeAd : FacebookMediationAdapter.this.mNativeBannerAd;
            if (ad2 == null) {
                facebookMediationAdapter = FacebookMediationAdapter.this;
                str = "Failed to register native ad views: native ad is null.";
            } else if (list.isEmpty()) {
                facebookMediationAdapter = FacebookMediationAdapter.this;
                str = "No clickable views to prepare";
            } else {
                ImageView imageView = null;
                for (View view : list) {
                    if (view instanceof ImageView) {
                        imageView = (ImageView) view;
                        break;
                    }
                }
                if (!(ad2 instanceof NativeBannerAd)) {
                    ((NativeAd) ad2).registerViewForInteraction(viewGroup, (MediaView) getMediaView(), imageView, list);
                    return true;
                }
                if (imageView != null) {
                    ((NativeBannerAd) ad2).registerViewForInteraction(viewGroup, imageView, list);
                    return true;
                }
                if (getMediaView() != null) {
                    ((NativeBannerAd) ad2).registerViewForInteraction(viewGroup, (ImageView) getMediaView(), list);
                    return true;
                }
                facebookMediationAdapter = FacebookMediationAdapter.this;
                str = "Failed to register native ad view for interaction: icon image view and media view are null";
            }
            facebookMediationAdapter.e(str);
            return false;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            ArrayList arrayList = new ArrayList(6);
            if (AppLovinSdkUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                arrayList.add(maxNativeAdView.getTitleTextView());
            }
            if (AppLovinSdkUtils.isValidString(getAdvertiser()) && maxNativeAdView.getAdvertiserTextView() != null) {
                arrayList.add(maxNativeAdView.getAdvertiserTextView());
            }
            if (AppLovinSdkUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
                arrayList.add(maxNativeAdView.getBodyTextView());
            }
            if (AppLovinSdkUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                arrayList.add(maxNativeAdView.getCallToActionButton());
            }
            if (getIcon() != null && maxNativeAdView.getIconImageView() != null) {
                arrayList.add(maxNativeAdView.getIconImageView());
            }
            if (getMediaView() != null && maxNativeAdView.getMediaContentViewGroup() != null) {
                arrayList.add(maxNativeAdView.getMediaContentViewGroup());
            }
            if (arrayList.isEmpty()) {
                FacebookMediationAdapter.this.e("No clickable views to prepare");
            } else {
                prepareForInteraction(arrayList, maxNativeAdView);
            }
        }
    }

    public class MaxNativeAdListener implements NativeAdListener {
        public final Context context;
        public final MaxNativeAdAdapterListener listener;
        public final Bundle serverParameters;

        public MaxNativeAdListener(Bundle bundle, Context context, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.serverParameters = bundle;
            this.context = context;
            this.listener = maxNativeAdAdapterListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:22:0x009b  */
        public void handleNativeAdLoaded(NativeAdBase nativeAdBase, Drawable drawable, MediaView mediaView, Context context) {
            float mediaWidth;
            int mediaHeight;
            MaxNativeAd.MaxNativeAdImage maxNativeAdImage = (!(nativeAdBase instanceof NativeAd) || nativeAdBase.getAdCoverImage() == null) ? null : new MaxNativeAd.MaxNativeAdImage(Uri.parse(nativeAdBase.getAdCoverImage().getUrl()));
            MaxNativeAd.Builder optionsView = new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(nativeAdBase.getAdHeadline()).setAdvertiser(nativeAdBase.getAdvertiserName()).setBody(nativeAdBase.getAdBodyText()).setCallToAction(nativeAdBase.getAdCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(drawable)).setOptionsView(new AdOptionsView(context, nativeAdBase, null));
            if ((nativeAdBase instanceof NativeAd) && AppLovinSdk.VERSION_CODE >= 11040399) {
                optionsView.setMainImage(maxNativeAdImage);
            }
            float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            if (nativeAdBase instanceof NativeBannerAd) {
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(drawable);
                optionsView.setMediaView(imageView);
                if (drawable != null) {
                    mediaWidth = drawable.getIntrinsicWidth();
                    mediaHeight = drawable.getIntrinsicHeight();
                }
                if (AppLovinSdk.VERSION_CODE >= 11040000) {
                    optionsView.setMediaContentAspectRatio(f10);
                }
                this.listener.onNativeAdLoaded(new MaxFacebookNativeAd(optionsView), null);
            }
            optionsView.setMediaView(mediaView);
            mediaWidth = mediaView.getMediaWidth();
            mediaHeight = mediaView.getMediaHeight();
            f10 = mediaWidth / mediaHeight;
            if (AppLovinSdk.VERSION_CODE >= 11040000) {
                optionsView.setMediaContentAspectRatio(f10);
            }
            this.listener.onNativeAdLoaded(new MaxFacebookNativeAd(optionsView), null);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native clicked: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onNativeAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ad loaded: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            final NativeAdBase nativeAdBase = FacebookMediationAdapter.this.mNativeAd != null ? FacebookMediationAdapter.this.mNativeAd : FacebookMediationAdapter.this.mNativeBannerAd;
            if (nativeAdBase == null || nativeAdBase != ad2) {
                FacebookMediationAdapter.this.log("Native ad failed to load: no fill");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
                return;
            }
            if (nativeAdBase.isAdInvalidated()) {
                FacebookMediationAdapter.this.log("Native ad failed to load: ad is no longer valid");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.AD_EXPIRED);
                return;
            }
            if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(nativeAdBase.getAdHeadline())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.MaxNativeAdListener.1
                    @Override // java.lang.Runnable
                    public void run() {
                        final MediaView mediaView = new MediaView(MaxNativeAdListener.this.context);
                        Drawable preloadedIconViewDrawable = nativeAdBase.getPreloadedIconViewDrawable();
                        final NativeAdBase.Image adIcon = nativeAdBase.getAdIcon();
                        if (preloadedIconViewDrawable != null) {
                            MaxNativeAdListener maxNativeAdListener = MaxNativeAdListener.this;
                            maxNativeAdListener.handleNativeAdLoaded(nativeAdBase, preloadedIconViewDrawable, mediaView, maxNativeAdListener.context);
                            return;
                        }
                        FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                        if (adIcon != null) {
                            facebookMediationAdapter2.getCachingExecutorService().execute(new Runnable() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.MaxNativeAdListener.1.1
                                @Override // java.lang.Runnable
                                public void run() throws ExecutionException, InterruptedException, TimeoutException {
                                    Drawable drawable = null;
                                    if (AppLovinSdkUtils.isValidString(adIcon.getUrl())) {
                                        FacebookMediationAdapter facebookMediationAdapter3 = FacebookMediationAdapter.this;
                                        StringBuilder sbA2 = defpackage.a.a("Adding native ad icon (");
                                        sbA2.append(adIcon.getUrl());
                                        sbA2.append(") to queue to be fetched");
                                        facebookMediationAdapter3.log(sbA2.toString());
                                        Future<Drawable> futureCreateDrawableFuture = FacebookMediationAdapter.this.createDrawableFuture(adIcon.getUrl(), MaxNativeAdListener.this.context.getResources());
                                        int i10 = BundleUtils.getInt("image_task_timeout_seconds", 10, MaxNativeAdListener.this.serverParameters);
                                        if (futureCreateDrawableFuture != null) {
                                            try {
                                                drawable = futureCreateDrawableFuture.get(i10, TimeUnit.SECONDS);
                                            } catch (Throwable th) {
                                                FacebookMediationAdapter.this.e("Image fetching tasks failed", th);
                                            }
                                        }
                                    }
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    MaxNativeAdListener maxNativeAdListener2 = MaxNativeAdListener.this;
                                    maxNativeAdListener2.handleNativeAdLoaded(nativeAdBase, drawable, mediaView, maxNativeAdListener2.context);
                                }
                            });
                            return;
                        }
                        facebookMediationAdapter2.log("No native ad icon (optional) available for the current creative.");
                        MaxNativeAdListener maxNativeAdListener2 = MaxNativeAdListener.this;
                        maxNativeAdListener2.handleNativeAdLoaded(nativeAdBase, null, mediaView, maxNativeAdListener2.context);
                    }
                });
                return;
            }
            FacebookMediationAdapter.this.e("Native ad (" + nativeAdBase + ") does not have required assets.");
            this.listener.onNativeAdLoadFailed(new MaxAdapterError(MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets"));
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ad (");
            sbA.append(ad2.getPlacementId());
            sbA.append(") failed to load with error (");
            sbA.append(maxError);
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onNativeAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native shown: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onNativeAdDisplayed(null);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ad successfully downloaded media: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
        }
    }

    public class NativeAdViewListener implements NativeAdListener {
        public final WeakReference<Activity> activityRef;
        public final MaxAdFormat adFormat;
        public final MaxAdViewAdapterListener listener;
        public final Bundle serverParameters;

        public NativeAdViewListener(Bundle bundle, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.serverParameters = bundle;
            this.activityRef = new WeakReference<>(activity);
            this.adFormat = maxAdFormat;
            this.listener = maxAdViewAdapterListener;
        }

        private void renderNativeAdView() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.NativeAdViewListener.1
                /* JADX WARN: Code duplicated, block: B:53:0x016a  */
                /* JADX WARN: Code duplicated, block: B:54:0x016f  */
                @Override // java.lang.Runnable
                public void run() {
                    FacebookMediationAdapter facebookMediationAdapter;
                    MaxNativeAdView maxNativeAdViewCreateMaxNativeAdView;
                    ArrayList arrayList;
                    ViewGroup mediaContentView;
                    Activity activity = NativeAdViewListener.this.activityRef.get();
                    Context context = FacebookMediationAdapter.this.getContext(activity);
                    MediaView mediaView = new MediaView(context);
                    MediaView mediaView2 = new MediaView(context);
                    MaxNativeAd maxNativeAdBuild = new MaxNativeAd.Builder().setAdFormat(NativeAdViewListener.this.adFormat).setTitle(FacebookMediationAdapter.this.mNativeAd.getAdHeadline()).setAdvertiser(FacebookMediationAdapter.this.mNativeAd.getAdvertiserName()).setBody(FacebookMediationAdapter.this.mNativeAd.getAdBodyText()).setCallToAction(FacebookMediationAdapter.this.mNativeAd.getAdCallToAction()).setIconView(mediaView).setOptionsView(new AdOptionsView(context, FacebookMediationAdapter.this.mNativeAd, null)).setMediaView(mediaView2).build();
                    String string = BundleUtils.getString("template", "", NativeAdViewListener.this.serverParameters);
                    if (string.contains("vertical")) {
                        if (AppLovinSdk.VERSION_CODE < 9140500) {
                            FacebookMediationAdapter.this.log("Vertical native banners are only supported on MAX SDK 9.14.5 and above. Default native template will be used.");
                        }
                        if (string.equals("vertical")) {
                            NativeAdViewListener nativeAdViewListener = NativeAdViewListener.this;
                            maxNativeAdViewCreateMaxNativeAdView = FacebookMediationAdapter.this.createMaxNativeAdView(maxNativeAdBuild, nativeAdViewListener.adFormat == MaxAdFormat.LEADER ? "vertical_leader_template" : "vertical_media_banner_template", activity);
                        } else {
                            facebookMediationAdapter = FacebookMediationAdapter.this;
                        }
                        arrayList = new ArrayList(6);
                        if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getTitle()) && maxNativeAdViewCreateMaxNativeAdView.getTitleTextView() != null) {
                            arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getTitleTextView());
                        }
                        if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getAdvertiser()) && maxNativeAdViewCreateMaxNativeAdView.getAdvertiserTextView() != null) {
                            arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getAdvertiserTextView());
                        }
                        if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getBody()) && maxNativeAdViewCreateMaxNativeAdView.getBodyTextView() != null) {
                            arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getBodyTextView());
                        }
                        if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getCallToAction()) && maxNativeAdViewCreateMaxNativeAdView.getCallToActionButton() != null) {
                            arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getCallToActionButton());
                        }
                        if (maxNativeAdBuild.getIconView() != null && maxNativeAdViewCreateMaxNativeAdView.getIconContentView() != null) {
                            arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getIconContentView());
                        }
                        if (AppLovinSdk.VERSION_CODE >= 11000000) {
                            mediaContentView = maxNativeAdViewCreateMaxNativeAdView.getMediaContentViewGroup();
                        } else {
                            mediaContentView = maxNativeAdViewCreateMaxNativeAdView.getMediaContentView();
                        }
                        if (maxNativeAdBuild.getMediaView() != null && mediaContentView != null) {
                            arrayList.add(mediaContentView);
                        }
                        FacebookMediationAdapter.this.mNativeAd.registerViewForInteraction(maxNativeAdViewCreateMaxNativeAdView, mediaView2, mediaView, arrayList);
                        NativeAdViewListener.this.listener.onAdViewAdLoaded(maxNativeAdViewCreateMaxNativeAdView);
                    }
                    if (AppLovinSdk.VERSION_CODE < 9140500) {
                        facebookMediationAdapter = FacebookMediationAdapter.this;
                        if (!AppLovinSdkUtils.isValidString(string)) {
                            string = "no_body_banner_template";
                        }
                    } else {
                        facebookMediationAdapter = FacebookMediationAdapter.this;
                        if (!AppLovinSdkUtils.isValidString(string)) {
                            string = "media_banner_template";
                        }
                    }
                    maxNativeAdViewCreateMaxNativeAdView = facebookMediationAdapter.createMaxNativeAdView(maxNativeAdBuild, string, activity);
                    arrayList = new ArrayList(6);
                    if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getTitle())) {
                        arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getTitleTextView());
                    }
                    if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getAdvertiser())) {
                        arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getAdvertiserTextView());
                    }
                    if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getBody())) {
                        arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getBodyTextView());
                    }
                    if (AppLovinSdkUtils.isValidString(maxNativeAdBuild.getCallToAction())) {
                        arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getCallToActionButton());
                    }
                    if (maxNativeAdBuild.getIconView() != null) {
                        arrayList.add(maxNativeAdViewCreateMaxNativeAdView.getIconContentView());
                    }
                    if (AppLovinSdk.VERSION_CODE >= 11000000) {
                        mediaContentView = maxNativeAdViewCreateMaxNativeAdView.getMediaContentViewGroup();
                    } else {
                        mediaContentView = maxNativeAdViewCreateMaxNativeAdView.getMediaContentView();
                    }
                    if (maxNativeAdBuild.getMediaView() != null) {
                        arrayList.add(mediaContentView);
                    }
                    FacebookMediationAdapter.this.mNativeAd.registerViewForInteraction(maxNativeAdViewCreateMaxNativeAdView, mediaView2, mediaView, arrayList);
                    NativeAdViewListener.this.listener.onAdViewAdLoaded(maxNativeAdViewCreateMaxNativeAdView);
                }
            });
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" clicked: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onAdViewAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            MaxAdViewAdapterListener maxAdViewAdapterListener;
            MaxAdapterError maxAdapterError;
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" ad loaded: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            if (FacebookMediationAdapter.this.mNativeAd == null || FacebookMediationAdapter.this.mNativeAd != ad2) {
                FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                StringBuilder sbA2 = defpackage.a.a("Native ");
                sbA2.append(this.adFormat.getLabel());
                sbA2.append(" ad failed to load: no fill");
                facebookMediationAdapter2.log(sbA2.toString());
                maxAdViewAdapterListener = this.listener;
                maxAdapterError = MaxAdapterError.NO_FILL;
            } else {
                if (!FacebookMediationAdapter.this.mNativeAd.isAdInvalidated()) {
                    if (this.adFormat != MaxAdFormat.MREC) {
                        renderNativeAdView();
                        return;
                    } else {
                        this.listener.onAdViewAdLoaded(NativeAdView.render(FacebookMediationAdapter.this.getContext(this.activityRef.get()), FacebookMediationAdapter.this.mNativeAd));
                        return;
                    }
                }
                FacebookMediationAdapter facebookMediationAdapter3 = FacebookMediationAdapter.this;
                StringBuilder sbA3 = defpackage.a.a("Native ");
                sbA3.append(this.adFormat.getLabel());
                sbA3.append(" ad failed to load: ad is no longer valid");
                facebookMediationAdapter3.log(sbA3.toString());
                maxAdViewAdapterListener = this.listener;
                maxAdapterError = MaxAdapterError.AD_EXPIRED;
            }
            maxAdViewAdapterListener.onAdViewAdLoadFailed(maxAdapterError);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" ad (");
            sbA.append(ad2.getPlacementId());
            sbA.append(") failed to load with error: ");
            sbA.append(maxError);
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onAdViewAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" shown: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onAdViewAdDisplayed();
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Native ");
            sbA.append(this.adFormat.getLabel());
            sbA.append(" successfully downloaded media: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
        }
    }

    public class RewardedAdListener implements RewardedVideoAdExtendedListener {
        private boolean hasGrantedReward;
        private final MaxRewardedAdapterListener listener;

        public RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Rewarded ad clicked: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onRewardedAdClicked();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Rewarded ad loaded: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onRewardedAdLoaded();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, AdError adError) {
            MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Rewarded ad (");
            sbA.append(ad2.getPlacementId());
            sbA.append(") failed to load with error (");
            sbA.append(maxError);
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onRewardedAdLoadFailed(maxError);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
            FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
            StringBuilder sbA = defpackage.a.a("Rewarded ad logging impression: ");
            sbA.append(ad2.getPlacementId());
            facebookMediationAdapter.log(sbA.toString());
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        @Override // com.facebook.ads.RewardedVideoAdExtendedListener
        public void onRewardedVideoActivityDestroyed() {
            FacebookMediationAdapter.this.log("Rewarded ad Activity destroyed");
            if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                this.listener.onRewardedAdVideoCompleted();
            }
            if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                this.listener.onRewardedAdHidden();
            }
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoClosed() {
            FacebookMediationAdapter.this.log("Rewarded ad hidden");
            if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                if (this.hasGrantedReward || FacebookMediationAdapter.this.shouldAlwaysRewardUser()) {
                    MaxReward reward = FacebookMediationAdapter.this.getReward();
                    FacebookMediationAdapter.this.log("Rewarded user with reward: " + reward);
                    this.listener.onUserRewarded(reward);
                }
                this.listener.onRewardedAdHidden();
            }
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoCompleted() {
            FacebookMediationAdapter.this.log("Rewarded ad video completed");
            if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                this.listener.onRewardedAdVideoCompleted();
                this.hasGrantedReward = true;
            }
        }
    }

    public FacebookMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
        this.onInterstitialAdHiddenCalled = new AtomicBoolean();
        this.onRewardedAdVideoCompletedCalled = new AtomicBoolean();
        this.onRewardedAdHiddenCalled = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView createMaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        return AppLovinSdk.VERSION_CODE >= 11010000 ? new MaxNativeAdView(maxNativeAd, str, getApplicationContext()) : new MaxNativeAdView(maxNativeAd, str, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private String getMediationIdentifier() {
        StringBuilder sbA = defpackage.a.a("APPLOVIN_");
        sbA.append(AppLovinSdk.VERSION);
        sbA.append(":");
        sbA.append(getAdapterVersion());
        return sbA.toString();
    }

    private AdSize toAdSize(MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return AdSize.BANNER_HEIGHT_50;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return AdSize.BANNER_HEIGHT_90;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return AdSize.RECTANGLE_HEIGHT_250;
        }
        throw new IllegalArgumentException("Invalid ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    public static MaxAdapterError toMaxError(AdError adError) {
        int errorCode = adError.getErrorCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        if (errorCode == 2006) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (errorCode == 2100) {
            maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
        } else if (errorCode == 9001) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (errorCode == 2008) {
            maxAdapterError = MaxAdapterError.SERVER_ERROR;
        } else if (errorCode != 2009) {
            switch (errorCode) {
                case 1000:
                    maxAdapterError = MaxAdapterError.NO_CONNECTION;
                    break;
                case 1001:
                    maxAdapterError = MaxAdapterError.NO_FILL;
                    break;
                default:
                    switch (errorCode) {
                        case 2000:
                            maxAdapterError = MaxAdapterError.SERVER_ERROR;
                            break;
                        case AdError.INTERNAL_ERROR_CODE /* 2001 */:
                            maxAdapterError = MaxAdapterError.TIMEOUT;
                            break;
                        case AdError.CACHE_ERROR_CODE /* 2002 */:
                            break;
                        case AdError.INTERNAL_ERROR_2003 /* 2003 */:
                        case AdError.INTERNAL_ERROR_2004 /* 2004 */:
                            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                            break;
                        default:
                            switch (errorCode) {
                                case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                    maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets");
                                    break;
                                default:
                                    switch (errorCode) {
                                        case AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED /* 7003 */:
                                            maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                                            break;
                                        case AdError.MISSING_DEPENDENCIES_ERROR /* 7005 */:
                                        case AdError.API_NOT_SUPPORTED /* 7006 */:
                                            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                case 1002:
                    maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                    break;
            }
        } else {
            maxAdapterError = MaxAdapterError.TIMEOUT;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), errorCode, adError.getErrorMessage());
    }

    private void updateAdSettings(MaxAdapterParameters maxAdapterParameters) {
        Bundle serverParameters = maxAdapterParameters.getServerParameters();
        if (serverParameters.containsKey("video_autoplay")) {
            AdSettings.setVideoAutoplay(serverParameters.getBoolean("video_autoplay"));
        }
        Boolean boolIsAgeRestrictedUser = maxAdapterParameters.isAgeRestrictedUser();
        if (boolIsAgeRestrictedUser != null) {
            AdSettings.setMixedAudience(boolIsAgeRestrictedUser.booleanValue());
        }
        String string = serverParameters.getString("test_device_ids", null);
        if (!TextUtils.isEmpty(string)) {
            AdSettings.addTestDevices(Arrays.asList(string.split(",")));
        }
        AdSettings.setMediationService(getMediationIdentifier());
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        updateAdSettings(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(BidderTokenProvider.getBidderToken(getContext(activity)));
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return getVersionString(com.facebook.ads.BuildConfig.class, CoreConstants.VERSION_NAME_KEY);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        updateAdSettings(maxAdapterInitializationParameters);
        if (!INITIALIZED.compareAndSet(false, true)) {
            log("Facebook attempted initialization already - marking initialization as completed");
            onCompletionListener.onCompletion(sStatus, null);
            return;
        }
        sStatus = MaxAdapter.InitializationStatus.INITIALIZING;
        ArrayList<String> stringArrayList = maxAdapterInitializationParameters.getServerParameters().getStringArrayList("placement_ids");
        AudienceNetworkAds.InitListener initListener = new AudienceNetworkAds.InitListener() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.1
            @Override // com.facebook.ads.AudienceNetworkAds.InitListener
            public void onInitialized(AudienceNetworkAds.InitResult initResult) {
                if (initResult.isSuccess()) {
                    FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                    StringBuilder sbA = defpackage.a.a("Facebook SDK successfully finished initialization: ");
                    sbA.append(initResult.getMessage());
                    facebookMediationAdapter.log(sbA.toString());
                    MaxAdapter.InitializationStatus unused = FacebookMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    onCompletionListener.onCompletion(FacebookMediationAdapter.sStatus, null);
                    return;
                }
                FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                StringBuilder sbA2 = defpackage.a.a("Facebook SDK failed to finished initialization: ");
                sbA2.append(initResult.getMessage());
                facebookMediationAdapter2.log(sbA2.toString());
                MaxAdapter.InitializationStatus unused2 = FacebookMediationAdapter.sStatus = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                onCompletionListener.onCompletion(FacebookMediationAdapter.sStatus, initResult.getMessage());
            }
        };
        if (maxAdapterInitializationParameters.isTesting()) {
            AdSettings.setDebugBuild(true);
        }
        log("Initializing Facebook SDK with placements: " + stringArrayList);
        AudienceNetworkAds.buildInitSettings(getContext(activity)).withMediationService(getMediationIdentifier()).withPlacementIds(stringArrayList).withInitListener(initListener).initialize();
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        boolean z10 = maxAdapterResponseParameters.getServerParameters().getBoolean("is_native");
        StringBuilder sbA = defpackage.a.a("Loading");
        sbA.append(z10 ? " native " : " ");
        sbA.append(maxAdFormat.getLabel());
        sbA.append(" ad: ");
        sbA.append(thirdPartyAdPlacementId);
        sbA.append("...");
        log(sbA.toString());
        updateAdSettings(maxAdapterResponseParameters);
        if (z10) {
            NativeAd nativeAd = new NativeAd(getContext(activity), thirdPartyAdPlacementId);
            this.mNativeAd = nativeAd;
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdViewListener(maxAdapterResponseParameters.getServerParameters(), maxAdFormat, activity, maxAdViewAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            AdView adView = new AdView(getContext(activity), thirdPartyAdPlacementId, toAdSize(maxAdFormat));
            this.mAdView = adView;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(new AdViewListener(maxAdFormat, maxAdViewAdapterListener)).withBid(maxAdapterResponseParameters.getBidResponse()).build());
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading interstitial ad: " + thirdPartyAdPlacementId + "...");
        updateAdSettings(maxAdapterResponseParameters);
        InterstitialAd interstitialAd = new InterstitialAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mInterstitialAd = interstitialAd;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithAdListener = interstitialAd.buildLoadAdConfig().withAdListener(new InterstitialAdListener(maxInterstitialAdapterListener));
        if (!this.mInterstitialAd.isAdLoaded() || this.mInterstitialAd.isAdInvalidated()) {
            log("Loading bidding interstitial ad...");
            this.mInterstitialAd.loadAd(interstitialAdLoadConfigBuilderWithAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            log("An interstitial ad has been loaded already");
            maxInterstitialAdapterListener.onInterstitialAdLoaded();
        }
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        NativeAdBase.NativeAdLoadConfigBuilder nativeAdLoadConfigBuilderBuildLoadAdConfig;
        MaxNativeAdListener maxNativeAdListener;
        NativeAdBase nativeAdBase;
        boolean z10 = BundleUtils.getBoolean("is_native_banner", maxAdapterResponseParameters.getServerParameters());
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log(w0.a.a(defpackage.a.a("Loading native "), z10 ? "banner " : "", "ad: ", thirdPartyAdPlacementId, "..."));
        updateAdSettings(maxAdapterResponseParameters);
        Context context = getContext(activity);
        if (z10) {
            NativeBannerAd nativeBannerAd = new NativeBannerAd(context, thirdPartyAdPlacementId);
            this.mNativeBannerAd = nativeBannerAd;
            nativeAdLoadConfigBuilderBuildLoadAdConfig = nativeBannerAd.buildLoadAdConfig();
            maxNativeAdListener = new MaxNativeAdListener(maxAdapterResponseParameters.getServerParameters(), context, maxNativeAdAdapterListener);
            nativeAdBase = nativeBannerAd;
        } else {
            NativeAd nativeAd = new NativeAd(context, thirdPartyAdPlacementId);
            this.mNativeAd = nativeAd;
            nativeAdLoadConfigBuilderBuildLoadAdConfig = nativeAd.buildLoadAdConfig();
            maxNativeAdListener = new MaxNativeAdListener(maxAdapterResponseParameters.getServerParameters(), context, maxNativeAdAdapterListener);
            nativeAdBase = nativeAd;
        }
        nativeAdBase.loadAd(nativeAdLoadConfigBuilderBuildLoadAdConfig.withAdListener(maxNativeAdListener).withBid(maxAdapterResponseParameters.getBidResponse()).build());
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded: " + thirdPartyAdPlacementId + "...");
        updateAdSettings(maxAdapterResponseParameters);
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mRewardedVideoAd = rewardedVideoAd;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder rewardedVideoAdLoadConfigBuilderWithAdListener = rewardedVideoAd.buildLoadAdConfig().withAdListener(new RewardedAdListener(maxRewardedAdapterListener));
        if (!this.mRewardedVideoAd.isAdLoaded() || this.mRewardedVideoAd.isAdInvalidated()) {
            log("Loading bidding rewarded ad...");
            this.mRewardedVideoAd.loadAd(rewardedVideoAdLoadConfigBuilderWithAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            log("A rewarded ad has been loaded already");
            maxRewardedAdapterListener.onRewardedAdLoaded();
        }
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void loadRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        final String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
        log("Loading rewarded interstitial: " + thirdPartyAdPlacementId + "...");
        updateAdSettings(maxAdapterResponseParameters);
        RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(activity.getApplicationContext(), thirdPartyAdPlacementId);
        this.mRewardedInterAd = rewardedVideoAd;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder rewardedVideoAdLoadConfigBuilderWithAdListener = rewardedVideoAd.buildLoadAdConfig().withAdExperience(AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL).withAdListener(new RewardedVideoAdExtendedListener() { // from class: com.applovin.mediation.adapters.FacebookMediationAdapter.2
            private boolean hasGrantedReward;

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad2) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Rewarded interstitial ad clicked: ");
                sbA.append(thirdPartyAdPlacementId);
                facebookMediationAdapter.log(sbA.toString());
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdClicked();
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad2) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Rewarded interstitial ad loaded: ");
                sbA.append(thirdPartyAdPlacementId);
                facebookMediationAdapter.log(sbA.toString());
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoaded();
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad2, AdError adError) {
                MaxAdapterError maxError = FacebookMediationAdapter.toMaxError(adError);
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Rewarded interstitial ad (");
                sbA.append(thirdPartyAdPlacementId);
                sbA.append(") failed to load with error: ");
                sbA.append(maxError);
                facebookMediationAdapter.log(sbA.toString());
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoadFailed(maxError);
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad2) {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Rewarded interstitial ad logging impression: ");
                sbA.append(thirdPartyAdPlacementId);
                facebookMediationAdapter.log(sbA.toString());
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdDisplayed();
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdVideoStarted();
            }

            @Override // com.facebook.ads.RewardedVideoAdExtendedListener
            public void onRewardedVideoActivityDestroyed() {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Rewarded interstitial ad Activity destroyed: ");
                sbA.append(thirdPartyAdPlacementId);
                facebookMediationAdapter.log(sbA.toString());
                if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdVideoCompleted();
                }
                if (FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdHidden();
                }
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public void onRewardedVideoClosed() {
                if (!FacebookMediationAdapter.this.onRewardedAdHiddenCalled.compareAndSet(false, true)) {
                    FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                    StringBuilder sbA = defpackage.a.a("Rewarded interstitial ad hidden: ");
                    sbA.append(thirdPartyAdPlacementId);
                    facebookMediationAdapter.log(sbA.toString());
                    return;
                }
                if (this.hasGrantedReward || FacebookMediationAdapter.this.shouldAlwaysRewardUser()) {
                    MaxReward reward = FacebookMediationAdapter.this.getReward();
                    FacebookMediationAdapter.this.log("Rewarded user with reward: " + reward);
                    maxRewardedInterstitialAdapterListener.onUserRewarded(reward);
                }
                FacebookMediationAdapter facebookMediationAdapter2 = FacebookMediationAdapter.this;
                StringBuilder sbA2 = defpackage.a.a("Rewarded interstitial ad hidden: ");
                sbA2.append(thirdPartyAdPlacementId);
                facebookMediationAdapter2.log(sbA2.toString());
                maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdHidden();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public void onRewardedVideoCompleted() {
                FacebookMediationAdapter facebookMediationAdapter = FacebookMediationAdapter.this;
                StringBuilder sbA = defpackage.a.a("Rewarded interstitial ad video completed: ");
                sbA.append(thirdPartyAdPlacementId);
                facebookMediationAdapter.log(sbA.toString());
                if (FacebookMediationAdapter.this.onRewardedAdVideoCompletedCalled.compareAndSet(false, true)) {
                    maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdVideoCompleted();
                    this.hasGrantedReward = true;
                }
            }
        });
        if (!this.mRewardedInterAd.isAdLoaded() || this.mRewardedInterAd.isAdInvalidated()) {
            log("Loading bidding rewarded interstitial ad...");
            this.mRewardedInterAd.loadAd(rewardedVideoAdLoadConfigBuilderWithAdListener.withBid(maxAdapterResponseParameters.getBidResponse()).build());
        } else {
            log("A rewarded interstitial ad has been loaded already");
            maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdLoaded();
        }
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
            this.mInterstitialAd = null;
        }
        RewardedVideoAd rewardedVideoAd = this.mRewardedVideoAd;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
            this.mRewardedVideoAd = null;
        }
        RewardedVideoAd rewardedVideoAd2 = this.mRewardedInterAd;
        if (rewardedVideoAd2 != null) {
            rewardedVideoAd2.destroy();
            this.mRewardedInterAd = null;
        }
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
            this.mAdView = null;
        }
        NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.mNativeAd.destroy();
            this.mNativeAd = null;
        }
        NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
            this.mNativeBannerAd.destroy();
            this.mNativeBannerAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        MaxAdapterError maxAdapterError;
        StringBuilder sbA = defpackage.a.a("Showing interstitial ad: ");
        sbA.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        sbA.append("...");
        log(sbA.toString());
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd == null || !interstitialAd.isAdLoaded()) {
            log("Unable to show interstitial - no ad loaded...");
            maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Interstitial ad not ready");
        } else if (!this.mInterstitialAd.isAdInvalidated()) {
            this.mInterstitialAd.show();
            return;
        } else {
            log("Unable to show interstitial - ad expired...");
            maxAdapterError = MaxAdapterError.AD_EXPIRED;
        }
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(maxAdapterError);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        MaxAdapterError maxAdapterError;
        StringBuilder sbA = defpackage.a.a("Showing rewarded ad: ");
        sbA.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        sbA.append("...");
        log(sbA.toString());
        RewardedVideoAd rewardedVideoAd = this.mRewardedVideoAd;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded()) {
            log("Unable to show rewarded ad - no ad loaded...");
            maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Rewarded ad not ready");
        } else if (!this.mRewardedVideoAd.isAdInvalidated()) {
            configureReward(maxAdapterResponseParameters);
            this.mRewardedVideoAd.show();
            return;
        } else {
            log("Unable to show rewarded ad - ad expired...");
            maxAdapterError = MaxAdapterError.AD_EXPIRED;
        }
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(maxAdapterError);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void showRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        MaxAdapterError maxAdapterError;
        StringBuilder sbA = defpackage.a.a("Showing rewarded interstitial ad: ");
        sbA.append(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        sbA.append("...");
        log(sbA.toString());
        RewardedVideoAd rewardedVideoAd = this.mRewardedInterAd;
        if (rewardedVideoAd == null || !rewardedVideoAd.isAdLoaded()) {
            log("Unable to show rewarded interstitial ad - no ad loaded...");
            maxAdapterError = new MaxAdapterError(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed", 0, "Rewarded Interstitial ad not ready");
        } else if (!this.mRewardedInterAd.isAdInvalidated()) {
            configureReward(maxAdapterResponseParameters);
            this.mRewardedInterAd.show();
            return;
        } else {
            log("Unable to show rewarded interstitial ad - ad expired...");
            maxAdapterError = MaxAdapterError.AD_EXPIRED;
        }
        maxRewardedInterstitialAdapterListener.onRewardedInterstitialAdDisplayFailed(maxAdapterError);
    }
}
