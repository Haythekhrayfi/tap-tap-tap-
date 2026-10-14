package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class d40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InstreamAdPlayer f19752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e40 f19753b = new e40();

    public d40(InstreamAdPlayer instreamAdPlayer) {
        this.f19752a = instreamAdPlayer;
    }

    public final long a(VideoAd videoAd) {
        return this.f19752a.getAdDuration(videoAd);
    }

    public final void a() {
        this.f19752a.setInstreamAdPlayerListener(this.f19753b);
    }

    public final void a(VideoAd videoAd, float f10) {
        this.f19752a.setVolume(videoAd, f10);
    }

    public final void a(VideoAd videoAd, InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f19753b.a(videoAd, instreamAdPlayerListener);
    }

    public final long b(VideoAd videoAd) {
        return this.f19752a.getAdPosition(videoAd);
    }

    public final void b() {
        this.f19752a.setInstreamAdPlayerListener(null);
        this.f19753b.a();
    }

    public final void b(VideoAd videoAd, InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f19753b.b(videoAd, instreamAdPlayerListener);
    }

    public final float c(VideoAd videoAd) {
        return this.f19752a.getVolume(videoAd);
    }

    public final boolean d(VideoAd videoAd) {
        return this.f19752a.isPlayingAd(videoAd);
    }

    public final void e(VideoAd videoAd) {
        this.f19752a.pauseAd(videoAd);
    }

    public final void f(VideoAd videoAd) {
        this.f19752a.playAd(videoAd);
    }

    public final void g(VideoAd videoAd) {
        this.f19752a.prepareAd(videoAd);
    }

    public final void h(VideoAd videoAd) {
        this.f19752a.releaseAd(videoAd);
    }

    public final void i(VideoAd videoAd) {
        this.f19752a.resumeAd(videoAd);
    }

    public final void j(VideoAd videoAd) {
        this.f19752a.skipAd(videoAd);
    }

    public final void k(VideoAd videoAd) {
        this.f19752a.stopAd(videoAd);
    }
}
