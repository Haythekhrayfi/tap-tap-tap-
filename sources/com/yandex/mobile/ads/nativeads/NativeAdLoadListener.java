package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes3.dex */
public interface NativeAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(NativeAd nativeAd);
}
