package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import c1.a;
import c1.b;
import c1.c;
import w.e;

/* JADX INFO: loaded from: classes2.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new b();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new a();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new c();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f10, float f11, float f12) {
        return e.a(f11, f10, f12, f10);
    }

    public static float lerp(float f10, float f11, float f12, float f13, float f14) {
        if (f14 < f12) {
            return f10;
        }
        return f14 > f13 ? f11 : lerp(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int lerp(int i10, int i11, float f10) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
