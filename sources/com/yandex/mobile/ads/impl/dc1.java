package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public interface dc1 {
    void a(v30 v30Var);

    void a(VideoAd videoAd);

    void onAdClicked(VideoAd videoAd);

    void onAdCompleted(VideoAd videoAd);

    void onAdError(VideoAd videoAd);

    void onAdPaused(VideoAd videoAd);

    void onAdResumed(VideoAd videoAd);

    void onAdSkipped(VideoAd videoAd);

    void onAdStarted(VideoAd videoAd);

    void onAdStopped(VideoAd videoAd);

    void onVolumeChanged(VideoAd videoAd, float f10);
}
