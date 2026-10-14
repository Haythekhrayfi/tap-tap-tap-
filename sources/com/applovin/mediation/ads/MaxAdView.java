package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.c;
import com.applovin.impl.sdk.utils.x;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f11470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f11471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11472c;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String strA = c.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String strA2 = c.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        MaxAdFormat fromString = StringUtils.isValidString(strA2) ? MaxAdFormat.formatFromString(strA2) : c.a(context);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strA == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (isInEditMode()) {
            a(context);
        } else {
            a(strA, fromString, attributeIntValue, AppLovinSdk.getInstance(context), context);
        }
    }

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, c.a(context), appLovinSdk, context);
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i10, AppLovinSdk appLovinSdk, Context context) {
        View view = new View(context.getApplicationContext());
        this.f11471b = view;
        view.setBackgroundColor(0);
        addView(this.f11471b);
        this.f11471b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f11472c = getVisibility();
        this.f11470a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f11471b, appLovinSdk.a(), context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f11470a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f11470a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f11470a.getAdUnitId();
    }

    public String getPlacement() {
        this.f11470a.logApiCall("getPlacement()");
        return this.f11470a.getPlacement();
    }

    public void loadAd() {
        this.f11470a.logApiCall("loadAd()");
        this.f11470a.loadAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (isInEditMode()) {
            return;
        }
        this.f11470a.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
        if (this.f11470a != null && x.a(this.f11472c, i10)) {
            this.f11470a.onWindowVisibilityChanged(i10);
        }
        this.f11472c = i10;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11470a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11470a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.f11470a.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f11471b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f11470a.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f11470a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i10);
        }
        View view = this.f11471b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        this.f11470a.logApiCall("setCustomData(value=" + str + ")");
        this.f11470a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f11470a.logApiCall(q.a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f11470a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f11470a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f11470a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f11470a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11470a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f11470a.logApiCall("setPlacement(placement=" + str + ")");
        this.f11470a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f11470a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f11470a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f11470a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11470a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f11470a.logApiCall("startAutoRefresh()");
        this.f11470a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f11470a.logApiCall("stopAutoRefresh()");
        this.f11470a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f11470a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }
}
