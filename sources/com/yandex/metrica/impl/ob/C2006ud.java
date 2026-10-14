package com.yandex.metrica.impl.ob;

import android.location.Location;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2006ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1732jd f17524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pc f17525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ad f17526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2110yc f17527d;

    public C2006ud(C2031vd c2031vd) {
        C2061wd c2061wd = new C2061wd(c2031vd.f17624a.f18015a);
        C2135zc c2135zc = c2031vd.f17624a;
        this(c2031vd, c2061wd, new Ad(c2135zc.f18015a, c2031vd.f17625b, c2031vd.f17626c, c2031vd.f17627d, c2031vd.f17628e, c2135zc.f18016b), new C2110yc(c2031vd.f17626c, c2031vd.f17627d, c2031vd.f17628e));
    }

    public C2006ud(C2031vd c2031vd, C1732jd c1732jd, Pc pc2, Ad ad2, C2110yc c2110yc) {
        this.f17524a = c1732jd;
        this.f17525b = pc2;
        this.f17526c = ad2;
        this.f17527d = c2110yc;
    }

    private C2006ud(C2031vd c2031vd, C2061wd c2061wd, Ad ad2, C2110yc c2110yc) {
        this(c2031vd, c2061wd, C1757kd.a(c2031vd, ad2, c2110yc, c2061wd.a()), ad2, c2110yc);
    }

    private C2006ud(C2031vd c2031vd, C2061wd c2061wd, C1757kd c1757kd, Ad ad2, C2110yc c2110yc) {
        this(c2031vd, c2061wd, c1757kd, new C2086xd(c2031vd.f17624a.f18015a, c2031vd.f17626c, ad2, c2110yc, c2031vd.f17625b.d()), ad2, c2110yc);
    }

    private C2006ud(C2031vd c2031vd, C2061wd c2061wd, C1757kd c1757kd, C2086xd c2086xd, Ad ad2, C2110yc c2110yc) {
        this(c2031vd, new C1732jd(c1757kd, c2086xd), new Pc(Qc.a(c2031vd, ad2, c2110yc, c2061wd.c(), c2061wd.b())), ad2, c2110yc);
    }

    public void a() {
        this.f17526c.a();
    }

    public void a(Qi qi) {
        this.f17526c.a(qi);
        this.f17524a.a(qi);
    }

    public void a(Uc uc2) {
        this.f17526c.a(uc2);
        this.f17527d.a(uc2);
        this.f17524a.a(uc2);
        this.f17525b.a(uc2);
    }

    public Location b() {
        return this.f17524a.b();
    }

    public void c() {
        this.f17524a.a();
        this.f17525b.b();
    }

    public void d() {
        this.f17524a.c();
        this.f17525b.d();
    }

    public void e() {
        this.f17524a.d();
        this.f17525b.e();
    }
}
