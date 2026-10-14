package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1880pb implements InterfaceC1605ea<Eb, C1979tb<Rf.k, Fn>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1830nb f17064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1855ob f17065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1730jb f17066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1905qb f17067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Un f17068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Un f17069f;

    public C1880pb() {
        this(new C1830nb(), new C1855ob(), new C1730jb(), new C1905qb(), new Un(100), new Un(1000));
    }

    public C1880pb(C1830nb c1830nb, C1855ob c1855ob, C1730jb c1730jb, C1905qb c1905qb, Un un, Un un2) {
        this.f17064a = c1830nb;
        this.f17065b = c1855ob;
        this.f17066c = c1730jb;
        this.f17067d = c1905qb;
        this.f17068e = un;
        this.f17069f = un2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1979tb<Rf.k, Fn> b(Eb eb2) {
        C1979tb<Rf.d, Fn> c1979tbB;
        C1979tb<Rf.i, Fn> c1979tbB2;
        C1979tb<Rf.j, Fn> c1979tbB3;
        C1979tb<Rf.j, Fn> c1979tbB4;
        Rf.k kVar = new Rf.k();
        Qn<String, Fn> qnA = this.f17068e.a(eb2.f13895a);
        kVar.f14906b = O2.c(qnA.f14828a);
        Qn<String, Fn> qnA2 = this.f17069f.a(eb2.f13896b);
        kVar.f14907c = O2.c(qnA2.f14828a);
        List<String> list = eb2.f13897c;
        C1979tb<Rf.l[], Fn> c1979tbB5 = null;
        if (list != null) {
            c1979tbB = this.f17066c.b(list);
            kVar.f14908d = c1979tbB.f17444a;
        } else {
            c1979tbB = null;
        }
        Map<String, String> map = eb2.f13898d;
        if (map != null) {
            c1979tbB2 = this.f17064a.b(map);
            kVar.f14909e = c1979tbB2.f17444a;
        } else {
            c1979tbB2 = null;
        }
        Db db2 = eb2.f13899e;
        if (db2 != null) {
            c1979tbB3 = this.f17065b.b(db2);
            kVar.f14910f = c1979tbB3.f17444a;
        } else {
            c1979tbB3 = null;
        }
        Db db3 = eb2.f13900f;
        if (db3 != null) {
            c1979tbB4 = this.f17065b.b(db3);
            kVar.f14911g = c1979tbB4.f17444a;
        } else {
            c1979tbB4 = null;
        }
        List<String> list2 = eb2.f13901g;
        if (list2 != null) {
            c1979tbB5 = this.f17067d.b(list2);
            kVar.f14912h = c1979tbB5.f17444a;
        }
        return new C1979tb<>(kVar, En.a(qnA, qnA2, c1979tbB, c1979tbB2, c1979tbB3, c1979tbB4, c1979tbB5));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Eb a(C1979tb<Rf.k, Fn> c1979tb) {
        throw new UnsupportedOperationException();
    }
}
