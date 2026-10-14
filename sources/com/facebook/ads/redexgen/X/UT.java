package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UT implements InterfaceC0937Id {
    public static InterfaceC0937Id A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C1336Xv A00;
    public final InterfaceC07008c A01;
    public final InterfaceC0936Ic A02;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, Ascii.US};
    }

    static {
        A03();
        A05 = UT.class.getSimpleName();
        A06 = false;
    }

    public UT(C1336Xv c1336Xv) {
        InterfaceC0935Ib dispatchCallback;
        this.A00 = c1336Xv;
        if (IP.A0T(c1336Xv)) {
            InterfaceC07008c interfaceC07008cA00 = C06988a.A00(c1336Xv);
            this.A01 = interfaceC07008cA00;
            dispatchCallback = C0942Ii.A00(c1336Xv, interfaceC07008cA00);
        } else {
            C0817Dk c0817DkA01 = C06988a.A01(c1336Xv);
            dispatchCallback = C0942Ii.A01(c1336Xv, c0817DkA01);
            this.A01 = c0817DkA01;
        }
        this.A02 = new UW(c1336Xv, dispatchCallback);
        LT.A08.execute(new UV(this));
        A04(c1336Xv);
    }

    public static synchronized InterfaceC0937Id A01(C1336Xv c1336Xv) {
        if (A03 == null) {
            A03 = new UT(c1336Xv);
        }
        return A03;
    }

    public static synchronized void A04(C1336Xv c1336Xv) {
        if (A06) {
            return;
        }
        c1336Xv.A03().AAD();
        A06 = true;
    }

    private void A05(C0934Ia c0934Ia) {
        if (!c0934Ia.A0A()) {
            Log.e(A05, A02(7, 29, 24) + c0934Ia.A06() + A02(0, 7, 55));
        } else {
            A06(c0934Ia);
            this.A01.AGI(c0934Ia, new UU(this, c0934Ia));
        }
    }

    private void A06(C0934Ia c0934Ia) {
        switch (C0938Ie.A00[c0934Ia.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C06947w c06947w = new C06947w(new Exception(A02(36, 5, 50)));
                c06947w.A03(1);
                try {
                    c06947w.A05(new JSONObject().put(A02(48, 4, 107), c0934Ia.A06().toString()));
                    break;
                } catch (JSONException unused) {
                }
                this.A00.A07().A9L(A02(41, 7, 50), C06937v.A1H, c06947w);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9D(String str, Map<String, String> data) {
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9F(String str, Map<String, String> data) {
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9G(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A07).A06(C0947In.A0A(str, EnumC0944Ik.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9H(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A08).A06(C0947In.A0A(str, EnumC0944Ik.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9J(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9N(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9P(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A05).A02(EnumC0940Ig.A0D).A06(C0947In.A0A(str, EnumC0944Ik.A0U)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9Q(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A05).A02(EnumC0940Ig.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9R(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A05).A02(EnumC0940Ig.A0F).A06(C0947In.A0A(str, EnumC0944Ik.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9S(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A05).A02(EnumC0940Ig.A0K).A06(C0947In.A0A(str, EnumC0944Ik.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9T(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A05).A02(EnumC0940Ig.A0H).A06(C0947In.A0A(str, EnumC0944Ik.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9V(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A0J).A06(C0947In.A0A(str, EnumC0944Ik.A0Z)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9W(String str, Map<String, String> data, String str2, EnumC0939If enumC0939If) {
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(enumC0939If).A02(EnumC0940Ig.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9X(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0934Ia adEvent = new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9b(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A05).A02(EnumC0940Ig.A0N).A06(C0947In.A0A(str, EnumC0944Ik.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9c(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A05).A02(EnumC0940Ig.A0O).A06(C0947In.A0A(str, EnumC0944Ik.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A01(EnumC0939If.A04).A02(EnumC0940Ig.A0P).A06(C0947In.A0A(str, EnumC0944Ik.A0d)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9f(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9g(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A05).A02(EnumC0940Ig.A0Q).A06(C0947In.A0A(str, EnumC0944Ik.A0k)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9h(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A0U).A06(C0947In.A0A(str, EnumC0944Ik.A0m)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9i(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A04).A02(EnumC0940Ig.A0T).A06(C0947In.A0A(str, EnumC0944Ik.A0n)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9j(String str, Map<String, String> data) {
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A05).A02(EnumC0940Ig.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void A9l(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new IZ().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(EnumC0939If.A05).A02(EnumC0940Ig.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0937Id
    public final void ADg(String str) {
        new AsyncTaskC1154Qr(this.A00).execute(str);
    }
}
