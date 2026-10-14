package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1905qb implements InterfaceC1605ea<List<String>, C1979tb<Rf.l[], Fn>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tn f17168a;

    public C1905qb() {
        this(new Tn(20, 100));
    }

    public C1905qb(Tn tn) {
        this.f17168a = tn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1979tb<Rf.l[], Fn> b(List<String> list) {
        Qn<List<String>, Hn> qnA = this.f17168a.a((List) list);
        List<String> list2 = qnA.f14828a;
        Rf.l[] lVarArr = new Rf.l[0];
        if (list2 != null) {
            lVarArr = new Rf.l[list2.size()];
            for (int i10 = 0; i10 < list2.size(); i10++) {
                lVarArr[i10] = new Rf.l();
                lVarArr[i10].f14914b = O2.c(list2.get(i10));
            }
        }
        return new C1979tb<>(lVarArr, qnA.f14829b);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public List<String> a(C1979tb<Rf.l[], Fn> c1979tb) {
        throw new UnsupportedOperationException();
    }
}
