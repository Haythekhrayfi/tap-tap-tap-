package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2Q extends FrameLayout {
    public static final float A08;
    public static final int A09;
    public static final C2S A0A;
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final Rect A04;
    public final Rect A05;
    public final C2R A06;
    public static String[] A07 = {"jVZ1Tu881vaZhMQc7G1YnAdrBZwLOzLZ", "MIZgMzLB91QWfj9gVmnmcTG9oR84Ntwz", "DCbfL76gOTURmFCUeHCsoybhclYkmTay", "EMPd0g2FUYEiLKskd4o9XcZgPaWME7KU", "G2pxhAodnNK6EDlWmu9QTAPYKMlMfLOc", "qEeDuFDfyNwl7ByTckOuFZ9zHyfaVY7D", "VB67ht075LyAy5nhvmM9NplNYlVRYF1n", "i4ARItf07QURagRfhioscqF5iwXVDFyZ"};
    public static final int[] A0B = {R.attr.colorBackground};

    static {
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        A08 = f10;
        A09 = (int) (f10 * 1.0f);
        if (Build.VERSION.SDK_INT >= 21) {
            A0A = new ZL();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A0A = new EL();
        } else {
            A0A = new ZJ();
        }
        A0A.A8g();
    }

    public C2Q(Context context) {
        this(context, null);
    }

    public C2Q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2Q(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.A04 = rect;
        this.A05 = new Rect();
        ZN zn = new ZN(this);
        this.A06 = zn;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(A0B);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        Color.colorToHSV(color, new float[3]);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-328966);
        this.A02 = false;
        this.A03 = true;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        int themeColorBackground = 10.0f > 50.0f ? 1092616192 : 1112014848;
        this.A01 = 0;
        this.A00 = 0;
        A0A.A8h(zn, context, colorStateListValueOf, 10.0f, 10.0f, themeColorBackground);
    }

    public ColorStateList getCardBackgroundColor() {
        return A0A.A60(this.A06);
    }

    public float getCardElevation() {
        return A0A.A6l(this.A06);
    }

    public int getContentPaddingBottom() {
        return this.A04.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.left;
    }

    public int getContentPaddingRight() {
        return this.A04.right;
    }

    public int getContentPaddingTop() {
        return this.A04.top;
    }

    public float getMaxCardElevation() {
        return A0A.A7D(this.A06);
    }

    public boolean getPreventCornerOverlap() {
        return this.A03;
    }

    public float getRadius() {
        return A0A.A7d(this.A06);
    }

    public boolean getUseCompatPadding() {
        return this.A02;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        C2S c2s = A0A;
        if (!(c2s instanceof ZL)) {
            int mode = View.MeasureSpec.getMode(i10);
            switch (mode) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    double dCeil = Math.ceil(c2s.A7J(this.A06));
                    if (A07[1].charAt(21) != 'T') {
                        throw new RuntimeException();
                    }
                    A07[1] = "CoEZjfZf0TpQ2BZBlHTi5T6DWNYutRLI";
                    int minHeight = View.MeasureSpec.getSize(i10);
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) dCeil, minHeight), mode);
                    break;
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            switch (mode2) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    int iCeil = (int) Math.ceil(c2s.A7I(this.A06));
                    int minHeight2 = View.MeasureSpec.getSize(i11);
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.max(iCeil, minHeight2), mode2);
                    break;
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        A0A.AEy(this.A06, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A0A.AEy(this.A06, colorStateList);
    }

    public void setCardElevation(float f10) {
        A0A.AF4(this.A06, f10);
    }

    public void setMaxCardElevation(float f10) {
        A0A.AFA(this.A06, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.A00 = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.A01 = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.A03) {
            this.A03 = z10;
            String[] strArr = A07;
            if (strArr[5].charAt(25) == strArr[2].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "AF11DlndTIGSrqZz8tUh3XTR3YFTmMvs";
            strArr2[2] = "M7b5sm4OMM6QoyOKa0AwC0c4wRmpSBfx";
            A0A.ACM(this.A06);
        }
    }

    public void setRadius(float f10) {
        A0A.AFG(this.A06, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.A02 != z10) {
            this.A02 = z10;
            A0A.AAh(this.A06);
        }
    }
}
