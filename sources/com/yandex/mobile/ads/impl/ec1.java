package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class ec1 implements dc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dc1 f20222a;

    public final void a(dc1 dc1Var) {
        this.f20222a = dc1Var;
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void a(v30 v30Var) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.a(v30Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void a(VideoAd videoAd) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.a(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdClicked(VideoAd videoAd) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.onAdClicked(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdCompleted(VideoAd videoAd) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdError(VideoAd videoAd) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.onAdError(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdPaused(VideoAd videoAd) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdResumed(VideoAd videoAd) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdSkipped(VideoAd videoAd) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdStarted(VideoAd videoAd) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onAdStopped(VideoAd videoAd) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void onVolumeChanged(VideoAd videoAd, float f10) {
        dc1 dc1Var = this.f20222a;
        if (dc1Var != null) {
            dc1Var.onVolumeChanged(videoAd, f10);
        }
    }
}
