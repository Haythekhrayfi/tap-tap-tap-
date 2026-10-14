package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class w70 implements ux {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yo<NativeAdView> f26198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dx0 f26199b = new dx0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rj f26200c = new rj();

    public w70(dj djVar) {
        this.f26198a = djVar;
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final z70 a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, uk ukVar, NativeAdEventListener nativeAdEventListener) {
        NativeAdAssets adAssets = uVar.getAdAssets();
        dx0 dx0Var = this.f26199b;
        int i10 = R.dimen.yandex_ads_internal_landscape_vertical_icon_size;
        Objects.requireNonNull(dx0Var);
        rj rjVar = this.f26200c;
        yo<NativeAdView> yoVar = this.f26198a;
        Objects.requireNonNull(rjVar);
        vj vjVar = new vj(new xj(adAssets, Math.round(context.getResources().getDimension(i10))), rj.a(uVar, ukVar, nativeAdEventListener, yoVar), new xa0(adAssets), new pq0(adAssets), new pi1(), new ah(uVar));
        NativeAdAssets adAssets2 = uVar.getAdAssets();
        dx0 dx0Var2 = this.f26199b;
        int i11 = R.dimen.yandex_ads_internal_landscape_vertical_media_content_min_width;
        Objects.requireNonNull(dx0Var2);
        return new z70(R.layout.yandex_ads_internal_native_interstitial_landscape_vetrical_media, NativeAdView.class, vjVar, new wj(new cp0(2), new cb0(adAssets2, Math.round(context.getResources().getDimension(i11)))));
    }
}
