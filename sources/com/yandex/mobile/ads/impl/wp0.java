package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class wp0 implements n01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yv f26340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a71 f26341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j71 f26342c;

    public wp0(String str) {
        this.f26340a = new yv.a().f(str).a();
    }

    @Override // com.yandex.mobile.ads.impl.n01
    public final void a(a71 a71Var, wt wtVar, r81.d dVar) {
        this.f26341b = a71Var;
        dVar.a();
        j71 j71VarA = wtVar.a(dVar.c(), 5);
        this.f26342c = j71VarA;
        j71VarA.a(this.f26340a);
    }

    @Override // com.yandex.mobile.ads.impl.n01
    public final void a(mp0 mp0Var) {
        pa.b(this.f26341b);
        int i10 = da1.f19803a;
        long jB = this.f26341b.b();
        long jC = this.f26341b.c();
        if (jB == -9223372036854775807L || jC == -9223372036854775807L) {
            return;
        }
        yv yvVar = this.f26340a;
        if (jC != yvVar.f27119p) {
            yv yvVarA = yvVar.a().a(jC).a();
            this.f26340a = yvVarA;
            this.f26342c.a(yvVarA);
        }
        int iA = mp0Var.a();
        this.f26342c.a(iA, mp0Var);
        this.f26342c.a(jB, 1, iA, 0, null);
    }
}
