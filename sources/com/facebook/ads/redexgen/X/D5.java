package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class D5 extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{40, 67, 75, 78, 71, 70, 2, 86, 81, 2, 83, 87, 71, 84, 91, 2, 87, 80, 70, 71, 84, 78, 91, 75, 80, 73, 2, 79, 71, 70, 75, 67, 2, 69, 81, 70, 71, 69, 85};
    }

    public D5(Throwable th) {
        super(A00(0, 39, 116), th);
    }
}
