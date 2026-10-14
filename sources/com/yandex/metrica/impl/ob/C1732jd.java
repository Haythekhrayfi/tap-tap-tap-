package com.yandex.metrica.impl.ob;

import android.location.Location;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1732jd implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2086xd f16407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1757kd f16408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<C1807md<?>> f16409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Xc<Ec> f16410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Xc<Ec> f16411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Xc<Ec> f16412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Xc<Jc> f16413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final R0 f16414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f16415i;

    public C1732jd(C1757kd c1757kd, C2086xd c2086xd) {
        this(c1757kd, c2086xd, P0.i().u());
    }

    private C1732jd(C1757kd c1757kd, C2086xd c2086xd, I9 i10) {
        this(c1757kd, c2086xd, new Mc(c1757kd, i10), new Sc(c1757kd, i10), new C1981td(c1757kd), new Lc(c1757kd, i10, c2086xd), new R0.c());
    }

    public C1732jd(C1757kd c1757kd, C2086xd c2086xd, AbstractC2060wc abstractC2060wc, AbstractC2060wc abstractC2060wc2, C1981td c1981td, Lc lc2, R0.c cVar) {
        Ec ec2;
        Ec ec3;
        Ec ec4;
        this.f16408b = c1757kd;
        Uc uc2 = c1757kd.f16578c;
        Jc jc2 = null;
        if (uc2 != null) {
            this.f16415i = uc2.f15143g;
            Ec ec5 = uc2.f15150n;
            ec3 = uc2.f15151o;
            ec4 = uc2.f15152p;
            jc2 = uc2.f15153q;
            ec2 = ec5;
        } else {
            ec2 = null;
            ec3 = null;
            ec4 = null;
        }
        this.f16407a = c2086xd;
        C1807md<Ec> c1807mdA = abstractC2060wc.a(c2086xd, ec3);
        C1807md<Ec> c1807mdA2 = abstractC2060wc2.a(c2086xd, ec2);
        C1807md<Ec> c1807mdA3 = c1981td.a(c2086xd, ec4);
        C1807md<Jc> c1807mdA4 = lc2.a(jc2);
        this.f16409c = Arrays.asList(c1807mdA, c1807mdA2, c1807mdA3, c1807mdA4);
        this.f16410d = c1807mdA2;
        this.f16411e = c1807mdA;
        this.f16412f = c1807mdA3;
        this.f16413g = c1807mdA4;
        R0 r0A = cVar.a(this.f16408b.f16576a.f18016b, this, this.f16407a.b());
        this.f16414h = r0A;
        this.f16407a.b().a(r0A);
    }

    @Override // com.yandex.metrica.impl.ob.T0
    public void a() {
        if (this.f16415i) {
            Iterator<C1807md<?>> it = this.f16409c.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    public void a(Qi qi) {
        this.f16407a.a(qi);
    }

    public void a(Uc uc2) {
        this.f16415i = uc2 != null && uc2.f15143g;
        this.f16407a.a(uc2);
        ((C1807md) this.f16410d).a(uc2 == null ? null : uc2.f15150n);
        ((C1807md) this.f16411e).a(uc2 == null ? null : uc2.f15151o);
        ((C1807md) this.f16412f).a(uc2 == null ? null : uc2.f15152p);
        ((C1807md) this.f16413g).a(uc2 != null ? uc2.f15153q : null);
        a();
    }

    public Location b() {
        if (this.f16415i) {
            return this.f16407a.a();
        }
        return null;
    }

    public void c() {
        if (this.f16415i) {
            this.f16414h.a();
            Iterator<C1807md<?>> it = this.f16409c.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void d() {
        this.f16414h.c();
        Iterator<C1807md<?>> it = this.f16409c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }
}
