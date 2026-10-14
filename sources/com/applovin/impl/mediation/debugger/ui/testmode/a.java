package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import i.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements com.applovin.impl.mediation.debugger.a.a.InterfaceC0128a, AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.c.b f9803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f9804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaxAdView f9805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaxAdView f9806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f9807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f9808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxRewardedInterstitialAd f9809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f9810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxAd f9811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f9812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f9813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f9814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdControlButton f9815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdControlButton f9816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AdControlButton f9817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f9818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AdControlButton f9819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdControlButton f9820r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AdControlButton f9821s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Button f9822t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Button f9823u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private FrameLayout f9824v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private FrameLayout f9825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> f9826x;

    private AdControlButton a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f9815m;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f9816n;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f9817o;
        }
        if (str.equals("test_mode_app_open")) {
            return this.f9818p;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.f9819q;
        }
        if (str.equals(this.f9814l)) {
            return this.f9820r;
        }
        if (str.equals("test_mode_native")) {
            return this.f9821s;
        }
        throw new IllegalArgumentException(f.a("Invalid test mode ad unit identifier provided ", str));
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (!this.f9803a.p().contains(maxAdFormat)) {
            findViewById(R.id.banner_control_view).setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f9804b.aA(), this);
        this.f9805c = maxAdView;
        maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, "false");
        this.f9805c.setListener(this);
        frameLayout.addView(this.f9805c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
        this.f9815m = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9815m.setFormat(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        this.f9804b.as().a(getTestModeNetwork(maxAdFormat));
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f9805c;
        } else {
            if (MaxAdFormat.MREC != maxAdFormat) {
                if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                    this.f9807e.loadAd();
                    return;
                }
                if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                    this.f9808f.loadAd();
                    return;
                }
                if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                    this.f9809g.loadAd();
                    return;
                } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                    this.f9810h.loadAd();
                    return;
                } else {
                    if (MaxAdFormat.NATIVE == maxAdFormat) {
                        this.f9812j.loadAd();
                        return;
                    }
                    return;
                }
            }
            maxAdView = this.f9806d;
        }
        maxAdView.loadAd();
    }

    private void b() {
        this.f9824v = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List<MaxAdFormat> listP = this.f9803a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (!listP.contains(maxAdFormat)) {
            findViewById(R.id.mrec_control_view).setVisibility(8);
            this.f9824v.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f9804b.aA(), this);
        this.f9806d = maxAdView;
        maxAdView.setListener(this);
        this.f9824v.addView(this.f9806d, new FrameLayout.LayoutParams(-1, -1));
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
        this.f9816n = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9816n.setFormat(maxAdFormat);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9807e.showAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9808f.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f9809g.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9810h.showAd();
        }
    }

    private void c() {
        List<MaxAdFormat> listP = this.f9803a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (!listP.contains(maxAdFormat)) {
            findViewById(R.id.interstitial_control_view).setVisibility(8);
            return;
        }
        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f9804b.aA(), this);
        this.f9807e = maxInterstitialAd;
        maxInterstitialAd.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
        this.f9817o = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9817o.setFormat(maxAdFormat);
    }

    private void d() {
        List<MaxAdFormat> listP = this.f9803a.p();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listP.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        StringBuilder sbA = defpackage.a.a("test_mode_rewarded_");
        sbA.append(this.f9803a.h());
        String string = sbA.toString();
        this.f9814l = string;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(string, this.f9804b.aA(), this);
        this.f9810h = maxRewardedAd;
        maxRewardedAd.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f9820r = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9820r.setFormat(maxAdFormat);
    }

    private void e() {
        this.f9825w = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (!this.f9803a.q()) {
            findViewById(R.id.native_control_view).setVisibility(8);
            this.f9825w.setVisibility(8);
            return;
        }
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f9804b.aA(), this);
        this.f9812j = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.3
            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdClicked(MaxAd maxAd) {
                a.this.onAdClicked(maxAd);
            }

            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdLoadFailed(String str, MaxError maxError) {
                a.this.onAdLoadFailed(str, maxError);
            }

            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                if (a.this.f9811i != null) {
                    a.this.f9812j.destroy(a.this.f9811i);
                }
                a.this.f9811i = maxAd;
                a.this.f9825w.removeAllViews();
                a.this.f9825w.addView(maxNativeAdView);
                a.this.onAdLoaded(maxAd);
            }
        });
        this.f9812j.setRevenueListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
        this.f9821s = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9821s.setFormat(MaxAdFormat.NATIVE);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        return this.f9804b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f9803a.v() == null || !this.f9803a.v().containsKey(maxAdFormat)) ? this.f9803a.h() : this.f9803a.v().get(maxAdFormat);
    }

    public void initialize(com.applovin.impl.mediation.debugger.b.c.b bVar) {
        this.f9803a = bVar;
        this.f9804b = bVar.y();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        w.a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        w.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        String str = "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage();
        StringBuilder sbA = defpackage.a.a("Failed to display ");
        sbA.append(maxAd.getFormat().getDisplayName());
        w.a(sbA.toString(), str, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        w.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        w.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        w.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0128a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                maxAdView = this.f9806d;
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f9807e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f9808f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f9809g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f9810h.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f9812j.setLocalExtraParameter("amazon_ad_error", adError);
            }
            a(maxAdFormat);
        }
        maxAdView = this.f9805c;
        maxAdView.setLocalExtraParameter("amazon_ad_error", adError);
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        w.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        a(maxAd.getAdUnitId()).setControlState((maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) ? AdControlButton.b.LOAD : AdControlButton.b.SHOW);
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0128a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                maxAdView = this.f9806d;
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f9807e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f9808f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f9809g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f9810h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f9812j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
            a(maxAdFormat);
        }
        maxAdView = this.f9805c;
        maxAdView.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        w.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> map = this.f9826x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            this.f9826x.get(format).a();
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f9803a == null) {
            y.j("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f9803a.i() + " Test Ads");
        this.f9813k = this.f9804b.as().c();
        a();
        b();
        c();
        d();
        e();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f9822t = (Button) findViewById(R.id.show_mrec_button);
        this.f9823u = (Button) findViewById(R.id.show_native_button);
        if (this.f9803a.q() && this.f9803a.p().contains(MaxAdFormat.MREC)) {
            this.f9825w.setVisibility(8);
            this.f9822t.setBackgroundColor(-1);
            this.f9823u.setBackgroundColor(-3355444);
            this.f9822t.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.f9824v.setVisibility(0);
                    a.this.f9825w.setVisibility(8);
                    a.this.f9822t.setBackgroundColor(-1);
                    a.this.f9823u.setBackgroundColor(-3355444);
                }
            });
            this.f9823u.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    a.this.f9825w.setVisibility(0);
                    a.this.f9824v.setVisibility(8);
                    a.this.f9823u.setBackgroundColor(-1);
                    a.this.f9822t.setBackgroundColor(-3355444);
                }
            });
        } else {
            this.f9822t.setVisibility(8);
            this.f9823u.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f9803a.B()) && this.f9803a.C() != null && this.f9803a.C().size() > 0) {
            AdRegistration.getInstance(this.f9803a.B(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap map = new HashMap(this.f9803a.C().size());
            for (MaxAdFormat maxAdFormat : this.f9803a.C().keySet()) {
                map.put(maxAdFormat, new com.applovin.impl.mediation.debugger.a.a(this.f9803a.C().get(maxAdFormat), maxAdFormat, this));
            }
            this.f9826x = map;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            y.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f9804b.as().a(this.f9813k);
        MaxAdView maxAdView = this.f9805c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f9806d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f9807e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f9810h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f9812j;
        if (maxNativeAdLoader == null || (maxAd = this.f9811i) == null) {
            return;
        }
        maxNativeAdLoader.destroy(maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        w.a("onRewardedVideoCompleted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        w.a("onRewardedVideoStarted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        w.a("onUserRewarded", maxAd, this);
    }
}
