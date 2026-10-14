package com.facebook.ads.redexgen.X;

import android.R;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TU extends K4 {
    public final /* synthetic */ AnimationAnimationListenerC1027Lu A00;

    public TU(AnimationAnimationListenerC1027Lu animationAnimationListenerC1027Lu) {
        this.A00 = animationAnimationListenerC1027Lu;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        this.A00.A00.finish(3);
        this.A00.A00.A0J().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
