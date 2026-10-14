package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GradientDrawable f22620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ColorDrawable f22621b;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ff303030"), Color.parseColor("#ff181818"), Color.parseColor("#ff000000")});
        gradientDrawable.setCornerRadius(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        f22620a = gradientDrawable;
        f22621b = new ColorDrawable(Color.parseColor("#ff000000"));
    }
}
