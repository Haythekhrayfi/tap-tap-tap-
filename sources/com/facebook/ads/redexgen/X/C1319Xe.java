package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1319Xe implements QV {
    public static byte[] A01;
    public final C1336Xv A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, 21, 21, 18, -45, -8, 21, Ascii.ESC, Ascii.SUB, 15, 20, 13, -45, -6, 21, 17, 11, 20, 102, 100, 86, 99, Ascii.RS, 82, 88, 86, 95, 101};
    }

    public C1319Xe(C1336Xv c1336Xv) {
        this.A00 = c1336Xv;
    }

    @Override // com.facebook.ads.redexgen.X.QV
    public final Map<String, String> A5j(boolean z10) {
        HashMap map = new HashMap();
        if (!AnonymousClass60.A00().A04()) {
            map.put(A00(0, 23, 39), C8Q.A00().A01(this.A00, true).A0A());
        }
        map.put(A00(23, 10, 114), C8U.A06(new AnonymousClass85(this.A00), this.A00, z10));
        return map;
    }
}
