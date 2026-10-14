package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class Ia implements InterfaceC1605ea<List<C1617em>, C1760kg.x[]> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public List<C1617em> a(C1760kg.x[] xVarArr) {
        ArrayList arrayList = new ArrayList(xVarArr.length);
        for (C1760kg.x xVar : xVarArr) {
            arrayList.add(new C1617em(C1617em.b.a(xVar.f16752b), xVar.f16753c));
        }
        return arrayList;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.x[] b(List<C1617em> list) {
        C1760kg.x[] xVarArr = new C1760kg.x[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C1617em c1617em = list.get(i10);
            C1760kg.x xVar = new C1760kg.x();
            xVar.f16752b = c1617em.f16072a.f16079a;
            xVar.f16753c = c1617em.f16073b;
            xVarArr[i10] = xVar;
        }
        return xVarArr;
    }
}
