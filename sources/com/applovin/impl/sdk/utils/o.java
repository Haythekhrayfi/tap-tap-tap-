package com.applovin.impl.sdk.utils;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f11244a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f11245b = true;

    public static void a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.34
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdViewEventListener.adOpenedFullscreen(o.b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView, final AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdViewEventListener.adFailedToDisplay(o.b(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
                }
            }
        });
    }

    public static void a(final AppLovinNativeAdEventListener appLovinNativeAdEventListener, final AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.29
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinNativeAdEventListener.onNativeAdClicked(appLovinNativeAd);
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
                        o.d("nativeAdClicked", th);
                    }
                }
            });
        }
    }

    public static void a(final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, final AppLovinError appLovinError) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.28
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinNativeAdLoadListener.onNativeAdLoadFailed(appLovinError);
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
                        o.d("nativeAdLoadFailed", th);
                    }
                }
            });
        }
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd) {
        a(maxAdListener, maxAd, false, false);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        a(maxAdListener, maxAd, maxError, false);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError, boolean z10) {
        a(maxAdListener, maxAd, maxError, z10, false);
    }

    public static void a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxError maxError, final boolean z10, boolean z11) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.13
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxAdListener.onAdDisplayFailed(maxAd, maxError);
                    return;
                }
                try {
                    maxAdListener.onAdDisplayFailed(maxAd, maxError);
                } catch (Throwable th) {
                    o.b("onAdDisplayFailed", th, z10);
                    o.d("maxAdDisplayFailed", th);
                }
            }
        });
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        a(maxAdListener, maxAd, maxReward, false, false);
    }

    public static void a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxReward maxReward, final boolean z10, boolean z11) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.18
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
                    return;
                }
                try {
                    ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
                } catch (Throwable th) {
                    o.b("onUserRewarded", th, z10);
                    o.d("maxRewardedUser", th);
                }
            }
        });
    }

    public static void a(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.7
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxAdListener.onAdLoaded(maxAd);
                    return;
                }
                try {
                    maxAdListener.onAdLoaded(maxAd);
                } catch (Throwable th) {
                    o.b("onAdLoaded", th, z10);
                    o.d("maxAdLoaded", th);
                }
            }
        });
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        a(maxAdListener, str, maxError, false);
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError, boolean z10) {
        a(maxAdListener, str, maxError, z10, false);
    }

    public static void a(final MaxAdListener maxAdListener, final String str, final MaxError maxError, final boolean z10, boolean z11) {
        if (str == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.8
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxAdListener.onAdLoadFailed(str, maxError);
                    return;
                }
                try {
                    maxAdListener.onAdLoadFailed(str, maxError);
                } catch (Throwable th) {
                    o.b("onAdLoadFailed", th, z10);
                    o.d("maxAdLoadFailed", th);
                }
            }
        });
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str) {
        a(maxAdRequestListener, str, false, false);
    }

    public static void a(final MaxAdRequestListener maxAdRequestListener, final String str, final boolean z10, boolean z11) {
        if (str == null || maxAdRequestListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.15
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxAdRequestListener.onAdRequestStarted(str);
                    return;
                }
                try {
                    maxAdRequestListener.onAdRequestStarted(str);
                } catch (Throwable th) {
                    o.b("onAdRequestStarted", th, z10);
                    o.d("maxAdRequestStarted", th);
                }
            }
        });
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        a(maxAdRevenueListener, maxAd, false);
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd, boolean z10) {
        a(maxAdRevenueListener, maxAd, z10, false);
    }

    public static void a(final MaxAdRevenueListener maxAdRevenueListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || maxAdRevenueListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.14
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxAdRevenueListener.onAdRevenuePaid(maxAd);
                    return;
                }
                try {
                    maxAdRevenueListener.onAdRevenuePaid(maxAd);
                } catch (Throwable th) {
                    o.b("onAdRevenuePaid", th, z10);
                    o.d("maxAdPaidRevenue", th);
                }
            }
        });
    }

    public static void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        a(maxAdReviewListener, str, maxAd, false);
    }

    public static void a(final MaxAdReviewListener maxAdReviewListener, final String str, final MaxAd maxAd, boolean z10) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.30
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        maxAdReviewListener.onCreativeIdGenerated(str, maxAd);
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
                        o.d("adReviewCreativeIdGenerated", th);
                    }
                }
            });
        }
    }

    public static void a(final MaxNativeAdListener maxNativeAdListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.24
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxNativeAdListener.onNativeAdClicked(maxAd);
                    return;
                }
                try {
                    maxNativeAdListener.onNativeAdClicked(maxAd);
                } catch (Throwable th) {
                    o.b("onNativeAdClicked", th, z10);
                    o.d("maxNativeAdClicked", th);
                }
            }
        });
    }

    public static void a(final MaxNativeAdListener maxNativeAdListener, final MaxNativeAdView maxNativeAdView, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.21
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
                    return;
                }
                try {
                    maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
                } catch (Throwable th) {
                    o.b("onNativeAdLoaded", th, z10);
                    o.d("maxNativeAdLoaded", th);
                }
            }
        });
    }

    public static void a(final MaxNativeAdListener maxNativeAdListener, final String str, final MaxError maxError, final boolean z10, boolean z11) {
        if (str == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.22
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
                    return;
                }
                try {
                    maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
                } catch (Throwable th) {
                    o.b("onNativeAdLoadFailed", th, z10);
                    o.d("maxNativeAdLoadFailed", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdClickListener appLovinAdClickListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdClickListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.31
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdClickListener.adClicked(o.b(appLovinAd));
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                    o.d("adClicked", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdDisplayListener.adDisplayed(o.b(appLovinAd));
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                    o.d("adDisplayed", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final String str) {
        if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.h) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.1
                @Override // java.lang.Runnable
                public void run() {
                    ((com.applovin.impl.sdk.ad.h) appLovinAdDisplayListener).onAdDisplayFailed(str);
                }
            });
        }
    }

    public static void a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final int i10) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdRewardListener.validationRequestFailed(o.b(appLovinAd), i10);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdRewardListener.userRewardVerified(o.b(appLovinAd), map);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.32
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdVideoPlaybackListener.videoPlaybackBegan(o.b(appLovinAd));
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
                }
            }
        });
    }

    public static void a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd, final double d10, final boolean z10) {
        if (appLovinAd == null || appLovinAdVideoPlaybackListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.33
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdVideoPlaybackListener.videoPlaybackEnded(o.b(appLovinAd), d10, z10);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
                }
            }
        });
    }

    public static void a(final AppLovinPostbackListener appLovinPostbackListener, final String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.26
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinPostbackListener.onPostbackSuccess(str);
                    } catch (Throwable th) {
                        StringBuilder sbA = defpackage.a.a("Unable to notify AppLovinPostbackListener about postback URL (");
                        sbA.append(str);
                        sbA.append(") executed");
                        com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", sbA.toString(), th);
                    }
                }
            });
        }
    }

    public static void a(final AppLovinPostbackListener appLovinPostbackListener, final String str, final int i10) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.27
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        appLovinPostbackListener.onPostbackFailure(str, i10);
                    } catch (Throwable th) {
                        StringBuilder sbA = defpackage.a.a("Unable to notify AppLovinPostbackListener about postback URL (");
                        sbA.append(str);
                        sbA.append(") failing to execute with error code (");
                        sbA.append(i10);
                        sbA.append("):");
                        com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", sbA.toString(), th);
                    }
                }
            });
        }
    }

    public static void a(boolean z10) {
        f11244a = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AppLovinAd b(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    public static void b(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.35
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdViewEventListener.adClosedFullscreen(o.b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
                }
            }
        });
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd) {
        b(maxAdListener, maxAd, false, false);
    }

    public static void b(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.9
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxAdListener.onAdDisplayed(maxAd);
                    return;
                }
                try {
                    maxAdListener.onAdDisplayed(maxAd);
                } catch (Throwable th) {
                    o.b("onAdDisplayed", th, z10);
                    o.d("maxAdDisplayed", th);
                }
            }
        });
    }

    public static void b(final MaxNativeAdListener maxNativeAdListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || maxNativeAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.25
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxNativeAdListener.onNativeAdExpired(maxAd);
                    return;
                }
                try {
                    maxNativeAdListener.onNativeAdExpired(maxAd);
                } catch (Throwable th) {
                    o.b("onNativeAdExpired", th, z10);
                    o.d("maxNativeAdExpired", th);
                }
            }
        });
    }

    public static void b(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd == null || appLovinAdDisplayListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.23
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdDisplayListener.adHidden(o.b(appLovinAd));
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                    o.d("adHidden", th);
                }
            }
        });
    }

    public static void b(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdRewardListener.userOverQuota(o.b(appLovinAd), map);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
                }
            }
        });
    }

    private static void b(String str, Throwable th) {
        com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Error in publisher callback '" + str + "'", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Throwable th, boolean z10) {
        if (z10) {
            b(str, th);
        } else {
            c(str, th);
        }
    }

    public static void b(boolean z10) {
        f11245b = z10;
    }

    public static void c(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd == null || appLovinAdViewEventListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.36
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdViewEventListener.adLeftApplication(o.b(appLovinAd), appLovinAdView);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
                }
            }
        });
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd) {
        c(maxAdListener, maxAd, false, false);
    }

    public static void c(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.10
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxAdListener.onAdHidden(maxAd);
                    return;
                }
                try {
                    maxAdListener.onAdHidden(maxAd);
                } catch (Throwable th) {
                    o.b("onAdHidden", th, z10);
                    o.d("maxAdHidden", th);
                }
            }
        });
    }

    public static void c(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd == null || appLovinAdRewardListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.o.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    appLovinAdRewardListener.userRewardRejected(o.b(appLovinAd), map);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
                }
            }
        });
    }

    private static void c(String str, Throwable th) {
        com.applovin.impl.sdk.y.d("ListenerCallbackInvoker", "Error in internal callback '" + str + "'", th);
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd) {
        d(maxAdListener, maxAd, false, false);
    }

    public static void d(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || maxAdListener == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.11
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    maxAdListener.onAdClicked(maxAd);
                    return;
                }
                try {
                    maxAdListener.onAdClicked(maxAd);
                } catch (Throwable th) {
                    o.b("onAdClicked", th, z10);
                    o.d("maxAdClicked", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, Throwable th) {
        com.applovin.impl.sdk.o oVar = com.applovin.impl.sdk.o.f10977a;
        if (oVar != null) {
            oVar.ag().a("ListenerCallbackInvoker", str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(boolean z10) {
        return z10 ? f11244a : f11245b;
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd) {
        e(maxAdListener, maxAd, false, false);
    }

    public static void e(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.16
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
                    return;
                }
                try {
                    ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
                } catch (Throwable th) {
                    o.b("onRewardedVideoStarted", th, z10);
                }
            }
        });
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd) {
        f(maxAdListener, maxAd, false, false);
    }

    public static void f(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || !(maxAdListener instanceof MaxRewardedAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.17
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
                    return;
                }
                try {
                    ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
                } catch (Throwable th) {
                    o.b("onRewardedVideoCompleted", th, z10);
                }
            }
        });
    }

    public static void g(MaxAdListener maxAdListener, MaxAd maxAd) {
        g(maxAdListener, maxAd, false, false);
    }

    public static void g(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.19
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
                    return;
                }
                try {
                    ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
                } catch (Throwable th) {
                    o.b("onAdExpanded", th, z10);
                }
            }
        });
    }

    public static void h(MaxAdListener maxAdListener, MaxAd maxAd) {
        h(maxAdListener, maxAd, false, false);
    }

    public static void h(final MaxAdListener maxAdListener, final MaxAd maxAd, final boolean z10, boolean z11) {
        if (maxAd == null || !(maxAdListener instanceof MaxAdViewAdListener)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(z11, new Runnable() { // from class: com.applovin.impl.sdk.utils.o.20
            @Override // java.lang.Runnable
            public void run() {
                if (!o.d(z10)) {
                    ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
                    return;
                }
                try {
                    ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
                } catch (Throwable th) {
                    o.b("onAdCollapsed", th, z10);
                }
            }
        });
    }
}
