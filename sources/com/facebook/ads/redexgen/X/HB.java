package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HB {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{64, 93, 74, 122, 73, 64, 75, 10, 23, 0, 48, Ascii.GS, 10, 11, 6, Ascii.GS};
    }

    public static long A00(HA ha2) {
        return ha2.A5k(A02(0, 7, 70), -1L);
    }

    public static Uri A01(HA ha2) {
        String strA5m = ha2.A5m(A02(7, 9, 12), null);
        if (strA5m == null) {
            return null;
        }
        return Uri.parse(strA5m);
    }

    public static void A04(HC hc2) {
        hc2.A01(A02(7, 9, 12));
    }

    public static void A05(HC hc2, long j10) {
        hc2.A02(A02(0, 7, 70), j10);
    }

    public static void A06(HC hc2, Uri uri) {
        hc2.A03(A02(7, 9, 12), uri.toString());
    }
}
