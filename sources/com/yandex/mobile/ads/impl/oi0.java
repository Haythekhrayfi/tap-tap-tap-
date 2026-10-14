package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class oi0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f23824a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NativeAdEventListener f23825b;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdImpressionData adImpressionData) {
        NativeAdEventListener nativeAdEventListener = this.f23825b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onImpression(adImpressionData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        NativeAdEventListener nativeAdEventListener = this.f23825b;
        if (nativeAdEventListener instanceof ClosableNativeAdEventListener) {
            ((ClosableNativeAdEventListener) nativeAdEventListener).closeNativeAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        NativeAdEventListener nativeAdEventListener = this.f23825b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked();
            nativeAdEventListener.onLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        NativeAdEventListener nativeAdEventListener = this.f23825b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onReturnedToApplication();
        }
    }

    public final void a() {
        this.f23824a.post(new ip1(this, 1));
    }

    public final void a(NativeAdEventListener nativeAdEventListener) {
        this.f23825b = nativeAdEventListener;
    }

    public final void b(AdImpressionData adImpressionData) {
        this.f23824a.post(new do1(this, adImpressionData));
    }

    @Override // com.yandex.mobile.ads.impl.b0
    public final void onLeftApplication() {
        this.f23824a.post(new ip1(this, 2));
    }

    @Override // com.yandex.mobile.ads.impl.b0
    public final void onReturnedToApplication() {
        this.f23824a.post(new ip1(this, 0));
    }
}
