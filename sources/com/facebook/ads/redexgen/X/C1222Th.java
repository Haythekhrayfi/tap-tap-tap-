package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1222Th extends LN {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScaleAnimation A01;

    public C1222Th(View view, ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.facebook.ads.redexgen.X.LN, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}
