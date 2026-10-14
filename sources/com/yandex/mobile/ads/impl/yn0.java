package com.yandex.mobile.ads.impl;

import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class yn0 implements Cloneable, vg.a {
    public static final /* synthetic */ int B = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kp f26896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lk f26897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<t60> f26898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<t60> f26899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cs.b f26900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f26901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final hc f26902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f26903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f26904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final jl f26905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final oq f26906k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ProxySelector f26907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final hc f26908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SocketFactory f26909n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final SSLSocketFactory f26910o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final X509TrustManager f26911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<nk> f26912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List<nt0> f26913r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final xn0 f26914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final mh f26915t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final lh f26916u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f26917v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f26918w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f26919x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final py0 f26920y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final List<nt0> f26895z = ea1.a(nt0.f23547e, nt0.f23545c);
    private static final List<nk> A = ea1.a(nk.f23403e, nk.f23404f);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private kp f26921a = new kp();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private lk f26922b = new lk();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f26923c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayList f26924d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private cs.b f26925e = ea1.a(cs.f19622a);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f26926f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private hc f26927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f26928h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f26929i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private jl f26930j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private oq f26931k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private hc f26932l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private SocketFactory f26933m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private SSLSocketFactory f26934n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private X509TrustManager f26935o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<nk> f26936p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<? extends nt0> f26937q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private xn0 f26938r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private mh f26939s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private lh f26940t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f26941u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f26942v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f26943w;

        public a() {
            hc hcVar = hc.f21359a;
            this.f26927g = hcVar;
            this.f26928h = true;
            this.f26929i = true;
            this.f26930j = jl.f22077a;
            this.f26931k = oq.f23872a;
            this.f26932l = hcVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            fd.j0.h(socketFactory, "getDefault()");
            this.f26933m = socketFactory;
            int i10 = yn0.B;
            this.f26936p = b.a();
            this.f26937q = b.b();
            this.f26938r = xn0.f26567a;
            this.f26939s = mh.f23073c;
            this.f26941u = 10000;
            this.f26942v = 10000;
            this.f26943w = 10000;
        }

        public final a a() {
            this.f26928h = true;
            return this;
        }

        public final a a(long j10, TimeUnit timeUnit) {
            fd.j0.i(timeUnit, "unit");
            this.f26941u = ea1.a(j10, timeUnit);
            return this;
        }

        public final a a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            fd.j0.i(sSLSocketFactory, "sslSocketFactory");
            fd.j0.i(x509TrustManager, "trustManager");
            if (fd.j0.d(sSLSocketFactory, this.f26934n)) {
                fd.j0.d(x509TrustManager, this.f26935o);
            }
            this.f26934n = sSLSocketFactory;
            this.f26940t = lh.a.a(x509TrustManager);
            this.f26935o = x509TrustManager;
            return this;
        }

        public final hc b() {
            return this.f26927g;
        }

        public final a b(long j10, TimeUnit timeUnit) {
            fd.j0.i(timeUnit, "unit");
            this.f26942v = ea1.a(j10, timeUnit);
            return this;
        }

        public final lh c() {
            return this.f26940t;
        }

        public final mh d() {
            return this.f26939s;
        }

        public final int e() {
            return this.f26941u;
        }

        public final lk f() {
            return this.f26922b;
        }

        public final List<nk> g() {
            return this.f26936p;
        }

        public final jl h() {
            return this.f26930j;
        }

        public final kp i() {
            return this.f26921a;
        }

        public final oq j() {
            return this.f26931k;
        }

        public final cs.b k() {
            return this.f26925e;
        }

        public final boolean l() {
            return this.f26928h;
        }

        public final boolean m() {
            return this.f26929i;
        }

        public final xn0 n() {
            return this.f26938r;
        }

        public final ArrayList o() {
            return this.f26923c;
        }

        public final ArrayList p() {
            return this.f26924d;
        }

        public final List<nt0> q() {
            return this.f26937q;
        }

        public final hc r() {
            return this.f26932l;
        }

        public final int s() {
            return this.f26942v;
        }

        public final boolean t() {
            return this.f26926f;
        }

        public final SocketFactory u() {
            return this.f26933m;
        }

        public final SSLSocketFactory v() {
            return this.f26934n;
        }

        public final int w() {
            return this.f26943w;
        }

        public final X509TrustManager x() {
            return this.f26935o;
        }
    }

    public static final class b {
        public static List a() {
            return yn0.A;
        }

        public static List b() {
            return yn0.f26895z;
        }
    }

    public yn0() {
        this(new a());
    }

    public yn0(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        boolean z10;
        lh lhVarA;
        mh mhVarD;
        mh mhVarA;
        fd.j0.i(aVar, "builder");
        this.f26896a = aVar.i();
        this.f26897b = aVar.f();
        this.f26898c = ea1.b(aVar.o());
        this.f26899d = ea1.b(aVar.p());
        this.f26900e = aVar.k();
        this.f26901f = aVar.t();
        this.f26902g = aVar.b();
        this.f26903h = aVar.l();
        this.f26904i = aVar.m();
        this.f26905j = aVar.h();
        this.f26906k = aVar.j();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f26907l = proxySelector == null ? on0.f23857a : proxySelector;
        this.f26908m = aVar.r();
        this.f26909n = aVar.u();
        List<nk> listG = aVar.g();
        this.f26912q = listG;
        this.f26913r = aVar.q();
        this.f26914s = aVar.n();
        this.f26917v = aVar.e();
        this.f26918w = aVar.s();
        this.f26919x = aVar.w();
        this.f26920y = new py0();
        if (!(listG instanceof Collection) || !listG.isEmpty()) {
            Iterator<T> it = listG.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                } else if (((nk) it.next()).a()) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (z10) {
            this.f26910o = null;
            this.f26916u = null;
            this.f26911p = null;
            mhVarA = mh.f23073c;
        } else {
            if (aVar.v() != null) {
                this.f26910o = aVar.v();
                lhVarA = aVar.c();
                fd.j0.f(lhVarA);
                this.f26916u = lhVarA;
                X509TrustManager x509TrustManagerX = aVar.x();
                fd.j0.f(x509TrustManagerX);
                this.f26911p = x509TrustManagerX;
                mhVarD = aVar.d();
            } else {
                int i10 = qq0.f24561c;
                Objects.requireNonNull(qq0.a.b());
                X509TrustManager x509TrustManagerC = qq0.c();
                this.f26911p = x509TrustManagerC;
                qq0 qq0VarB = qq0.a.b();
                fd.j0.f(x509TrustManagerC);
                Objects.requireNonNull(qq0VarB);
                this.f26910o = qq0.c(x509TrustManagerC);
                lhVarA = lh.a.a(x509TrustManagerC);
                this.f26916u = lhVarA;
                mhVarD = aVar.d();
                fd.j0.f(lhVarA);
            }
            mhVarA = mhVarD.a(lhVarA);
        }
        this.f26915t = mhVarA;
        y();
    }

    private final void y() {
        boolean z10;
        List<t60> list = this.f26898c;
        fd.j0.g(list, "null cannot be cast to non-null type kotlin.collections.List<com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
        if (!(!list.contains(null))) {
            StringBuilder sbA = v60.a("Null interceptor: ");
            sbA.append(this.f26898c);
            throw new IllegalStateException(sbA.toString().toString());
        }
        List<t60> list2 = this.f26899d;
        fd.j0.g(list2, "null cannot be cast to non-null type kotlin.collections.List<com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
        if (!(!list2.contains(null))) {
            StringBuilder sbA2 = v60.a("Null network interceptor: ");
            sbA2.append(this.f26899d);
            throw new IllegalStateException(sbA2.toString().toString());
        }
        List<nk> list3 = this.f26912q;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                } else if (((nk) it.next()).a()) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        if (!z10) {
            if (this.f26910o == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.f26916u == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.f26911p == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.f26910o == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f26916u == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.f26911p == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!fd.j0.d(this.f26915t, mh.f23073c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // com.yandex.mobile.ads.impl.vg.a
    public final wu0 a(nw0 nw0Var) {
        fd.j0.i(nw0Var, "request");
        return new wu0(this, nw0Var, false);
    }

    public final hc c() {
        return this.f26902g;
    }

    public final Object clone() {
        return super.clone();
    }

    public final mh d() {
        return this.f26915t;
    }

    public final int e() {
        return this.f26917v;
    }

    public final lk f() {
        return this.f26897b;
    }

    public final List<nk> g() {
        return this.f26912q;
    }

    public final jl h() {
        return this.f26905j;
    }

    public final kp i() {
        return this.f26896a;
    }

    public final oq j() {
        return this.f26906k;
    }

    public final cs.b k() {
        return this.f26900e;
    }

    public final boolean l() {
        return this.f26903h;
    }

    public final boolean m() {
        return this.f26904i;
    }

    public final py0 n() {
        return this.f26920y;
    }

    public final xn0 o() {
        return this.f26914s;
    }

    public final List<t60> p() {
        return this.f26898c;
    }

    public final List<t60> q() {
        return this.f26899d;
    }

    public final List<nt0> r() {
        return this.f26913r;
    }

    public final hc s() {
        return this.f26908m;
    }

    public final ProxySelector t() {
        return this.f26907l;
    }

    public final int u() {
        return this.f26918w;
    }

    public final boolean v() {
        return this.f26901f;
    }

    public final SocketFactory w() {
        return this.f26909n;
    }

    public final SSLSocketFactory x() {
        SSLSocketFactory sSLSocketFactory = this.f26910o;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int z() {
        return this.f26919x;
    }
}
