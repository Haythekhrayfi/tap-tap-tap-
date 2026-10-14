package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialAttributes;
import h0.e;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;

    private MaterialColors() {
    }

    public static int compositeARGBWithAlpha(int i10, int i11) {
        return e.e(i10, (Color.alpha(i10) * i11) / 255);
    }

    public static int getColor(Context context, int i10, int i11) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i10);
        return typedValueResolve != null ? typedValueResolve.data : i11;
    }

    public static int getColor(Context context, int i10, String str) {
        return MaterialAttributes.resolveOrThrow(context, i10, str);
    }

    public static int getColor(View view, int i10) {
        return MaterialAttributes.resolveOrThrow(view, i10);
    }

    public static int getColor(View view, int i10, int i11) {
        return getColor(view.getContext(), i10, i11);
    }

    private static int getColorRole(int i10, int i11) {
        Hct hctFromInt = Hct.fromInt(i10);
        hctFromInt.setTone(i11);
        return hctFromInt.toInt();
    }

    public static ColorRoles getColorRoles(int i10, boolean z10) {
        return z10 ? new ColorRoles(getColorRole(i10, 40), getColorRole(i10, 100), getColorRole(i10, 90), getColorRole(i10, 10)) : new ColorRoles(getColorRole(i10, 80), getColorRole(i10, 20), getColorRole(i10, 30), getColorRole(i10, 90));
    }

    public static ColorRoles getColorRoles(Context context, int i10) {
        return getColorRoles(i10, MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true));
    }

    public static int harmonize(int i10, int i11) {
        return Blend.harmonize(i10, i11);
    }

    public static int harmonizeWithPrimary(Context context, int i10) {
        return harmonize(i10, getColor(context, R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(int i10) {
        boolean z10;
        if (i10 != 0) {
            ThreadLocal<double[]> threadLocal = e.f30457a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i10);
            int iGreen = Color.green(i10);
            int iBlue = Color.blue(i10);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d10 = ((double) iRed) / 255.0d;
            double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            double d11 = ((double) iGreen) / 255.0d;
            double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            double d12 = ((double) iBlue) / 255.0d;
            double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
            z10 = false;
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            dArr[1] = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (dArr[1] / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    public static int layer(int i10, int i11) {
        return e.b(i11, i10);
    }

    public static int layer(int i10, int i11, float f10) {
        return layer(i10, e.e(i11, Math.round(Color.alpha(i11) * f10)));
    }

    public static int layer(View view, int i10, int i11) {
        return layer(view, i10, i11, 1.0f);
    }

    public static int layer(View view, int i10, int i11, float f10) {
        return layer(getColor(view, i10), getColor(view, i11), f10);
    }
}
