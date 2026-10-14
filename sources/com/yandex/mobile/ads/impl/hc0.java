package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface hc0 extends y01 {

    public interface a extends y01.a<hc0> {
        void a(hc0 hc0Var);
    }

    long a(long j10, q01 q01Var);

    long a(et[] etVarArr, boolean[] zArr, fz0[] fz0VarArr, boolean[] zArr2, long j10);

    void a(a aVar, long j10);

    boolean continueLoading(long j10);

    void discardBuffer(long j10, boolean z10);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    i71 getTrackGroups();

    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    void reevaluateBuffer(long j10);

    long seekToUs(long j10);
}
