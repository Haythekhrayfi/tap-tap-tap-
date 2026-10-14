package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class px implements yo<NativeAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yo<NativeAdView> f24270a;

    public px(com.yandex.mobile.ads.nativeads.u uVar, uk ukVar, NativeAdEventListener nativeAdEventListener, yh yhVar) {
        this.f24270a = uVar instanceof n21 ? new m21((n21) uVar, ukVar, nativeAdEventListener, yhVar) : new ki0(uVar, ukVar, nativeAdEventListener, yhVar);
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(ViewGroup viewGroup) {
        NativeAdView nativeAdView = (NativeAdView) viewGroup;
        yo<NativeAdView> yoVar = this.f24270a;
        if (yoVar != null) {
            yoVar.a(nativeAdView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
        yo<NativeAdView> yoVar = this.f24270a;
        if (yoVar != null) {
            yoVar.c();
        }
    }
}
