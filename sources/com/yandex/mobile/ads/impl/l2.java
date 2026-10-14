package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p40 f22602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dc1 f22603b;

    public l2(p40 p40Var, ec1 ec1Var) {
        this.f22602a = p40Var;
        this.f22603b = ec1Var;
    }

    public final void a() {
        this.f22602a.a((fc1) null);
    }

    public final void a(VideoAd videoAd) {
        this.f22603b.onAdCompleted(videoAd);
    }

    public final void a(VideoAd videoAd, float f10) {
        this.f22603b.onVolumeChanged(videoAd, f10);
    }

    public final void b(VideoAd videoAd) {
        this.f22603b.onAdError(videoAd);
    }

    public final void c(VideoAd videoAd) {
        this.f22603b.onAdPaused(videoAd);
    }

    public final void d(VideoAd videoAd) {
        this.f22603b.a(new v30(this.f22602a, videoAd));
    }

    public final void e(VideoAd videoAd) {
        this.f22603b.onAdResumed(videoAd);
    }

    public final void f(VideoAd videoAd) {
        this.f22603b.onAdSkipped(videoAd);
    }

    public final void g(VideoAd videoAd) {
        this.f22603b.onAdStarted(videoAd);
    }

    public final void h(VideoAd videoAd) {
        this.f22603b.onAdStopped(videoAd);
    }

    public final void i(VideoAd videoAd) {
        this.f22603b.a(videoAd);
    }
}
