package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: classes3.dex */
public final class vs implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cf f26075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ys f26076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fr0 f26077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jr0 f26078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cr0 f26079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w61 f26080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rq0 f26081g;

    public vs(cf cfVar, ys ysVar, cr0 cr0Var, jr0 jr0Var, fr0 fr0Var, w61 w61Var, rq0 rq0Var) {
        this.f26075a = cfVar;
        this.f26076b = ysVar;
        this.f26079e = cr0Var;
        this.f26077c = fr0Var;
        this.f26078d = jr0Var;
        this.f26080f = w61Var;
        this.f26081g = rq0Var;
    }

    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        Player playerA = this.f26076b.a();
        if (!this.f26075a.b() || playerA == null) {
            return;
        }
        this.f26078d.a(z10, playerA.getPlaybackState());
    }

    public final void onPlaybackStateChanged(int i10) {
        Player playerA = this.f26076b.a();
        if (!this.f26075a.b() || playerA == null) {
            return;
        }
        this.f26079e.b(playerA, i10);
    }

    public final void onPlayerError(PlaybackException playbackException) {
        this.f26077c.a(playbackException);
    }

    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
        this.f26081g.a();
    }

    public final void onRenderedFirstFrame() {
        Player playerA = this.f26076b.a();
        if (playerA != null) {
            onPlaybackStateChanged(playerA.getPlaybackState());
        }
    }

    public final void onTimelineChanged(Timeline timeline, int i10) {
        this.f26080f.a(timeline);
    }
}
