package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TF implements MF {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{50, 62, 60, Ascii.DEL, 55, 48, 50, 52, 51, 62, 62, 58, Ascii.DEL, 48, 53, 34, Ascii.DEL, 56, 63, 37, 52, 35, 34, 37, 56, 37, 56, 48, 61, Ascii.DEL, 50, 61, 56, 50, 58, 52, 53, 103, 107, 105, 42, 98, 101, 103, 97, 102, 107, 107, 111, 42, 101, 96, 119, 42, 109, 106, 112, 97, 118, 119, 112, 109, 112, 109, 101, 104, 42, 97, 118, 118, 107, 118, 54, 58, 56, 123, 51, 52, 54, 48, 55, 58, 58, 62, 123, 52, 49, 38, 123, 60, 59, 33, 48, 39, 38, 33, 60, 33, 60, 52, 57, 123, 51, 60, 59, 60, 38, 61, 10, 52, 54, 33, 60, 35, 60, 33, 44, 66, 78, 76, 15, 71, 64, 66, 68, 67, 78, 78, 74, 15, 64, 69, 82, 15, 72, 79, 85, 68, 83, 82, 85, 72, 85, 72, 64, 77, 15, 72, 76, 81, 83, 68, 82, 82, 72, 78, 79, 15, 77, 78, 70, 70, 68, 69, Ascii.GS, 17, 19, 80, Ascii.CAN, Ascii.US, Ascii.GS, Ascii.ESC, Ascii.FS, 17, 17, 21, 80, Ascii.US, Ascii.SUB, 13, 80, 23, 16, 10, Ascii.ESC, 12, 13, 10, 23, 10, 23, Ascii.US, 18, 80, 12, Ascii.ESC, 9, Ascii.US, 12, Ascii.SUB, 32, 44, 46, 109, 37, 34, 32, 38, 33, 44, 44, 40, 109, 34, 39, 48, 109, 42, 45, 55, 38, 49, 48, 55, 42, 55, 42, 34, 47, 109, 49, 38, 52, 34, 49, 39, Ascii.FS, 48, 38, 49, 53, 38, 49, Ascii.FS, 37, 34, 42, 47, 54, 49, 38, 10, 6, 4, 71, 15, 8, 10, 12, 11, 6, 6, 2, 71, 8, 13, Ascii.SUB, 71, 0, 7, Ascii.GS, 12, Ascii.ESC, Ascii.SUB, Ascii.GS, 0, Ascii.GS, 0, 8, 5, 71, Ascii.ESC, 12, Ascii.RS, 8, Ascii.ESC, 13, 54, Ascii.SUB, 12, Ascii.ESC, Ascii.US, 12, Ascii.ESC, 54, Ascii.SUB, Ascii.FS, 10, 10, 12, Ascii.SUB, Ascii.SUB};
    }

    @Override // com.facebook.ads.redexgen.X.MF
    public final String A5n() {
        return A00(164, 36, 13);
    }

    @Override // com.facebook.ads.redexgen.X.MF
    public final String A6L() {
        return A00(0, 37, 34);
    }

    @Override // com.facebook.ads.redexgen.X.MF
    public final String A6m() {
        return A00(72, 45, 38);
    }

    @Override // com.facebook.ads.redexgen.X.MF
    public final String A6q() {
        return A00(37, 35, 119);
    }

    @Override // com.facebook.ads.redexgen.X.MF
    public final String A73() {
        return A00(117, 47, 82);
    }

    @Override // com.facebook.ads.redexgen.X.MF
    public final String A7W() {
        return AdPlacementType.INTERSTITIAL.toString();
    }

    @Override // com.facebook.ads.redexgen.X.MF
    public final String A7n() {
        return A00(200, 51, 48);
    }

    @Override // com.facebook.ads.redexgen.X.MF
    public final String A7o() {
        return A00(251, 51, 26);
    }
}
