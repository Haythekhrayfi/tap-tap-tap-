package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;

/* JADX INFO: loaded from: classes3.dex */
public final class w90 implements Inroll, Pauseroll, j91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w50 f26223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z90 f26224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final da0 f26225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final id1 f26226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f40 f26227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y90 f26228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InstreamAdPlayer f26229g;

    public w90(Context context, w50 w50Var, x1 x1Var) {
        this.f26223a = w50Var;
        da0 da0Var = new da0();
        this.f26225c = da0Var;
        this.f26224b = new z90(context, w50Var, x1Var, da0Var);
        this.f26226d = new id1();
        this.f26227e = new f40(this);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final InstreamAdBreak getInstreamAdBreak() {
        return this.f26223a;
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void invalidate() {
        y90 y90Var = this.f26228f;
        if (y90Var != null) {
            y90Var.a();
        }
        InstreamAdPlayer instreamAdPlayer = this.f26229g;
        if (instreamAdPlayer != null) {
            this.f26227e.b(instreamAdPlayer);
        }
        this.f26228f = null;
        this.f26229g = null;
    }

    @Override // com.yandex.mobile.ads.impl.j91
    public final void invalidateAdPlayer() {
        y90 y90Var = this.f26228f;
        if (y90Var != null) {
            y90Var.a();
        }
        InstreamAdPlayer instreamAdPlayer = this.f26229g;
        if (instreamAdPlayer != null) {
            this.f26227e.b(instreamAdPlayer);
        }
        this.f26228f = null;
        this.f26229g = null;
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void pause() {
        y90 y90Var = this.f26228f;
        if (y90Var != null) {
            y90Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void play(InstreamAdView instreamAdView) {
        y90 y90Var = this.f26228f;
        if (y90Var != null) {
            y90Var.a(instreamAdView);
        }
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void prepare(InstreamAdPlayer instreamAdPlayer) {
        y90 y90Var = this.f26228f;
        if (y90Var != null) {
            y90Var.a();
        }
        InstreamAdPlayer instreamAdPlayer2 = this.f26229g;
        if (instreamAdPlayer2 != null) {
            this.f26227e.b(instreamAdPlayer2);
        }
        this.f26228f = null;
        this.f26229g = instreamAdPlayer;
        this.f26227e.a(instreamAdPlayer);
        y90 y90VarA = this.f26224b.a(instreamAdPlayer);
        this.f26228f = y90VarA;
        y90VarA.a(this.f26226d);
        this.f26228f.c();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void resume() {
        y90 y90Var = this.f26228f;
        if (y90Var != null) {
            y90Var.d();
        }
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setListener(InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f26225c.a(instreamAdBreakEventListener);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setVideoAdPlaybackListener(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f26226d.a(videoAdPlaybackListener);
    }
}
