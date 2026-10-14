package com.applovin.exoplayer2.e.j;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
final class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f6101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f6105e;

    public d(b bVar, int i10, long j10, long j11) {
        this.f6101a = bVar;
        this.f6102b = i10;
        this.f6103c = j10;
        long j12 = (j11 - j10) / ((long) bVar.f6096e);
        this.f6104d = j12;
        this.f6105e = b(j12);
    }

    private long b(long j10) {
        return ai.d(j10 * ((long) this.f6102b), 1000000L, this.f6101a.f6094c);
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        long jA = ai.a((((long) this.f6101a.f6094c) * j10) / (((long) this.f6102b) * 1000000), 0L, this.f6104d - 1);
        long j11 = (((long) this.f6101a.f6096e) * jA) + this.f6103c;
        long jB = b(jA);
        w wVar = new w(jB, j11);
        if (jB >= j10 || jA == this.f6104d - 1) {
            return new v.a(wVar);
        }
        long j12 = jA + 1;
        return new v.a(wVar, new w(b(j12), (((long) this.f6101a.f6096e) * j12) + this.f6103c));
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f6105e;
    }
}
