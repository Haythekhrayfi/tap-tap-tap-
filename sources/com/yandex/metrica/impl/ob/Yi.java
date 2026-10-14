package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Yi implements Zi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Si f15600a;

    public Yi(Si si) {
        this.f15600a = si;
    }

    @Override // com.yandex.metrica.impl.ob.Zi
    public void a() {
        K2 k2B;
        R1 r1L = P0.i().l();
        if (r1L == null || (k2B = this.f15600a.b()) == null) {
            return;
        }
        r1L.b(k2B);
    }
}
