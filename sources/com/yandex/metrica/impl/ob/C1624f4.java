package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1624f4 implements InterfaceC1798m4, InterfaceC1723j4, Wb, C1736jh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1549c4 f16096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G9 f16097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I9 f16098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E9 f16099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1796m2 f16100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1976t8 f16101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1650g5 f16102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1575d5 f16103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final A f16104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final V3 f16105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C2024v6 f16106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1972t4 f16107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1651g6 f16108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Im f16109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C2095xm f16110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1997u4 f16111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1599e4.b f16112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Vb f16113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Sb f16114t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Xb f16115u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final P f16116v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final R2 f16117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final C1547c2 f16118x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final I8 f16119y;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f4$a */
    public class a implements C2024v6.a {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C2024v6.a
        public void a(C1744k0 c1744k0, C2054w6 c2054w6) {
            C1624f4.this.f16111q.a(c1744k0, c2054w6);
        }
    }

    public C1624f4(Context context, C1549c4 c1549c4, V3 v10, R2 r10, C1649g4 c1649g4) {
        this.f16095a = context.getApplicationContext();
        this.f16096b = c1549c4;
        this.f16105k = v10;
        this.f16117w = r10;
        I8 i8D = c1649g4.d();
        this.f16119y = i8D;
        this.f16118x = P0.i().m();
        C1972t4 c1972t4A = c1649g4.a(this);
        this.f16107m = c1972t4A;
        Im imB = c1649g4.b().b();
        this.f16109o = imB;
        C2095xm c2095xmA = c1649g4.b().a();
        this.f16110p = c2095xmA;
        G9 g9A = c1649g4.c().a();
        this.f16097c = g9A;
        this.f16099e = c1649g4.c().b();
        this.f16098d = P0.i().u();
        A a10 = v10.a(c1549c4, imB, g9A);
        this.f16104j = a10;
        this.f16108n = c1649g4.a();
        C1976t8 c1976t8B = c1649g4.b(this);
        this.f16101g = c1976t8B;
        C1796m2<C1624f4> c1796m2E = c1649g4.e(this);
        this.f16100f = c1796m2E;
        this.f16112r = c1649g4.d(this);
        Xb xbA = c1649g4.a(c1976t8B, c1972t4A);
        this.f16115u = xbA;
        Sb sbA = c1649g4.a(c1976t8B);
        this.f16114t = sbA;
        ArrayList arrayList = new ArrayList();
        arrayList.add(xbA);
        arrayList.add(sbA);
        this.f16113s = c1649g4.a(arrayList, this);
        y();
        C2024v6 c2024v6A = c1649g4.a(this, i8D, new a());
        this.f16106l = c2024v6A;
        if (c2095xmA.c()) {
            c2095xmA.a("Read app environment for component %s. Value: %s", c1549c4.toString(), a10.a().f13617a);
        }
        this.f16111q = c1649g4.a(g9A, i8D, c2024v6A, c1976t8B, a10, c1796m2E);
        C1575d5 c1575d5C = c1649g4.c(this);
        this.f16103i = c1575d5C;
        this.f16102h = c1649g4.a(this, c1575d5C);
        this.f16116v = c1649g4.a(g9A);
        c1976t8B.e();
    }

    private void y() {
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        Integer numI = this.f16097c.i();
        if (numI == null) {
            numI = Integer.valueOf(this.f16119y.e());
        }
        if (numI.intValue() < libraryApiLevel) {
            this.f16112r.a(new C1883pe(new C1908qe(this.f16095a, this.f16096b.a()))).a();
            this.f16119y.b(libraryApiLevel);
        }
    }

    public boolean A() {
        return this.f16111q.d() && m().y();
    }

    public boolean B() {
        return this.f16111q.c() && m().P() && m().y();
    }

    public void C() {
        this.f16107m.e();
    }

    public boolean D() {
        C1736jh c1736jhM = m();
        return c1736jhM.S() && this.f16117w.b(this.f16111q.a(), c1736jhM.M(), "should force send permissions");
    }

    public boolean E() {
        return !(this.f16118x.a().f14408d && this.f16107m.d().N());
    }

    public void F() {
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public synchronized void a(Hi hi, Qi qi) {
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public synchronized void a(Qi qi) {
        this.f16107m.a(qi);
        this.f16101g.b(qi);
        this.f16113s.c();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1798m4
    public synchronized void a(X3.a aVar) {
        C1972t4 c1972t4 = this.f16107m;
        synchronized (c1972t4) {
            c1972t4.a(aVar);
        }
        if (Boolean.TRUE.equals(aVar.f15459k)) {
            this.f16109o.e();
        } else {
            if (Boolean.FALSE.equals(aVar.f15459k)) {
                this.f16109o.d();
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1798m4
    public void a(C1744k0 c1744k0) {
        if (this.f16109o.c()) {
            Im im = this.f16109o;
            Objects.requireNonNull(im);
            if (J0.c(c1744k0.n())) {
                StringBuilder sb2 = new StringBuilder("Event received on service");
                sb2.append(": ");
                sb2.append(c1744k0.g());
                if (J0.e(c1744k0.n()) && !TextUtils.isEmpty(c1744k0.p())) {
                    sb2.append(" with value ");
                    sb2.append(c1744k0.p());
                }
                im.b(sb2.toString());
            }
        }
        String strA = this.f16096b.a();
        if ((TextUtils.isEmpty(strA) || "-1".equals(strA)) ? false : true) {
            this.f16102h.a(c1744k0);
        }
    }

    public void a(String str) {
        this.f16097c.i(str).c();
    }

    public void b() {
        this.f16104j.b();
        V3 v10 = this.f16105k;
        A.a aVarA = this.f16104j.a();
        G9 g10 = this.f16097c;
        synchronized (v10) {
            g10.a(aVarA).c();
        }
    }

    public void b(C1744k0 c1744k0) {
        boolean z10;
        this.f16104j.a(c1744k0.b());
        A.a aVarA = this.f16104j.a();
        V3 v10 = this.f16105k;
        G9 g10 = this.f16097c;
        synchronized (v10) {
            if (aVarA.f13618b > g10.e().f13618b) {
                g10.a(aVarA).c();
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10 && this.f16109o.c()) {
            this.f16109o.a("Save new app environment for %s. Value: %s", this.f16096b, aVarA.f13617a);
        }
    }

    public void b(String str) {
        this.f16097c.h(str).c();
    }

    public synchronized void c() {
        this.f16100f.d();
    }

    public P d() {
        return this.f16116v;
    }

    public C1549c4 e() {
        return this.f16096b;
    }

    public G9 f() {
        return this.f16097c;
    }

    public Context g() {
        return this.f16095a;
    }

    public String h() {
        return this.f16097c.m();
    }

    public C1976t8 i() {
        return this.f16101g;
    }

    public C1651g6 j() {
        return this.f16108n;
    }

    public C1575d5 k() {
        return this.f16103i;
    }

    public Vb l() {
        return this.f16113s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1736jh m() {
        return (C1736jh) this.f16107m.b();
    }

    @Deprecated
    public final C1908qe n() {
        return new C1908qe(this.f16095a, this.f16096b.a());
    }

    public E9 o() {
        return this.f16099e;
    }

    public String p() {
        return this.f16097c.l();
    }

    public Im q() {
        return this.f16109o;
    }

    public C1997u4 r() {
        return this.f16111q;
    }

    public CounterConfiguration.b s() {
        return CounterConfiguration.b.MANUAL;
    }

    public I9 t() {
        return this.f16098d;
    }

    public C2024v6 u() {
        return this.f16106l;
    }

    public Qi v() {
        return this.f16107m.d();
    }

    public I8 w() {
        return this.f16119y;
    }

    public void x() {
        this.f16111q.b();
    }

    public boolean z() {
        C1736jh c1736jhM = m();
        return c1736jhM.S() && c1736jhM.y() && this.f16117w.b(this.f16111q.a(), c1736jhM.L(), "need to check permissions");
    }
}
