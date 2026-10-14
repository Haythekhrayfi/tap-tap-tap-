package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Ef extends AbstractC1983tf<String> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Pn<String> f13907g;

    public Ef(String str, String str2, Pn<String> pn, uo<String> uoVar, AbstractC1909qf abstractC1909qf) {
        super(0, str, str2, uoVar, abstractC1909qf);
        this.f13907g = pn;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1983tf
    public void a(C1511ag.a aVar) {
        String strA = this.f13907g.a(f());
        aVar.f15754e.f15757b = strA == null ? new byte[0] : strA.getBytes();
    }
}
