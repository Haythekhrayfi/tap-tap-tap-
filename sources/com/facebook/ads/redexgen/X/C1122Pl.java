package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1122Pl extends AnimatorListenerAdapter {
    public final /* synthetic */ C0973Jq A00;

    public C1122Pl(C0973Jq c0973Jq) {
        this.A00 = c0973Jq;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.setVisibility(8);
    }
}
