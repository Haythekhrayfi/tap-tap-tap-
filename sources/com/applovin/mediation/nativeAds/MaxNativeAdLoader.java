package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f11513a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f11513a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f11513a.logApiCall("a()");
        this.f11513a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f11513a.logApiCall("b()");
        this.f11513a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f11513a.logApiCall("destroy()");
        this.f11513a.destroy();
    }

    public void destroy(MaxAd maxAd) {
        this.f11513a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f11513a.destroy(maxAd);
    }

    public String getAdUnitId() {
        return this.f11513a.getAdUnitId();
    }

    public String getPlacement() {
        this.f11513a.logApiCall("getPlacement()");
        return this.f11513a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f11513a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f11513a.loadAd(maxNativeAdView);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f11513a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f11513a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11513a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11513a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f11513a.logApiCall("setCustomData(value=" + str + ")");
        this.f11513a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f11513a.logApiCall(q.a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f11513a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f11513a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11513a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f11513a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f11513a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f11513a.logApiCall("setPlacement(placement=" + str + ")");
        this.f11513a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f11513a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11513a.setRevenueListener(maxAdRevenueListener);
    }
}
