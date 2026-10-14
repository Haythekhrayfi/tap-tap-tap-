package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oe extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f23779a;

    public oe(Context context) {
        super(context);
        f();
    }

    private void f() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        if (u6.a(11)) {
            settings.setAllowContentAccess(false);
            if (u6.a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    public final void a(String str) {
        StringBuilder sbA = v60.a(str);
        sbA.append(c());
        sbA.append("<body style='margin:0; padding:0;'>");
        loadDataWithBaseURL("https://yandex.ru", sbA.toString(), "text/html", "UTF-8", null);
    }

    @Override // android.webkit.WebView
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public final void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
        if (this.f23779a == null) {
            this.f23779a = new HashMap();
        }
        this.f23779a.put(str, obj);
    }

    public String c() {
        return "";
    }

    public final Object d() {
        HashMap map = this.f23779a;
        if (map != null) {
            return map.get("AdPerformActionsJSI");
        }
        return null;
    }

    public void e() {
        int i10 = eh1.f20253b;
        try {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
            }
        } catch (Exception unused) {
        }
        try {
            removeAllViews();
        } catch (Exception unused2) {
        }
        HashMap map = this.f23779a;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                removeJavascriptInterface((String) it.next());
            }
            this.f23779a.clear();
        }
        destroy();
        x60.f("WebView component <%s> was destroyed", getClass().toString());
    }

    public final void g() {
        if (u6.a(11)) {
            getSettings().setDisplayZoomControls(false);
        }
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (u6.a(11)) {
            super.removeJavascriptInterface(str);
        }
    }
}
