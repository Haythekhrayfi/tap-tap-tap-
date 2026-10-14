package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1134Px implements Animator.AnimatorListener {
    public final /* synthetic */ JU A00;

    public C1134Px(JU ju) {
        this.A00 = ju;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = EnumC1132Pv.A03;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
