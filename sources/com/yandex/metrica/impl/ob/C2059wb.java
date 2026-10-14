package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2059wb implements InterfaceC1780lb<Jb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1880pb f17770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1954sb f17771b;

    public C2059wb() {
        this(new C1880pb(), new C1954sb());
    }

    public C2059wb(C1880pb c1880pb, C1954sb c1954sb) {
        this.f17770a = c1880pb;
        this.f17771b = c1954sb;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Object a(List<C1979tb<Rf, Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public List<C1979tb<Rf, Fn>> b(Object obj) {
        C1979tb<Rf.m, Fn> c1979tbB;
        Jb jb2 = (Jb) obj;
        Rf rf = new Rf();
        rf.f14873b = 3;
        rf.f14876e = new Rf.p();
        C1979tb<Rf.k, Fn> c1979tbB2 = this.f17770a.b(jb2.f14313b);
        rf.f14876e.f14924b = c1979tbB2.f17444a;
        Gb gb2 = jb2.f14314c;
        if (gb2 != null) {
            c1979tbB = this.f17771b.b(gb2);
            rf.f14876e.f14925c = c1979tbB.f17444a;
        } else {
            c1979tbB = null;
        }
        return Collections.singletonList(new C1979tb(rf, En.a(c1979tbB2, c1979tbB)));
    }
}
