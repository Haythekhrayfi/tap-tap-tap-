package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0831Dy extends YP {
    public PO A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(NativeAdLayout nativeAdLayout, C1337Xw c1337Xw, NativeAd nativeAd, J3 j10) {
        C1059Na c1059Na = new C1059Na(c1337Xw);
        MediaView mediaView = new MediaView(c1337Xw);
        AdOptionsView adOptionsView = new AdOptionsView(c1337Xw, nativeAd, nativeAdLayout);
        j10.A09(adOptionsView, 28);
        this.A00 = new RT(c1337Xw, nativeAd, j10, U7.A0L(nativeAd.getInternalNativeAd()).A17(), c1059Na, mediaView, adOptionsView);
        LO.A0M(nativeAdLayout, j10.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1059Na, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5M, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
