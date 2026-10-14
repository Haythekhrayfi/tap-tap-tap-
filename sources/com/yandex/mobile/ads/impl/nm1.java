package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class nm1 extends b6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WebView f23448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f23449g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, rb1> f23450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f23451i;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WebView f23452b;

        public a(nm1 nm1Var) {
            this.f23452b = nm1Var.f23448f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f23452b.destroy();
        }
    }

    public nm1(String str, Map map) {
        this.f23450h = map;
        this.f23451i = str;
    }

    @Override // com.yandex.mobile.ads.impl.b6
    public final void a() {
        WebView webView = new WebView(bn1.a().b());
        this.f23448f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f23448f);
        WebView webView2 = this.f23448f;
        String str = this.f23451i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String str2 : this.f23450h.keySet()) {
            String externalForm = this.f23450h.get(str2).a().toExternalForm();
            WebView webView3 = this.f23448f;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String strReplace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(strReplace)) {
                    webView3.loadUrl("javascript: " + strReplace);
                }
            }
        }
        this.f23449g = Long.valueOf(System.nanoTime());
    }

    @Override // com.yandex.mobile.ads.impl.b6
    public final void a(em1 em1Var, y5 y5Var) {
        JSONObject jSONObject = new JSONObject();
        Map<String, rb1> mapD = y5Var.d();
        for (String str : mapD.keySet()) {
            rm1.a(jSONObject, str, mapD.get(str));
        }
        a(em1Var, y5Var, jSONObject);
    }

    @Override // com.yandex.mobile.ads.impl.b6
    public final void b() {
        super.b();
        new Handler().postDelayed(new a(this), Math.max(4000 - (this.f23449g == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f23449g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f23448f = null;
    }
}
