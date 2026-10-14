package com.facebook.ads.redexgen.X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N2 extends WebViewClient {
    public final /* synthetic */ N3 A00;

    public N2(N3 n10) {
        this.A00 = n10;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        N3.A02(C06937v.A2e);
        return true;
    }
}
