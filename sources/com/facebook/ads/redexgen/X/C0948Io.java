package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0948Io {
    public static byte[] A00;
    public static String[] A01 = {"8rCQ87LDNJC1DhxZ6fCr2sl9z", "5Hodpo98FOR", "IALBcgKUANLjYRQ96HtZ7fzkbeR9jBcx", "zTQAh3vDqOojvZYlgAqVeqBvFcLoF4J3", "z7HIEgV6NC3", "WxYOl0mgWg7jzfrY8MiYRxzCEbOVsE5E", "Fx", "GTrmlcJrnfi84XLQulxC5fcTBIr6OicG"};
    public static final String A02;
    public static final Map<String, Integer> A03;
    public static final AtomicInteger A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{57, 43, 89, 112, -126, 43, -127, 108, 119, -128, 112, 69, 43, 96, 111, 87, 124, -122, -125, 116, -121, 118, 123, 124, -127, 122, 51, Ascii.DEL, -126, 118, 116, Ascii.DEL, 51, 118, -126, -120, -127, -121, 120, -123, -122, 77, 51, 122, -97, -108, -93, -106, -98, -106, -97, -91, -102, -97, -104, 81, -108, -96, -90, -97, -91, -106, -93, 107, 81, -56, -21, -33, -35, -24, -65, -21, -15, -22, -16, -31, -18, -17, 116, 119, 119, 124, -121, 124, -126, -127, 116, Ascii.DEL, 114, 124, -127, 121, -126, -43, -24, -24, -39, -31, -28, -24, -111, -113, -93, -107, -106, -94, -115, -109, -90, -111, -109, -98, -94, -105, -99, -100, -46, -34, -36, -99, -43, -48, -46, -44, -47, -34, -34, -38, -99, -48, -45, -30, -99, -69, -66, -78, -80, -69, -50, -78, -66, -60, -67, -61, -76, -63, -62, -103, -106, -87, -106, -42, -25, -42, -33, -27, -28, -49, -46, -58, -60, -49, -62, -58, -46, -40, -47, -41, -56, -43, -42, -121, 120, -112, -125, -122, 120, 123, -95, -94, -113, -111, -103, -94, -96, -113, -111, -109, -124, -122, 115, -123, -118, -127, 118, -37, -35, -54, -36, -31, -40, -51, -57, -53, -41, -52, -51};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A06(C7Q c7q, QX qx, Map<String, ?> map) throws JSONException {
        HashMap map2 = new HashMap();
        map2.put(A01(93, 7, 109), A01(13, 1, 41));
        A09(c7q, map2);
        HashMap map3 = new HashMap();
        map3.put(A01(188, 7, 10), A01(157, 14, 92));
        map3.put(A01(195, 12, 97), String.valueOf(3501));
        map3.put(A01(100, 16, 39), A01(14, 1, 55));
        map3.put(A01(178, 10, 39), A01(65, 13, 117));
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        if (c7q.A04().A8n()) {
            String str = A01(15, 28, 12) + jSONObject.toString(2);
        }
        map3.put(A01(78, 15, 12), jSONObject.toString());
        A09(c7q, map3);
        C8L c8lA08 = c7q.A08();
        JSONObject jSONObjectA05 = C06957x.A05(new C06977z(c8lA08.A01(), c8lA08.A02(), map3));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObjectA05);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(A01(147, 4, 46), new JSONObject(map2));
        jSONObject2.put(A01(151, 6, 106), jSONArray);
        C1148Ql c1148Ql = new C1148Ql();
        c1148Ql.put(A01(171, 7, 16), jSONObject2.toString());
        qx.ADf(c7q.A04().A6v(), c1148Ql.A08(), new UQ(c7q));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A09(C7Q c7q, Map<String, String> map) {
        map.putAll(c7q.A03().A4i());
    }

    static {
        A04();
        A02 = C0948Io.class.getSimpleName();
        A04 = new AtomicInteger(0);
        A03 = new HashMap();
    }

    public static /* synthetic */ String A00() {
        String str = A02;
        if (A01[0].length() != 25) {
            throw new RuntimeException();
        }
        A01[5] = "AE0Gj58Mw00GT5T1b1OvPEW6lBfcUrG3";
        return str;
    }

    public static /* synthetic */ Map A02() {
        Map<String, Integer> map = A03;
        if (A01[2].charAt(23) == '7') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "kE3yWNDHHw7";
        strArr[4] = "pIXzG0En7nL";
        return map;
    }

    public static void A05(C7Q c7q) {
        if (A0B(c7q)) {
            return;
        }
        synchronized (C0948Io.class) {
            AtomicInteger atomicInteger = A04;
            if (atomicInteger.get() != 0) {
                return;
            }
            atomicInteger.set(1);
            LT.A06.execute(new UR(c7q));
        }
    }

    public static void A08(C7Q c7q, String str) {
        int i10;
        int iIntValue;
        if (A0B(c7q)) {
            return;
        }
        synchronized (C0948Io.class) {
            if (A04.get() != 2) {
                Map<String, Integer> map = A03;
                if (map.containsKey(str)) {
                    iIntValue = map.get(str).intValue();
                } else {
                    iIntValue = 0;
                }
                i10 = iIntValue + 1;
                map.put(str, Integer.valueOf(i10));
            } else {
                SharedPreferences sharedPreferences = c7q.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(116, 31, 104), c7q), 0);
                i10 = sharedPreferences.getInt(str, 0) + 1;
                sharedPreferences.edit().putInt(str, i10).apply();
            }
            if (c7q.A04().A8n()) {
                String str2 = A01(43, 22, 42) + str + A01(0, 13, 4) + i10;
            }
        }
    }

    public static boolean A0A(double d10, int i10) {
        return i10 <= 0 || d10 >= 1.0d / ((double) i10);
    }

    public static boolean A0B(C7Q c7q) {
        if (c7q.A04().A8n()) {
            return false;
        }
        if (!IP.A0U(c7q)) {
            return true;
        }
        return A0A(c7q.A08().A00(), IP.A0C(c7q));
    }
}
