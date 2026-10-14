package com.applovin.impl.sdk;

import android.annotation.SuppressLint;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ae extends ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f10250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f10251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<WebView> f10252d = Collections.synchronizedSet(new HashSet());

    public ae(o oVar) {
        this.f10249a = oVar;
        this.f10250b = oVar.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final WebView webView) {
        if (webView == null || !this.f10252d.remove(webView)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.3
            @Override // java.lang.Runnable
            public void run() {
                webView.destroy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    public WebView b(String str) {
        com.applovin.impl.sdk.utils.w.j();
        WebView webViewA = com.applovin.impl.sdk.utils.w.a(o.au(), "web tracker");
        if (webViewA == null) {
            return null;
        }
        webViewA.getSettings().setJavaScriptEnabled(true);
        webViewA.setWebViewClient(this);
        webViewA.loadData("<html><head><link rel=\"icon\" href=\"data:,\">" + str + "</head><body></body></html>", "text/html", "UTF-8");
        return webViewA;
    }

    public void a(final com.applovin.impl.sdk.network.l lVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.1
            @Override // java.lang.Runnable
            public void run() {
                String strAppendQueryParameters = StringUtils.appendQueryParameters(lVar.a(), lVar.c(), ((Boolean) ae.this.f10249a.a(com.applovin.impl.sdk.c.b.dM)).booleanValue());
                if (ae.this.f10251c == null) {
                    ae aeVar = ae.this;
                    aeVar.f10251c = aeVar.b("<script>window.al_firePostback = function(url) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = url;\n    }, 100);\n}\n</script>");
                    if (ae.this.f10251c == null) {
                        y unused = ae.this.f10250b;
                        if (y.a()) {
                            ae.this.f10250b.e("WebTrackerManager", "Failed to fire postback since web view could not be created");
                        }
                        appLovinPostbackListener.onPostbackFailure(strAppendQueryParameters, -1);
                        return;
                    }
                }
                String strA = androidx.activity.j.a("al_firePostback('", strAppendQueryParameters, "')");
                if (com.applovin.impl.sdk.utils.h.c()) {
                    ae.this.f10251c.evaluateJavascript(strA, null);
                } else {
                    ae.this.f10251c.loadUrl("javascript:" + strA);
                }
                appLovinPostbackListener.onPostbackSuccess(strAppendQueryParameters);
            }
        });
    }

    public void a(final String str) {
        if (!AppLovinSdkUtils.isValidString(str)) {
            if (y.a()) {
                this.f10250b.e("WebTrackerManager", "Failed to fire tracker due to empty script string");
            }
        } else if (str.startsWith("<script")) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.2
                @Override // java.lang.Runnable
                public void run() {
                    final WebView webViewB = ae.this.b(str);
                    if (webViewB != null) {
                        ae.this.f10252d.add(webViewB);
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.ae.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ae.this.a(webViewB);
                            }
                        }, ((Integer) ae.this.f10249a.a(com.applovin.impl.sdk.c.b.dp)).intValue());
                    } else {
                        y unused = ae.this.f10250b;
                        if (y.a()) {
                            ae.this.f10250b.e("WebTrackerManager", "Failed to fire tracker since web view could not be created");
                        }
                    }
                }
            });
        } else if (y.a()) {
            this.f10250b.e("WebTrackerManager", "Failed to fire tracker due to improperly formatted script tag");
        }
    }

    @Override // com.applovin.impl.sdk.ab, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == this.f10251c) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ae.4
                @Override // java.lang.Runnable
                public void run() {
                    ae.this.f10251c.destroy();
                    ae.this.f10251c = null;
                }
            });
        } else {
            a(webView);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
