package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1186Rx extends K4 {
    public static byte[] A02;
    public final /* synthetic */ C7I A00;
    public final /* synthetic */ C06746z A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public C1186Rx(C7I c7i, C06746z c06746z) {
        this.A00 = c7i;
        this.A01 = c06746z;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (this.A00.A0B.getState() == QO.A02 && this.A00.A0B.getCurrentPositionInMillis() == A00()) {
            this.A00.A0G(A00(0, 22, 11));
        }
    }
}
