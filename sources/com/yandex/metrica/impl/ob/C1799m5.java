package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1799m5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I8 f16876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lm f16877c;

    public C1799m5(C1624f4 c1624f4) {
        this(c1624f4, c1624f4.w(), Lm.c());
    }

    public C1799m5(C1624f4 c1624f4, I8 i10, Lm lm) {
        super(c1624f4);
        this.f16876b = i10;
        this.f16877c = lm;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        C1624f4 c1624f4A = a();
        if (this.f16876b.m() || this.f16876b.n()) {
            return false;
        }
        if (c1624f4A.m().Q()) {
            this.f16877c.b();
        }
        a().j().a();
        return false;
    }
}
