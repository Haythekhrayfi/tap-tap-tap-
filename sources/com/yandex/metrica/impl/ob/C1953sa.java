package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1953sa implements Object<Wc, C1760kg.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1928ra f17291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1978ta f17292b;

    public C1953sa() {
        this(new C1928ra(), new C1978ta());
    }

    public C1953sa(C1928ra c1928ra, C1978ta c1978ta) {
        this.f17291a = c1928ra;
        this.f17292b = c1978ta;
    }

    public Wc a(C1760kg.k kVar) {
        C1928ra c1928ra = this.f17291a;
        C1760kg.k.a aVar = kVar.f16658b;
        C1760kg.k.a aVar2 = new C1760kg.k.a();
        if (aVar == null) {
            aVar = aVar2;
        }
        Uc ucA = c1928ra.a(aVar);
        C1978ta c1978ta = this.f17292b;
        C1760kg.k.b bVar = kVar.f16659c;
        C1760kg.k.b bVar2 = new C1760kg.k.b();
        if (bVar == null) {
            bVar = bVar2;
        }
        return new Wc(ucA, c1978ta.a(bVar));
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.k b(Wc wc2) {
        C1760kg.k kVar = new C1760kg.k();
        kVar.f16658b = this.f17291a.b(wc2.f15381a);
        kVar.f16659c = this.f17292b.b(wc2.f15382b);
        return kVar;
    }
}
