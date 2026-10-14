package com.iab.omid.library.applovin.utils;

import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static View b(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static float c(View view) {
        return view.getZ();
    }

    public static boolean d(View view) {
        return a(view) == null;
    }

    public static boolean e(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                return false;
            }
            view = b(view);
        }
        return true;
    }
}
