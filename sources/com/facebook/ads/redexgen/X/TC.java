package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TC extends MK {
    public static final int A03 = (int) (Kn.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C2E A01;
    public final C1337Xw A02;

    public TC(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str, C1W c1w, InterfaceC1020Ln interfaceC1020Ln, InterfaceC1019Lm interfaceC1019Lm) {
        super(c1337Xw, interfaceC0937Id, str, c1w, interfaceC1020Ln, interfaceC1019Lm);
        this.A02 = c1337Xw;
        this.A01 = C2F.A00(c1337Xw.A01());
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A00 = relativeLayout;
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        LO.A0M(relativeLayout, -1728053248);
        relativeLayout.setOnClickListener(new MP(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z10 ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            LO.A0V(this, transitionSet);
            return;
        }
        LO.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0L() {
        C2I c2iA0A = this.A01.A0A();
        MZ mz = new MZ(this.A02);
        mz.setInfo(LW.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        mz.setOnClickListener(new MQ(this));
        C2I c2iA0B = this.A01.A0B();
        MZ mz2 = new MZ(this.A02);
        mz2.setInfo(LW.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        mz2.setOnClickListener(new MR(this));
        MZ mz3 = new MZ(this.A02);
        mz3.setInfo(LW.AD_CHOICES_ICON, this.A01.A0M(), "");
        mz3.setOnClickListener(new MS(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i10 = A03;
        linearLayout.setPadding(i10 * 2, i10, i10 * 2, i10);
        LO.A0M(linearLayout, -1);
        if (!c2iA0A.A05().isEmpty()) {
            linearLayout.addView(mz, layoutParams);
        }
        if (!c2iA0B.A05().isEmpty()) {
            linearLayout.addView(mz2, layoutParams);
        }
        linearLayout.addView(mz3, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0M() {
        LO.A0I(this);
        this.A00.removeAllViews();
        LO.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0N(C2I c2i, C2G c2g) {
        String strA0E;
        int i10;
        if (c2g == C2G.A04) {
            return;
        }
        boolean z10 = c2g == C2G.A05;
        MI mi = new MI(this.A02, this.A0B);
        if (z10) {
            strA0E = this.A01.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        MI miA0E = mi.A0I(strA0E).A0H(this.A01.A0D()).A0F(c2i.A04()).A0E(z10 ? LW.REPORT_AD : LW.HIDE_AD);
        if (z10) {
            i10 = -552389;
        } else {
            i10 = -13272859;
        }
        MJ adHiddenView = miA0E.A0D(i10).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        LO.A0M(adHiddenView, -1);
        LO.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0O(C2I c2i, C2G c2g) {
        String strA0H;
        boolean z10 = c2g == C2G.A05;
        C1337Xw c1337Xw = this.A02;
        MM mm = this.A0B;
        if (z10) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        C1035Mc c1035Mc = new C1035Mc(c1337Xw, c2i, mm, strA0H, z10 ? LW.REPORT_AD : LW.HIDE_AD);
        c1035Mc.setClickable(true);
        LO.A0M(c1035Mc, -1);
        int i10 = A03;
        c1035Mc.setPadding(i10 * 2, i10, i10 * 2, i10);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(c1035Mc, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final boolean A0P() {
        return false;
    }
}
