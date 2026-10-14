package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S3 extends FrameLayout implements InterfaceC1020Ln {
    public static byte[] A0L;
    public static String[] A0M = {"n8b1XAz0kHAkpiWEmzC3t1pF5U", "eWK394xXCAUBfgpESuKIG56NqbrNFWJq", "5CdOn8t3diym6HDjOq5Y6uNvOx4lt5g3", "HN0pIlpAYl374dQUYji0gU", "nPJn2NzIeBIJ0ob92wkGV5", "7vv965TmOe", "OL6PAd", "N5PSCRASy1"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public NR A03;
    public AbstractC1097Om A04;
    public PK A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C1402aB A0A;
    public final C5F A0B;
    public final C6O A0C;
    public final C1337Xw A0D;
    public final InterfaceC0937Id A0E;
    public final C0945Il A0F;
    public final LB A0G;
    public final InterfaceC1019Lm A0H;
    public final FullScreenAdToolbar A0I;
    public final MF A0J;
    public final ArrayList<C1100Op> A0K;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private AbstractC1097Om A07(boolean z10, int i10) {
        S5 s10 = new S5(this, i10);
        AbstractC1404aD abstractC1404aDA0l = this.A0A.A0l(this.A00);
        if (!A0U(abstractC1404aDA0l)) {
            this.A0D.A0E().AFK(EnumC05070d.A06);
            this.A0D.A0E().AF0(this.A00);
            this.A0D.A0E().A49();
            return new SC(this.A0D, this.A0E, abstractC1404aDA0l, this.A0C, this.A0J, this.A00, this.A0H, this.A0F, this.A0A.A0D(), i10, this.A0A.A0h(), z10, this.A0A.A0j(), this.A0A.A0r(), s10);
        }
        int i11 = this.A00;
        String[] strArr = A0M;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[2] = "bDB0WKM3tjeRkIfEXbhmbXqmjWoJ3lp1";
        int iA00 = A00(i11);
        if (iA00 == 0) {
            this.A09 = true;
        }
        this.A0D.A0E().AFK(EnumC05070d.A05);
        this.A0D.A0E().AF0(this.A00);
        this.A0D.A0E().A49();
        return new SG(this.A0D, this.A0J, this.A00, this.A0E, abstractC1404aDA0l, this.A0H, this.A0I, s10, iA00);
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{113, -64, -73, 113, -62, -27, -95};
        String[] strArr = A0M;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[2] = "BvaU1dA3vF4hXYIjQV5InfWnSlZ4OmYy";
    }

    static {
        A0C();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public S3(C1337Xw c1337Xw, MF mf, InterfaceC0937Id interfaceC0937Id, C1402aB c1402aB, C6O c6o, InterfaceC1019Lm interfaceC1019Lm) {
        super(c1337Xw);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new S6(this);
        this.A0D = c1337Xw;
        this.A0J = mf;
        this.A0E = interfaceC0937Id;
        this.A0A = c1402aB;
        this.A0C = c6o;
        this.A0H = interfaceC1019Lm;
        this.A0F = new C0945Il(c1402aB.A0l(0).A0s(), interfaceC0937Id);
        LB lb2 = new LB(this);
        this.A0G = lb2;
        lb2.A05(LA.A03);
        this.A05 = new PK(c1337Xw, mf, c1402aB.A0N(), interfaceC1019Lm);
        FullScreenAdToolbar fullScreenAdToolbarA04 = A04();
        this.A0I = fullScreenAdToolbarA04;
        addView(fullScreenAdToolbarA04, new FrameLayout.LayoutParams(-1, fullScreenAdToolbarA04.getToolbarHeight()));
    }

    private int A00(int i10) {
        if (this.A0A.A0r() && i10 < this.A0A.A0o().size() && i10 >= 0) {
            return this.A0A.A0o().get(i10).intValue();
        }
        return this.A0A.A0D();
    }

    public static /* synthetic */ int A01(S3 s10, int i10) {
        int i11 = s10.A01 + i10;
        s10.A01 = i11;
        return i11;
    }

    private FullScreenAdToolbar A04() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0D, this.A0H, this.A0F, 2);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.setToolbarListener(new S4(this));
        return fullScreenAdToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        boolean acted = A0Q();
        if (acted) {
            this.A0D.A0E().A4C();
        }
    }

    private void A0A() {
        int i10 = this.A00;
        if (i10 > 0 && !TextUtils.isEmpty(this.A0A.A0l(i10 - 1).A0s())) {
            InterfaceC0937Id interfaceC0937Id = this.A0E;
            String strA0s = this.A0A.A0l(this.A00 - 1).A0s();
            ND nd2 = new ND();
            AbstractC1097Om abstractC1097Om = this.A04;
            ND ndA03 = nd2.A03(abstractC1097Om != null ? abstractC1097Om.getAdViewabilityChecker() : null);
            AbstractC1097Om abstractC1097Om2 = this.A04;
            interfaceC0937Id.A9H(strA0s, ndA03.A02(abstractC1097Om2 != null ? abstractC1097Om2.getTouchDataRecorder() : null).A05());
        }
    }

    private void A0B() {
        this.A0D.A0E().A4A();
        this.A07 = true;
        this.A03 = new NR(this.A0D, this.A0A, this.A0E, this.A0H, this.A0I.getToolbarHeight(), this.A02);
        C1100Op c1100Op = null;
        Iterator<C1100Op> it = this.A0K.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0M[1].charAt(22) == '6') {
                String[] strArr = A0M;
                strArr[7] = "ZPnrdglx3i";
                strArr[5] = "Z92DtyKnO3";
                if (!zHasNext) {
                    break;
                }
                C1100Op s10 = it.next();
                if (s10.A00 == C1100Op.A06) {
                    c1100Op = s10;
                    break;
                }
            } else {
                throw new RuntimeException();
            }
        }
        if (c1100Op != null) {
            A0H(this.A03, c1100Op);
        } else if (!this.A0K.isEmpty()) {
            A0H(this.A03, this.A0K.get(0));
        }
        A0O(true);
        AbstractC1097Om abstractC1097Om = this.A04;
        if (abstractC1097Om != null) {
            LO.A0J(abstractC1097Om);
            this.A04.A0I();
            this.A04 = null;
        }
        LO.A0J(this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0D() {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.A0G.A05(LA.A04);
    }

    private synchronized void A0E() {
        this.A0H.A3y(this.A0J.A5n());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(float f10) {
        float seenCurrentPosMS;
        float fA00 = A00(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A0r() ? 0 : this.A01) + f10;
        if (fA00 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            seenCurrentPosMS = seenCurrentPosMS2 / fA00;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A0r()) {
            this.A06 = false;
            this.A0I.setProgressImmediate(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0I.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            this.A09 = true;
            this.A0I.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(int i10) {
        this.A0D.A0E().A47(i10);
        this.A09 = true;
        A0E();
        A0A();
        this.A0H.A3y(this.A0J.A6m());
    }

    private void A0H(ViewGroup viewGroup, C1100Op c1100Op) {
        if (c1100Op.A00 == C1100Op.A06 && c1100Op.A03 != null) {
            C1066Nh.A00(this.A0D, viewGroup, c1100Op.A03);
        } else {
            LO.A0M(viewGroup, c1100Op.A01);
        }
        this.A0I.setFullscreen(c1100Op.A05);
        this.A0I.A06(c1100Op.A02, c1100Op.A04);
    }

    private final void A0I(C5H c5h) {
        c5h.A0N(this.A0B);
        int i10 = c5h.A0J().getResources().getConfiguration().orientation;
        this.A02 = i10;
        A0P(this.A0A.A0q(), i10);
        A0D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(boolean z10) {
        boolean z11 = (!A0S() || A0R() || A0T()) ? false : true;
        boolean zA0R = A0R();
        if (A0M[1].charAt(22) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[7] = "fhNsXNJVUA";
        strArr[5] = "wXa0tVX5fv";
        if (!zA0R && !z11) {
            this.A09 = true;
            if (z10) {
                this.A0I.setToolbarActionMessage(A08(0, 0, 66));
            }
            this.A0I.setToolbarActionMode(0);
            return;
        }
        this.A0I.setToolbarActionMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(boolean z10, int i10) {
        AbstractC1097Om abstractC1097Om = this.A04;
        if (abstractC1097Om != null) {
            abstractC1097Om.removeAllViews();
            if (A0M[1].charAt(22) != '6') {
                throw new RuntimeException();
            }
            A0M[2] = "W3TlfOl3oEXDpQnuuCTH10eCcUmU4b3A";
            LO.A0J(this.A04);
        }
        if (!A0R()) {
            this.A09 = true;
            if (A0S()) {
                A0B();
                return;
            } else {
                A0G(1);
                return;
            }
        }
        if (this.A0A.A0r()) {
            this.A09 = false;
            this.A0I.setProgressImmediate(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        boolean isLoaded = this.A0D.A00().A8l(this.A0A.A0l(this.A00).A0s(), this.A0A.A0m());
        if (!isLoaded) {
            this.A0D.A0E().A48();
            A0G(2);
            return;
        }
        AbstractC1097Om abstractC1097OmA07 = A07(z10, i10);
        this.A04 = abstractC1097OmA07;
        setupToolbarForAd(abstractC1097OmA07);
        addView(this.A04, 0, A0N);
        this.A00++;
        this.A04.A0K();
    }

    private boolean A0Q() {
        AbstractC1097Om abstractC1097Om;
        if (!this.A09) {
            AbstractC1097Om abstractC1097Om2 = this.A04;
            if (abstractC1097Om2 == null || !abstractC1097Om2.A0O() || this.A0A.A0h() != 1) {
                return false;
            }
            A0P(false, this.A02);
            return true;
        }
        if (A0R() && (abstractC1097Om = this.A04) != null && (abstractC1097Om.A0O() || this.A0A.A0h() == 2)) {
            if (!this.A0A.A0r()) {
                this.A08 = true;
            }
            A0P(false, this.A02);
            return true;
        }
        AbstractC1097Om abstractC1097Om3 = this.A04;
        if (abstractC1097Om3 != null && abstractC1097Om3.A0N()) {
            this.A0I.setToolbarActionMode(0);
            this.A0D.A0E().A4B();
            this.A04.A0J();
            return true;
        }
        if (A0S() && !A0T()) {
            A0B();
            return true;
        }
        if ((this.A04 instanceof SG) && A0R()) {
            A0P(false, this.A02);
            return true;
        }
        this.A0F.A04(EnumC0944Ik.A07, null);
        A0G(4);
        return true;
    }

    private boolean A0R() {
        return this.A00 < this.A0A.A0i();
    }

    private boolean A0S() {
        return this.A0A.A0h() == 2;
    }

    private final boolean A0T() {
        return this.A07;
    }

    public static boolean A0U(AbstractC1404aD abstractC1404aD) {
        return TextUtils.isEmpty(abstractC1404aD.A0n().A0D().A08());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void A9A(Intent intent, Bundle bundle, C5H c5h) {
        this.A0H.A3P(this, A0N);
        A0I(c5h);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AC8(boolean z10) {
        AbstractC1097Om abstractC1097Om = this.A04;
        if (abstractC1097Om != null) {
            abstractC1097Om.A0L(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void ACY(boolean z10) {
        AbstractC1097Om abstractC1097Om = this.A04;
        if (abstractC1097Om != null) {
            abstractC1097Om.A0M(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void AEi(Bundle bundle) {
    }

    public AbstractC1097Om getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        AbstractC1097Om abstractC1097Om = this.A04;
        if (abstractC1097Om != null) {
            abstractC1097Om.onConfigurationChanged(configuration);
        }
        AbstractC1097Om abstractC1097Om2 = this.A04;
        if (abstractC1097Om2 instanceof SG) {
            A0H(abstractC1097Om2, abstractC1097Om2.getFullScreenAdStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1020Ln
    public final void onDestroy() {
        AbstractC1097Om abstractC1097Om = this.A04;
        if (abstractC1097Om != null) {
            abstractC1097Om.A0I();
            this.A04 = null;
        }
        this.A0D.A00().A4D(this.A0A.A0m());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC1019Lm interfaceC1019Lm) {
    }

    public void setServerSideRewardHandler(PK pk) {
        this.A05 = pk;
    }

    private void setupToolbarForAd(AbstractC1097Om abstractC1097Om) {
        if (this.A0I == null) {
            return;
        }
        this.A06 = true;
        AbstractC1404aD abstractC1404aDA0l = this.A0A.A0l(this.A00);
        this.A0I.A09(this.A0D, abstractC1404aDA0l.A0h());
        this.A0I.A08(abstractC1404aDA0l.A0q(), abstractC1404aDA0l.A0s(), A00(this.A00));
        C1100Op fullScreenAdStyle = abstractC1097Om.getFullScreenAdStyle();
        A0H(abstractC1097Om, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0I.setToolbarActionMessage(A08(4, 3, 90) + (this.A00 + 1) + A08(0, 4, 42) + this.A0A.A0i());
        if (this.A08) {
            this.A0I.setToolbarActionMode(1);
        }
    }
}
