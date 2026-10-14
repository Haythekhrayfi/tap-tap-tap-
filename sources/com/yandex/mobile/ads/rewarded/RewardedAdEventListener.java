package com.yandex.mobile.ads.rewarded;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.qx;

/* JADX INFO: loaded from: classes3.dex */
public interface RewardedAdEventListener extends qx {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToLoad(AdRequestError adRequestError);

    @Override // com.yandex.mobile.ads.impl.qx
    void onAdLoaded();

    void onAdShown();

    void onImpression(ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();

    void onRewarded(Reward reward);
}
