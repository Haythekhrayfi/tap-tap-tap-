package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JU implements InterfaceC1133Pw {
    public int A00;
    public ValueAnimator A01;
    public EnumC1132Pv A02 = EnumC1132Pv.A05;
    public final int A03;
    public final int A04;
    public final View A05;

    public JU(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A03 = i10;
        this.A00 = i11;
        this.A04 = i12;
    }

    private ValueAnimator A00(int i10, int i11, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C1136Pz(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z10) {
        if (z10) {
            this.A02 = EnumC1132Pv.A06;
            ValueAnimator valueAnimatorA00 = A00(this.A00, this.A04, this.A05);
            this.A01 = valueAnimatorA00;
            valueAnimatorA00.addListener(new C1135Py(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        LO.A0H(this.A05);
        this.A02 = EnumC1132Pv.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        LO.A0L(this.A05);
        if (z10) {
            this.A02 = EnumC1132Pv.A04;
            ValueAnimator valueAnimatorA00 = A00(this.A04, this.A00, this.A05);
            this.A01 = valueAnimatorA00;
            valueAnimatorA00.addListener(new C1134Px(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC1132Pv.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1133Pw
    public final void A3T(boolean z10, boolean z11) {
        if (z11) {
            A07(z10);
        } else {
            A08(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1133Pw
    public final EnumC1132Pv A7t() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1133Pw
    public final void cancel() {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
