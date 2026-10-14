package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ex0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nw0 f20353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nt0 f20354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ny f20357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ry f20358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ix0 f20359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ex0 f20360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ex0 f20361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ex0 f20362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f20363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f20364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final gs f20365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private fg f20366n;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private nw0 f20367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private nt0 f20368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f20370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ny f20371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ry.a f20372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ix0 f20373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ex0 f20374h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ex0 f20375i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ex0 f20376j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f20377k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f20378l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private gs f20379m;

        public a() {
            this.f20369c = -1;
            this.f20372f = new ry.a();
        }

        public a(ex0 ex0Var) {
            fd.j0.i(ex0Var, "response");
            this.f20369c = -1;
            this.f20367a = ex0Var.p();
            this.f20368b = ex0Var.n();
            this.f20369c = ex0Var.e();
            this.f20370d = ex0Var.j();
            this.f20371e = ex0Var.g();
            this.f20372f = ex0Var.h().b();
            this.f20373g = ex0Var.a();
            this.f20374h = ex0Var.k();
            this.f20375i = ex0Var.c();
            this.f20376j = ex0Var.m();
            this.f20377k = ex0Var.q();
            this.f20378l = ex0Var.o();
            this.f20379m = ex0Var.f();
        }

        private static void a(ex0 ex0Var, String str) {
            if (ex0Var != null) {
                if (!(ex0Var.a() == null)) {
                    throw new IllegalArgumentException(fn1.a(str, ".body != null").toString());
                }
                if (!(ex0Var.k() == null)) {
                    throw new IllegalArgumentException(fn1.a(str, ".networkResponse != null").toString());
                }
                if (!(ex0Var.c() == null)) {
                    throw new IllegalArgumentException(fn1.a(str, ".cacheResponse != null").toString());
                }
                if (!(ex0Var.m() == null)) {
                    throw new IllegalArgumentException(fn1.a(str, ".priorResponse != null").toString());
                }
            }
        }

        public final a a(int i10) {
            this.f20369c = i10;
            return this;
        }

        public final a a(long j10) {
            this.f20378l = j10;
            return this;
        }

        public final a a(ex0 ex0Var) {
            a(ex0Var, "cacheResponse");
            this.f20375i = ex0Var;
            return this;
        }

        public final a a(ix0 ix0Var) {
            this.f20373g = ix0Var;
            return this;
        }

        public final a a(nt0 nt0Var) {
            fd.j0.i(nt0Var, "protocol");
            this.f20368b = nt0Var;
            return this;
        }

        public final a a(nw0 nw0Var) {
            fd.j0.i(nw0Var, "request");
            this.f20367a = nw0Var;
            return this;
        }

        public final a a(ny nyVar) {
            this.f20371e = nyVar;
            return this;
        }

        public final a a(ry ryVar) {
            fd.j0.i(ryVar, "headers");
            this.f20372f = ryVar.b();
            return this;
        }

        public final ex0 a() {
            int i10 = this.f20369c;
            if (!(i10 >= 0)) {
                StringBuilder sbA = v60.a("code < 0: ");
                sbA.append(this.f20369c);
                throw new IllegalStateException(sbA.toString().toString());
            }
            nw0 nw0Var = this.f20367a;
            if (nw0Var == null) {
                throw new IllegalStateException("request == null".toString());
            }
            nt0 nt0Var = this.f20368b;
            if (nt0Var == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f20370d;
            if (str != null) {
                return new ex0(nw0Var, nt0Var, str, i10, this.f20371e, this.f20372f.a(), this.f20373g, this.f20374h, this.f20375i, this.f20376j, this.f20377k, this.f20378l, this.f20379m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public final void a(gs gsVar) {
            fd.j0.i(gsVar, "deferredTrailers");
            this.f20379m = gsVar;
        }

        public final void a(String str) {
            fd.j0.i(str, "value");
            this.f20372f.a("Warning", str);
        }

        public final int b() {
            return this.f20369c;
        }

        public final a b(long j10) {
            this.f20377k = j10;
            return this;
        }

        public final a b(ex0 ex0Var) {
            a(ex0Var, "networkResponse");
            this.f20374h = ex0Var;
            return this;
        }

        public final a b(String str) {
            fd.j0.i(str, "message");
            this.f20370d = str;
            return this;
        }

        public final a c() {
            this.f20372f.c("Proxy-Authenticate", "OkHttp-Preemptive");
            return this;
        }

        public final a c(ex0 ex0Var) {
            if (!(ex0Var.a() == null)) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
            this.f20376j = ex0Var;
            return this;
        }
    }

    public ex0(nw0 nw0Var, nt0 nt0Var, String str, int i10, ny nyVar, ry ryVar, ix0 ix0Var, ex0 ex0Var, ex0 ex0Var2, ex0 ex0Var3, long j10, long j11, gs gsVar) {
        fd.j0.i(nw0Var, "request");
        fd.j0.i(nt0Var, "protocol");
        fd.j0.i(str, "message");
        fd.j0.i(ryVar, "headers");
        this.f20353a = nw0Var;
        this.f20354b = nt0Var;
        this.f20355c = str;
        this.f20356d = i10;
        this.f20357e = nyVar;
        this.f20358f = ryVar;
        this.f20359g = ix0Var;
        this.f20360h = ex0Var;
        this.f20361i = ex0Var2;
        this.f20362j = ex0Var3;
        this.f20363k = j10;
        this.f20364l = j11;
        this.f20365m = gsVar;
    }

    public static String a(ex0 ex0Var, String str) {
        Objects.requireNonNull(ex0Var);
        fd.j0.i(str, "name");
        String strA = ex0Var.f20358f.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    public final ix0 a() {
        return this.f20359g;
    }

    public final fg b() {
        fg fgVar = this.f20366n;
        if (fgVar != null) {
            return fgVar;
        }
        int i10 = fg.f20689n;
        fg fgVarA = fg.b.a(this.f20358f);
        this.f20366n = fgVarA;
        return fgVarA;
    }

    public final ex0 c() {
        return this.f20361i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ix0 ix0Var = this.f20359g;
        if (ix0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        ea1.a((Closeable) ix0Var.d());
    }

    public final List<nh> d() {
        String str;
        ry ryVar = this.f20358f;
        int i10 = this.f20356d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return kc.w.f32009c;
            }
            str = "Proxy-Authenticate";
        }
        return w00.a(ryVar, str);
    }

    public final int e() {
        return this.f20356d;
    }

    public final gs f() {
        return this.f20365m;
    }

    public final ny g() {
        return this.f20357e;
    }

    public final ry h() {
        return this.f20358f;
    }

    public final boolean i() {
        int i10 = this.f20356d;
        return 200 <= i10 && i10 < 300;
    }

    public final String j() {
        return this.f20355c;
    }

    public final ex0 k() {
        return this.f20360h;
    }

    public final a l() {
        return new a(this);
    }

    public final ex0 m() {
        return this.f20362j;
    }

    public final nt0 n() {
        return this.f20354b;
    }

    public final long o() {
        return this.f20364l;
    }

    public final nw0 p() {
        return this.f20353a;
    }

    public final long q() {
        return this.f20363k;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("Response{protocol=");
        sbA.append(this.f20354b);
        sbA.append(", code=");
        sbA.append(this.f20356d);
        sbA.append(", message=");
        sbA.append(this.f20355c);
        sbA.append(", url=");
        sbA.append(this.f20353a.h());
        sbA.append('}');
        return sbA.toString();
    }
}
