package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class sb0<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAdAssets f25036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bi0 f25037b = new bi0();

    public sb0(NativeAdAssets nativeAdAssets) {
        this.f25036a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        Objects.requireNonNull(this.f25037b);
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) v10.findViewById(R.id.media_container);
        if (extendedViewContainer != null && this.f25036a.getImage() == null && this.f25036a.getMedia() == null) {
            extendedViewContainer.setVisibility(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
