package com.yandex.metrica.impl.ob;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1843o implements InterfaceC2017v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ca.c f16964a;

    public C1843o(ca.c cVar) {
        fd.j0.i(cVar, "systemTimeProvider");
        this.f16964a = cVar;
    }

    public /* synthetic */ C1843o(ca.c cVar, int i10) {
        this((i10 & 1) != 0 ? new ca.c() : null);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2017v
    public Map<String, ca.a> a(C1868p c1868p, Map<String, ? extends ca.a> map, InterfaceC1942s interfaceC1942s) {
        ca.a aVarA;
        fd.j0.i(c1868p, "config");
        fd.j0.i(map, "history");
        fd.j0.i(interfaceC1942s, "storage");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends ca.a> entry : map.entrySet()) {
            ca.a value = entry.getValue();
            Objects.requireNonNull(this.f16964a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z10 = true;
            if (value.f3651a != com.yandex.metrica.billing_interface.c.INAPP || interfaceC1942s.a() ? !((aVarA = interfaceC1942s.a(value.f3652b)) == null || (!fd.j0.d(aVarA.f3653c, value.f3653c)) || (value.f3651a == com.yandex.metrica.billing_interface.c.SUBS && jCurrentTimeMillis - aVarA.f3655e >= TimeUnit.SECONDS.toMillis(c1868p.f17026a))) : jCurrentTimeMillis - value.f3654d > TimeUnit.SECONDS.toMillis(c1868p.f17027b)) {
                z10 = false;
            }
            if (z10) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
