package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2008uf extends AbstractC1983tf<Double> {
    public C2008uf(String str, double d10) {
        super(2, str, Double.valueOf(d10), new C2063wf(), new C1958sf(new C2088xf(new Gn(100))));
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1983tf
    public void a(C1511ag.a aVar) {
        C1511ag.c cVar = aVar.f15754e;
        cVar.f15759d = f().doubleValue() + cVar.f15759d;
    }
}
