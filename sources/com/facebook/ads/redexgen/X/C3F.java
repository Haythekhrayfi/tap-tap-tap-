package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3F {
    public static final C3E A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C0O() { // from class: com.facebook.ads.redexgen.X.04
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C0O();
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C0R();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C05040a();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C05060c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            A00 = new C05351g();
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            A00 = new C3Z();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            A00 = new EK();
        } else if (Build.VERSION.SDK_INT >= 15) {
            A00 = new ZB();
        } else {
            A00 = new C3E();
        }
    }

    public static int A00(View view) {
        return A00.A03(view);
    }

    public static int A01(View view) {
        return A00.A04(view);
    }

    public static int A02(View view) {
        return A00.A05(view);
    }

    public static int A03(View view) {
        return A00.A06(view);
    }

    public static Display A04(View view) {
        return A00.A07(view);
    }

    public static C3W A05(View view, C3W c3w) {
        return A00.A08(view, c3w);
    }

    public static C3W A06(View view, C3W c3w) {
        return A00.A09(view, c3w);
    }

    public static void A07(View view) {
        A00.A0A(view);
    }

    public static void A08(View view) {
        A00.A0B(view);
    }

    public static void A09(View view, int i10) {
        A00.A0C(view, i10);
    }

    public static void A0A(View view, Drawable drawable) {
        A00.A0D(view, drawable);
    }

    public static void A0B(View view, C05732t c05732t) {
        A00.A0E(view, c05732t);
    }

    public static void A0C(View view, InterfaceC05792z interfaceC05792z) {
        A00.A0F(view, interfaceC05792z);
    }

    public static void A0D(View view, Runnable runnable) {
        A00.A0G(view, runnable);
    }

    public static void A0E(View view, Runnable runnable, long j10) {
        A00.A0H(view, runnable, j10);
    }

    public static boolean A0F(View view) {
        return A00.A0K(view);
    }

    public static boolean A0G(View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(View view) {
        return A00.A0J(view);
    }
}
