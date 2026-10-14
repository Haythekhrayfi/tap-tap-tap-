package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L3 implements T2<P3.a, P3.a> {
    @Override // com.yandex.metrica.impl.ob.T2, uc.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<P3.a> invoke(List<P3.a> list, P3.a aVar) {
        boolean z10;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (((P3.a) it.next()).a() == aVar.a()) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (!z10) {
            return kc.t.A(list, aVar);
        }
        if (aVar.a() != E0.APP) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((P3.a) obj).a() == E0.APP)) {
                arrayList.add(obj);
            }
        }
        return kc.t.A(arrayList, aVar);
    }
}
