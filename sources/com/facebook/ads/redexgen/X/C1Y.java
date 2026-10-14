package com.facebook.ads.redexgen.X;

import android.net.Uri;
import ch.qos.logback.classic.Level;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1Y implements Serializable {
    public static byte[] A0D = null;
    public static String[] A0E = {"U8UpqfD5GcCjHjfawFZje9GDKAZv", "HUavThSyJs21QkbQiVkA2MVijDNZ2nZM", "IARTRQxD0JaHLqaDLyMBN", "Hsg2CAAgFk1Vd6W6cseJD0UtB0g0pB8N", "UbckorOyb4FxR7xZ8GphAvSWlQBuZ4z3", "t3UgO82iTBj4Je3asj0XN1i1cbfA", "fleIFkN77EtPYIR4IZjCzdODP1NyIKiN", "OPDxW3mvsrdjNTdOIjiPk89aFloqol7I"};
    public static final C1Z A0F;
    public static final NH A0G;
    public static final long serialVersionUID = -5352540123250859603L;
    public String A00;
    public final int A01;
    public final int A02;
    public final C1Z A03;
    public final NH A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            if (A0E[6].charAt(18) == 'U') {
                throw new RuntimeException();
            }
            A0E[2] = "FjEz07QReKngvCKAACpwo";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0D = new byte[]{124, 64, 77, 85, 12, Ascii.DEL, 88, 67, 94, 73, 12, 91, 69, 64, 64, 12, 77, 89, 88, 67, 65, 77, 88, 69, 79, 77, 64, 64, 85, 12, 67, 92, 73, 66, 12, 69, 66, 12, 119, 95, 73, 79, 95, 113, 95, 65, 118, 100, 114, 97, 119, 118, 119, 51, 67, Ascii.DEL, 114, 106, 80, 95, 90, 86, 93, 71, 108, 71, 92, 88, 86, 93, 82, 69, 111, 110, 103, 106, 114, 84, 104, 103, 98, 104, 96, 84, Ascii.DEL, 110, 115, Ascii.DEL, 54, 61, 50, 49, 63, 54, 12, 54, 61, 55, 12, 48, 50, 33, 55, 68, 79, 64, 67, 77, 68, 126, 72, 79, 85, 83, 78, 126, 66, 64, 83, 69, 20, 22, Ascii.GS, 22, 1, Ascii.SUB, 16, 44, 7, 22, 11, 7, 112, 119, 106, 109, 120, 119, 122, 124, 70, 112, 125, 34, 37, 63, 57, 36, 20, 40, 42, 57, 47, 20, 34, 40, 36, 37, 20, 62, 57, 39, 112, 106, 70, 105, 117, 120, 96, 120, 123, 117, 124, 70, 107, 124, 116, 118, 109, 124, 70, Ascii.DEL, 118, 107, 116, 120, 109, 83, 78, 85, 89, 82, 72, 93, 72, 85, 83, 82, 56, 36, 41, 49, 41, 42, 36, 45, 23, 44, 41, 60, 41, 52, 54, 33, 39, 37, 39, 44, 45, 42, 35, Ascii.ESC, 41, 33, 48, 44, 43, 32, 2, 21, 7, 17, 2, 20, 21, 20, 47, 0, Ascii.FS, 17, 9, 47, 4, 21, 8, 4, 87, 79, 77, 84, 84, 69, 70, 72, 65, 123, 87, 65, 71, 75, 74, 64, 87, 101, 126, 99, 123, 121, 96, 96, 113, 114, 124, 117, 79, 99, 117, 115, Ascii.DEL, 126, 116, 99, 75, 76, 87, 1, 19, 20, 41, 0, Ascii.US, 19, 1, 41, 2, Ascii.US, Ascii.ESC, 19, Ascii.EM, 3, 2, 41, Ascii.US, Ascii.CAN, 41, Ascii.ESC, Ascii.US, Ascii.SUB, Ascii.SUB, Ascii.US, 5, 19, 21, Ascii.EM, Ascii.CAN, 18, 5};
    }

    static {
        A06();
        A0G = NH.A05;
        A0F = C1Z.A03;
    }

    public C1Y(String str, String str2, int i10, String str3, String str4, NH nh, int i11, boolean z10, boolean z11, C1Z c1z, boolean z12, String str5) {
        if (z12) {
            String string = UUID.randomUUID().toString();
            this.A08 = string;
            Uri uri = KW.A00(str).buildUpon().appendQueryParameter(A03(132, 11, 111), string).appendQueryParameter(A03(58, 12, 69), str5).build();
            this.A07 = uri.toString();
        } else {
            this.A07 = str;
            this.A08 = null;
        }
        this.A06 = str2;
        this.A01 = i10;
        this.A09 = str3;
        this.A05 = str4;
        this.A04 = nh;
        this.A02 = i11;
        this.A0B = z10;
        this.A0A = z11;
        this.A03 = c1z;
        this.A0C = z12;
    }

    public static int A00(JSONObject jSONObject) {
        String strA03 = A03(246, 17, 82);
        if (jSONObject.has(strA03)) {
            return jSONObject.optInt(strA03);
        }
        return jSONObject.optInt(A03(263, 19, 102), 0);
    }

    public static C1Y A01(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A03(198, 13, 62));
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        C1Z precachingMethod = C1Z.A00(jSONObjectOptJSONObject.optString(A03(211, 17, 50), A0F.name()));
        return new C1Y(jSONObjectOptJSONObject.optString(A03(282, 3, 72)), jSONObjectOptJSONObject.optString(A03(143, 19, 61)), A00(jSONObject), A05(jSONObjectOptJSONObject), A04(jSONObjectOptJSONObject), A02(jSONObjectOptJSONObject), jSONObjectOptJSONObject.optInt(A03(285, 32, 0), Level.TRACE_INT), jSONObjectOptJSONObject.optBoolean(A03(103, 17, 87), true), jSONObjectOptJSONObject.optBoolean(A03(88, 15, 37)), precachingMethod, jSONObjectOptJSONObject.optBoolean(A03(162, 25, 111)), jSONObject.optString(A03(70, 2, 71)));
    }

    public static NH A02(JSONObject jSONObject) {
        int orientation = jSONObject.optInt(A03(187, 11, 74), A0G.A03());
        return NH.A00(orientation);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A03(120, 12, 5));
        String strA03 = A03(0, 45, 90);
        return jSONObjectOptJSONObject == null ? strA03 : jSONObjectOptJSONObject.optString(A03(72, 16, 125), strA03);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A03(120, 12, 5));
        String strA03 = A03(45, 13, 101);
        return jSONObjectOptJSONObject == null ? strA03 : jSONObjectOptJSONObject.optString(A03(228, 18, 6), strA03);
    }

    public final int A07() {
        return this.A01;
    }

    public final int A08() {
        return this.A02;
    }

    public final C1Z A09() {
        return this.A03;
    }

    public final NH A0A() {
        return this.A04;
    }

    public final String A0B() {
        return this.A00;
    }

    public final String A0C() {
        return this.A05;
    }

    public final String A0D() {
        return this.A06;
    }

    public final String A0E() {
        return this.A07;
    }

    public final String A0F() {
        return this.A08;
    }

    public final String A0G() {
        return this.A09;
    }

    public final void A0H(String str) {
        this.A00 = str;
    }

    public final boolean A0I() {
        return this.A0B;
    }

    public final boolean A0J() {
        return this.A0C;
    }
}
