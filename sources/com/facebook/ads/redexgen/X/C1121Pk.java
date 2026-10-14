package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1121Pk extends AnimatorListenerAdapter {
    public final /* synthetic */ C06626j A00;

    public C1121Pk(C06626j c06626j) {
        this.A00 = c06626j;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new C0976Jt(this), 2000L);
    }
}
