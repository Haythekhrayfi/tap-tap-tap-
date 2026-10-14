package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class id1 implements VideoAdPlaybackListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoAdPlaybackListener f21701a;

    public final void a(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f21701a = videoAdPlaybackListener;
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdClicked(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdClicked(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdCompleted(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdError(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdError(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdPaused(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdPrepared(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdPrepared(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdResumed(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdSkipped(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdStarted(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdStopped(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onImpression(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onImpression(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onVolumeChanged(VideoAd videoAd, float f10) {
        fd.j0.i(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f21701a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onVolumeChanged(videoAd, f10);
        }
    }
}
