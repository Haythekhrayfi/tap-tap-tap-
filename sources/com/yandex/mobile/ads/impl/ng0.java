package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes3.dex */
final class ng0 extends yz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23382c;

    public ng0(zz zzVar) {
        super(zzVar);
    }

    public final void a(String str) {
        this.f23382c = str;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        return (TextUtils.isEmpty(this.f23382c) || (url = webResourceRequest.getUrl()) == null || !"mraid.js".equals(url.getLastPathSegment())) ? super.shouldInterceptRequest(webView, webResourceRequest) : new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(this.f23382c.getBytes()));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }
}
