package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2078x5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I8 f17833b;

    public C2078x5(C1624f4 c1624f4) {
        super(c1624f4);
        this.f17833b = c1624f4.w();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        C1624f4 c1624f4A = a();
        c1624f4A.e().toString();
        if (!this.f17833b.m() || !c1624f4A.A()) {
            return false;
        }
        c1624f4A.r().d(C1744k0.a(c1744k0, c1624f4A));
        return false;
    }
}
