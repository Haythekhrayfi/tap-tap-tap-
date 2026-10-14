package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgb extends zzcgc {
    public zzcgb(zzcez zzcezVar, zzawz zzawzVar, boolean z10, zzebl zzeblVar) {
        super(zzcezVar, zzawzVar, z10, zzeblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, null);
    }
}
