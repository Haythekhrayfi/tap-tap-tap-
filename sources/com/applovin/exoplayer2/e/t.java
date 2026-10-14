package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f6130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f6131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6133d;

    public t(long[] jArr, long[] jArr2, long j10) {
        com.applovin.exoplayer2.l.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f6133d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f6130a = jArr;
            this.f6131b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f6130a = jArr3;
            long[] jArr4 = new long[i10];
            this.f6131b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f6132c = j10;
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        if (!this.f6133d) {
            return new v.a(w.f6139a);
        }
        int iA = ai.a(this.f6131b, j10, true, true);
        w wVar = new w(this.f6131b[iA], this.f6130a[iA]);
        if (wVar.f6140b == j10 || iA == this.f6131b.length - 1) {
            return new v.a(wVar);
        }
        int i10 = iA + 1;
        return new v.a(wVar, new w(this.f6131b[i10], this.f6130a[i10]));
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return this.f6133d;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f6132c;
    }
}
