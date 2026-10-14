package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3W, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3W {
    public static String[] A01 = {"el7YtyQobuGYp8qUnEWwGAo9eb5IMR8f", "BjlmtcQqBka41jhChDLZKaESgBphWA9m", "aKAY7r1GVGPP18xn5ioe", "SajdHZC8", "nRs3vifuwuv", "vQYmc1GWKj3CI1v3wMvKFH0VmcpB3A8S", "tuFyi1rHy9z46G0g3HP9J8Pe4WgIo7s9", "jDUjvWDGqsgivCcWfJbzlnhujFfNRoy6"};
    public final Object A00;

    public C3W(Object obj) {
        this.A00 = obj;
    }

    public static C3W A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C3W(obj);
    }

    public static Object A01(C3W c3w) {
        if (c3w == null) {
            return null;
        }
        return c3w.A00;
    }

    public final int A02() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public final int A03() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public final int A04() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetRight();
        }
        return 0;
    }

    public final int A05() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetTop();
        }
        return 0;
    }

    public final C3W A06(int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C3W(((WindowInsets) this.A00).replaceSystemWindowInsets(i10, i11, i12, i13));
        }
        return null;
    }

    public final boolean A07() {
        if (Build.VERSION.SDK_INT >= 21) {
            Object obj = this.A00;
            if (A01[7].charAt(25) != 'F') {
                throw new RuntimeException();
            }
            A01[7] = "MrGsAgnRdViYEdRwgZNSAOYKXFurzaLs";
            return ((WindowInsets) obj).isConsumed();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3W c3w = (C3W) obj;
        Object obj2 = this.A00;
        if (obj2 == null) {
            return c3w.A00 == null;
        }
        return obj2.equals(c3w.A00);
    }

    public final int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
