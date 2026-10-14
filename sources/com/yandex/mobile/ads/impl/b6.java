package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sm1 f19117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n2 f19118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ub0 f19119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19121e;

    public b6() {
        f();
        this.f19117a = new sm1(null);
    }

    public void a() {
    }

    public final void a(WebView webView) {
        this.f19117a = new sm1(webView);
    }

    public void a(em1 em1Var, y5 y5Var) {
        a(em1Var, y5Var, null);
    }

    public final void a(em1 em1Var, y5 y5Var, JSONObject jSONObject) {
        String strH = em1Var.h();
        JSONObject jSONObject2 = new JSONObject();
        rm1.a(jSONObject2, "environment", "app");
        rm1.a(jSONObject2, "adSessionType", y5Var.a());
        rm1.a(jSONObject2, "deviceInfo", hm1.a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        rm1.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        rm1.a(jSONObject3, "partnerName", y5Var.f().a());
        rm1.a(jSONObject3, "partnerVersion", y5Var.f().b());
        rm1.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        rm1.a(jSONObject4, "libraryVersion", "1.3.26-Yandex");
        rm1.a(jSONObject4, "appId", bn1.a().b().getApplicationContext().getPackageName());
        rm1.a(jSONObject2, "app", jSONObject4);
        if (y5Var.b() != null) {
            rm1.a(jSONObject2, "contentUrl", y5Var.b());
        }
        if (y5Var.c() != null) {
            rm1.a(jSONObject2, "customReferenceData", y5Var.c());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (rb1 rb1Var : y5Var.g()) {
            rm1.a(jSONObject5, rb1Var.b(), rb1Var.c());
        }
        hn1.a(e(), strH, jSONObject2, jSONObject5, jSONObject);
    }

    public final void a(n2 n2Var) {
        this.f19118b = n2Var;
    }

    public final void a(ub0 ub0Var) {
        this.f19119c = ub0Var;
    }

    public final void a(x5 x5Var) {
        hn1.a(e(), x5Var.d());
    }

    public final void a(String str) {
        hn1.a(e(), str, (JSONObject) null);
    }

    public final void a(String str, long j10) {
        if (j10 >= this.f19121e) {
            this.f19120d = 2;
            hn1.a(e(), str);
        }
    }

    public final void a(boolean z10) {
        if (this.f19117a.get() != null) {
            hn1.b(e(), z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.f19117a.clear();
    }

    public final void b(String str, long j10) {
        if (j10 < this.f19121e || this.f19120d == 3) {
            return;
        }
        this.f19120d = 3;
        hn1.a(e(), str);
    }

    public final n2 c() {
        return this.f19118b;
    }

    public final ub0 d() {
        return this.f19119c;
    }

    public final WebView e() {
        return this.f19117a.get();
    }

    public final void f() {
        this.f19121e = System.nanoTime();
        this.f19120d = 1;
    }
}
