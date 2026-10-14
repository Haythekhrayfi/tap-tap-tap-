package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;

/* JADX INFO: loaded from: classes3.dex */
public final class q4 implements et0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f24311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lr0 f24312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ys f24313c;

    public q4(h6 h6Var, kr0 kr0Var) {
        this.f24311a = h6Var;
        this.f24312b = kr0Var.d();
        this.f24313c = kr0Var.c();
    }

    @Override // com.yandex.mobile.ads.impl.et0
    public final ar0 a() {
        Player playerA;
        pr0 pr0VarB = this.f24311a.b();
        if (pr0VarB == null) {
            return ar0.f19043c;
        }
        boolean zC = this.f24312b.c();
        n40 n40VarA = this.f24311a.a(pr0VarB.b());
        ar0 ar0Var = ar0.f19043c;
        return (n40.f23216a.equals(n40VarA) || !zC || (playerA = this.f24313c.a()) == null) ? ar0Var : new ar0(playerA.getCurrentPosition(), playerA.getDuration());
    }
}
