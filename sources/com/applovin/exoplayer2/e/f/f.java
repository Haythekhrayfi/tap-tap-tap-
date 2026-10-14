package com.applovin.exoplayer2.e.f;

import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f5457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f5458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f5459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f5460d;

    private f(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f5457a = jArr;
        this.f5458b = jArr2;
        this.f5459c = j10;
        this.f5460d = j11;
    }

    public static f a(long j10, long j11, r.a aVar, y yVar) {
        int iH;
        yVar.e(10);
        int iQ = yVar.q();
        if (iQ <= 0) {
            return null;
        }
        int i10 = aVar.f4588d;
        long jD = ai.d(iQ, 1000000 * ((long) (i10 >= 32000 ? 1152 : 576)), i10);
        int i11 = yVar.i();
        int i12 = yVar.i();
        int i13 = yVar.i();
        yVar.e(2);
        long j12 = j11 + ((long) aVar.f4587c);
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        long j13 = j11;
        for (int i14 = 0; i14 < i11; i14++) {
            jArr[i14] = (((long) i14) * jD) / ((long) i11);
            jArr2[i14] = Math.max(j13, j12);
            if (i13 == 1) {
                iH = yVar.h();
            } else if (i13 == 2) {
                iH = yVar.i();
            } else if (i13 == 3) {
                iH = yVar.m();
            } else {
                if (i13 != 4) {
                    return null;
                }
                iH = yVar.w();
            }
            j13 += (long) (iH * i12);
        }
        if (j10 != -1 && j10 != j13) {
            StringBuilder sbA = i2.a.a("VBRI data size mismatch: ", j10, ", ");
            sbA.append(j13);
            q.c("VbriSeeker", sbA.toString());
        }
        return new f(jArr, jArr2, jD, j13);
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        int iA = ai.a(this.f5457a, j10, true, true);
        w wVar = new w(this.f5457a[iA], this.f5458b[iA]);
        if (wVar.f6140b >= j10 || iA == this.f5457a.length - 1) {
            return new v.a(wVar);
        }
        int i10 = iA + 1;
        return new v.a(wVar, new w(this.f5457a[i10], this.f5458b[i10]));
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f5459c;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c() {
        return this.f5460d;
    }

    @Override // com.applovin.exoplayer2.e.f.e
    public long c(long j10) {
        return this.f5457a[ai.a(this.f5458b, j10, true, true)];
    }
}
