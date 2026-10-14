package com.applovin.impl.mediation.debugger.ui.a;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.w;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a implements com.applovin.impl.mediation.debugger.a.a.InterfaceC0128a, AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f9539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.a.a f9540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.a.e f9541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f9542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdView f9543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f9544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f9545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxRewardedInterstitialAd f9546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxRewardedAd f9547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MaxNativeAdView f9548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxNativeAdLoader f9549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaxAd f9550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f9551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f9552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ListView f9553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f9554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AdControlButton f9555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f9556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.a.a f9557s;

    private void a() {
        String strA = this.f9540b.a();
        if (this.f9540b.d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strA, this.f9540b.d(), this.f9539a.aA(), this);
            this.f9543e = maxAdView;
            maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, "false");
            this.f9543e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f9540b.d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strA, this.f9539a.aA(), this);
            this.f9544f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f9540b.d()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strA, this.f9539a.aA());
            this.f9545g = maxAppOpenAd;
            maxAppOpenAd.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f9540b.d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(strA, this.f9539a.aA(), this);
            this.f9546h = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f9540b.d()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strA, this.f9539a.aA(), this);
            this.f9547i = maxRewardedAd;
            maxRewardedAd.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f9540b.d()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strA, this.f9539a.aA(), this);
            this.f9549k = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1
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
                    if (a.this.f9550l != null) {
                        a.this.f9549k.destroy(a.this.f9550l);
                    }
                    a.this.f9550l = maxAd;
                    if (maxNativeAdView != null) {
                        a.this.f9548j = maxNativeAdView;
                    } else {
                        a aVar = a.this;
                        o unused = a.this.f9539a;
                        aVar.f9548j = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, o.au());
                        a.this.f9549k.render(a.this.f9548j, maxAd);
                    }
                    a.this.onAdLoaded(maxAd);
                }
            });
            this.f9549k.setRevenueListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f9543e.startAutoRefresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, DialogInterface dialogInterface) {
        if (viewGroup instanceof MaxAdView) {
            ((MaxAdView) viewGroup).stopAutoRefresh();
        }
        this.f9551m = null;
    }

    private void a(final ViewGroup viewGroup, AppLovinSdkUtils.Size size, DialogInterface.OnShowListener onShowListener) {
        if (this.f9551m != null) {
            return;
        }
        e eVar = new e(viewGroup, size, this);
        this.f9551m = eVar;
        eVar.setOnShowListener(onShowListener);
        this.f9551m.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f9599c.a(viewGroup, dialogInterface);
            }
        });
        this.f9551m.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.mediation.debugger.ui.d.c cVar, com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, o oVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(aVar, bVar, ((b.C0131b) cVar).i_(), oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(o oVar, com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, com.applovin.impl.mediation.debugger.ui.d.a aVar2, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
        if (cVar instanceof b.C0131b) {
            com.applovin.impl.sdk.utils.b.a(this, MaxDebuggerAdUnitDetailActivity.class, oVar.E(), new i(cVar, aVar, bVar, oVar));
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.f9541c != null) {
            this.f9539a.as().a(this.f9541c.a().a());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f9543e.setPlacement("[Mediation Debugger Live Ad]");
            this.f9543e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f9540b.d()) {
            this.f9544f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f9540b.d()) {
            this.f9545g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f9540b.d()) {
            this.f9546h.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f9540b.d()) {
            this.f9547i.loadAd();
        } else if (MaxAdFormat.NATIVE != this.f9540b.d()) {
            w.a("Live ads currently unavailable for ad format", this);
        } else {
            this.f9549k.setPlacement("[Mediation Debugger Live Ad]");
            this.f9549k.loadAd();
        }
    }

    private String b() {
        if (this.f9539a.as().a()) {
            return "Not supported while Test Mode is enabled";
        }
        return this.f9542d.b() != this.f9540b.e() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.f9543e, maxAdFormat.getSize(), new DialogInterface.OnShowListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.h
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f9601a.a(dialogInterface);
                }
            });
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f9540b.d()) {
            this.f9544f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f9540b.d()) {
            this.f9545g.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f9540b.d()) {
            this.f9546h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f9540b.d()) {
            this.f9547i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f9540b.d()) {
            a(this.f9548j, MaxAdFormat.MREC.getSize(), (DialogInterface.OnShowListener) null);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    public o getSdk() {
        return this.f9539a;
    }

    public void initialize(com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, com.applovin.impl.mediation.debugger.b.a.e eVar, o oVar) {
        List<?> listA;
        this.f9539a = oVar;
        this.f9540b = aVar;
        this.f9541c = eVar;
        this.f9552n = oVar.as().c();
        b bVar2 = new b(aVar, bVar, eVar, this);
        this.f9542d = bVar2;
        bVar2.a(new i(this, oVar, aVar, bVar));
        a();
        if (aVar.e().f()) {
            if ((eVar != null && !eVar.a().c().A()) || (listA = oVar.ap().a(aVar.a())) == null || listA.isEmpty()) {
                return;
            }
            this.f9557s = new com.applovin.impl.mediation.debugger.a.a(listA, aVar.d(), this);
        }
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
        this.f9555q.setControlState(AdControlButton.b.LOAD);
        this.f9556r.setText("");
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
        if (maxAdFormat.isAdViewAd()) {
            this.f9543e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9544f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9545g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f9546h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9547i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9549k.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f9555q.setControlState(AdControlButton.b.LOAD);
        this.f9556r.setText("");
        if (204 == maxError.getCode()) {
            w.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        StringBuilder sbA = defpackage.a.a("Failed to load with error code: ");
        sbA.append(maxError.getCode());
        w.a("", sbA.toString(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f9556r.setText(maxAd.getNetworkName() + " ad loaded");
        this.f9555q.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f9543e, maxAd.getFormat().getSize(), (DialogInterface.OnShowListener) null);
        } else if (MaxAdFormat.NATIVE == this.f9540b.d()) {
            a(this.f9548j, MaxAdFormat.MREC.getSize(), (DialogInterface.OnShowListener) null);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.a.a.InterfaceC0128a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f9543e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9544f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9545g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f9546h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9547i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9549k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        w.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        String str;
        if (this.f9539a.as().a()) {
            str = "Ad loads are not supported while Test Mode is enabled. Please restart the app.";
        } else {
            if (this.f9542d.b() == this.f9540b.e()) {
                MaxAdFormat maxAdFormatD = this.f9540b.d();
                AdControlButton.b bVar = AdControlButton.b.LOAD;
                if (bVar == adControlButton.getControlState()) {
                    adControlButton.setControlState(AdControlButton.b.LOADING);
                    com.applovin.impl.mediation.debugger.a.a aVar = this.f9557s;
                    if (aVar != null) {
                        aVar.a();
                        return;
                    } else {
                        a(maxAdFormatD);
                        return;
                    }
                }
                if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                    if (!maxAdFormatD.isAdViewAd() && maxAdFormatD != MaxAdFormat.NATIVE) {
                        adControlButton.setControlState(bVar);
                    }
                    b(maxAdFormatD);
                    return;
                }
                return;
            }
            str = "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.";
        }
        w.a("Not Supported", str, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f9542d.a());
        this.f9553o = (ListView) findViewById(R.id.listView);
        this.f9554p = findViewById(R.id.ad_presenter_view);
        this.f9555q = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f9556r = (TextView) findViewById(R.id.status_textview);
        this.f9553o.setAdapter((ListAdapter) this.f9542d);
        this.f9556r.setText(b());
        this.f9556r.setTypeface(Typeface.DEFAULT_BOLD);
        this.f9555q.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f9554p.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        if (this.f9541c != null) {
            this.f9539a.as().a(this.f9552n);
        }
        MaxAdView maxAdView = this.f9543e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f9544f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f9545g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f9546h;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f9547i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f9549k;
        if (maxNativeAdLoader == null || (maxAd = this.f9550l) == null) {
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
