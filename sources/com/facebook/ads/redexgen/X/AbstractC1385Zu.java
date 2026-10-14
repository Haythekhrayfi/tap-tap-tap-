package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http.StatusLine;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1385Zu implements Jf {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C05220t A0G = null;
    public static final C0964Jg A0H = null;
    public static final String A0I;
    public InterfaceC05170o A00;
    public InterfaceC05170o A01;
    public C8D A04;
    public C0962Jd A05;
    public AbstractC05180p A06;
    public final C05451q A07;
    public final InterfaceC0937Id A08;
    public final C05220t A09;
    public final C0964Jg A0A;
    public final C1337Xw A0B;
    public volatile boolean A0C;
    public long A03 = -1;
    public String A02 = null;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, Ascii.DEL, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 39, 108, 103, 110, 102, 97, 47, 97, 96, 123, 47, 99, 96, 110, 107, 106, 107, 38, 57, Ascii.FS, Ascii.EM, 8, 12, Ascii.GS, 10, 88, 17, 11, 88, 22, 13, 20, 20, 88, 80, Ascii.ESC, 16, Ascii.EM, 17, 22, Ascii.GS, Ascii.FS, 81, 45, 8, 13, Ascii.FS, Ascii.CAN, 9, Ascii.RS, 76, 5, Ascii.US, 76, 2, Ascii.EM, 0, 0, 76, 68, 2, 3, 76, 15, 4, 13, 5, 2, 69, 78, 107, 110, Ascii.DEL, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 5, 36, 107, 38, 36, 57, 46, 107, 42, 47, 107, 40, 42, 37, 47, 34, 47, 42, 63, 46, 56, 101, 122, 95, 66, 67, 74, 13, 76, 73, 76, 93, 89, 72, 95, 13, 89, 84, 93, 72, 3, 46, 43, 111, 46, 35, 61, 42, 46, 43, 54, 111, 60, 59, 46, 61, 59, 42, 43, 94, 91, 76, 52, 37, 60, Ascii.SUB, 17, Ascii.CAN, 16, 23, 38, 9, Ascii.CAN, 11, Ascii.CAN, 20, 10, 76, 91, 74, 79, 90, 79, 97, 76, 68, 75, 77, 90, 14, 71, 93, 14, 64, 91, 66, 66, 38, 45, 32, 49, 58, 51, 55, 38, 39, Ascii.FS, 42, 39, 122, 113, 105, 118, 109, 112, 113, 114, 122, 113, 107, 63, 118, 108, 63, 122, 114, 111, 107, 102, 38, 50, 37, 49, 53, 37, 46, 35, 57, Ascii.US, 35, 33, 48, 48, 41, 46, 39, Ascii.FS, Ascii.ESC, 3, 20, Ascii.EM, Ascii.FS, 17, 85, 5, Ascii.EM, 20, 22, 16, Ascii.CAN, 16, Ascii.ESC, 1, 85, Ascii.FS, Ascii.ESC, 85, 7, 16, 6, 5, Ascii.SUB, Ascii.ESC, 6, 16, 10, 9, 7, 2, 57, 18, 15, 11, 3, 57, 11, 21, 44, 59, 47, 43, 59, 45, 42, 1, 55, 58};
    }

    public abstract void A0L();

    public abstract void A0N(InterfaceC05170o interfaceC05170o, C8D c8d, C8B c8b, C05461r c05461r);

    static {
        A07();
        LQ.A02();
        A0I = AbstractC1385Zu.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC1385Zu(C1337Xw c1337Xw, C05451q c05451q) {
        this.A0B = c1337Xw;
        this.A07 = c05451q;
        C0964Jg c0964Jg = A0H;
        if (c0964Jg != null) {
            this.A0A = c0964Jg;
        } else {
            this.A0A = new C0964Jg(c1337Xw);
        }
        this.A0A.A0P(this);
        C05220t c05220t = A0G;
        if (c05220t != null) {
            this.A09 = c05220t;
        } else {
            this.A09 = new C05220t();
        }
        DynamicLoaderFactory.makeLoader(c1337Xw).getInitApi().onAdLoadInvoked(c1337Xw);
        this.A08 = c1337Xw.A09();
        c1337Xw.A0E().A4m();
    }

    private void A08(C1235Tu c1235Tu) {
        C8D placement = c1235Tu.A00();
        if (placement == null || placement.A05() == null) {
            String strA06 = A06(279, 29, 125);
            JD error = new JD(AdErrorType.NO_AD_PLACEMENT, strA06);
            this.A0B.A0E().A4o(error.A03().getErrorCode(), strA06);
            AbstractC05180p abstractC05180p = this.A06;
            if (abstractC05180p != null) {
                abstractC05180p.A0G(error);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        C8D c8d = this.A04;
        JSONObject jSONObjectA09 = c8d.A09();
        String strA07 = A06(195, 3, 93);
        if (jSONObjectA09 == null) {
            C8B c8bA04 = c8d.A04();
            if (!A0C(c8d, c8bA04)) {
                return;
            }
            if (this.A00 == null) {
                this.A0B.A07().A9K(strA07, C06937v.A0a, new C06947w(A06(81, 26, 100), c8bA04.A02()));
                AB6(JD.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C05461r loadConfig = new C05461r(c8bA04.A04(), c8d.A05(), this.A07.A09, c8d.A05().A0C());
            A0N(this.A00, c8d, c8bA04, loadConfig);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C8B c8bA05 = c8d.A04();
        do {
            if (arrayList.isEmpty()) {
                if (A0C(c8d, c8bA05)) {
                    arrayList.add(c8bA05);
                } else {
                    return;
                }
            } else if (A0B(c8bA05)) {
                arrayList.add(c8bA05);
            }
            c8bA05 = c8d.A04();
        } while (c8bA05 != null);
        if (this.A00 == null) {
            this.A0B.A07().A9K(strA07, C06937v.A0a, new C06947w(A06(56, 25, 112), ((C8B) arrayList.get(0)).A02()));
            AB6(JD.A00(AdErrorType.INTERNAL_ERROR));
            return;
        }
        boolean z10 = false;
        try {
            if (arrayList.size() > 1 && this.A00.AFh()) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C8B) it.next()).A04());
                }
                jSONObject.put(A06(192, 3, 55), jSONArray);
                jSONObject.put(A06(198, 12, 113), c8d.A09());
                C05461r loadConfig2 = new C05461r(jSONObject, c8d.A05(), this.A07.A09, c8d.A05().A0C());
                A0N(this.A00, c8d, c8bA05, loadConfig2);
                z10 = true;
            }
        } catch (Exception unused) {
            z10 = false;
        }
        if (!z10) {
            if (arrayList.isEmpty()) {
                JD jdA01 = JD.A01(AdErrorType.NO_FILL, A06(0, 0, 73));
                this.A0B.A0E().A4o(jdA01.A03().getErrorCode(), A06(133, 22, 67));
                AbstractC05180p abstractC05180p2 = this.A06;
                if (abstractC05180p2 != null) {
                    abstractC05180p2.A0G(jdA01);
                    return;
                }
                return;
            }
            InterfaceC05170o interfaceC05170o = this.A00;
            String[] strArr = A0E;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0E;
            strArr2[0] = "F2ixlBYVHNYJB4bAHADqJrSynawwg1yM";
            strArr2[5] = "djkwyiiWLTaQwWMcVWQWfq0o8Ww2Jgo9";
            if (interfaceC05170o == null) {
                this.A0B.A07().A9K(strA07, C06937v.A0a, new C06947w(A06(22, 34, 7), ((C8B) arrayList.get(0)).A02()));
                AB6(JD.A00(AdErrorType.INTERNAL_ERROR));
                return;
            }
            C8B c8b = (C8B) arrayList.get(0);
            A0N(this.A00, c8d, c8b, new C05461r(c8b.A04(), c8d.A05(), this.A07.A09, c8d.A05().A0C()));
        }
    }

    private final void A09(String str, AdExperienceType adExperienceType) {
        this.A0B.A0E().A4p(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            AB6(new JD(AdErrorType.API_NOT_SUPPORTED, A06(0, 0, 73)));
            return;
        }
        try {
            C0962Jd c0962JdA01 = this.A07.A01(this.A0B, new JN(this.A0B, str, this.A07.A09, this.A07.A08), adExperienceType);
            this.A05 = c0962JdA01;
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            this.A0A.A0O(c0962JdA01);
        } catch (JE e10) {
            AB6(JD.A02(e10));
        }
    }

    private void A0A(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A06(230, 12, 75));
            C05240v.A01(this.A0B).A0O(jSONObject);
        }
    }

    private boolean A0B(C8B c8b) {
        return (c8b == null || c8b.A04() == null) ? false : true;
    }

    private boolean A0C(C8D c8d, C8B c8b) {
        String strA06 = A06(0, 0, 73);
        if (c8b == null) {
            JD jdA01 = JD.A01(AdErrorType.NO_FILL, strA06);
            this.A0B.A0E().A4o(jdA01.A03().getErrorCode(), A06(133, 22, 67));
            AbstractC05180p abstractC05180p = this.A06;
            if (abstractC05180p != null) {
                abstractC05180p.A0G(jdA01);
            }
            return false;
        }
        String strA02 = c8b.A02();
        InterfaceC05170o interfaceC05170oA00 = this.A09.A00(this.A0B, c8d.A05().A0D());
        if (interfaceC05170oA00 == null) {
            this.A0B.A07().A9K(A06(195, 3, 93), C06937v.A0a, new C06947w(A06(0, 22, 2), strA02));
            AB6(JD.A00(AdErrorType.INTERNAL_ERROR));
            return false;
        }
        if (this.A07.A00() != interfaceC05170oA00.A7V()) {
            JD jdA02 = JD.A01(AdErrorType.INTERNAL_ERROR, strA06);
            this.A0B.A0E().A4o(jdA02.A03().getErrorCode(), A06(155, 19, 37));
            AbstractC05180p abstractC05180p2 = this.A06;
            if (abstractC05180p2 != null) {
                abstractC05180p2.A0G(jdA02);
            }
            return false;
        }
        this.A00 = interfaceC05170oA00;
        String[] strArr = A0E;
        if (strArr[4].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[0] = "MKxF4EMWgzzLH5X7HNcHVA2i4zdAiZz9";
        strArr2[5] = "4tfdEW2uI31voJBW941pIR5b1aNGKiQe";
        JSONObject jSONObjectA04 = c8b.A04();
        if (jSONObjectA04 != null) {
            String strOptString = jSONObjectA04.optString(A06(320, 10, 86));
            this.A0B.A0E().AFH(strOptString);
            this.A0B.A0C(strOptString);
            C1336Xv c1336XvA00 = C7P.A00();
            if (c1336XvA00 != null) {
                c1336XvA00.A0C(strOptString);
            }
            JSONObject dataObject = jSONObjectA04.optJSONObject(A06(262, 17, 72));
            A0A(dataObject);
            if (this.A05 == null) {
                String strA07 = A06(242, 20, 23);
                JD jdA03 = JD.A01(AdErrorType.UNKNOWN_ERROR, strA07);
                this.A0B.A0E().A4o(jdA03.A03().getErrorCode(), strA07);
                AbstractC05180p abstractC05180p3 = this.A06;
                if (abstractC05180p3 != null) {
                    abstractC05180p3.A0G(jdA03);
                }
                return false;
            }
            return true;
        }
        String strA08 = A06(212, 18, 38);
        JD jdA04 = JD.A01(AdErrorType.UNKNOWN_ERROR, strA08);
        this.A0B.A0E().A4o(jdA04.A03().getErrorCode(), strA08);
        AbstractC05180p abstractC05180p4 = this.A06;
        if (abstractC05180p4 != null) {
            abstractC05180p4.A0G(jdA04);
        }
        return false;
    }

    public final long A0D() {
        C8D c8d = this.A04;
        if (c8d != null) {
            return c8d.A03();
        }
        return -1L;
    }

    public final Handler A0E() {
        return A0F;
    }

    public C1C A0F() {
        return ((AbstractC1408aH) this.A01).A0H();
    }

    public final C8E A0G() {
        C8D c8d = this.A04;
        if (c8d == null) {
            return null;
        }
        return c8d.A05();
    }

    public final void A0H() {
        String strA6M;
        this.A0B.A0E().A2l(LF.A01(this.A03));
        InterfaceC05170o interfaceC05170o = this.A01;
        if (interfaceC05170o == null || (strA6M = interfaceC05170o.A6M()) == null) {
            return;
        }
        HashMap map = new HashMap();
        String strA04 = LF.A04(this.A03);
        String clientToken = A06(StatusLine.HTTP_PERM_REDIRECT, 12, 110);
        map.put(clientToken, strA04);
        new C0945Il(strA6M, this.A08).A04(EnumC0944Ik.A08, map);
    }

    public final void A0I() {
        InterfaceC05170o interfaceC05170o = this.A01;
        String strA06 = A06(195, 3, 93);
        if (interfaceC05170o == null) {
            String strA07 = A06(107, 26, 7);
            this.A0B.A07().A9K(strA06, C06937v.A0Q, new C06947w(strA07));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0E().A4o(adErrorType.getErrorCode(), strA07);
            AbstractC05180p abstractC05180p = this.A06;
            if (abstractC05180p != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC05180p.A0G(JD.A01(adErrorType, errorMessage));
            }
            this.A0B.A0E().A4r();
            return;
        }
        if (this.A0C) {
            String strA08 = A06(174, 18, 71);
            this.A0B.A07().A9K(strA06, C06937v.A0M, new C06947w(strA08));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0E().A4o(adErrorType2.getErrorCode(), strA08);
            AbstractC05180p abstractC05180p2 = this.A06;
            if (abstractC05180p2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC05180p2.A0G(JD.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0E().A4q();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A6M())) {
            this.A08.A9e(this.A01.A6M());
        }
        this.A0B.A0E().A4s();
        this.A0C = true;
        A0L();
    }

    public final void A0J() {
        A0T(false);
    }

    public final void A0K() {
        if (this.A02 != null) {
            C05240v.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0M(InterfaceC05170o interfaceC05170o) {
        if (interfaceC05170o != null) {
            interfaceC05170o.onDestroy();
        }
    }

    public final void A0O(AbstractC05180p abstractC05180p) {
        this.A06 = abstractC05180p;
    }

    public final void A0P(C05461r c05461r) {
        this.A0B.A0E().A4l();
        String clientToken = c05461r.A03().optString(A06(210, 2, 39));
        if (!TextUtils.isEmpty(clientToken)) {
            C0945Il funnelLoggingHandler = new C0945Il(clientToken, this.A08);
            funnelLoggingHandler.A04(EnumC0944Ik.A04, null);
        }
    }

    public void A0Q(String str) {
        A09(str, null);
    }

    public final void A0R(String str) {
        A0Q(str);
    }

    public final void A0S(String str, AdExperienceType adExperienceType) {
        A09(str, adExperienceType);
    }

    public void A0T(boolean z10) {
        if (!z10 && !this.A0C) {
            return;
        }
        this.A0B.A0E().A4t();
        A0M(this.A01);
        this.A0C = false;
    }

    public final boolean A0U() {
        C8D c8d = this.A04;
        return c8d == null || c8d.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.Jf
    public final synchronized void AB6(JD jd2) {
        A0E().post(new C1386Zv(this, jd2));
    }

    @Override // com.facebook.ads.redexgen.X.Jf
    public final synchronized void ACu(C1235Tu c1235Tu) {
        try {
            A08(c1235Tu);
        } catch (Exception e10) {
            this.A0B.A07().A9K(A06(195, 3, 93), C06937v.A0T, new C06947w(e10));
        }
    }
}
