package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4 f26188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lr0 f26189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h7 f26190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ue1 f26191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rq0 f26192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m91 f26193f = new m91();

    public w61(d4 d4Var, kr0 kr0Var, h7 h7Var, rq0 rq0Var) {
        this.f26188a = d4Var;
        this.f26190c = h7Var;
        this.f26189b = kr0Var.d();
        this.f26191d = kr0Var.a();
        this.f26192e = rq0Var;
    }

    public final void a(Timeline timeline) {
        if (timeline.isEmpty()) {
            return;
        }
        if (timeline.getPeriodCount() != 1) {
            x60.c("Timeline contains more than one period", new Object[0]);
        }
        this.f26189b.a(timeline);
        long j10 = timeline.getPeriod(0, this.f26189b.a()).durationUs;
        this.f26191d.a(Util.usToMs(j10));
        if (j10 != -9223372036854775807L) {
            AdPlaybackState adPlaybackStateA = this.f26188a.a();
            Objects.requireNonNull(this.f26193f);
            this.f26188a.a(m91.a(adPlaybackStateA, j10));
        }
        if (!this.f26190c.b()) {
            this.f26190c.a();
        }
        this.f26192e.a();
    }
}
