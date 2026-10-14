package com.yandex.metrica.impl.ob;

import okhttp3.internal.connection.RealConnection;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2024v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1624f4 f17595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1999u6 f17596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f17597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K0 f17598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1850o6<C1900q6> f17599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1850o6<C1900q6> f17600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1875p6 f17601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f17602h;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.v6$a */
    public interface a {
        void a(C1744k0 c1744k0, C2054w6 c2054w6);
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.v6$b */
    public enum b {
        EMPTY,
        BACKGROUND,
        FOREGROUND
    }

    public C2024v6(C1624f4 c1624f4, C1999u6 c1999u6, a aVar) {
        this(c1624f4, c1999u6, aVar, new C1825n6(c1624f4, c1999u6), new C1800m6(c1624f4, c1999u6), new K0(c1624f4.g()));
    }

    public C2024v6(C1624f4 c1624f4, C1999u6 c1999u6, a aVar, InterfaceC1850o6<C1900q6> interfaceC1850o6, InterfaceC1850o6<C1900q6> interfaceC1850o7, K0 k10) {
        this.f17602h = null;
        this.f17595a = c1624f4;
        this.f17597c = aVar;
        this.f17599e = interfaceC1850o6;
        this.f17600f = interfaceC1850o7;
        this.f17596b = c1999u6;
        this.f17598d = k10;
    }

    private C1875p6 a(C1744k0 c1744k0) {
        long jE = c1744k0.e();
        C1875p6 c1875p6A = ((AbstractC1775l6) this.f17599e).a(new C1900q6(jE, c1744k0.f()));
        this.f17602h = b.FOREGROUND;
        this.f17595a.l().c();
        this.f17597c.a(C1744k0.a(c1744k0, this.f17598d), a(c1875p6A, jE));
        return c1875p6A;
    }

    private C2054w6 a(C1875p6 c1875p6, long j10) {
        return new C2054w6().c(c1875p6.c()).a(c1875p6.e()).b(c1875p6.a(j10)).a(c1875p6.f());
    }

    private boolean a(C1875p6 c1875p6, C1744k0 c1744k0) {
        if (c1875p6 == null) {
            return false;
        }
        if (c1875p6.b(c1744k0.e())) {
            return true;
        }
        b(c1875p6, c1744k0);
        return false;
    }

    private void b(C1875p6 c1875p6, C1744k0 c1744k0) {
        if (c1875p6.h()) {
            this.f17597c.a(C1744k0.a(c1744k0), new C2054w6().c(c1875p6.c()).a(c1875p6.f()).a(c1875p6.e()).b(c1875p6.b()));
            c1875p6.a(false);
        }
        c1875p6.i();
    }

    private void e(C1744k0 c1744k0) {
        b bVar;
        if (this.f17602h == null) {
            C1875p6 c1875p6B = ((AbstractC1775l6) this.f17599e).b();
            if (a(c1875p6B, c1744k0)) {
                this.f17601g = c1875p6B;
                bVar = b.FOREGROUND;
            } else {
                C1875p6 c1875p6B2 = ((AbstractC1775l6) this.f17600f).b();
                if (a(c1875p6B2, c1744k0)) {
                    this.f17601g = c1875p6B2;
                    bVar = b.BACKGROUND;
                } else {
                    this.f17601g = null;
                    bVar = b.EMPTY;
                }
            }
            this.f17602h = bVar;
        }
    }

    public synchronized long a() {
        C1875p6 c1875p6;
        c1875p6 = this.f17601g;
        return c1875p6 == null ? RealConnection.IDLE_CONNECTION_HEALTHY_NS : c1875p6.c() - 1;
    }

    public C2054w6 b(C1744k0 c1744k0) {
        return a(c(c1744k0), c1744k0.e());
    }

    public synchronized C1875p6 c(C1744k0 c1744k0) {
        e(c1744k0);
        b bVar = this.f17602h;
        b bVar2 = b.EMPTY;
        if (bVar != bVar2 && !a(this.f17601g, c1744k0)) {
            this.f17602h = bVar2;
            this.f17601g = null;
        }
        int iOrdinal = this.f17602h.ordinal();
        if (iOrdinal == 1) {
            this.f17601g.c(c1744k0.e());
            return this.f17601g;
        }
        if (iOrdinal == 2) {
            return this.f17601g;
        }
        this.f17602h = b.BACKGROUND;
        long jE = c1744k0.e();
        C1875p6 c1875p6A = ((AbstractC1775l6) this.f17600f).a(new C1900q6(jE, c1744k0.f()));
        if (this.f17595a.w().m()) {
            this.f17597c.a(C1744k0.a(c1744k0, this.f17598d), a(c1875p6A, c1744k0.e()));
        } else if (c1744k0.n() == EnumC1745k1.EVENT_TYPE_FIRST_ACTIVATION.b()) {
            this.f17597c.a(c1744k0, a(c1875p6A, jE));
            this.f17597c.a(C1744k0.a(c1744k0, this.f17598d), a(c1875p6A, jE));
        }
        this.f17601g = c1875p6A;
        return c1875p6A;
    }

    public synchronized void d(C1744k0 c1744k0) {
        C1875p6 c1875p6A;
        e(c1744k0);
        int iOrdinal = this.f17602h.ordinal();
        if (iOrdinal == 0) {
            c1875p6A = a(c1744k0);
        } else if (iOrdinal == 1) {
            b(this.f17601g, c1744k0);
            c1875p6A = a(c1744k0);
        } else if (iOrdinal == 2) {
            if (a(this.f17601g, c1744k0)) {
                this.f17601g.c(c1744k0.e());
            } else {
                c1875p6A = a(c1744k0);
            }
        }
        this.f17601g = c1875p6A;
    }

    public C2054w6 f(C1744k0 c1744k0) {
        C1875p6 c1875p6B;
        if (this.f17602h == null) {
            c1875p6B = ((AbstractC1775l6) this.f17599e).b();
            if (c1875p6B == null ? false : c1875p6B.b(c1744k0.e())) {
                c1875p6B = ((AbstractC1775l6) this.f17600f).b();
                if (c1875p6B != null ? c1875p6B.b(c1744k0.e()) : false) {
                    c1875p6B = null;
                }
            }
        } else {
            c1875p6B = this.f17601g;
        }
        if (c1875p6B != null) {
            return new C2054w6().c(c1875p6B.c()).a(c1875p6B.e()).b(c1875p6B.d()).a(c1875p6B.f());
        }
        long jF = c1744k0.f();
        long jA = this.f17596b.a();
        C1976t8 c1976t8I = this.f17595a.i();
        EnumC2129z6 enumC2129z6 = EnumC2129z6.BACKGROUND;
        c1976t8I.a(jA, enumC2129z6, jF);
        return new C2054w6().c(jA).a(enumC2129z6).a(0L).b(0L);
    }

    public synchronized void g(C1744k0 c1744k0) {
        c(c1744k0).a(false);
        b bVar = this.f17602h;
        b bVar2 = b.EMPTY;
        if (bVar != bVar2) {
            b(this.f17601g, c1744k0);
        }
        this.f17602h = bVar2;
    }
}
