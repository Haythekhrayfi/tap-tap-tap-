package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EK extends ZB {
    @Override // com.facebook.ads.redexgen.X.C3E
    public final int A03(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final int A05(View view) {
        return view.getMinimumHeight();
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final int A06(View view) {
        return view.getMinimumWidth();
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A0A(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public void A0C(View view, int i10) {
        if (i10 == 4) {
            i10 = 2;
        }
        view.setImportantForAccessibility(i10);
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A0D(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A0G(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final void A0H(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    @Override // com.facebook.ads.redexgen.X.C3E
    public final boolean A0I(View view) {
        return view.hasTransientState();
    }
}
