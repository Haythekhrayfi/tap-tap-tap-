package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class se0 implements t5, ur0, u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re0 f25056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sr0 f25057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.yandex.mobile.ads.instream.d f25058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x1 f25059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f25060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ec1 f25061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u5 f25062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t1 f25063h;

    public class a implements gf1 {
        private a() {
        }

        public /* synthetic */ a(se0 se0Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.gf1
        public final void a() {
            se0.this.f25057b.b();
            if (se0.this.f25063h != null) {
                se0.this.f25063h.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.gf1
        public final void onVideoCompleted() {
            se0.a(se0.this);
            se0.this.f25057b.b();
            se0.this.f25058c.a(null);
            if (se0.this.f25062g != null) {
                se0.this.f25062g.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.gf1
        public final void onVideoError() {
            se0.this.f25057b.b();
            se0.this.f25058c.a(null);
            if (se0.this.f25063h != null) {
                se0.this.f25063h.c();
            }
            if (se0.this.f25062g != null) {
                se0.this.f25062g.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.gf1
        public final void onVideoPaused() {
            se0.this.f25057b.b();
        }

        @Override // com.yandex.mobile.ads.impl.gf1
        public final void onVideoResumed() {
            se0.this.f25057b.a();
        }
    }

    public se0(Context context, g40 g40Var, x1 x1Var, d40 d40Var, p40 p40Var, s40 s40Var, com.yandex.mobile.ads.instream.e eVar, com.yandex.mobile.ads.instream.d dVar) {
        this.f25058c = dVar;
        this.f25059d = x1Var;
        ec1 ec1Var = new ec1();
        this.f25061f = ec1Var;
        this.f25056a = new re0(context, x1Var, d40Var, p40Var, s40Var, ec1Var);
        this.f25060e = new a(this, 0);
        this.f25057b = new tr0(eVar, x1Var).a(g40Var, this);
    }

    public static void a(se0 se0Var) {
        t1 t1Var = se0Var.f25063h;
        if (t1Var != null) {
            t1Var.a((u1) null);
            se0Var.f25063h.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.u1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void a(ec1 ec1Var) {
        this.f25061f.a(ec1Var);
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void a(u5 u5Var) {
        this.f25062g = u5Var;
    }

    public final void a(w50 w50Var) {
        t1 t1VarA = this.f25056a.a(w50Var);
        t1 t1Var = this.f25063h;
        if (t1VarA != t1Var && t1Var != null) {
            t1Var.a((u1) null);
            this.f25063h.e();
        }
        this.f25063h = t1VarA;
        t1VarA.a(this);
        this.f25063h.g();
    }

    @Override // com.yandex.mobile.ads.impl.u1
    public final void b() {
    }

    public final void b(w50 w50Var) {
        t1 t1VarA = this.f25056a.a(w50Var);
        t1 t1Var = this.f25063h;
        if (t1VarA != t1Var && t1Var != null) {
            t1Var.a((u1) null);
            this.f25063h.e();
        }
        this.f25063h = t1VarA;
        t1VarA.a(this);
        this.f25063h.d();
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void c() {
        this.f25057b.b();
        t1 t1Var = this.f25063h;
        if (t1Var != null) {
            t1Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.u1
    public final void d() {
        this.f25058c.c();
    }

    @Override // com.yandex.mobile.ads.impl.u1
    public final void e() {
        this.f25063h = null;
        this.f25058c.e();
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void f() {
        this.f25057b.b();
        t1 t1Var = this.f25063h;
        if (t1Var != null) {
            t1Var.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.u1
    public final void g() {
        this.f25063h = null;
        this.f25058c.e();
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void prepare() {
        u5 u5Var = this.f25062g;
        if (u5Var != null) {
            u5Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void resume() {
        boolean z10 = this.f25063h != null;
        boolean zA = this.f25059d.a();
        if (!z10) {
            this.f25058c.e();
            return;
        }
        com.yandex.mobile.ads.instream.d dVar = this.f25058c;
        if (zA) {
            dVar.c();
            this.f25063h.f();
        } else {
            dVar.e();
            this.f25063h.d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void start() {
        this.f25058c.a(this.f25060e);
        this.f25058c.e();
    }
}
