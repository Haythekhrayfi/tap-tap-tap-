package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;

/* JADX INFO: loaded from: classes3.dex */
public final class k50 implements Inroll, Pauseroll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w90 f22255a;

    public k50(w90 w90Var) {
        this.f22255a = w90Var;
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final InstreamAdBreak getInstreamAdBreak() {
        return this.f22255a.getInstreamAdBreak();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void invalidate() {
        this.f22255a.invalidate();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void pause() {
        this.f22255a.pause();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void play(InstreamAdView instreamAdView) {
        this.f22255a.play(instreamAdView);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void prepare(InstreamAdPlayer instreamAdPlayer) {
        this.f22255a.prepare(instreamAdPlayer);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void resume() {
        this.f22255a.resume();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setListener(InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f22255a.setListener(instreamAdBreakEventListener);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setVideoAdPlaybackListener(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f22255a.setVideoAdPlaybackListener(videoAdPlaybackListener);
    }
}
