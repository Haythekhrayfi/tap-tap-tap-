package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TA extends MK {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2E A03;
    public final C1337Xw A04;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, 22, 20, Ascii.FS, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (Kn.A02 * 8.0f);
        A07 = (int) (Kn.A02 * 10.0f);
        A06 = (int) (Kn.A02 * 44.0f);
    }

    public TA(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str) {
        super(c1337Xw, interfaceC0937Id, str);
        this.A04 = c1337Xw;
        this.A03 = C2F.A00(c1337Xw.A01());
        ImageView imageView = new ImageView(getContext());
        this.A00 = imageView;
        int i10 = A07;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setColorFilter(-10459280);
        int i11 = A06;
        LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(i11, i11);
        closeButtonParams.gravity = 3;
        imageView.setLayoutParams(closeButtonParams);
        ScrollView scrollView = new ScrollView(getContext());
        this.A02 = scrollView;
        scrollView.setFillViewport(true);
        LO.A0M(scrollView, -218103809);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A01 = linearLayout;
        linearLayout.setOrientation(1);
        int i12 = A08;
        linearLayout.setPadding(i12, i12, i12, i12);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0L() {
        this.A00.setImageBitmap(LX.A01(LW.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC1036Md(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        MO mo = new MO(this.A04);
        mo.setData(this.A03.A0H(), LW.HIDE_AD);
        mo.setOnClickListener(new ViewOnClickListenerC1037Me(this, mo));
        MO mo2 = new MO(this.A04);
        mo2.setData(this.A03.A0L(), LW.REPORT_AD);
        mo2.setOnClickListener(new ViewOnClickListenerC1038Mf(this, mo2));
        MO mo3 = new MO(this.A04);
        mo3.setData(this.A03.A0M(), LW.AD_CHOICES_ICON);
        mo3.setOnClickListener(new ViewOnClickListenerC1039Mg(this, mo3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A08;
        menuParams.setMargins(i10, i10, i10, i10);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        LO.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(mo, menuParams);
        linearLayout.addView(mo2, menuParams);
        linearLayout.addView(mo3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0M() {
        LO.A0I(this);
        LO.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0N(C2I c2i, C2G c2g) {
        String strA0H;
        LW lw;
        int i10;
        this.A00.setOnClickListener(null);
        if (c2g == C2G.A05) {
            strA0H = this.A03.A0F();
            lw = LW.REPORT_AD;
            i10 = -552389;
        } else {
            strA0H = this.A03.A0H();
            lw = LW.HIDE_AD;
            i10 = -13272859;
        }
        MI miA0I = new MI(this.A04, this.A0B).A0I(strA0H);
        String title = this.A03.A0D();
        MI miA0H = miA0I.A0H(title);
        String title2 = c2i.A04();
        MJ adHiddenView = miA0H.A0F(title2).A0K(false).A0E(lw).A0D(i10).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        LO.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0O(C2I c2i, C2G c2g) {
        boolean isReportFlow = c2g == C2G.A05;
        C1035Mc c1035Mc = new C1035Mc(this.A04, c2i, this.A0B, isReportFlow ? LW.REPORT_AD : LW.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(LX.A01(LW.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC1040Mh(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        LO.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c1035Mc, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final boolean A0P() {
        return true;
    }
}
