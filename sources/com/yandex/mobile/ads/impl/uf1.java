package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class uf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x11 f25606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x11 f25607b;

    public uf1(x11 x11Var, x11 x11Var2) {
        this.f25606a = x11Var;
        this.f25607b = x11Var2;
    }

    private Matrix a(float f10, float f11, int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f10, f11, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            return matrix;
        }
        if (i11 != 1) {
            return null;
        }
        float fB = this.f25606a.b() / 2.0f;
        float fA = this.f25606a.a() / 2.0f;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f10, f11, fB, fA);
        return matrix2;
    }

    public final Matrix a(int i10) {
        float fB;
        float fA;
        float fMin;
        x11 x11Var = this.f25607b;
        boolean z10 = false;
        if (!(x11Var.b() > 0 && x11Var.a() > 0)) {
            return null;
        }
        x11 x11Var2 = this.f25606a;
        if (x11Var2.b() > 0 && x11Var2.a() > 0) {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            return a(1.0f, 1.0f, 1);
        }
        if (i11 == 1) {
            fB = this.f25606a.b() / this.f25607b.b();
            fA = this.f25606a.a() / this.f25607b.a();
            fMin = Math.min(fB, fA);
        } else {
            if (i11 != 2) {
                return null;
            }
            fB = this.f25606a.b() / this.f25607b.b();
            fA = this.f25606a.a() / this.f25607b.a();
            fMin = Math.max(fB, fA);
        }
        return a(fMin / fB, fMin / fA, 2);
    }
}
