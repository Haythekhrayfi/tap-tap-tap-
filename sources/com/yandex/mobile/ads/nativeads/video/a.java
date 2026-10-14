package com.yandex.mobile.ads.nativeads.video;

import com.yandex.mobile.ads.impl.zj0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends NativeAdVideoController {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zj0 f27980b;

    public a(zj0 zj0Var) {
        super(zj0Var);
        this.f27980b = zj0Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public void pauseAd() {
        zj0 zj0Var = this.f27980b;
        if (zj0Var != null) {
            zj0Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public void resumeAd() {
        zj0 zj0Var = this.f27980b;
        if (zj0Var != null) {
            zj0Var.a();
        }
    }
}
