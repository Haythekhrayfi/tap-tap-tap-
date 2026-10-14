package com.applovin.exoplayer2.ui;

/* JADX INFO: loaded from: classes.dex */
public interface k {

    public interface a {
        void a(k kVar, long j10);

        void a(k kVar, long j10, boolean z10);

        void b(k kVar, long j10);
    }

    void a(a aVar);

    void a(long[] jArr, boolean[] zArr, int i10);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
