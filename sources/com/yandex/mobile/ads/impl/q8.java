package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class q8<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAdAssets f24342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final li0 f24343b = new li0();

    public q8(NativeAdAssets nativeAdAssets) {
        this.f24342a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        Objects.requireNonNull(this.f24343b);
        View viewFindViewById = v10.findViewById(R.id.age_divider);
        if (viewFindViewById == null || this.f24342a.getAge() != null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
