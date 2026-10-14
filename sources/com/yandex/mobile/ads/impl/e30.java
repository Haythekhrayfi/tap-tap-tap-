package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class e30 implements s01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q90 f20056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q90 f20057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20058d;

    public e30(long j10, long j11, long j12) {
        this.f20058d = j10;
        this.f20055a = j12;
        q90 q90Var = new q90();
        this.f20056b = q90Var;
        q90 q90Var2 = new q90();
        this.f20057c = q90Var2;
        q90Var.a(0L);
        q90Var2.a(j11);
    }

    @Override // com.yandex.mobile.ads.impl.s01
    public final long a() {
        return this.f20055a;
    }

    @Override // com.yandex.mobile.ads.impl.s01
    public final long a(long j10) {
        return this.f20056b.a(da1.a(this.f20057c, j10));
    }

    public final void a(long j10, long j11) {
        if (c(j10)) {
            return;
        }
        this.f20056b.a(j10);
        this.f20057c.a(j11);
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final p01.a b(long j10) {
        int iA = da1.a(this.f20056b, j10);
        long jA = this.f20056b.a(iA);
        r01 r01Var = new r01(jA, this.f20057c.a(iA));
        if (jA == j10 || iA == this.f20056b.a() - 1) {
            return new p01.a(r01Var, r01Var);
        }
        int i10 = iA + 1;
        return new p01.a(r01Var, new r01(this.f20056b.a(i10), this.f20057c.a(i10)));
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.p01
    public final long c() {
        return this.f20058d;
    }

    public final boolean c(long j10) {
        q90 q90Var = this.f20056b;
        return j10 - q90Var.a(q90Var.a() - 1) < 100000;
    }

    public final void d(long j10) {
        this.f20058d = j10;
    }
}
