package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class cd1<T> implements qd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sc1<T> f19448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nd1<T> f19449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yd1 f19450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xd1 f19451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dd1<T> f19452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ng1 f19453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final de1 f19454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w3 f19455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final eg1 f19456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private md1 f19457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19459l;

    public cd1(sc1<T> sc1Var, nd1<T> nd1Var, lg1 lg1Var, xd1 xd1Var, yd1 yd1Var, de1 de1Var, w3 w3Var, eg1 eg1Var, dd1<T> dd1Var) {
        this.f19448a = sc1Var;
        this.f19449b = nd1Var;
        this.f19451d = xd1Var;
        this.f19450c = yd1Var;
        this.f19452e = dd1Var;
        this.f19454g = de1Var;
        this.f19455h = w3Var;
        this.f19456i = eg1Var;
        this.f19453f = tg0.a(lg1Var);
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void a() {
        if (this.f19459l) {
            this.f19454g.b(ce1.f19479d);
            this.f19456i.j();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void a(pd1 pd1Var) {
        this.f19459l = false;
        this.f19458k = false;
        this.f19454g.b(this.f19454g.a(ce1.f19478c) ? ce1.f19484i : ce1.f19485j);
        this.f19451d.b();
        this.f19450c.a(pd1Var);
        this.f19456i.a(pd1Var);
        this.f19452e.a(this.f19448a, pd1Var);
        this.f19449b.a((cd1) null);
        this.f19452e.g(this.f19448a);
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void b() {
        if (this.f19459l) {
            this.f19454g.b(ce1.f19483h);
            this.f19456i.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void c() {
        this.f19459l = true;
        this.f19454g.b(ce1.f19479d);
        if (this.f19453f.a()) {
            this.f19458k = true;
            this.f19456i.a(this.f19449b.d());
        }
        this.f19451d.a();
        this.f19457j = new md1(this.f19449b, this.f19456i);
        this.f19452e.d(this.f19448a);
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void d() {
        this.f19459l = false;
        this.f19458k = false;
        this.f19454g.b(ce1.f19481f);
        this.f19456i.b();
        this.f19451d.b();
        this.f19450c.c();
        this.f19452e.i(this.f19448a);
        this.f19449b.a((cd1) null);
        this.f19452e.g(this.f19448a);
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void e() {
        this.f19456i.g();
        this.f19459l = false;
        this.f19458k = false;
        this.f19454g.b(ce1.f19480e);
        this.f19451d.b();
        this.f19450c.d();
        this.f19452e.f(this.f19448a);
        this.f19449b.a((cd1) null);
        this.f19452e.g(this.f19448a);
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void f() {
        this.f19454g.b(ce1.f19479d);
        if (this.f19458k) {
            this.f19456i.c();
        } else if (this.f19453f.a()) {
            this.f19458k = true;
            this.f19456i.a(this.f19449b.d());
        }
        this.f19451d.a();
        this.f19452e.h(this.f19448a);
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void g() {
        this.f19456i.e();
        this.f19459l = false;
        this.f19458k = false;
        this.f19454g.b(ce1.f19480e);
        this.f19451d.b();
        this.f19450c.d();
        this.f19452e.a(this.f19448a);
        this.f19449b.a((cd1) null);
        this.f19452e.g(this.f19448a);
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void h() {
        this.f19454g.b(ce1.f19478c);
        this.f19455h.a(v3.f25810m);
        this.f19452e.e(this.f19448a);
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void i() {
        this.f19454g.b(ce1.f19482g);
        if (this.f19458k) {
            this.f19456i.d();
        }
        this.f19452e.b(this.f19448a);
    }

    @Override // com.yandex.mobile.ads.impl.qd1
    public final void onVolumeChanged(float f10) {
        this.f19456i.a(f10);
        md1 md1Var = this.f19457j;
        if (md1Var != null) {
            md1Var.a(f10);
        }
        this.f19452e.a(this.f19448a, f10);
    }
}
