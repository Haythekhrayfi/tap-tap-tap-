package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;

/* JADX INFO: loaded from: classes3.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d4 f26675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z1 f26676b;

    public y2(ue1 ue1Var, d4 d4Var) {
        this.f26675a = d4Var;
        this.f26676b = new z1(ue1Var);
    }

    public final int a(InstreamAdBreakPosition instreamAdBreakPosition) {
        long jA = this.f26676b.a(instreamAdBreakPosition);
        AdPlaybackState adPlaybackStateA = this.f26675a.a();
        if (jA == Long.MIN_VALUE) {
            int i10 = adPlaybackStateA.adGroupCount;
            if (i10 <= 0 || adPlaybackStateA.getAdGroup(i10 - 1).timeUs != Long.MIN_VALUE) {
                return -1;
            }
            return adPlaybackStateA.adGroupCount - 1;
        }
        long jMsToUs = Util.msToUs(jA);
        for (int i11 = 0; i11 < adPlaybackStateA.adGroupCount; i11++) {
            long j10 = adPlaybackStateA.getAdGroup(i11).timeUs;
            if (j10 != Long.MIN_VALUE && Math.abs(j10 - jMsToUs) <= 1000) {
                return i11;
            }
        }
        return -1;
    }
}
