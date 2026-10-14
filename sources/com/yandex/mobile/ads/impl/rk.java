package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public class rk implements p01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f24752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f24755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f24756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f24757g;

    public rk(int i10, int i11, long j10, long j11, boolean z10) {
        long jA;
        this.f24751a = j10;
        this.f24752b = j11;
        this.f24753c = i11 == -1 ? 1 : i11;
        this.f24755e = i10;
        this.f24757g = z10;
        if (j10 == -1) {
            this.f24754d = -1L;
            jA = -9223372036854775807L;
        } else {
            this.f24754d = j10 - j11;
            jA = a(i10, j10, j11);
        }
        this.f24756f = jA;
    }

    private static long a(int i10, long j10, long j11) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / ((long) i10);
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final p01.a b(long j10) {
        long j11 = this.f24754d;
        if (j11 == -1 && !this.f24757g) {
            r01 r01Var = new r01(0L, this.f24752b);
            return new p01.a(r01Var, r01Var);
        }
        long j12 = (((long) this.f24755e) * j10) / 8000000;
        long j13 = this.f24753c;
        long jMin = (j12 / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = this.f24752b + Math.max(jMin, 0L);
        long jC = c(jMax);
        r01 r01Var2 = new r01(jC, jMax);
        if (this.f24754d != -1 && jC < j10) {
            long j14 = jMax + ((long) this.f24753c);
            if (j14 < this.f24751a) {
                return new p01.a(r01Var2, new r01(c(j14), j14));
            }
        }
        return new p01.a(r01Var2, r01Var2);
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final boolean b() {
        return this.f24754d != -1 || this.f24757g;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final long c() {
        return this.f24756f;
    }

    public final long c(long j10) {
        return a(this.f24755e, j10, this.f24752b);
    }
}
