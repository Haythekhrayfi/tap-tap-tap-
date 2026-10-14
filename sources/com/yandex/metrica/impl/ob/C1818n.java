package com.yandex.metrica.impl.ob;

import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1818n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1818n f16904a = new C1818n();

    private C1818n() {
    }

    public static void a(C1818n c1818n, Map map, Map map2, String str, InterfaceC1942s interfaceC1942s, ca.c cVar, int i10) {
        ca.c cVar2 = (i10 & 16) != 0 ? new ca.c() : null;
        fd.j0.i(map, "history");
        fd.j0.i(map2, "newBillingInfo");
        fd.j0.i(str, "type");
        fd.j0.i(interfaceC1942s, "billingInfoManager");
        fd.j0.i(cVar2, "systemTimeProvider");
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (ca.a aVar : map.values()) {
            if (map2.containsKey(aVar.f3652b)) {
                aVar.f3655e = jCurrentTimeMillis;
            } else {
                ca.a aVarA = interfaceC1942s.a(aVar.f3652b);
                if (aVarA != null) {
                    aVar.f3655e = aVarA.f3655e;
                }
            }
        }
        interfaceC1942s.a((Map<String, ca.a>) map);
        if (interfaceC1942s.a() || !fd.j0.d("inapp", str)) {
            return;
        }
        interfaceC1942s.b();
    }
}
