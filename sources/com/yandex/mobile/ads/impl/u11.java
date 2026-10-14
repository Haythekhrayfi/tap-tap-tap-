package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class u11 implements t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1 f25537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u5 f25538b;

    public class a implements u1 {
        private a() {
        }

        public /* synthetic */ a(u11 u11Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.u1
        public final void a() {
            if (u11.this.f25538b != null) {
                u11.this.f25538b.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.u1
        public final void b() {
        }

        @Override // com.yandex.mobile.ads.impl.u1
        public final void d() {
        }

        @Override // com.yandex.mobile.ads.impl.u1
        public final void e() {
            if (u11.this.f25538b != null) {
                u11.this.f25538b.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.u1
        public final void g() {
            if (u11.this.f25538b != null) {
                u11.this.f25538b.a();
            }
        }
    }

    public u11(Context context, w50 w50Var, d40 d40Var, p40 p40Var, s40 s40Var, x1 x1Var) {
        a aVar = new a(this, 0);
        t1 t1Var = new t1(context, w50Var, d40Var, p40Var, s40Var, x1Var);
        this.f25537a = t1Var;
        t1Var.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void a(ec1 ec1Var) {
        this.f25537a.a(ec1Var);
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void a(u5 u5Var) {
        this.f25538b = u5Var;
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void c() {
        this.f25537a.b();
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void f() {
        this.f25537a.c();
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void prepare() {
        this.f25537a.d();
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void resume() {
        this.f25537a.f();
    }

    @Override // com.yandex.mobile.ads.impl.t5
    public final void start() {
        this.f25537a.g();
    }
}
