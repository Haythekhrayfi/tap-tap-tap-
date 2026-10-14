package com.yandex.metrica.impl.ob;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1630fa implements InterfaceC1605ea<Map<String, ? extends List<? extends String>>, C1760kg.d[]> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public Map<String, List<String>> a(C1760kg.d[] dVarArr) {
        int iA = kc.e0.a(dVarArr.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (C1760kg.d dVar : dVarArr) {
            String str = dVar.f16618b;
            String[] strArr = dVar.f16619c;
            fd.j0.h(strArr, "it.hosts");
            jc.h hVar = new jc.h(str, kc.j.B(strArr));
            linkedHashMap.put(hVar.f31811c, hVar.f31812d);
        }
        return linkedHashMap;
    }

    public C1760kg.d[] a(Map<String, ? extends List<String>> map) {
        int size = map.size();
        C1760kg.d[] dVarArr = new C1760kg.d[size];
        for (int i10 = 0; i10 < size; i10++) {
            dVarArr[i10] = new C1760kg.d();
        }
        int i11 = 0;
        for (Object obj : map.entrySet()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                kc.l.i();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            dVarArr[i11].f16618b = (String) entry.getKey();
            C1760kg.d dVar = dVarArr[i11];
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            dVar.f16619c = (String[]) array;
            i11 = i12;
        }
        return dVarArr;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public /* bridge */ /* synthetic */ C1760kg.d[] b(Map<String, ? extends List<? extends String>> map) {
        return a((Map<String, ? extends List<String>>) map);
    }
}
