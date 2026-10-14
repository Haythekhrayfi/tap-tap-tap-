package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.93, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass93 extends FrameLayout implements SL {
    public static byte[] A0A;
    public static String[] A0B = {"gR8VXB3ia", "OJTiurBFiCqcREvzh7o4PkhSqDGudpIq", "iaBHwIBC1utH6CwOSIC2yyAu4ZYXfJ61", "YdU4", "YcTfP9iPeB3iMp", "vsmHP1kkKyGC9kag", "2EZKw0n31g6TC4", "KAWIkc2sX"};
    public QR A00;
    public final int A01;
    public final AbstractC1404aD A02;
    public final C1337Xw A03;
    public final InterfaceC0937Id A04;
    public final LG A05;
    public final OM A06;
    public final OX A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{118, 84, 91, 18, 65, 21, 70, 65, 84, 71, 65, 21, 116, 64, 81, 92, 80, 91, 86, 80, 123, 80, 65, 66, 90, 71, 94, 116, 86, 65, 92, 67, 92, 65, 76, Ascii.ESC, 21, 120, 84, 94, 80, 21, 70, 64, 71, 80, 21, 65, 93, 84, 65, 21, 92, 65, 18, 70, 21, 92, 91, 21, 76, 90, 64, 71, 21, 116, 91, 81, 71, 90, 92, 81, 120, 84, 91, 92, 83, 80, 70, 65, Ascii.ESC, 77, 88, 89, 21, 83, 92, 89, 80, Ascii.ESC, Ascii.RS, Ascii.SUB, Ascii.EM, 45, 60, 49, 61, 54, 59, 61, 22, 61, 44, 47, 55, 42, 51, 54, 57, 8, 54, 52, 35, 62, 33, 62, 35, 46, 77, 66, 71, 77, 69, 113, 93, 65, 91, 92, 77, 75, 55, 56, 45, 48, 47, 60, Ascii.CAN, 61, Ascii.GS, 56, 45, 56, Ascii.ESC, 44, 55, 61, 53, 60, 33, 39, 49, 38, 55, 56, 61, 55, 63, 22, 9, 5, 23, 52, Ascii.EM, 16, 5};
    }

    static {
        A02();
    }

    public AnonymousClass93(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, OM om, AbstractC1404aD abstractC1404aD, String str, int i10, LG lg) {
        super(c1337Xw);
        this.A03 = c1337Xw;
        this.A04 = interfaceC0937Id;
        this.A02 = abstractC1404aD;
        this.A08 = str;
        this.A06 = om;
        this.A01 = i10;
        if (i10 == 3) {
            this.A07 = new OX(c1337Xw, abstractC1404aD, interfaceC0937Id, i10);
            this.A09 = false;
        } else {
            OX oxA02 = OY.A02(abstractC1404aD.A0M());
            if (oxA02 != null) {
                this.A07 = oxA02;
                this.A09 = true;
            } else {
                OX ox = new OX(c1337Xw, abstractC1404aD, interfaceC0937Id, i10);
                this.A07 = ox;
                OY.A03(abstractC1404aD, ox);
                this.A09 = false;
            }
        }
        if (lg != null) {
            this.A05 = lg;
            this.A07.A0Z(lg);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new SS(this));
        this.A07.A0a(om);
        EnumC0999Ks.A04(this, EnumC0999Ks.A0A);
        if (IN.A1W(c1337Xw)) {
            c1337Xw.A0A().AG1(this.A07.A0O(), abstractC1404aD.A0s(), false, false, true);
        }
        A04();
    }

    public AnonymousClass93(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, AbstractC1404aD abstractC1404aD, String str, int i10) {
        this(c1337Xw, interfaceC0937Id, null, abstractC1404aD, str, i10, null);
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0E().A5B();
            this.A07.A0X();
        } else {
            this.A03.A0E().A5C();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "EW3rEVX7vA8fzU";
            strArr2[4] = "ztAtYR2DvpL08d";
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    OM om = this.A06;
                    if (om != null) {
                        om.AB3(this);
                    }
                    if (IN.A1W(this.A03)) {
                        this.A03.A0A().AAq();
                    }
                } else {
                    AFc();
                }
            }
        }
        A08();
    }

    private final void A04() {
        OX.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC1404aD abstractC1404aD) {
        intent.putExtra(A01(157, 8, 17), EnumC0970Jm.A06);
        intent.putExtra(A01(130, 18, 40), abstractC1404aD);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC1404aD abstractC1404aD) {
        AdActivityIntent adActivityIntentA04 = KJ.A04(this.A03);
        A05(adActivityIntentA04, abstractC1404aD);
        try {
            KJ.A09(this.A03, adActivityIntentA04);
        } catch (Exception e10) {
            this.A03.A07().A9K(A01(107, 11, 38), C06937v.A0D, new C06947w(e10));
            Log.e(A01(90, 17, 41), A01(0, 90, 68), e10);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        NO no = new NO(this.A03, this.A08, this.A00, this.A05, this.A04);
        HashMap map = new HashMap();
        map.put(A01(118, 12, 95), A01(148, 9, 37));
        no.A08(this.A02.A0s(), str, map);
    }

    public final void A08() {
        LO.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void A8H() {
        A07(this.A02.A0n().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void A8I(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void A8M() {
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void A94() {
        new Handler(Looper.getMainLooper()).post(new SR(this));
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ABG() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ABK() {
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ABy(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ACm() {
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ADH(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ADJ(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ADW(String str) {
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void AFc() {
        OM om = this.A06;
        if (om != null) {
            om.AB3(this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void close() {
    }

    public InterfaceC0937Id getAdEventManager() {
        return this.A04;
    }

    public OX getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(QR qr) {
        this.A00 = qr;
        this.A07.A0e(qr);
    }
}
