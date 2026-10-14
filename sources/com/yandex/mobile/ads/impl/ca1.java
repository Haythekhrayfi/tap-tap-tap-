package com.yandex.mobile.ads.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class ca1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<yv> f19435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j71[] f19436b;

    public ca1(List<yv> list) {
        this.f19435a = list;
        this.f19436b = new j71[list.size()];
    }

    public final void a(long j10, mp0 mp0Var) {
        if (mp0Var.a() < 9) {
            return;
        }
        int iH = mp0Var.h();
        int iH2 = mp0Var.h();
        int iT = mp0Var.t();
        if (iH == 434 && iH2 == 1195456820 && iT == 3) {
            kh.b(j10, mp0Var, this.f19436b);
        }
    }

    public final void a(wt wtVar, r81.d dVar) {
        for (int i10 = 0; i10 < this.f19436b.length; i10++) {
            dVar.a();
            j71 j71VarA = wtVar.a(dVar.c(), 3);
            yv yvVar = this.f19435a.get(i10);
            String str = yvVar.f27115l;
            pa.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            j71VarA.a(new yv.a().c(dVar.b()).f(str).o(yvVar.f27107d).e(yvVar.f27106c).a(yvVar.D).a(yvVar.f27117n).a());
            this.f19436b[i10] = j71VarA;
        }
    }
}
