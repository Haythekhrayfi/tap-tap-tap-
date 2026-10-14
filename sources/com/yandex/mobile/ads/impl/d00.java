package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class d00 implements hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yn0 f19696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xu0 f19697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.f f19698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qd.e f19699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sy f19701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ry f19702g;

    public abstract class a implements qd.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qd.k f19703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19704b;

        public a() {
            this.f19703a = new qd.k(d00.this.f19698c.timeout());
        }

        public final boolean a() {
            return this.f19704b;
        }

        public final void b() {
            if (d00.this.f19700e == 6) {
                return;
            }
            if (d00.this.f19700e == 5) {
                d00.a(d00.this, this.f19703a);
                d00.this.f19700e = 6;
            } else {
                StringBuilder sbA = v60.a("state: ");
                sbA.append(d00.this.f19700e);
                throw new IllegalStateException(sbA.toString());
            }
        }

        public final void c() {
            this.f19704b = true;
        }

        @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        @Override // qd.a0
        public long read(qd.c cVar, long j10) throws IOException {
            fd.j0.i(cVar, "sink");
            try {
                return d00.this.f19698c.read(cVar, j10);
            } catch (IOException e10) {
                d00.this.c().j();
                b();
                throw e10;
            }
        }

        @Override // qd.a0
        public final qd.b0 timeout() {
            return this.f19703a;
        }
    }

    public final class b implements qd.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qd.k f19706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19707b;

        public b() {
            this.f19706a = new qd.k(d00.this.f19699d.timeout());
        }

        @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f19707b) {
                return;
            }
            this.f19707b = true;
            d00.this.f19699d.E("0\r\n\r\n");
            d00.a(d00.this, this.f19706a);
            d00.this.f19700e = 3;
        }

        @Override // qd.y, java.io.Flushable
        public final synchronized void flush() {
            if (this.f19707b) {
                return;
            }
            d00.this.f19699d.flush();
        }

        @Override // qd.y
        public final qd.b0 timeout() {
            return this.f19706a;
        }

        @Override // qd.y
        public final void write(qd.c cVar, long j10) throws IOException {
            fd.j0.i(cVar, "source");
            if (!(!this.f19707b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            d00.this.f19699d.H(j10);
            d00.this.f19699d.E("\r\n");
            d00.this.f19699d.write(cVar, j10);
            d00.this.f19699d.E("\r\n");
        }
    }

    public final class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d10 f19709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f19710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f19711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ d00 f19712g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d00 d00Var, d10 d10Var) {
            super();
            fd.j0.i(d10Var, ImagesContract.URL);
            this.f19712g = d00Var;
            this.f19709d = d10Var;
            this.f19710e = -1L;
            this.f19711f = true;
        }

        @Override // com.yandex.mobile.ads.impl.d00.a, qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (a()) {
                return;
            }
            if (this.f19711f && !ea1.a(this, TimeUnit.MILLISECONDS)) {
                this.f19712g.c().j();
                b();
            }
            c();
        }

        @Override // com.yandex.mobile.ads.impl.d00.a, qd.a0
        public final long read(qd.c cVar, long j10) throws IOException {
            fd.j0.i(cVar, "sink");
            boolean z10 = true;
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f19711f) {
                return -1L;
            }
            long j11 = this.f19710e;
            if (j11 == 0 || j11 == -1) {
                if (j11 != -1) {
                    this.f19712g.f19698c.M();
                }
                try {
                    this.f19710e = this.f19712g.f19698c.Z();
                    String string = ed.u.Y(this.f19712g.f19698c.M()).toString();
                    if (this.f19710e >= 0) {
                        if (string.length() <= 0) {
                            z10 = false;
                        }
                        if (!z10 || ed.q.u(string, ";", false, 2)) {
                            if (this.f19710e == 0) {
                                this.f19711f = false;
                                d00 d00Var = this.f19712g;
                                d00Var.f19702g = d00Var.f19701f.a();
                                yn0 yn0Var = this.f19712g.f19696a;
                                fd.j0.f(yn0Var);
                                jl jlVarH = yn0Var.h();
                                d10 d10Var = this.f19709d;
                                ry ryVar = this.f19712g.f19702g;
                                fd.j0.f(ryVar);
                                w00.a(jlVarH, d10Var, ryVar);
                                b();
                            }
                            if (!this.f19711f) {
                                return -1L;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f19710e + string + CoreConstants.DOUBLE_QUOTE_CHAR);
                } catch (NumberFormatException e10) {
                    throw new ProtocolException(e10.getMessage());
                }
            }
            long j12 = super.read(cVar, Math.min(j10, this.f19710e));
            if (j12 != -1) {
                this.f19710e -= j12;
                return j12;
            }
            this.f19712g.c().j();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
    }

    public final class d extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f19713d;

        public d(long j10) {
            super();
            this.f19713d = j10;
            if (j10 == 0) {
                b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.d00.a, qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (a()) {
                return;
            }
            if (this.f19713d != 0 && !ea1.a(this, TimeUnit.MILLISECONDS)) {
                d00.this.c().j();
                b();
            }
            c();
        }

        @Override // com.yandex.mobile.ads.impl.d00.a, qd.a0
        public final long read(qd.c cVar, long j10) throws IOException {
            fd.j0.i(cVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f19713d;
            if (j11 == 0) {
                return -1L;
            }
            long j12 = super.read(cVar, Math.min(j11, j10));
            if (j12 == -1) {
                d00.this.c().j();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j13 = this.f19713d - j12;
            this.f19713d = j13;
            if (j13 == 0) {
                b();
            }
            return j12;
        }
    }

    public final class e implements qd.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qd.k f19715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19716b;

        public e() {
            this.f19715a = new qd.k(d00.this.f19699d.timeout());
        }

        @Override // qd.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f19716b) {
                return;
            }
            this.f19716b = true;
            d00.a(d00.this, this.f19715a);
            d00.this.f19700e = 3;
        }

        @Override // qd.y, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f19716b) {
                return;
            }
            d00.this.f19699d.flush();
        }

        @Override // qd.y
        public final qd.b0 timeout() {
            return this.f19715a;
        }

        @Override // qd.y
        public final void write(qd.c cVar, long j10) throws IOException {
            fd.j0.i(cVar, "source");
            if (!(!this.f19716b)) {
                throw new IllegalStateException("closed".toString());
            }
            ea1.a(cVar.f34879d, 0L, j10);
            d00.this.f19699d.write(cVar, j10);
        }
    }

    public final class f extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f19718d;

        public f(d00 d00Var) {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.d00.a, qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (a()) {
                return;
            }
            if (!this.f19718d) {
                b();
            }
            c();
        }

        @Override // com.yandex.mobile.ads.impl.d00.a, qd.a0
        public final long read(qd.c cVar, long j10) throws IOException {
            fd.j0.i(cVar, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f19718d) {
                return -1L;
            }
            long j11 = super.read(cVar, j10);
            if (j11 != -1) {
                return j11;
            }
            this.f19718d = true;
            b();
            return -1L;
        }
    }

    public d00(yn0 yn0Var, xu0 xu0Var, qd.f fVar, qd.e eVar) {
        fd.j0.i(xu0Var, "connection");
        fd.j0.i(fVar, "source");
        fd.j0.i(eVar, "sink");
        this.f19696a = yn0Var;
        this.f19697b = xu0Var;
        this.f19698c = fVar;
        this.f19699d = eVar;
        this.f19701f = new sy(fVar);
    }

    private final qd.a0 a(long j10) {
        if (this.f19700e == 4) {
            this.f19700e = 5;
            return new d(j10);
        }
        StringBuilder sbA = v60.a("state: ");
        sbA.append(this.f19700e);
        throw new IllegalStateException(sbA.toString().toString());
    }

    public static final void a(d00 d00Var, qd.k kVar) {
        Objects.requireNonNull(d00Var);
        qd.b0 b0Var = kVar.f34900a;
        qd.b0 b0Var2 = qd.b0.NONE;
        fd.j0.i(b0Var2, "delegate");
        kVar.f34900a = b0Var2;
        b0Var.clearDeadline();
        b0Var.clearTimeout();
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final ex0.a a(boolean z10) {
        int i10 = this.f19700e;
        boolean z11 = true;
        if (i10 != 1 && i10 != 3) {
            z11 = false;
        }
        if (!z11) {
            StringBuilder sbA = v60.a("state: ");
            sbA.append(this.f19700e);
            throw new IllegalStateException(sbA.toString().toString());
        }
        try {
            p41 p41VarA = p41.a.a(this.f19701f.b());
            ex0.a aVarA = new ex0.a().a(p41VarA.f23980a).a(p41VarA.f23981b).b(p41VarA.f23982c).a(this.f19701f.a());
            if (z10 && p41VarA.f23981b == 100) {
                return null;
            }
            if (p41VarA.f23981b == 100) {
                this.f19700e = 3;
                return aVarA;
            }
            this.f19700e = 4;
            return aVarA;
        } catch (EOFException e10) {
            throw new IOException(fn1.a("unexpected end of stream on ", this.f19697b.k().a().k().k()), e10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final qd.a0 a(ex0 ex0Var) {
        fd.j0.i(ex0Var, "response");
        if (!w00.a(ex0Var)) {
            return a(0L);
        }
        if (ed.q.i("chunked", ex0.a(ex0Var, "Transfer-Encoding"), true)) {
            d10 d10VarH = ex0Var.p().h();
            if (this.f19700e == 4) {
                this.f19700e = 5;
                return new c(this, d10VarH);
            }
            StringBuilder sbA = v60.a("state: ");
            sbA.append(this.f19700e);
            throw new IllegalStateException(sbA.toString().toString());
        }
        long jA = ea1.a(ex0Var);
        if (jA != -1) {
            return a(jA);
        }
        if (this.f19700e == 4) {
            this.f19700e = 5;
            this.f19697b.j();
            return new f(this);
        }
        StringBuilder sbA2 = v60.a("state: ");
        sbA2.append(this.f19700e);
        throw new IllegalStateException(sbA2.toString().toString());
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final qd.y a(nw0 nw0Var, long j10) {
        fd.j0.i(nw0Var, "request");
        if (nw0Var.a() != null) {
            Objects.requireNonNull(nw0Var.a());
        }
        if (ed.q.i("chunked", nw0Var.a("Transfer-Encoding"), true)) {
            if (this.f19700e == 1) {
                this.f19700e = 2;
                return new b();
            }
            StringBuilder sbA = v60.a("state: ");
            sbA.append(this.f19700e);
            throw new IllegalStateException(sbA.toString().toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f19700e == 1) {
            this.f19700e = 2;
            return new e();
        }
        StringBuilder sbA2 = v60.a("state: ");
        sbA2.append(this.f19700e);
        throw new IllegalStateException(sbA2.toString().toString());
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final void a() {
        this.f19699d.flush();
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final void a(nw0 nw0Var) {
        fd.j0.i(nw0Var, "request");
        Proxy.Type type = this.f19697b.k().b().type();
        fd.j0.h(type, "connection.route().proxy.type()");
        a(nw0Var.d(), tw0.a(nw0Var, type));
    }

    public final void a(ry ryVar, String str) {
        fd.j0.i(ryVar, "headers");
        fd.j0.i(str, "requestLine");
        if (!(this.f19700e == 0)) {
            StringBuilder sbA = v60.a("state: ");
            sbA.append(this.f19700e);
            throw new IllegalStateException(sbA.toString().toString());
        }
        this.f19699d.E(str).E("\r\n");
        int size = ryVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19699d.E(ryVar.a(i10)).E(": ").E(ryVar.b(i10)).E("\r\n");
        }
        this.f19699d.E("\r\n");
        this.f19700e = 1;
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final long b(ex0 ex0Var) {
        fd.j0.i(ex0Var, "response");
        if (!w00.a(ex0Var)) {
            return 0L;
        }
        if (ed.q.i("chunked", ex0.a(ex0Var, "Transfer-Encoding"), true)) {
            return -1L;
        }
        return ea1.a(ex0Var);
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final void b() throws IOException {
        this.f19699d.flush();
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final xu0 c() {
        return this.f19697b;
    }

    public final void c(ex0 ex0Var) {
        fd.j0.i(ex0Var, "response");
        long jA = ea1.a(ex0Var);
        if (jA == -1) {
            return;
        }
        qd.a0 a0VarA = a(jA);
        ea1.a(a0VarA, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        ((d) a0VarA).close();
    }

    @Override // com.yandex.mobile.ads.impl.hs
    public final void cancel() {
        this.f19697b.a();
    }
}
