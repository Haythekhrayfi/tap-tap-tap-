package com.yandex.metrica.impl.ob;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class O3 implements InterfaceC1620f0<Map<String, ? extends String>> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1620f0, uc.l
    public Boolean invoke(Object obj) {
        P0 p0I = P0.i();
        fd.j0.h(p0I, "GlobalServiceLocator.getInstance()");
        return Boolean.valueOf(p0I.e().b(new P3.a((Map) obj, E0.RETAIL)));
    }
}
