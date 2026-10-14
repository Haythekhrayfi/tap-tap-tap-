package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class ln<V extends View, T> implements ra<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final og1<V, T> f22738a;

    public ln(og1<V, T> og1Var) {
        this.f22738a = og1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final void a() {
        View viewB = this.f22738a.b();
        if (viewB != null) {
            this.f22738a.a(viewB);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final void a(qa<T> qaVar, rg1 rg1Var) {
        this.f22738a.a(qaVar, rg1Var, qaVar.d());
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final boolean a(T t10) {
        View viewB = this.f22738a.b();
        return viewB != null && this.f22738a.a(viewB, t10);
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final boolean b() {
        return this.f22738a.b() != null;
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final ug1 c() {
        View viewB = this.f22738a.b();
        if (viewB != null) {
            return new ug1(viewB);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final void c(T t10) {
        View viewB = this.f22738a.b();
        if (viewB != null) {
            this.f22738a.b(viewB, t10);
            viewB.setVisibility(0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final boolean d() {
        return eh1.a(this.f22738a.b(), 100);
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final void destroy() {
    }

    @Override // com.yandex.mobile.ads.impl.ra
    public final boolean e() {
        View viewB = this.f22738a.b();
        if (viewB == null || eh1.d(viewB)) {
            return false;
        }
        return !(viewB.getWidth() < 1 || viewB.getHeight() < 1);
    }
}
