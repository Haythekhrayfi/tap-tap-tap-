package com.yandex.metrica.impl.ob;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Ha implements InterfaceC1605ea<Vi, C1760kg.s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final EnumMap<Vi.b, String> f14137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Vi.b> f14138b;

    static {
        EnumMap<Vi.b, String> enumMap = new EnumMap<>(Vi.b.class);
        f14137a = enumMap;
        HashMap map = new HashMap();
        f14138b = map;
        Vi.b bVar = Vi.b.WIFI;
        enumMap.put(bVar, "wifi");
        Vi.b bVar2 = Vi.b.CELL;
        enumMap.put(bVar2, "cell");
        map.put("wifi", bVar);
        map.put("cell", bVar2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Vi a(C1760kg.s sVar) {
        C1760kg.t tVar = sVar.f16721b;
        Vi.a aVar = tVar != null ? new Vi.a(tVar.f16723b, tVar.f16724c) : null;
        C1760kg.t tVar2 = sVar.f16722c;
        return new Vi(aVar, tVar2 != null ? new Vi.a(tVar2.f16723b, tVar2.f16724c) : null);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.s b(Vi vi) {
        C1760kg.s sVar = new C1760kg.s();
        if (vi.f15319a != null) {
            C1760kg.t tVar = new C1760kg.t();
            sVar.f16721b = tVar;
            Vi.a aVar = vi.f15319a;
            tVar.f16723b = aVar.f15321a;
            tVar.f16724c = aVar.f15322b;
        }
        if (vi.f15320b != null) {
            C1760kg.t tVar2 = new C1760kg.t();
            sVar.f16722c = tVar2;
            Vi.a aVar2 = vi.f15320b;
            tVar2.f16723b = aVar2.f15321a;
            tVar2.f16724c = aVar2.f15322b;
        }
        return sVar;
    }
}
