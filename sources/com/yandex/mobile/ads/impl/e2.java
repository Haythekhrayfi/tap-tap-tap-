package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e2 extends oe {

    public final class a extends WebChromeClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f20030a;

        public a(Context context) {
            this.f20030a = new WeakReference<>(context);
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            e2 e2Var = e2.this;
            WeakReference<Context> weakReference = this.f20030a;
            Objects.requireNonNull(e2Var);
            c cVar = weakReference.get() instanceof c ? (c) weakReference.get() : null;
            if (cVar != null) {
                cVar.a(webView, i10);
            }
        }
    }

    public final class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f20032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bj1 f20033b = wy0.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v91 f20034c = new v91();

        public b(Context context) {
            this.f20032a = new WeakReference<>(context);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            e2 e2Var = e2.this;
            WeakReference<Context> weakReference = this.f20032a;
            Objects.requireNonNull(e2Var);
            c cVar = weakReference.get() instanceof c ? (c) weakReference.get() : null;
            if (cVar != null) {
                cVar.e();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            e2 e2Var = e2.this;
            WeakReference<Context> weakReference = this.f20032a;
            Objects.requireNonNull(e2Var);
            c cVar = weakReference.get() instanceof c ? (c) weakReference.get() : null;
            if (cVar != null) {
                cVar.h();
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"WebViewClientOnReceivedSslError"})
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (this.f20033b.a(webView.getContext(), sslError)) {
                sslErrorHandler.proceed();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (t91.b(str) || !URLUtil.isNetworkUrl(str)) {
                return this.f20034c.a(webView.getContext(), str);
            }
            return false;
        }
    }

    public interface c {
        void a(WebView webView, int i10);

        void e();

        void h();
    }

    public e2(Context context) throws Throwable {
        super(context);
        a(context);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(Context context) {
        setBackgroundColor(-1);
        setInitialScale(1);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        g();
        setScrollbarFadingEnabled(true);
        setDrawingCacheEnabled(true);
        setWebChromeClient(new a(context));
        setWebViewClient(new b(context));
    }
}
