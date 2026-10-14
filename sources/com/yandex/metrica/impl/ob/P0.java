package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile P0 f14660y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Ug f14662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Kh f14663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile C1785lg f14664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Pb f14665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile M2 f14666f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Dh f14668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile M0 f14669i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile C2118yk f14671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile M f14672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile D2 f14673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile R1 f14674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile Yc f14675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile C1607ec f14676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile C1707ic f14677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile C1547c2 f14678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile Q f14679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile I9 f14680t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile K8 f14681u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C1845o1 f14683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Zd f14684x;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile C2146zn f14670j = new C2146zn();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2047w f14667g = new C2047w();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C2100y2 f14682v = new C2100y2();

    private P0(Context context) {
        this.f14661a = context;
        this.f14683w = new C1845o1(context, this.f14670j.b());
        this.f14672l = new M(this.f14670j.b(), this.f14683w.b());
    }

    private void A() {
        if (this.f14678r == null) {
            synchronized (this) {
                if (this.f14678r == null) {
                    Q9 q9A = Ma.b.a(Be.class).a(this.f14661a);
                    Be be2 = (Be) q9A.b();
                    Context context = this.f14661a;
                    Ie ie2 = new Ie();
                    Ae ae2 = new Ae(be2);
                    Ne ne2 = new Ne();
                    He he2 = new He(this.f14661a);
                    P0 p0I = i();
                    fd.j0.h(p0I, "GlobalServiceLocator.getInstance()");
                    I9 i9U = p0I.u();
                    fd.j0.h(i9U, "GlobalServiceLocator.get…ance().servicePreferences");
                    this.f14678r = new C1547c2(context, q9A, ie2, ae2, ne2, he2, new Je(i9U), new Ce(), be2, "[PreloadInfoStorage]");
                }
            }
        }
    }

    public static void a(Context context) {
        if (f14660y == null) {
            synchronized (P0.class) {
                if (f14660y == null) {
                    f14660y = new P0(context.getApplicationContext());
                }
            }
        }
    }

    public static P0 i() {
        return f14660y;
    }

    public C2047w a() {
        return this.f14667g;
    }

    public synchronized void a(E2 e10) {
        this.f14673m = new D2(this.f14661a, e10);
    }

    public synchronized void a(Qi qi) {
        if (this.f14676p != null) {
            this.f14676p.a(qi);
        }
        if (this.f14668h != null) {
            this.f14668h.b(qi);
        }
        if (this.f14669i != null) {
            this.f14669i.a(qi);
        }
        if (this.f14665e != null) {
            this.f14665e.b(qi);
        }
        Zd zd2 = this.f14684x;
        if (zd2 != null) {
            zd2.a(qi);
        }
    }

    public C1707ic b() {
        if (this.f14677q == null) {
            synchronized (this) {
                if (this.f14677q == null) {
                    this.f14677q = new C1707ic(this.f14661a, C1731jc.a());
                }
            }
        }
        return this.f14677q;
    }

    public E c() {
        return this.f14683w.a();
    }

    public M d() {
        return this.f14672l;
    }

    public Q e() {
        if (this.f14679s == null) {
            synchronized (this) {
                if (this.f14679s == null) {
                    Q9 q9A = Ma.b.a(P3.class).a(this.f14661a);
                    this.f14679s = new Q(this.f14661a, q9A, new Q3(), new L3(), new S3(), new C1995u2(this.f14661a), new R3(u()), new M3(), (P3) q9A.b(), "[ClidsInfoStorage]");
                }
            }
        }
        return this.f14679s;
    }

    public Context f() {
        return this.f14661a;
    }

    public Pb g() {
        if (this.f14665e == null) {
            synchronized (this) {
                if (this.f14665e == null) {
                    this.f14665e = new Pb(this.f14683w.a(), new Nb());
                }
            }
        }
        return this.f14665e;
    }

    public M0 h() {
        if (this.f14669i == null) {
            synchronized (this) {
                if (this.f14669i == null) {
                    this.f14669i = new M0();
                }
            }
        }
        return this.f14669i;
    }

    public C1845o1 j() {
        return this.f14683w;
    }

    public Yc k() {
        Yc yc2 = this.f14675o;
        if (yc2 == null) {
            synchronized (this) {
                yc2 = this.f14675o;
                if (yc2 == null) {
                    yc2 = new Yc(this.f14661a);
                    this.f14675o = yc2;
                }
            }
        }
        return yc2;
    }

    public R1 l() {
        return this.f14674n;
    }

    public C1547c2 m() {
        A();
        return this.f14678r;
    }

    public C1785lg n() {
        if (this.f14664d == null) {
            synchronized (this) {
                if (this.f14664d == null) {
                    Context context = this.f14661a;
                    Q9 q9A = Ma.b.a(C1785lg.e.class).a(this.f14661a);
                    M2 m2V = v();
                    if (this.f14663c == null) {
                        synchronized (this) {
                            if (this.f14663c == null) {
                                this.f14663c = new Kh();
                            }
                        }
                    }
                    this.f14664d = new C1785lg(context, q9A, m2V, this.f14663c, this.f14670j.h(), new C1940rm());
                }
            }
        }
        return this.f14664d;
    }

    public Ug o() {
        if (this.f14662b == null) {
            synchronized (this) {
                if (this.f14662b == null) {
                    this.f14662b = new Ug(this.f14661a);
                }
            }
        }
        return this.f14662b;
    }

    public C2100y2 p() {
        return this.f14682v;
    }

    public Dh q() {
        if (this.f14668h == null) {
            synchronized (this) {
                if (this.f14668h == null) {
                    this.f14668h = new Dh(this.f14661a, this.f14670j.h());
                }
            }
        }
        return this.f14668h;
    }

    public synchronized D2 r() {
        return this.f14673m;
    }

    public C2146zn s() {
        return this.f14670j;
    }

    public C1607ec t() {
        if (this.f14676p == null) {
            synchronized (this) {
                if (this.f14676p == null) {
                    this.f14676p = new C1607ec(new C1607ec.h(), new C1607ec.d(), new C1607ec.c(), this.f14670j.b(), "ServiceInternal");
                }
            }
        }
        return this.f14676p;
    }

    public I9 u() {
        if (this.f14680t == null) {
            synchronized (this) {
                if (this.f14680t == null) {
                    this.f14680t = new I9(Qa.a(this.f14661a).i());
                }
            }
        }
        return this.f14680t;
    }

    public M2 v() {
        if (this.f14666f == null) {
            synchronized (this) {
                if (this.f14666f == null) {
                    this.f14666f = new M2(new M2.b(u()));
                }
            }
        }
        return this.f14666f;
    }

    public C2118yk w() {
        if (this.f14671k == null) {
            synchronized (this) {
                if (this.f14671k == null) {
                    this.f14671k = new C2118yk(this.f14661a, this.f14670j.j());
                }
            }
        }
        return this.f14671k;
    }

    public synchronized Zd x() {
        if (this.f14684x == null) {
            this.f14684x = new Zd(this.f14661a, new Yd(), new Xd());
        }
        return this.f14684x;
    }

    public synchronized K8 y() {
        if (this.f14681u == null) {
            this.f14681u = new K8(this.f14661a);
        }
        return this.f14681u;
    }

    public synchronized void z() {
        n().a();
        A();
        if (this.f14674n == null) {
            R1 r10 = new R1(this.f14661a, this.f14670j.i(), u());
            r10.setName(ThreadFactoryC2071wn.a("YMM-NC"));
            this.f14683w.a(r10);
            r10.start();
            this.f14674n = r10;
        }
        k().b();
    }
}
