package com.yandex.metrica.impl.ob;

import java.util.Iterator;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1925r7 implements InterfaceC1605ea<C1602e7, If> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private D7 f17230a;

    public C1925r7(D7 d10) {
        this.f17230a = d10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public If b(C1602e7 c1602e7) {
        If r10 = new If();
        C1801m7 c1801m7 = c1602e7.f16025a;
        if (c1801m7 != null) {
            r10.f14214b = this.f17230a.b(c1801m7);
        }
        r10.f14215c = new Pf[c1602e7.f16026b.size()];
        int i10 = 0;
        Iterator<C1801m7> it = c1602e7.f16026b.iterator();
        while (it.hasNext()) {
            r10.f14215c[i10] = this.f17230a.b(it.next());
            i10++;
        }
        String str = c1602e7.f16027c;
        if (str != null) {
            r10.f14216d = str;
        }
        return r10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1602e7 a(If r10) {
        throw new UnsupportedOperationException();
    }
}
