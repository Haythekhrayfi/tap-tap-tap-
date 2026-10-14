package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r21 f25344a = new r21();

    public final q21 a(RectF rectF, j20 j20Var) {
        List<q21> listC;
        fd.j0.i(rectF, "viewRect");
        fd.j0.i(j20Var, "imageValue");
        RectF rectF2 = new RectF(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, j20Var.e(), j20Var.a());
        y21 y21VarC = j20Var.c();
        Object next = null;
        if (y21VarC == null || (listC = y21VarC.c()) == null) {
            return null;
        }
        Iterator<T> it = listC.iterator();
        if (it.hasNext()) {
            next = it.next();
            while (it.hasNext()) {
                q21 q21Var = (q21) it.next();
                Objects.requireNonNull(this.f25344a);
                next = r21.a((q21) next, q21Var, rectF2, rectF);
            }
        }
        return (q21) next;
    }
}
