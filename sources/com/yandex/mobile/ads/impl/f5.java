package com.yandex.mobile.ads.impl;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
final class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ColorDrawable f20551a = new ColorDrawable(Color.parseColor("#80ffffff"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayerDrawable f20552b;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, 0});
        gradientDrawable.setCornerRadius(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        int i10 = e5.f20069b;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i10, i10});
        gradientDrawable2.setCornerRadius(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        f20552b = layerDrawable;
    }
}
