package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class d30 implements p01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f19744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f19745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19747d;

    public d30(long j10, long[] jArr, long[] jArr2) {
        pa.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f19747d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f19744a = jArr;
            this.f19745b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f19744a = jArr3;
            long[] jArr4 = new long[i10];
            this.f19745b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f19746c = j10;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final p01.a b(long j10) {
        if (!this.f19747d) {
            r01 r01Var = r01.f24582c;
            return new p01.a(r01Var, r01Var);
        }
        int iB = da1.b(this.f19745b, j10, true);
        long[] jArr = this.f19745b;
        long j11 = jArr[iB];
        long[] jArr2 = this.f19744a;
        r01 r01Var2 = new r01(j11, jArr2[iB]);
        if (j11 == j10 || iB == jArr.length - 1) {
            return new p01.a(r01Var2, r01Var2);
        }
        int i10 = iB + 1;
        return new p01.a(r01Var2, new r01(jArr[i10], jArr2[i10]));
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final boolean b() {
        return this.f19747d;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final long c() {
        return this.f19746c;
    }
}
