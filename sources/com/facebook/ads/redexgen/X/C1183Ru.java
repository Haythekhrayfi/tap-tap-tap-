package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1183Ru extends K4 {
    public static byte[] A01;
    public final /* synthetic */ C7I A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{100, 91, 86, 87, 93, 18, 69, 83, 65, 18, 92, 87, 68, 87, 64, 18, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public C1183Ru(C7I c7i) {
        this.A00 = c7i;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (!this.A00.A07) {
            this.A00.A0G(A00(0, 24, 76));
        }
    }
}
