package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1188Rz extends LN {
    public final /* synthetic */ C1187Ry A00;

    public C1188Rz(C1187Ry c1187Ry) {
        this.A00 = c1187Ry;
    }

    @Override // com.facebook.ads.redexgen.X.LN, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        LO.A0H(this.A00.A01);
        this.A00.A00.ABZ();
    }
}
