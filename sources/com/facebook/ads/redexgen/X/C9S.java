package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9S {
    public static String A00;
    public static byte[] A01;
    public static final HashSet<String> A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-15, -7, -7, -15, -72, -17, 2, -7, -72, -19, -7, -4, -17};
    }

    static {
        A02();
        A02 = new HashSet<>();
        A00 = A01(0, 13, 88);
    }

    public static synchronized String A00() {
        return A00;
    }
}
