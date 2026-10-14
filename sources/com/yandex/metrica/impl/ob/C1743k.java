package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1743k implements InterfaceC2017v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ca.c f16510a;

    public C1743k() {
        this(new ca.c());
    }

    public C1743k(ca.c cVar) {
        this.f16510a = cVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2017v
    public Map<String, ca.a> a(C1868p c1868p, Map<String, ca.a> map, InterfaceC1942s interfaceC1942s) {
        ca.a aVarA;
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            ca.a aVar = map.get(str);
            Objects.requireNonNull(this.f16510a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.f3651a != com.yandex.metrica.billing_interface.c.INAPP || interfaceC1942s.a() ? !((aVarA = interfaceC1942s.a(aVar.f3652b)) != null && aVarA.f3653c.equals(aVar.f3653c) && (aVar.f3651a != com.yandex.metrica.billing_interface.c.SUBS || jCurrentTimeMillis - aVarA.f3655e < TimeUnit.SECONDS.toMillis((long) c1868p.f17026a))) : jCurrentTimeMillis - aVar.f3654d <= TimeUnit.SECONDS.toMillis((long) c1868p.f17027b)) {
                map2.put(str, aVar);
            }
        }
        return map2;
    }
}
