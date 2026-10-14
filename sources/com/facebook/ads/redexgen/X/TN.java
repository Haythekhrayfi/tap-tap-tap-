package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TN implements InterfaceC0989Kg {
    public static byte[] A01;
    public final /* synthetic */ TI A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, 120, 121, 98, 110, 97, 100, 110, 102};
    }

    public TN(TI ti) {
        this.A00 = ti;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final void AAk() {
        if (!this.A00.A0B && !this.A00.A09) {
            this.A00.A0X(false, A00(0, 9, 108));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0989Kg
    public final void ACO(float f10) {
    }
}
