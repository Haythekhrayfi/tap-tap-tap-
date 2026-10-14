package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2028va implements Object<C1709ie, C1760kg.l> {
    public List<C1709ie> a(C1760kg.l[] lVarArr) {
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (C1760kg.l lVar : lVarArr) {
            arrayList.add(new C1709ie(lVar.f16691b, lVar.f16692c));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.l[] b(List<C1709ie> list) {
        C1760kg.l[] lVarArr = new C1760kg.l[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C1709ie c1709ie = list.get(i10);
            C1760kg.l lVar = new C1760kg.l();
            lVar.f16691b = c1709ie.f16345a;
            lVar.f16692c = c1709ie.f16346b;
            lVarArr[i10] = lVar;
        }
        return lVarArr;
    }
}
