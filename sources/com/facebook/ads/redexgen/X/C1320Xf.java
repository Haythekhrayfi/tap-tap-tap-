package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1320Xf implements KA {
    public static byte[] A01;
    public final /* synthetic */ C1336Xv A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{68, 64, 67, 119, 102, 107, 103, 108, 97, 103, 76, 103, 118, 117, 109, 112, 105, 15, 52, 63, 34, 42, 63, 57, 46, 63, 62, 122, 63, 40, 40, 53, 40, 116, 121, 104, 123, 105, 114, 69, 105, 114, 115, Ascii.DEL, 118, 126};
    }

    public C1320Xf(C1336Xv c1336Xv) {
        this.A00 = c1336Xv;
    }

    @Override // com.facebook.ads.redexgen.X.KA
    public final void A9C(int i10, Throwable th) {
        Log.e(A00(0, 17, 13), A00(17, 17, 85), th);
        this.A00.A07().A9K(A00(34, 12, 21), i10, new C06947w(th));
    }
}
