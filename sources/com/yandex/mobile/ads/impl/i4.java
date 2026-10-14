package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class i4 implements InstreamAdPlayerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f6 f21587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InstreamAdPlayerListener f21588b;

    public i4(f6 f6Var) {
        this.f21587a = f6Var;
    }

    public final void a(InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f21588b = instreamAdPlayerListener;
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingFinished(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdBufferingFinished(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingStarted(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdBufferingStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdCompleted(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPaused(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPrepared(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdPrepared(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdResumed(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdSkipped(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStarted(VideoAd videoAd) {
        this.f21587a.a();
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStopped(VideoAd videoAd) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onError(VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onError(videoAd, instreamAdPlayerError);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onVolumeChanged(VideoAd videoAd, float f10) {
        InstreamAdPlayerListener instreamAdPlayerListener = this.f21588b;
        if (instreamAdPlayerListener != null) {
            instreamAdPlayerListener.onVolumeChanged(videoAd, f10);
        }
    }
}
