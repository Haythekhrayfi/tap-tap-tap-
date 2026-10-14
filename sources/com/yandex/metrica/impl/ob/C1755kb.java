package com.yandex.metrica.impl.ob;

import java.math.BigDecimal;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1755kb implements InterfaceC1605ea<BigDecimal, Rf.e> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rf.e b(BigDecimal bigDecimal) {
        jc.h hVarA = C1990tm.a(bigDecimal);
        C1965sm c1965sm = new C1965sm(((Number) hVarA.f31811c).longValue(), ((Number) hVarA.f31812d).intValue());
        Rf.e eVar = new Rf.e();
        eVar.f14888b = c1965sm.b();
        eVar.f14889c = c1965sm.a();
        return eVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public BigDecimal a(Rf.e eVar) {
        throw new UnsupportedOperationException();
    }
}
