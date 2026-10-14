package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1656gb implements InterfaceC1605ea<C2109yb, C1979tb<Rf.a, Fn>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1755kb f16201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Un f16202b;

    public C1656gb() {
        this(new C1755kb(), new Un(20));
    }

    public C1656gb(C1755kb c1755kb, Un un) {
        this.f16201a = c1755kb;
        this.f16202b = un;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1979tb<Rf.a, Fn> b(C2109yb c2109yb) {
        Rf.a aVar = new Rf.a();
        aVar.f14881c = this.f16201a.b(c2109yb.f17901a);
        Qn<String, Fn> qnA = this.f16202b.a(c2109yb.f17902b);
        aVar.f14880b = O2.c(qnA.f14828a);
        return new C1979tb<>(aVar, En.a(qnA));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C2109yb a(C1979tb<Rf.a, Fn> c1979tb) {
        throw new UnsupportedOperationException();
    }
}
