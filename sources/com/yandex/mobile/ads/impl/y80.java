package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class y80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final es0 f26732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ue1 f26733b;

    public y80(es0 es0Var, ue1 ue1Var) {
        this.f26732a = es0Var;
        this.f26733b = ue1Var;
    }

    public final int a(AdPlaybackState adPlaybackState) {
        ir0 ir0VarB = this.f26732a.b();
        if (ir0VarB == null) {
            return -1;
        }
        long jMsToUs = Util.msToUs(this.f26733b.a());
        long jMsToUs2 = Util.msToUs(ir0VarB.a());
        int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(jMsToUs2, jMsToUs);
        return adGroupIndexForPositionUs == -1 ? adPlaybackState.getAdGroupIndexAfterPositionUs(jMsToUs2, jMsToUs) : adGroupIndexForPositionUs;
    }
}
