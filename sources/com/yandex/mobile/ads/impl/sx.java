package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class sx implements mx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uk f25205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d80<NativeAdView> f25206b;

    public sx(d80<NativeAdView> d80Var, uk ukVar) {
        this.f25205a = ukVar;
        this.f25206b = d80Var;
    }

    @Override // com.yandex.mobile.ads.impl.mx
    public final void c() {
        if (this.f25206b.a()) {
            return;
        }
        this.f25205a.e();
    }

    @Override // com.yandex.mobile.ads.impl.mx
    public final void invalidate() {
        this.f25206b.b();
    }
}
