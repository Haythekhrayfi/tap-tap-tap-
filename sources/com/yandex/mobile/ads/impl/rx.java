package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class rx implements yo<NativeAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAd f24878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk f24879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NativeAdEventListener f24880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.nativeads.y f24881d = new com.yandex.mobile.ads.nativeads.y();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final uh0 f24882e = new uh0();

    public rx(NativeAd nativeAd, uk ukVar, NativeAdEventListener nativeAdEventListener) {
        this.f24878a = nativeAd;
        this.f24879b = ukVar;
        this.f24880c = nativeAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(ViewGroup viewGroup) {
        try {
            this.f24878a.bindNativeAd(this.f24881d.a((NativeAdView) viewGroup, this.f24882e));
            this.f24878a.setNativeAdEventListener(this.f24880c);
        } catch (NativeAdException unused) {
            this.f24879b.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
        this.f24878a.setNativeAdEventListener(null);
    }
}
