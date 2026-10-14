package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1996u3 implements InterfaceC1605ea<ca.a, C1561cg.a> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public ca.a a(C1561cg.a aVar) {
        com.yandex.metrica.billing_interface.c cVar;
        int i10 = aVar.f15882b;
        if (i10 != 2) {
            cVar = i10 != 3 ? com.yandex.metrica.billing_interface.c.UNKNOWN : com.yandex.metrica.billing_interface.c.SUBS;
        } else {
            cVar = com.yandex.metrica.billing_interface.c.INAPP;
        }
        return new ca.a(cVar, aVar.f15883c, aVar.f15884d, aVar.f15885e, aVar.f15886f);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1561cg.a b(ca.a aVar) {
        C1561cg.a aVar2 = new C1561cg.a();
        int iOrdinal = aVar.f3651a.ordinal();
        int i10 = 1;
        if (iOrdinal == 0) {
            i10 = 2;
        } else if (iOrdinal == 1) {
            i10 = 3;
        }
        aVar2.f15882b = i10;
        aVar2.f15883c = aVar.f3652b;
        aVar2.f15884d = aVar.f3653c;
        aVar2.f15885e = aVar.f3654d;
        aVar2.f15886f = aVar.f3655e;
        return aVar2;
    }
}
