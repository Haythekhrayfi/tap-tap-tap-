package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import android.view.TextureView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class tf1 implements dr0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x11 f25355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x11 f25356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextureView f25357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25358d;

    public final void a(TextureView textureView) {
        this.f25357c = textureView;
        if (this.f25358d == 0 || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f25357c.setTransform(matrix);
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void a(wf1 wf1Var) {
        int i10;
        Matrix matrixA;
        int iRound = wf1Var.f26269a;
        float f10 = wf1Var.f26272d;
        if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            iRound = Math.round(iRound * f10);
        }
        x11 x11Var = new x11(iRound, wf1Var.f26270b);
        this.f25355a = x11Var;
        x11 x11Var2 = this.f25356b;
        if (x11Var2 == null || (i10 = this.f25358d) == 0 || this.f25357c == null || (matrixA = new uf1(x11Var2, x11Var).a(i10)) == null) {
            return;
        }
        this.f25357c.setTransform(matrixA);
    }

    public final void b(int i10) {
        this.f25358d = i10;
        if (i10 == 0 || this.f25357c == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.f25357c.setTransform(matrix);
    }

    @Override // com.yandex.mobile.ads.impl.dr0.b
    public final void onSurfaceSizeChanged(int i10, int i11) {
        int i12;
        Matrix matrixA;
        x11 x11Var = new x11(i10, i11);
        this.f25356b = x11Var;
        x11 x11Var2 = this.f25355a;
        if (x11Var2 == null || (i12 = this.f25358d) == 0 || this.f25357c == null || (matrixA = new uf1(x11Var, x11Var2).a(i12)) == null) {
            return;
        }
        this.f25357c.setTransform(matrixA);
    }
}
