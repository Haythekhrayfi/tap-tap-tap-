package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1928ra implements Object<Uc, C1760kg.k.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1804ma f17237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1854oa f17238b;

    public C1928ra() {
        this(new C1804ma(), new C1854oa());
    }

    public C1928ra(C1804ma c1804ma, C1854oa c1854oa) {
        this.f17237a = c1804ma;
        this.f17238b = c1854oa;
    }

    public Uc a(C1760kg.k.a aVar) {
        C1760kg.k.a.C0183a c0183a = aVar.f16670l;
        Ec ecA = c0183a != null ? this.f17237a.a(c0183a) : null;
        C1760kg.k.a.C0183a c0183a2 = aVar.f16671m;
        Ec ecA2 = c0183a2 != null ? this.f17237a.a(c0183a2) : null;
        C1760kg.k.a.C0183a c0183a3 = aVar.f16672n;
        Ec ecA3 = c0183a3 != null ? this.f17237a.a(c0183a3) : null;
        C1760kg.k.a.C0183a c0183a4 = aVar.f16673o;
        Ec ecA4 = c0183a4 != null ? this.f17237a.a(c0183a4) : null;
        C1760kg.k.a.b bVar = aVar.f16674p;
        return new Uc(aVar.f16660b, aVar.f16661c, aVar.f16662d, aVar.f16663e, aVar.f16664f, aVar.f16665g, aVar.f16666h, aVar.f16669k, aVar.f16667i, aVar.f16668j, aVar.f16675q, aVar.f16676r, ecA, ecA2, ecA3, ecA4, bVar != null ? this.f17238b.a(bVar) : null);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1760kg.k.a b(Uc uc2) {
        C1760kg.k.a aVar = new C1760kg.k.a();
        aVar.f16660b = uc2.f15137a;
        aVar.f16661c = uc2.f15138b;
        aVar.f16662d = uc2.f15139c;
        aVar.f16663e = uc2.f15140d;
        aVar.f16664f = uc2.f15141e;
        aVar.f16665g = uc2.f15142f;
        aVar.f16666h = uc2.f15143g;
        aVar.f16669k = uc2.f15144h;
        aVar.f16667i = uc2.f15145i;
        aVar.f16668j = uc2.f15146j;
        aVar.f16675q = uc2.f15147k;
        aVar.f16676r = uc2.f15148l;
        Ec ec2 = uc2.f15149m;
        if (ec2 != null) {
            aVar.f16670l = this.f17237a.b(ec2);
        }
        Ec ec3 = uc2.f15150n;
        if (ec3 != null) {
            aVar.f16671m = this.f17237a.b(ec3);
        }
        Ec ec4 = uc2.f15151o;
        if (ec4 != null) {
            aVar.f16672n = this.f17237a.b(ec4);
        }
        Ec ec5 = uc2.f15152p;
        if (ec5 != null) {
            aVar.f16673o = this.f17237a.b(ec5);
        }
        Jc jc2 = uc2.f15153q;
        if (jc2 != null) {
            aVar.f16674p = this.f17238b.b(jc2);
        }
        return aVar;
    }
}
