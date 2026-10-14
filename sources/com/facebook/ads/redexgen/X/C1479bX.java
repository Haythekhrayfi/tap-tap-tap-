package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1479bX {
    public static byte[] A00;
    public static String[] A01 = {"gK21opX6pdVXzizTr5B569byzifByDT1", "VXUYBRMamhge5PldHXwCUhQsvqUwyGaK", "A9eN1weHgCPL1SkQ3ZXjYtrHuOy08x6Y", "MZbjV39kBt4hAqLFGwVFLXlTEV84r4gZ", "MdBS2JQ6", "f1VlKL6T46QLbXXjKJzzCBeajzTILabi", "uaXBHv2Fpyp6t9CjlnIdC1IJtF0IP5s0", "SVJaljzXeB5Am8n"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 57);
            String[] strArr = A01;
            if (strArr[1].charAt(18) == strArr[2].charAt(18)) {
                throw new RuntimeException();
            }
            A01[4] = "X228u0Qr";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-69, -67, -50, -61, -48, -61, -50, -45, -71, -55, -68, -60, -65, -67, -50, -71, -61, -66, -43, -40, -45, -32, -35, -25, -24, -39, -30, -39, -26, -45, -25, -39, -24, -24, -26, -15, -15, -28, -18, -20, -13, -12, -9, -22, -23, 4, 9, 2, 10, 15, 6, 5, 0, 2, 5, 0, 10, 15, 5, 6, Ascii.EM, -52, -39, -39, -42, -39, -58, -54, -42, -53, -52, -25, -12, -12, -15, -12, -31, -17, -25, -11, -11, -29, -23, -25, 19, 38, 17, 19, Ascii.RS, 34, 23, Ascii.GS, Ascii.FS, 16, 9, Ascii.ESC, 7, 10, 17, 12, -70, -77, -59, -79, -75, -63, -64, -58, -60, -63, -66, -66, -73, -60, -88, -95, -77, -97, -84, -87, -77, -76, -91, -82, -91, -78, -25, -32, -14, -34, -10, -28, -31, -11, -24, -28, -10, -50, -58, -57, -60, -55, -50, -40, -58, -57, -47, -54, -55, -60, -57, -34, -60, -52, -48, -68, -73, -29, -19, -39, -29, -24, -16, -37, -26, -29, -34, -37, -18, -33, -34, 7, 17, -3, 14, 19, 0, 10, 7, 1, -67, -64, -78, -75, -80, -59, -70, -66, -74, -80, -66, -60, -59, -56, -70, -67, -62, -57, -64, -72, -70, -67, -70, -55, -51, -66, -53, -43, -51, -52, -47, -55, -36, -47, -41, -42, -57, -41, -34, -51, -38, -44, -55, -31, -57, -37, -51, -36, -88, -96, -82, -82, -100, -94, -96, 3, 5, -6, -5, 35, Ascii.US, 20, 22, Ascii.CAN, 32, Ascii.CAN, 33, 39, 18, Ascii.FS, 23, -86, -90, -101, -99, -97, -89, -97, -88, -82, -103, -82, -77, -86, -97, -72, -85, -89, -71, -75, -76, -3, -16, -4, 0, -16, -2, -1, -22, -12, -17, -57, -68, -61, -53, -77, -58, -71, -57, -55, -64, -56, 32, Ascii.CAN, 22, Ascii.GS, 12, Ascii.US, 18, 14, 32, Ascii.FS, Ascii.ESC, -24, 15, 2, -2, 16, -8, 13, 18, 9, -2, -59, -72, -62, -72, -79, -72, -69, -72, -61, -56};
    }

    static {
        A01();
    }
}
