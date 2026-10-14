package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2029vb implements InterfaceC1780lb<Ib> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2004ub f17620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1880pb f17621b;

    public C2029vb() {
        this(new C2004ub(), new C1880pb());
    }

    public C2029vb(C2004ub c2004ub, C1880pb c1880pb) {
        this.f17620a = c2004ub;
        this.f17621b = c1880pb;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Object a(List<C1979tb<Rf, Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public List<C1979tb<Rf, Fn>> b(Object obj) {
        Ib ib2 = (Ib) obj;
        Rf rf = new Rf();
        rf.f14873b = 2;
        rf.f14875d = new Rf.o();
        C1979tb<Rf.n, Fn> c1979tbB = this.f17620a.b(ib2.f14210c);
        rf.f14875d.f14923c = c1979tbB.f17444a;
        C1979tb<Rf.k, Fn> c1979tbB2 = this.f17621b.b(ib2.f14209b);
        rf.f14875d.f14922b = c1979tbB2.f17444a;
        return Collections.singletonList(new C1979tb(rf, En.a(c1979tbB, c1979tbB2)));
    }
}
