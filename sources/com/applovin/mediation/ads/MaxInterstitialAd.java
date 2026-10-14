package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.w;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<Activity> f11474a = new WeakReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxFullscreenAdImpl f11475b;

    public MaxInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        f11474a = new WeakReference<>(activity);
        this.f11475b = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a());
    }

    public void destroy() {
        this.f11475b.logApiCall("destroy()");
        this.f11475b.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f11475b.logApiCall("getActivity()");
        return f11474a.get();
    }

    public String getAdUnitId() {
        return this.f11475b.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f11475b.isReady();
        this.f11475b.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f11475b.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f11475b.logApiCall("loadAd()");
        this.f11475b.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11475b.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11475b.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f11475b.logApiCall(q.a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f11475b.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f11475b.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f11475b.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f11475b.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11475b.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f11475b.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f11475b.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f11475b.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11475b.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(ViewGroup viewGroup, i iVar) {
        showAd(null, viewGroup, iVar);
    }

    public void showAd(String str) {
        showAd(str, (String) null);
    }

    public void showAd(String str, ViewGroup viewGroup, i iVar) {
        showAd(str, null, viewGroup, iVar);
    }

    public void showAd(String str, String str2) {
        this.f11475b.logApiCall(q.a("showAd(placement=", str, ", customData=", str2, ")"));
        w.a(str2, "MaxInterstitialAd");
        this.f11475b.showAd(str, str2, getActivity());
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f11475b;
        StringBuilder sbA = q2.a.a("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbA.append(viewGroup);
        sbA.append(", lifecycle=");
        sbA.append(iVar);
        sbA.append(")");
        maxFullscreenAdImpl.logApiCall(sbA.toString());
        this.f11475b.showAd(str, str2, viewGroup, iVar, getActivity());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("");
        sbA.append(this.f11475b);
        return sbA.toString();
    }
}
