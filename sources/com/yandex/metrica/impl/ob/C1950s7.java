package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1950s7 implements InterfaceC1605ea<C1627f7, Jf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1925r7 f17281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1975t7 f17282b;

    public C1950s7() {
        this(new C1925r7(new D7()), new C1975t7());
    }

    public C1950s7(C1925r7 c1925r7, C1975t7 c1975t7) {
        this.f17281a = c1925r7;
        this.f17282b = c1975t7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Jf b(C1627f7 c1627f7) {
        Jf jf = new Jf();
        jf.f14319b = this.f17281a.b(c1627f7.f16121a);
        String str = c1627f7.f16122b;
        if (str != null) {
            jf.f14320c = str;
        }
        jf.f14321d = this.f17282b.a(c1627f7.f16123c);
        return jf;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1627f7 a(Jf jf) {
        throw new UnsupportedOperationException();
    }
}
