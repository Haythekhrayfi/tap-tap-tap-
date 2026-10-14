package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.google.android.material.color.MaterialColors;
import h0.e;
import p0.q0;
import p0.r0;
import p0.t0;

/* JADX INFO: loaded from: classes2.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(Window window, boolean z10) {
        applyEdgeToEdge(window, z10, null, null);
    }

    public static void applyEdgeToEdge(Window window, boolean z10, Integer num, Integer num2) {
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(color);
            }
            if (z12) {
                num2 = Integer.valueOf(color);
            }
        }
        boolean z13 = !z10;
        if (i10 >= 30) {
            r0.a(window, z13);
        } else {
            q0.a(window, z13);
        }
        int statusBarColor = getStatusBarColor(window.getContext(), z10);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z10);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        boolean zIsUsingLightSystemBar = isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue()));
        boolean zIsUsingLightSystemBar2 = isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue()));
        t0 t0Var = new t0(window, window.getDecorView());
        t0Var.f34437a.b(zIsUsingLightSystemBar);
        t0Var.f34437a.a(zIsUsingLightSystemBar2);
    }

    @TargetApi(21)
    private static int getNavigationBarColor(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return e.e(MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216);
    }

    @TargetApi(21)
    private static int getStatusBarColor(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i10, boolean z10) {
        return MaterialColors.isColorLight(i10) || (i10 == 0 && z10);
    }
}
