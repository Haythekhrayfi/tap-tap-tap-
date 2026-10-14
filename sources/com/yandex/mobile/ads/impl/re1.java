package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class re1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final es0 f24685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ue1 f24686b;

    public re1(es0 es0Var, ue1 ue1Var) {
        this.f24686b = ue1Var;
        this.f24685a = es0Var;
    }

    public final boolean a() {
        long jA = this.f24686b.a();
        ir0 ir0VarB = this.f24685a.b();
        return jA != -9223372036854775807L && (ir0VarB != null ? ir0VarB.a() : -1L) + 1000 >= jA;
    }
}
