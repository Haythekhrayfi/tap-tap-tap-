package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class rq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f24821a = new hp();

    public final LayerDrawable a(Context context, int i10, int i11) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Objects.requireNonNull(this.f24821a);
        int iA = hp.a(context, 6.0f);
        Objects.requireNonNull(this.f24821a);
        int iA2 = hp.a(context, 4.0f);
        Objects.requireNonNull(this.f24821a);
        int iA3 = hp.a(context, 3.0f);
        Objects.requireNonNull(this.f24821a);
        int iA4 = hp.a(context, 12.0f);
        int i12 = ((i11 + 1) * iA2) + (iA * i11);
        float f10 = iA4;
        RectF rectF = new RectF(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, i12, f10);
        float[] fArr = new float[8];
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            fArr[i14] = f10;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
        shapeDrawable.setIntrinsicWidth(i12);
        shapeDrawable.setIntrinsicHeight(iA4);
        shapeDrawable.getPaint().setColor(-16777216);
        shapeDrawable.setAlpha(102);
        ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i11];
        for (int i15 = 0; i15 < i11; i15++) {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            shapeDrawable2.setIntrinsicHeight(iA);
            shapeDrawable2.setIntrinsicWidth(iA);
            shapeDrawable2.getPaint().setColor(-1);
            if (i15 != i10) {
                shapeDrawable2.setAlpha(102);
            }
            shapeDrawableArr[i15] = shapeDrawable2;
        }
        vc.d0 d0Var = new vc.d0(2);
        d0Var.f36994a.add(shapeDrawable);
        if (i11 > 0) {
            ArrayList<Object> arrayList = d0Var.f36994a;
            arrayList.ensureCapacity(arrayList.size() + i11);
            Collections.addAll(d0Var.f36994a, shapeDrawableArr);
        }
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) d0Var.f36994a.toArray(new ShapeDrawable[d0Var.f36994a.size()]));
        while (i13 < i11) {
            int i16 = iA2 + iA;
            int i17 = i13 + 1;
            layerDrawable.setLayerInset(i17, (i16 * i13) + iA2, iA3, i12 - (i16 * i17), iA3);
            i13 = i17;
        }
        return layerDrawable;
    }
}
