package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum C2G {
    A05(A00(22, 6, 6)),
    A03(A00(14, 4, 124)),
    A04(A00(18, 4, 24));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{66, 67, 78, 79, 15, 14, 15, 4, 91, 76, 89, 70, 91, 93, 119, 118, 123, 122, 21, 20, 21, Ascii.RS, 23, 0, 21, 10, 23, 17};
    }

    static {
        A01();
    }

    C2G(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
