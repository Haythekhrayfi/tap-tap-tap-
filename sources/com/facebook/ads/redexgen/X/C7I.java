package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C7I extends S7 {
    public static byte[] A0L;
    public static String[] A0M = {"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    public AbstractC1072Nn A00;
    public PK A01;
    public PZ A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C5F A09;
    public final PQ A0A;
    public final RN A0B;
    public final AnonymousClass74 A0C;
    public final OR A0D;
    public final AbstractC1064Nf A0E;
    public final MN A0F;
    public final MB A0G;
    public final M3 A0H;
    public final M2 A0I;
    public final C0971Jn A0J;
    public final JY A0K;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0L = new byte[]{-3, 21, 7, 5, 21, -1};
    }

    static {
        A08();
    }

    public C7I(C1337Xw c1337Xw, MF mf, InterfaceC0937Id interfaceC0937Id, AbstractC1404aD abstractC1404aD, C6O c6o, InterfaceC1019Lm interfaceC1019Lm) {
        super(c1337Xw, mf, interfaceC0937Id, abstractC1404aD, c6o, interfaceC1019Lm);
        this.A09 = new C1185Rw(this);
        M3 m10 = new M3() { // from class: com.facebook.ads.redexgen.X.88
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(M6 m11) {
                this.A00.A07 = true;
            }
        };
        this.A0H = m10;
        MB mb2 = new MB() { // from class: com.facebook.ads.redexgen.X.87
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MC mc2) {
                this.A00.A08 = true;
                this.A00.A0P();
            }
        };
        this.A0G = mb2;
        MN mn = new MN() { // from class: com.facebook.ads.redexgen.X.86
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass70 anonymousClass70) {
            }
        };
        this.A0F = mn;
        M2 m11 = new M2() { // from class: com.facebook.ads.redexgen.X.7y
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06746z c06746z) {
                this.A00.A0F(c06746z);
                this.A00.A0E(c06746z);
                this.A00.A00.A0C(c06746z);
            }
        };
        this.A0I = m11;
        OR or = new OR() { // from class: com.facebook.ads.redexgen.X.7r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                C7I c7i = this.A00;
                c7i.A0D(anonymousClass73, c7i.A0B.getState() != QO.A06, false);
            }
        };
        this.A0D = or;
        C7L c7l = new C7L(this);
        this.A0E = c7l;
        boolean z10 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        RN rn = new RN(super.A03);
        this.A0B = rn;
        rn.setFunnelLoggingHandler(super.A05);
        rn.getEventBus().A03(m10, mb2, mn, m11, or, c7l);
        this.A0C = new AnonymousClass74(super.A03, super.A04, rn, super.A01.A0s());
        if (IN.A1X(super.A03)) {
            this.A0A = new PQ(super.A03, super.A04, rn, super.A01.A0s(), null);
        } else {
            this.A0A = null;
        }
        this.A01 = new PK(super.A03, super.A09, super.A01.A0N(), interfaceC1019Lm);
        this.A0J = new C0971Jn(super.A03, super.A05);
        this.A0K = new JY(super.A03);
        A07();
        rn.setVideoURI(super.A02.A0S(super.A01.A0n().A0D().A08()));
        A05();
        int iA03 = super.A01.A0n().A0D().A03();
        if (IN.A1r(super.A03)) {
            this.A05 = iA03 == 0;
        } else {
            this.A05 = iA03 <= 0;
        }
        if (super.A01.A0n().A0M() && super.A01.A0n().A0D().A02() > 0) {
            z10 = true;
        }
        this.A03 = z10;
        LO.A0M(this, super.A01.A0m().A01().A07(true));
        if (IN.A1l(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private AbstractC1072Nn A00(int i10) {
        return C1073No.A00(new C1075Nq(super.A03, super.A04, super.A08, super.A01, this.A0B, super.A0A, super.A06).A0E(super.A07.getToolbarHeight()).A0H(super.A07).A0D(i10).A0F(this.A0J).A0I(this.A0K).A0J(), null, true);
    }

    private void A04() {
        this.A0B.postDelayed(new C1184Rv(this), IN.A0K(super.A03));
    }

    private void A05() {
        this.A0B.postDelayed(new C1183Ru(this), IN.A0L(super.A03));
    }

    private void A06() {
        this.A05 = true;
        super.A07.A04();
        AbstractC1072Nn abstractC1072Nn = this.A00;
        if (abstractC1072Nn != null) {
            abstractC1072Nn.A0r();
        }
    }

    private void A07() {
        this.A0B.A0c(this.A0K);
        this.A0B.A0c(this.A0J);
        if (!TextUtils.isEmpty(super.A01.A0n().A0D().A07())) {
            C06606h c06606h = new C06606h(super.A03);
            this.A0B.A0c(c06606h);
            c06606h.setImage(super.A01.A0n().A0D().A07());
        }
        C6C c6c = new C6C(super.A03, true, super.A05);
        this.A0B.A0c(c6c);
        this.A0B.A0c(new C0973Jq(c6c, EnumC1123Pm.A03, true));
        this.A0B.A0c(new C6X(super.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(AnonymousClass73 anonymousClass73, boolean z10, boolean z11) {
        if (this.A06) {
            return;
        }
        if (A0M[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "N5ZIPH8mvSXK1CHoPTlSEsF";
        strArr[7] = "PVGkj9Ta";
        this.A06 = true;
        if (!this.A05) {
            A06();
        }
        AbstractC1072Nn abstractC1072Nn = this.A00;
        if (abstractC1072Nn != null) {
            abstractC1072Nn.A0B(anonymousClass73);
        }
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0H(z10, z11);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C06746z c06746z) {
        if (this.A0B.getState() == QO.A02 && IN.A1D(super.A03)) {
            this.A0B.postDelayed(new C1186Rx(this, c06746z), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(C06746z c06746z) {
        int iA00 = c06746z.A00();
        if (this.A03) {
            int currentPosMs = iA00 / 1000;
            int iA02 = super.A01.A0n().A0D().A02() - currentPosMs;
            if (!ViewOnClickListenerC1207Ss.A08(super.A01)) {
                if (iA02 > 0) {
                    super.A07.setToolbarActionMessage(super.A01.A0r().A02().replace(A03(0, 6, 74), String.valueOf(iA02)));
                } else {
                    super.A07.setToolbarActionMessage(A03(0, 0, 25));
                }
            }
            if (iA02 <= 0) {
                String[] strArr = A0M;
                String str = strArr[2];
                String str2 = strArr[7];
                int totalSecondsForReward = str.length();
                int currentPosMs2 = str2.length();
                if (totalSecondsForReward == currentPosMs2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0M;
                strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
                strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
                A0H(false, false);
            }
        }
        int currentPosMs3 = super.A01.A0n().A0D().A03();
        float f10 = currentPosMs3 * 1000.0f;
        int currentPosMs4 = this.A0B.getDuration();
        float seenPercentage = iA00 / Math.min(f10, currentPosMs4);
        super.A07.setProgress(100.0f * seenPercentage);
        if (seenPercentage >= 1.0f && !this.A05) {
            A06();
            AbstractC1018Ll abstractC1018Ll = super.A07;
            int currentPosMs5 = getCloseButtonStyle();
            abstractC1018Ll.setToolbarActionMode(currentPosMs5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(String str) {
        int currentPositionInMillis = 0;
        int duration = 0;
        RN rn = this.A0B;
        if (rn != null) {
            currentPositionInMillis = rn.getCurrentPositionInMillis();
            duration = this.A0B.getDuration();
            this.A0B.A0Z(3);
        }
        super.A03.A0E().A2u(str);
        if (IN.A1E(super.A03)) {
            A0D(new AnonymousClass73(currentPositionInMillis, duration), false, true);
            return;
        }
        InterfaceC1019Lm interfaceC1019Lm = super.A08;
        int duration2 = A0M[3].charAt(0);
        if (duration2 == 122) {
            throw new RuntimeException();
        }
        A0M[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        interfaceC1019Lm.A3y(super.A09.A6q());
        super.A08.A3y(super.A09.A6m());
    }

    private synchronized void A0H(boolean z10, boolean z11) {
        if (this.A03 && !z10 && !z11) {
            super.A08.A3y(super.A09.A5n());
            this.A01.A05();
            this.A03 = false;
            AbstractC1072Nn abstractC1072Nn = this.A00;
            if (abstractC1072Nn != null) {
                abstractC1072Nn.A0p();
            }
            return;
        }
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.S7
    public final void A0Q() {
        LO.A0L(this.A00);
        LO.A0L(super.A07);
        this.A0B.setVolume(super.A01.A0n().A0D().A09() ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : 1.0f);
        this.A0B.A0b(PZ.A02, 20);
        AbstractC1072Nn abstractC1072Nn = this.A00;
        if (abstractC1072Nn != null && this.A03) {
            abstractC1072Nn.A0q();
        }
        AbstractC1072Nn abstractC1072Nn2 = this.A00;
        if (abstractC1072Nn2 != null && !this.A05) {
            abstractC1072Nn2.A0s();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.X.S7
    public final void A0S(C5H c5h) {
        c5h.A0N(this.A09);
        int orientation = c5h.A0J().getResources().getConfiguration().orientation;
        AbstractC1072Nn abstractC1072NnA00 = A00(orientation);
        this.A00 = abstractC1072NnA00;
        addView(abstractC1072NnA00, S7.A0E);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        LO.A0H(this.A00);
        LO.A0H(super.A07);
        AbstractC1072Nn abstractC1072Nn = this.A00;
        setUpFullscreenMode(abstractC1072Nn != null && abstractC1072Nn.A0u());
    }

    @Override // com.facebook.ads.redexgen.X.S7
    public final boolean A0T() {
        AbstractC1072Nn abstractC1072Nn = this.A00;
        return abstractC1072Nn != null && abstractC1072Nn.A0v(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AC8(boolean z10) {
        if (this.A0B.A0i()) {
            return;
        }
        this.A02 = this.A0B.getVideoStartReason();
        this.A04 = z10;
        this.A0B.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void ACY(boolean z10) {
        PZ pz;
        if (this.A0B.A0j() || this.A06 || this.A0B.getState() == QO.A06 || (pz = this.A02) == null) {
            return;
        }
        if (!this.A04 || z10) {
            RN rn = this.A0B;
            String[] strArr = A0M;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            A0M[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            rn.A0b(pz, 19);
        }
    }

    private int getCloseButtonStyle() {
        AbstractC1072Nn abstractC1072Nn = this.A00;
        if (abstractC1072Nn != null) {
            return abstractC1072Nn.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.S7, com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void onDestroy() {
        super.onDestroy();
        if (IN.A1W(super.A03)) {
            super.A03.A0A().AFo(this.A0B);
        }
        AbstractC1072Nn abstractC1072Nn = this.A00;
        if (abstractC1072Nn != null) {
            abstractC1072Nn.A0o();
        }
        RN rn = this.A0B;
        if (rn != null) {
            if (!this.A06) {
                rn.A0a(PU.A05);
            }
            this.A0B.getEventBus().A04(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
            this.A0B.A0V();
        }
        PQ pq = this.A0A;
        if (pq != null) {
            pq.A0A();
        }
        this.A0C.A0g();
    }

    public void setServerSideRewardHandler(PK pk) {
        this.A01 = pk;
    }
}
