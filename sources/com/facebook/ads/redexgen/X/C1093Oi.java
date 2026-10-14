package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1093Oi {
    public static byte[] A08;
    public WeakReference<OX> A00;
    public WeakReference<SL> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1337Xw A03;
    public final OK A04;
    public final String A05;
    public final String A06;
    public final WeakReference<InterfaceC0937Id> A07;

    static {
        A09();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, 11, 12, 7, Ascii.ESC, 18, Ascii.SUB, 63, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, 12, Ascii.ESC, 20, 20, 11, 18, 5, 19, 11, Ascii.EM, Ascii.EM, 7, 13, 11, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, Ascii.ESC, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public C1093Oi(C1337Xw c1337Xw, OX ox, InterfaceC0937Id interfaceC0937Id, OK ok, String str, String str2) {
        this.A03 = c1337Xw;
        this.A00 = new WeakReference<>(ox);
        this.A07 = new WeakReference<>(interfaceC0937Id);
        this.A04 = ok;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    private void A04() {
        SL uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
    }

    private void A05() {
        SL uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8M();
    }

    private void A06() {
        SL uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A94();
    }

    private void A07() {
        this.A03.A0E().A59();
        this.A02 = true;
        SL uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AFc();
        if (IN.A1W(this.A03)) {
            this.A03.A0A().AAq();
        }
    }

    private void A08() {
        SL uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.ABG();
    }

    private void A0A(OX ox, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences sharedPreferencesA00 = C0972Jp.A00(this.A03);
        String strA01 = A01(57, 5, 81);
        String strA02 = A01(0, 0, 21);
        String storageValue = jSONObject.optString(strA01, strA02);
        String key = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        String string = sharedPreferencesA00.getString(A01(14, 4, 103) + key, strA02);
        if (string != null) {
            strA02 = string;
        }
        ox.A0g(storageValue, strA02);
    }

    private void A0B(OX ox, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strA01 = A01(98, 5, 12);
        String strA02 = A01(0, 0, 21);
        String strOptString = jSONObject.optString(strA01, strA02);
        String strOptString2 = jSONObject.optString(A01(57, 5, 81), strA02);
        C0972Jp.A00(this.A03).edit().putString(A01(14, 4, 103) + jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50)), strOptString).apply();
        ox.A0f(strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(EnumC1091Og enumC1091Og, String str) throws JSONException {
        switch (C1090Of.A00[enumC1091Og.ordinal()]) {
            case 1:
                A0I(new JSONObject(str));
                break;
            case 2:
                A06();
                break;
            case 3:
                A04();
                break;
            case 4:
                A07();
                break;
            case 5:
                A0K(new JSONObject(str));
                break;
            case 6:
                A0L(new JSONObject(str));
                break;
            case 7:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case 8:
                A05();
            case 9:
                this.A03.A0E().A5L(str);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(enumC1091Og, str);
                break;
            case 15:
                A0J(new JSONObject(str));
                break;
            case 16:
                A08();
                break;
            case 17:
                A0M(new JSONObject(str));
                break;
        }
        OX ox = this.A00.get();
        if (ox == null) {
        }
        switch (enumC1091Og) {
            case A06:
                ox.A0S();
                break;
            case A05:
                ox.A0R();
                break;
            case A0P:
                A0B(ox, str);
                break;
            case A0L:
                A0A(ox, str);
                break;
            case A0F:
                ox.A0i(A03(new JSONObject(str)));
                break;
        }
    }

    private void A0D(EnumC1091Og enumC1091Og, String str) throws JSONException {
        SL sl = this.A01.get();
        if (sl == null) {
        }
        switch (enumC1091Og) {
            case A0C:
                sl.ABK();
                break;
            case A0N:
                sl.ACm();
                break;
            case A0K:
                A0G(sl, str);
                break;
            case A0J:
                A0F(sl, str);
                break;
            case A0G:
                A0E(sl, str);
                break;
        }
    }

    private void A0E(SL sl, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 108);
        sl.ABy(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(SL sl, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 118);
        sl.ADH(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(SL sl, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 82);
        sl.ADJ(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        SL sl = this.A01.get();
        if (sl == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(productUrl)) {
            sl.A8H();
        } else {
            sl.A8I(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        SL uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        InterfaceC0937Id interfaceC0937Id = this.A07.get();
        if (interfaceC0937Id == null) {
            return;
        }
        String strOptString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        new C0945Il(this.A06, interfaceC0937Id).A05(strOptString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (iOptInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0E().A9I(iOptInt, message);
    }

    private void A0M(JSONObject jSONObject) {
        String strOptString;
        SL sl = this.A01.get();
        if (sl == null || (strOptString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        sl.ADW(strOptString);
    }

    public final void A0N(SL sl) {
        this.A01 = new WeakReference<>(sl);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        LI.A00(new RunnableC1089Oe(this, str));
    }
}
