package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class dk implements dc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dc1[] f19888a;

    public dk(dc1... dc1VarArr) {
        this.f19888a = dc1VarArr;
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void a(v30 v30Var) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.a(v30Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void a(VideoAd videoAd) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.a(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdClicked(VideoAd videoAd) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.onAdClicked(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdCompleted(VideoAd videoAd) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdError(VideoAd videoAd) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.onAdError(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdPaused(VideoAd videoAd) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdResumed(VideoAd videoAd) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdSkipped(VideoAd videoAd) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdStarted(VideoAd videoAd) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdStopped(VideoAd videoAd) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onVolumeChanged(VideoAd videoAd, float f10) {
        for (dc1 dc1Var : this.f19888a) {
            dc1Var.onVolumeChanged(videoAd, f10);
        }
    }
}
