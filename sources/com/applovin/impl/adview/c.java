package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
class c extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f8503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f8504b;

    public c(b bVar, com.applovin.impl.sdk.o oVar) {
        this.f8503a = oVar.F();
        this.f8504b = bVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (com.applovin.impl.sdk.y.a()) {
            this.f8503a.d("AdWebView", "console.log[" + i10 + "] :" + str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (!com.applovin.impl.sdk.y.a()) {
            return true;
        }
        this.f8503a.b("AdWebView", str);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.y.a()) {
            return true;
        }
        this.f8503a.d("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.y.a()) {
            return true;
        }
        this.f8503a.d("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!com.applovin.impl.sdk.y.a()) {
            return true;
        }
        this.f8503a.d("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        b bVar;
        if (i10 != 100 || (bVar = this.f8504b) == null) {
            return;
        }
        bVar.a(webView);
    }
}
