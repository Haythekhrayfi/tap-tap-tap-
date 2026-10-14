package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class o implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f6109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6110b;

    public o(p pVar, long j10) {
        this.f6109a = pVar;
        this.f6110b = j10;
    }

    private w a(long j10, long j11) {
        return new w((j10 * 1000000) / ((long) this.f6109a.f6115e), this.f6110b + j11);
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        com.applovin.exoplayer2.l.a.a(this.f6109a.f6121k);
        p pVar = this.f6109a;
        p.a aVar = pVar.f6121k;
        long[] jArr = aVar.f6123a;
        long[] jArr2 = aVar.f6124b;
        int iA = ai.a(jArr, pVar.a(j10), true, false);
        w wVarA = a(iA == -1 ? 0L : jArr[iA], iA != -1 ? jArr2[iA] : 0L);
        if (wVarA.f6140b == j10 || iA == jArr.length - 1) {
            return new v.a(wVarA);
        }
        int i10 = iA + 1;
        return new v.a(wVarA, a(jArr[i10], jArr2[i10]));
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f6109a.a();
    }
}
