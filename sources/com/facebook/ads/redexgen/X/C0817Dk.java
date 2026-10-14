package com.facebook.ads.redexgen.X;

import android.database.Cursor;
import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0817Dk implements XQ {
    public static byte[] A03;
    public static String[] A04 = {"zSqnO64p11LQVC3SPrHTwk7q", "RQQcRArwNRw7pCFobI7zm4AECBhyO", "uX7W3VjoXSZ8mIic8tH9fb17VHeYN2EI", "VdQ4q", "h", "roUcO9bhLUMzgbi0", "6tdL5l5B64y16QievzXwm2hdxMIwTdT2", "M1EyYsdVjnJYnVOvo"};
    public boolean A00 = true;
    public final C1336Xv A01;
    public final C7Z A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        String[] strArr = A04;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "GUa5RhIL61d4FW3HWW0RBx9i";
        strArr2[1] = "4nKtohmUbY7tHai9z2t8ojCMJbrZv";
        A03 = new byte[]{62, Ascii.FS, 19, 90, 9, 93, Ascii.EM, Ascii.CAN, 17, Ascii.CAN, 9, Ascii.CAN, 93, Ascii.FS, 9, 9, Ascii.CAN, 16, 13, 9, 14, 93, Ascii.CAN, 5, Ascii.RS, Ascii.CAN, Ascii.CAN, Ascii.EM, Ascii.CAN, Ascii.EM, 93, Ascii.CAN, 11, Ascii.CAN, 19, 9, 14, 83, 16, 21, 7, Ascii.CAN, 21, 46, 59, 59, 42, 34, 63, 59, Ascii.DEL, 122, 111, 122, 16, Ascii.GS, 50, 36, 50, 50, 40, 46, 47, Ascii.RS, 40, 37, 32, 54, 32, 32, 58, 60, 61, 12, 39, 58, 62, 54, 76, 81, 85, 93, 20, 15, 11, 5, 14, 63, 9, 4, Ascii.DEL, 114, 123, 110};
    }

    static {
        A04();
    }

    public C0817Dk(C1336Xv c1336Xv) {
        this.A01 = c1336Xv;
        this.A02 = new C7Z(c1336Xv);
    }

    private JSONArray A01(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(C1335Xu.A04.A00));
            jSONObject.put(A00(82, 8, 53), cursor.getString(C1335Xu.A09.A00));
            jSONObject.put(A00(90, 4, 94), cursor.getString(C1335Xu.A0A.A00));
            jSONObject.put(A00(78, 4, 109), LF.A02(cursor.getDouble(C1335Xu.A08.A00)));
            jSONObject.put(A00(66, 12, 6), LF.A02(cursor.getDouble(C1335Xu.A07.A00)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(C1335Xu.A06.A00));
            String string = cursor.getString(C1335Xu.A03.A00);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(C1335Xu.A02.A00));
            jSONObject.put(A00(38, 5, 36), this.A01.A03().A79());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    private JSONArray A02(Cursor cursor) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(54, 2, 44), cursor.getString(2));
            jSONObject.put(A00(82, 8, 53), cursor.getString(0));
            jSONObject.put(A00(90, 4, 94), cursor.getString(4));
            jSONObject.put(A00(78, 4, 109), LF.A02(cursor.getDouble(5)));
            jSONObject.put(A00(66, 12, 6), LF.A02(cursor.getDouble(6)));
            jSONObject.put(A00(56, 10, 20), cursor.getString(7));
            String string = cursor.getString(8);
            jSONObject.put(A00(50, 4, 78), string != null ? new JSONObject(string) : new JSONObject());
            jSONObject.put(A00(43, 7, 26), cursor.getString(9));
            jSONObject.put(A00(38, 5, 36), this.A01.A03().A79());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject A03(Cursor cursor) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        while (cursor.moveToNext()) {
            String string = cursor.getString(C1334Xt.A02.A00);
            String string2 = cursor.getString(C1334Xt.A01.A00);
            String[] strArr = A04;
            if (strArr[6].charAt(14) != strArr[2].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "IfQdYzKY6vCyBSxPg";
            strArr2[5] = "fxZpsWnZoPKbT5Dt";
            jSONObject.put(string, string2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06998b
    public final int A4E(int i10) {
        int iA08 = 0;
        if (i10 > -1) {
            try {
                iA08 = this.A02.A08(i10);
            } catch (Exception e10) {
                if (this.A01.A04().A8n()) {
                    Log.e(XQ.A00, A00(0, 38, 40), e10);
                }
            }
        }
        this.A02.A0I();
        if (this.A00) {
            this.A02.A0J();
        }
        return iA08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07008c
    public final void A4F() {
        this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06998b
    public final boolean A4y(String str) {
        return this.A02.A0K(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06998b
    public final JSONArray A5s() {
        Cursor cursorA0A = null;
        try {
            cursorA0A = this.A02.A0A();
            JSONArray jSONArrayA01 = null;
            if (cursorA0A.getCount() > 0) {
                jSONArrayA01 = A01(cursorA0A);
            }
            return jSONArrayA01;
        } catch (JSONException unused) {
            return null;
        } finally {
            if (cursorA0A != null) {
                cursorA0A.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06998b
    public final JSONObject A5t() {
        Cursor cursorA0B = null;
        try {
            cursorA0B = this.A02.A0B();
            JSONObject jSONObjectA03 = null;
            if (cursorA0B.getCount() > 0) {
                jSONObjectA03 = A03(cursorA0B);
            }
            if (cursorA0B != null) {
                cursorA0B.close();
            }
            return jSONObjectA03;
        } catch (JSONException unused) {
            String[] strArr = A04;
            if (strArr[7].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "4GsEetTW4Q8M7eeZgpps0V7a";
            strArr2[1] = "4bIAh8lhheYJZGYQIYoy5madi9znf";
            if (cursorA0B != null) {
                cursorA0B.close();
            }
            return null;
        } catch (Throwable th) {
            if (cursorA0B != null) {
                cursorA0B.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06998b
    public final int A6r() {
        Cursor cursorA09 = null;
        try {
            cursorA09 = this.A02.A09();
            return cursorA09.moveToFirst() ? cursorA09.getInt(0) : 0;
        } finally {
            if (cursorA09 != null) {
                cursorA09.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06998b
    public final String A6u(String str) {
        String string = null;
        Cursor cursorA0D = this.A02.A0D(str);
        if (cursorA0D != null) {
            if (cursorA0D.moveToNext() && cursorA0D.getCount() > 0) {
                C7X c7x = C1335Xu.A0A;
                String[] strArr = A04;
                String str2 = strArr[7];
                String eventType = strArr[5];
                if (str2.length() == eventType.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[3] = "VgiME";
                strArr2[4] = "4";
                String eventType2 = c7x.A01;
                string = cursorA0D.getString(cursorA0D.getColumnIndex(eventType2));
            }
            cursorA0D.close();
        }
        return string;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06998b
    public final Pair<JSONObject, JSONArray> A7z(int i10) {
        Cursor cursorA0C = null;
        try {
            cursorA0C = this.A02.A0C(i10);
            JSONArray events = null;
            JSONObject tokens = null;
            if (cursorA0C.getCount() > 0) {
                tokens = A03(cursorA0C);
                events = A02(cursorA0C);
            }
            return new Pair<>(tokens, events);
        } catch (JSONException unused) {
            return new Pair<>(null, null);
        } finally {
            if (cursorA0C != null) {
                cursorA0C.close();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06998b
    public final boolean A8b(String str) {
        return this.A02.A0L(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8Z != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07008c
    public final void AGI(C0934Ia c0934Ia, C8Z<String> c8z) {
        this.A02.A0G(c0934Ia.A08(), c0934Ia.A05().A00, c0934Ia.A06().toString(), c0934Ia.A04(), c0934Ia.A03(), c0934Ia.A07(), c0934Ia.A09(), c8z);
    }
}
