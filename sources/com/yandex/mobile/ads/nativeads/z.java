package com.yandex.mobile.ads.nativeads;

import android.view.View;
import com.yandex.mobile.ads.impl.kj0;

/* JADX INFO: loaded from: classes3.dex */
final class z implements kj0<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAdViewBinder f27996a;

    public z(NativeAdViewBinder nativeAdViewBinder) {
        this.f27996a = nativeAdViewBinder;
    }

    @Override // com.yandex.mobile.ads.impl.kj0
    public final b0 a(View view) {
        return new b0.a(view, this.f27996a.getAssetViews()).a();
    }
}
