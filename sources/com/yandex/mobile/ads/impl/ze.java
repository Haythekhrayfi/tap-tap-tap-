package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f27290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f27291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f27292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27293d;

    public static class a implements p01 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f27294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f27296c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f27297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f27298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f27299f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f27300g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14) {
            this.f27294a = dVar;
            this.f27295b = j10;
            this.f27297d = j11;
            this.f27298e = j12;
            this.f27299f = j13;
            this.f27300g = j14;
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final p01.a b(long j10) {
            r01 r01Var = new r01(j10, c.a(this.f27294a.a(j10), this.f27296c, this.f27297d, this.f27298e, this.f27299f, this.f27300g));
            return new p01.a(r01Var, r01Var);
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final boolean b() {
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.p01
        public final long c() {
            return this.f27295b;
        }

        public final long c(long j10) {
            return this.f27294a.a(j10);
        }
    }

    public static final class b implements d {
        @Override // com.yandex.mobile.ads.impl.ze.d
        public final long a(long j10) {
            return j10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f27301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f27303c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f27304d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f27305e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f27306f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f27307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f27308h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f27301a = j10;
            this.f27302b = j11;
            this.f27304d = j12;
            this.f27305e = j13;
            this.f27306f = j14;
            this.f27307g = j15;
            this.f27303c = j16;
            this.f27308h = a(j11, j12, j13, j14, j15, j16);
        }

        public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            long j17 = j16 / 20;
            int i10 = da1.f19803a;
            return Math.max(j13, Math.min(((j16 + j13) - j15) - j17, j14 - 1));
        }

        public static long a(c cVar) {
            return cVar.f27301a;
        }

        public static void a(c cVar, long j10, long j11) {
            cVar.f27305e = j10;
            cVar.f27307g = j11;
            cVar.f27308h = a(cVar.f27302b, cVar.f27304d, j10, cVar.f27306f, j11, cVar.f27303c);
        }

        public static long b(c cVar) {
            return cVar.f27306f;
        }

        public static void b(c cVar, long j10, long j11) {
            cVar.f27304d = j10;
            cVar.f27306f = j11;
            cVar.f27308h = a(cVar.f27302b, j10, cVar.f27305e, j11, cVar.f27307g, cVar.f27303c);
        }

        public static long c(c cVar) {
            return cVar.f27307g;
        }

        public static long d(c cVar) {
            return cVar.f27308h;
        }

        public static long e(c cVar) {
            return cVar.f27302b;
        }
    }

    public interface d {
        long a(long j10);
    }

    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f27309d = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f27311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f27312c;

        private e(int i10, long j10, long j11) {
            this.f27310a = i10;
            this.f27311b = j10;
            this.f27312c = j11;
        }

        public static e a(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e a(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e b(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    public interface f {
        e a(xn xnVar, long j10) throws IOException;

        default void a() {
        }
    }

    public ze(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f27291b = fVar;
        this.f27293d = i10;
        this.f27290a = new a(dVar, j10, j11, j12, j13, j14);
    }

    public final int a(xn xnVar, cs0 cs0Var) throws IOException {
        boolean z10;
        while (true) {
            c cVar = (c) pa.b(this.f27292c);
            long jB = c.b(cVar);
            long jC = c.c(cVar);
            long jD = c.d(cVar);
            if (jC - jB <= this.f27293d) {
                this.f27292c = null;
                this.f27291b.a();
                if (jB == xnVar.getPosition()) {
                    return 0;
                }
                cs0Var.f19623a = jB;
                return 1;
            }
            long position = jD - xnVar.getPosition();
            if (position < 0 || position > 262144) {
                z10 = false;
            } else {
                xnVar.a((int) position);
                z10 = true;
            }
            if (!z10) {
                if (jD == xnVar.getPosition()) {
                    return 0;
                }
                cs0Var.f19623a = jD;
                return 1;
            }
            xnVar.c();
            e eVarA = this.f27291b.a(xnVar, c.e(cVar));
            int i10 = eVarA.f27310a;
            if (i10 == -3) {
                this.f27292c = null;
                this.f27291b.a();
                if (jD == xnVar.getPosition()) {
                    return 0;
                }
                cs0Var.f19623a = jD;
                return 1;
            }
            if (i10 == -2) {
                c.b(cVar, eVarA.f27311b, eVarA.f27312c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = eVarA.f27312c - xnVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        xnVar.a((int) position2);
                    }
                    this.f27292c = null;
                    this.f27291b.a();
                    long j10 = eVarA.f27312c;
                    if (j10 == xnVar.getPosition()) {
                        return 0;
                    }
                    cs0Var.f19623a = j10;
                    return 1;
                }
                c.a(cVar, eVarA.f27311b, eVarA.f27312c);
            }
        }
    }

    public final a a() {
        return this.f27290a;
    }

    public final void a(long j10) {
        c cVar = this.f27292c;
        if (cVar == null || c.a(cVar) != j10) {
            this.f27292c = new c(j10, this.f27290a.c(j10), this.f27290a.f27296c, this.f27290a.f27297d, this.f27290a.f27298e, this.f27290a.f27299f, this.f27290a.f27300g);
        }
    }

    public final boolean b() {
        return this.f27292c != null;
    }
}
