package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06988a {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static InterfaceC07008c A00(C1336Xv c1336Xv) {
        try {
            return new XM(c1336Xv);
        } catch (IOException e10) {
            c1336Xv.A07().A9K(A02(0, 15, 89), C06937v.A2J, new C06947w(e10));
            return new XP();
        }
    }

    public static C0817Dk A01(C1336Xv c1336Xv) {
        return new C0817Dk(c1336Xv);
    }
}
