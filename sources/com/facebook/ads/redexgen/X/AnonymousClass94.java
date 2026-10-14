package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.94, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass94 extends FrameLayout implements InterfaceC1020Ln, SL {
    public static byte[] A0I;
    public static String[] A0J = {"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    public C5F A00;
    public C5H A01;
    public InterfaceC1092Oh A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC1404aD A06;
    public final C1337Xw A07;
    public final InterfaceC0937Id A08;
    public final C0945Il A09;
    public final LB A0A;
    public final LG A0B;
    public final InterfaceC1019Lm A0C;
    public final MF A0D;
    public final OP A0E;
    public final OX A0F;
    public final QQ A0G;
    public final QR A0H;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{-88, -43, -43, -46, -43, -125, -58, -43, -56, -60, -41, -52, -47, -54, -125, -58, -46, -47, -55, -52, -54, -125, -83, -74, -78, -79, 6, 11, 4, 12, 17, 8, 7, 2, 4, 7, -95, -90, -97, -89, -84, -93, -94, -99, -97, -94, -99, -89, -84, -94, -93, -74, -107, -102, -109, -101, -96, -105, -106, -111, -109, -106, -111, -90, -95, -90, -109, -98, -115, -110, -117, -109, -104, -113, -114, -119, -98, -109, -105, -113, -119, -99, -102, -113, -104, -98, -90, -81, -84, -90, -82, -94, -74, -78, -72, -75, -90, -88, Ascii.EM, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A0D();
    }

    public AnonymousClass94(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm, AbstractC1404aD abstractC1404aD, MF mf, int i10) {
        int i11;
        super(c1337Xw);
        this.A00 = new SY(this);
        SX sx = new SX(this);
        this.A0G = sx;
        this.A03 = true;
        this.A07 = c1337Xw;
        this.A08 = interfaceC0937Id;
        this.A0C = interfaceC1019Lm;
        this.A06 = abstractC1404aD;
        this.A0D = mf;
        OX oxA02 = OY.A02(abstractC1404aD.A0M());
        if (oxA02 == null) {
            this.A0F = new OX(c1337Xw, abstractC1404aD, interfaceC0937Id, i10);
            this.A04 = false;
        } else {
            this.A0F = oxA02;
            this.A04 = true;
        }
        C0945Il c0945IlA0K = this.A0F.A0K();
        this.A09 = c0945IlA0K;
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new SW(this));
        LO.A0G(1003, this.A0F.A0O());
        if (abstractC1404aD.A0Y()) {
            i11 = 0;
            OP op = new OP(c1337Xw, interfaceC0937Id, abstractC1404aD, new C6O(c1337Xw), c0945IlA0K, interfaceC1019Lm, mf, new SV(this));
            this.A0E = op;
            op.A0N();
            this.A0F.A0O().setOnTouchListener(new OL(this));
            addView(op, new FrameLayout.LayoutParams(-1, -1));
        } else {
            i11 = 0;
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        QR qr = new QR(mediaView, 1, new WeakReference(sx), c1337Xw);
        this.A0H = qr;
        qr.A0W(abstractC1404aD.A09());
        qr.A0X(abstractC1404aD.A0A());
        this.A0F.A0e(qr);
        LB lb2 = new LB(this);
        this.A0A = lb2;
        lb2.A05(LA.A03);
        setBackgroundColor(i11);
        if (IN.A1W(c1337Xw)) {
            c1337Xw.A0A().AG1(mediaView, abstractC1404aD.A0s(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean zA0y = abstractC1404aD.A0y();
            String strA0B = A0B(68, 18, 1);
            String strA0B2 = A0B(36, 16, 21);
            String strA0B3 = A0B(52, 16, 9);
            String strA0B4 = A0B(26, 10, 122);
            if (!zA0y) {
                if (KX.A05(abstractC1404aD.A0J())) {
                    jSONObject.put(strA0B4, true);
                    jSONObject.put(strA0B3, 2);
                    jSONObject.put(strA0B2, 1);
                    jSONObject.put(strA0B, abstractC1404aD.A0E());
                }
            } else {
                jSONObject.put(strA0B4, true);
                jSONObject.put(strA0B3, 2);
                jSONObject.put(strA0B2, i11);
                jSONObject.put(strA0B, abstractC1404aD.A0E());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(C06937v.A15, A0B(0, 26, 58));
        }
    }

    private void A0C() {
        C1104Ot c1104OtA0B = new C1102Or(this.A07, this.A06.A0n().A0E(), this.A06.A0q()).A08(this.A06.A0m().A01()).A0B();
        addView(c1104OtA0B, new FrameLayout.LayoutParams(-1, -1));
        c1104OtA0B.A04(new ST(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0E().A5B();
            this.A0F.A0X();
        } else {
            this.A07.A0E().A5C();
            if (this.A0F.A0k()) {
                AFc();
                C1337Xw c1337Xw = this.A07;
                if (A0J[6].length() != 6) {
                    throw new RuntimeException();
                }
                A0J[5] = "8j5uXfZ95rl8UwGJAIvPTgfy7qu4v9pG";
                if (IN.A1W(c1337Xw)) {
                    this.A07.A0A().AAq();
                }
            }
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3P(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A0Z()) {
            this.A0A.A05(LA.A04);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        NO no = new NO(this.A07, this.A0D.A6L(), this.A0H, this.A0B, this.A08, this.A0C);
        HashMap map = new HashMap();
        map.put(A0B(86, 12, 26), A0B(98, 9, 123));
        no.A08(this.A06.A0s(), str, map);
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void A8H() {
        A0F(this.A06.A0n().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void A8I(String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void A8M() {
        this.A0C.A3y(this.A0D.A5n());
        PK serverSideRewardHandler = new PK(this.A07, this.A0D, this.A06.A0N(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void A94() {
        new Handler(Looper.getMainLooper()).post(new SU(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void A9A(Intent intent, Bundle bundle, C5H c5h) {
        OX.A0B().incrementAndGet();
        c5h.A0N(this.A00);
        this.A01 = c5h;
        A0E();
        if (this.A06.A0n().A0P()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ABG() {
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ABK() {
        OP op = this.A0E;
        if (op != null) {
            op.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ABy(boolean z10) {
        OP op = this.A0E;
        if (op != null) {
            op.A0R(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AC8(boolean z10) {
        OP op = this.A0E;
        if (op != null) {
            op.A0S(z10);
        }
        if (z10) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void ACY(boolean z10) {
        OP op = this.A0E;
        if (op != null) {
            op.A0T(z10);
        }
        boolean z11 = this.A03;
        if (A0J[1].length() == 11) {
            throw new RuntimeException();
        }
        A0J[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z11) {
            this.A03 = false;
        } else if (z10) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ACm() {
        OP op = this.A0E;
        if (op != null) {
            op.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ADH(boolean z10) {
        OP op = this.A0E;
        if (op != null) {
            op.A0U(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ADJ(boolean z10) {
        OP op = this.A0E;
        if (op != null) {
            op.A0V(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void ADW(String str) {
        String urlString = this.A06.A0t(str);
        if (urlString == null) {
            return;
        }
        KV.A0L(new KV(), this.A07, KW.A00(urlString), this.A06.A0s());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AEi(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void AFc() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.SL
    public final void close() {
        C5H c5h = this.A01;
        if (c5h == null) {
            return;
        }
        c5h.finish(4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public String getCurrentClientToken() {
        return this.A06.A0s();
    }

    private ViewGroup getMediaView() {
        OP op = this.A0E;
        return op != null ? op : this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void onDestroy() {
        if (IN.A1W(this.A07)) {
            this.A07.A0A().AFo(getMediaView());
        }
        OP op = this.A0E;
        if (op != null) {
            op.A0O();
        }
        this.A0A.A03();
        this.A08.A9H(this.A06.A0s(), new ND().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        OY.A04(this.A06.A0M());
        OX.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1019Lm interfaceC1019Lm) {
    }

    public void setRtfActionsJavascriptListener(InterfaceC1092Oh interfaceC1092Oh) {
        this.A02 = interfaceC1092Oh;
    }
}
