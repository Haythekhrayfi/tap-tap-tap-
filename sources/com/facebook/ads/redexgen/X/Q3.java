package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Q3 implements Animator.AnimatorListener {
    public final /* synthetic */ JQ A00;

    public Q3(JQ jq) {
        this.A00 = jq;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A08(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00 = null;
        this.A00.A01 = EnumC1132Pv.A03;
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
