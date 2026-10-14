package com.applovin.exoplayer2.i.e;

import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<List<com.applovin.exoplayer2.i.a>> f6984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Long> f6985b;

    public d(List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        this.f6984a = list;
        this.f6985b = list2;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        int iB = ai.b((List<? extends Comparable<? super Long>>) this.f6985b, Long.valueOf(j10), false, false);
        if (iB < this.f6985b.size()) {
            return iB;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 >= 0);
        com.applovin.exoplayer2.l.a.a(i10 < this.f6985b.size());
        return this.f6985b.get(i10).longValue();
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        int iA = ai.a((List<? extends Comparable<? super Long>>) this.f6985b, Long.valueOf(j10), true, false);
        return iA == -1 ? Collections.emptyList() : this.f6984a.get(iA);
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.f6985b.size();
    }
}
