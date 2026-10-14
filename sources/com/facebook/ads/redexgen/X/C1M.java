package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1M implements Serializable {
    public static byte[] A09 = null;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{37, 52, 53, 52, 49, 52, 64, 84, 67, 21, 67, 17, 66, 65, 4, Ascii.RS, 23, Ascii.RS, 19, Ascii.RS, 68, 82, 23, 71, 23, 70, 23, 72, 58, Ascii.DEL, Ascii.DEL, 45, 41, 33, 41, Ascii.DEL, Ascii.DEL, 59, 57, 57, 63, 52, 46, 5, 57, 53, 54, 53, 40, 110, 107, 83, 111, 99, 96, 99, 126, 57, 52, 63, 34, 4, 56, 52, 55, 52, 41, 13, Ascii.SUB, 15, 49, 13, 1, 2, 1, Ascii.FS, 105, 126, 107, 85, 105, 101, 102, 101, 120, 85, 101, 124, 111, 120, 85, 103, 111, 110, 99, 107, 1, 22, 3, 61, 22, 7, Ascii.SUB, 22, 61, 1, 13, 14, 13, 16, Ascii.US, 8, Ascii.GS, 35, 8, Ascii.EM, 4, 8, 35, Ascii.US, 19, 16, 19, 14, 35, 19, 10, Ascii.EM, 14, 35, 17, Ascii.EM, Ascii.CAN, 21, Ascii.GS, 43, 45, 58, 44, 49, 44, 52, 61, 7, 59, 55, 52, 55, 42, 83, 78, 83, 75, 66, 120, 68, 72, 75, 72, 85};
    }

    static {
        A03();
        A0A = Color.parseColor(A02(14, 7, 123));
        A0B = Color.parseColor(A02(7, 7, 43));
        A0C = Color.parseColor(A02(21, 7, 45));
        String strA02 = A02(28, 9, 69);
        A0D = Color.parseColor(strA02);
        A0E = Color.parseColor(A02(0, 7, 90));
        A0F = Color.parseColor(strA02);
    }

    public C1M(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.A00 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A03 = i13;
        this.A04 = i14;
        this.A05 = i15;
        this.A06 = i16;
        this.A07 = i17;
        this.A08 = i18;
    }

    public static int A00(JSONObject jSONObject, String str, int i10) {
        if (jSONObject != null && jSONObject.has(str)) {
            return Color.parseColor(jSONObject.optString(str));
        }
        return i10;
    }

    public static C1M A01(JSONObject jSONObject) {
        return new C1M(A00(jSONObject, A02(37, 12, 6), A0A), A00(jSONObject, A02(57, 10, 7), A0B), A00(jSONObject, A02(135, 14, 4), -16777216), A00(jSONObject, A02(49, 8, 80), A0C), A00(jSONObject, A02(67, 9, 50), A0D), A00(jSONObject, A02(76, 20, 86), -1), A00(jSONObject, A02(96, 14, 62), -1), A00(jSONObject, A02(110, 25, 32), A0F), A00(jSONObject, A02(149, 11, 123), -16777216));
    }

    public final int A04(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A00;
    }

    public final int A05(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A01;
    }

    public final int A06(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A02;
    }

    public final int A07(boolean z10) {
        return z10 ? A0E : this.A03;
    }

    public final int A08(boolean z10) {
        return z10 ? this.A05 : this.A04;
    }

    public final int A09(boolean z10) {
        return z10 ? this.A07 : this.A06;
    }

    public final int A0A(boolean z10) {
        if (z10) {
            return -1;
        }
        return this.A08;
    }
}
