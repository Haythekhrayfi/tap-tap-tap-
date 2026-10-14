package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class Jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Object> f14325a;

    public Jk(List<Object> list) {
        this.f14325a = list;
    }

    public Wl.b a(String str) {
        Iterator<Object> it = this.f14325a.iterator();
        while (it.hasNext()) {
            InterfaceC1692hm interfaceC1692hm = (InterfaceC1692hm) it.next();
            if (interfaceC1692hm.a(str)) {
                return interfaceC1692hm.a();
            }
        }
        return null;
    }
}
