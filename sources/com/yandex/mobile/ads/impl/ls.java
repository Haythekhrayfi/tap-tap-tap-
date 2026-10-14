package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* JADX INFO: loaded from: classes3.dex */
public final class ls implements InstreamAdPlayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f22768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i4 f22769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k4 f22770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j4 f22771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lr0 f22772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nr0 f22773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final et0 f22774g;

    public ls(h6 h6Var, kr0 kr0Var, xs0 xs0Var, k4 k4Var, j4 j4Var, i4 i4Var) {
        this.f22768a = h6Var;
        this.f22772e = kr0Var.d();
        this.f22773f = kr0Var.e();
        this.f22774g = xs0Var;
        this.f22770c = k4Var;
        this.f22771d = j4Var;
        this.f22769b = i4Var;
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final long getAdDuration(VideoAd videoAd) {
        return this.f22774g.a().a();
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final long getAdPosition(VideoAd videoAd) {
        return this.f22774g.a().b();
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final float getVolume(VideoAd videoAd) {
        Float fA = this.f22773f.a();
        return fA != null ? fA.floatValue() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final boolean isPlayingAd(VideoAd videoAd) {
        return this.f22768a.a(videoAd) != n40.f23216a && this.f22772e.c();
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void pauseAd(VideoAd videoAd) {
        try {
            this.f22771d.c(videoAd);
        } catch (RuntimeException e10) {
            x60.c("Exception during play ad: %s", e10);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void playAd(VideoAd videoAd) {
        try {
            this.f22771d.d(videoAd);
        } catch (RuntimeException e10) {
            x60.c("Exception during play ad: %s", e10);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void prepareAd(VideoAd videoAd) {
        try {
            this.f22770c.a(videoAd);
        } catch (RuntimeException e10) {
            x60.c("Exception during ad prepare: %s", e10);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void releaseAd(VideoAd videoAd) {
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void resumeAd(VideoAd videoAd) {
        try {
            this.f22771d.e(videoAd);
        } catch (RuntimeException e10) {
            x60.c("Exception during play ad: %s", e10);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void setInstreamAdPlayerListener(InstreamAdPlayerListener instreamAdPlayerListener) {
        this.f22769b.a(instreamAdPlayerListener);
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void setVolume(VideoAd videoAd, float f10) {
        this.f22773f.a(f10);
        this.f22769b.onVolumeChanged(videoAd, f10);
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void skipAd(VideoAd videoAd) {
        try {
            this.f22771d.f(videoAd);
        } catch (RuntimeException e10) {
            x60.c("Exception during play ad: %s", e10);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
    public final void stopAd(VideoAd videoAd) {
        try {
            this.f22771d.g(videoAd);
        } catch (RuntimeException e10) {
            x60.c("Exception during play ad: %s", e10);
        }
    }
}
