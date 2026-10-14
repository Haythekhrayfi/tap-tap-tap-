package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1774l5 extends AbstractC1675h5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M2 f16803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Dd f16804c;

    public C1774l5(Z3 z10, M2 m10, Dd dd2) {
        super(z10);
        this.f16803b = m10;
        this.f16804c = dd2;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1675h5
    public boolean a(C1744k0 c1744k0, H4 h10) {
        X3.a aVarA = h10.b().a();
        this.f16803b.a(aVarA.f15460l);
        Boolean bool = aVarA.f15453e;
        Boolean bool2 = aVarA.f15464p;
        Boolean bool3 = Boolean.TRUE;
        if (bool3.equals(bool) || (bool == null && bool3.equals(bool2))) {
            this.f16804c.a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            this.f16804c.a(false);
        }
        return false;
    }
}
