package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* JADX INFO: loaded from: classes3.dex */
public final class se1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4 f25065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final re1 f25066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jf1 f25067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25068d;

    public se1(d4 d4Var, ue1 ue1Var, es0 es0Var, jf1 jf1Var) {
        this.f25065a = d4Var;
        this.f25067c = jf1Var;
        this.f25066b = new re1(es0Var, ue1Var);
    }

    public final void a() {
        if (this.f25068d) {
            return;
        }
        this.f25068d = true;
        AdPlaybackState adPlaybackStateA = this.f25065a.a();
        for (int i10 = 0; i10 < adPlaybackStateA.adGroupCount; i10++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackStateA.getAdGroup(i10);
            if (adGroup.timeUs != Long.MIN_VALUE) {
                if (adGroup.count < 0) {
                    adPlaybackStateA = adPlaybackStateA.withAdCount(i10, 1);
                }
                adPlaybackStateA = adPlaybackStateA.withSkippedAdGroup(i10);
                this.f25065a.a(adPlaybackStateA);
            }
        }
        this.f25067c.onVideoCompleted();
    }

    public final boolean b() {
        return this.f25068d;
    }

    public final void c() {
        if (this.f25066b.a()) {
            a();
        }
    }
}
