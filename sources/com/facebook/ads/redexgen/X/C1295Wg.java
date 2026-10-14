package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1295Wg extends AbstractC0783Bm {
    public static byte[] A01;
    public static String[] A02 = {"lkUmj0P9ANZweJy", "AYR", "2bCiSP20yUx8Jjv69HyX94pfkMFX1Tn5", "GuptQSCxLEDTiFK9bPX0ljmbSmBcx9xx", "QILfBos", "yeLNYaj", "n8HrTtIUehfoTgx", "xV0sp6lxPyztL8QZzt7llBh4QSI4V12v"};
    public long A00;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] - i12) - 31);
            String[] strArr = A02;
            if (strArr[3].charAt(7) != strArr[7].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "WF1W4nbxyUcfRBlDsHDD1CgmrC98ElX3";
            strArr2[7] = "aIs3tFZxis4srcfFD6vTbXobqrKXyR4d";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{-40, -23, -26, -43, -24, -35, -29, -30, 5, 4, -29, -5, 10, -9, -38, -9, 10, -9};
    }

    static {
        A0A();
    }

    public C1295Wg() {
        super(null);
        this.A00 = -9223372036854775807L;
    }

    public static int A00(C0914Hf c0914Hf) {
        return c0914Hf.A0E();
    }

    public static Boolean A01(C0914Hf c0914Hf) {
        return Boolean.valueOf(c0914Hf.A0E() == 1);
    }

    public static Double A02(C0914Hf c0914Hf) {
        return Double.valueOf(Double.longBitsToDouble(c0914Hf.A0L()));
    }

    public static Object A03(C0914Hf c0914Hf, int i10) {
        switch (i10) {
            case 0:
                return A02(c0914Hf);
            case 1:
                return A01(c0914Hf);
            case 2:
                return A05(c0914Hf);
            case 3:
                return A09(c0914Hf);
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                String[] strArr = A02;
                if (strArr[3].charAt(7) == strArr[7].charAt(7)) {
                    A02[2] = "Zl5TZ6M60aHBYOe9FM2F5W6f579JKUNd";
                    return null;
                }
                break;
            case 8:
                HashMap<String, Object> mapA08 = A08(c0914Hf);
                String[] strArr2 = A02;
                if (strArr2[0].length() == strArr2[6].length()) {
                    String[] strArr3 = A02;
                    strArr3[0] = "AtnlLuJZPUjXwht";
                    strArr3[6] = "kJYayAh32s2xp3N";
                    return mapA08;
                }
                break;
            case 10:
                return A06(c0914Hf);
            case 11:
                return A07(c0914Hf);
        }
        throw new RuntimeException();
    }

    public static String A05(C0914Hf c0914Hf) {
        int iA0I = c0914Hf.A0I();
        int iA06 = c0914Hf.A06();
        c0914Hf.A0Z(iA0I);
        return new String(c0914Hf.A00, iA06, iA0I);
    }

    public static ArrayList<Object> A06(C0914Hf c0914Hf) {
        int iA0H = c0914Hf.A0H();
        ArrayList<Object> arrayList = new ArrayList<>(iA0H);
        for (int i10 = 0; i10 < iA0H; i10++) {
            int count = A00(c0914Hf);
            arrayList.add(A03(c0914Hf, count));
        }
        return arrayList;
    }

    public static Date A07(C0914Hf c0914Hf) {
        Date date = new Date((long) A02(c0914Hf).doubleValue());
        c0914Hf.A0Z(2);
        return date;
    }

    public static HashMap<String, Object> A08(C0914Hf c0914Hf) {
        int iA0H = c0914Hf.A0H();
        HashMap<String, Object> map = new HashMap<>(iA0H);
        for (int i10 = 0; i10 < iA0H; i10++) {
            String strA05 = A05(c0914Hf);
            int count = A00(c0914Hf);
            map.put(strA05, A03(c0914Hf, count));
        }
        return map;
    }

    public static HashMap<String, Object> A09(C0914Hf c0914Hf) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strA05 = A05(c0914Hf);
            int iA00 = A00(c0914Hf);
            if (iA00 == 9) {
                return map;
            }
            map.put(strA05, A03(c0914Hf, iA00));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0783Bm
    public final void A0B(C0914Hf c0914Hf, long j10) throws C07249b {
        if (A00(c0914Hf) == 2) {
            if (!A04(8, 10, 119).equals(A05(c0914Hf)) || A00(c0914Hf) != 8) {
                return;
            }
            Map<String, Object> metadata = A08(c0914Hf);
            String name = A04(0, 8, 85);
            if (metadata.containsKey(name)) {
                double durationSeconds = ((Double) metadata.get(name)).doubleValue();
                if (durationSeconds > 0.0d) {
                    this.A00 = (long) (1000000.0d * durationSeconds);
                    return;
                }
                return;
            }
            return;
        }
        throw new C07249b();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0783Bm
    public final boolean A0C(C0914Hf c0914Hf) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
