package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class uu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final iz0 f25742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1 f25743b;

    public uu0(iz0 iz0Var, x1 x1Var) {
        this.f25742a = iz0Var;
        this.f25743b = x1Var;
    }

    public final w50 a(long j10) {
        for (rr0 rr0Var : this.f25742a.a()) {
            w50 w50VarA = rr0Var.a();
            boolean z10 = Math.abs(rr0Var.b() - j10) < 200;
            w1 w1VarA = this.f25743b.a(w50VarA);
            if (z10 && w1.f26126c.equals(w1VarA)) {
                return w50VarA;
            }
        }
        return null;
    }
}
