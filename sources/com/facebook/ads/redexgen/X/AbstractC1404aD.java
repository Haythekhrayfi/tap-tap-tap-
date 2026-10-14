package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http.StatusLine;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1404aD extends C1C implements Serializable {
    public static JSONObject A0E = null;
    public static byte[] A0F = null;
    public static String[] A0G = {"1gqRR9im7tmNjhPy8NnQpjCX4rd8Ielc", "ZkOx7RNEMabKvQ7fgN15WIbWDw11JZFu", "ifeh8sROmLFDdOYqa0sy0eFfj5RHH1gU", "fnDzwAhU6GMUs0cCq2fTQuWEzv5lBJki", "OVtNfYqIZ80xqW4zrHdkYxbTKYgYXHc", "chIpxbYwiAOd1RIHlv8aEwW7ihQHRwI", "GnSiEcQE", "uApEYGhuY9oy1RN675k2bDQ9FUD4oA7y"};
    public static final LinkedHashMap<String, String> A0H;
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass19 A05;
    public C1T A06;
    public C1W A07;
    public C05311c A08;
    public String A09;
    public final List<C1D> A0C;
    public boolean A0A = false;
    public boolean A0B = false;
    public final Map<String, String> A0D = new HashMap();

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        String[] strArr = A0G;
        if (strArr[2].charAt(14) == strArr[1].charAt(14)) {
            throw new RuntimeException();
        }
        A0G[5] = "bfB1pGz3pHLReaUGKuLSmGsyYLYBAtW";
        A0F = new byte[]{40, 45, 22, 42, 33, 38, 32, 42, 44, 58, 22, 37, 32, 39, 34, 22, 60, 59, 37, 118, 121, 72, 123, 120, 112, 120, 72, 99, 110, 103, 114, 81, 69, 68, 95, 83, 92, 89, 83, 91, 111, 83, 95, 69, 94, 68, 84, 95, 71, 94, 111, 68, 89, 93, 85, 89, 77, 76, 87, 91, 84, 81, 91, 83, 103, 91, 76, 89, 103, 76, 81, 85, 93, 37, 49, 48, 43, 39, 40, 45, 39, 47, Ascii.ESC, 34, 40, 37, 50, 43, 54, 0, 2, 0, 11, 6, 60, 2, 16, 16, 6, 23, 16, 34, 32, 51, 46, 52, 50, 36, 45, 9, 2, 11, 3, 4, 53, 11, 14, Ascii.EM, 53, 12, Ascii.CAN, 15, Ascii.ESC, Ascii.US, 15, 4, 9, 19, 102, 106, 104, 43, 99, 100, 102, 96, 103, 106, 106, 110, 43, 100, 97, 118, 43, 108, 107, 113, 96, 119, 118, 113, 108, 113, 108, 100, 105, 43, 99, 108, 107, 108, 118, 109, 90, 100, 102, 113, 108, 115, 108, 113, 124, 81, 70, 35, 52, 43, Ascii.CAN, 38, 55, 55, Ascii.CAN, 37, 40, 50, 41, 35, Ascii.CAN, 50, 53, 43, 52, 82, 86, 0, 85, 107, 83, 68, 107, 91, 66, 81, 70, 88, 85, 77, 107, 71, 81, 87, 65, 70, 81, 107, 64, 91, 95, 81, 90, 10, 0, 12, 13, 45, 42, 48, 33, 54, 55, 48, 45, 48, 45, 37, 40, 94, 83, 92, 86, 65, 81, 83, 66, 87, 78, 67, 91, 77, 87, 86, 85, 74, 87, 81, 87, 68, 76, 81, 110, 121, 107, 125, 110, 120, 121, 120, 67, 106, 117, 120, 121, 115, 51, 40, 47, 53, 44, 36, Ascii.US, 44, 47, 39, Ascii.US, 33, 46, 57, Ascii.US, 41, 33, 34, Ascii.US, 35, 44, 41, 35, 43, Ascii.US, 47, 46, 35, 37, 60, 33, 60, 36, 45, 113, 118, 104};
    }

    static {
        A09();
        A0H = new LinkedHashMap<>(10, 0.75f, false);
    }

    public AbstractC1404aD(List<C1D> list) {
        this.A0C = list;
    }

    public static String A06(String str) {
        return A0H.get(str);
    }

    private HashMap<String, String> A07(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A05(HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 18, 123));
        HashMap<String, String> map = new HashMap<>();
        if (jSONObjectOptJSONObject == null) {
            return map;
        }
        Iterator<String> nameItr = jSONObjectOptJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                String next = nameItr.next();
                map.put(next, jSONObjectOptJSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    public static List<C1D> A08(JSONObject jSONObject, C1337Xw c1337Xw, C1P c1p) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A05(101, 8, 125));
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            return C1L.A01(jSONArrayOptJSONArray, jSONObject, c1337Xw, c1p);
        }
        List<AdInfo> adInfoList = new ArrayList<>();
        C1D c1dA00 = C1D.A00(jSONObject);
        c1p.A3I(c1dA00, jSONObject);
        adInfoList.add(c1dA00);
        return adInfoList;
    }

    private void A0A(int i10) {
        this.A00 = i10;
    }

    private final void A0B(int i10) {
        this.A04 = i10;
    }

    private void A0C(AnonymousClass19 anonymousClass19) {
        this.A05 = anonymousClass19;
    }

    private void A0D(C1T c1t) {
        this.A06 = c1t;
    }

    private final void A0E(C1W c1w) {
        this.A07 = c1w;
    }

    private void A0F(C05311c c05311c) {
        this.A08 = c05311c;
    }

    private void A0G(String str) {
        this.A09 = str;
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

    public final int A0k() {
        return this.A03;
    }

    public final int A0l() {
        return this.A04;
    }

    public final AnonymousClass19 A0m() {
        return this.A05;
    }

    public final C1D A0n() {
        return this.A0C.get(0);
    }

    public final C1D A0o(int i10) {
        if (i10 < 0 || i10 >= this.A0C.size()) {
            return null;
        }
        return this.A0C.get(i10);
    }

    public final C1T A0p() {
        return this.A06;
    }

    public final C1W A0q() {
        return this.A07;
    }

    public final C05311c A0r() {
        return this.A08;
    }

    public final String A0s() {
        return this.A09;
    }

    public final String A0t(String str) {
        return this.A0D.get(str);
    }

    public final List<C1D> A0u() {
        return Collections.unmodifiableList(this.A0C);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public final void A0v(InterfaceC1019Lm interfaceC1019Lm) {
        byte b10;
        String strA0K = A0K();
        switch (strA0K.hashCode()) {
            case -1364000502:
                String[] strArr = A0G;
                if (strArr[2].charAt(14) == strArr[1].charAt(14)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0G;
                strArr2[3] = "ynfghRupyY8lJ5WDqUPqAC0JO3E4ojqs";
                strArr2[0] = "OEwRxUcpVPGJQFz3LRrAkRkf0LWdVsmf";
                if (strA0K.equals(A05(260, 14, 32))) {
                    b10 = 1;
                }
                switch (b10) {
                    case 0:
                        interfaceC1019Lm.A3y(A05(128, 45, 57));
                        break;
                    case 1:
                        break;
                    default:
                        return;
                }
                interfaceC1019Lm.A3y(EnumC1113Pc.A08.A02());
            case 604727084:
                if (strA0K.equals(A05(HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION, 12, 120))) {
                    b10 = 0;
                }
                switch (b10) {
                    case 0:
                        interfaceC1019Lm.A3y(A05(128, 45, 57));
                        break;
                    case 1:
                        break;
                    default:
                        return;
                }
                interfaceC1019Lm.A3y(EnumC1113Pc.A08.A02());
        }
        b10 = -1;
        switch (b10) {
            case 0:
                interfaceC1019Lm.A3y(A05(128, 45, 57));
                break;
            case 1:
                break;
            default:
                return;
        }
        interfaceC1019Lm.A3y(EnumC1113Pc.A08.A02());
    }

    public final void A0w(JSONObject jSONObject) {
        String strA05;
        JSONObject layoutObject;
        A0E = jSONObject.optJSONObject(A05(89, 12, 95));
        C1V c1vA06 = new C1V().A06(jSONObject.optString(A05(303, 5, 116)));
        String strA06 = A05(221, 4, 95);
        if (jSONObject.optJSONObject(strA06) != null) {
            strA05 = jSONObject.optJSONObject(strA06).optString(A05(StatusLine.HTTP_PERM_REDIRECT, 3, 56));
        } else {
            strA05 = A05(0, 0, 70);
        }
        A0E(c1vA06.A05(strA05).A04(jSONObject.optString(A05(0, 19, 117))).A07(C1X.A03(jSONObject)).A08());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A05(246, 6, 30));
        if (jSONObjectOptJSONObject != null) {
            String strA07 = A05(252, 8, 25);
            if (A0G[5].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "L9OC0yGJthGch16tOTqUcqcE9MnsMaz6";
            strArr[1] = "n6CgIEssquLp46jPM2UWfBhL1rINMjIc";
            layoutObject = jSONObjectOptJSONObject.optJSONObject(strA07);
        } else {
            layoutObject = null;
        }
        A0C(new AnonymousClass19(C1M.A01(layoutObject), C1M.A01(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(A05(237, 9, 14)) : null)));
        A0F(C1X.A01(jSONObject));
        A0D(C1X.A00(jSONObject));
        A0A(jSONObject.optInt(A05(19, 12, 43), 0));
        A0B(jSONObject.optInt(A05(109, 19, 86), -1));
        this.A0D.putAll(A07(jSONObject));
        this.A03 = jSONObject.optInt(A05(55, 18, 4), 0);
        this.A01 = jSONObject.optInt(A05(73, 16, 120), 1);
        this.A0B = jSONObject.optBoolean(A05(274, 29, 124), false);
        this.A02 = jSONObject.optInt(A05(31, 24, 12), this.A03);
        String strOptString = jSONObject.optString(A05(173, 2, 14));
        A0G(strOptString);
        A0H.put(strOptString, jSONObject.optString(A05(193, 28, 8)));
        A0V(jSONObject);
    }

    public final void A0x(boolean z10) {
        this.A0A = z10;
    }

    public final boolean A0y() {
        return this.A0A;
    }

    public final boolean A0z() {
        return this.A0B;
    }
}
