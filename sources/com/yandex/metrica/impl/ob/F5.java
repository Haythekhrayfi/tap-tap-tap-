package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class F5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1650g5<AbstractC1948s5, C1624f4> f13963b;

    public F5(C1624f4 c1624f4) {
        super(c1624f4);
        this.f13963b = new C1650g5<>(new C1600e5(c1624f4), c1624f4);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        return this.f13963b.a(c1744k0);
    }
}
