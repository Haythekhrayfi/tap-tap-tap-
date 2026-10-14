package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2088xf implements InterfaceC1884pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gn f17849a;

    public C2088xf(Gn gn) {
        this.f17849a = gn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1884pf
    public C1511ag.a a(Gf gf, C1511ag.a aVar) {
        if (gf.a() == this.f17849a.a()) {
            if (gf.a(aVar.f15752c, new String(aVar.f15751b)) != null) {
                gf.a(aVar);
            }
        } else if (gf.a() < this.f17849a.a()) {
            gf.a(aVar);
            gf.b();
        }
        return aVar;
    }
}
