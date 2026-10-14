package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2000u7 implements InterfaceC1605ea<C1677h7, Mf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A7 f17515a;

    public C2000u7() {
        this(new A7());
    }

    public C2000u7(A7 a10) {
        this.f17515a = a10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mf b(C1677h7 c1677h7) {
        Mf mfB = this.f17515a.b(c1677h7.f16265a);
        mfB.f14512h = 1;
        Mf.a aVar = new Mf.a();
        mfB.f14513i = aVar;
        aVar.f14517b = c1677h7.f16266b;
        return mfB;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1605ea
    public C1677h7 a(Mf mf) {
        throw new UnsupportedOperationException();
    }
}
