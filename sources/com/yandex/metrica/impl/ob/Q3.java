package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public final class Q3 extends D0<P3.a> {
    @Override // com.yandex.metrica.impl.ob.D0
    public boolean a(P3.a aVar, P3.a aVar2) {
        if (!U2.b(aVar2.b())) {
            if (U2.b(aVar.b())) {
                return false;
            }
            if (aVar.a() == E0.APP) {
                int iIntValue = a().a(aVar.a()).intValue();
                Integer numA = a().a(aVar2.a());
                fd.j0.h(numA, "priorities[oldData.source]");
                if (fd.j0.k(iIntValue, numA.intValue()) < 0) {
                    return false;
                }
            } else {
                int iIntValue2 = a().a(aVar.a()).intValue();
                Integer numA2 = a().a(aVar2.a());
                fd.j0.h(numA2, "priorities[oldData.source]");
                if (fd.j0.k(iIntValue2, numA2.intValue()) <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
