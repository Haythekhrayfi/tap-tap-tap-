package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes3.dex */
public interface SliderAdLoadListener {
    void onSliderAdFailedToLoad(AdRequestError adRequestError);

    void onSliderAdLoaded(SliderAd sliderAd);
}
