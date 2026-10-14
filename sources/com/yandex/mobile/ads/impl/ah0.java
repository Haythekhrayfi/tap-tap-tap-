package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class ah0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ug0 f18936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18937b;

    public ah0(ug0 ug0Var, long j10) {
        fd.j0.i(ug0Var, "multiBannerAutoSwipeController");
        this.f18936a = ug0Var;
        this.f18937b = j10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        fd.j0.i(view, "v");
        this.f18936a.a(this.f18937b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        fd.j0.i(view, "v");
        this.f18936a.b();
    }
}
