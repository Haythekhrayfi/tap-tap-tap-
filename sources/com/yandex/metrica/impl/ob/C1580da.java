package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1580da implements InterfaceC1605ea<P3, C1586dg> {
    /* JADX WARN: Code duplicated, block: B:18:0x0021  */
    private final P3.a a(C1586dg.a aVar) {
        E0 e10;
        C1586dg.b bVar = aVar.f15950b;
        Map<String, String> mapA = bVar != null ? a(bVar) : null;
        int i10 = aVar.f15951c;
        if (i10 == 0) {
            e10 = E0.UNDEFINED;
        } else if (i10 == 1) {
            e10 = E0.APP;
        } else if (i10 == 2) {
            e10 = E0.SATELLITE;
        } else if (i10 != 3) {
            e10 = E0.UNDEFINED;
        } else {
            e10 = E0.RETAIL;
        }
        return new P3.a(mapA, e10);
    }

    private final C1586dg.a a(P3.a aVar) {
        C1586dg.b bVar;
        C1586dg.a aVar2 = new C1586dg.a();
        Map<String, String> mapB = aVar.b();
        int i10 = 0;
        if (mapB != null) {
            bVar = new C1586dg.b();
            int size = mapB.size();
            C1586dg.b.a[] aVarArr = new C1586dg.b.a[size];
            for (int i11 = 0; i11 < size; i11++) {
                aVarArr[i11] = new C1586dg.b.a();
            }
            bVar.f15952b = aVarArr;
            int i12 = 0;
            for (Map.Entry<String, String> entry : mapB.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                C1586dg.b.a[] aVarArr2 = bVar.f15952b;
                aVarArr2[i12].f15954b = key;
                aVarArr2[i12].f15955c = value;
                i12++;
            }
        } else {
            bVar = null;
        }
        aVar2.f15950b = bVar;
        int iOrdinal = aVar.a().ordinal();
        if (iOrdinal == 1) {
            i10 = 1;
        } else if (iOrdinal == 2) {
            i10 = 2;
        } else if (iOrdinal == 3) {
            i10 = 3;
        }
        aVar2.f15951c = i10;
        return aVar2;
    }

    private final Map<String, String> a(C1586dg.b bVar) {
        C1586dg.b.a[] aVarArr = bVar.f15952b;
        fd.j0.h(aVarArr, "proto.pairs");
        int iA = kc.e0.a(aVarArr.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (C1586dg.b.a aVar : aVarArr) {
            jc.h hVar = new jc.h(aVar.f15954b, aVar.f15955c);
            linkedHashMap.put(hVar.f31811c, hVar.f31812d);
        }
        return linkedHashMap;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public P3 a(C1586dg c1586dg) {
        C1586dg c1586dg2 = c1586dg;
        C1586dg.a aVar = c1586dg2.f15947b;
        if (aVar == null) {
            aVar = new C1586dg.a();
        }
        P3.a aVarA = a(aVar);
        C1586dg.a[] aVarArr = c1586dg2.f15948c;
        fd.j0.h(aVarArr, "nano.candidates");
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C1586dg.a aVar2 : aVarArr) {
            fd.j0.h(aVar2, "it");
            arrayList.add(a(aVar2));
        }
        return new P3(aVarA, arrayList);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1586dg b(P3 p10) {
        P3 p11 = p10;
        C1586dg c1586dg = new C1586dg();
        c1586dg.f15947b = a(p11.c());
        int size = p11.a().size();
        C1586dg.a[] aVarArr = new C1586dg.a[size];
        for (int i10 = 0; i10 < size; i10++) {
            aVarArr[i10] = a(p11.a().get(i10));
        }
        c1586dg.f15948c = aVarArr;
        return c1586dg;
    }
}
