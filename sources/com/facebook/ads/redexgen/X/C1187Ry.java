package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1187Ry extends K4 {
    public final /* synthetic */ InterfaceC1103Os A00;
    public final /* synthetic */ C1104Ot A01;

    public C1187Ry(C1104Ot c1104Ot, InterfaceC1103Os interfaceC1103Os) {
        this.A01 = c1104Ot;
        this.A00 = interfaceC1103Os;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1188Rz(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
