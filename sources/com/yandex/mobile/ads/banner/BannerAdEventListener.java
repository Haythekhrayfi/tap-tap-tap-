package com.yandex.mobile.ads.banner;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: classes2.dex */
public interface BannerAdEventListener {
    void onAdClicked();

    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded();

    void onImpression(ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
