package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhy extends zzfhx {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfhy(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzi(webView);
    }
}
