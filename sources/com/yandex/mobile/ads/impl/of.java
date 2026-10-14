package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class of {
    public static ArrayList a(com.yandex.mobile.ads.nativeads.w wVar) {
        fd.j0.i(wVar, "viewAdapter");
        Map<String, ra<?>> mapC = wVar.c();
        fd.j0.h(mapC, "viewAdapter.assetAdapters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((HashMap) mapC).entrySet()) {
            ra raVar = (ra) entry.getValue();
            if (raVar != null ? raVar.b() : false) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }
}
