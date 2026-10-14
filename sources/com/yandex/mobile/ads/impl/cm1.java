package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* JADX INFO: loaded from: classes3.dex */
public final class cm1 implements VideoPlayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final et0 f19554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nr0 f19555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jf1 f19556c;

    public cm1(xs0 xs0Var, nr0 nr0Var, jf1 jf1Var) {
        this.f19554a = xs0Var;
        this.f19555b = nr0Var;
        this.f19556c = jf1Var;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final long getVideoDuration() {
        return this.f19554a.a().a();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final long getVideoPosition() {
        return this.f19554a.a().b();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final float getVolume() {
        Float fA = this.f19555b.a();
        return fA != null ? fA.floatValue() : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void pauseVideo() {
        this.f19556c.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void prepareVideo() {
        this.f19556c.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void resumeVideo() {
        this.f19556c.onVideoResumed();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void setVideoPlayerListener(VideoPlayerListener videoPlayerListener) {
        this.f19556c.a(videoPlayerListener);
    }
}
