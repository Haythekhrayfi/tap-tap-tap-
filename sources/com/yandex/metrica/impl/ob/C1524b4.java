package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1524b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1845o1 f15808a;

    public C1524b4() {
        this(P0.i().j());
    }

    public C1524b4(C1845o1 c1845o1) {
        this.f15808a = c1845o1;
    }

    public Q2<Z3> a(Z3 z10, Si si) {
        Q2<Z3> q10 = new Q2<>(z10, new Yi(si));
        this.f15808a.a(q10);
        return q10;
    }

    public C1700i5<AbstractC1675h5, Z3> a(Z3 z10) {
        return new C1700i5<>(new C1525b5(z10), z10);
    }
}
