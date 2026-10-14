package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.e.ac;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.developer.filepicker.model.DialogConfigs;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber {
    private volatile AppLovinAdDisplayListener A;
    private volatile AppLovinAdViewEventListener B;
    private volatile AppLovinAdClickListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f8458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.o f8459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f8460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.y f8461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f8462f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AppLovinAdSize f8464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.applovin.impl.sdk.d.d f8466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f8467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f8468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d f8469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private v f8470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Runnable f8471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f8472p;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f8482z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f8463g = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.e f8473q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile AppLovinAd f8474r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private m f8475s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private m f8476t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AtomicReference<AppLovinAd> f8477u = new AtomicReference<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f8478v = new AtomicBoolean();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile boolean f8479w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile boolean f8480x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile boolean f8481y = false;
    private volatile g D = null;

    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f8469m != null) {
                b.this.f8469m.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.b$b, reason: collision with other inner class name */
    public class RunnableC0111b implements Runnable {
        private RunnableC0111b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f8473q != null) {
                if (b.this.f8469m == null) {
                    StringBuilder sbA = defpackage.a.a("Unable to render advertisement for ad #");
                    sbA.append(b.this.f8473q.getAdIdNumber());
                    sbA.append(". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    com.applovin.impl.sdk.y.j("AppLovinAdView", sbA.toString());
                    com.applovin.impl.sdk.utils.o.a(b.this.B, b.this.f8473q, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    return;
                }
                b.this.x();
                com.applovin.impl.sdk.y unused = b.this.f8461e;
                if (com.applovin.impl.sdk.y.a()) {
                    com.applovin.impl.sdk.y yVar = b.this.f8461e;
                    StringBuilder sbA2 = defpackage.a.a("Rendering advertisement ad for #");
                    sbA2.append(b.this.f8473q.getAdIdNumber());
                    sbA2.append("...");
                    yVar.b("AppLovinAdView", sbA2.toString());
                }
                b.b(b.this.f8469m, b.this.f8473q.getSize());
                if (b.this.f8470n != null) {
                    com.applovin.impl.sdk.utils.x.a(b.this.f8470n);
                    b.this.f8470n = null;
                }
                if (((Boolean) b.this.f8459c.a(com.applovin.impl.sdk.c.b.ay)).booleanValue()) {
                    b.this.f8470n = new v(new p(b.this.f8463g, b.this.f8459c), b.this.f8457a);
                    b.this.f8470n.a(new v.a() { // from class: com.applovin.impl.adview.b.b.1
                        @Override // com.applovin.impl.adview.v.a
                        public void a() {
                            b.this.f8469m.addView(b.this.f8470n, new ViewGroup.LayoutParams(-1, -1));
                        }

                        @Override // com.applovin.impl.adview.v.a
                        public void b() {
                            com.applovin.impl.sdk.y unused2 = b.this.f8461e;
                            if (com.applovin.impl.sdk.y.a()) {
                                b.this.f8461e.e("AppLovinAdView", "Watermark failed to render.");
                            }
                        }
                    });
                }
                b.this.f8469m.a(b.this.f8473q);
                if (b.this.f8473q.getSize() != AppLovinAdSize.INTERSTITIAL && !b.this.f8480x) {
                    b bVar = b.this;
                    bVar.f8466j = new com.applovin.impl.sdk.d.d(bVar.f8473q, b.this.f8459c);
                    b.this.f8466j.a();
                    b.this.f8469m.setStatsManagerHelper(b.this.f8466j);
                    b.this.f8473q.setHasShown(true);
                }
                if (b.this.f8469m.getStatsManagerHelper() != null) {
                    b.this.f8469m.getStatsManagerHelper().a(b.this.f8473q.A() ? 0L : 1L);
                }
            }
        }
    }

    public static class c implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f8502a;

        public c(b bVar, com.applovin.impl.sdk.o oVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (oVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f8502a = bVar;
        }

        private b a() {
            return this.f8502a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            b bVarA = a();
            if (bVarA != null) {
                bVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.y.j("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            b bVarA = a();
            if (bVarA != null) {
                bVarA.a(i10);
            }
        }
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.o oVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        this.f8459c = oVar;
        this.f8460d = oVar.v();
        this.f8461e = oVar.F();
        this.f8462f = AppLovinCommunicator.getInstance(context);
        this.f8464h = appLovinAdSize;
        this.f8465i = str;
        if (!(context instanceof AppLovinFullscreenActivity)) {
            context = context.getApplicationContext();
        }
        this.f8457a = context;
        this.f8458b = appLovinAdView;
        this.f8467k = new e(this, oVar);
        this.f8472p = new a();
        this.f8471o = new RunnableC0111b();
        this.f8468l = new c(this, oVar);
        a(appLovinAdSize);
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        int iApplyDimension;
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        String label = appLovinAdSize.getLabel();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension2 = -1;
        if (label.equals(appLovinAdSize2.getLabel())) {
            iApplyDimension = -1;
        } else {
            iApplyDimension = appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        }
        if (!appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel())) {
            iApplyDimension2 = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension;
        layoutParams.height = iApplyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void t() {
        if (this.f8461e != null && com.applovin.impl.sdk.y.a() && com.applovin.impl.sdk.y.a()) {
            this.f8461e.b("AppLovinAdView", "Destroying...");
        }
        com.applovin.impl.sdk.utils.z.a(this.f8469m);
        this.f8469m = null;
        this.f8482z = null;
        this.A = null;
        this.C = null;
        this.B = null;
        this.f8480x = true;
    }

    private void u() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.3
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f8475s != null) {
                    com.applovin.impl.sdk.y unused = b.this.f8461e;
                    if (com.applovin.impl.sdk.y.a()) {
                        com.applovin.impl.sdk.y yVar = b.this.f8461e;
                        StringBuilder sbA = defpackage.a.a("Detaching expanded ad: ");
                        sbA.append(b.this.f8475s.a());
                        yVar.b("AppLovinAdView", sbA.toString());
                    }
                    b bVar = b.this;
                    bVar.f8476t = bVar.f8475s;
                    b.this.f8475s = null;
                    b bVar2 = b.this;
                    bVar2.a(bVar2.f8464h);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.10
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.sdk.ad.a aVarA;
                if (b.this.f8476t == null && b.this.f8475s == null) {
                    return;
                }
                if (b.this.f8476t != null) {
                    aVarA = b.this.f8476t.a();
                    b.this.f8476t.dismiss();
                    b.this.f8476t = null;
                } else {
                    aVarA = b.this.f8475s.a();
                    b.this.f8475s.dismiss();
                    b.this.f8475s = null;
                }
                com.applovin.impl.sdk.utils.o.b(b.this.B, aVarA, (AppLovinAdView) b.this.f8458b);
            }
        });
    }

    private void w() {
        com.applovin.impl.sdk.d.d dVar = this.f8466j;
        if (dVar != null) {
            dVar.c();
            this.f8466j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        com.applovin.impl.sdk.ad.e eVar = this.f8473q;
        com.applovin.impl.sdk.utils.p pVar = new com.applovin.impl.sdk.utils.p();
        pVar.a().a(eVar).a(r());
        if (!com.applovin.impl.sdk.utils.w.a(eVar.getSize())) {
            pVar.a().a("Fullscreen Ad Properties").b(eVar);
        }
        pVar.a(this.f8459c);
        pVar.a();
        if (com.applovin.impl.sdk.y.a()) {
            this.f8461e.b("AppLovinAdView", pVar.toString());
        }
    }

    public void a() {
        if (this.f8459c == null || this.f8468l == null || this.f8457a == null || !this.f8479w) {
            com.applovin.impl.sdk.y.g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f8460d.loadNextAd(this.f8465i, this.f8464h, this.f8468l);
        }
    }

    public void a(final int i10) {
        if (!this.f8480x) {
            a(this.f8472p);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (b.this.f8482z != null) {
                        b.this.f8482z.failedToReceiveAd(i10);
                    }
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y.c("AppLovinAdView", "Exception while running app load callback", th);
                    if (b.this.f8459c != null) {
                        b.this.f8459c.ag().a("AppLovinAdView", "notifyAdLoadFailed", th);
                    }
                }
            }
        });
    }

    public void a(final PointF pointF) {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.6
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f8475s == null && (b.this.f8473q instanceof com.applovin.impl.sdk.ad.a) && b.this.f8469m != null) {
                    com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) b.this.f8473q;
                    Activity activityA = b.this.f8457a instanceof Activity ? (Activity) b.this.f8457a : com.applovin.impl.sdk.utils.w.a((View) b.this.f8469m, b.this.f8459c);
                    if (activityA == null || activityA.isFinishing()) {
                        com.applovin.impl.sdk.y.j("AppLovinAdView", "Unable to expand ad. No Activity found.");
                        Uri uriJ = aVar.j();
                        if (uriJ != null) {
                            AppLovinAdServiceImpl appLovinAdServiceImpl = b.this.f8460d;
                            AppLovinAdView appLovinAdViewR = b.this.r();
                            b bVar = b.this;
                            appLovinAdServiceImpl.trackAndLaunchClick(aVar, appLovinAdViewR, bVar, uriJ, pointF, bVar.f8481y, false);
                            if (b.this.f8466j != null) {
                                b.this.f8466j.b();
                            }
                        }
                        b.this.f8469m.a("javascript:al_onFailedExpand();");
                        return;
                    }
                    if (b.this.f8458b != null) {
                        b.this.f8458b.removeView(b.this.f8469m);
                    }
                    b.this.f8475s = new m(aVar, b.this.f8469m, activityA, b.this.f8459c);
                    b.this.f8475s.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.b.6.1
                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(DialogInterface dialogInterface) {
                            b.this.k();
                        }
                    });
                    b.this.f8475s.show();
                    com.applovin.impl.sdk.utils.o.a(b.this.B, b.this.f8473q, (AppLovinAdView) b.this.f8458b);
                    if (b.this.f8466j != null) {
                        b.this.f8466j.d();
                    }
                    if (b.this.f8473q.isOpenMeasurementEnabled()) {
                        b.this.f8473q.o().a((View) b.this.f8475s.b());
                    }
                }
            }
        });
    }

    public void a(final WebView webView) {
        if (this.f8473q == null) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.4
            @Override // java.lang.Runnable
            public void run() {
                webView.setVisibility(0);
            }
        });
        try {
            if (this.f8473q != this.f8474r) {
                this.f8474r = this.f8473q;
                if (this.A != null) {
                    this.f8459c.ac().a(this.f8473q);
                    com.applovin.impl.sdk.utils.o.a(this.A, this.f8473q);
                    this.f8469m.a("javascript:al_onAdViewRendered();");
                }
                if (com.applovin.impl.sdk.utils.w.a(this.f8464h) && this.f8473q.isOpenMeasurementEnabled()) {
                    this.f8459c.G().a(new ac(this.f8459c, "StartOMSDK", new Runnable() { // from class: com.applovin.impl.adview.b.5
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.f8473q.o().b(webView);
                            if (b.this.f8470n == null || !b.this.f8470n.b()) {
                                b.this.f8473q.o().a((View) webView);
                            } else {
                                b.this.f8473q.o().a(webView, Collections.singletonList(new com.applovin.impl.sdk.a.d(b.this.f8470n, FriendlyObstructionPurpose.NOT_VISIBLE, b.this.f8470n.getIdentifier())));
                            }
                            b.this.f8473q.o().c();
                            b.this.f8473q.o().d();
                        }
                    }), com.applovin.impl.sdk.e.r.b.MAIN, 500L);
                }
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("AppLovinAdView", "Exception while notifying ad display listener", th);
            com.applovin.impl.sdk.o oVar = this.f8459c;
            if (oVar != null) {
                oVar.ag().a("AppLovinAdView", "onAdHtmlLoaded", th);
            }
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.y.j("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.sdk.utils.c.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (com.applovin.impl.sdk.utils.c.b(attributeSet)) {
                a();
            }
        }
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.B = appLovinAdViewEventListener;
    }

    public void a(g gVar) {
        this.D = gVar;
    }

    public void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF, boolean z10) {
        if (appLovinAdView != null) {
            this.f8460d.trackAndLaunchClick(eVar, appLovinAdView, this, uri, pointF, this.f8481y, z10);
        } else if (com.applovin.impl.sdk.y.a()) {
            this.f8461e.e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        com.applovin.impl.sdk.utils.o.a(this.C, eVar);
    }

    public void a(com.applovin.impl.sdk.d.d dVar) {
        d dVar2 = this.f8469m;
        if (dVar2 != null) {
            dVar2.setStatsManagerHelper(dVar);
        }
    }

    public void a(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        com.applovin.impl.sdk.utils.w.b(appLovinAd, this.f8459c);
        if (!this.f8479w) {
            com.applovin.impl.sdk.y.g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        com.applovin.impl.sdk.ad.e eVar = (com.applovin.impl.sdk.ad.e) com.applovin.impl.sdk.utils.w.a(appLovinAd, this.f8459c);
        if (eVar == null) {
            com.applovin.impl.sdk.y.j("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
            com.applovin.impl.sdk.utils.o.a(this.A, "Unable to retrieve the loaded ad");
            return;
        }
        if (eVar == this.f8473q) {
            com.applovin.impl.sdk.y.j("AppLovinAdView", "Attempting to show ad again: " + eVar);
            if (((Boolean) this.f8459c.a(com.applovin.impl.sdk.c.b.cr)).booleanValue()) {
                if (!(this.A instanceof com.applovin.impl.sdk.ad.h)) {
                    throw new IllegalStateException("Attempting to show ad again");
                }
                com.applovin.impl.sdk.utils.o.a(this.A, "Attempting to show ad again");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f8461e;
            StringBuilder sbA = defpackage.a.a("Rendering ad #");
            sbA.append(eVar.getAdIdNumber());
            sbA.append(" (");
            sbA.append(eVar.getSize());
            sbA.append(")");
            yVar.b("AppLovinAdView", sbA.toString());
        }
        com.applovin.impl.sdk.utils.o.b(this.A, this.f8473q);
        if (eVar.getSize() != AppLovinAdSize.INTERSTITIAL) {
            w();
        }
        if (this.f8473q != null && this.f8473q.isOpenMeasurementEnabled()) {
            this.f8473q.o().e();
        }
        this.f8477u.set(null);
        this.f8474r = null;
        this.f8473q = eVar;
        if (!this.f8480x && com.applovin.impl.sdk.utils.w.a(this.f8464h)) {
            this.f8459c.v().trackImpression(eVar);
        }
        if (this.f8475s != null) {
            u();
        }
        a(this.f8471o);
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.C = appLovinAdClickListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.A = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8482z = appLovinAdLoadListener;
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            d dVar = new d(this.f8467k, this.f8459c, this.f8457a);
            this.f8469m = dVar;
            dVar.setBackgroundColor(0);
            this.f8469m.setWillNotCacheDrawing(false);
            this.f8458b.setBackgroundColor(0);
            this.f8458b.addView(this.f8469m);
            b(this.f8469m, appLovinAdSize);
            if (!this.f8479w) {
                a(this.f8472p);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f8469m.loadDataWithBaseURL(DialogConfigs.DIRECTORY_SEPERATOR, "<html></html>", "text/html", null, "");
                }
            });
            this.f8479w = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.y.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f8459c.ag().a("AppLovinAdView", "initAdWebView", th);
            this.f8478v.set(true);
        }
    }

    public void a(String str, Object obj) {
        this.f8463g.put(str, obj);
    }

    public AppLovinAdSize b() {
        return this.f8464h;
    }

    public void b(final AppLovinAd appLovinAd) {
        if (appLovinAd == null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f8461e.e("AppLovinAdView", "No provided when to the view controller");
            }
            a(-1);
        } else {
            if (this.f8480x) {
                this.f8477u.set(appLovinAd);
                if (com.applovin.impl.sdk.y.a()) {
                    this.f8461e.b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            } else {
                a(appLovinAd);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b.8
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.f8478v.compareAndSet(true, false)) {
                        b bVar = b.this;
                        bVar.a(bVar.f8464h);
                    }
                    try {
                        if (b.this.f8482z != null) {
                            b.this.f8482z.adReceived(appLovinAd);
                        }
                    } catch (Throwable th) {
                        StringBuilder sbA = defpackage.a.a("Exception while running ad load callback: ");
                        sbA.append(th.getMessage());
                        com.applovin.impl.sdk.y.j("AppLovinAdView", sbA.toString());
                        if (b.this.f8459c != null) {
                            b.this.f8459c.ag().a("AppLovinAdView", "notifyAdLoaded", th);
                        }
                    }
                }
            });
        }
    }

    public String c() {
        return this.f8465i;
    }

    public void d() {
        if (!this.f8479w || this.f8480x) {
            return;
        }
        this.f8480x = true;
    }

    public void e() {
        if (this.f8479w) {
            AppLovinAd andSet = this.f8477u.getAndSet(null);
            if (andSet != null) {
                a(andSet);
            }
            this.f8480x = false;
        }
    }

    public void f() {
        if (this.f8469m != null && this.f8475s != null) {
            k();
        }
        t();
    }

    public AppLovinAdViewEventListener g() {
        return this.B;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "b";
    }

    public g h() {
        return this.D;
    }

    public void i() {
        if (com.applovin.impl.sdk.utils.c.a(this.f8469m)) {
            this.f8459c.J().a(com.applovin.impl.sdk.d.f.f10477o);
        }
    }

    public void j() {
        if (this.f8479w) {
            com.applovin.impl.sdk.utils.o.b(this.A, this.f8473q);
            if (this.f8473q != null && this.f8473q.isOpenMeasurementEnabled() && com.applovin.impl.sdk.utils.w.a(this.f8473q.getSize())) {
                this.f8473q.o().e();
            }
            if (this.f8469m == null || this.f8475s == null) {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f8461e.b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
                }
            } else {
                if (com.applovin.impl.sdk.y.a()) {
                    this.f8461e.b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                u();
            }
        }
    }

    public void k() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.7
            @Override // java.lang.Runnable
            public void run() {
                b.this.v();
                if (b.this.f8458b == null || b.this.f8469m == null || b.this.f8469m.getParent() != null) {
                    return;
                }
                b.this.f8458b.addView(b.this.f8469m);
                b.b(b.this.f8469m, b.this.f8473q.getSize());
                if (b.this.f8473q.isOpenMeasurementEnabled()) {
                    b.this.f8473q.o().a((View) b.this.f8469m);
                }
            }
        });
    }

    public void l() {
        if (this.f8475s != null || this.f8476t != null) {
            k();
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f8461e;
            StringBuilder sbA = defpackage.a.a("Ad: ");
            sbA.append(this.f8473q);
            sbA.append(" closed.");
            yVar.b("AppLovinAdView", sbA.toString());
        }
        a(this.f8472p);
        com.applovin.impl.sdk.utils.o.b(this.A, this.f8473q);
        this.f8473q = null;
    }

    public void m() {
        this.f8481y = true;
    }

    public void n() {
        this.f8481y = false;
    }

    public void o() {
        if (!(this.f8457a instanceof l) || this.f8473q == null) {
            return;
        }
        if (this.f8473q.J() == com.applovin.impl.sdk.ad.e.a.DISMISS) {
            ((l) this.f8457a).dismiss();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.s().loadUrl("chrome://crash");
                }
            });
        }
    }

    public com.applovin.impl.sdk.ad.e p() {
        return this.f8473q;
    }

    public com.applovin.impl.sdk.o q() {
        return this.f8459c;
    }

    public AppLovinAdView r() {
        return (AppLovinAdView) this.f8458b;
    }

    public d s() {
        return this.f8469m;
    }
}
