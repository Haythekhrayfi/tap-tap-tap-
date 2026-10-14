package com.applovin.impl.sdk;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ab extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        HashMap mapA = com.applovin.impl.mediation.b.a.c.a("top_main_method", "onRenderProcessGone");
        if (com.applovin.impl.sdk.utils.h.g()) {
            mapA.put("source", renderProcessGoneDetail.didCrash() ? AppMeasurement.CRASH_ORIGIN : "non_crash");
            mapA.put("details", "renderer_priority_at_exit=" + renderProcessGoneDetail.rendererPriorityAtExit());
        }
        o.f10977a.ag().a(s.a.WEB_VIEW_ERROR, mapA, ((Long) o.f10977a.a(com.applovin.impl.sdk.c.b.dU)).longValue());
        y.f("RenderProcessGoneHandlingWebViewClient", "onRenderProcessGone() handled");
        return true;
    }
}
