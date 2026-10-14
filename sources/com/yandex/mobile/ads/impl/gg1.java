package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gg1 implements eg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg1 f21027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21029c;

    public gg1(ek ekVar) {
        fd.j0.i(ekVar, "videoTracker");
        this.f21027a = ekVar;
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a() {
        this.f21027a.a();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(float f10) {
        this.f21027a.a(f10);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(long j10) {
        this.f21027a.a(j10);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(View view, List<qc1> list) {
        fd.j0.i(view, "view");
        fd.j0.i(list, "friendlyOverlays");
        this.f21027a.a(view, list);
        this.f21028b = false;
        this.f21029c = false;
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(eg1.a aVar) {
        fd.j0.i(aVar, "quartile");
        this.f21027a.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(pd1 pd1Var) {
        fd.j0.i(pd1Var, "error");
        this.f21027a.a(pd1Var);
        k();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(String str) {
        fd.j0.i(str, "assetName");
        this.f21027a.a(str);
        h();
        n();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void b() {
        this.f21027a.b();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void c() {
        this.f21027a.c();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void d() {
        this.f21027a.d();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void e() {
        this.f21027a.e();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void f() {
        this.f21027a.f();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void g() {
        this.f21027a.g();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void h() {
        if (this.f21028b) {
            return;
        }
        this.f21028b = true;
        this.f21027a.h();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void i() {
        this.f21027a.i();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void j() {
        this.f21027a.j();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void k() {
        this.f21027a.k();
        this.f21028b = false;
        this.f21029c = false;
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void l() {
        this.f21027a.l();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void m() {
        this.f21027a.m();
        h();
        n();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void n() {
        if (this.f21029c) {
            return;
        }
        this.f21029c = true;
        this.f21027a.n();
    }
}
