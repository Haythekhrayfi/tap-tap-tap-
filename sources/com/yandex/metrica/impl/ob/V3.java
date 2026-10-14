package com.yandex.metrica.impl.ob;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
class V3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, A> f15205a = new HashMap<>();

    public synchronized A a(C1549c4 c1549c4, Im im, G9 g10) {
        A a10;
        a10 = this.f15205a.get(c1549c4.toString());
        if (a10 == null) {
            A.a aVarE = g10.e();
            a10 = new A(aVarE.f13617a, aVarE.f13618b, im);
            this.f15205a.put(c1549c4.toString(), a10);
        }
        return a10;
    }
}
