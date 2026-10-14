package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1583dd f13810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2118yk f13811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1523b3 f13812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Yc f13813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I9 f13814e;

    public Dd(C1583dd c1583dd, C1523b3 c1523b3, I9 i10) {
        this(c1583dd, P0.i().w(), c1523b3, i10, P0.i().k());
    }

    public Dd(C1583dd c1583dd, C2118yk c2118yk, C1523b3 c1523b3, I9 i10, Yc yc2) {
        this.f13810a = c1583dd;
        this.f13811b = c2118yk;
        this.f13812c = c1523b3;
        this.f13814e = i10;
        this.f13813d = yc2;
        yc2.a(c2118yk);
        a();
    }

    private void a() {
        boolean zF = this.f13814e.f();
        this.f13810a.a(zF);
        this.f13812c.a(zF);
        this.f13811b.a(zF);
        this.f13813d.c();
    }

    public void a(Qi qi) {
        this.f13813d.a(qi);
        this.f13812c.a(qi);
        this.f13811b.a(qi);
    }

    public void a(Object obj) {
        this.f13810a.a(obj);
        this.f13811b.a();
    }

    public void a(boolean z10) {
        this.f13810a.a(z10);
        this.f13811b.a(z10);
        this.f13812c.a(z10);
        this.f13814e.d(z10);
    }

    public void b(Object obj) {
        this.f13810a.b(obj);
        this.f13811b.b();
    }
}
