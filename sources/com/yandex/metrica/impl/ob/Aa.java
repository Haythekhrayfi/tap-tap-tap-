package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class Aa implements InterfaceC1605ea<C1970t2, C1710ig> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1970t2 a(C1710ig c1710ig) {
        HashMap map;
        C1710ig c1710ig2 = c1710ig;
        C1710ig.a aVar = c1710ig2.f16347b;
        if (aVar == null) {
            map = null;
        } else {
            HashMap map2 = new HashMap();
            for (C1710ig.a.C0181a c0181a : aVar.f16349b) {
                map2.put(c0181a.f16351b, c0181a.f16352c);
            }
            map = map2;
        }
        return new C1970t2(map, c1710ig2.f16348c);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1710ig b(C1970t2 c1970t2) {
        C1710ig.a aVar;
        C1970t2 c1970t3 = c1970t2;
        C1710ig c1710ig = new C1710ig();
        Map<String, String> map = c1970t3.f17420a;
        if (map == null) {
            aVar = null;
        } else {
            C1710ig.a aVar2 = new C1710ig.a();
            aVar2.f16349b = new C1710ig.a.C0181a[map.size()];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C1710ig.a.C0181a c0181a = new C1710ig.a.C0181a();
                c0181a.f16351b = entry.getKey();
                c0181a.f16352c = entry.getValue();
                aVar2.f16349b[i10] = c0181a;
                i10++;
            }
            aVar = aVar2;
        }
        c1710ig.f16347b = aVar;
        c1710ig.f16348c = c1970t3.f17421b;
        return c1710ig;
    }
}
