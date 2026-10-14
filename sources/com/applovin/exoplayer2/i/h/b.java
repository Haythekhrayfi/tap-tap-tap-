package com.applovin.exoplayer2.i.h;

import com.applovin.exoplayer2.i.f;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7071a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.i.a> f7072b;

    private b() {
        this.f7072b = Collections.emptyList();
    }

    public b(com.applovin.exoplayer2.i.a aVar) {
        this.f7072b = Collections.singletonList(aVar);
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
        return j10 >= 0 ? this.f7072b : Collections.emptyList();
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return 1;
    }
}
