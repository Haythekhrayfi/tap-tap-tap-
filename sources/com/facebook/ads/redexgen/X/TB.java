package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TB extends MK {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C2E A04;
    public final C1337Xw A05;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{-57, -26, -24, -16, -92, -51, -48, -44, -58, -127, -94, -59, -127, -77, -58, -47, -48, -45, -43, -54, -49, -56};
    }

    static {
        A0C();
        A09 = (int) (Kn.A02 * 4.0f);
        A08 = (int) (Kn.A02 * 10.0f);
        A07 = (int) (Kn.A02 * 44.0f);
    }

    public TB(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, String str) {
        super(c1337Xw, interfaceC0937Id, str);
        this.A05 = c1337Xw;
        this.A04 = C2F.A00(c1337Xw.A01());
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        int i10 = A08;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(-10459280);
        int i11 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        layoutParams.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A02 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        this.A00 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setLayoutParams(layoutParams2);
        horizontalScrollView.addView(linearLayout, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.A03 = linearLayout2;
        linearLayout2.setOrientation(0);
        LO.A0M(linearLayout2, -218103809);
        linearLayout2.setMotionEventSplittingEnabled(false);
        linearLayout2.addView(imageView, layoutParams);
        linearLayout2.addView(horizontalScrollView, layoutParams2);
        addView(linearLayout2, new FrameLayout.LayoutParams(-1, -1));
        linearLayout2.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0L() {
        this.A01.setImageBitmap(LX.A01(LW.CROSS));
        this.A01.setOnClickListener(new MT(this));
        this.A01.setContentDescription(A0B(4, 18, 89));
        MO mo = new MO(this.A05);
        mo.setData(this.A04.A0H(), LW.HIDE_AD);
        mo.setOnClickListener(new MU(this, mo));
        MO mo2 = new MO(this.A05);
        mo2.setData(this.A04.A0L(), LW.REPORT_AD);
        mo2.setOnClickListener(new MV(this, mo2));
        MO mo3 = new MO(this.A05);
        mo3.setData(this.A04.A0M(), LW.AD_CHOICES_ICON);
        mo3.setOnClickListener(new MW(this, mo3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A09;
        layoutParams.setMargins(0, i10, i10, i10);
        LO.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(mo, layoutParams);
        this.A02.addView(mo2, layoutParams);
        this.A02.addView(mo3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0M() {
        LO.A0I(this);
        LO.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0N(C2I c2i, C2G c2g) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        LO.A0X(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        LO.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final void A0O(C2I c2i, C2G c2g) {
        LO.A0T(this.A03);
        this.A01.setImageBitmap(LX.A01(LW.BACK_ARROW));
        this.A01.setOnClickListener(new MX(this));
        this.A01.setContentDescription(A0B(0, 4, 125));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A09;
        layoutParams.setMargins(0, i10, i10, i10);
        for (C2I c2i2 : c2i.A05()) {
            MO mo = new MO(this.A05);
            mo.setData(c2i2.A04(), null);
            mo.setOnClickListener(new MY(this, mo, c2i2));
            this.A02.addView(mo, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MK
    public final boolean A0P() {
        return true;
    }
}
