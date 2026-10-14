package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: classes3.dex */
public final class ir0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Player f21801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lr0 f21802b;

    public ir0(Player player, lr0 lr0Var) {
        this.f21801a = player;
        this.f21802b = lr0Var;
    }

    public final long a() {
        Timeline timelineB = this.f21802b.b();
        return this.f21801a.getContentPosition() - (timelineB.isEmpty() ? 0L : timelineB.getPeriod(0, this.f21802b.a()).getPositionInWindowMs());
    }
}
