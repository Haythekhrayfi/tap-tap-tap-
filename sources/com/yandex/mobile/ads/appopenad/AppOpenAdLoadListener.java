package com.yandex.mobile.ads.appopenad;

import com.yandex.mobile.ads.common.AdRequestError;

/* JADX INFO: loaded from: classes2.dex */
public interface AppOpenAdLoadListener {
    void onAdFailedToLoad(AdRequestError adRequestError);

    void onAdLoaded(AppOpenAd appOpenAd);
}
