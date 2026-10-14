package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.In, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0947In {
    public static byte[] A00;
    public static final Map<String, String> A01;
    public static final Map<String, List<String>> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-68, -51, -49, -52, -33, -52, -42, -27, -34, -34, -43, -36, -3, 0, -14, -11, -16, 5, -6, -2, -10, -16, -2, 4, -68, -81, -69, -65, -81, -67, -66, -87, -66, -77, -73, -81, -87, -73, -67, -111, -108, 123, -126, -111, -118, -118, -127, -120, 123, -120, -117, -125, -125, -123, -118, -125};
    }

    static {
        A03();
        A02 = new HashMap();
        A01 = new HashMap();
    }

    public static String A01(String str) {
        return A01.get(str);
    }

    public static List<String> A02(C1337Xw c1337Xw, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int eventIndex = 0; eventIndex < jSONArray.length(); eventIndex++) {
            try {
                arrayList.add(jSONArray.getString(eventIndex));
            } catch (JSONException e10) {
                c1337Xw.A07().A9K(A00(39, 17, 1), C06937v.A1C, new C06947w(e10));
            }
        }
        return arrayList;
    }

    public static void A04(View view, C0945Il c0945Il, EnumC0944Ik enumC0944Ik) {
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0946Im(c0945Il, enumC0944Ik));
    }

    public static void A05(C1337Xw c1337Xw, String str, long j10) {
        InterfaceC0937Id adEventManager = c1337Xw.A09();
        C0945Il c0945Il = new C0945Il(str, adEventManager);
        HashMap map = new HashMap();
        map.put(A00(24, 15, 47), LF.A06(j10));
        map.put(A00(12, 12, 118), LF.A04(j10));
        c0945Il.A04(EnumC0944Ik.A0D, map);
    }

    public static void A06(C1337Xw c1337Xw, JSONObject jSONObject, long j10, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A00(2, 4, 80));
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(6, 6, 85));
        if (TextUtils.isEmpty(str) && jSONArrayOptJSONArray != null) {
            A07(c1337Xw, jSONObjectOptJSONObject, A02(c1337Xw, jSONArrayOptJSONArray), j10, null);
        } else {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Map<String, List<String>> map = A02;
            if (!map.containsKey(str)) {
                return;
            }
            A07(c1337Xw, jSONObjectOptJSONObject, map.get(str), j10, str);
        }
    }

    public static void A07(C1337Xw c1337Xw, JSONObject jSONObject, List<String> list, long j10, String str) {
        String strA00 = A00(0, 2, 62);
        if (jSONObject.has(strA00)) {
            String clientToken = jSONObject.optString(strA00);
            A08(clientToken, str);
            A09(clientToken, list);
            A05(c1337Xw, clientToken, j10);
        }
    }

    public static void A08(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        A01.put(str, str2);
    }

    public static void A09(String str, List<String> events) {
        if (TextUtils.isEmpty(str) || events.isEmpty()) {
            return;
        }
        A02.put(str, events);
    }

    public static boolean A0A(String str, EnumC0944Ik enumC0944Ik) {
        return A0B(str, enumC0944Ik.A02());
    }

    public static boolean A0B(String str, String str2) {
        Map<String, List<String>> map = A02;
        return map.containsKey(str) && map.get(str).contains(str2);
    }
}
