package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ov implements p01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pv f23924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23925b;

    public ov(pv pvVar, long j10) {
        this.f23924a = pvVar;
        this.f23925b = j10;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final p01.a b(long j10) {
        pa.b(this.f23924a.f24262k);
        pv pvVar = this.f23924a;
        pv.a aVar = pvVar.f24262k;
        long[] jArr = aVar.f24264a;
        long[] jArr2 = aVar.f24265b;
        int iB = da1.b(jArr, pvVar.a(j10), false);
        long j11 = iB == -1 ? 0L : jArr[iB];
        long j12 = iB != -1 ? jArr2[iB] : 0L;
        long j13 = this.f23924a.f24256e;
        long j14 = (j11 * 1000000) / j13;
        long j15 = this.f23925b;
        r01 r01Var = new r01(j14, j12 + j15);
        if (j14 == j10 || iB == jArr.length - 1) {
            return new p01.a(r01Var, r01Var);
        }
        int i10 = iB + 1;
        return new p01.a(r01Var, new r01((jArr[i10] * 1000000) / j13, j15 + jArr2[i10]));
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final long c() {
        return this.f23924a.b();
    }
}
