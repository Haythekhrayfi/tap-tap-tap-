package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f26405a;

    public x1(List<w50> list) {
        this.f26405a = a(list);
    }

    private static HashMap a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.put((w50) it.next(), w1.f26124a);
        }
        return map;
    }

    public final w1 a(w50 w50Var) {
        w1 w1Var = (w1) this.f26405a.get(w50Var);
        return w1Var != null ? w1Var : w1.f26128e;
    }

    public final void a(w50 w50Var, w1 w1Var) {
        if (w1Var == w1.f26125b) {
            for (w50 w50Var2 : this.f26405a.keySet()) {
                w1 w1Var2 = (w1) this.f26405a.get(w50Var2);
                if (w1.f26125b.equals(w1Var2) || w1.f26126c.equals(w1Var2)) {
                    this.f26405a.put(w50Var2, w1.f26124a);
                }
            }
        }
        this.f26405a.put(w50Var, w1Var);
    }

    public final boolean a() {
        for (w1 w1Var : this.f26405a.values()) {
            if (w1Var == w1.f26130g || w1Var == w1.f26131h) {
                return true;
            }
        }
        return false;
    }
}
