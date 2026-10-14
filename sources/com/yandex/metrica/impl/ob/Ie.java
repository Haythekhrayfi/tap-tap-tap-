package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public final class Ie extends D0<Le> {
    @Override // com.yandex.metrica.impl.ob.D0
    public boolean a(Le le2, Le le3) {
        Le le4 = le2;
        Le le5 = le3;
        if (le4.f14407c) {
            if (le5.f14407c) {
                int iIntValue = a().a(le4.f14409e).intValue();
                Integer numA = a().a(le5.f14409e);
                fd.j0.h(numA, "priorities[oldData.source]");
                if (fd.j0.k(iIntValue, numA.intValue()) > 0) {
                }
            }
            return true;
        }
        return false;
    }
}
