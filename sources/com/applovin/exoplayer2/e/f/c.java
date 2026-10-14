package com.applovin.exoplayer2.e.f;

import android.util.Pair;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.g.e.j;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f5432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f5433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5434c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f5432a = jArr;
        this.f5433b = jArr2;
        this.f5434c = j10 == -9223372036854775807L ? h.b(jArr2[jArr2.length - 1]) : j10;
    }

    private static Pair<Long, Long> a(long j10, long[] jArr, long[] jArr2) {
        Long lValueOf;
        Long lValueOf2;
        int iA = ai.a(jArr, j10, true, true);
        long j11 = jArr[iA];
        long j12 = jArr2[iA];
        int i10 = iA + 1;
        if (i10 == jArr.length) {
            lValueOf = Long.valueOf(j11);
            lValueOf2 = Long.valueOf(j12);
        } else {
            long j13 = jArr[i10];
            long j14 = jArr2[i10];
            double d10 = j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11);
            lValueOf = Long.valueOf(j10);
            lValueOf2 = Long.valueOf(((long) (d10 * (j14 - j12))) + j12);
        }
        return Pair.create(lValueOf, lValueOf2);
    }

    public static c a(long j10, j jVar, long j11) {
        int length = jVar.f6384d.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (jVar.f6382b + jVar.f6384d[i12]);
            j12 += (long) (jVar.f6383c + jVar.f6385e[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        Pair<Long, Long> pairA = a(h.a(ai.a(j10, 0L, this.f5434c)), this.f5433b, this.f5432a);
        return new v.a(new w(h.b(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue()));
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f5434c;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return -1L;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j10) {
        return h.b(((Long) a(j10, this.f5432a, this.f5433b).second).longValue());
    }
}
