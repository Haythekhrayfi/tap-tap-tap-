package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1706ib implements InterfaceC1605ea<Ab, C1979tb<Rf.c, Fn>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1880pb f16332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1755kb f16333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1855ob f16334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1954sb f16335d;

    public C1706ib() {
        this(new C1880pb(), new C1755kb(), new C1855ob(), new C1954sb());
    }

    public C1706ib(C1880pb c1880pb, C1755kb c1755kb, C1855ob c1855ob, C1954sb c1954sb) {
        this.f16332a = c1880pb;
        this.f16333b = c1755kb;
        this.f16334c = c1855ob;
        this.f16335d = c1954sb;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1979tb<Rf.c, Fn> b(Ab ab2) {
        C1979tb<Rf.m, Fn> c1979tbB;
        Rf.c cVar = new Rf.c();
        C1979tb<Rf.k, Fn> c1979tbB2 = this.f16332a.b(ab2.f13633a);
        cVar.f14883b = c1979tbB2.f17444a;
        cVar.f14885d = this.f16333b.b(ab2.f13634b);
        C1979tb<Rf.j, Fn> c1979tbB3 = this.f16334c.b(ab2.f13635c);
        cVar.f14886e = c1979tbB3.f17444a;
        Gb gb2 = ab2.f13636d;
        if (gb2 != null) {
            c1979tbB = this.f16335d.b(gb2);
            cVar.f14884c = c1979tbB.f17444a;
        } else {
            c1979tbB = null;
        }
        return new C1979tb<>(cVar, En.a(c1979tbB2, c1979tbB3, c1979tbB));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Ab a(C1979tb<Rf.c, Fn> c1979tb) {
        throw new UnsupportedOperationException();
    }
}
