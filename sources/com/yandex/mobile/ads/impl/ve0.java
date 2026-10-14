package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.exo.metadata.id3.MlltFrame;

/* JADX INFO: loaded from: classes3.dex */
final class ve0 implements s01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f25967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f25968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25969c;

    private ve0(long j10, long[] jArr, long[] jArr2) {
        this.f25967a = jArr;
        this.f25968b = jArr2;
        this.f25969c = j10 == -9223372036854775807L ? da1.a(jArr2[jArr2.length - 1]) : j10;
    }

    private static Pair<Long, Long> a(long j10, long[] jArr, long[] jArr2) {
        Long lValueOf;
        Long lValueOf2;
        int iB = da1.b(jArr, j10, true);
        long j11 = jArr[iB];
        long j12 = jArr2[iB];
        int i10 = iB + 1;
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

    public static ve0 a(long j10, MlltFrame mlltFrame, long j11) {
        int length = mlltFrame.f18590e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (mlltFrame.f18588c + mlltFrame.f18590e[i12]);
            j12 += (long) (mlltFrame.f18589d + mlltFrame.f18591f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new ve0(j11, jArr, jArr2);
    }

    @Override // com.yandex.mobile.ads.impl.s01
    public final long a() {
        return -1L;
    }

    @Override // com.yandex.mobile.ads.impl.s01
    public final long a(long j10) {
        return da1.a(((Long) a(j10, this.f25967a, this.f25968b).second).longValue());
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final p01.a b(long j10) {
        long j11 = this.f25969c;
        int i10 = da1.f19803a;
        Pair<Long, Long> pairA = a(da1.b(Math.max(0L, Math.min(j10, j11))), this.f25968b, this.f25967a);
        r01 r01Var = new r01(da1.a(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new p01.a(r01Var, r01Var);
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final long c() {
        return this.f25969c;
    }
}
