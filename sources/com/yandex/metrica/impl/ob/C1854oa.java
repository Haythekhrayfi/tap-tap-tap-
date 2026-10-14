package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1854oa implements Object<Jc, C1760kg.k.a.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1829na f17000a;

    public C1854oa() {
        this(new C1829na());
    }

    public C1854oa(C1829na c1829na) {
        this.f17000a = c1829na;
    }

    public Jc a(C1760kg.k.a.b bVar) {
        C1760kg.k.a.b.C0185a c0185a = bVar.f16684d;
        return new Jc(new C2111yd(bVar.f16682b, bVar.f16683c), c0185a != null ? this.f17000a.a(c0185a) : null);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.k.a.b b(Jc jc2) {
        C1760kg.k.a.b bVar = new C1760kg.k.a.b();
        C2111yd c2111yd = jc2.f14316a;
        bVar.f16682b = c2111yd.f17906a;
        bVar.f16683c = c2111yd.f17907b;
        Hc hc2 = jc2.f14317b;
        if (hc2 != null) {
            bVar.f16684d = this.f17000a.b(hc2);
        }
        return bVar;
    }
}
