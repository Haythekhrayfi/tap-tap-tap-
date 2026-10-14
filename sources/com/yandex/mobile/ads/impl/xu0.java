package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class xu0 extends f00.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oy0 f26622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Socket f26623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Socket f26624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ny f26625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private nt0 f26626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f00 f26627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private qd.f f26628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private qd.e f26629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f26630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f26633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f26634n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f26635o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayList f26636p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f26637q;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26638a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f26638a = iArr;
        }
    }

    public xu0(bv0 bv0Var, oy0 oy0Var) {
        fd.j0.i(bv0Var, "connectionPool");
        fd.j0.i(oy0Var, "route");
        this.f26622b = oy0Var;
        this.f26635o = 1;
        this.f26636p = new ArrayList();
        this.f26637q = RecyclerView.FOREVER_NS;
    }

    private final void a(int i10, int i11, int i12, wu0 wu0Var, cs csVar) throws IOException {
        char c10;
        boolean z10;
        yn0 yn0Var = null;
        boolean z11 = true;
        nw0 nw0VarA = new nw0.a().a(this.f26622b.a().k()).a("CONNECT", (qw0) null).b("Host", ea1.a(this.f26622b.a().k(), true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", "okhttp/4.9.3").a();
        nw0 nw0VarA2 = this.f26622b.a().g().a(this.f26622b, new ex0.a().a(nw0VarA).a(nt0.f23545c).a(407).b("Preemptive Authenticate").a(ea1.f20133c).b(-1L).a(-1L).c().a());
        if (nw0VarA2 != null) {
            nw0VarA = nw0VarA2;
        }
        d10 d10VarH = nw0VarA.h();
        int i13 = 0;
        while (i13 < 21) {
            a(i10, i11, wu0Var, csVar);
            StringBuilder sbA = v60.a("CONNECT ");
            sbA.append(ea1.a(d10VarH, z11));
            sbA.append(" HTTP/1.1");
            String string = sbA.toString();
            while (true) {
                qd.f fVar = this.f26628h;
                fd.j0.f(fVar);
                qd.e eVar = this.f26629i;
                fd.j0.f(eVar);
                d00 d00Var = new d00(yn0Var, this, fVar, eVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                fVar.timeout().timeout(i11, timeUnit);
                eVar.timeout().timeout(i12, timeUnit);
                d00Var.a(nw0VarA.d(), string);
                d00Var.a();
                ex0.a aVarA = d00Var.a(false);
                fd.j0.f(aVarA);
                ex0 ex0VarA = aVarA.a(nw0VarA).a();
                d00Var.c(ex0VarA);
                int iE = ex0VarA.e();
                if (iE == 200) {
                    c10 = 407;
                    z10 = true;
                    if (!fVar.r().y() || !eVar.r().y()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    nw0VarA = null;
                    break;
                }
                c10 = 407;
                if (iE != 407) {
                    StringBuilder sbA2 = v60.a("Unexpected response code for CONNECT: ");
                    sbA2.append(ex0VarA.e());
                    throw new IOException(sbA2.toString());
                }
                nw0 nw0VarA3 = this.f26622b.a().g().a(this.f26622b, ex0VarA);
                if (nw0VarA3 == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                z10 = true;
                if (ed.q.i("close", ex0.a(ex0VarA, "Connection"), true)) {
                    nw0VarA = nw0VarA3;
                    break;
                } else {
                    nw0VarA = nw0VarA3;
                    yn0Var = null;
                }
            }
            if (nw0VarA == null) {
                return;
            }
            Socket socket = this.f26623c;
            if (socket != null) {
                ea1.a(socket);
            }
            this.f26623c = null;
            this.f26629i = null;
            this.f26628h = null;
            cs.a(wu0Var, this.f26622b.d(), this.f26622b.b());
            i13++;
            yn0Var = null;
            z11 = z10;
        }
    }

    private final void a(int i10, int i11, wu0 wu0Var, cs csVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyB = this.f26622b.b();
        e7 e7VarA = this.f26622b.a();
        Proxy.Type type = proxyB.type();
        int i12 = type == null ? -1 : a.f26638a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = e7VarA.i().createSocket();
            fd.j0.f(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyB);
        }
        this.f26623c = socketCreateSocket;
        InetSocketAddress inetSocketAddressD = this.f26622b.d();
        Objects.requireNonNull(csVar);
        cs.b(wu0Var, inetSocketAddressD, proxyB);
        socketCreateSocket.setSoTimeout(i11);
        try {
            int i13 = qq0.f24561c;
            qq0.a.b().a(socketCreateSocket, this.f26622b.d(), i10);
            try {
                this.f26628h = qd.o.c(qd.o.h(socketCreateSocket));
                this.f26629i = qd.o.b(qd.o.e(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (fd.j0.d(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            StringBuilder sbA = v60.a("Failed to connect to ");
            sbA.append(this.f26622b.d());
            ConnectException connectException = new ConnectException(sbA.toString());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private final void a(ok okVar, wu0 wu0Var, cs csVar) throws Throwable {
        if (this.f26622b.a().j() == null) {
            List<nt0> listE = this.f26622b.a().e();
            nt0 nt0Var = nt0.f23548f;
            if (!listE.contains(nt0Var)) {
                this.f26624d = this.f26623c;
                this.f26626f = nt0.f23545c;
                return;
            } else {
                this.f26624d = this.f26623c;
                this.f26626f = nt0Var;
                n();
                return;
            }
        }
        Objects.requireNonNull(csVar);
        cs.h(wu0Var);
        e7 e7VarA = this.f26622b.a();
        SSLSocketFactory sSLSocketFactoryJ = e7VarA.j();
        SSLSocket sSLSocket = null;
        String strB = null;
        try {
            fd.j0.f(sSLSocketFactoryJ);
            Socket socketCreateSocket = sSLSocketFactoryJ.createSocket(this.f26623c, e7VarA.k().g(), e7VarA.k().i(), true);
            fd.j0.g(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                nk nkVarA = okVar.a(sSLSocket2);
                if (nkVarA.b()) {
                    int i10 = qq0.f24561c;
                    qq0.a.b().a(sSLSocket2, e7VarA.k().g(), e7VarA.e());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                fd.j0.h(session, "sslSocketSession");
                ny nyVarA = ny.a.a(session);
                HostnameVerifier hostnameVerifierD = e7VarA.d();
                fd.j0.f(hostnameVerifierD);
                if (hostnameVerifierD.verify(e7VarA.k().g(), session)) {
                    mh mhVarA = e7VarA.a();
                    fd.j0.f(mhVarA);
                    this.f26625e = new ny(nyVarA.d(), nyVarA.a(), nyVarA.b(), new yu0(mhVarA, nyVarA, e7VarA));
                    mhVarA.a(e7VarA.k().g(), new zu0(this));
                    if (nkVarA.b()) {
                        int i11 = qq0.f24561c;
                        strB = qq0.a.b().b(sSLSocket2);
                    }
                    this.f26624d = sSLSocket2;
                    this.f26628h = qd.o.c(qd.o.h(sSLSocket2));
                    this.f26629i = qd.o.b(qd.o.e(sSLSocket2));
                    this.f26626f = strB != null ? nt0.a.a(strB) : nt0.f23545c;
                    int i12 = qq0.f24561c;
                    qq0.a.b().a(sSLSocket2);
                    cs.g(wu0Var);
                    if (this.f26626f == nt0.f23547e) {
                        n();
                        return;
                    }
                    return;
                }
                List<Certificate> listC = nyVarA.c();
                if (!(!listC.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + e7VarA.k().g() + " not verified (no certificates)");
                }
                Certificate certificate = listC.get(0);
                fd.j0.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n              |Hostname ");
                sb2.append(e7VarA.k().g());
                sb2.append(" not verified:\n              |    certificate: ");
                mh mhVar = mh.f23073c;
                sb2.append(mh.b.a(x509Certificate));
                sb2.append("\n              |    DN: ");
                sb2.append(x509Certificate.getSubjectDN().getName());
                sb2.append("\n              |    subjectAltNames: ");
                sb2.append(xn0.a(x509Certificate));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(ed.j.d(sb2.toString(), null, 1));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    int i13 = qq0.f24561c;
                    qq0.a.b().a(sSLSocket);
                }
                if (sSLSocket != null) {
                    ea1.a((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void n() throws IOException {
        Socket socket = this.f26624d;
        fd.j0.f(socket);
        qd.f fVar = this.f26628h;
        fd.j0.f(fVar);
        qd.e eVar = this.f26629i;
        fd.j0.f(eVar);
        socket.setSoTimeout(0);
        f00 f00VarA = new f00.a(c61.f19395h).a(socket, this.f26622b.a().k().g(), fVar, eVar).a(this).k().a();
        this.f26627g = f00VarA;
        int i10 = f00.D;
        this.f26635o = f00.b.a().c();
        f00.l(f00VarA);
    }

    public final hs a(yn0 yn0Var, cv0 cv0Var) throws SocketException {
        fd.j0.i(yn0Var, "client");
        fd.j0.i(cv0Var, "chain");
        Socket socket = this.f26624d;
        fd.j0.f(socket);
        qd.f fVar = this.f26628h;
        fd.j0.f(fVar);
        qd.e eVar = this.f26629i;
        fd.j0.f(eVar);
        f00 f00Var = this.f26627g;
        if (f00Var != null) {
            return new k00(yn0Var, this, cv0Var, f00Var);
        }
        socket.setSoTimeout(cv0Var.h());
        qd.b0 b0VarTimeout = fVar.timeout();
        long jE = cv0Var.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b0VarTimeout.timeout(jE, timeUnit);
        eVar.timeout().timeout(cv0Var.g(), timeUnit);
        return new d00(yn0Var, this, fVar, eVar);
    }

    public final void a() {
        Socket socket = this.f26623c;
        if (socket != null) {
            ea1.a(socket);
        }
    }

    public final void a(int i10, int i11, int i12, boolean z10, wu0 wu0Var, cs csVar) throws Throwable {
        fd.j0.i(wu0Var, "call");
        fd.j0.i(csVar, "eventListener");
        if (!(this.f26626f == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        List<nk> listB = this.f26622b.a().b();
        ok okVar = new ok(listB);
        if (this.f26622b.a().j() == null) {
            if (!listB.contains(nk.f23404f)) {
                throw new qy0(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strG = this.f26622b.a().k().g();
            int i13 = qq0.f24561c;
            if (!qq0.a.b().a(strG)) {
                throw new qy0(new UnknownServiceException(androidx.activity.j.a("CLEARTEXT communication to ", strG, " not permitted by network security policy")));
            }
        } else if (this.f26622b.a().e().contains(nt0.f23548f)) {
            throw new qy0(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        qy0 qy0Var = null;
        while (true) {
            try {
                if (this.f26622b.c()) {
                    a(i10, i11, i12, wu0Var, csVar);
                    if (this.f26623c == null) {
                        break;
                    }
                } else {
                    try {
                        a(i10, i11, wu0Var, csVar);
                    } catch (IOException e10) {
                        e = e10;
                        Socket socket = this.f26624d;
                        if (socket != null) {
                            ea1.a(socket);
                        }
                        Socket socket2 = this.f26623c;
                        if (socket2 != null) {
                            ea1.a(socket2);
                        }
                        this.f26624d = null;
                        this.f26623c = null;
                        this.f26628h = null;
                        this.f26629i = null;
                        this.f26625e = null;
                        this.f26626f = null;
                        this.f26627g = null;
                        this.f26635o = 1;
                        cs.a(wu0Var, this.f26622b.d(), this.f26622b.b(), e);
                        if (qy0Var == null) {
                            qy0Var = new qy0(e);
                        } else {
                            qy0Var.a(e);
                        }
                        if (!z10) {
                            throw qy0Var;
                        }
                        if (!okVar.a(e)) {
                            throw qy0Var;
                        }
                    }
                }
                a(okVar, wu0Var, csVar);
                cs.a(wu0Var, this.f26622b.d(), this.f26622b.b());
                break;
            } catch (IOException e11) {
                e = e11;
            }
        }
        if (this.f26622b.c() && this.f26623c == null) {
            throw new qy0(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f26637q = System.nanoTime();
    }

    public final void a(long j10) {
        this.f26637q = j10;
    }

    @Override // com.yandex.mobile.ads.impl.f00.c
    public final synchronized void a(f00 f00Var, e11 e11Var) {
        fd.j0.i(f00Var, "connection");
        fd.j0.i(e11Var, "settings");
        this.f26635o = e11Var.c();
    }

    @Override // com.yandex.mobile.ads.impl.f00.c
    public final void a(m00 m00Var) throws IOException {
        fd.j0.i(m00Var, "stream");
        m00Var.a(as.f19050f, (IOException) null);
    }

    public final synchronized void a(wu0 wu0Var, IOException iOException) {
        int i10;
        fd.j0.i(wu0Var, "call");
        if (iOException instanceof t41) {
            as asVar = ((t41) iOException).f25278a;
            if (asVar == as.f19050f) {
                int i11 = this.f26634n + 1;
                this.f26634n = i11;
                if (i11 > 1) {
                    this.f26630j = true;
                    i10 = this.f26632l;
                    this.f26632l = i10 + 1;
                }
            } else if (asVar != as.f19051g || !wu0Var.j()) {
                this.f26630j = true;
                i10 = this.f26632l;
                this.f26632l = i10 + 1;
            }
        } else if (!h() || (iOException instanceof mk)) {
            this.f26630j = true;
            if (this.f26633m == 0) {
                if (iOException != null) {
                    yn0 yn0VarC = wu0Var.c();
                    oy0 oy0Var = this.f26622b;
                    fd.j0.i(yn0VarC, "client");
                    fd.j0.i(oy0Var, "failedRoute");
                    if (oy0Var.b().type() != Proxy.Type.DIRECT) {
                        e7 e7VarA = oy0Var.a();
                        e7VarA.h().connectFailed(e7VarA.k().m(), oy0Var.b().address(), iOException);
                    }
                    yn0VarC.n().b(oy0Var);
                }
                i10 = this.f26632l;
                this.f26632l = i10 + 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    public final boolean a(e7 e7Var, List<oy0> list) {
        boolean z10;
        boolean z11;
        ny nyVar;
        boolean z12;
        fd.j0.i(e7Var, "address");
        if (ea1.f20136f && !Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        if (this.f26636p.size() >= this.f26635o || this.f26630j || !this.f26622b.a().a(e7Var)) {
            return false;
        }
        if (fd.j0.d(e7Var.k().g(), this.f26622b.a().k().g())) {
            return true;
        }
        if (this.f26627g != null && list != null) {
            if (!list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    oy0 oy0Var = (oy0) it.next();
                    if (oy0Var.b().type() == Proxy.Type.DIRECT && this.f26622b.b().type() == Proxy.Type.DIRECT && fd.j0.d(this.f26622b.d(), oy0Var.d())) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
            if (!z10 || e7Var.d() != xn0.f26567a) {
                return false;
            }
            d10 d10VarK = e7Var.k();
            if (ea1.f20136f && !Thread.holdsLock(this)) {
                StringBuilder sbA2 = v60.a("Thread ");
                sbA2.append(Thread.currentThread().getName());
                sbA2.append(" MUST hold lock on ");
                sbA2.append(this);
                throw new AssertionError(sbA2.toString());
            }
            d10 d10VarK2 = this.f26622b.a().k();
            if (d10VarK.i() == d10VarK2.i()) {
                if (!fd.j0.d(d10VarK.g(), d10VarK2.g())) {
                    if (!this.f26631k && (nyVar = this.f26625e) != null) {
                        List<Certificate> listC = nyVar.c();
                        if (!listC.isEmpty()) {
                            String strG = d10VarK.g();
                            Certificate certificate = listC.get(0);
                            fd.j0.g(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                            if (xn0.a(strG, (X509Certificate) certificate)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                        }
                    }
                    z11 = false;
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            try {
                mh mhVarA = e7Var.a();
                fd.j0.f(mhVarA);
                String strG2 = e7Var.k().g();
                ny nyVar2 = this.f26625e;
                fd.j0.f(nyVar2);
                mhVarA.a(strG2, nyVar2.c());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public final boolean a(boolean z10) {
        long j10;
        if (ea1.f20136f && Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f26623c;
        fd.j0.f(socket);
        Socket socket2 = this.f26624d;
        fd.j0.f(socket2);
        qd.f fVar = this.f26628h;
        fd.j0.f(fVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        f00 f00Var = this.f26627g;
        if (f00Var != null) {
            return f00Var.a(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f26637q;
        }
        if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS || !z10) {
            return true;
        }
        return ea1.a(socket2, fVar);
    }

    public final ArrayList b() {
        return this.f26636p;
    }

    public final long c() {
        return this.f26637q;
    }

    public final boolean d() {
        return this.f26630j;
    }

    public final int e() {
        return this.f26632l;
    }

    public final ny f() {
        return this.f26625e;
    }

    public final synchronized void g() {
        this.f26633m++;
    }

    public final boolean h() {
        return this.f26627g != null;
    }

    public final synchronized void i() {
        this.f26631k = true;
    }

    public final synchronized void j() {
        this.f26630j = true;
    }

    public final oy0 k() {
        return this.f26622b;
    }

    public final void l() {
        this.f26630j = true;
    }

    public final Socket m() {
        Socket socket = this.f26624d;
        fd.j0.f(socket);
        return socket;
    }

    public final String toString() {
        Object objA;
        StringBuilder sbA = v60.a("Connection{");
        sbA.append(this.f26622b.a().k().g());
        sbA.append(CoreConstants.COLON_CHAR);
        sbA.append(this.f26622b.a().k().i());
        sbA.append(", proxy=");
        sbA.append(this.f26622b.b());
        sbA.append(" hostAddress=");
        sbA.append(this.f26622b.d());
        sbA.append(" cipherSuite=");
        ny nyVar = this.f26625e;
        if (nyVar == null || (objA = nyVar.a()) == null) {
            objA = "none";
        }
        sbA.append(objA);
        sbA.append(" protocol=");
        sbA.append(this.f26626f);
        sbA.append('}');
        return sbA.toString();
    }
}
