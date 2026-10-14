package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.ImagesContract;

/* JADX INFO: loaded from: classes3.dex */
public class yz extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zz f27161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aj1 f27162b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yz(zz zzVar) {
        this(zzVar, 0);
        fd.j0.i(zzVar, "webViewClientListener");
    }

    public /* synthetic */ yz(zz zzVar, int i10) {
        this(zzVar, wy0.b());
    }

    public yz(zz zzVar, aj1 aj1Var) {
        fd.j0.i(zzVar, "webViewClientListener");
        fd.j0.i(aj1Var, "webViewSslErrorHandler");
        this.f27161a = zzVar;
        this.f27162b = aj1Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        fd.j0.i(webView, "view");
        fd.j0.i(str, ImagesContract.URL);
        super.onPageFinished(webView, str);
        this.f27161a.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        fd.j0.i(webView, "view");
        fd.j0.i(str, "description");
        fd.j0.i(str2, "failingUrl");
        this.f27161a.a(i10);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        fd.j0.i(webResourceError, "error");
        this.f27161a.a(webResourceError.getErrorCode());
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"WebViewClientOnReceivedSslError"})
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        fd.j0.i(webView, "view");
        fd.j0.i(sslErrorHandler, "handler");
        fd.j0.i(sslError, "error");
        aj1 aj1Var = this.f27162b;
        Context context = webView.getContext();
        fd.j0.h(context, "view.context");
        if (aj1Var.a(context, sslError)) {
            sslErrorHandler.proceed();
        } else {
            this.f27161a.a(-11);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        fd.j0.i(webView, "view");
        fd.j0.i(str, ImagesContract.URL);
        zz zzVar = this.f27161a;
        Context context = webView.getContext();
        fd.j0.h(context, "view.context");
        zzVar.a(context, str);
        return true;
    }
}
