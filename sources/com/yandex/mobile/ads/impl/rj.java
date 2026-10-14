package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class rj {
    public static vj a(NativeAd nativeAd, uk ukVar, NativeAdEventListener nativeAdEventListener, yo yoVar) {
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        return new vj(new rx(nativeAd, ukVar, nativeAdEventListener), new q8(adAssets), new sb0(adAssets), new ju0(adAssets), yoVar);
    }
}
