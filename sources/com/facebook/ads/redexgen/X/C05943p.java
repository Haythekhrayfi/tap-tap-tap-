package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05943p {
    public static final C05933o A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new Z1();
        } else {
            A00 = new C05933o();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f10, float f11) {
        A00.A00(edgeEffect, f10, f11);
    }
}
