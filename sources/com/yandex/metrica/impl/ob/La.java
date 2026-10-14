package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class La {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1593dn f14389a;

    public La(C1593dn c1593dn) {
        this.f14389a = c1593dn;
    }

    public P9<C1536bg> a() {
        return new N9(new K9(), new C1618en("AES/CBC/PKCS5Padding", this.f14389a.b(), this.f14389a.a()));
    }

    public P9<C1561cg> b() {
        return new N9(new C1971t3(), new C1618en("AES/CBC/PKCS5Padding", this.f14389a.b(), this.f14389a.a()));
    }

    public P9<C1586dg> c() {
        return new N9(new M9(), new C1618en("AES/CBC/PKCS5Padding", this.f14389a.b(), this.f14389a.a()));
    }

    public P9<C1636fg> d() {
        return new N9(new O9(), new C1618en("AES/CBC/PKCS5Padding", this.f14389a.b(), this.f14389a.a()));
    }

    public P9<C1661gg> e() {
        return new N9(new Ge(), new C1618en("AES/CBC/PKCS5Padding", this.f14389a.b(), this.f14389a.a()));
    }

    @Deprecated
    public P9<C1661gg.a> f() {
        return new N9(new Oe(), new C1618en("AES/CBC/PKCS5Padding", this.f14389a.b(), this.f14389a.a()));
    }

    public P9<C1686hg> g() {
        return new N9(new R9(), new C1618en("AES/CBC/PKCS5Padding", this.f14389a.b(), this.f14389a.a()));
    }

    public P9<C1735jg> h() {
        return new N9(new T9(), new C1618en("AES/CBC/PKCS5Padding", this.f14389a.b(), this.f14389a.a()));
    }

    public P9<C1760kg> i() {
        return new N9(new U9(), new C1618en("AES/CBC/PKCS5Padding", this.f14389a.b(), this.f14389a.a()));
    }
}
