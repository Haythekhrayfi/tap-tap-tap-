package com.applovin.exoplayer2.i.a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d implements com.applovin.exoplayer2.i.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.i.a> f6861a;

    public d(List<com.applovin.exoplayer2.i.a> list) {
        this.f6861a = list;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 == 0);
        return 0L;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        return j10 >= 0 ? this.f6861a : Collections.emptyList();
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return 1;
    }
}
