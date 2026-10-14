package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class pj0 implements NativeAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.banner.e f24071a;

    public pj0(com.yandex.mobile.ads.banner.e eVar) {
        fd.j0.i(eVar, "adViewController");
        this.f24071a = eVar;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onAdClicked() {
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public void onImpression(ImpressionData impressionData) {
        this.f24071a.a((AdImpressionData) impressionData);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onLeftApplication() {
        this.f24071a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onReturnedToApplication() {
        this.f24071a.onReturnedToApplication();
    }
}
