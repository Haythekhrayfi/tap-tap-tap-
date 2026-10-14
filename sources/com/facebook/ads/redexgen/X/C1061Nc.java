package com.facebook.ads.redexgen.X;

import android.widget.LinearLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1061Nc extends LinearLayout {
    public static final int A06 = (int) (Kn.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C1337Xw A04;
    public final C1062Nd[] A05;

    public C1061Nc(C1337Xw c1337Xw, int i10, int i11, int i12, int i13) {
        super(c1337Xw);
        this.A00 = A06;
        this.A04 = c1337Xw;
        setOrientation(0);
        this.A03 = i10;
        this.A01 = i12;
        this.A02 = i13;
        this.A05 = new C1062Nd[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.A05[i14] = A00();
            addView(this.A05[i14]);
        }
        A01();
    }

    private C1062Nd A00() {
        C1062Nd c1062Nd = new C1062Nd(this.A04, this.A01, this.A02);
        int i10 = this.A03;
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(i10, i10);
        starRatingViewParams.gravity = 16;
        c1062Nd.setLayoutParams(starRatingViewParams);
        return c1062Nd;
    }

    private void A01() {
        int i10 = 0;
        while (true) {
            C1062Nd[] c1062NdArr = this.A05;
            int i11 = c1062NdArr.length;
            if (i10 < i11) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c1062NdArr[i10].getLayoutParams();
                int i12 = i10 == 0 ? 0 : this.A00;
                layoutParams.leftMargin = i12;
                i10++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    private void A02(float f10) {
        for (int i10 = 0; i10 < i; i10++) {
            float fillRatio = Math.min(1.0f, f10 - i10);
            if (fillRatio < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                fillRatio = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
            this.A05[i10].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i10) {
        this.A00 = i10;
        A01();
    }

    public void setRating(float f10) {
        A02(f10);
    }
}
