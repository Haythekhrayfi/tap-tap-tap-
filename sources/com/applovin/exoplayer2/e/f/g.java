package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f5461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f5464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f5465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f5466f;

    private g(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    private g(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f5461a = j10;
        this.f5462b = i10;
        this.f5463c = j11;
        this.f5466f = jArr;
        this.f5464d = j12;
        this.f5465e = j12 != -1 ? j10 + j12 : -1L;
    }

    private long a(int i10) {
        return (this.f5463c * ((long) i10)) / 100;
    }

    public static g a(long j10, long j11, r.a aVar, y yVar) {
        int iW;
        int i10 = aVar.f4591g;
        int i11 = aVar.f4588d;
        int iQ = yVar.q();
        if ((iQ & 1) != 1 || (iW = yVar.w()) == 0) {
            return null;
        }
        long jD = ai.d(iW, ((long) i10) * 1000000, i11);
        if ((iQ & 6) != 6) {
            return new g(j11, aVar.f4587c, jD);
        }
        long jO = yVar.o();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = yVar.h();
        }
        if (j10 != -1) {
            long j12 = j11 + jO;
            if (j10 != j12) {
                StringBuilder sbA = i2.a.a("XING data size mismatch: ", j10, ", ");
                sbA.append(j12);
                q.c("XingSeeker", sbA.toString());
            }
        }
        return new g(j11, aVar.f4587c, jD, jO, jArr);
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        if (!a()) {
            return new v.a(new w(0L, this.f5461a + ((long) this.f5462b)));
        }
        long jA = ai.a(j10, 0L, this.f5463c);
        double d10 = (jA * 100.0d) / this.f5463c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = (long[]) com.applovin.exoplayer2.l.a.a(this.f5466f);
                double d12 = jArr[i10];
                d11 = d12 + (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d10 - ((double) i10)));
            }
        }
        return new v.a(new w(jA, this.f5461a + ai.a(Math.round((d11 / 256.0d) * this.f5464d), this.f5462b, this.f5464d - 1)));
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return this.f5466f != null;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f5463c;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return this.f5465e;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j10) {
        long j11 = j10 - this.f5461a;
        if (!a() || j11 <= this.f5462b) {
            return 0L;
        }
        long[] jArr = (long[]) com.applovin.exoplayer2.l.a.a(this.f5466f);
        double d10 = (j11 * 256.0d) / this.f5464d;
        int iA = ai.a(jArr, (long) d10, true, true);
        long jA = a(iA);
        long j12 = jArr[iA];
        int i10 = iA + 1;
        long jA2 = a(i10);
        long j13 = iA == 99 ? 256L : jArr[i10];
        return Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jA2 - jA)) + jA;
    }
}
