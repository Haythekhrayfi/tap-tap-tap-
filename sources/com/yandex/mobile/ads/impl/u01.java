package com.yandex.mobile.ads.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<yv> f25526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j71[] f25527b;

    public u01(List<yv> list) {
        this.f25526a = list;
        this.f25527b = new j71[list.size()];
    }

    public final void a(long j10, mp0 mp0Var) {
        kh.a(j10, mp0Var, this.f25527b);
    }

    public final void a(wt wtVar, r81.d dVar) {
        for (int i10 = 0; i10 < this.f25527b.length; i10++) {
            dVar.a();
            j71 j71VarA = wtVar.a(dVar.c(), 3);
            yv yvVar = this.f25526a.get(i10);
            String str = yvVar.f27115l;
            pa.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String strB = yvVar.f27104a;
            if (strB == null) {
                strB = dVar.b();
            }
            j71VarA.a(new yv.a().c(strB).f(str).o(yvVar.f27107d).e(yvVar.f27106c).a(yvVar.D).a(yvVar.f27117n).a());
            this.f25527b[i10] = j71VarA;
        }
    }
}
