package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e31 {
    public static ArrayList a(List list, m80 m80Var) {
        List<m> listA;
        List<m> listA2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (m80Var != null && (listA2 = m80Var.a()) != null) {
            for (m mVar : listA2) {
                if (mVar instanceof c31) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<f31> it = ((c31) mVar).b().iterator();
                    while (it.hasNext()) {
                        arrayList3.add(it.next().c().a());
                    }
                    arrayList2.addAll(arrayList3);
                }
            }
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList4 = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m80 m80VarA = ((qa) it2.next()).a();
                ArrayList arrayList5 = new ArrayList();
                if (m80VarA != null && (listA = m80VarA.a()) != null) {
                    for (m mVar2 : listA) {
                        if (mVar2 instanceof c31) {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator<f31> it3 = ((c31) mVar2).b().iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(it3.next().c().a());
                            }
                            arrayList5.addAll(arrayList6);
                        }
                    }
                }
                arrayList4.addAll(arrayList5);
            }
        }
        arrayList.addAll(arrayList4);
        return arrayList;
    }
}
