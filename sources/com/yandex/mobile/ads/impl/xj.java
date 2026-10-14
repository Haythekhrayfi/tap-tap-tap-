package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdView;

/* JADX INFO: loaded from: classes3.dex */
public final class xj implements yo<NativeAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAdAssets f26526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26527b;

    public xj(NativeAdAssets nativeAdAssets, int i10) {
        this.f26526a = nativeAdAssets;
        this.f26527b = i10;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(ViewGroup viewGroup) {
        NativeAdView nativeAdView = (NativeAdView) viewGroup;
        yj yjVar = new yj(this.f26526a, this.f26527b);
        ImageView imageViewA = yjVar.a(nativeAdView);
        ImageView imageViewB = yjVar.b(nativeAdView);
        if (imageViewA != null) {
            imageViewA.setId(R.id.favicon);
        }
        if (imageViewB != null) {
            imageViewB.setId(R.id.icon);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
