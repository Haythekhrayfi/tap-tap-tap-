package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1402aB extends C1C implements Serializable {
    public static byte[] A08 = null;
    public static String[] A09 = {"Y1a5U13ty71QFnyeZB3YxisAAvg7l3fM", "vP", "roZ2Db2w31DgWTY1oGehTdyGNewX8eXS", "I2NTYMYLYsNyCs0logd6ULXXnbjyHCad", "3brQnbpmNBxYuH5lF741sBi9dGi0pOZr", "3fAMLw4w5Yud0wL2utfDbR4mKZlWQuB2", "wSrWvvXZ9ekOd4qM7VWdouqMZx6NVgDc", "r9"};
    public static final long serialVersionUID = 3751287062553772011L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final List<AbstractC1404aD> A07;
    public final ArrayList<Integer> A06 = new ArrayList<>();
    public boolean A04 = false;
    public final String A05 = UUID.randomUUID().toString();

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A09;
            if (strArr[1].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[0] = "ksKrUe0otL7CQDvNz8iG7T5OcxZuVq1Y";
            strArr2[4] = "xaZ8PqWmutKQFInRkVw3BesrM2XhV7TN";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 107);
            i13++;
        }
    }

    public static void A05() {
        A08 = new byte[]{-17, -14, 1, -7, -2, -9, -1, 4, -11, 6, -9, 8, -9, 3, 9, 70, 75, 68, 76, 81, 72, 71, 66, 68, 71, 86, 66, 70, 82, 88, 81, 87, 76, 81, 74, 82, 87, 78, 77, 72, 74, 77, 92, 72, 86, 74, 97, 72, 77, 94, 91, 74, 93, 82, 88, 87, 74, 79, 72, 80, 85, 76, 75, 70, 72, 75, 90, 70, 93, 72, 89, 80, 76, 85, 91, -40, -35, -42, -34, -29, -34, -29, -36, -44, -37, -28, -25, -40, -38, -44, -21, -34, -38, -20, -44, -23, -34, -30, -38, -24, 61, 70, 60, 55, 59, 57, 74, 60, 55, 57, 77, 76, 71, 55, 59, 68, 71, 75, 61, 55, 76, 65, 69, 61, -25, -28, -32, -35, -24, -45, -38, -29, -26, -41, -39, -45, -22, -35, -39, -21};
    }

    static {
        A05();
    }

    public C1402aB(List<AbstractC1404aD> list) {
        this.A07 = list;
    }

    public static C1402aB A02(JSONObject jSONObject, C1337Xw c1337Xw) throws JSONException {
        return A03(jSONObject, c1337Xw, false);
    }

    public static C1402aB A03(JSONObject jSONObject, C1337Xw c1337Xw, boolean z10) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(A04(0, 3, 35));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (z10) {
                arrayList.add(C0857Ey.A02(jSONArray.getJSONObject(i10), c1337Xw));
            } else {
                arrayList.add(C0855Ew.A02(jSONArray.getJSONObject(i10), c1337Xw));
            }
        }
        C1402aB c1402aB = new C1402aB(arrayList);
        JSONObject chainingParams = jSONObject.getJSONObject(A04(3, 12, 43));
        c1402aB.A01 = chainingParams.optInt(A04(15, 17, 120), arrayList.size());
        c1402aB.A03 = chainingParams.optInt(A04(32, 24, 126), 0);
        c1402aB.A02 = chainingParams.optInt(A04(100, 24, 109), 0);
        c1402aB.A00 = chainingParams.optInt(A04(56, 19, 124), 2);
        c1402aB.A0V(chainingParams);
        c1402aB.A04 = chainingParams.optBoolean(A04(124, 16, 9), false);
        JSONArray jSONArrayOptJSONArray = chainingParams.optJSONArray(A04(75, 25, 10));
        if (jSONArrayOptJSONArray != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                c1402aB.A06.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i11, 0)));
            }
        }
        return c1402aB;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0C() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.C1C
    public final int A0D() {
        return this.A03 + this.A02;
    }

    public final int A0h() {
        return this.A00;
    }

    public final int A0i() {
        return this.A01;
    }

    public final int A0j() {
        return this.A02;
    }

    public final AbstractC1404aD A0k() {
        if (!this.A07.isEmpty()) {
            AbstractC1404aD abstractC1404aD = this.A07.get(0);
            if (A09[3].charAt(30) != 'a') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[0] = "kalcuJUd13OWB3p352R0B2fkOk5TQQvY";
            strArr[4] = "xCP6b54EQCdUXuQWfLaOcoZzurPDdDGU";
            return abstractC1404aD;
        }
        return null;
    }

    public final AbstractC1404aD A0l(int i10) {
        return this.A07.get(i10);
    }

    public final String A0m() {
        return this.A05;
    }

    public final String A0n() {
        AbstractC1404aD firstAdDataBundle = A0k();
        if (firstAdDataBundle != null) {
            return firstAdDataBundle.A0s();
        }
        return null;
    }

    public final ArrayList<Integer> A0o() {
        return this.A06;
    }

    public final void A0p(int i10) {
        this.A07.remove(i10);
        this.A01--;
    }

    public final boolean A0q() {
        return this.A00 == 0;
    }

    public final boolean A0r() {
        return this.A04;
    }
}
