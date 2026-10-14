package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XL implements InterfaceC0935Ib {
    public static byte[] A02;
    public static String[] A03 = {"T62Ry0cHQcXSDxKL7NhTV4RGJa1EK", "DJGQMadZkB17LVbr", "iOkG4K13Hjl0NUqXuJlVUejicjlk1nzW", "33srKXABt3KwFUuhEJwkq3ZAZBzDwUgt", "PLu8UfSRSTd2rcgSm6FUEhoaf9WcktnC", "1tfjOobuNxYUsDgE6aIuCnswgchDbiIE", "3cN0JgpVgSdwOhRQcWnO1AlK5DQJr2L6", "ilEunU5aQdATmqkKFrVV7R1hAU4VbdID"};
    public static final String A04;
    public C1336Xv A00;
    public XM A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{86, 16, Ascii.EM, 4, 86, 19, 0, 19, Ascii.CAN, 2, 63, 18, 86, 115, 32, 38, 48, 48, 54, 32, 32, 53, 38, 63, 63, 42, 125, 32, 34, 3, 10, 3, 18, 3, 2, 70, 3, 16, 3, 8, 18, 21, 70, 3, Ascii.RS, 5, 3, 3, 2, 3, 2, 70, 20, 3, 18, 20, Ascii.US, 70, 10, 15, 11, 15, 18, 72, 70, 37, 9, 19, 8, 18, 92, 70, 65, 102, 110, 107, 98, 99, 39, 115, 104, 39, 119, 102, 117, 116, 98, 39, 102, 105, 39, 98, 113, 98, 105, 115, 39, 110, 105, 39, 98, 113, 98, 105, 115, 116, 39, 102, 117, 117, 102, 126, 39, 97, 104, 117, 39, 99, 110, 116, 119, 102, 115, 100, 111, 39, 97, 102, 110, 107, 114, 117, 98, 41, 112, 87, 95, 90, 83, 82, 22, 66, 89, 22, 70, 87, 68, 69, 83, 22, 87, 88, 22, 83, 64, 83, 88, 66, 22, 95, 88, 22, 83, 64, 83, 88, 66, 69, 22, 90, 95, 69, 66, 22, 65, 94, 83, 88, 22, 70, 68, 83, 70, 87, 68, 95, 88, 81, 22, 82, 95, 69, 70, 87, 66, 85, 94, 22, 70, 87, 79, 90, 89, 87, 82, Ascii.CAN, 7, 49, 38, 34, 49, 38, 116, 36, 38, 59, 55, 49, 39, 39, 49, 48, 116, 49, 34, 49, 58, 32, Ascii.GS, 48, 116, 17, 39, 48, 52, 39, 48, 98, 48, 39, 54, 55, 48, 44, 39, 38, 98, 44, 45, 44, 111, 48, 39, 54, 48, 59, 35, 32, 46, 39, 98, 39, 48, 48, 45, 48, 98, 33, 45, 38, 39, 98, 88, 110, 121, 125, 110, 121, 43, 121, 110, Ascii.DEL, 126, 121, 101, 110, 111, 43, 121, 110, Ascii.DEL, 121, 114, 106, 105, 103, 110, 43, 110, 121, 121, 100, 121, 43, 104, 100, 111, 110, 43, 68, Ascii.DEL, 112, 115, 125, 116, 49, 101, 126, 49, 97, 112, 99, 98, 116, 49, 98, 116, 99, 103, 116, 99, 49, 99, 116, 98, 97, 126, Ascii.DEL, 98, 116, 49, 112, 101, 49, 97, 126, 98, 120, 101, 120, 126, Ascii.DEL, 49, 117, 121, 114, 115, 13, Ascii.RS, 13, 6, Ascii.FS, Ascii.ESC, 56, 59, 63, 42, 43, 44, 59, 115, 61, 49, 48, 56, 55, 57, 115, 59, 40, 59, 48, 42, 115, 51, 63, 57, 55, 61, 95, 92, 88, 77, 76, 75, 92, 102, 90, 86, 87, 95, 80, 94, 116, 121, 117, 98, 100, 104, 117, 99, 88, 99, 102, 115, 102, 101, 102, 116, 98, 60, 39, 35, 45, 38, 58, 33, 37, 43, 32, 17, 39, 42, 32, 59, 63, 49, 58, 39};
    }

    static {
        A01();
        A04 = XL.class.getSimpleName();
    }

    public XL(C1336Xv c1336Xv, XM xm) {
        this.A00 = c1336Xv;
        this.A01 = xm;
    }

    private void A02(Set<String> eventsToRetry, Set<String> eventsToDelete) {
        int iA0B = this.A01.A0B(IP.A0G(this.A00), eventsToRetry, eventsToDelete);
        if (iA0B > 0) {
            this.A00.A07().A9K(A00(405, 15, 79), C06937v.A10, new C06947w(A00(28, 44, 46) + iA0B));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final JSONObject A4W() {
        int iA0F = IP.A0F(this.A00);
        List<JSONObject> listA0C = this.A01.A0C(iA0F);
        JSONObject jSONObject = new JSONObject();
        for (JSONObject event : listA0C) {
            try {
                String strOptString = event.optString(A00(420, 5, 0));
                String string = UUID.randomUUID().toString();
                jSONObject.put(string, strOptString);
                event.put(A00(425, 8, 6), string);
            } catch (JSONException e10) {
                C7V c7vA04 = this.A00.A04();
                if (A03[2].charAt(22) != 'j') {
                    throw new RuntimeException();
                }
                A03[7] = "eMFgGe3BwzjIEwfr0eq56CqWHHfmSWyD";
                if (c7vA04.A8n()) {
                    Log.e(A04, A00(134, 72, 126), e10);
                }
            }
        }
        JSONArray jSONArray = new JSONArray((Collection) listA0C);
        if (IP.A0P(this.A00)) {
            int iA08 = IP.A08(this.A00);
            JSONArray eventsJson = C06957x.A04(this.A00, iA08);
            if (A03[7].charAt(31) == 'D') {
                String[] strArr = A03;
                strArr[3] = "31pn7rS79XEbH8v4aDva0zyRbLn9ex8z";
                strArr[6] = "3BqVDGT4msLu1Rtl2iVh8DraLvTqVCKW";
                if (eventsJson != null) {
                    int eventLimit = eventsJson.length();
                    if (eventLimit > 0) {
                        jSONArray = US.A02(this.A00, eventsJson, jSONArray, iA0F + iA08);
                    }
                }
            }
            throw new RuntimeException();
        }
        JSONObject jSONObject2 = null;
        try {
            int eventLimit2 = jSONArray.length();
            if (eventLimit2 > 0) {
                jSONObject2 = new JSONObject();
                int eventLimit3 = jSONObject.length();
                if (eventLimit3 > 0) {
                    jSONObject2.put(A00(433, 6, 28), jSONObject);
                }
                jSONObject2.put(A00(357, 6, 32), jSONArray);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final boolean A8x() {
        return this.A01.A0A() > 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final void AAI() {
        C06957x.A0F(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final void AAs(JSONArray jSONArray) {
        int length = jSONArray.length();
        HashSet hashSet = new HashSet(length);
        for (int i10 = 0; i10 < length; i10++) {
            try {
                JSONObject eventJson = jSONArray.getJSONObject(i10);
                String string = eventJson.getString(A00(403, 2, 85));
                if (C06957x.A0I(string)) {
                    C06957x.A0B(this.A00, string);
                } else {
                    hashSet.add(string);
                }
            } catch (JSONException e10) {
                if (this.A00.A04().A8n()) {
                    Log.e(A04, A00(72, 62, 79), e10);
                }
            }
        }
        A02(hashSet, new HashSet());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final boolean AAu(JSONArray jSONArray) {
        String strA00 = A00(27, 1, 70);
        boolean z10 = true;
        boolean zA0P = IP.A0P(this.A00);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string = jSONObject.getString(A00(403, 2, 85));
                if (A00(363, 26, 22).equals(string)) {
                    IN.A0Q(this.A00).A2R(jSONObject.getString(A00(389, 14, 113)));
                    this.A00.A03().A9q();
                } else {
                    int i11 = jSONObject.getInt(A00(353, 4, 94));
                    if (i11 == 1) {
                        if (this.A00.A04().A8n()) {
                            String str = A00(206, 25, 28) + string + A00(13, 14, 27);
                        }
                        if (zA0P) {
                            C06957x.A0D(string);
                        }
                        hashSet.add(string);
                    } else {
                        String strA01 = A00(0, 13, 62);
                        if (i11 >= 1000 && i11 < 2000) {
                            if (this.A00.A04().A8n()) {
                                Log.e(A04, A00(272, 37, 67) + i11 + strA01 + string + strA00);
                            }
                            if (C06957x.A0I(string)) {
                                C06957x.A0B(this.A00, string);
                            } else {
                                hashSet2.add(string);
                            }
                            z10 = false;
                        } else if (i11 >= 2000 && i11 < 3000) {
                            if (this.A00.A04().A8n()) {
                                Log.e(A04, A00(231, 41, 10) + i11 + strA01 + string + strA00);
                            }
                            hashSet.add(string);
                            if (zA0P) {
                                C06957x.A0D(string);
                            }
                        }
                    }
                }
            } catch (JSONException e10) {
                if (this.A00.A04().A8n()) {
                    Log.e(A04, A00(309, 44, 89) + i10 + strA00, e10);
                }
                z10 = false;
            }
        }
        A02(hashSet2, hashSet);
        return z10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0935Ib
    public final void ACS() {
        this.A01.A4F();
        C06957x.A07(this.A00);
    }
}
