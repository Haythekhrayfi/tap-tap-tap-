package com.yandex.metrica.impl.ob;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1525b5 extends AbstractC1625f5<AbstractC1675h5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O5 f15809a;

    public C1525b5(Z3 z10) {
        this.f15809a = new O5(z10);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1625f5
    public C1550c5<AbstractC1675h5> a(int i10) {
        AbstractC1675h5 abstractC1675h5A;
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC1745k1.a(i10).ordinal();
        if (iOrdinal == 16) {
            abstractC1675h5A = this.f15809a.a();
        } else {
            if (iOrdinal != 24) {
                if (iOrdinal == 46) {
                    abstractC1675h5A = this.f15809a.c();
                }
                return new C1550c5<>(arrayList);
            }
            abstractC1675h5A = this.f15809a.b();
        }
        arrayList.add(abstractC1675h5A);
        return new C1550c5<>(arrayList);
    }
}
