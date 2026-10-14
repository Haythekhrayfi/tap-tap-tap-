package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1855ob implements InterfaceC1605ea<Db, C1979tb<Rf.j, Fn>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1656gb f17001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lb f17002b;

    public C1855ob() {
        this(new C1656gb(), new Lb(30));
    }

    public C1855ob(C1656gb c1656gb, Lb lb2) {
        this.f17001a = c1656gb;
        this.f17002b = lb2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1979tb<Rf.j, Fn> b(Db db2) {
        int iA;
        Rf.j jVar = new Rf.j();
        C1979tb<Rf.a, Fn> c1979tbB = this.f17001a.b(db2.f13806a);
        jVar.f14904b = c1979tbB.f17444a;
        Qn<List<C2109yb>, Hn> qnA = this.f17002b.a((List) db2.f13807b);
        if (U2.b(qnA.f14828a)) {
            iA = 0;
        } else {
            jVar.f14905c = new Rf.a[qnA.f14828a.size()];
            iA = 0;
            for (int i10 = 0; i10 < qnA.f14828a.size(); i10++) {
                C1979tb<Rf.a, Fn> c1979tbB2 = this.f17001a.b(qnA.f14828a.get(i10));
                jVar.f14905c[i10] = c1979tbB2.f17444a;
                iA += c1979tbB2.f17445b.a();
            }
        }
        return new C1979tb<>(jVar, En.a(c1979tbB, qnA, new En(iA)));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Db a(C1979tb<Rf.j, Fn> c1979tb) {
        throw new UnsupportedOperationException();
    }
}
