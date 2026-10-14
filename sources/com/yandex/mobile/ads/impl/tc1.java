package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class tc1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gd1<T> f25341a;

    public tc1(gd1<T> gd1Var) {
        this.f25341a = gd1Var;
    }

    public final sc1<T> a(gb1 gb1Var, int i10, int i11) {
        ac1 ac1VarD = gb1Var.d();
        nl nlVarA = gb1Var.a();
        vb0 vb0VarB = gb1Var.b();
        o31 o31VarC = gb1Var.c();
        String strE = gb1Var.e();
        JSONObject jSONObjectF = gb1Var.f();
        return new sc1<>(nlVarA, ac1VarD, vb0VarB, this.f25341a.a(ac1VarD, nlVarA, vb0VarB, new rd1(i10, i11 + 1), strE, jSONObjectF), o31VarC);
    }
}
