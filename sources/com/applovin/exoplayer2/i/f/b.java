package com.applovin.exoplayer2.i.f;

import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.i.a[] f6990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f6991b;

    public b(com.applovin.exoplayer2.i.a[] aVarArr, long[] jArr) {
        this.f6990a = aVarArr;
        this.f6991b = jArr;
    }

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        int iB = ai.b(this.f6991b, j10, false, false);
        if (iB < this.f6991b.length) {
            return iB;
        }
        return -1;
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        com.applovin.exoplayer2.l.a.a(i10 >= 0);
        com.applovin.exoplayer2.l.a.a(i10 < this.f6991b.length);
        return this.f6991b[i10];
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<com.applovin.exoplayer2.i.a> b(long j10) {
        int iA = ai.a(this.f6991b, j10, true, false);
        if (iA != -1) {
            com.applovin.exoplayer2.i.a[] aVarArr = this.f6990a;
            if (aVarArr[iA] != com.applovin.exoplayer2.i.a.f6736a) {
                return Collections.singletonList(aVarArr[iA]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return this.f6991b.length;
    }
}
