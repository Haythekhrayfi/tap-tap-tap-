package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class au {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final es0 f19062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ue1 f19063b;

    public au(es0 es0Var, ue1 ue1Var) {
        this.f19062a = es0Var;
        this.f19063b = ue1Var;
    }

    public final void a() {
        this.f19062a.a((bu) null);
    }

    public final void a(AdPlaybackState adPlaybackState, int i10) {
        long jUsToMs = Util.usToMs(adPlaybackState.getAdGroup(i10).timeUs);
        if (jUsToMs == Long.MIN_VALUE) {
            jUsToMs = this.f19063b.a();
        }
        this.f19062a.a(new bu(jUsToMs));
    }
}
