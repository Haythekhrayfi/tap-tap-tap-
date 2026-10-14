package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kb {
    public static HashSet a(List list) {
        List<j20> listA;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object objD = ((qa) it.next()).d();
            if (objD instanceof j20) {
                hashSet.add((j20) objD);
            }
            if ((objD instanceof vc0) && (listA = ((vc0) objD).a()) != null) {
                hashSet.addAll(listA);
            }
        }
        return hashSet;
    }
}
