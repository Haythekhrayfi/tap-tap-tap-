package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CL {
    public static byte[] A05;
    public final int A00;
    public final C0781Bj A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{110, 117, 103, -120, -70, -70, -68, -76, -80, -75, -82, 103, -120, -116, -102, 116, -118, -101, -103, 103, -86, -71, -64, -73, -69, -74, 103, -76, -74, -85, -84, 117, -102, -72, -89, -87, -79, -117, -76, -87, -72, -65, -74, -70, -81, -75, -76, -120, -75, -66, -103, -78, -73, -71, -76, -76, -77, -74, -72, -87, -88, 100, -76, -74, -77, -72, -87, -89, -72, -83, -77, -78, 100, -73, -89, -84, -87, -79, -87, 100, -72, -67, -76, -87, 100, 107, -118, -119, -118, 88, -76, -77, -76, -60, -64, -62, -53, -64, -54, -52, -43, -38};
    }

    public CL(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        HG.A03((bArr2 == null) ^ (i10 == 0));
        this.A03 = z10;
        this.A02 = str;
        this.A00 = i10;
        this.A04 = bArr2;
        this.A01 = new C0781Bj(A00(str), bArr, i11, i12);
    }

    public static int A00(String str) {
        if (str == null) {
            return 1;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 37))) {
                    b10 = 2;
                }
                break;
            case 3046671:
                if (str.equals(A01(90, 4, 79))) {
                    b10 = 3;
                }
                break;
            case 3049879:
                if (str.equals(A01(94, 4, 91))) {
                    b10 = 0;
                }
                break;
            case 3049895:
                if (str.equals(A01(98, 4, 101))) {
                    b10 = 1;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            default:
                Log.w(A01(32, 18, 68), A01(50, 36, 66) + str + A01(0, 32, 69));
                return 1;
        }
    }
}
