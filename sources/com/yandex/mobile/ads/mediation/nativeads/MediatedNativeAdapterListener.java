package com.yandex.mobile.ads.mediation.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes3.dex */
interface MediatedNativeAdapterListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdImpression();

    void onAdLeftApplication();

    void onAdOpened();

    void onAppInstallAdLoaded(MediatedNativeAd mediatedNativeAd);

    void onContentAdLoaded(MediatedNativeAd mediatedNativeAd);
}
