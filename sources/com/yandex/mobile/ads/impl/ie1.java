package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ie1 {
    public static he1 a(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ac1 ac1Var = (ac1) it.next();
            if (ac1Var.o()) {
                arrayList2.add(ac1Var);
            } else {
                arrayList.add(ac1Var);
            }
        }
        return new he1(arrayList, arrayList2);
    }
}
