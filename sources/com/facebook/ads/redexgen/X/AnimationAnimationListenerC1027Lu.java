package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnimationAnimationListenerC1027Lu implements Animation.AnimationListener {
    public final /* synthetic */ C5H A00;
    public final /* synthetic */ TR A01;
    public final /* synthetic */ TR A02;

    public AnimationAnimationListenerC1027Lu(TR tr, TR tr2, C5H c5h) {
        this.A01 = tr;
        this.A02 = tr2;
        this.A00 = c5h;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        LO.A0H(this.A02);
        new Handler().postDelayed(new TU(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
