package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Ke implements InterfaceC1605ea<E0, Integer> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public E0 a(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return E0.APP;
        }
        if (iIntValue != 2) {
            return iIntValue != 3 ? E0.UNDEFINED : E0.SATELLITE;
        }
        return E0.RETAIL;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer b(E0 e10) {
        int iOrdinal = e10.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 2;
        }
        return 3;
    }
}
