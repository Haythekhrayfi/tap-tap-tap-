package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Y9 implements InterfaceC1605ea<C1862oi, C1760kg.a> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.a b(C1862oi c1862oi) {
        C1760kg.a.C0182a c0182a;
        C1760kg.a aVar = new C1760kg.a();
        aVar.f16606b = new C1760kg.a.b[c1862oi.f17022a.size()];
        for (int i10 = 0; i10 < c1862oi.f17022a.size(); i10++) {
            C1760kg.a.b bVar = new C1760kg.a.b();
            Pair<String, C1862oi.a> pair = c1862oi.f17022a.get(i10);
            bVar.f16609b = (String) pair.first;
            if (pair.second != null) {
                bVar.f16610c = new C1760kg.a.C0182a();
                C1862oi.a aVar2 = (C1862oi.a) pair.second;
                if (aVar2 == null) {
                    c0182a = null;
                } else {
                    C1760kg.a.C0182a c0182a2 = new C1760kg.a.C0182a();
                    c0182a2.f16607b = aVar2.f17023a;
                    c0182a = c0182a2;
                }
                bVar.f16610c = c0182a;
            }
            aVar.f16606b[i10] = bVar;
        }
        return aVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1862oi a(C1760kg.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C1760kg.a.b bVar : aVar.f16606b) {
            String str = bVar.f16609b;
            C1760kg.a.C0182a c0182a = bVar.f16610c;
            arrayList.add(new Pair(str, c0182a == null ? null : new C1862oi.a(c0182a.f16607b)));
        }
        return new C1862oi(arrayList);
    }
}
