package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.AdError;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uz extends kp0 implements c00 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AdResponse f25761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final sp0 f25762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HashMap f25763m;

    public class a {
        public a(Context context) {
            new WeakReference(context);
        }

        @JavascriptInterface
        public String getBannerInfo() {
            return "{\"isDelicate\": false}";
        }

        @JavascriptInterface
        public void onAdRender(int i10, String str) {
            uz.this.f25762l.a(i10, str);
        }
    }

    public uz(Context context, AdResponse adResponse, k2 k2Var) {
        super(context);
        this.f25761k = adResponse;
        this.f25762l = new sp0(this, new sz(i01.b().a(context)));
        c(context);
    }

    @Override // com.yandex.mobile.ads.impl.kp0, com.yandex.mobile.ads.impl.zz
    public final void a() {
        if (j()) {
            this.f25762l.b();
        } else {
            super.a();
        }
    }

    public final void a(int i10, String str) {
        x60.d("onHtmlWebViewRender, height = " + i10 + ", testTag = " + str, new Object[0]);
        b(i10, str);
        super.a();
    }

    public void b(int i10, String str) {
        if (TextUtils.isEmpty(str) || AdError.UNDEFINED_DOMAIN.equals(str)) {
            return;
        }
        HashMap map = new HashMap();
        this.f25763m = map;
        map.put("test-tag", str);
    }

    @Override // com.yandex.mobile.ads.impl.kp0, com.yandex.mobile.ads.impl.oe
    public String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.c());
        sb2.append(j() ? wi1.f26291a : "");
        return sb2.toString();
    }

    @SuppressLint({"AddJavascriptInterface"})
    public abstract void c(Context context);

    @Override // com.yandex.mobile.ads.impl.kp0, com.yandex.mobile.ads.impl.oe
    public final void e() {
        this.f25762l.a();
        super.e();
    }

    public final Map<String, String> i() {
        HashMap map = this.f25763m;
        return map != null ? map : Collections.emptyMap();
    }

    public final boolean j() {
        return "partner-code".equals(this.f25761k.k());
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        x60.d("Configuration is changed for web view, new config: %s", configuration);
        Object objD = d();
        if (objD != null && (objD instanceof a)) {
            x60.d("Stop JS activity was called", new Object[0]);
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.yandex.mobile.ads.impl.kp0
    public void setHtmlWebViewListener(b00 b00Var) {
        super.setHtmlWebViewListener(b00Var);
        this.f25762l.a(b00Var);
    }
}
