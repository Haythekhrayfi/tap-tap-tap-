package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1135Py implements Animator.AnimatorListener {
    public final /* synthetic */ JU A00;

    public C1135Py(JU ju) {
        this.A00 = ju;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A08(false);
        if (this.A00.A01 != null) {
            this.A00.A01.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A02 = EnumC1132Pv.A05;
        LO.A0H(this.A00.A05);
        if (this.A00.A01 != null) {
            this.A00.A01.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
