package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class as0 implements ux {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yo<NativeAdView> f19054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rj f19055b = new rj();

    public as0(dj djVar) {
        this.f19054a = djVar;
    }

    @Override // com.yandex.mobile.ads.impl.ux
    public final z70 a(Context context, AdResponse adResponse, com.yandex.mobile.ads.nativeads.u uVar, uk ukVar, NativeAdEventListener nativeAdEventListener) {
        NativeAdAssets adAssets = uVar.getAdAssets();
        rj rjVar = this.f19055b;
        yo<NativeAdView> yoVar = this.f19054a;
        Objects.requireNonNull(rjVar);
        return new z70(R.layout.yandex_ads_internal_native_interstitial_portrait, NativeAdView.class, new vj(rj.a(uVar, ukVar, nativeAdEventListener, yoVar), new cc0(adAssets), new pi1(), new ah(uVar), new yg(context)), new cp0(1));
    }
}
