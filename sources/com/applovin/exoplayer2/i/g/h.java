package com.applovin.exoplayer2.i.g;

import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class h implements com.applovin.exoplayer2.i.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f7059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f7060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, g> f7061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, e> f7062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f7063e;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f7059a = dVar;
        this.f7062d = map2;
        this.f7063e = map3;
        this.f7061c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f7060b = dVar.b();
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        int iB = ai.b(this.f7060b, j10, false, false);
        if (iB < this.f7060b.length) {
            return iB;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        return this.f7060b[i10];
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        return this.f7059a.a(j10, this.f7061c, this.f7062d, this.f7063e);
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.f7060b.length;
    }
}
