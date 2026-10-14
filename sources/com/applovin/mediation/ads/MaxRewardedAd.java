package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.w;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, MaxRewardedAd> f11476a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f11477b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static WeakReference<Activity> f11478c = new WeakReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MaxFullscreenAdImpl f11479d;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk) {
        this.f11479d = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a());
    }

    public static MaxRewardedAd getInstance(String str, Activity activity) {
        return getInstance(str, AppLovinSdk.getInstance(activity), activity);
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
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
        updateActivity(activity);
        synchronized (f11477b) {
            Map<String, MaxRewardedAd> map = f11476a;
            MaxRewardedAd maxRewardedAd = map.get(str);
            if (maxRewardedAd != null) {
                return maxRewardedAd;
            }
            MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk);
            map.put(str, maxRewardedAd2);
            return maxRewardedAd2;
        }
    }

    public static void updateActivity(Activity activity) {
        a.logApiCall("MaxRewardedAd", "updateActivity(activity=" + activity + ")");
        if (activity != null) {
            f11478c = new WeakReference<>(activity);
        }
    }

    public void destroy() {
        this.f11479d.logApiCall("destroy()");
        synchronized (f11477b) {
            f11476a.remove(this.f11479d.getAdUnitId());
        }
        this.f11479d.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f11479d.logApiCall("getActivity()");
        return f11478c.get();
    }

    public String getAdUnitId() {
        return this.f11479d.getAdUnitId();
    }

    public boolean isReady() {
        boolean zIsReady = this.f11479d.isReady();
        this.f11479d.logApiCall("isReady() " + zIsReady + " for ad unit id " + this.f11479d.getAdUnitId());
        return zIsReady;
    }

    public void loadAd() {
        this.f11479d.logApiCall("loadAd()");
        this.f11479d.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11479d.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11479d.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f11479d.logApiCall(q.a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f11479d.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        this.f11479d.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f11479d.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f11479d.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11479d.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f11479d.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f11479d.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f11479d.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11479d.setRevenueListener(maxAdRevenueListener);
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
        this.f11479d.logApiCall(q.a("showAd(placement=", str, ", customData=", str2, ")"));
        w.a(str2, "MaxRewardedAd");
        this.f11479d.showAd(str, str2, getActivity());
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f11479d;
        StringBuilder sbA = q2.a.a("showAd(placement=", str, ", customData=", str2, ", containerView=");
        sbA.append(viewGroup);
        sbA.append(", lifecycle=");
        sbA.append(iVar);
        sbA.append(")");
        maxFullscreenAdImpl.logApiCall(sbA.toString());
        this.f11479d.showAd(str, str2, viewGroup, iVar, getActivity());
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("");
        sbA.append(this.f11479d);
        return sbA.toString();
    }
}
