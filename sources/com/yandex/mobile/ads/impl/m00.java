package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: loaded from: classes3.dex */
public final class m00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f00 f22841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f22842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f22845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<ry> f22846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f22848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f22849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c f22850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c f22851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private as f22852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IOException f22853n;

    public final class a implements qd.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f22854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qd.c f22855b = new qd.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22856c;

        public a(boolean z10) {
            this.f22854a = z10;
        }

        private final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            m00 m00Var = m00.this;
            synchronized (m00Var) {
                m00Var.o().enter();
                while (m00Var.n() >= m00Var.m() && !this.f22854a && !this.f22856c && m00Var.d() == null) {
                    try {
                        m00Var.t();
                    } catch (Throwable th) {
                        m00Var.o().a();
                        throw th;
                    }
                }
                m00Var.o().a();
                m00Var.b();
                jMin = Math.min(m00Var.m() - m00Var.n(), this.f22855b.f34879d);
                m00Var.d(m00Var.n() + jMin);
                z11 = z10 && jMin == this.f22855b.f34879d;
            }
            m00.this.o().enter();
            try {
                m00.this.c().a(m00.this.f(), z11, this.f22855b, jMin);
            } finally {
                m00.this.o().a();
            }
        }

        public final boolean a() {
            return this.f22856c;
        }

        public final boolean b() {
            return this.f22854a;
        }

        @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            m00 m00Var = m00.this;
            if (ea1.f20136f && Thread.holdsLock(m00Var)) {
                StringBuilder sbA = v60.a("Thread ");
                sbA.append(Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(m00Var);
                throw new AssertionError(sbA.toString());
            }
            m00 m00Var2 = m00.this;
            synchronized (m00Var2) {
                if (this.f22856c) {
                    return;
                }
                boolean z10 = m00Var2.d() == null;
                if (!m00.this.k().f22854a) {
                    if (this.f22855b.f34879d > 0) {
                        while (this.f22855b.f34879d > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        m00.this.c().a(m00.this.f(), true, (qd.c) null, 0L);
                    }
                }
                synchronized (m00.this) {
                    this.f22856c = true;
                }
                m00.this.c().flush();
                m00.this.a();
            }
        }

        @Override // qd.y, java.io.Flushable
        public final void flush() throws IOException {
            m00 m00Var = m00.this;
            if (ea1.f20136f && Thread.holdsLock(m00Var)) {
                StringBuilder sbA = v60.a("Thread ");
                sbA.append(Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(m00Var);
                throw new AssertionError(sbA.toString());
            }
            m00 m00Var2 = m00.this;
            synchronized (m00Var2) {
                m00Var2.b();
            }
            while (this.f22855b.f34879d > 0) {
                a(false);
                m00.this.c().flush();
            }
        }

        @Override // qd.y
        public final qd.b0 timeout() {
            return m00.this.o();
        }

        @Override // qd.y
        public final void write(qd.c cVar, long j10) throws IOException {
            fd.j0.i(cVar, "source");
            m00 m00Var = m00.this;
            if (!ea1.f20136f || !Thread.holdsLock(m00Var)) {
                this.f22855b.write(cVar, j10);
                while (this.f22855b.f34879d >= Http2Stream.EMIT_BUFFER_SIZE) {
                    a(false);
                }
            } else {
                StringBuilder sbA = v60.a("Thread ");
                sbA.append(Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(m00Var);
                throw new AssertionError(sbA.toString());
            }
        }
    }

    public final class b implements qd.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f22858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final qd.c f22860c = new qd.c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final qd.c f22861d = new qd.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f22862e;

        public b(long j10, boolean z10) {
            this.f22858a = j10;
            this.f22859b = z10;
        }

        private final void a(long j10) {
            m00 m00Var = m00.this;
            if (!ea1.f20136f || !Thread.holdsLock(m00Var)) {
                m00.this.c().b(j10);
                return;
            }
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(m00Var);
            throw new AssertionError(sbA.toString());
        }

        public final void a(qd.f fVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            fd.j0.i(fVar, "source");
            m00 m00Var = m00.this;
            if (ea1.f20136f && Thread.holdsLock(m00Var)) {
                StringBuilder sbA = v60.a("Thread ");
                sbA.append(Thread.currentThread().getName());
                sbA.append(" MUST NOT hold lock on ");
                sbA.append(m00Var);
                throw new AssertionError(sbA.toString());
            }
            while (j10 > 0) {
                synchronized (m00.this) {
                    z10 = this.f22859b;
                    z11 = true;
                    z12 = this.f22861d.f34879d + j10 > this.f22858a;
                }
                if (z12) {
                    fVar.skip(j10);
                    m00.this.a(as.f19049e);
                    return;
                }
                if (z10) {
                    fVar.skip(j10);
                    return;
                }
                long j12 = fVar.read(this.f22860c, j10);
                if (j12 == -1) {
                    throw new EOFException();
                }
                j10 -= j12;
                m00 m00Var2 = m00.this;
                synchronized (m00Var2) {
                    if (this.f22862e) {
                        qd.c cVar = this.f22860c;
                        j11 = cVar.f34879d;
                        cVar.skip(j11);
                    } else {
                        qd.c cVar2 = this.f22861d;
                        if (cVar2.f34879d != 0) {
                            z11 = false;
                        }
                        cVar2.v(this.f22860c);
                        if (z11) {
                            m00Var2.notifyAll();
                        }
                        j11 = 0;
                    }
                }
                if (j11 > 0) {
                    a(j11);
                }
            }
        }

        public final boolean a() {
            return this.f22862e;
        }

        public final boolean b() {
            return this.f22859b;
        }

        public final void c() {
            this.f22859b = true;
        }

        @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j10;
            m00 m00Var = m00.this;
            synchronized (m00Var) {
                this.f22862e = true;
                qd.c cVar = this.f22861d;
                j10 = cVar.f34879d;
                cVar.skip(j10);
                m00Var.notifyAll();
            }
            if (j10 > 0) {
                a(j10);
            }
            m00.this.a();
        }

        @Override // qd.a0
        public final long read(qd.c cVar, long j10) throws IOException {
            boolean z10;
            long j11;
            fd.j0.i(cVar, "sink");
            long j12 = 0;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
            }
            while (true) {
                IOException iOExceptionE = null;
                m00 m00Var = m00.this;
                synchronized (m00Var) {
                    m00Var.i().enter();
                    try {
                        if (m00Var.d() != null && (iOExceptionE = m00Var.e()) == null) {
                            as asVarD = m00Var.d();
                            fd.j0.f(asVarD);
                            iOExceptionE = new t41(asVarD);
                        }
                        if (this.f22862e) {
                            throw new IOException("stream closed");
                        }
                        qd.c cVar2 = this.f22861d;
                        long j13 = cVar2.f34879d;
                        if (j13 > j12) {
                            long j14 = cVar2.read(cVar, Math.min(j10, j13));
                            m00Var.c(m00Var.h() + j14);
                            long jH = m00Var.h() - m00Var.g();
                            if (iOExceptionE == null && jH >= m00Var.c().g().b() / 2) {
                                m00Var.c().a(m00Var.f(), jH);
                                m00Var.b(m00Var.h());
                            }
                            j11 = j14;
                            z10 = false;
                        } else {
                            if (this.f22859b || iOExceptionE != null) {
                                z10 = false;
                            } else {
                                m00Var.t();
                                z10 = true;
                            }
                            j11 = -1;
                        }
                        m00Var.i().a();
                    } catch (Throwable th) {
                        m00Var.i().a();
                        throw th;
                    }
                }
                if (!z10) {
                    if (j11 != -1) {
                        a(j11);
                        return j11;
                    }
                    if (iOExceptionE == null) {
                        return -1L;
                    }
                    throw iOExceptionE;
                }
                j12 = 0;
            }
        }

        @Override // qd.a0
        public final qd.b0 timeout() {
            return m00.this.i();
        }
    }

    public final class c extends qd.a {
        public c() {
        }

        public final void a() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // qd.a
        public final IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // qd.a
        public final void timedOut() {
            m00.this.a(as.f19051g);
            m00.this.c().l();
        }
    }

    public m00(int i10, f00 f00Var, boolean z10, boolean z11, ry ryVar) {
        fd.j0.i(f00Var, "connection");
        this.f22840a = i10;
        this.f22841b = f00Var;
        this.f22845f = f00Var.h().b();
        ArrayDeque<ry> arrayDeque = new ArrayDeque<>();
        this.f22846g = arrayDeque;
        this.f22848i = new b(f00Var.g().b(), z11);
        this.f22849j = new a(z10);
        this.f22850k = new c();
        this.f22851l = new c();
        if (ryVar == null) {
            if (!p()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!p())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(ryVar);
        }
    }

    private final boolean b(as asVar, IOException iOException) {
        if (ea1.f20136f && Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this) {
            if (this.f22852m != null) {
                return false;
            }
            if (this.f22848i.b() && this.f22849j.b()) {
                return false;
            }
            this.f22852m = asVar;
            this.f22853n = iOException;
            notifyAll();
            this.f22841b.c(this.f22840a);
            return true;
        }
    }

    public final void a() throws IOException {
        boolean z10;
        boolean zQ;
        if (ea1.f20136f && Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this) {
            z10 = !this.f22848i.b() && this.f22848i.a() && (this.f22849j.b() || this.f22849j.a());
            zQ = q();
        }
        if (z10) {
            a(as.f19051g, (IOException) null);
        } else {
            if (zQ) {
                return;
            }
            this.f22841b.c(this.f22840a);
        }
    }

    public final void a(long j10) {
        this.f22845f += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void a(as asVar) {
        fd.j0.i(asVar, "errorCode");
        if (b(asVar, null)) {
            this.f22841b.c(this.f22840a, asVar);
        }
    }

    public final void a(as asVar, IOException iOException) throws IOException {
        fd.j0.i(asVar, "rstStatusCode");
        if (b(asVar, iOException)) {
            this.f22841b.b(this.f22840a, asVar);
        }
    }

    public final void a(ry ryVar, boolean z10) {
        boolean zQ;
        fd.j0.i(ryVar, "headers");
        if (ea1.f20136f && Thread.holdsLock(this)) {
            StringBuilder sbA = v60.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this) {
            if (this.f22847h && z10) {
                Objects.requireNonNull(this.f22848i);
            } else {
                this.f22847h = true;
                this.f22846g.add(ryVar);
            }
            if (z10) {
                this.f22848i.c();
            }
            zQ = q();
            notifyAll();
        }
        if (zQ) {
            return;
        }
        this.f22841b.c(this.f22840a);
    }

    public final void a(qd.f fVar, int i10) throws IOException {
        fd.j0.i(fVar, "source");
        if (!ea1.f20136f || !Thread.holdsLock(this)) {
            this.f22848i.a(fVar, i10);
            return;
        }
        StringBuilder sbA = v60.a("Thread ");
        sbA.append(Thread.currentThread().getName());
        sbA.append(" MUST NOT hold lock on ");
        sbA.append(this);
        throw new AssertionError(sbA.toString());
    }

    public final void b() throws IOException {
        if (this.f22849j.a()) {
            throw new IOException("stream closed");
        }
        if (this.f22849j.b()) {
            throw new IOException("stream finished");
        }
        if (this.f22852m != null) {
            IOException iOException = this.f22853n;
            if (iOException != null) {
                throw iOException;
            }
            as asVar = this.f22852m;
            fd.j0.f(asVar);
            throw new t41(asVar);
        }
    }

    public final void b(long j10) {
        this.f22843d = j10;
    }

    public final synchronized void b(as asVar) {
        fd.j0.i(asVar, "errorCode");
        if (this.f22852m == null) {
            this.f22852m = asVar;
            notifyAll();
        }
    }

    public final f00 c() {
        return this.f22841b;
    }

    public final void c(long j10) {
        this.f22842c = j10;
    }

    public final synchronized as d() {
        return this.f22852m;
    }

    public final void d(long j10) {
        this.f22844e = j10;
    }

    public final IOException e() {
        return this.f22853n;
    }

    public final int f() {
        return this.f22840a;
    }

    public final long g() {
        return this.f22843d;
    }

    public final long h() {
        return this.f22842c;
    }

    public final c i() {
        return this.f22850k;
    }

    public final a j() {
        synchronized (this) {
            if (!(this.f22847h || p())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f22849j;
    }

    public final a k() {
        return this.f22849j;
    }

    public final b l() {
        return this.f22848i;
    }

    public final long m() {
        return this.f22845f;
    }

    public final long n() {
        return this.f22844e;
    }

    public final c o() {
        return this.f22851l;
    }

    public final boolean p() {
        return this.f22841b.b() == ((this.f22840a & 1) == 1);
    }

    public final synchronized boolean q() {
        if (this.f22852m != null) {
            return false;
        }
        return ((this.f22848i.b() || this.f22848i.a()) && (this.f22849j.b() || this.f22849j.a()) && this.f22847h) ? false : true;
    }

    public final c r() {
        return this.f22850k;
    }

    public final synchronized ry s() throws IOException {
        ry ryVarRemoveFirst;
        this.f22850k.enter();
        while (this.f22846g.isEmpty() && this.f22852m == null) {
            try {
                t();
            } catch (Throwable th) {
                this.f22850k.a();
                throw th;
            }
        }
        this.f22850k.a();
        if (!(!this.f22846g.isEmpty())) {
            IOException iOException = this.f22853n;
            if (iOException != null) {
                throw iOException;
            }
            as asVar = this.f22852m;
            fd.j0.f(asVar);
            throw new t41(asVar);
        }
        ryVarRemoveFirst = this.f22846g.removeFirst();
        fd.j0.h(ryVarRemoveFirst, "headersQueue.removeFirst()");
        return ryVarRemoveFirst;
    }

    public final void t() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final c u() {
        return this.f22851l;
    }
}
