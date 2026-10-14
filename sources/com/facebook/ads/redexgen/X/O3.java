package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class O3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C1190Sb A00;
    public final /* synthetic */ boolean A01;

    public O3(C1190Sb c1190Sb, boolean z10) {
        this.A00 = c1190Sb;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0L.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.A00.A0Q();
        if (!this.A01 && this.A00.A0I != null) {
            this.A00.A0I.destroy();
        }
        if (this.A00.A0f == null) {
            return;
        }
        this.A00.A0f.setVisibility(this.A01 ? 8 : 0);
    }
}
