package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sl f25391a = new sl();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map a(tl tlVar, nl nlVar) {
        fd.j0.i(tlVar, "this$0");
        fd.j0.i(nlVar, "$creative");
        Objects.requireNonNull(tlVar.f25391a);
        ql qlVarA = sl.a(nlVar);
        List<u71> listC = qlVarA != null ? qlVarA.c() : null;
        if (listC == null) {
            listC = kc.w.f32009c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listC) {
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

    public final bg1 a(nl nlVar) {
        fd.j0.i(nlVar, "creative");
        return new com.applovin.exoplayer2.a.e(this, nlVar);
    }
}
