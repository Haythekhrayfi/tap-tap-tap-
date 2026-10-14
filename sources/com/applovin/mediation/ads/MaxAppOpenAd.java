package com.applovin.mediation.ads;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.w;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class MaxAppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f11473a;

    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context));
    }

    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        this.f11473a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a());
    }

    public void destroy() {
        this.f11473a.logApiCall("destroy()");
        this.f11473a.destroy();
    }

    public String getAdUnitId() {
        return this.f11473a.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f11473a.isReady();
        this.f11473a.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f11473a.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f11473a.logApiCall("loadAd()");
        this.f11473a.loadAd(null);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11473a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11473a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f11473a.logApiCall(q.a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f11473a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f11473a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f11473a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f11473a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11473a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f11473a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f11473a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f11473a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11473a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(String str) {
        showAd(str, null);
    }

    public void showAd(String str, String str2) {
        this.f11473a.logApiCall(q.a("showAd(placement=", str, ", customData=", str2, ")"));
        w.a(str2, "MaxAppOpenAd");
        this.f11473a.showAd(str, str2, null);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("");
        sbA.append(this.f11473a);
        return sbA.toString();
    }
}
