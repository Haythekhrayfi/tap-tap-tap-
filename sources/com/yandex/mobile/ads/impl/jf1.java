package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* JADX INFO: loaded from: classes3.dex */
public final class jf1 implements VideoPlayerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoPlayerListener f22034a;

    public final void a(VideoPlayerListener videoPlayerListener) {
        this.f22034a = videoPlayerListener;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        VideoPlayerListener videoPlayerListener = this.f22034a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        VideoPlayerListener videoPlayerListener = this.f22034a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        VideoPlayerListener videoPlayerListener = this.f22034a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        VideoPlayerListener videoPlayerListener = this.f22034a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoPrepared();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        VideoPlayerListener videoPlayerListener = this.f22034a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoResumed();
        }
    }
}
