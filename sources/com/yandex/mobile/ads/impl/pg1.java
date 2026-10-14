package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class pg1<V extends View, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final og1<V, T> f24058a;

    public pg1(og1<V, T> og1Var) {
        this.f24058a = og1Var;
    }

    public final void a() {
        View viewB = this.f24058a.b();
        if (viewB != null) {
            this.f24058a.a(viewB);
        }
    }

    public final void a(qa qaVar, rg1 rg1Var, T t10) {
        if (this.f24058a.b() != null) {
            this.f24058a.a(qaVar, rg1Var, t10);
        }
    }

    public final boolean a(T t10) {
        View viewB = this.f24058a.b();
        return viewB != null && this.f24058a.a(viewB, t10);
    }

    public final void b() {
        this.f24058a.a();
    }

    public final void b(T t10) {
        View viewB = this.f24058a.b();
        if (viewB != null) {
            this.f24058a.b(viewB, t10);
            viewB.setVisibility(0);
        }
    }
}
