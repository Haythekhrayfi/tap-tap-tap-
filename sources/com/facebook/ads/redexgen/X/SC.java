package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class SC extends AbstractC1097Om {
    public static byte[] A0W;
    public static String[] A0X = {"zF", "YuhgBsbCJ4GENG72FYuTSQ3UxVCmrs0t", "RSfzcHToFNO8jc1tX2m0S0AZ0vbf9kKl", "p", "lGjhRdALEILVIUsiuWCm6MXJK2R8L6Co", "wXQvDYR5huLQKlTsBS5mG0rN7ygrQvR2", "AYgBJnzxyMi9rrwHO3oB8yOhTSWVLxNu", "3k2Jytm7iEKA6X2jmmGhgFSNDYaf4AHR"};
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public C1M A00;
    public C0990Kh A01;
    public PZ A02;
    public JU A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final C1337Xw A0C;
    public final NJ A0D;
    public final ViewOnClickListenerC1207Ss A0E;
    public final InterfaceC1101Oq A0F;
    public final PI A0G;
    public final PQ A0H;
    public final RN A0I;
    public final AnonymousClass74 A0J;
    public final OR A0K;
    public final AbstractC1064Nf A0L;
    public final MN A0M;
    public final MB A0N;
    public final M3 A0O;
    public final M2 A0P;
    public final C0981Jy A0Q;
    public final C0971Jn A0R;
    public final JY A0S;
    public final JQ A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0W, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0W = new byte[]{-55, -43, -45, -108, -52, -57, -55, -53, -56, -43, -43, -47, -108, -57, -54, -39, -108, -49, -44, -38, -53, -40, -39, -38, -49, -38, -49, -57, -46, -108, -55, -46, -49, -55, -47, -53, -54, Ascii.ESC, 14, 32, 10, Ascii.ESC, 13, 14, 13, 8, Ascii.US, 18, 13, 14, Ascii.CAN};
    }

    static {
        A0B();
        A0b = (int) (Kn.A02 * 48.0f);
        int iA01 = C05562b.A01(-1, 77);
        A0Z = iA01;
        A0g = (int) (Kn.A02 * 26.0f);
        A0h = (int) (Kn.A02 * 12.0f);
        A0d = (int) (Kn.A02 * 12.0f);
        A0e = (int) (Kn.A02 * 44.0f);
        A0c = (int) (Kn.A02 * 8.0f);
        A0f = (int) (Kn.A02 * 16.0f);
        A0a = C05562b.A01(iA01, 90);
        A0Y = (int) (Kn.A02 * 4.0f);
    }

    public SC(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, AbstractC1404aD abstractC1404aD, C6O c6o, MF mf, int i10, InterfaceC1019Lm interfaceC1019Lm, C0945Il c0945Il, int i11, int i12, int i13, boolean z10, int i14, boolean z11, InterfaceC1101Oq interfaceC1101Oq) {
        C1M c1mA00;
        super(c1337Xw, mf, interfaceC0937Id, abstractC1404aD, i10, interfaceC1019Lm);
        this.A04 = false;
        this.A05 = false;
        this.A07 = false;
        M3 m10 = new M3() { // from class: com.facebook.ads.redexgen.X.8v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(M6 m11) {
                this.A00.A07 = true;
            }
        };
        this.A0O = m10;
        MB mb2 = new MB() { // from class: com.facebook.ads.redexgen.X.8o
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MC mc2) {
                if (!((AbstractC1097Om) this.A00).A06.A07()) {
                    this.A00.A01();
                }
            }
        };
        this.A0N = mb2;
        MN mn = new MN() { // from class: com.facebook.ads.redexgen.X.8j
            @Override // com.facebook.ads.redexgen.X.C8Y
            public final /* bridge */ /* synthetic */ void A03(C8W c8w) {
            }
        };
        this.A0M = mn;
        M2 m11 = new M2() { // from class: com.facebook.ads.redexgen.X.8V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06746z c06746z) {
                this.A00.A0E(c06746z);
                this.A00.A0F.ABD(c06746z.A00());
            }
        };
        this.A0P = m11;
        OR or = new OR() { // from class: com.facebook.ads.redexgen.X.8C
            public static String[] A01 = {"WHlfg22LQewOceL2LP0nfjs", "MLczN6H9d0ts9YHCrKUbmxW9Pv4xX40Z", "bfgAoKxvo7gEuP52Z2EO408IJ8JPPLb2", "8W4TrLCVwT5pN341HhH6D3mP2byMMwpU", "ScQcjv0hvXE5sqpvLhFnJdo", "ew857MaMURY893GG0hi3zO6RFtTWvxkk", "kzrdBoT0QozH1fOZ2V6a3FXV0JrhAD1i", "6tn8KSSYbJPeTKsUVc3lRKjtLiYgy0EC"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                this.A00.A0F.AAr(this.A00.A0I.getDuration());
                if (this.A00.A0N()) {
                    this.A00.A0J();
                    return;
                }
                SC sc2 = this.A00;
                String[] strArr = A01;
                if (strArr[6].charAt(31) == strArr[1].charAt(31)) {
                    throw new RuntimeException();
                }
                A01[2] = "b2r5SY6tJEDKh19k0rBQmCTxaUfC6Ghy";
                sc2.A0F.AAU();
            }
        };
        this.A0K = or;
        C8A c8a = new C8A(this);
        this.A0L = c8a;
        this.A0C = c1337Xw;
        this.A0R = new C0971Jn(c1337Xw, c0945Il);
        this.A0S = new JY(c1337Xw);
        this.A0A = i14;
        this.A0V = z11;
        this.A09 = i11;
        this.A0B = i12;
        this.A0F = interfaceC1101Oq;
        this.A08 = i13;
        this.A0U = z10;
        this.A0G = new PI(c1337Xw, interfaceC0937Id, super.A03);
        if (i12 == 1) {
            c1mA00 = super.A03.A0m().A01();
        } else {
            c1mA00 = super.A03.A0m().A00();
        }
        this.A00 = c1mA00;
        RN rn = new RN(c1337Xw);
        this.A0I = rn;
        rn.getEventBus().A03(m10, mb2, mn, m11, or, c8a);
        this.A0J = new AnonymousClass74(c1337Xw, interfaceC0937Id, rn, abstractC1404aD.A0s());
        A0A();
        rn.setVideoURI(c6o.A0S(super.A03.A0n().A0D().A08()));
        A09();
        C1203So c1203SoA03 = A03();
        this.A0D = c1203SoA03;
        JQ jq = new JQ(c1203SoA03, 400, 100, 0);
        this.A0T = jq;
        jq.A3T(true, false);
        this.A0Q = new C0981Jy(true);
        A0C();
        ViewOnClickListenerC1207Ss cTAButton = c1203SoA03.getCTAButton();
        this.A0E = cTAButton;
        LO.A0G(1001, cTAButton);
        A08();
        A07();
        c1203SoA03.bringToFront();
        if (IN.A1W(c1337Xw)) {
            c1337Xw.A0A().AFz(rn, super.A03.A0s(), true);
        }
        if (IN.A1X(c1337Xw)) {
            this.A0H = new PQ(c1337Xw, interfaceC0937Id, rn, super.A03.A0s(), null);
        } else {
            this.A0H = null;
        }
    }

    private C1203So A03() {
        String strA06;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (super.A03.A0K().equals(A06(37, 14, 125))) {
            strA06 = EnumC1113Pc.A04.A02();
        } else {
            strA06 = A06(0, 37, 58);
        }
        C1203So c1203So = new C1203So(this.A0C, A0b, super.A03.A0n().A0E().A00() == C1I.A05, getColors(), super.A03.A0n().A0F().A06(), strA06, super.A05, super.A07, super.A09, super.A06);
        LO.A0K(c1203So);
        c1203So.A0C(this.A0B);
        addView(c1203So, layoutParams);
        C1K c1kA0E = super.A03.A0n().A0E();
        C1N c1nA0F = super.A03.A0n().A0F();
        String strA0s = super.A03.A0s();
        String clickEvent = super.A03.A0q().A01();
        c1203So.setInfo(c1kA0E, c1nA0F, strA0s, clickEvent, null);
        return c1203So;
    }

    private void A07() {
        this.A0S.A06(-1, A0Z);
        JY jy = this.A0S;
        int i10 = A0h;
        jy.setPadding(i10, i10, i10, i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0g);
        layoutParams.addRule(12);
        addView(this.A0S, layoutParams);
    }

    private void A08() {
        C0971Jn c0971Jn = this.A0R;
        int i10 = A0d;
        c0971Jn.setPadding(i10, i10, i10, i10);
        int i11 = A0e;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams.setMargins(0, AbstractC1018Ll.A00, A0c, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0I, videoViewParams);
        addView(this.A0R, layoutParams);
    }

    private void A09() {
        postDelayed(new SF(this), IN.A0L(this.A0C));
    }

    private void A0A() {
        this.A0I.A0c(this.A0S);
        this.A0I.A0c(this.A0R);
        if (!TextUtils.isEmpty(super.A03.A0n().A0D().A07())) {
            C06606h c06606h = new C06606h(this.A0C);
            this.A0I.A0c(c06606h);
            c06606h.setImage(super.A03.A0n().A0D().A07());
        }
        this.A0I.A0c(new C6X(this.A0C));
    }

    private final void A0C() {
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null) {
            JU ju = this.A03;
            if (ju != null) {
                this.A0Q.A0I(ju);
            }
            C1M c1mA01 = super.A03.A0m().A01();
            this.A0Q.A0I(new JS(this.A0D.getCTAButton(), 300, -1, c1mA01.A09(true)));
            int i10 = A0Z;
            int i11 = A0a;
            int i12 = A0Y;
            Drawable drawableA08 = LO.A08(i10, i11, i12);
            Drawable endDrawable = LO.A05(c1mA01.A08(true), i12);
            this.A0Q.A0I(new JV(this.A0D.getCTAButton(), 300, drawableA08, endDrawable));
            this.A0Q.A0I(new JT(expandableLayout, 150, false));
            this.A0Q.A9B(this.A0I);
            this.A0Q.A0H(2300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C06746z c06746z) {
        if (this.A0I.getState() == QO.A02 && IN.A1D(this.A0C)) {
            postDelayed(new SE(this, c06746z), 5000L);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final void A0I() {
        C0990Kh c0990Kh = this.A01;
        if (c0990Kh != null) {
            c0990Kh.A07();
        }
        if (IN.A1W(this.A0C)) {
            this.A0C.A0A().AFo(this.A0I);
        }
        PQ pq = this.A0H;
        if (pq != null) {
            pq.A0A();
        }
        RN rn = this.A0I;
        if (rn != null) {
            rn.getEventBus().A04(this.A0O, this.A0N, this.A0M, this.A0P, this.A0K, this.A0L);
            LO.A0H(this.A0I);
            this.A0I.A0V();
        }
        this.A0J.A0g();
        View[] viewArr = new View[3];
        viewArr[0] = this.A0I;
        JY jy = this.A0S;
        String[] strArr = A0X;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A0X[2] = "4e1dr9g4n9kT22ZIdoKy0n8REVoGbgbF";
        viewArr[1] = jy;
        viewArr[2] = this.A0R;
        LO.A0Z(viewArr);
        super.A09.A0V();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final void A0J() {
        this.A0C.A0E().A4B();
        this.A04 = true;
        LO.A0T(this);
        LO.A0H(this.A0I);
        LO.A0Z(this.A0I, this.A0S, this.A0R);
        Pair<PH, View> pairA03 = this.A0G.A03(this.A0E);
        View view = (View) pairA03.second;
        switch (C1098On.A00[((PH) pairA03.first).ordinal()]) {
            case 1:
                this.A0D.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, AbstractC1018Ll.A00, 0, 0);
                layoutParams.addRule(2, this.A0D.getId());
                addView(view, layoutParams);
                break;
            case 2:
                LO.A0Z(this.A0D);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                int i10 = A0f;
                layoutParams2.setMargins(i10, i10, i10, i10);
                addView(view, layoutParams2);
                break;
        }
        if (this.A08 == 0 && this.A0U) {
            if (this.A0V) {
                this.A0F.AFu();
            }
            C0990Kh c0990Kh = new C0990Kh(this.A0A, 100.0f, 100L, new Handler(Looper.getMainLooper()), new SD(this));
            this.A01 = c0990Kh;
            c0990Kh.A08();
            return;
        }
        this.A05 = true;
        this.A0F.ACl(true);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final void A0K() {
        this.A0I.A0b(PZ.A02, 20);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final void A0L(boolean z10) {
        C0990Kh c0990Kh = this.A01;
        if (c0990Kh != null) {
            c0990Kh.A07();
        }
        if (this.A0I.A0i()) {
            return;
        }
        this.A02 = this.A0I.getVideoStartReason();
        this.A06 = z10;
        this.A0I.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final void A0M(boolean z10) {
        PZ pz;
        C0990Kh c0990Kh = this.A01;
        if (c0990Kh != null && !c0990Kh.A06()) {
            C0990Kh c0990Kh2 = this.A01;
            if (A0X[5].charAt(17) != 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0X;
            strArr[7] = "pObqmm4LdTsqTcUgL7kozPbufRCkwYZC";
            strArr[6] = "5szeP9lNqMFVM0rzjOQcuK8NUDwg7u3G";
            c0990Kh2.A08();
        }
        if (this.A04 || this.A0I.getState() == QO.A06 || (pz = this.A02) == null) {
            return;
        }
        if (!this.A06 || z10) {
            this.A0I.A0b(pz, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final boolean A0N() {
        if (this.A08 != 2 && super.A03.A0n().A0O() && !this.A04) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public final boolean A0O() {
        return this.A04;
    }

    public C1M getColors() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public C1100Op getFullScreenAdStyle() {
        return new C1100Op(true, C1100Op.A06, super.A03.A0m().A01(), ViewOnClickListenerC1207Ss.A08(super.A03), super.A03.A0m().A01().A07(true), super.A03.A0n().A0D().A07());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om
    public LG getTouchDataRecorder() {
        return super.A06;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1097Om, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C1M c1mA00;
        super.onConfigurationChanged(configuration);
        if (!this.A04) {
            if (configuration.orientation == 1) {
                c1mA00 = super.A03.A0m().A01();
            } else {
                AnonymousClass19 anonymousClass19A0m = super.A03.A0m();
                if (A0X[4].charAt(4) != 'R') {
                    throw new RuntimeException();
                }
                A0X[1] = "uYIsd2DhsQ91Wp0xmXJ9348eeMLtSRMf";
                c1mA00 = anonymousClass19A0m.A00();
            }
            this.A00 = c1mA00;
            this.A0E.setViewShowsOverMedia(true);
            this.A0E.setUpButtonColors(this.A00);
            this.A0D.A0C(configuration.orientation);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null && z10 && this.A03 == null) {
            JU ju = new JU(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A03 = ju;
            this.A0Q.A0I(ju);
            this.A0Q.A0G();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            A0M(false);
        } else {
            A0L(false);
        }
    }
}
