package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class cc0<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bi0 f19445a = new bi0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ya0 f19446b;

    public cc0(NativeAdAssets nativeAdAssets) {
        this.f19446b = new ya0(nativeAdAssets);
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        Objects.requireNonNull(this.f19445a);
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) v10.findViewById(R.id.media_container);
        Float fA = this.f19446b.a();
        if (extendedViewContainer == null || fA == null) {
            return;
        }
        extendedViewContainer.setMeasureSpecProvider(new ak(new mt0(Math.min(Math.max(fA.floatValue(), 1.0f), 1.7777778f)), new qa0(v10, 0.5f)));
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
