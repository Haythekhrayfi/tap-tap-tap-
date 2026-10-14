package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class US implements InterfaceC0935Ib {
    public static byte[] A02;
    public static String[] A03 = {"4VJF", "NMiFc9mQHDdEdTYDts8ebbMyjIljV2c0", "gJxI4lQggzgG7l1t48TOLBAVsZm4smpW", "RC", "7emK", "VnvWTQ3PSRLSSOUq71E5D", "jZ42e8scbVg896gjqaujwC7", "gj"};
    public static final String A04;
    public C1336Xv A00;
    public XQ A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "6iaNxoAqzoeupDn53l2Cm";
            strArr2[6] = "N7vye13Dqewush4C3JTfsv4";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 104);
            i13++;
        }
    }

    public static void A05() {
        A02 = new byte[]{21, 83, 90, 71, 21, 80, 67, 80, 91, 65, 124, 81, 21, 60, 111, 105, Ascii.DEL, Ascii.DEL, 121, 111, 111, 122, 105, 112, 112, 101, 50, 110, 101, 68, 77, 68, 85, 68, 69, 1, 68, 87, 68, 79, 85, 82, 1, 68, 89, 66, 68, 68, 69, 68, 69, 1, 83, 68, 85, 83, 88, 1, 77, 72, 76, 72, 85, 15, 1, 98, 78, 84, 79, 85, Ascii.ESC, 1, 72, 123, 104, 99, 121, 45, 121, 116, 125, 104, 45, 125, Ascii.DEL, 98, 110, 104, 126, 126, 104, 105, 45, 111, 116, 45, 121, 101, 104, 45, 126, 104, Ascii.DEL, 123, 104, Ascii.DEL, 55, 45, 84, 115, 123, 126, 119, 118, 50, 102, 125, 50, 98, 115, 96, 97, 119, 50, 115, 124, 50, 119, 100, 119, 124, 102, 50, 123, 124, 50, 119, 100, 119, 124, 102, 97, 50, 115, 96, 96, 115, 107, 50, 116, 125, 96, 50, 118, 123, 97, 98, 115, 102, 113, 122, 50, 116, 115, 123, 126, 103, 96, 119, 60, 65, 119, 96, 100, 119, 96, 50, 98, 96, 125, 113, 119, 97, 97, 119, 118, 50, 119, 100, 119, 124, 102, 91, 118, 50, 50, 4, 19, 23, 4, 19, 65, 19, 4, 21, 20, 19, 15, 4, 5, 65, 15, 14, 15, 76, 19, 4, 21, 19, Ascii.CAN, 0, 3, 13, 4, 65, 4, 19, 19, 14, 19, 65, 2, 14, 5, 4, 65, 42, Ascii.FS, 11, 15, Ascii.FS, 11, 89, 11, Ascii.FS, 13, 12, 11, 23, Ascii.FS, Ascii.GS, 89, 11, Ascii.FS, 13, 11, 0, Ascii.CAN, Ascii.ESC, 21, Ascii.FS, 89, Ascii.FS, 11, 11, 22, 11, 89, Ascii.SUB, 22, Ascii.GS, Ascii.FS, 89, 86, 109, 98, 97, 111, 102, 35, 119, 108, 35, 115, 98, 113, 112, 102, 35, 103, 102, 97, 118, 100, 79, 108, 100, 70, 117, 102, 109, 119, 35, 98, 119, 35, 6, 61, 50, 49, 63, 54, 115, 39, 60, 115, 35, 50, 33, 32, 54, 115, 54, 37, 54, 61, 39, 115, 50, 39, 115, 111, 84, 91, 88, 86, 95, Ascii.SUB, 78, 85, Ascii.SUB, 74, 91, 72, 73, 95, Ascii.SUB, 73, 95, 72, 76, 95, 72, Ascii.SUB, 72, 95, 73, 74, 85, 84, 73, 95, Ascii.SUB, 91, 78, Ascii.SUB, 74, 85, 73, 83, 78, 83, 85, 84, Ascii.SUB, 80, 92, 87, 86, 104, 109, 120, 109, 110, 109, Ascii.DEL, 105, 17, 2, 17, Ascii.SUB, 0, 7, 6, 5, 1, 20, 21, 18, 5, 77, 3, 15, 14, 6, 9, 7, 77, 5, 22, 5, 14, 20, 77, 13, 1, 7, 9, 3, 33, 34, 38, 51, 50, 53, 34, Ascii.CAN, 36, 40, 41, 33, 46, 32, 44, 33, 71, 90, 94, 86, 60, 39, 35, 45, 38, 59};
    }

    static {
        A05();
        A04 = US.class.getSimpleName();
    }

    public US(C1336Xv c1336Xv, XQ xq) {
        this.A00 = c1336Xv;
        this.A01 = xq;
    }

    public static JSONArray A01(C1336Xv c1336Xv, JSONArray jSONArray, JSONArray jSONArray2) {
        int i10 = 0;
        if (jSONArray != null) {
            int limit = jSONArray.length();
            i10 = 0 + limit;
        }
        if (jSONArray2 != null) {
            int limit2 = jSONArray2.length();
            i10 += limit2;
        }
        return A02(c1336Xv, jSONArray, jSONArray2, i10);
    }

    public static JSONArray A02(C1336Xv c1336Xv, JSONArray jSONArray, JSONArray jSONArray2, int i10) {
        if (jSONArray == null) {
            return jSONArray2;
        }
        if (jSONArray2 == null) {
            return jSONArray;
        }
        int length = jSONArray.length();
        int length2 = jSONArray2.length();
        JSONArray jSONArray3 = new JSONArray();
        int eventsIdx = 0;
        int debugIdx = 0;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        double d10 = Double.MAX_VALUE;
        double d11 = Double.MAX_VALUE;
        while (true) {
            if ((eventsIdx >= length && debugIdx >= length2) || i10 <= 0) {
                break;
            }
            String[] strArr = A03;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "aN";
            strArr2[3] = "P5";
            String strA00 = A00(435, 4, 91);
            if (eventsIdx < length && jSONObject == null) {
                try {
                    jSONObject = jSONArray.getJSONObject(eventsIdx);
                    d10 = jSONObject.getDouble(strA00);
                } catch (JSONException e10) {
                    if (c1336Xv.A04().A8n()) {
                        Log.e(A04, A00(273, 33, 107) + eventsIdx, e10);
                    }
                    jSONObject = null;
                    d10 = Double.MAX_VALUE;
                }
                eventsIdx++;
            }
            if (debugIdx < length2 && jSONObject2 == null) {
                try {
                    jSONObject2 = jSONArray2.getJSONObject(debugIdx);
                    d11 = jSONObject2.getDouble(strA00);
                } catch (JSONException e11) {
                    if (c1336Xv.A04().A8n()) {
                        Log.e(A04, A00(306, 25, 59) + debugIdx, e11);
                    }
                    jSONObject2 = null;
                    d11 = Double.MAX_VALUE;
                }
                debugIdx++;
            }
            if (jSONObject != null || jSONObject2 != null) {
                if (jSONObject == null || d11 < d10) {
                    jSONArray3.put(jSONObject2);
                    jSONObject2 = null;
                    d11 = Double.MAX_VALUE;
                } else {
                    jSONArray3.put(jSONObject);
                    jSONObject = null;
                    d10 = Double.MAX_VALUE;
                }
                i10--;
            }
        }
        if (i10 > 0) {
            if (jSONObject != null) {
                jSONArray3.put(jSONObject);
            } else if (jSONObject2 != null) {
                jSONArray3.put(jSONObject2);
            }
        }
        return jSONArray3;
    }

    private JSONObject A03() {
        JSONArray jSONArrayA03;
        JSONObject jSONObjectA5t = this.A01.A5t();
        JSONArray jSONArrayA5s = this.A01.A5s();
        if (IP.A0P(this.A00) && (jSONArrayA03 = C06957x.A03(this.A00)) != null && jSONArrayA03.length() > 0) {
            C1336Xv c1336Xv = this.A00;
            String[] strArr = A03;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "DqeH9SIpXFi3b8zfs8mhzwqF8zVFhPmm";
            strArr2[2] = "TV1z9woSYeZeWz7dxNs9KlrMFeTbS55S";
            jSONArrayA5s = A01(c1336Xv, jSONArrayA03, jSONArrayA5s);
        }
        JSONObject jSONObject = null;
        if (jSONArrayA5s != null) {
            try {
                jSONObject = new JSONObject();
                if (jSONObjectA5t != null) {
                    jSONObject.put(A00(439, 6, 32), jSONObjectA5t);
                }
                jSONObject.put(A00(387, 6, 28), jSONArrayA5s);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    private JSONObject A04(int i10) {
        int iA08;
        JSONArray jSONArrayA04;
        Pair<JSONObject, JSONArray> tokensAndEvents = this.A01.A7z(i10);
        JSONObject jSONObject = (JSONObject) tokensAndEvents.first;
        JSONArray debugLogEvents = (JSONArray) tokensAndEvents.second;
        if (IP.A0P(this.A00) && (jSONArrayA04 = C06957x.A04(this.A00, (iA08 = IP.A08(this.A00)))) != null && jSONArrayA04.length() > 0) {
            debugLogEvents = A02(this.A00, jSONArrayA04, debugLogEvents, i10 + iA08);
        }
        JSONObject payload = null;
        if (debugLogEvents != null) {
            try {
                payload = new JSONObject();
                if (jSONObject != null) {
                    payload.put(A00(439, 6, 32), jSONObject);
                }
                payload.put(A00(387, 6, 28), debugLogEvents);
            } catch (JSONException unused) {
                return null;
            }
        }
        return payload;
    }

    private void A06(String str) {
        if (C06957x.A0I(str)) {
            C06957x.A0B(this.A00, str);
        } else {
            this.A01.A8b(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final JSONObject A4W() {
        int eventLimit = IP.A0F(this.A00);
        return eventLimit > 0 ? A04(eventLimit) : A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final boolean A8x() {
        int eventCount = IP.A0F(this.A00);
        if (eventCount < 1) {
            return false;
        }
        int iA6r = this.A01.A6r();
        int eventLimit = C06957x.A00(this.A00);
        return iA6r + eventLimit > eventCount;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final void AAI() {
        int iA4E = this.A01.A4E(IP.A0G(this.A00));
        if (iA4E > 0) {
            this.A00.A07().A9K(A00(379, 8, 100), C06937v.A10, new C06947w(A00(28, 44, 73) + iA4E));
        }
        C1336Xv c1336Xv = this.A00;
        String[] strArr = A03;
        String str = strArr[5];
        String str2 = strArr[6];
        int attemptsExceededEventsCount = str.length();
        int retryLimit = str2.length();
        if (attemptsExceededEventsCount == retryLimit) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[5] = "bzDkK7DGlCk2AgYUikBmx";
        strArr2[6] = "oAHu9PBino36rPxONmBwiLk";
        C06957x.A0F(c1336Xv);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final void AAs(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                A06(jSONArray.getJSONObject(i10).getString(A00(433, 2, 45)));
            } catch (JSONException e10) {
                if (this.A00.A04().A8n()) {
                    String str = A04;
                    String[] strArr = A03;
                    String str2 = strArr[5];
                    String str3 = strArr[6];
                    int i11 = str2.length();
                    int length2 = str3.length();
                    if (i11 == length2) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[1] = "UiT9WvgcUGvh4UJIWCcVV8uUv9KhPAuj";
                    strArr2[2] = "iCLGRVxWINjUDSHIa5c9b6YKh720uR79";
                    Log.e(str, A00(108, 62, 122), e10);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final boolean AAu(JSONArray jSONArray) {
        String strA00 = A00(27, 1, 40);
        boolean z10 = true;
        boolean zA0P = IP.A0P(this.A00);
        for (int errorCode = 0; errorCode < jSONArray.length(); errorCode++) {
            try {
                JSONObject event = jSONArray.getJSONObject(errorCode);
                String string = event.getString(A00(433, 2, 45));
                if (A00(393, 26, 8).equals(string)) {
                    IN.A0Q(this.A00).A2R(event.getString(A00(419, 14, 47)));
                    this.A00.A03().A9q();
                } else {
                    int i10 = event.getInt(A00(375, 4, 91));
                    if (i10 == 1) {
                        if (this.A00.A04().A8n()) {
                            String str = A00(170, 25, 122) + string + A00(13, 14, 116);
                            String eventId = this.A01.A6u(string);
                            if (eventId != null) {
                                String str2 = A00(72, 36, 101) + eventId;
                            }
                        }
                        if (!this.A01.A4y(string) && zA0P) {
                            C06957x.A0D(string);
                        }
                    } else {
                        String strA01 = A00(0, 13, 93);
                        if (i10 >= 1000 && i10 < 2000) {
                            if (this.A00.A04().A8n()) {
                                Log.e(A04, A00(236, 37, 17) + i10 + strA01 + string + strA00);
                            }
                            A06(string);
                            z10 = false;
                        } else if (i10 >= 2000 && i10 < 3000) {
                            if (this.A00.A04().A8n()) {
                                Log.e(A04, A00(195, 41, 9) + i10 + strA01 + string + strA00);
                            }
                            if (!this.A01.A4y(string) && zA0P) {
                                C06957x.A0D(string);
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (this.A00.A04().A8n()) {
                    Log.e(A04, A00(331, 44, 82) + errorCode + strA00, e10);
                }
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final void ACS() {
        this.A01.A4F();
        C06957x.A07(this.A00);
    }
}
