package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.redexgen.X.AbstractC1018Ll;
import com.facebook.ads.redexgen.X.C05311c;
import com.facebook.ads.redexgen.X.C0945Il;
import com.facebook.ads.redexgen.X.C1016Lj;
import com.facebook.ads.redexgen.X.C1070Nl;
import com.facebook.ads.redexgen.X.C1337Xw;
import com.facebook.ads.redexgen.X.C1M;
import com.facebook.ads.redexgen.X.C1W;
import com.facebook.ads.redexgen.X.InterfaceC1017Lk;
import com.facebook.ads.redexgen.X.InterfaceC1019Lm;
import com.facebook.ads.redexgen.X.Kn;
import com.facebook.ads.redexgen.X.LO;
import com.facebook.ads.redexgen.X.LW;
import com.facebook.ads.redexgen.X.M7;
import com.facebook.ads.redexgen.X.P1;
import com.facebook.ads.redexgen.X.ViewOnClickListenerC1024Lr;
import com.facebook.ads.redexgen.X.ViewOnClickListenerC1207Ss;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC1018Ll {
    public static byte[] A09;
    public static String[] A0A = {"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public C1016Lj A00;
    public InterfaceC1017Lk A01;
    public InterfaceC1017Lk A02;
    public boolean A03;
    public final RelativeLayout A04;
    public final C0945Il A05;
    public final InterfaceC1019Lm A06;
    public final M7 A07;
    public final P1 A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{-26, 15, 18, 22, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74, 77, 72, 72, 69, 59, 58, 75};
    }

    static {
        A03();
        int i10 = (int) (Kn.A02 * 10.0f);
        A0B = i10;
        int i11 = (int) (Kn.A02 * 16.0f);
        A0F = i11;
        A0D = i11 - i10;
        A0E = (i11 * 2) - i10;
        A0C = (int) (Kn.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C1337Xw c1337Xw, InterfaceC1019Lm interfaceC1019Lm, C0945Il c0945Il, int i10) {
        super(c1337Xw);
        this.A01 = null;
        this.A03 = true;
        this.A06 = interfaceC1019Lm;
        this.A05 = c0945Il;
        setGravity(16);
        M7 m10 = new M7(c1337Xw, i10);
        this.A07 = m10;
        m10.setContentDescription(A02(0, 8, 50));
        m10.setActionClickListener(new ViewOnClickListenerC1024Lr(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i11 = A0D;
        layoutParams.setMargins(i11, i11, A0E, i11);
        addView(m10, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(c1337Xw);
        this.A04 = relativeLayout;
        LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(0, -2);
        containerParams.weight = 1.0f;
        P1 p10 = new P1(c1337Xw);
        this.A08 = p10;
        LinearLayout.LayoutParams toolbarActionViewParams = new LinearLayout.LayoutParams(-2, -2);
        toolbarActionViewParams.gravity = 17;
        p10.setLayoutParams(toolbarActionViewParams);
        relativeLayout.addView(p10);
        addView(relativeLayout, containerParams);
    }

    public FullScreenAdToolbar(C1337Xw c1337Xw, InterfaceC1019Lm interfaceC1019Lm, C0945Il c0945Il, int i10, int i11) {
        this(c1337Xw, interfaceC1019Lm, c0945Il, i10);
        A09(c1337Xw, i11);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public final void A04() {
        InterfaceC1017Lk interfaceC1017Lk = this.A01;
        if (interfaceC1017Lk != null) {
            this.A02 = interfaceC1017Lk;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public final void A05() {
        this.A01 = getToolbarListener();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public final void A06(C1M c1m, boolean z10) {
        boolean z11 = this.A03;
        int iA04 = c1m.A04(z11);
        this.A08.A01(c1m.A0A(z11), iA04);
        this.A00.setIconColors(iA04);
        this.A00.setContentDescription(A02(8, 9, 117));
        this.A07.A02(c1m, z11, z10);
        if (z11) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            LO.A0S(this, gradientDrawable);
            LO.A0Q(this.A00, 0, -16777216, A0C);
            return;
        }
        LO.A0M(this, 0);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public final boolean A07() {
        return this.A07.A03();
    }

    public final void A08(C1W c1w, String str, int i10) {
        this.A07.setInitialUnskippableSeconds(i10);
        C1016Lj c1016Lj = this.A00;
        if (c1016Lj != null) {
            c1016Lj.setAdDetails(c1w, str, this.A05, this.A06);
        }
    }

    public final void A09(C1337Xw c1337Xw, int i10) {
        C1016Lj c1016Lj = this.A00;
        if (c1016Lj != null) {
            LO.A0J(c1016Lj);
            this.A00.removeAllViews();
        }
        this.A00 = new C1016Lj(c1337Xw, i10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        int i11 = A0F;
        layoutParams.setMargins(0, i11 / 2, i11 / 2, i11 / 2);
        addView(this.A00, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public View getDetailsContainer() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public int getToolbarActionMode() {
        return this.A07.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public int getToolbarHeight() {
        return AbstractC1018Ll.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public InterfaceC1017Lk getToolbarListener() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setAdReportingVisible(boolean z10) {
        this.A00.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A08.setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setCTAClickListener(ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss) {
        this.A08.setOnClickListener(C1070Nl.A03(viewOnClickListenerC1207Ss, A02(17, 7, 104)));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setFullscreen(boolean z10) {
        this.A03 = z10;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setPageDetails(C1W c1w, String str, int i10, C05311c c05311c) {
        this.A07.setInitialUnskippableSeconds(i10);
        this.A08.setPageDetails(c1w);
        C1016Lj c1016Lj = this.A00;
        if (c1016Lj != null) {
            c1016Lj.setAdDetails(c1w, str, this.A05, this.A06);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setPageDetailsVisible(boolean z10) {
        this.A04.removeAllViews();
        if (z10) {
            RelativeLayout relativeLayout = this.A04;
            P1 p10 = this.A08;
            if (A0A[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(p10);
        }
        M7 m10 = this.A07;
        String[] strArr2 = A0A;
        if (strArr2[2].length() == strArr2[3].length()) {
            m10.setToolbarMessageEnabled(!z10);
        } else {
            A0A[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
            m10.setToolbarMessageEnabled(!z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setProgress(float f10) {
        this.A07.setProgress(f10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setProgressClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setProgressImage(LW lw) {
        this.A07.setProgressImage(lw);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setProgressImmediate(float f10) {
        this.A07.setProgressImmediate(f10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setProgressSpinnerInvisible(boolean z10) {
        this.A07.setProgressSpinnerInvisible(z10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setToolbarActionMessage(String str) {
        this.A07.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setToolbarActionMode(int i10) {
        this.A07.setToolbarActionMode(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1018Ll
    public void setToolbarListener(InterfaceC1017Lk interfaceC1017Lk) {
        this.A02 = interfaceC1017Lk;
    }
}
