package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class tl0 implements bd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl0 f25392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ed1 f25393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oa1<vl0> f25394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ze1 f25395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private hd1 f25396e;

    public class a implements dd1<vl0> {
        private a() {
        }

        public /* synthetic */ a(tl0 tl0Var, int i10) {
            this();
        }

        private void a() {
            if (tl0.this.f25396e != null) {
                tl0.this.f25396e.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void a(sc1<vl0> sc1Var) {
            a();
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void a(sc1<vl0> sc1Var, float f10) {
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void a(sc1<vl0> sc1Var, pd1 pd1Var) {
            ((ft) tl0.this.f25392a).f();
            if (tl0.this.f25396e != null) {
                tl0.this.f25396e.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void b(sc1<vl0> sc1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void c(sc1<vl0> sc1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void d(sc1<vl0> sc1Var) {
            tl0.this.f25393b.b();
            if (tl0.this.f25396e != null) {
                tl0.this.f25396e.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void e(sc1<vl0> sc1Var) {
            tl0.this.f25394c.c();
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void f(sc1<vl0> sc1Var) {
            a();
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void g(sc1<vl0> sc1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void h(sc1<vl0> sc1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void i(sc1<vl0> sc1Var) {
            tl0.this.f25393b.a();
            a();
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void j(sc1<vl0> sc1Var) {
            tl0.this.f25395d.g();
        }

        @Override // com.yandex.mobile.ads.impl.dd1
        public final void k(sc1<vl0> sc1Var) {
            tl0.this.f25395d.c();
        }
    }

    public tl0(Context context, ft ftVar, sc1 sc1Var, im0 im0Var, jd1 jd1Var, eg1 eg1Var, ud1 ud1Var, ze1 ze1Var) {
        this.f25392a = ftVar;
        this.f25395d = ze1Var;
        this.f25393b = new ed1(context, jd1Var);
        oa1<vl0> oa1Var = new oa1<>(context, new hl0(ftVar), im0Var, sc1Var, new zl0(im0Var), new de1(), eg1Var, ud1Var, new a(this, 0));
        this.f25394c = oa1Var;
        oa1Var.a(jd1Var);
    }

    @Override // com.yandex.mobile.ads.impl.bd1
    public final void a(hd1 hd1Var) {
        this.f25396e = hd1Var;
    }

    @Override // com.yandex.mobile.ads.impl.bd1
    public final void play() {
        this.f25394c.d();
    }

    @Override // com.yandex.mobile.ads.impl.bd1
    public final void stop() {
        this.f25394c.b();
        ((ft) this.f25392a).l();
    }
}
