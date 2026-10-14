package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
final class gn1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f21114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21115c;

    public gn1(WebView webView, String str) {
        this.f21114b = webView;
        this.f21115c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21114b.loadUrl(this.f21115c);
    }
}
