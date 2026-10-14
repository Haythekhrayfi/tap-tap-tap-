package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class Yj {
    private boolean a(Integer num) {
        return (num == null || num.intValue() == Integer.MAX_VALUE) ? false : true;
    }

    public Vj a(Vj vj) {
        Vj.a aVar = new Vj.a();
        aVar.a(vj.c());
        if (a(vj.p())) {
            aVar.l(vj.p());
        }
        if (a(vj.k())) {
            aVar.i(vj.k());
        }
        if (a(vj.l())) {
            aVar.j(vj.l());
        }
        if (a(vj.e())) {
            aVar.c(vj.e());
        }
        if (a(vj.b())) {
            aVar.b(vj.b());
        }
        if (!TextUtils.isEmpty(vj.n())) {
            aVar.b(vj.n());
        }
        if (!TextUtils.isEmpty(vj.m())) {
            aVar.a(vj.m());
        }
        aVar.a(vj.q());
        if (a(vj.o())) {
            aVar.k(vj.o());
        }
        aVar.a(vj.d());
        if (a(vj.h())) {
            aVar.f(vj.h());
        }
        if (a(vj.j())) {
            aVar.h(vj.j());
        }
        if (a(vj.a())) {
            aVar.a(vj.a());
        }
        if (a(vj.i())) {
            aVar.g(vj.i());
        }
        if (a(vj.f())) {
            aVar.d(vj.f());
        }
        if (a(vj.g())) {
            aVar.e(vj.g());
        }
        return new Vj(aVar);
    }
}
