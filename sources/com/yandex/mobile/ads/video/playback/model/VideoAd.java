package com.yandex.mobile.ads.video.playback.model;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoAd {
    AdPodInfo getAdPodInfo();

    long getDuration();

    String getInfo();

    MediaFile getMediaFile();

    SkipInfo getSkipInfo();
}
