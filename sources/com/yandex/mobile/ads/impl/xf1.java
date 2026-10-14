package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: classes3.dex */
public final class xf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lr0 f26510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final se1 f26511b;

    public xf1(lr0 lr0Var, se1 se1Var) {
        this.f26510a = lr0Var;
        this.f26511b = se1Var;
    }

    public final void a(Player player) {
        if (this.f26510a.c() || player.isPlayingAd()) {
            return;
        }
        this.f26511b.c();
        boolean zB = this.f26511b.b();
        Timeline timelineB = this.f26510a.b();
        if (!(zB || timelineB.isEmpty())) {
            timelineB.getPeriod(0, this.f26510a.a());
        }
    }
}
