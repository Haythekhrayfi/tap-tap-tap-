package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<qa> f23559a;

    /* JADX WARN: Multi-variable type inference failed */
    public nv0(List<? extends qa> list) {
        fd.j0.i(list, "assets");
        this.f23559a = list;
    }

    public final ArrayList a(com.yandex.mobile.ads.nativeads.w wVar) {
        fd.j0.i(wVar, "viewAdapter");
        List<qa> list = this.f23559a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ra raVarA = wVar.a((qa) obj);
            if (raVarA != null ? raVarA.b() : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kc.m.j(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qa) it.next()).b());
        }
        return arrayList2;
    }
}
