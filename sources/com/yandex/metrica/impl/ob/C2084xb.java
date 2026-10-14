package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2084xb implements InterfaceC1780lb<Kb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2004ub f17836a;

    public C2084xb() {
        this(new C2004ub());
    }

    public C2084xb(C2004ub c2004ub) {
        this.f17836a = c2004ub;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Object a(List<C1979tb<Rf, Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public List<C1979tb<Rf, Fn>> b(Object obj) {
        Rf rf = new Rf();
        rf.f14873b = 1;
        rf.f14874c = new Rf.q();
        C1979tb<Rf.n, Fn> c1979tbB = this.f17836a.b(((Kb) obj).f14348b);
        rf.f14874c.f14926b = c1979tbB.f17444a;
        return Collections.singletonList(new C1979tb(rf, En.a(c1979tbB)));
    }
}
