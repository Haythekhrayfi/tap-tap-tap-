package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class lz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u51 f22838a = new u51();

    public static Point a(lz0 lz0Var, Display display) {
        Objects.requireNonNull(lz0Var);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    @TargetApi(17)
    public final Point a(Context context) {
        Display defaultDisplay;
        Point point;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Objects.requireNonNull(this.f22838a);
        Point pointA = null;
        if (windowManager != null) {
            try {
                defaultDisplay = windowManager.getDefaultDisplay();
            } catch (Throwable th) {
                x60.a(th, fn1.a("Exception while ", "getting display"), new Object[0]);
                defaultDisplay = null;
            }
            u51 u51Var = this.f22838a;
            point = new Point(0, 0);
            Objects.requireNonNull(u51Var);
            if (defaultDisplay != null) {
                try {
                    pointA = a(this, defaultDisplay);
                } catch (Throwable th2) {
                    x60.a(th2, fn1.a("Exception while ", "getting display metrics"), new Object[0]);
                }
            } else {
                x60.f(fn1.a("Display", " is null."), new Object[0]);
            }
            if (pointA == null) {
                return point;
            }
            return pointA;
        }
        x60.f(fn1.a("WindowManager", " is null."), new Object[0]);
        defaultDisplay = null;
        u51 u51Var2 = this.f22838a;
        point = new Point(0, 0);
        Objects.requireNonNull(u51Var2);
        if (defaultDisplay != null) {
            pointA = a(this, defaultDisplay);
        } else {
            x60.f(fn1.a("Display", " is null."), new Object[0]);
        }
        if (pointA == null) {
            return point;
        }
        return pointA;
    }
}
