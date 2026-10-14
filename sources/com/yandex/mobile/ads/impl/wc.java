package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class wc {
    public static String a(RectF rectF, j20 j20Var) {
        yc ycVarA;
        y21 y21VarC;
        q21 q21VarB;
        float fWidth;
        int iC;
        fd.j0.i(rectF, "viewRect");
        fd.j0.i(j20Var, "imageValue");
        y21 y21VarC2 = j20Var.c();
        if (y21VarC2 == null || (ycVarA = y21VarC2.a()) == null || (y21VarC = j20Var.c()) == null || (q21VarB = y21VarC.b()) == null) {
            return null;
        }
        float fWidth2 = rectF.width();
        float fHeight = rectF.height();
        float fE = j20Var.e();
        float fA = j20Var.a();
        float fC = q21VarB.c();
        float fB = q21VarB.b();
        if (fWidth2 == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return null;
        }
        if (fHeight == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return null;
        }
        if (fE == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return null;
        }
        if (fA == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return null;
        }
        if (fC == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return null;
        }
        if (fB == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return null;
        }
        if (rectF.width() / rectF.height() > ((float) (q21VarB.c() / q21VarB.b()))) {
            fWidth = rectF.height();
            iC = q21VarB.b();
        } else {
            fWidth = rectF.width();
            iC = q21VarB.c();
        }
        float f10 = fWidth2 / fHeight;
        if (fWidth / iC <= 1.0f) {
            if (f10 > fC / fB) {
                if (!fd.j0.d(ycVarA.c(), ycVarA.b())) {
                    return null;
                }
                return ycVarA.c();
            }
            if (!fd.j0.d(ycVarA.d(), ycVarA.a())) {
                return null;
            }
            return ycVarA.d();
        }
        if (f10 > fE / fA) {
            if (!fd.j0.d(ycVarA.c(), ycVarA.b())) {
                return null;
            }
            return ycVarA.c();
        }
        if (!fd.j0.d(ycVarA.d(), ycVarA.a())) {
            return null;
        }
        return ycVarA.d();
    }

    public static boolean a(j20 j20Var) {
        yc ycVarA;
        fd.j0.i(j20Var, "imageValue");
        y21 y21VarC = j20Var.c();
        if (y21VarC == null || (ycVarA = y21VarC.a()) == null) {
            return false;
        }
        return (ycVarA.a() != null && ycVarA.d() != null && fd.j0.d(ycVarA.a(), ycVarA.d())) || (ycVarA.b() != null && ycVarA.c() != null && fd.j0.d(ycVarA.b(), ycVarA.c()));
    }
}
