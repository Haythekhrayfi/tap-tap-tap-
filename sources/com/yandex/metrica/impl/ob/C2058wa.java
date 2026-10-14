package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2058wa implements InterfaceC1605ea<List<C1709ie>, C1636fg> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public List<C1709ie> a(C1636fg c1636fg) {
        C1636fg c1636fg2 = c1636fg;
        ArrayList arrayList = new ArrayList(c1636fg2.f16136b.length);
        int i10 = 0;
        while (true) {
            C1636fg.a[] aVarArr = c1636fg2.f16136b;
            if (i10 >= aVarArr.length) {
                return arrayList;
            }
            C1636fg.a aVar = aVarArr[i10];
            arrayList.add(new C1709ie(aVar.f16138b, aVar.f16139c));
            i10++;
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1636fg b(List<C1709ie> list) {
        List<C1709ie> list2 = list;
        C1636fg c1636fg = new C1636fg();
        c1636fg.f16136b = new C1636fg.a[list2.size()];
        for (int i10 = 0; i10 < list2.size(); i10++) {
            C1636fg.a[] aVarArr = c1636fg.f16136b;
            C1709ie c1709ie = list2.get(i10);
            C1636fg.a aVar = new C1636fg.a();
            aVar.f16138b = c1709ie.f16345a;
            aVar.f16139c = c1709ie.f16346b;
            aVarArr[i10] = aVar;
        }
        return c1636fg;
    }
}
