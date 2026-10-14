package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class E8 extends YP {
    public PO A00;

    public final void A04(C1337Xw c1337Xw, NativeBannerAd nativeBannerAd, J3 j10, NativeAdLayout nativeAdLayout) {
        MediaView mediaView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        j10.A09(adOptionsView, 20);
        this.A00 = new RU(c1337Xw, nativeBannerAd, j10, U7.A0L(nativeBannerAd.getInternalNativeAd()).A17(), mediaView, adOptionsView);
        LO.A0M(nativeAdLayout, j10.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, mediaView, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams contentParams = new FrameLayout.LayoutParams(-1, -1);
        contentParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), contentParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5M, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
