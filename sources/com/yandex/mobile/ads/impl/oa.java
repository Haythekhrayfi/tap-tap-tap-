package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f23745a;

    public oa(float f10) {
        this.f23745a = f10 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? 1.7777778f : f10;
    }

    public final int a(int i10) {
        return Math.round(i10 / this.f23745a);
    }

    public final int b(int i10) {
        return Math.round(i10 * this.f23745a);
    }
}
