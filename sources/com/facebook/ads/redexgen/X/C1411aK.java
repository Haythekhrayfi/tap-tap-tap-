package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1411aK extends K4 {
    public static byte[] A01;
    public final /* synthetic */ C1410aJ A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C1411aK(C1410aJ c1410aJ) {
        this.A00 = c1410aJ;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        this.A00.A02.A0E().AG8();
        this.A00.A04.loadUrl(A00(0, 11, 35) + this.A00.A00.A03());
    }
}
