package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.adview.a0;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.ac;
import com.applovin.impl.sdk.ad;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.utils.x;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements ad.a, e.a, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxAdView f9062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f9064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f9065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.applovin.impl.mediation.a.b f9066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f9067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f9068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f9069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c f9070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e f9071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ac f9072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ad f9073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f9074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.applovin.impl.mediation.a.b f9075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f9076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f9077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f9078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f9079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f9080t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f9081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f9082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f9083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f9084x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f9085y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f9086z;

    public class a extends b {
        private a() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                y yVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MaxAdListener.onAdLoadFailed(adUnitId=");
                sb2.append(str);
                sb2.append(", error=");
                sb2.append(maxError);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sb2, MaxAdViewImpl.this.adListener, yVar2, str2);
            }
            o.a(MaxAdViewImpl.this.adListener, str, maxError, true, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f9080t) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sbA = defpackage.a.a("Precache ad with ad unit ID '");
                    sbA.append(MaxAdViewImpl.this.adUnitId);
                    sbA.append("' loaded after MaxAdView was destroyed. Destroying the ad.");
                    yVar2.b(str, sbA.toString());
                }
                MaxAdViewImpl.this.sdk.am().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
            bVar.e(MaxAdViewImpl.this.f9067g);
            bVar.f(MaxAdViewImpl.this.f9068h);
            if (bVar.w() == null) {
                MaxAdViewImpl.this.sdk.am().destroyAd(bVar);
                onAdLoadFailed(bVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            MaxAdViewImpl.this.a(bVar);
            if (bVar.L()) {
                long jM = bVar.M();
                MaxAdViewImpl.this.sdk.F();
                if (y.a()) {
                    y yVarF = MaxAdViewImpl.this.sdk.F();
                    String str2 = MaxAdViewImpl.this.tag;
                    StringBuilder sbA2 = i2.a.a("Scheduling banner ad refresh ", jM, " milliseconds from now for '");
                    sbA2.append(MaxAdViewImpl.this.adUnitId);
                    sbA2.append("'...");
                    yVarF.b(str2, sbA2.toString());
                }
                MaxAdViewImpl.this.f9071k.a(jM);
                if (MaxAdViewImpl.this.f9071k.f() || MaxAdViewImpl.this.f9077q) {
                    y yVar3 = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.b(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f9071k.d();
                }
            }
            y yVar4 = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                y yVar5 = maxAdViewImpl3.logger;
                String str3 = maxAdViewImpl3.tag;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MaxAdListener.onAdLoaded(ad=");
                sb2.append(maxAd);
                sb2.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sb2, MaxAdViewImpl.this.adListener, yVar5, str3);
            }
            o.a(MaxAdViewImpl.this.adListener, maxAd, true, true);
        }
    }

    public abstract class b implements com.applovin.impl.mediation.ads.a.InterfaceC0121a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9095a;

        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9075o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("MaxAdListener.onAdClicked(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    com.applovin.impl.mediation.ads.c.a(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                o.d(MaxAdViewImpl.this.adListener, maxAd, true, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9075o)) {
                if ((MaxAdViewImpl.this.f9075o.N() || MaxAdViewImpl.this.f9084x) && this.f9095a) {
                    this.f9095a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("MaxAdViewAdListener.onAdCollapsed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    com.applovin.impl.mediation.ads.c.a(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                o.h(MaxAdViewImpl.this.adListener, maxAd, true, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f9075o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("MaxAdListener.onAdDisplayFailed(ad=");
                    sb2.append(maxAd);
                    sb2.append(", error=");
                    sb2.append(maxError);
                    sb2.append("), listener=");
                    com.applovin.impl.mediation.ads.c.a(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                o.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9075o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("MaxAdListener.onAdDisplayed(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    com.applovin.impl.mediation.ads.c.a(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                o.b(MaxAdViewImpl.this.adListener, maxAd, true, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9075o)) {
                if ((MaxAdViewImpl.this.f9075o.N() || MaxAdViewImpl.this.f9084x) && !MaxAdViewImpl.this.f9071k.f()) {
                    this.f9095a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("MaxAdViewAdListener.onAdExpanded(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    com.applovin.impl.mediation.ads.c.a(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                o.g(MaxAdViewImpl.this.adListener, maxAd, true, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9075o)) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    y yVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("MaxAdListener.onAdHidden(ad=");
                    sb2.append(maxAd);
                    sb2.append("), listener=");
                    com.applovin.impl.mediation.ads.c.a(sb2, MaxAdViewImpl.this.adListener, yVar2, str);
                }
                o.c(MaxAdViewImpl.this.adListener, maxAd, true, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                y yVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sbA = androidx.activity.result.c.a("MaxAdRequestListener.onAdRequestStarted(adUnitId=", str, "), listener=");
                sbA.append(MaxAdViewImpl.this.requestListener);
                yVar2.b(str2, sbA.toString());
            }
            o.a(MaxAdViewImpl.this.requestListener, str, true, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.b(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            o.a(MaxAdViewImpl.this.revenueListener, maxAd, true, true);
        }
    }

    public class c extends b {
        private c() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            y yVar = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                y yVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                StringBuilder sbA = defpackage.a.a("Failed to precache ad for refresh with error code: ");
                sbA.append(maxError.getCode());
                yVar2.b(str2, sbA.toString());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f9080t) {
                y yVar = MaxAdViewImpl.this.logger;
                if (y.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Successfully pre-cached ad for refresh");
                }
                MaxAdViewImpl.this.a(maxAd);
                return;
            }
            y yVar2 = MaxAdViewImpl.this.logger;
            if (y.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                y yVar3 = maxAdViewImpl2.logger;
                String str = maxAdViewImpl2.tag;
                StringBuilder sbA = defpackage.a.a("Ad with ad unit ID '");
                sbA.append(MaxAdViewImpl.this.adUnitId);
                sbA.append("' loaded after MaxAdView was destroyed. Destroying the ad.");
                yVar3.b(str, sbA.toString());
            }
            MaxAdViewImpl.this.sdk.am().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, com.applovin.impl.sdk.o oVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", oVar);
        this.f9063c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f9065e = RecyclerView.FOREVER_NS;
        this.f9074n = new Object();
        this.f9075o = null;
        this.f9080t = false;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f9061a = context.getApplicationContext();
        this.f9062b = maxAdView;
        this.f9064d = view;
        this.f9069i = new a();
        this.f9070j = new c();
        this.f9071k = new e(oVar, this);
        this.f9072l = new ac(maxAdView, oVar);
        this.f9073m = new ad(maxAdView, oVar, this);
        oVar.aj().a(this);
        if (y.a()) {
            this.logger.b(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.mediation.a.b bVar;
        MaxAdView maxAdView = this.f9062b;
        if (maxAdView != null) {
            com.applovin.impl.sdk.utils.c.a(maxAdView, this.f9064d);
        }
        this.f9073m.a();
        synchronized (this.f9074n) {
            bVar = this.f9075o;
        }
        if (bVar != null) {
            this.sdk.am().destroyAd(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        if (!w.a(j10, ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.f10339x)).longValue()) || this.f9085y) {
            if (y.a()) {
                this.logger.b(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
            }
            this.f9076p = false;
            b();
            return;
        }
        if (y.a()) {
            y yVar = this.logger;
            String str = this.tag;
            StringBuilder sbA = defpackage.a.a("Undesired flags matched - current: ");
            sbA.append(Long.toBinaryString(j10));
            sbA.append(", undesired: ");
            sbA.append(Long.toBinaryString(j10));
            yVar.b(str, sbA.toString());
        }
        if (y.a()) {
            this.logger.b(this.tag, "Waiting for refresh timer to manually fire request");
        }
        this.f9076p = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, com.applovin.impl.mediation.a.b bVar) {
        int I = bVar.I();
        int iJ = bVar.J();
        int iDpToPx = I == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), I);
        int iDpToPx2 = iJ != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iJ) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (y.a()) {
                this.logger.b(this.tag, j1.e.a("Pinning ad view to MAX ad view with width: ", iDpToPx, " and height: ", iDpToPx2, "."));
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i10 : x.a(this.f9062b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i10);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.applovin.impl.mediation.a.b bVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2
            /* JADX WARN: Code duplicated, block: B:36:0x0111  */
            /* JADX WARN: Code duplicated, block: B:39:0x013f  */
            /* JADX WARN: Code duplicated, block: B:45:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            public void run() {
                View view;
                int i10;
                long jO;
                View viewW = bVar.w();
                String str = viewW == null ? "MaxAdView does not have a loaded ad view" : null;
                MaxAdView maxAdView = MaxAdViewImpl.this.f9062b;
                if (maxAdView == null) {
                    str = "MaxAdView does not have a parent view";
                }
                if (str != null) {
                    y yVar = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.logger.e(maxAdViewImpl.tag, str);
                    }
                    MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
                    y yVar2 = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        y yVar3 = maxAdViewImpl2.logger;
                        String str2 = maxAdViewImpl2.tag;
                        StringBuilder sbA = defpackage.a.a("MaxAdListener.onAdDisplayFailed(ad=");
                        sbA.append(bVar);
                        sbA.append(", error=");
                        sbA.append(maxErrorImpl);
                        sbA.append("), listener=");
                        com.applovin.impl.mediation.ads.c.a(sbA, MaxAdViewImpl.this.adListener, yVar3, str2);
                    }
                    o.a(MaxAdViewImpl.this.adListener, (MaxAd) bVar, (MaxError) maxErrorImpl, true);
                    MaxAdViewImpl.this.sdk.am().processAdDisplayErrorPostbackForUserError(maxErrorImpl, bVar);
                    return;
                }
                MaxAdViewImpl.this.a();
                MaxAdViewImpl.this.a((com.applovin.impl.mediation.a.a) bVar);
                if (bVar.X()) {
                    MaxAdViewImpl.this.f9073m.a(bVar);
                }
                maxAdView.setDescendantFocusability(393216);
                if (bVar.O() == RecyclerView.FOREVER_NS) {
                    if (MaxAdViewImpl.this.f9065e != RecyclerView.FOREVER_NS) {
                        view = MaxAdViewImpl.this.f9064d;
                        jO = MaxAdViewImpl.this.f9065e;
                    } else {
                        view = MaxAdViewImpl.this.f9064d;
                        i10 = 0;
                    }
                    view.setBackgroundColor(i10);
                    maxAdView.addView(viewW);
                    MaxAdViewImpl.this.a(viewW, bVar);
                    MaxAdViewImpl.this.sdk.ac().a(bVar);
                    MaxAdViewImpl.this.b(bVar);
                    synchronized (MaxAdViewImpl.this.f9074n) {
                        MaxAdViewImpl.this.f9075o = bVar;
                    }
                    y yVar4 = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                        maxAdViewImpl3.logger.b(maxAdViewImpl3.tag, "Scheduling impression for ad manually...");
                    }
                    MaxAdViewImpl.this.sdk.am().processRawAdImpressionPostback(bVar, MaxAdViewImpl.this.f9069i);
                    if (StringUtils.isValidString(MaxAdViewImpl.this.f9075o.getAdReviewCreativeId())) {
                        MaxAdViewImpl maxAdViewImpl4 = MaxAdViewImpl.this;
                        o.a(maxAdViewImpl4.adReviewListener, maxAdViewImpl4.f9075o.getAdReviewCreativeId(), (MaxAd) MaxAdViewImpl.this.f9075o, true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            long jA = MaxAdViewImpl.this.f9072l.a(bVar);
                            if (!bVar.X()) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                MaxAdViewImpl.this.a(bVar, jA);
                            }
                            MaxAdViewImpl.this.a(jA);
                        }
                    }, bVar.K());
                }
                view = MaxAdViewImpl.this.f9064d;
                jO = bVar.O();
                i10 = (int) jO;
                view.setBackgroundColor(i10);
                maxAdView.addView(viewW);
                MaxAdViewImpl.this.a(viewW, bVar);
                MaxAdViewImpl.this.sdk.ac().a(bVar);
                MaxAdViewImpl.this.b(bVar);
                synchronized (MaxAdViewImpl.this.f9074n) {
                    MaxAdViewImpl.this.f9075o = bVar;
                    y yVar5 = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl maxAdViewImpl5 = MaxAdViewImpl.this;
                        maxAdViewImpl5.logger.b(maxAdViewImpl5.tag, "Scheduling impression for ad manually...");
                    }
                    MaxAdViewImpl.this.sdk.am().processRawAdImpressionPostback(bVar, MaxAdViewImpl.this.f9069i);
                    if (StringUtils.isValidString(MaxAdViewImpl.this.f9075o.getAdReviewCreativeId())) {
                        MaxAdViewImpl maxAdViewImpl6 = MaxAdViewImpl.this;
                        o.a(maxAdViewImpl6.adReviewListener, maxAdViewImpl6.f9075o.getAdReviewCreativeId(), (MaxAd) MaxAdViewImpl.this.f9075o, true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            long jA = MaxAdViewImpl.this.f9072l.a(bVar);
                            if (!bVar.X()) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                MaxAdViewImpl.this.a(bVar, jA);
                            }
                            MaxAdViewImpl.this.a(jA);
                        }
                    }, bVar.K());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, long j10) {
        if (y.a()) {
            this.logger.b(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.am().processViewabilityAdImpressionPostback(bVar, j10, this.f9069i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final d.a aVar, final com.applovin.impl.mediation.ads.a.InterfaceC0121a interfaceC0121a) {
        if (e()) {
            y.j(this.tag, "Failed to load new ad - this instance is already destroyed");
        } else {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MaxAdViewImpl.this.f9075o != null) {
                        long jA = MaxAdViewImpl.this.f9072l.a(MaxAdViewImpl.this.f9075o);
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.extraParameters.put("visible_ad_ad_unit_id", maxAdViewImpl.f9075o.getAdUnitId());
                        MaxAdViewImpl.this.extraParameters.put("viewability_flags", Long.valueOf(jA));
                    } else {
                        MaxAdViewImpl.this.extraParameters.remove("visible_ad_ad_unit_id");
                        MaxAdViewImpl.this.extraParameters.remove("viewability_flags");
                    }
                    int iPxToDp = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f9062b.getContext(), MaxAdViewImpl.this.f9062b.getWidth());
                    int iPxToDp2 = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f9062b.getContext(), MaxAdViewImpl.this.f9062b.getHeight());
                    MaxAdViewImpl.this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
                    MaxAdViewImpl.this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    maxAdViewImpl2.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(maxAdViewImpl2.f9071k.f() || MaxAdViewImpl.this.f9077q));
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    maxAdViewImpl3.extraParameters.put("auto_retries_disabled", Boolean.valueOf(maxAdViewImpl3.f9082v));
                    y yVar = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl maxAdViewImpl4 = MaxAdViewImpl.this;
                        y yVar2 = maxAdViewImpl4.logger;
                        String str = maxAdViewImpl4.tag;
                        StringBuilder sbA = defpackage.a.a("Loading ");
                        sbA.append(MaxAdViewImpl.this.adFormat.getLabel().toLowerCase(Locale.ENGLISH));
                        sbA.append(" ad for '");
                        sbA.append(MaxAdViewImpl.this.adUnitId);
                        sbA.append("' and notifying ");
                        sbA.append(interfaceC0121a);
                        sbA.append("...");
                        yVar2.b(str, sbA.toString());
                    }
                    MediationServiceImpl mediationServiceImplAm = MaxAdViewImpl.this.sdk.am();
                    MaxAdViewImpl maxAdViewImpl5 = MaxAdViewImpl.this;
                    String str2 = maxAdViewImpl5.adUnitId;
                    String str3 = maxAdViewImpl5.f9063c;
                    MaxAdViewImpl maxAdViewImpl6 = MaxAdViewImpl.this;
                    mediationServiceImplAm.loadAd(str2, str3, maxAdViewImpl6.adFormat, aVar, maxAdViewImpl6.localExtraParameters, maxAdViewImpl6.extraParameters, maxAdViewImpl6.f9061a, interfaceC0121a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f9079s = false;
        if (!this.f9078r) {
            if (y.a()) {
                this.logger.b(this.tag, "Saving pre-cache ad...");
            }
            com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
            this.f9066f = bVar;
            bVar.e(this.f9067g);
            this.f9066f.f(this.f9068h);
            return;
        }
        this.f9078r = false;
        if (y.a()) {
            y yVar = this.logger;
            String str = this.tag;
            StringBuilder sbA = defpackage.a.a("Rendering precache request ad: ");
            sbA.append(maxAd.getAdUnitId());
            sbA.append("...");
            yVar.b(str, sbA.toString());
        }
        this.f9069i.onAdLoaded(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (this.sdk.b(com.applovin.impl.sdk.c.a.f10329n).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.F();
            if (y.a()) {
                y yVarF = this.sdk.F();
                String str = this.tag;
                StringBuilder sbA = defpackage.a.a("Ignoring banner ad refresh for error code ");
                sbA.append(maxError.getCode());
                yVarF.b(str, sbA.toString());
                return;
            }
            return;
        }
        if (!this.f9077q && !this.f9071k.f()) {
            this.f9076p = true;
            this.f9079s = false;
            long jLongValue = ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.f10328m)).longValue();
            if (jLongValue >= 0) {
                this.sdk.F();
                if (y.a()) {
                    y yVarF2 = this.sdk.F();
                    String str2 = this.tag;
                    StringBuilder sbA2 = i2.a.a("Scheduling failed banner ad refresh ", jLongValue, " milliseconds from now for '");
                    sbA2.append(this.adUnitId);
                    sbA2.append("'...");
                    yVarF2.b(str2, sbA2.toString());
                }
                this.f9071k.a(jLongValue);
                return;
            }
            return;
        }
        if (this.f9079s) {
            if (y.a()) {
                this.logger.b(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
            }
            this.f9079s = false;
        }
        if (this.f9078r) {
            if (y.a()) {
                y yVar = this.logger;
                String str3 = this.tag;
                StringBuilder sbA3 = defpackage.a.a("Refresh pre-cache failed - MaxAdListener.onAdLoadFailed(adUnitId=");
                sbA3.append(this.adUnitId);
                sbA3.append(", error=");
                sbA3.append(maxError);
                sbA3.append("), listener=");
                com.applovin.impl.mediation.ads.c.a(sbA3, this.adListener, yVar, str3);
            }
            o.a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    private void a(String str, String str2) {
        if (AppLovinSdkExtraParameterKey.ALLOW_IMMEDIATE_AUTO_REFRESH_PAUSE.equalsIgnoreCase(str)) {
            if (y.a()) {
                a0.a("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f9081u = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.DISABLE_AUTO_RETRIES.equalsIgnoreCase(str)) {
            if (y.a()) {
                a0.a("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f9082v = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.DISABLE_PRECACHE.equalsIgnoreCase(str)) {
            if (y.a()) {
                a0.a("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.f9083w = Boolean.parseBoolean(str2);
            return;
        }
        if (AppLovinSdkExtraParameterKey.DISABLE_AUTO_REFRESH_ON_AD_EXPAND.equals(str)) {
            if (y.a()) {
                a0.a("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.f9084x = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.FORCE_PRECACHE.equals(str)) {
            if (y.a()) {
                a0.a("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.f9085y = Boolean.parseBoolean(str2);
        } else if (AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER.equalsIgnoreCase(str)) {
            if (y.a()) {
                a0.a("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            this.f9086z = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    private void b() {
        if (d()) {
            if (y.a()) {
                this.logger.b(this.tag, "Scheduling refresh precache request now");
            }
            this.f9079s = true;
            this.sdk.G().a(new com.applovin.impl.sdk.e.ac(this.sdk, "loadMaxAdForPrecacheRequest", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxAdViewImpl.this.logger;
                    if (y.a()) {
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Loading ad for pre-cache request...");
                    }
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    maxAdViewImpl2.a(d.a.SEQUENTIAL_OR_PRECACHE, maxAdViewImpl2.f9070j);
                }
            }), com.applovin.impl.mediation.d.c.a(this.adFormat));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.b bVar) {
        int height = this.f9062b.getHeight();
        int width = this.f9062b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f9061a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f9061a, width);
            MaxAdFormat format = bVar.getFormat();
            int height2 = (this.f9086z ? format.getAdaptiveSize(iPxToDp2, this.f9062b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), h.a(this.f9061a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sbA = androidx.recyclerview.widget.o.a("\n**************************************************\n`MaxAdView` size ", iPxToDp2, "x", iPxToDp, " dp smaller than required ");
                sbA.append(this.f9086z ? "adaptive " : "");
                sbA.append("size: ");
                sbA.append(iMin);
                sbA.append("x");
                String strA = android.support.v4.media.b.a(sbA, height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                if (y.a()) {
                    this.logger.e("AppLovinSdk", strA);
                }
            }
        }
    }

    private void c() {
        if (y.a()) {
            y yVar = this.logger;
            String str = this.tag;
            StringBuilder sbA = defpackage.a.a("Rendering for cached ad: ");
            sbA.append(this.f9066f);
            sbA.append("...");
            yVar.b(str, sbA.toString());
        }
        this.f9069i.onAdLoaded(this.f9066f);
        this.f9066f = null;
    }

    private boolean d() {
        if (this.f9083w) {
            return false;
        }
        return ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f10340y)).booleanValue();
    }

    private boolean e() {
        boolean z10;
        synchronized (this.f9074n) {
            z10 = this.f9080t;
        }
        return z10;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a();
        if (this.f9066f != null) {
            this.sdk.am().destroyAd(this.f9066f);
        }
        synchronized (this.f9074n) {
            this.f9080t = true;
        }
        this.f9071k.c();
        this.sdk.aj().b(this);
        this.sdk.ar().a(this.adUnitId, this.f9063c);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f9067g;
    }

    public void loadAd() {
        loadAd(d.a.PUBLISHER_INITIATED);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    public void loadAd(d.a aVar) {
        if (y.a()) {
            this.logger.b(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z10 = this.f9081u || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f10335t)).booleanValue();
        if (z10 && !this.f9071k.f() && this.f9071k.a()) {
            String str = this.tag;
            StringBuilder sbA = defpackage.a.a("Unable to load a new ad. An ad refresh has already been scheduled in ");
            sbA.append(TimeUnit.MILLISECONDS.toSeconds(this.f9071k.b()));
            sbA.append(" seconds.");
            y.j(str, sbA.toString());
            return;
        }
        if (z10) {
            if (this.f9066f != null) {
                if (y.a()) {
                    this.logger.b(this.tag, "Rendering cached ad");
                }
                c();
                return;
            } else if (this.f9079s) {
                if (y.a()) {
                    this.logger.b(this.tag, "Waiting for precache ad to load to render");
                }
                this.f9078r = true;
                return;
            } else if (y.a()) {
                this.logger.b(this.tag, "Loading ad...");
            }
        } else if (y.a()) {
            this.logger.b(this.tag, "Loading ad...");
        }
        a(aVar, this.f9069i);
    }

    @Override // com.applovin.impl.sdk.e.a
    public void onAdRefresh() {
        y yVar;
        String str;
        String str2;
        this.f9078r = false;
        if (this.f9066f != null) {
            c();
            return;
        }
        if (d()) {
            if (!this.f9076p) {
                if (y.a()) {
                    this.logger.e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                }
                this.f9078r = true;
                return;
            } else if (y.a()) {
                yVar = this.logger;
                str = this.tag;
                str2 = "Refreshing ad from network due to viewability requirements not met for refresh request...";
                yVar.b(str, str2);
            }
        } else if (y.a()) {
            yVar = this.logger;
            str = this.tag;
            str2 = "Refreshing ad from network...";
            yVar.b(str, str2);
        }
        loadAd(d.a.REFRESH);
    }

    @Override // com.applovin.impl.sdk.f.a
    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.b bVar = this.f9075o;
        if (bVar != null && bVar.j().equalsIgnoreCase(str)) {
            this.f9075o.b(str2);
            o.a(this.adReviewListener, str2, this.f9075o);
            return;
        }
        com.applovin.impl.mediation.a.b bVar2 = this.f9066f;
        if (bVar2 == null || !bVar2.j().equalsIgnoreCase(str)) {
            return;
        }
        this.f9066f.b(str2);
    }

    @Override // com.applovin.impl.sdk.ad.a
    public void onLogVisibilityImpression() {
        a(this.f9075o, this.f9072l.a(this.f9075o));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f10333r)).booleanValue() && this.f9071k.a()) {
            if (x.a(i10)) {
                if (y.a()) {
                    this.logger.b(this.tag, "Ad view visible");
                }
                this.f9071k.h();
            } else {
                if (y.a()) {
                    this.logger.b(this.tag, "Ad view hidden");
                }
                this.f9071k.g();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f9075o != null && y.a()) {
            y yVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbA = androidx.activity.result.c.a("Setting custom data (", str, ") for Ad Unit ID (");
            sbA.append(this.adUnitId);
            sbA.append(") after an ad has been loaded already.");
            yVar.d(str2, sbA.toString());
        }
        w.a(str, this.tag);
        this.f9068h = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f9075o != null && y.a()) {
            y yVar = this.logger;
            String str2 = this.tag;
            StringBuilder sbA = androidx.activity.result.c.a("Setting placement (", str, ") for Ad Unit ID (");
            sbA.append(this.adUnitId);
            sbA.append(") after an ad has been loaded already.");
            yVar.d(str2, sbA.toString());
        }
        this.f9067g = str;
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f9065e = i10;
    }

    public void startAutoRefresh() {
        y yVar;
        String str;
        String string;
        this.f9077q = false;
        if (this.f9071k.f()) {
            this.f9071k.e();
            if (!y.a()) {
                return;
            }
            yVar = this.logger;
            str = this.tag;
            StringBuilder sbA = defpackage.a.a("Resumed auto-refresh with remaining time: ");
            sbA.append(this.f9071k.b());
            sbA.append("ms");
            string = sbA.toString();
        } else {
            if (!y.a()) {
                return;
            }
            yVar = this.logger;
            str = this.tag;
            string = "Ignoring call to startAutoRefresh() - ad refresh is not paused";
        }
        yVar.b(str, string);
    }

    public void stopAutoRefresh() {
        if (this.f9075o == null) {
            if (this.f9081u || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f10335t)).booleanValue()) {
                this.f9077q = true;
                return;
            } else {
                y.h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (y.a()) {
            y yVar = this.logger;
            String str = this.tag;
            StringBuilder sbA = defpackage.a.a("Pausing auto-refresh with remaining time: ");
            sbA.append(this.f9071k.b());
            sbA.append("ms");
            yVar.b(str, sbA.toString());
        }
        this.f9071k.d();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MaxAdView{adUnitId='");
        l1.c.a(sbA, this.adUnitId, CoreConstants.SINGLE_QUOTE_CHAR, ", adListener=");
        Object obj = this.adListener;
        if (obj == this.f9062b) {
            obj = "this";
        }
        sbA.append(obj);
        sbA.append(", isDestroyed=");
        return s.a(sbA, e(), '}');
    }
}
