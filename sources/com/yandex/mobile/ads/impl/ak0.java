package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class ak0 implements NativeAdEventListener, ClosableNativeAdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f18946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kx f18947b;

    public ak0(a1 a1Var, kx kxVar) {
        this.f18946a = a1Var;
        this.f18947b = kxVar;
    }

    @Override // com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener
    public final void closeNativeAd() {
        if (this.f18947b.a()) {
            ((a1) this.f18946a).a();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onAdClicked() {
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public void onImpression(ImpressionData impressionData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", impressionData instanceof AdImpressionData ? (AdImpressionData) impressionData : null);
        ((a1) this.f18946a).a(16, bundle);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onLeftApplication() {
        ((a1) this.f18946a).a(17, null);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onReturnedToApplication() {
        ((a1) this.f18946a).a(18, null);
    }
}
