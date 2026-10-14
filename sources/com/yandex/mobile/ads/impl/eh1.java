package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class eh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ph1 f20252a = new ph1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20253b = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver.OnPreDrawListener f20254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f20255b;

        public a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            this.f20254a = onPreDrawListener;
            this.f20255b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f20254a.onPreDraw();
            this.f20255b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    public static int a(int i10, float f10) {
        return Color.argb(Math.max(0, Math.min(255, (int) (((100.0f - f10) * 255.0f) / 100.0f))), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static int a(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    @Deprecated
    public static int a(Context context, float f10) {
        return y11.a(context, 1, f10);
    }

    public static int a(View view) {
        if (view != null && view.isShown()) {
            int iA = view.isShown() ? f20252a.a(view) : 0;
            if (iA > 0) {
                int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
                int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
                if (height > 0 && width > 0) {
                    return (iA * 100) / (height * width);
                }
            }
        }
        return 0;
    }

    public static void a(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, onPreDrawListener));
    }

    public static boolean a(View view, int i10) {
        return a(view) >= i10;
    }

    public static int b(Context context) {
        return (int) (((context.getResources().getDisplayMetrics().heightPixels + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(View view) {
        if (view.isShown()) {
            return f20252a.a(view);
        }
        return 0;
    }

    public static int c(Context context) {
        return (int) (((context.getResources().getDisplayMetrics().widthPixels + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean c(View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int width = view.getWidth() + i10;
        int i11 = iArr[1];
        Rect rect = new Rect(i10, i11, width, view.getHeight() + i11);
        Rect rect2 = new Rect();
        view.getWindowVisibleDisplayFrame(rect2);
        return !((rect.bottom <= rect2.top || rect.top >= rect2.bottom) || (rect.right <= rect2.left || rect.left >= rect2.right));
    }

    public static boolean d(View view) {
        if (view.isShown()) {
            if (view.getAlpha() != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(View view) {
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) ? false : true;
    }
}
