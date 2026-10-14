package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class oa1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nd1<T> f23749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sc1<T> f23750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w3 f23751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yd1 f23752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xd1 f23753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cd1<T> f23754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final de1 f23755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final eg1 f23756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final lg1 f23757i;

    public oa1(Context context, nd1<T> nd1Var, lg1 lg1Var, sc1<T> sc1Var, rf1 rf1Var, de1 de1Var, eg1 eg1Var, ud1 ud1Var, dd1<T> dd1Var) {
        this.f23749a = nd1Var;
        this.f23750b = sc1Var;
        this.f23755g = de1Var;
        this.f23756h = eg1Var;
        this.f23757i = lg1Var;
        new wd1(context, sc1Var, lg1Var, de1Var, eg1Var, dd1Var).a(ud1Var);
        w3 w3Var = new w3();
        this.f23751c = w3Var;
        xd1 xd1Var = new xd1(nd1Var, ud1Var);
        this.f23753e = xd1Var;
        yd1 yd1Var = new yd1(context, sc1Var, w3Var, de1Var, lg1Var, rf1Var, eg1Var);
        this.f23752d = yd1Var;
        this.f23754f = new cd1<>(sc1Var, nd1Var, lg1Var, xd1Var, yd1Var, de1Var, w3Var, eg1Var, dd1Var);
    }

    public final void a() {
        this.f23753e.b();
        this.f23749a.a((cd1) null);
        this.f23755g.b();
        this.f23752d.e();
        this.f23751c.a();
    }

    public final void a(fw0.a aVar) {
        this.f23752d.a(aVar);
    }

    public final void a(s30 s30Var) {
        this.f23752d.b(s30Var);
    }

    public final void b() {
        this.f23753e.b();
        this.f23749a.a();
    }

    public final void c() {
        this.f23749a.e();
    }

    public final void d() {
        this.f23749a.a(this.f23754f);
        this.f23749a.a(this.f23750b);
        this.f23751c.b(v3.f25810m);
        View view = this.f23757i.getView();
        if (view != null) {
            this.f23756h.a(view, this.f23757i.a());
        }
        this.f23752d.f();
        this.f23755g.b(ce1.f19477b);
    }

    public final void e() {
        this.f23749a.c();
    }

    public final void f() {
        this.f23749a.b();
    }
}
