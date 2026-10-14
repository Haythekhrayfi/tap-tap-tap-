package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f22722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f22723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f22724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f22725d;

    public ll(View view, float f10) {
        this(view, f10, f10, f10, f10);
    }

    public ll(View view, float f10, float f11, float f12, float f13) {
        this.f22722a = view;
        this.f22723b = new RectF();
        this.f22724c = new Path();
        this.f22725d = a(f10, f11, f12, f13);
    }

    private static float[] a(float f10, float f11, float f12, float f13) {
        if (f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f11 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f12 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || f13 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
        }
        return null;
    }

    public final void a() {
        if (this.f22725d != null) {
            int measuredWidth = this.f22722a.getMeasuredWidth();
            int measuredHeight = this.f22722a.getMeasuredHeight();
            int paddingLeft = this.f22722a.getPaddingLeft();
            int paddingTop = this.f22722a.getPaddingTop();
            int paddingRight = measuredWidth - this.f22722a.getPaddingRight();
            int paddingBottom = measuredHeight - this.f22722a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.f22723b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.f22724c.reset();
            this.f22724c.addRoundRect(this.f22723b, this.f22725d, Path.Direction.CW);
        }
    }

    public final void a(Canvas canvas) {
        if (this.f22725d == null || this.f22724c.isEmpty()) {
            return;
        }
        canvas.clipPath(this.f22724c);
    }
}
