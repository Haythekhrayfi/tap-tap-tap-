package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.RewardData;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C1C implements Serializable {
    public static byte[] A0N = null;
    public static String[] A0O = {"nQEL7ltu", "3I3h", "XGwMyflu2SSmsRt1RfrJRUY9I72rnsF", "QYAlpzJzU24310l7paj9Ae15", "2mdfEFQBKkTooSy2QZ4PIVa2Ztt82faR", "LWmzkzhltJuYyEaTC5aoGJqcPz9GQgBs", "qY0", "qq9iBauleUUoVYq0iZ43n7I7uVpCZZUg"};
    public static final long serialVersionUID = -8352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public RewardData A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final int A0M;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0N = new byte[]{111, 109, 126, 99, 121, Ascii.DEL, 105, 96, 42, 33, 40, 32, 39, 22, 57, 40, 59, 40, 36, 58, 43, 39, 37, 102, 46, 41, 43, 45, 42, 39, 39, 35, 102, 41, 44, 59, 102, 33, 38, 60, 45, 58, 59, 60, 33, 60, 33, 41, 36, 102, 43, 36, 33, 43, 35, 45, 44, 98, 117, 106, 89, 110, 111, 98, 99, 89, 104, 103, 112, 111, 97, 103, 114, 111, 105, 104, 89, 99, 104, 103, 100, 106, 99, 98, 2, 21, 10, 57, 14, 21, 57, 3, 8, 7, 4, 10, 3, 2, 87, 64, 95, 108, 91, 74, 81, 65, 90, 87, 108, 86, 93, 82, 81, 95, 86, 87, 113, 108, 123, 116, 120, 124, 118, 74, 102, 113, 126, 74, 121, 116, 108, 112, 103, 74, 125, 97, 120, 121, 74, 96, 103, 121, 87, 92, 81, 64, 75, 66, 70, 87, 86, 109, 81, 66, 95, 94, 89, 67, 82, 69, 84, 82, 71, 67, 104, 64, 82, 85, 104, 94, 89, 68, 67, 86, 91, 91, 104, 85, 66, 67, 67, 88, 89, 8, 15, 21, 4, 19, 18, 21, 8, 21, 8, 0, 13, 121, 96, 76, 100, 118, 113, 76, 122, 125, 96, 103, 114, Ascii.DEL, Ascii.DEL, 76, 113, 102, 103, 103, 124, 125, 44, 35, 54, 43, 52, 39, 85, 66, 86, 82, 66, 84, 83, 120, 78, 67, 36, 51, 33, 55, 36, 50, 51, 50, 9, 32, 63, 50, 51, 57, 21, 10, 6, 20, 2, 1, 10, 15, 10, 23, Ascii.SUB, 60, 0, 11, 6, 0, 8, 60, 10, 13, 10, 23, 10, 2, 15, 60, 7, 6, 15, 2, Ascii.SUB, 5, Ascii.SUB, 22, 4, 18, 17, Ascii.SUB, Ascii.US, Ascii.SUB, 7, 10, 44, 16, Ascii.ESC, 22, 16, Ascii.CAN, 44, Ascii.SUB, Ascii.GS, 7, 22, 1, 5, 18, Ascii.US, 71, 81, 68, 83, 88, 111, 81, 94, 84, 111, 89, 94, 67, 68, 81, 92, 92, 111, 83, 68, 81, 111, 82, 69, 68, 68, 95, 94, 111, 85, 94, 81, 82, 92, 85, 84, 83, 69, 80, 71, 76, 123, 69, 74, 64, 123, 77, 74, 87, 80, 69, 72, 72, 123, 65, 74, 69, 70, 72, 65, 64, 39, 49, 36, 51, 56, 15, 49, 62, 52, 15, 57, 62, 35, 36, 49, 60, 60, 15, 54, 34, 63, 61, 15, 35, 36, 49, 34, 36, 15, 52, 53, 60, 49, 41, 18, 4, 17, 6, 13, 58, 4, 11, 1, 58, 12, 11, 22, 17, 4, 9, 9, 58, 10, 11, 58, 12, 11, 22, 17, 4, 11, 17, 58, 2, 4, 8, 0, 22, 58, 0, 11, 4, 7, 9, 0, 1};
    }

    public abstract int A0C();

    public abstract int A0D();

    static {
        A02();
    }

    public C1C() {
        String strA01 = A01(0, 0, 100);
        this.A0A = strA01;
        this.A01 = 200;
        this.A09 = strA01;
    }

    public static C1C A00(JSONObject jSONObject, C1337Xw c1337Xw) {
        boolean zHas = jSONObject.has(A01(8, 12, 113));
        boolean z10 = false;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A01(0, 8, 52));
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            z10 = true;
        }
        C1C c1cA02 = null;
        if (zHas) {
            try {
                c1cA02 = C1402aB.A02(jSONObject, c1337Xw);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (c1cA02 == null) {
            zHas = false;
            c1cA02 = C0855Ew.A02(jSONObject, c1337Xw);
        }
        c1cA02.A0W(zHas);
        c1cA02.A08(z10);
        return c1cA02;
    }

    private void A03(int i10) {
        this.A02 = i10;
    }

    private void A04(String str) {
        this.A05 = str;
    }

    private void A05(String str) {
        this.A06 = str;
    }

    private void A06(String str) {
        this.A0B = str;
    }

    private void A07(JSONObject jSONObject) {
        this.A0A = jSONObject.toString();
    }

    private final void A08(boolean z10) {
        this.A0G = z10;
    }

    public final int A09() {
        return this.A02;
    }

    public final int A0A() {
        return this.A0M;
    }

    public final int A0B() {
        return this.A00;
    }

    public final long A0E() {
        return this.A03;
    }

    public final RewardData A0F() {
        return this.A04;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public final String A0G() {
        byte b10;
        String str = this.A08;
        switch (str.hashCode()) {
            case -1364000502:
                if (!str.equals(A01(232, 14, 110))) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1052618729:
                String[] strArr = A0O;
                if (strArr[2].length() != strArr[0].length()) {
                    String[] strArr2 = A0O;
                    strArr2[4] = "HVd6lECbTZwpNvPLKB49AFB2LODoRB5A";
                    strArr2[7] = "XOoEMM0Y31wmGZ0mC74NUBXm297DQIjG";
                    if (!str.equals(A01(216, 6, 122))) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                } else if (!str.equals(A01(216, 6, 122))) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 604727084:
                if (!str.equals(A01(183, 12, 89))) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return A01(20, 37, 112);
            case 1:
                return EnumC1113Pc.A04.A02();
            case 2:
                return EnumC1112Pb.A03.A02();
            default:
                String strA01 = A01(0, 0, 100);
                if (A0O[1].length() != 4) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0O;
                strArr3[4] = "JJjM6PLcBsngjIhBbE4reT0wE3or2kJL";
                strArr3[7] = "FVmcFNC2hDJvIDmuBd4oyOix3HqDBQPX";
                return strA01;
        }
    }

    public final String A0H() {
        return this.A05;
    }

    public final String A0I() {
        return this.A06;
    }

    public final String A0J() {
        return this.A07;
    }

    public final String A0K() {
        return this.A08;
    }

    public final String A0L() {
        return this.A09;
    }

    public final String A0M() {
        return this.A0B;
    }

    public final String A0N() {
        return this.A0C;
    }

    public final JSONObject A0O() {
        try {
            return new JSONObject(this.A0A);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final void A0P(int i10) {
        this.A01 = i10;
    }

    public final void A0Q(long j10) {
        this.A03 = j10;
    }

    public final void A0R(RewardData rewardData) {
        this.A04 = rewardData;
    }

    public final void A0S(String str) {
        this.A07 = str;
    }

    public final void A0T(String str) {
        this.A08 = str;
    }

    public final void A0U(String str) {
        this.A0C = str;
    }

    public final void A0V(JSONObject jSONObject) {
        String strA01 = A01(222, 10, 31);
        String strA02 = A01(0, 0, 100);
        A06(jSONObject.optString(strA01, strA02));
        A05(jSONObject.optString(A01(142, 13, 10)));
        A07(jSONObject);
        A03(jSONObject.optInt(A01(246, 31, 91), 0));
        A0P(jSONObject.optInt(A01(277, 26, 75), 1000));
        A04(jSONObject.optString(A01(116, 26, 45), strA02));
        this.A0E = jSONObject.optBoolean(A01(84, 14, 94));
        this.A0F = jSONObject.optBoolean(A01(98, 18, 11));
        this.A0D = jSONObject.optBoolean(A01(57, 27, 62), true);
        this.A0K = jSONObject.optBoolean(A01(339, 25, 28), false);
        this.A00 = jSONObject.optInt(A01(364, 34, 104), -1);
        this.A0L = jSONObject.optBoolean(A01(398, 42, 93), false);
        this.A0J = jSONObject.optBoolean(A01(303, 36, 8), false);
        this.A0I = jSONObject.optBoolean(A01(155, 28, 15), false);
        String strOptString = jSONObject.optString(A01(195, 21, 43), strA02);
        this.A09 = strOptString;
        if (TextUtils.isEmpty(strOptString)) {
            String strA00 = C1068Nj.A00();
            String[] strArr = A0O;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[3] = "hnEXWAdLhVWcnFIzj2c95pGY";
            strArr2[6] = "Kkp";
            this.A09 = strA00;
        }
    }

    public final void A0W(boolean z10) {
        this.A0H = z10;
    }

    public final boolean A0X() {
        return this.A0E;
    }

    public final boolean A0Y() {
        return this.A0F;
    }

    public final boolean A0Z() {
        return this.A0D;
    }

    public final boolean A0a() {
        return this.A0G;
    }

    public final boolean A0b() {
        return this.A0H;
    }

    public final boolean A0c() {
        return Build.VERSION.SDK_INT >= 21 && !TextUtils.isEmpty(A0H());
    }

    public final boolean A0d() {
        return this.A0I;
    }

    public final boolean A0e() {
        return this.A0J;
    }

    public final boolean A0f() {
        return this.A0K;
    }

    public final boolean A0g() {
        return this.A0L;
    }
}
