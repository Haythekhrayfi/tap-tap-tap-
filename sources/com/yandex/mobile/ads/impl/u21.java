package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class u21 {
    public static final float a(q21 q21Var, RectF rectF, RectF rectF2) {
        fd.j0.i(q21Var, "<this>");
        fd.j0.i(rectF, "view");
        fd.j0.i(rectF2, "image");
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        float fHeight2 = rectF2.height();
        float fWidth2 = rectF2.width();
        if (!(fHeight == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
            if (!(fWidth == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
                if (!(fHeight2 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
                    if (!(fWidth2 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
                        float fMin = Math.min(1.0f, fWidth2 / fHeight2 > fWidth / fHeight ? fHeight / fHeight2 : fWidth / fWidth2);
                        if (fWidth >= ((int) (q21Var.c() * fMin)) && fHeight >= ((int) (q21Var.b() * fMin))) {
                            return Math.abs(fHeight - (q21Var.b() * fMin)) + Math.abs(fWidth - (q21Var.c() * fMin));
                        }
                    }
                }
            }
        }
        return Float.MAX_VALUE;
    }
}
