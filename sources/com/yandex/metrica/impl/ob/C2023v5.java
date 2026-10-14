package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2023v5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I8 f17594b;

    public C2023v5(C1624f4 c1624f4) {
        this(c1624f4, c1624f4.w());
    }

    public C2023v5(C1624f4 c1624f4, I8 i10) {
        super(c1624f4);
        this.f17594b = i10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        C1624f4 c1624f4A = a();
        if (this.f17594b.m()) {
            return false;
        }
        if (!this.f17594b.n()) {
            c1624f4A.r().a(C1744k0.b(c1744k0));
        }
        this.f17594b.a(true);
        return false;
    }
}
