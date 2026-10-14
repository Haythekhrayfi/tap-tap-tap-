package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class B9 extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{47, 7, 6, 11, 3, 66, 6, 13, 7, 17, 66, 12, 13, 22, 66, 17, 23, 18, 18, 13, 16, 22, 66, 23, 23, 11, 6, 88, 66};
    }

    public B9(UUID uuid) {
        super(A00(0, 29, 29) + uuid);
    }
}
