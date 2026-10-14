package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class jm1 extends b6 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public jm1(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
