package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f19816a;

    public db(List<qa<?>> list) {
        this.f19816a = a(list);
    }

    private static HashMap a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qa qaVar = (qa) it.next();
            map.put(qaVar.b(), qaVar.d());
        }
        return map;
    }

    public final vc0 a() {
        Object obj = this.f19816a.get("media");
        if (obj instanceof vc0) {
            return (vc0) obj;
        }
        return null;
    }
}
