package com.yandex.mobile.ads.impl;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cz0 f21121a = new cz0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lz0 f21122b = new lz0();

    /* JADX WARN: Code duplicated, block: B:13:0x002b A[RETURN, SYNTHETIC] */
    private boolean a(Context context, double d10) {
        if (u6.a(13)) {
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                return false;
            }
            return true;
        }
        if (d10 >= 15.0d) {
            Objects.requireNonNull(this.f21121a);
            if (!cz0.a(context)) {
                return true;
            }
        }
        return false;
    }

    public final int a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point pointA = this.f21122b.a(context);
        int i10 = pointA.x;
        int i11 = pointA.y;
        float f10 = displayMetrics.density;
        float f11 = i10;
        float f12 = i11;
        float fMin = Math.min(f11 / f10, f12 / f10);
        float f13 = f10 * 160.0f;
        float f14 = f11 / f13;
        float f15 = f12 / f13;
        double dSqrt = Math.sqrt((f15 * f15) + (f14 * f14));
        if (a(context, dSqrt)) {
            return 3;
        }
        return (dSqrt >= 7.0d || fMin >= 600.0f) ? 2 : 1;
    }
}
