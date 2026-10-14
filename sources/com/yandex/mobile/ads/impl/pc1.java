package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pc1 {
    public static bg1 a(ac1 ac1Var) {
        fd.j0.i(ac1Var, "videoAd");
        return new ho1(ac1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(ac1 ac1Var) {
        fd.j0.i(ac1Var, "$videoAd");
        List<u71> listB = ac1Var.l().b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listB) {
            String strA = ((u71) obj).a();
            Object arrayList = linkedHashMap.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strA, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc.e0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(kc.m.j(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((u71) it.next()).c());
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }
}
