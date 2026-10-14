package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6R, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6R {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-120, -90, -88, -83, -86, 101, -87, -82, -72, -80, 101, -85, -90, -82, -79, -70, -73, -86, 115, -63, -33, -31, -26, -29, -98, -30, -25, -15, -23, -98, -15, -13, -31, -31, -29, -15, -15, -84, -63, -33, -31, -26, -29, -98, -30, -19, -11, -20, -22, -19, -33, -30, -98, -28, -33, -25, -22, -13, -16, -29, -84, -127, -97, -95, -90, -93, 94, -90, -89, -78, 108, -72, -42, -40, -35, -38, -107, -30, -34, -24, -24, -93, -83, -80, -85, -81, -66, -79, -83, -64, -75, -62, -79, -85, -65, -75, -58, -79, -85, -82, -59, -64, -79, -65, -55, -52, -57, -53, -38, -51, -55, -36, -47, -34, -51, -57, -36, -31, -40, -51, -95, -92, -97, -90, -81, -78, -83, -95, -76, -97, -76, -71, -80, -91, 21, Ascii.CAN, 19, 38, Ascii.EM, 37, 41, Ascii.EM, 39, 40, 19, Ascii.GS, Ascii.CAN, -79, -60, -60, -75, -67, -64, -60, -78, -80, -78, -73, -76, Ascii.CAN, 22, Ascii.CAN, Ascii.GS, Ascii.SUB, 20, Ascii.CAN, 36, 35, 41, Ascii.SUB, 45, 41, -50, -55, -47, -44, -35, -38, -51, -57, -38, -51, -55, -37, -41, -42, 22, Ascii.SUB, 14, 20, 18, 11, 14, 0, 3, -2, 19, 8, 12, 4, 5, 2, -4};
    }

    static {
        A01();
        A09 = C6R.class.getSimpleName();
        A05 = C06937v.A0o;
        A06 = C06937v.A0s;
        A02 = C06937v.A0l;
        A01 = C06937v.A0k;
        A03 = C06937v.A0m;
        A00 = C06937v.A0i;
        A04 = C06937v.A0n;
        A07 = C06937v.A0t;
    }

    public static void A02(C7Q c7q, C6H c6h, int i10, String str, long j10) {
        if (!A06(c7q)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c6h.A01);
            jSONObject.put(A00(134, 13, 118), c6h.A02);
            if (j10 > 0) {
                jSONObject.put(A00(191, 9, 97), LF.A06(System.currentTimeMillis() - j10));
            }
            C06947w c06947w = new C06947w(str);
            c06947w.A05(jSONObject);
            c06947w.A03(1);
            c7q.A07().A9L(A00(154, 5, 17), i10, c06947w);
        } catch (Throwable deLogException) {
            c7q.A07().A3X(deLogException);
        }
    }

    public static void A03(C7Q c7q, C6M c6m, String str, int i10, String str2, Long l10, Long l11) {
        if (A06(c7q)) {
            A05(c7q, c6m.A05, c6m.A06, c6m.A07, A00(186, 5, 111), str, i10, str2, l10, l11, null);
        }
    }

    public static void A04(C7Q c7q, C6Q c6q, boolean z10) {
        if (!A06(c7q)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c6q.A01);
            jSONObject.put(A00(134, 13, 118), c6q.A03);
            jSONObject.put(A00(104, 16, 42), c6q.A02);
            jSONObject.put(A00(159, 13, 119), c6q.A00);
            if (IN.A1u(c7q)) {
                jSONObject.put(A00(200, 3, 82), c6q.A04);
            }
            String strA00 = z10 ? A00(61, 10, 0) : A00(71, 11, 55);
            int i10 = z10 ? A05 : A06;
            C06947w c06947w = new C06947w(strA00);
            c06947w.A05(jSONObject);
            c06947w.A03(1);
            c7q.A07().A9L(A00(154, 5, 17), i10, c06947w);
        } catch (Throwable th) {
            c7q.A07().A3X(th);
        }
    }

    public static void A05(C7Q c7q, String str, String str2, String str3, String str4, String str5, int i10, String str6, Long l10, Long l11, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), str);
            jSONObject.put(A00(134, 13, 118), str2);
            jSONObject.put(A00(104, 16, 42), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 42), str6);
            }
            if (l10 != null) {
                jSONObject.put(A00(82, 22, 14), String.valueOf(l10));
            }
            if (l11 != null) {
                jSONObject.put(A00(191, 9, 97), String.valueOf(l11));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 18), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 119), str5);
            if (IN.A1u(c7q)) {
                jSONObject.put(A00(200, 3, 82), str3);
            }
            String message = A00(19, 19, 64);
            if (i10 == A03) {
                message = A00(38, 23, 64);
            } else if (i10 == A01) {
                message = A00(0, 19, 7);
            }
            C06947w c06947w = new C06947w(message);
            c06947w.A05(jSONObject);
            c06947w.A03(1);
            c7q.A07().A9L(A00(154, 5, 17), i10, c06947w);
        } catch (Throwable th) {
            c7q.A07().A3X(th);
        }
    }

    public static boolean A06(C7Q c7q) {
        int iA06;
        if (c7q.A04().A8n()) {
            iA06 = 1;
        } else {
            iA06 = IP.A06(c7q);
        }
        if (iA06 == 0) {
            return false;
        }
        return iA06 <= 0 || c7q.A08().A00() <= 1.0d / ((double) iA06);
    }
}
