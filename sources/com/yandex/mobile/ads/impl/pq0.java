package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class pq0<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAdAssets f24226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rh0 f24227b = new rh0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uh0 f24228c = new uh0();

    public pq0(NativeAdAssets nativeAdAssets) {
        this.f24226a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        Objects.requireNonNull(this.f24227b);
        ImageView imageView = (ImageView) v10.findViewById(R.id.icon_placeholder);
        NativeAdImage icon = this.f24226a.getIcon();
        NativeAdImage favicon = this.f24226a.getFavicon();
        if (imageView != null && icon == null && favicon == null) {
            Objects.requireNonNull(this.f24228c);
            tg1 tg1Var = new tg1((TextView) v10.findViewById(R.id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(tg1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
