package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class v70 implements ux {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yo<NativeAdView> f25879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dx0 f25880b = new dx0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rj f25881c = new rj();

    public v70(dj djVar) {
        this.f25879a = djVar;
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final z70 a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, uk ukVar, NativeAdEventListener nativeAdEventListener) {
        NativeAdAssets adAssets = uVar.getAdAssets();
        dx0 dx0Var = this.f25880b;
        int i10 = R.dimen.yandex_ads_internal_landscape_horizontal_icon_size;
        Objects.requireNonNull(dx0Var);
        int iRound = Math.round(context.getResources().getDimension(i10));
        rj rjVar = this.f25881c;
        yo<NativeAdView> yoVar = this.f25879a;
        Objects.requireNonNull(rjVar);
        return new z70(R.layout.yandex_ads_internal_native_interstitial_landscape_horizontal_media, NativeAdView.class, new vj(new xj(adAssets, iRound), rj.a(uVar, ukVar, nativeAdEventListener, yoVar), new xa0(adAssets), new pq0(adAssets), new pi1(), new ah(uVar)), new cp0(2));
    }
}
