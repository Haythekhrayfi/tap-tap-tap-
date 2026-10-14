package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class mk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final db f23105a;

    public mk0(db dbVar) {
        this.f23105a = dbVar;
    }

    public final lk0 a() {
        om0 om0Var;
        vc0 vc0VarA = this.f23105a.a();
        pl0 pl0Var = null;
        if (vc0VarA != null) {
            pl0 pl0Var2 = vc0VarA.c() != null ? new pl0() : null;
            om0Var = vc0VarA.b() != null ? new om0() : null;
            pl0Var = pl0Var2;
        } else {
            om0Var = null;
        }
        return new lk0(pl0Var, om0Var);
    }
}
