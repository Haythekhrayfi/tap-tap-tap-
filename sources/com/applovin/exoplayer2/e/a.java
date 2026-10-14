package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0083a f5197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f5198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f5199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5200d;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.a$a, reason: collision with other inner class name */
    public static class C0083a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f5201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f5202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f5203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f5204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f5205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f5206f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f5207g;

        public C0083a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f5201a = dVar;
            this.f5202b = j10;
            this.f5203c = j11;
            this.f5204d = j12;
            this.f5205e = j13;
            this.f5206f = j14;
            this.f5207g = j15;
        }

        @Override // com.applovin.exoplayer2.e.v
        public v.a a(long j10) {
            return new v.a(new w(j10, c.a(this.f5201a.timeUsToTargetTime(j10), this.f5203c, this.f5204d, this.f5205e, this.f5206f, this.f5207g)));
        }

        @Override // com.applovin.exoplayer2.e.v
        public boolean a() {
            return true;
        }

        @Override // com.applovin.exoplayer2.e.v
        public long b() {
            return this.f5202b;
        }

        public long b(long j10) {
            return this.f5201a.timeUsToTargetTime(j10);
        }
    }

    public static final class b implements d {
        @Override // com.applovin.exoplayer2.e.a.d
        public long timeUsToTargetTime(long j10) {
            return j10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f5208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f5209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f5210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f5211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f5212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f5213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f5214g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f5215h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f5208a = j10;
            this.f5209b = j11;
            this.f5211d = j12;
            this.f5212e = j13;
            this.f5213f = j14;
            this.f5214g = j15;
            this.f5210c = j16;
            this.f5215h = a(j11, j12, j13, j14, j15, j16);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a() {
            return this.f5213f;
        }

        public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return ai.a(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10, long j11) {
            this.f5211d = j10;
            this.f5213f = j11;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f5214g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10, long j11) {
            this.f5212e = j10;
            this.f5214g = j11;
            f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long c() {
            return this.f5209b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long d() {
            return this.f5208a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long e() {
            return this.f5215h;
        }

        private void f() {
            this.f5215h = a(this.f5209b, this.f5211d, this.f5212e, this.f5213f, this.f5214g, this.f5210c);
        }
    }

    public interface d {
        long timeUsToTargetTime(long j10);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f5216a = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f5218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f5219d;

        private e(int i10, long j10, long j11) {
            this.f5217b = i10;
            this.f5218c = j10;
            this.f5219d = j11;
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
        e a(i iVar, long j10) throws IOException;

        default void a() {
        }
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f5198b = fVar;
        this.f5200d = i10;
        this.f5197a = new C0083a(dVar, j10, j11, j12, j13, j14, j15);
    }

    public final int a(i iVar, long j10, u uVar) {
        if (j10 == iVar.c()) {
            return 0;
        }
        uVar.f6134a = j10;
        return 1;
    }

    public int a(i iVar, u uVar) throws IOException {
        while (true) {
            c cVar = (c) com.applovin.exoplayer2.l.a.a(this.f5199c);
            long jA = cVar.a();
            long jB = cVar.b();
            long jE = cVar.e();
            if (jB - jA <= this.f5200d) {
                a(false, jA);
                return a(iVar, jA, uVar);
            }
            if (!a(iVar, jE)) {
                return a(iVar, jE, uVar);
            }
            iVar.a();
            e eVarA = this.f5198b.a(iVar, cVar.c());
            int i10 = eVarA.f5217b;
            if (i10 == -3) {
                a(false, jE);
                return a(iVar, jE, uVar);
            }
            if (i10 == -2) {
                cVar.a(eVarA.f5218c, eVarA.f5219d);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    a(iVar, eVarA.f5219d);
                    a(true, eVarA.f5219d);
                    return a(iVar, eVarA.f5219d, uVar);
                }
                cVar.b(eVarA.f5218c, eVarA.f5219d);
            }
        }
    }

    public final v a() {
        return this.f5197a;
    }

    public final void a(long j10) {
        c cVar = this.f5199c;
        if (cVar == null || cVar.d() != j10) {
            this.f5199c = b(j10);
        }
    }

    public final void a(boolean z10, long j10) {
        this.f5199c = null;
        this.f5198b.a();
        b(z10, j10);
    }

    public final boolean a(i iVar, long j10) throws IOException {
        long jC = j10 - iVar.c();
        if (jC < 0 || jC > 262144) {
            return false;
        }
        iVar.b((int) jC);
        return true;
    }

    public c b(long j10) {
        return new c(j10, this.f5197a.b(j10), this.f5197a.f5203c, this.f5197a.f5204d, this.f5197a.f5205e, this.f5197a.f5206f, this.f5197a.f5207g);
    }

    public void b(boolean z10, long j10) {
    }

    public final boolean b() {
        return this.f5199c != null;
    }
}
