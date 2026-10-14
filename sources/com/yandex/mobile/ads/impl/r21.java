package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public final class r21 {
    public static q21 a(q21 q21Var, q21 q21Var2, RectF rectF, RectF rectF2) {
        fd.j0.i(q21Var, "first");
        fd.j0.i(q21Var2, "second");
        fd.j0.i(rectF, "imageSize");
        fd.j0.i(rectF2, "viewSize");
        float fA = u21.a(q21Var, rectF2, rectF);
        float fA2 = u21.a(q21Var2, rectF2, rectF);
        if (fA == Float.MAX_VALUE) {
            return q21Var2;
        }
        if (fA == fA2) {
            return q21Var.a() > q21Var2.a() ? q21Var : q21Var2;
        }
        return fA > fA2 ? q21Var2 : q21Var;
    }
}
