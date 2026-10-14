package com.yandex.metrica.impl.ob;

import java.util.Iterator;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1701i6 implements InterfaceC1605ea<C1676h6, C1611eg> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1611eg b(C1676h6 c1676h6) {
        C1611eg c1611eg = new C1611eg();
        c1611eg.f16062e = new int[c1676h6.b().size()];
        Iterator<Integer> it = c1676h6.b().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c1611eg.f16062e[i10] = it.next().intValue();
            i10++;
        }
        c1611eg.f16061d = c1676h6.c();
        c1611eg.f16060c = c1676h6.d();
        c1611eg.f16059b = c1676h6.e();
        return c1611eg;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1676h6 a(C1611eg c1611eg) {
        return new C1676h6(c1611eg.f16059b, c1611eg.f16060c, c1611eg.f16061d, U2.a(c1611eg.f16062e));
    }
}
