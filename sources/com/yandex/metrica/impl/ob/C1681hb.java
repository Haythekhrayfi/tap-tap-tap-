package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1681hb implements InterfaceC1780lb<C2134zb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1706ib f16270a;

    public C1681hb() {
        this(new C1706ib());
    }

    public C1681hb(C1706ib c1706ib) {
        this.f16270a = c1706ib;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Object a(List<C1979tb<Rf, Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public List<C1979tb<Rf, Fn>> b(Object obj) {
        C2134zb c2134zb = (C2134zb) obj;
        Rf rf = new Rf();
        rf.f14877f = new Rf.b();
        C1979tb<Rf.c, Fn> c1979tbB = this.f16270a.b(c2134zb.f18013c);
        rf.f14877f.f14882b = c1979tbB.f17444a;
        rf.f14873b = c2134zb.f18012b;
        return Collections.singletonList(new C1979tb(rf, En.a(c1979tbB)));
    }
}
