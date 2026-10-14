package com.yandex.mobile.ads.instream.player.content;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoPlayer {
    long getVideoDuration();

    long getVideoPosition();

    float getVolume();

    void pauseVideo();

    void prepareVideo();

    void resumeVideo();

    void setVideoPlayerListener(VideoPlayerListener videoPlayerListener);
}
