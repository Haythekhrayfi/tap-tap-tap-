package com.yandex.mobile.ads.appopenad;

import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;

/* JADX INFO: loaded from: classes2.dex */
public interface AppOpenAdEventListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToPresent(AdError adError);

    void onAdShown();

    void onImpression(ImpressionData impressionData);
}
