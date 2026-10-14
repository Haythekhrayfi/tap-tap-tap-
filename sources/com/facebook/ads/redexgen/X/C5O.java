package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5O {
    public static C0S A00(Context context, C7S c7s) {
        C1336Xv sdkContext = A07(context);
        C0V c0vA6z = c7s.A6z(sdkContext);
        if (c0vA6z != null) {
            return c0vA6z.A9n();
        }
        return new C1436aj();
    }

    public static C1337Xw A01(Activity activity) {
        return new C1337Xw(activity, (C7S) A08(), A00(activity, A08()));
    }

    public static C1337Xw A02(Context context) {
        return new C1337Xw(context, A08(), new C1436aj());
    }

    public static C1337Xw A03(Context context) {
        return new C1337Xw(context, A08(), A00(context, A08()));
    }

    public static C1337Xw A04(Context context) {
        if (IN.A0s(context)) {
            return new C1337Xw(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static C1337Xw A05(Context context) {
        return new C1337Xw(context, A08(), A00(context, A08()));
    }

    public static C0830Dx A06(Context context) {
        return new C0830Dx(context, A08(), A08().A6z(A07(context)));
    }

    public static C1336Xv A07(Context context) {
        return new C1336Xv(context, A08());
    }

    public static synchronized XU A08() {
        return XU.A02();
    }
}
