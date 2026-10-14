package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.r;

/* JADX INFO: loaded from: classes.dex */
final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f5428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f5429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f5430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5431d;

    public b(long j10, long j11, long j12) {
        this.f5431d = j10;
        this.f5428a = j12;
        r rVar = new r();
        this.f5429b = rVar;
        r rVar2 = new r();
        this.f5430c = rVar2;
        rVar.a(0L);
        rVar2.a(j11);
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        int iA = ai.a(this.f5429b, j10, true, true);
        w wVar = new w(this.f5429b.a(iA), this.f5430c.a(iA));
        if (wVar.f6140b == j10 || iA == this.f5429b.a() - 1) {
            return new v.a(wVar);
        }
        int i10 = iA + 1;
        return new v.a(wVar, new w(this.f5429b.a(i10), this.f5430c.a(i10)));
    }

    public void a(long j10, long j11) {
        if (b(j10)) {
            return;
        }
        this.f5429b.a(j10);
        this.f5430c.a(j11);
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f5431d;
    }

    public boolean b(long j10) {
        r rVar = this.f5429b;
        return j10 - rVar.a(rVar.a() - 1) < 100000;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return this.f5428a;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j10) {
        return this.f5429b.a(ai.a(this.f5430c, j10, true, true));
    }

    public void d(long j10) {
        this.f5431d = j10;
    }
}
