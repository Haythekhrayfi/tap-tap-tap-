package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wu0 f21144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cs f21145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final is f21146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final hs f21147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final xu0 f21149f;

    public final class a extends qd.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f21150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f21151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f21152c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f21153d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ gs f21154e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gs gsVar, qd.y yVar, long j10) {
            super(yVar);
            fd.j0.i(yVar, "delegate");
            this.f21154e = gsVar;
            this.f21150a = j10;
        }

        @Override // qd.i, qd.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f21153d) {
                return;
            }
            this.f21153d = true;
            long j10 = this.f21150a;
            if (j10 != -1 && this.f21152c != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                if (this.f21151b) {
                    return;
                }
                this.f21151b = true;
                this.f21154e.a(this.f21152c, false, true, null);
            } catch (IOException e10) {
                if (this.f21151b) {
                    throw e10;
                }
                this.f21151b = true;
                throw this.f21154e.a(this.f21152c, false, true, e10);
            }
        }

        @Override // qd.i, qd.y, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                if (this.f21151b) {
                    throw e10;
                }
                this.f21151b = true;
                throw this.f21154e.a(this.f21152c, false, true, e10);
            }
        }

        @Override // qd.i, qd.y
        public final void write(qd.c cVar, long j10) throws IOException {
            fd.j0.i(cVar, "source");
            if (!(!this.f21153d)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f21150a;
            if (j11 != -1 && this.f21152c + j10 > j11) {
                StringBuilder sbA = v60.a("expected ");
                sbA.append(this.f21150a);
                sbA.append(" bytes but received ");
                sbA.append(this.f21152c + j10);
                throw new ProtocolException(sbA.toString());
            }
            try {
                super.write(cVar, j10);
                this.f21152c += j10;
            } catch (IOException e10) {
                if (this.f21151b) {
                    throw e10;
                }
                this.f21151b = true;
                throw this.f21154e.a(this.f21152c, false, true, e10);
            }
        }
    }

    public final class b extends qd.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f21155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f21156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f21157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f21158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f21159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ gs f21160f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gs gsVar, qd.a0 a0Var, long j10) {
            super(a0Var);
            fd.j0.i(a0Var, "delegate");
            this.f21160f = gsVar;
            this.f21155a = j10;
            this.f21157c = true;
            if (j10 == 0) {
                a(null);
            }
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f21158d) {
                return e10;
            }
            this.f21158d = true;
            if (e10 == null && this.f21157c) {
                this.f21157c = false;
                cs csVarG = this.f21160f.g();
                wu0 wu0VarE = this.f21160f.e();
                Objects.requireNonNull(csVarG);
                cs.e(wu0VarE);
            }
            return (E) this.f21160f.a(this.f21156b, true, false, e10);
        }

        @Override // qd.j, qd.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f21159e) {
                return;
            }
            this.f21159e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // qd.j, qd.a0
        public final long read(qd.c cVar, long j10) throws IOException {
            fd.j0.i(cVar, "sink");
            if (!(!this.f21159e)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long j11 = delegate().read(cVar, j10);
                if (this.f21157c) {
                    this.f21157c = false;
                    cs csVarG = this.f21160f.g();
                    wu0 wu0VarE = this.f21160f.e();
                    Objects.requireNonNull(csVarG);
                    cs.e(wu0VarE);
                }
                if (j11 == -1) {
                    a(null);
                    return -1L;
                }
                long j12 = this.f21156b + j11;
                long j13 = this.f21155a;
                if (j13 != -1 && j12 > j13) {
                    throw new ProtocolException("expected " + this.f21155a + " bytes but received " + j12);
                }
                this.f21156b = j12;
                if (j12 == j13) {
                    a(null);
                }
                return j11;
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    public gs(wu0 wu0Var, cs csVar, is isVar, hs hsVar) {
        fd.j0.i(wu0Var, "call");
        fd.j0.i(csVar, "eventListener");
        fd.j0.i(isVar, "finder");
        fd.j0.i(hsVar, "codec");
        this.f21144a = wu0Var;
        this.f21145b = csVar;
        this.f21146c = isVar;
        this.f21147d = hsVar;
        this.f21149f = hsVar.c();
    }

    public final dv0 a(ex0 ex0Var) throws IOException {
        fd.j0.i(ex0Var, "response");
        try {
            String strA = ex0.a(ex0Var, "Content-Type");
            long jB = this.f21147d.b(ex0Var);
            return new dv0(strA, jB, qd.o.c(new b(this, this.f21147d.a(ex0Var), jB)));
        } catch (IOException e10) {
            cs csVar = this.f21145b;
            wu0 wu0Var = this.f21144a;
            Objects.requireNonNull(csVar);
            cs.b(wu0Var, e10);
            this.f21146c.a(e10);
            this.f21147d.c().a(this.f21144a, e10);
            throw e10;
        }
    }

    public final ex0.a a(boolean z10) throws IOException {
        try {
            ex0.a aVarA = this.f21147d.a(z10);
            if (aVarA != null) {
                aVarA.a(this);
            }
            return aVarA;
        } catch (IOException e10) {
            cs csVar = this.f21145b;
            wu0 wu0Var = this.f21144a;
            Objects.requireNonNull(csVar);
            cs.b(wu0Var, e10);
            this.f21146c.a(e10);
            this.f21147d.c().a(this.f21144a, e10);
            throw e10;
        }
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            this.f21146c.a(e10);
            this.f21147d.c().a(this.f21144a, e10);
        }
        if (z11) {
            cs csVar = this.f21145b;
            wu0 wu0Var = this.f21144a;
            Objects.requireNonNull(csVar);
            if (e10 != null) {
                cs.a(wu0Var, (IOException) e10);
            } else {
                cs.a(wu0Var);
            }
        }
        if (z10) {
            cs csVar2 = this.f21145b;
            wu0 wu0Var2 = this.f21144a;
            Objects.requireNonNull(csVar2);
            if (e10 != null) {
                cs.b(wu0Var2, e10);
            } else {
                cs.d(wu0Var2);
            }
        }
        return (E) this.f21144a.a(this, z11, z10, e10);
    }

    public final qd.y a(nw0 nw0Var) throws IOException {
        fd.j0.i(nw0Var, "request");
        this.f21148e = false;
        qw0 qw0VarA = nw0Var.a();
        fd.j0.f(qw0VarA);
        long jA = qw0VarA.a();
        cs csVar = this.f21145b;
        wu0 wu0Var = this.f21144a;
        Objects.requireNonNull(csVar);
        cs.b(wu0Var);
        return new a(this, this.f21147d.a(nw0Var, jA), jA);
    }

    public final void a() {
        this.f21147d.cancel();
    }

    public final void b() {
        this.f21147d.cancel();
        this.f21144a.a(this, true, true, null);
    }

    public final void b(ex0 ex0Var) {
        fd.j0.i(ex0Var, "response");
        cs csVar = this.f21145b;
        wu0 wu0Var = this.f21144a;
        Objects.requireNonNull(csVar);
        cs.a(wu0Var, ex0Var);
    }

    public final void b(nw0 nw0Var) throws IOException {
        fd.j0.i(nw0Var, "request");
        try {
            cs csVar = this.f21145b;
            wu0 wu0Var = this.f21144a;
            Objects.requireNonNull(csVar);
            cs.c(wu0Var);
            this.f21147d.a(nw0Var);
            cs csVar2 = this.f21145b;
            wu0 wu0Var2 = this.f21144a;
            Objects.requireNonNull(csVar2);
            cs.a(wu0Var2, nw0Var);
        } catch (IOException e10) {
            cs csVar3 = this.f21145b;
            wu0 wu0Var3 = this.f21144a;
            Objects.requireNonNull(csVar3);
            cs.a(wu0Var3, e10);
            this.f21146c.a(e10);
            this.f21147d.c().a(this.f21144a, e10);
            throw e10;
        }
    }

    public final void c() throws IOException {
        try {
            this.f21147d.a();
        } catch (IOException e10) {
            cs csVar = this.f21145b;
            wu0 wu0Var = this.f21144a;
            Objects.requireNonNull(csVar);
            cs.a(wu0Var, e10);
            this.f21146c.a(e10);
            this.f21147d.c().a(this.f21144a, e10);
            throw e10;
        }
    }

    public final void d() throws IOException {
        try {
            this.f21147d.b();
        } catch (IOException e10) {
            cs csVar = this.f21145b;
            wu0 wu0Var = this.f21144a;
            Objects.requireNonNull(csVar);
            cs.a(wu0Var, e10);
            this.f21146c.a(e10);
            this.f21147d.c().a(this.f21144a, e10);
            throw e10;
        }
    }

    public final wu0 e() {
        return this.f21144a;
    }

    public final xu0 f() {
        return this.f21149f;
    }

    public final cs g() {
        return this.f21145b;
    }

    public final is h() {
        return this.f21146c;
    }

    public final boolean i() {
        return !fd.j0.d(this.f21146c.a().k().g(), this.f21149f.k().a().k().g());
    }

    public final boolean j() {
        return this.f21148e;
    }

    public final void k() {
        this.f21147d.c().j();
    }

    public final void l() {
        this.f21144a.a(this, true, false, null);
    }

    public final void m() {
        cs csVar = this.f21145b;
        wu0 wu0Var = this.f21144a;
        Objects.requireNonNull(csVar);
        cs.f(wu0Var);
    }
}
