package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WebView f12972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f12973g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f12974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f12975i;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f12976a;

        public a() {
            this.f12976a = b.this.f12972f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12976a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f12974h = map;
        this.f12975i = str;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new a(), Math.max(4000 - (this.f12973g == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f12973g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f12972f = null;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.applovin.internal.f.b().a());
        this.f12972f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f12972f.getSettings().setAllowContentAccess(false);
        a(this.f12972f);
        g.a().c(this.f12972f, this.f12975i);
        for (String str : this.f12974h.keySet()) {
            g.a().a(this.f12972f, this.f12974h.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f12973g = Long.valueOf(f.b());
    }
}
