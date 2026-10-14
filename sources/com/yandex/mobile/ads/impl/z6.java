package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z6 {
    public static String a(List list) {
        Object next;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((u3) next).a() == v3.f25798a));
        u3 u3Var = (u3) next;
        if (u3Var == null) {
            return null;
        }
        Map<String, Object> mapB = u3Var.b();
        fd.j0.h(mapB, "adapterLoadingPhase.reportParameters");
        Object obj = mapB.get("adapter_loading_duration");
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
