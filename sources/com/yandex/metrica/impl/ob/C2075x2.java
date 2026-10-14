package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2075x2 {
    private Point a(Display display) {
        if (display != null) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getRealMetrics(displayMetrics);
                return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public C2050w2 a(Context context) {
        Point pointA;
        Display display;
        try {
            if (U2.a(30)) {
                try {
                    display = context.getDisplay();
                } catch (Throwable unused) {
                    display = null;
                }
            } else {
                display = null;
            }
            if (display == null) {
                display = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            }
            pointA = display != null ? a(display) : null;
        } catch (Throwable unused2) {
        }
        if (pointA == null) {
            return null;
        }
        int iMax = Math.max(pointA.x, pointA.y);
        int iMin = Math.min(pointA.x, pointA.y);
        int i10 = 0;
        float f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            i10 = displayMetrics.densityDpi;
            f10 = displayMetrics.density;
        } catch (Throwable unused3) {
        }
        return new C2050w2(iMax, iMin, i10, f10, C1522b2.a(context, pointA));
    }
}
