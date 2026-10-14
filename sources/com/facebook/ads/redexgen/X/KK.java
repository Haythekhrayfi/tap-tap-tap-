package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class KK implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C1337Xw A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 122, 125, 98, 97, 99, 104, 99, 116, 111, 101};
    }

    public KK(C1337Xw c1337Xw) {
        this.A00 = c1337Xw;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            C06947w c06947w = new C06947w(A00(0, 4, 88));
            c06947w.A03(1);
            c06947w.A04(1);
            c06947w.A08(false);
            this.A00.A07().A9L(A00(4, 7, 112), C06937v.A1Y, c06947w);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
