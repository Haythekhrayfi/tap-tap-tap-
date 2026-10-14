package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class A4 extends MN {
    public static byte[] A01;
    public final /* synthetic */ TG A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
    }

    public A4(TG tg) {
        this.A00 = tg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8Y
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass70 anonymousClass70) {
        this.A00.A06.A3z(A00(0, 21, 1), anonymousClass70);
    }
}
