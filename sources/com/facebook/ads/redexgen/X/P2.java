package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class P2 {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C1D A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-27, -29, -12, -26, -27, -16, -10, 12, 10, Ascii.ESC, 13, 18, 23, 13};
    }

    public P2(int i10, int i11, C1D c1d) {
        this.A01 = i10;
        this.A00 = i11;
        this.A02 = c1d;
    }

    public final int A02() {
        return this.A01;
    }

    public final C1D A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap map = new HashMap();
        StringBuilder sbAppend = new StringBuilder().append(this.A01);
        String strA00 = A00(0, 0, 12);
        map.put(A00(7, 7, 94), sbAppend.append(strA00).toString());
        map.put(A00(0, 7, 55), this.A00 + strA00);
        return map;
    }
}
