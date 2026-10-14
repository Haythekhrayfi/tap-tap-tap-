package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1260Uu extends C0893Gk {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{48, 7, 17, 18, 13, 12, 17, 7, 66, 1, 13, 6, 7, 88, 66};
    }

    public C1260Uu(int i10, Map<String, List<String>> map, C0889Ge c0889Ge) {
        super(A00(0, 15, 121) + i10, c0889Ge, 1);
        this.A00 = i10;
        this.A01 = map;
    }
}
