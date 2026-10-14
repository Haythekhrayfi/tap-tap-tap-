package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JQ implements InterfaceC1133Pw {
    public static String[] A06 = {"Zp1jBMTXyTngXAjRlLP1q6RZbaUI", "nHljDkT3i8Wirocu51jroGsoJHOhv1cR", "sP6X6aS", "KZL6M4", "KoOjzqZIxieUbLbPf8D", "B1jmqrSafv9jI6Lw73IRSYcL6IlnF6YH", "FLN3m70EKIfdw8", "ppmNyXlbfQKy53gkSU0tUatt7Y3PBdXb"};
    public ValueAnimator A00;
    public EnumC1132Pv A01 = EnumC1132Pv.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public JQ(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A02 = i10;
        this.A04 = i11;
        this.A03 = i12;
    }

    private ValueAnimator A00(View view, int i10, int i11) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setDuration(this.A02);
        valueAnimatorOfInt.addUpdateListener(new Q5(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            if (A06[1].charAt(28) != 'v') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "75AaLozsvbqC7RPKNa9MBDOQqsQ1eQ5U";
            strArr[5] = "oWQ9IgFva7oIaP1s8z2NxAvwjcynmKEe";
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        if (z10) {
            this.A01 = EnumC1132Pv.A06;
            ValueAnimator valueAnimatorA00 = A00(this.A05, this.A03, this.A04);
            this.A00 = valueAnimatorA00;
            valueAnimatorA00.addListener(new Q4(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        LO.A0H(this.A05);
        this.A01 = EnumC1132Pv.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z10) {
        LO.A0L(this.A05);
        if (z10) {
            this.A01 = EnumC1132Pv.A04;
            ValueAnimator valueAnimatorA00 = A00(this.A05, this.A04, this.A03);
            this.A00 = valueAnimatorA00;
            valueAnimatorA00.addListener(new Q3(this));
            this.A00.start();
            return;
        }
        View view = this.A05;
        if (A06[1].charAt(28) != 'v') {
            throw new RuntimeException();
        }
        A06[4] = "CRQ3If4kF9c";
        view.setTranslationY(this.A03);
        this.A01 = EnumC1132Pv.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1133Pw
    public final void A3T(boolean z10, boolean z11) {
        if (z11) {
            A08(z10);
        } else {
            A09(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1133Pw
    public final EnumC1132Pv A7t() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1133Pw
    public final void cancel() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
