package com.yandex.mobile.ads.impl;

import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class ln1 {
    public static float a(View view) {
        return view.getZ();
    }

    public static boolean b(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                return false;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return true;
    }

    public static String c(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility != 4) {
                return visibility != 8 ? "viewNotVisible" : "viewGone";
            }
            return "viewInvisible";
        }
        if (view.getAlpha() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return "viewAlphaZero";
        }
        return null;
    }
}
