package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0892Gj implements InterfaceC1159Qw {
    public static byte[] A05;
    public static String[] A06 = {"yJwczGSbba5UrkwzZOW60Je1LUoZxQIl", "oZp", "SLRT1bjVboXCxkvYGWPu27FVIHxKKecJ", "WHpvXVjPup", "", "gRWAa43vtpEz38T6Kt4HiTmitjJp6SmI", "", "QpBNbg2dQWhW"};
    public JSONObject A00;
    public JSONObject A01;
    public final EnumC1160Qx A03;
    public final List<InterfaceC1161Qy> A04 = new ArrayList();
    public boolean A02 = false;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        if (A06[7].length() != 12) {
            throw new RuntimeException();
        }
        A06[3] = "GbTE4j9vTw";
        A05 = new byte[]{58, 13, 22, Ascii.FS, 20, Ascii.GS, 88, 93, 11, 88, Ascii.FS, Ascii.EM, 12, Ascii.EM, 88, 13, 8, Ascii.FS, Ascii.EM, 12, Ascii.GS, 66, 114, 82, 82, 88, Ascii.FS, Ascii.EM, 12, Ascii.EM, 88, 82, 82, 114, 93, 11, 114, 82, 82, 88, Ascii.RS, 17, 22, Ascii.US, Ascii.GS, 10, 8, 10, 17, 22, 12, 88, 82, 82, 114, 93, 11, 89, 110, 117, Ascii.DEL, 119, 126, 59, 115, 122, 104, 59, 117, 116, 59, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 32, 23, 12, 6, 14, 7, 66, 11, 17, 66, 12, 13, 22, 66, 16, 7, 3, 6, Ascii.ESC, 43, 46, 59, 46, 111, 114, 114, 111, 33, 58, 35, 35, 107, 100, 99, 106, 104, Ascii.DEL, 125, Ascii.DEL, 100, 99, 121, 45, 44, 48, 45, 99, 120, 97, 97, 125, 114, 117, 124, 126, 105, 107, 105, 114, 117, 111, 59, 38, 38, 59, 117, 110, 119, 119, 77, 86, 79, 79};
    }

    static {
        A03();
    }

    public C0892Gj(EnumC1160Qx enumC1160Qx) {
        this.A03 = enumC1160Qx;
    }

    private boolean A04(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return true;
        }
        boolean zA02 = C1158Qv.A02(jSONObject, jSONObject2);
        String[] strArr = A06;
        if (strArr[0].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[4] = "";
        strArr2[6] = "";
        return true ^ zA02;
    }

    public final synchronized boolean A05(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (jSONObject != null) {
                if (jSONObject2 == null && this.A03.A04()) {
                    throw new IllegalArgumentException(A02(132, 19, 0));
                }
                if (jSONObject2 == null || this.A03.A04()) {
                    if (!A04(this.A01, jSONObject2) && !A04(this.A00, jSONObject)) {
                        return false;
                    }
                    this.A00 = jSONObject;
                    this.A01 = jSONObject2;
                    this.A02 = true;
                    Iterator<InterfaceC1161Qy> it = this.A04.iterator();
                    while (it.hasNext()) {
                        it.next().A40();
                    }
                    try {
                        Locale locale = Locale.US;
                        String strA02 = A02(0, 57, 99);
                        Object[] objArr = new Object[3];
                        objArr[0] = this.A03;
                        JSONObject jSONObject3 = this.A00;
                        objArr[1] = jSONObject3 == null ? A02(151, 4, 56) : jSONObject3.toString(2);
                        JSONObject jSONObject4 = this.A01;
                        objArr[2] = jSONObject4 == null ? A02(151, 4, 56) : jSONObject4.toString(2);
                        String.format(locale, strA02, objArr);
                    } catch (JSONException unused) {
                    }
                    return true;
                }
                throw new IllegalArgumentException(A02(113, 19, 22));
            }
            throw new IllegalArgumentException(A02(101, 12, 84));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1159Qw
    public final synchronized void A3M(InterfaceC1161Qy interfaceC1161Qy) {
        this.A04.add(interfaceC1161Qy);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1159Qw
    public final synchronized JSONObject A6a() {
        JSONObject jSONObject;
        jSONObject = this.A00;
        if (jSONObject == null) {
            throw new IllegalStateException(A02(82, 19, 121));
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1159Qw
    public final synchronized JSONObject A6x() {
        JSONObject jSONObject;
        if (this.A03.A04()) {
            jSONObject = this.A01;
            if (jSONObject == null) {
                throw new IllegalStateException(A02(82, 19, 121));
            }
        } else {
            throw new IllegalStateException(A02(57, 25, 0));
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1159Qw
    public final EnumC1160Qx A72() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1159Qw
    public final synchronized boolean A8z() {
        return this.A02;
    }
}
