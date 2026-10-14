package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class r5 implements u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v5 f24598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t5 f24599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ec1 f24600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u5 f24601d;

    public r5(t5 t5Var) {
        this.f24599b = t5Var;
        t5Var.a(this);
        ec1 ec1Var = new ec1();
        this.f24600c = ec1Var;
        t5Var.a(ec1Var);
        this.f24598a = new v5();
    }

    @Override // com.yandex.mobile.ads.impl.u5
    public final void a() {
        this.f24598a.a(5);
        u5 u5Var = this.f24601d;
        if (u5Var != null) {
            u5Var.a();
        }
    }

    public final void a(dc1 dc1Var) {
        this.f24600c.a(dc1Var);
    }

    public final void a(u5 u5Var) {
        this.f24601d = u5Var;
    }

    @Override // com.yandex.mobile.ads.impl.u5
    public final void b() {
        this.f24598a.a(2);
        u5 u5Var = this.f24601d;
        if (u5Var != null) {
            u5Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.u5
    public final void c() {
        this.f24598a.a(4);
        u5 u5Var = this.f24601d;
        if (u5Var != null) {
            u5Var.c();
        }
    }

    public final void d() {
        int iA = a6.a(this.f24598a.a());
        if (iA == 0 || iA == 1 || iA == 2) {
            this.f24599b.c();
        }
    }

    public final void e() {
        int iA = a6.a(this.f24598a.a());
        if (iA == 0 || iA == 1 || iA == 2) {
            this.f24599b.f();
        }
    }

    public final void f() {
        u5 u5Var;
        int iA = a6.a(this.f24598a.a());
        if (iA == 0) {
            this.f24599b.prepare();
            return;
        }
        if (iA != 1) {
            if (iA == 4 && (u5Var = this.f24601d) != null) {
                u5Var.a();
                return;
            }
            return;
        }
        u5 u5Var2 = this.f24601d;
        if (u5Var2 != null) {
            u5Var2.b();
        }
    }

    public final void g() {
        u5 u5Var;
        int iA = a6.a(this.f24598a.a());
        if (iA == 0) {
            this.f24599b.prepare();
            return;
        }
        if (iA == 2) {
            this.f24599b.resume();
            return;
        }
        if (iA != 3) {
            if (iA == 4 && (u5Var = this.f24601d) != null) {
                u5Var.a();
                return;
            }
            return;
        }
        u5 u5Var2 = this.f24601d;
        if (u5Var2 != null) {
            u5Var2.c();
        }
    }

    public final void h() {
        u5 u5Var;
        int iA = a6.a(this.f24598a.a());
        if (iA == 0) {
            this.f24599b.prepare();
            return;
        }
        if (iA == 1) {
            this.f24598a.a(3);
            this.f24599b.start();
            return;
        }
        if (iA == 2) {
            this.f24599b.resume();
            return;
        }
        if (iA != 3) {
            if (iA == 4 && (u5Var = this.f24601d) != null) {
                u5Var.a();
                return;
            }
            return;
        }
        u5 u5Var2 = this.f24601d;
        if (u5Var2 != null) {
            u5Var2.c();
        }
    }
}
