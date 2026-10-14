package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class md1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg1 f23029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23030b;

    public md1(nd1 nd1Var, eg1 eg1Var) {
        this.f23029a = eg1Var;
        this.f23030b = nd1Var.getVolume() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public final void a(float f10) {
        if (f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            if (this.f23030b) {
                return;
            }
            this.f23030b = true;
            this.f23029a.l();
            return;
        }
        if (this.f23030b) {
            this.f23030b = false;
            this.f23029a.a();
        }
    }
}
