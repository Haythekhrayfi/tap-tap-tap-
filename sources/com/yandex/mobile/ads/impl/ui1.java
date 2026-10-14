package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ui1 implements p01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final si1 f25663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f25667e;

    public ui1(si1 si1Var, int i10, long j10, long j11) {
        this.f25663a = si1Var;
        this.f25664b = i10;
        this.f25665c = j10;
        long j12 = (j11 - j10) / ((long) si1Var.f25123d);
        this.f25666d = j12;
        this.f25667e = c(j12);
    }

    private long c(long j10) {
        return da1.a(j10 * ((long) this.f25664b), 1000000L, this.f25663a.f25122c);
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final p01.a b(long j10) {
        long j11 = (((long) this.f25663a.f25122c) * j10) / (((long) this.f25664b) * 1000000);
        long j12 = this.f25666d - 1;
        int i10 = da1.f19803a;
        long jMax = Math.max(0L, Math.min(j11, j12));
        long j13 = (((long) this.f25663a.f25123d) * jMax) + this.f25665c;
        long jC = c(jMax);
        r01 r01Var = new r01(jC, j13);
        if (jC >= j10 || jMax == this.f25666d - 1) {
            return new p01.a(r01Var, r01Var);
        }
        long j14 = jMax + 1;
        return new p01.a(r01Var, new r01(c(j14), (((long) this.f25663a.f25123d) * j14) + this.f25665c));
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final long c() {
        return this.f25667e;
    }
}
