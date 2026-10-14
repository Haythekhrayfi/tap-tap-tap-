package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1904qa implements Object<Nc, C1760kg.y.a> {
    public List<Nc> a(C1760kg.y.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C1760kg.y.a aVar : aVarArr) {
            arrayList.add(new Nc(aVar.f16758b, aVar.f16759c));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.y.a[] b(List<Nc> list) {
        C1760kg.y.a[] aVarArr = new C1760kg.y.a[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            Nc nc2 = list.get(i10);
            C1760kg.y.a aVar = new C1760kg.y.a();
            aVar.f16758b = nc2.f14539a;
            aVar.f16759c = nc2.f14540b;
            aVarArr[i10] = aVar;
        }
        return aVarArr;
    }
}
