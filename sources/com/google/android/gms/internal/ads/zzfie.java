package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfie {
    public static float zza(View view) {
        return view.getZ();
    }

    public static String zzb(View view) {
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
}
