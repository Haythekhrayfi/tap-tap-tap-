package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Ka implements InterfaceC1605ea<C1542bm, C1760kg.v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ia f14347a;

    public Ka() {
        this(new Ia());
    }

    public Ka(Ia ia2) {
        this.f14347a = ia2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1542bm a(C1760kg.v vVar) {
        return new C1542bm(vVar.f16741b, vVar.f16742c, vVar.f16743d, vVar.f16744e, vVar.f16745f, vVar.f16746g, vVar.f16747h, this.f14347a.a(vVar.f16748i));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.v b(C1542bm c1542bm) {
        C1760kg.v vVar = new C1760kg.v();
        vVar.f16741b = c1542bm.f15846a;
        vVar.f16742c = c1542bm.f15847b;
        vVar.f16743d = c1542bm.f15848c;
        vVar.f16744e = c1542bm.f15849d;
        vVar.f16745f = c1542bm.f15850e;
        vVar.f16746g = c1542bm.f15851f;
        vVar.f16747h = c1542bm.f15852g;
        vVar.f16748i = this.f14347a.b(c1542bm.f15853h);
        return vVar;
    }
}
