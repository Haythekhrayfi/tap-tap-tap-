package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xa0<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bi0 f26482a = new bi0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ya0 f26483b;

    public xa0(NativeAdAssets nativeAdAssets) {
        this.f26483b = new ya0(nativeAdAssets);
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        Objects.requireNonNull(this.f26482a);
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) v10.findViewById(R.id.media_container);
        Float fA = this.f26483b.a();
        if (extendedViewContainer == null || fA == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new mt0(fA.floatValue()));
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
