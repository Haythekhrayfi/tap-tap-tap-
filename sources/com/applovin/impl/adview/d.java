package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.ab;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class d extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static WebView f8505c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f8506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8507b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.d.d f8508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.ad.e f8509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8510f;

    public d(e eVar, com.applovin.impl.sdk.o oVar, Context context) {
        super(context);
        if (oVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f8507b = oVar;
        this.f8506a = oVar.F();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(eVar != null ? eVar : new ab());
        setWebChromeClient(new c(eVar != null ? eVar.a() : null, oVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        if (com.applovin.impl.sdk.utils.h.i() && ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.gm)).booleanValue()) {
            setWebViewRenderProcessClient(new f(oVar).a());
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.adview.d.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.applovin.impl.adview.d.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                com.applovin.impl.sdk.y unused = d.this.f8506a;
                if (!com.applovin.impl.sdk.y.a()) {
                    return true;
                }
                d.this.f8506a.b("AdWebView", "Received a LongClick event.");
                return true;
            }
        });
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    public static void a(final com.applovin.impl.sdk.network.l lVar, final com.applovin.impl.sdk.o oVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.3
            @Override // java.lang.Runnable
            public void run() {
                String strA = lVar.a();
                d.c();
                if (d.f8505c == null) {
                    appLovinPostbackListener.onPostbackFailure(strA, -1);
                    return;
                }
                if (lVar.c() != null) {
                    strA = StringUtils.appendQueryParameters(strA, lVar.c(), ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.dM)).booleanValue());
                }
                String strA2 = androidx.activity.j.a("al_firePostback('", strA, "');");
                if (com.applovin.impl.sdk.utils.h.c()) {
                    d.f8505c.evaluateJavascript(strA2, null);
                } else {
                    d.f8505c.loadUrl("javascript:" + strA2);
                }
                appLovinPostbackListener.onPostbackSuccess(strA);
            }
        });
    }

    private void a(String str, String str2, String str3, com.applovin.impl.sdk.o oVar, com.applovin.impl.c.a aVar) {
        com.applovin.impl.sdk.y yVar;
        StringBuilder sb2;
        String strA = a(str3, str);
        if (StringUtils.isValidString(strA)) {
            if (aVar.c() && aVar.isOpenMeasurementEnabled() && !aVar.q()) {
                strA = oVar.ad().a(strA);
            }
            if (com.applovin.impl.sdk.y.a()) {
                yVar = this.f8506a;
                sb2 = new StringBuilder();
                sb2.append("Rendering webview for VAST ad with resourceContents : ");
                sb2.append(strA);
                yVar.b("AdWebView", sb2.toString());
            }
        } else {
            strA = a((String) oVar.a(com.applovin.impl.sdk.c.b.f10372fe), str);
            if (!StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.y.a()) {
                    a0.a("Rendering webview for VAST ad with resourceURL : ", str, this.f8506a, "AdWebView");
                }
                loadUrl(str);
                return;
            }
            if (aVar.c() && aVar.isOpenMeasurementEnabled()) {
                strA = oVar.ad().a(strA);
            }
            if (com.applovin.impl.sdk.y.a()) {
                yVar = this.f8506a;
                sb2 = new StringBuilder();
                sb2.append("Rendering webview for VAST ad with resourceContents : ");
                sb2.append(strA);
                yVar.b("AdWebView", sb2.toString());
            }
        }
        loadDataWithBaseURL(str2, strA, "text/html", null, "");
    }

    private void b(com.applovin.impl.sdk.ad.e eVar) {
        Boolean boolN;
        Integer numA;
        loadUrl("about:blank");
        int iAE = this.f8509e.aE();
        if (iAE >= 0) {
            setLayerType(iAE, null);
        }
        if (com.applovin.impl.sdk.utils.h.b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(eVar.aA());
        }
        if (com.applovin.impl.sdk.utils.h.c() && eVar.aC()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        y yVarAD = eVar.aD();
        if (yVarAD != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState pluginStateB = yVarAD.b();
            if (pluginStateB != null) {
                settings.setPluginState(pluginStateB);
            }
            Boolean boolC = yVarAD.c();
            if (boolC != null) {
                settings.setAllowFileAccess(boolC.booleanValue());
            }
            Boolean boolD = yVarAD.d();
            if (boolD != null) {
                settings.setLoadWithOverviewMode(boolD.booleanValue());
            }
            Boolean boolE = yVarAD.e();
            if (boolE != null) {
                settings.setUseWideViewPort(boolE.booleanValue());
            }
            Boolean boolF = yVarAD.f();
            if (boolF != null) {
                settings.setAllowContentAccess(boolF.booleanValue());
            }
            Boolean boolG = yVarAD.g();
            if (boolG != null) {
                settings.setBuiltInZoomControls(boolG.booleanValue());
            }
            Boolean boolH = yVarAD.h();
            if (boolH != null) {
                settings.setDisplayZoomControls(boolH.booleanValue());
            }
            Boolean boolI = yVarAD.i();
            if (boolI != null) {
                settings.setSaveFormData(boolI.booleanValue());
            }
            Boolean boolJ = yVarAD.j();
            if (boolJ != null) {
                settings.setGeolocationEnabled(boolJ.booleanValue());
            }
            Boolean boolK = yVarAD.k();
            if (boolK != null) {
                settings.setNeedInitialFocus(boolK.booleanValue());
            }
            Boolean boolL = yVarAD.l();
            if (boolL != null) {
                settings.setAllowFileAccessFromFileURLs(boolL.booleanValue());
            }
            Boolean boolM = yVarAD.m();
            if (boolM != null) {
                settings.setAllowUniversalAccessFromFileURLs(boolM.booleanValue());
            }
            if (com.applovin.impl.sdk.utils.h.d() && (numA = yVarAD.a()) != null) {
                settings.setMixedContentMode(numA.intValue());
            }
            if (!com.applovin.impl.sdk.utils.h.e() || (boolN = yVarAD.n()) == null) {
                return;
            }
            settings.setOffscreenPreRaster(boolN.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        if (f8505c != null) {
            return;
        }
        WebView webViewA = com.applovin.impl.sdk.utils.w.a(com.applovin.impl.sdk.o.au(), "postbacks");
        f8505c = webViewA;
        if (webViewA == null) {
            return;
        }
        webViewA.getSettings().setJavaScriptEnabled(true);
        f8505c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
        f8505c.setWebViewClient(new ab() { // from class: com.applovin.impl.adview.d.4
            @Override // com.applovin.impl.sdk.ab, android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (webView == d.f8505c) {
                    d.f8505c.destroy();
                    WebView unused = d.f8505c = null;
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.d.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d.c();
                        }
                    });
                }
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
        });
    }

    public void a(com.applovin.impl.sdk.ad.e eVar) {
        com.applovin.impl.sdk.y yVar;
        String str;
        com.applovin.impl.sdk.y yVar2;
        String str2;
        String str3;
        String strAB;
        String str4;
        String str5;
        String str6;
        String strAB2;
        com.applovin.impl.sdk.o oVar;
        if (this.f8510f) {
            com.applovin.impl.sdk.y.j("AdWebView", "Ad can not be loaded in a destroyed webview");
            return;
        }
        this.f8509e = eVar;
        try {
            b(eVar);
            if (com.applovin.impl.sdk.utils.w.a(eVar.getSize())) {
                setVisibility(0);
            }
            if (eVar instanceof com.applovin.impl.sdk.ad.a) {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                String strB = aVar.b();
                if (!aVar.q() && aVar.isOpenMeasurementEnabled()) {
                    strB = this.f8507b.ad().a(strB);
                }
                loadDataWithBaseURL(eVar.aB(), strB, "text/html", null, "");
                if (!com.applovin.impl.sdk.y.a()) {
                    return;
                }
                yVar = this.f8506a;
                str = "AppLovinAd rendered";
            } else {
                if (!(eVar instanceof com.applovin.impl.c.a)) {
                    return;
                }
                com.applovin.impl.c.a aVar2 = (com.applovin.impl.c.a) eVar;
                com.applovin.impl.c.d dVarAV = aVar2.aV();
                if (dVarAV != null) {
                    com.applovin.impl.c.i iVarB = dVarAV.b();
                    Uri uriB = iVarB.b();
                    String string = uriB != null ? uriB.toString() : "";
                    String strC = iVarB.c();
                    String strAZ = aVar2.aZ();
                    if (StringUtils.isValidString(string) || StringUtils.isValidString(strC)) {
                        if (iVarB.a() == com.applovin.impl.c.i.a.STATIC) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f8506a.b("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String strA = a((String) this.f8507b.a(com.applovin.impl.sdk.c.b.f10371fd), string);
                            if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && aVar2.e()) {
                                strA = this.f8507b.ad().a(strA);
                            }
                            str3 = strA;
                            strAB = eVar.aB();
                            str4 = "text/html";
                            str5 = null;
                            str6 = "";
                        } else if (iVarB.a() == com.applovin.impl.c.i.a.HTML) {
                            if (!StringUtils.isValidString(strC)) {
                                if (StringUtils.isValidString(string)) {
                                    if (com.applovin.impl.sdk.y.a()) {
                                        this.f8506a.b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                    }
                                    strAB2 = eVar.aB();
                                    oVar = this.f8507b;
                                    a(string, strAB2, strAZ, oVar, aVar2);
                                    return;
                                }
                                return;
                            }
                            String strA2 = a(strAZ, strC);
                            if (StringUtils.isValidString(strA2)) {
                                strC = strA2;
                            }
                            if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && !aVar2.q()) {
                                strC = this.f8507b.ad().a(strC);
                            }
                            str3 = strC;
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f8506a.b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                            }
                            strAB = eVar.aB();
                            str4 = "text/html";
                            str5 = null;
                            str6 = "";
                        } else if (iVarB.a() == com.applovin.impl.c.i.a.IFRAME) {
                            if (StringUtils.isValidString(string)) {
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f8506a.b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                strAB2 = eVar.aB();
                                oVar = this.f8507b;
                                a(string, strAB2, strAZ, oVar, aVar2);
                                return;
                            }
                            if (!StringUtils.isValidString(strC)) {
                                return;
                            }
                            String strA3 = a(strAZ, strC);
                            if (StringUtils.isValidString(strA3)) {
                                strC = strA3;
                            }
                            if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && !aVar2.q()) {
                                strC = this.f8507b.ad().a(strC);
                            }
                            str3 = strC;
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f8506a.b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                            }
                            strAB = eVar.aB();
                            str4 = "text/html";
                            str5 = null;
                            str6 = "";
                        } else {
                            if (!com.applovin.impl.sdk.y.a()) {
                                return;
                            }
                            yVar2 = this.f8506a;
                            str2 = "Failed to render VAST companion ad of invalid type";
                        }
                        loadDataWithBaseURL(strAB, str3, str4, str5, str6);
                        return;
                    }
                    if (!com.applovin.impl.sdk.y.a()) {
                        return;
                    }
                    yVar2 = this.f8506a;
                    str2 = "Unable to load companion ad. No resources provided.";
                    yVar2.e("AdWebView", str2);
                    return;
                }
                if (!com.applovin.impl.sdk.y.a()) {
                    return;
                }
                yVar = this.f8506a;
                str = "No companion ad provided.";
            }
            yVar.b("AdWebView", str);
        } catch (Throwable th) {
            throw new RuntimeException("Unable to render AppLovin ad (" + (eVar != null ? String.valueOf(eVar.getAdIdNumber()) : "null") + ") - " + th);
        }
    }

    public void a(String str) {
        a(str, (Runnable) null);
    }

    public void a(String str, Runnable runnable) {
        try {
            if (com.applovin.impl.sdk.y.a()) {
                this.f8506a.b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            }
            loadUrl(str);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f8506a.b("AdWebView", "Unable to forward to template", th);
            }
            this.f8507b.ag().a("AdWebView", str, th);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.f8510f = true;
        super.destroy();
    }

    public com.applovin.impl.sdk.ad.e getCurrentAd() {
        return this.f8509e;
    }

    public com.applovin.impl.sdk.d.d getStatsManagerHelper() {
        return this.f8508d;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    public void setStatsManagerHelper(com.applovin.impl.sdk.d.d dVar) {
        this.f8508d = dVar;
    }
}
