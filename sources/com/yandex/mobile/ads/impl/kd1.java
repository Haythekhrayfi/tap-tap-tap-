package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class kd1 implements dc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoAdPlaybackListener f22393a;

    public kd1(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f22393a = videoAdPlaybackListener;
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void a(v30 v30Var) {
        fd.j0.i(v30Var, "videoAdCreativePlayback");
        this.f22393a.onAdPrepared(v30Var.a());
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void a(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f22393a.onImpression(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdClicked(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f22393a.onAdClicked(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdCompleted(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f22393a.onAdCompleted(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdError(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f22393a.onAdError(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdPaused(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f22393a.onAdPaused(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdResumed(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f22393a.onAdResumed(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdSkipped(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f22393a.onAdSkipped(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdStarted(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f22393a.onAdStarted(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdStopped(VideoAd videoAd) {
        fd.j0.i(videoAd, "videoAd");
        this.f22393a.onAdStopped(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onVolumeChanged(VideoAd videoAd, float f10) {
        fd.j0.i(videoAd, "videoAd");
        this.f22393a.onVolumeChanged(videoAd, f10);
    }
}
