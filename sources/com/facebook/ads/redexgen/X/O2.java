package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1190Sb A00;

    public O2(C1190Sb c1190Sb) {
        this.A00 = c1190Sb;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.A00.A09.getLayoutParams().height = num.intValue();
        this.A00.A09.requestLayout();
    }
}
