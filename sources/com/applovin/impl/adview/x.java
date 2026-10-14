package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.sdk.ab;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class x extends ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f8629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<a> f8630b;

    public interface a {
        void a(Uri uri, w wVar);

        void a(w wVar);

        void b(w wVar);

        void c(w wVar);

        void d(w wVar);
    }

    public x(com.applovin.impl.sdk.o oVar) {
        this.f8629a = oVar.F();
    }

    private void a(WebView webView, String str) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f8629a.c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str == null || !(webView instanceof w)) {
            return;
        }
        w wVar = (w) webView;
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        a aVar = this.f8630b.get();
        if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && aVar != null) {
            if ("/track_click".equals(path)) {
                aVar.a(wVar);
                return;
            }
            if ("/close_ad".equals(path)) {
                aVar.b(wVar);
                return;
            }
            if ("/skip_ad".equals(path)) {
                aVar.c(wVar);
                return;
            }
            if ("/install".equals(path)) {
                aVar.d(wVar);
                return;
            }
            if ("/load_url".equals(path)) {
                aVar.a(uri, wVar);
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f8629a.d("WebViewButtonClient", "Unknown URL: " + str);
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f8629a.d("WebViewButtonClient", "Path: " + path);
            }
        }
    }

    public void a(WeakReference<a> weakReference) {
        this.f8630b = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }
}
