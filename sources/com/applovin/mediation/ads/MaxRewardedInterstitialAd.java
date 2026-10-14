package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class MaxRewardedInterstitialAd implements MaxFullscreenAdImpl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<Activity> f11480a = new WeakReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxFullscreenAdImpl f11481b;

    public MaxRewardedInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxRewardedInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxRewardedInterstitialAd", "MaxRewardedInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
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
        f11480a = new WeakReference<>(activity);
        this.f11481b = new MaxFullscreenAdImpl(str, MaxAdFormat.REWARDED_INTERSTITIAL, this, "MaxRewardedInterstitialAd", appLovinSdk.a());
    }

    public void destroy() {
        this.f11481b.logApiCall("destroy()");
        this.f11481b.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f11481b.logApiCall("getActivity()");
        return f11480a.get();
    }

    public boolean isReady() {
        boolean zIsReady = this.f11481b.isReady();
        this.f11481b.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f11481b.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f11481b.logApiCall("loadAd()");
        this.f11481b.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11481b.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11481b.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f11481b.logApiCall(q.a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f11481b.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f11481b.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f11481b.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f11481b.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11481b.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f11481b.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f11481b.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f11481b.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11481b.setRevenueListener(maxAdRevenueListener);
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
        this.f11481b.logApiCall(q.a("showAd(placement=", str, ", customData=", str2, ")"));
        this.f11481b.showAd(str, str2, getActivity());
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f11481b;
        StringBuilder sbA = q2.a.a("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbA.append(viewGroup);
        sbA.append(", lifecycle=");
        sbA.append(iVar);
        sbA.append(")");
        maxFullscreenAdImpl.logApiCall(sbA.toString());
        this.f11481b.showAd(str, str2, viewGroup, iVar, getActivity());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("");
        sbA.append(this.f11481b);
        return sbA.toString();
    }
}
