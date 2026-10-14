package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class v21 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wc f25793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final te f25794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w21 f25795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j20 f25796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f25797e;

    public v21(wc wcVar, te teVar, w21 w21Var, j20 j20Var, Bitmap bitmap) {
        fd.j0.i(wcVar, "axisBackgroundColorProvider");
        fd.j0.i(teVar, "bestSmartCenterProvider");
        fd.j0.i(w21Var, "smartCenterMatrixScaler");
        fd.j0.i(j20Var, "imageValue");
        fd.j0.i(bitmap, "bitmap");
        this.f25793a = wcVar;
        this.f25794b = teVar;
        this.f25795c = w21Var;
        this.f25796d = j20Var;
        this.f25797e = bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(v21 v21Var, RectF rectF, ImageView imageView) {
        q21 q21VarB;
        fd.j0.i(v21Var, "this$0");
        fd.j0.i(rectF, "$viewRect");
        fd.j0.i(imageView, "$view");
        if (rectF.height() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return;
        }
        wc wcVar = v21Var.f25793a;
        j20 j20Var = v21Var.f25796d;
        Objects.requireNonNull(wcVar);
        if (!wc.a(j20Var)) {
            q21 q21VarA = v21Var.f25794b.a(rectF, v21Var.f25796d);
            if (q21VarA != null) {
                v21Var.f25795c.a(imageView, v21Var.f25797e, q21VarA);
                return;
            }
            return;
        }
        wc wcVar2 = v21Var.f25793a;
        j20 j20Var2 = v21Var.f25796d;
        Objects.requireNonNull(wcVar2);
        String strA = wc.a(rectF, j20Var2);
        y21 y21VarC = v21Var.f25796d.c();
        if (y21VarC == null || (q21VarB = y21VarC.b()) == null) {
            return;
        }
        if (strA != null) {
            v21Var.f25795c.a(imageView, v21Var.f25797e, q21VarB, strA);
        } else {
            v21Var.f25795c.a(imageView, v21Var.f25797e, q21VarB);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        int i18 = i16 - i14;
        boolean z10 = false;
        boolean z11 = (i12 - i10 == i18 && i13 - i11 == i17 - i15) ? false : true;
        if (i13 != i11 && i10 != i12) {
            z10 = true;
        }
        if (z11 && z10) {
            imageView.post(new ap1(this, new RectF(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, imageView.getWidth(), imageView.getHeight()), imageView));
        }
    }
}
