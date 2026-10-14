package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class wu0 implements vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yn0 f26370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nw0 f26371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bv0 f26373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cs f26374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f26375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f26376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f26377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private is f26378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private xu0 f26379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f26380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private gs f26381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f26382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f26383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f26384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f26385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile gs f26386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile xu0 f26387r;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dh f26388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile AtomicInteger f26389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ wu0 f26390d;

        public a(wu0 wu0Var, dh dhVar) {
            fd.j0.i(dhVar, "responseCallback");
            this.f26390d = wu0Var;
            this.f26388b = dhVar;
            this.f26389c = new AtomicInteger(0);
        }

        public final wu0 a() {
            return this.f26390d;
        }

        public final void a(a aVar) {
            fd.j0.i(aVar, "other");
            this.f26389c = aVar.f26389c;
        }

        public final void a(ThreadPoolExecutor threadPoolExecutor) {
            fd.j0.i(threadPoolExecutor, "executorService");
            kp kpVarI = this.f26390d.c().i();
            if (ea1.f20136f && Thread.holdsLock(kpVarI)) {
                StringBuilder sbA = v60.a("Thread ");
                sbA.append(Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(kpVarI);
                throw new AssertionError(sbA.toString());
            }
            try {
                try {
                    threadPoolExecutor.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f26390d.b(interruptedIOException);
                    this.f26388b.a(interruptedIOException);
                    this.f26390d.c().i().b(this);
                }
            } catch (Throwable th) {
                this.f26390d.c().i().b(this);
                throw th;
            }
        }

        public final AtomicInteger b() {
            return this.f26389c;
        }

        public final String c() {
            return this.f26390d.h().h().g();
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sbA = v60.a("OkHttp ");
            sbA.append(this.f26390d.k());
            String string = sbA.toString();
            wu0 wu0Var = this.f26390d;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(string);
            try {
                wu0Var.f26375f.enter();
                boolean z10 = false;
                try {
                    try {
                        try {
                            this.f26388b.a(wu0Var.i());
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            if (z10) {
                                int i10 = qq0.f24561c;
                                qq0 qq0VarB = qq0.a.b();
                                String str = "Callback failure for " + wu0.b(wu0Var);
                                Objects.requireNonNull(qq0VarB);
                                qq0.a(4, str, e);
                            } else {
                                this.f26388b.a(e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            z10 = true;
                            wu0Var.a();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th);
                                jc.a.a(iOException, th);
                                this.f26388b.a(iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        wu0Var.c().i().b(this);
                        throw th2;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Throwable th3) {
                    th = th3;
                }
                wu0Var.c().i().b(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    public static final class b extends WeakReference<wu0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f26391a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wu0 wu0Var, Object obj) {
            super(wu0Var);
            fd.j0.i(wu0Var, "referent");
            this.f26391a = obj;
        }

        public final Object a() {
            return this.f26391a;
        }
    }

    public static final class c extends qd.a {
        public c() {
        }

        @Override // qd.a
        public final void timedOut() {
            wu0.this.a();
        }
    }

    public wu0(yn0 yn0Var, nw0 nw0Var, boolean z10) {
        fd.j0.i(yn0Var, "client");
        fd.j0.i(nw0Var, "originalRequest");
        this.f26370a = yn0Var;
        this.f26371b = nw0Var;
        this.f26372c = z10;
        this.f26373d = yn0Var.f().a();
        this.f26374e = yn0Var.k().a(this);
        c cVar = new c();
        cVar.timeout(0, TimeUnit.MILLISECONDS);
        this.f26375f = cVar;
        this.f26376g = new AtomicBoolean();
        this.f26384o = true;
    }

    private final <E extends IOException> E a(E e10) {
        E interruptedIOException;
        Socket socketL;
        boolean z10 = ea1.f20136f;
        if (z10 && Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        xu0 xu0Var = this.f26379j;
        if (xu0Var != null) {
            if (z10 && Thread.holdsLock(xu0Var)) {
                StringBuilder sbA2 = v60.a("Thread ");
                sbA2.append(Thread.currentThread().getName());
                sbA2.append(" MUST NOT hold lock on ");
                sbA2.append(xu0Var);
                throw new AssertionError(sbA2.toString());
            }
            synchronized (xu0Var) {
                socketL = l();
            }
            if (this.f26379j == null) {
                if (socketL != null) {
                    ea1.a(socketL);
                }
                Objects.requireNonNull(this.f26374e);
                cs.a((vg) this, xu0Var);
            } else {
                if (!(socketL == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f26380k && this.f26375f.exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e10 != null) {
                interruptedIOException.initCause(e10);
            }
        } else {
            interruptedIOException = e10;
        }
        if (e10 != null) {
            cs csVar = this.f26374e;
            fd.j0.f(interruptedIOException);
            Objects.requireNonNull(csVar);
            cs.a((vg) this, (IOException) interruptedIOException);
        } else {
            Objects.requireNonNull(this.f26374e);
            cs.a((vg) this);
        }
        return interruptedIOException;
    }

    public static final String b(wu0 wu0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wu0Var.f26385p ? "canceled " : "");
        sb2.append(wu0Var.f26372c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(wu0Var.k());
        return sb2.toString();
    }

    public final gs a(cv0 cv0Var) throws IOException {
        fd.j0.i(cv0Var, "chain");
        synchronized (this) {
            if (!this.f26384o) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.f26383n)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.f26382m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        is isVar = this.f26378i;
        fd.j0.f(isVar);
        gs gsVar = new gs(this, this.f26374e, isVar, isVar.a(this.f26370a, cv0Var));
        this.f26381l = gsVar;
        this.f26386q = gsVar;
        synchronized (this) {
            this.f26382m = true;
            this.f26383n = true;
        }
        if (this.f26385p) {
            throw new IOException("Canceled");
        }
        return gsVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:45:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001b), top: B:45:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final <E extends IOException> E a(gs gsVar, boolean z10, boolean z11, E e10) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        fd.j0.i(gsVar, "exchange");
        if (!fd.j0.d(gsVar, this.f26386q)) {
            return e10;
        }
        synchronized (this) {
            z12 = false;
            if (z10) {
                try {
                    if (this.f26382m) {
                        if (z10) {
                            this.f26382m = false;
                        }
                        if (z11) {
                            this.f26383n = false;
                        }
                        z14 = this.f26382m;
                        if (z14) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (!z14) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                    } else if (z11 || !this.f26383n) {
                        z13 = false;
                    } else {
                        if (z10) {
                            this.f26382m = false;
                        }
                        if (z11) {
                            this.f26383n = false;
                        }
                        z14 = this.f26382m;
                        if (z14 || this.f26383n) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (!z14 && !this.f26383n && !this.f26384o) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z11) {
                }
                z13 = false;
            }
        }
        if (z12) {
            this.f26386q = null;
            xu0 xu0Var = this.f26379j;
            if (xu0Var != null) {
                xu0Var.g();
            }
        }
        return z13 ? (E) a(e10) : e10;
    }

    public final void a() {
        if (this.f26385p) {
            return;
        }
        this.f26385p = true;
        gs gsVar = this.f26386q;
        if (gsVar != null) {
            gsVar.a();
        }
        xu0 xu0Var = this.f26387r;
        if (xu0Var != null) {
            xu0Var.a();
        }
        Objects.requireNonNull(this.f26374e);
        cs.c((vg) this);
    }

    public final void a(dh dhVar) {
        fd.j0.i(dhVar, "responseCallback");
        if (!this.f26376g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f26377h = qq0.f24559a.b();
        Objects.requireNonNull(this.f26374e);
        cs.b((vg) this);
        this.f26370a.i().a(new a(this, dhVar));
    }

    public final void a(nw0 nw0Var, boolean z10) {
        SSLSocketFactory sSLSocketFactory;
        xn0 xn0VarO;
        mh mhVarD;
        fd.j0.i(nw0Var, "request");
        if (!(this.f26381l == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (this) {
            if (!(!this.f26383n)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!this.f26382m)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (z10) {
            bv0 bv0Var = this.f26373d;
            d10 d10VarH = nw0Var.h();
            if (d10VarH.h()) {
                SSLSocketFactory sSLSocketFactoryX = this.f26370a.x();
                xn0VarO = this.f26370a.o();
                sSLSocketFactory = sSLSocketFactoryX;
                mhVarD = this.f26370a.d();
            } else {
                sSLSocketFactory = null;
                xn0VarO = null;
                mhVarD = null;
            }
            String strG = d10VarH.g();
            int i10 = d10VarH.i();
            oq oqVarJ = this.f26370a.j();
            SocketFactory socketFactoryW = this.f26370a.w();
            hc hcVarS = this.f26370a.s();
            Objects.requireNonNull(this.f26370a);
            this.f26378i = new is(bv0Var, new e7(strG, i10, oqVarJ, socketFactoryW, sSLSocketFactory, xn0VarO, mhVarD, hcVarS, this.f26370a.r(), this.f26370a.g(), this.f26370a.t()), this, this.f26374e);
        }
    }

    public final void a(xu0 xu0Var) {
        fd.j0.i(xu0Var, "connection");
        if (!ea1.f20136f || Thread.holdsLock(xu0Var)) {
            if (!(this.f26379j == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f26379j = xu0Var;
            xu0Var.b().add(new b(this, this.f26377h));
            return;
        }
        StringBuilder sbA = v60.a("Thread ");
        sbA.append(Thread.currentThread().getName());
        sbA.append(" MUST hold lock on ");
        sbA.append(xu0Var);
        throw new AssertionError(sbA.toString());
    }

    public final void a(boolean z10) {
        gs gsVar;
        synchronized (this) {
            if (!this.f26384o) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (gsVar = this.f26386q) != null) {
            gsVar.b();
        }
        this.f26381l = null;
    }

    public final ex0 b() {
        if (!this.f26376g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.f26375f.enter();
        this.f26377h = qq0.f24559a.b();
        Objects.requireNonNull(this.f26374e);
        cs.b((vg) this);
        try {
            this.f26370a.i().a(this);
            return i();
        } finally {
            this.f26370a.i().b(this);
        }
    }

    public final IOException b(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f26384o) {
                this.f26384o = false;
                if (!this.f26382m && !this.f26383n) {
                    z10 = true;
                }
            }
        }
        return z10 ? a(iOException) : iOException;
    }

    public final void b(xu0 xu0Var) {
        this.f26387r = xu0Var;
    }

    public final yn0 c() {
        return this.f26370a;
    }

    public final Object clone() {
        return new wu0(this.f26370a, this.f26371b, this.f26372c);
    }

    public final xu0 d() {
        return this.f26379j;
    }

    public final cs e() {
        return this.f26374e;
    }

    public final boolean f() {
        return this.f26372c;
    }

    public final gs g() {
        return this.f26381l;
    }

    public final nw0 h() {
        return this.f26371b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009b  */
    public final ex0 i() throws Throwable {
        ArrayList arrayList = new ArrayList();
        kc.q.l(arrayList, this.f26370a.p());
        arrayList.add(new sx0(this.f26370a));
        arrayList.add(new qf(this.f26370a.h()));
        Objects.requireNonNull(this.f26370a);
        arrayList.add(new og());
        arrayList.add(kk.f22434a);
        if (!this.f26372c) {
            kc.q.l(arrayList, this.f26370a.q());
        }
        arrayList.add(new wg(this.f26372c));
        boolean z10 = false;
        try {
            ex0 ex0VarA = new cv0(this, arrayList, 0, null, this.f26371b, this.f26370a.e(), this.f26370a.u(), this.f26370a.z()).a(this.f26371b);
            if (this.f26385p) {
                ea1.a((Closeable) ex0VarA);
                throw new IOException("Canceled");
            }
            b((IOException) null);
            return ex0VarA;
        } catch (IOException e10) {
            try {
                IOException iOExceptionB = b(e10);
                fd.j0.g(iOExceptionB, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionB;
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    b((IOException) null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z10) {
                b((IOException) null);
            }
            throw th;
        }
    }

    public final boolean j() {
        return this.f26385p;
    }

    public final String k() {
        return this.f26371b.h().k();
    }

    public final Socket l() {
        xu0 xu0Var = this.f26379j;
        fd.j0.f(xu0Var);
        if (ea1.f20136f && !Thread.holdsLock(xu0Var)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(xu0Var);
            throw new AssertionError(sbA.toString());
        }
        ArrayList arrayListB = xu0Var.b();
        Iterator it = arrayListB.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (fd.j0.d(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (!(i10 != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayListB.remove(i10);
        this.f26379j = null;
        if (arrayListB.isEmpty()) {
            xu0Var.a(System.nanoTime());
            if (this.f26373d.a(xu0Var)) {
                return xu0Var.m();
            }
        }
        return null;
    }

    public final boolean m() {
        is isVar = this.f26378i;
        fd.j0.f(isVar);
        return isVar.b();
    }

    public final void n() {
        if (!(!this.f26380k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f26380k = true;
        this.f26375f.exit();
    }
}
