package com.yandex.mobile.ads.nativeads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface SliderAd {
    void bindSliderAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    List<NativeAd> getNativeAds();
}
