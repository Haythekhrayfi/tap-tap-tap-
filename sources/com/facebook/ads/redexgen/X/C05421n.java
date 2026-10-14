package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C05421n extends WebViewClient {
    public boolean A00 = false;
    public final C1Y A01;
    public final InterfaceC05411m A02;
    public final boolean A03;

    public C05421n(C1Y c1y, InterfaceC05411m interfaceC05411m, boolean z10) {
        this.A01 = c1y;
        this.A02 = interfaceC05411m;
        this.A03 = z10;
    }

    private void A00() {
        if (this.A03) {
            this.A02.ACB(AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        InterfaceC05411m interfaceC05411m = this.A02;
        if (interfaceC05411m != null) {
            interfaceC05411m.ACC();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        new Handler().postDelayed(new C1390Zz(this), this.A01.A08());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        N3.A02(C06937v.A2d);
        A00();
        return true;
    }
}
