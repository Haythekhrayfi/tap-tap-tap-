package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements n, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f6525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n.a f6528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a[] f6529e = new a[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f6530f;

    public final class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f6531a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6533c;

        public a(x xVar) {
            this.f6531a = xVar;
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(long j10) {
            if (d.this.g()) {
                return -3;
            }
            return this.f6531a.a(j10);
        }

        @Override // com.applovin.exoplayer2.h.x
        public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i10) {
            if (d.this.g()) {
                return -3;
            }
            if (this.f6533c) {
                gVar.a_(4);
                return -4;
            }
            int iA = this.f6531a.a(wVar, gVar, i10);
            if (iA == -5) {
                com.applovin.exoplayer2.v vVar = (com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(wVar.f8240b);
                int i11 = vVar.B;
                if (i11 != 0 || vVar.C != 0) {
                    d dVar = d.this;
                    if (dVar.f6526b != 0) {
                        i11 = 0;
                    }
                    wVar.f8240b = vVar.a().n(i11).o(dVar.f6527c == Long.MIN_VALUE ? vVar.C : 0).a();
                }
                return -5;
            }
            d dVar2 = d.this;
            long j10 = dVar2.f6527c;
            if (j10 == Long.MIN_VALUE || ((iA != -4 || gVar.f4754d < j10) && !(iA == -3 && dVar2.d() == Long.MIN_VALUE && !gVar.f4753c))) {
                return iA;
            }
            gVar.a();
            gVar.a_(4);
            this.f6533c = true;
            return -4;
        }

        public void a() {
            this.f6533c = false;
        }

        @Override // com.applovin.exoplayer2.h.x
        public boolean b() {
            return !d.this.g() && this.f6531a.b();
        }

        @Override // com.applovin.exoplayer2.h.x
        public void c() throws IOException {
            this.f6531a.c();
        }
    }

    public d(n nVar, boolean z10, long j10, long j11) {
        this.f6525a = nVar;
        this.f6530f = z10 ? j10 : -9223372036854775807L;
        this.f6526b = j10;
        this.f6527c = j11;
    }

    private static boolean a(long j10, com.applovin.exoplayer2.j.d[] dVarArr) {
        if (j10 != 0) {
            for (com.applovin.exoplayer2.j.d dVar : dVarArr) {
                if (dVar != null) {
                    com.applovin.exoplayer2.v vVarF = dVar.f();
                    if (!com.applovin.exoplayer2.l.u.a(vVarF.f8198l, vVarF.f8195i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private av b(long j10, av avVar) {
        long jA = ai.a(avVar.f4301f, 0L, j10 - this.f6526b);
        long j11 = avVar.f4302g;
        long j12 = this.f6527c;
        long jA2 = ai.a(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jA == avVar.f4301f && jA2 == avVar.f4302g) ? avVar : new av(jA, jA2);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(long j10, av avVar) {
        long j11 = this.f6526b;
        if (j10 == j11) {
            return j11;
        }
        return this.f6525a.a(j10, b(j10, avVar));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    @Override // com.applovin.exoplayer2.h.n
    public long a(com.applovin.exoplayer2.j.d[] dVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        this.f6529e = new a[xVarArr.length];
        x[] xVarArr2 = new x[xVarArr.length];
        int i10 = 0;
        while (true) {
            x xVar = null;
            if (i10 >= xVarArr.length) {
                break;
            }
            a[] aVarArr = this.f6529e;
            aVarArr[i10] = (a) xVarArr[i10];
            if (aVarArr[i10] != null) {
                xVar = aVarArr[i10].f6531a;
            }
            xVarArr2[i10] = xVar;
            i10++;
        }
        long jA = this.f6525a.a(dVarArr, zArr, xVarArr2, zArr2, j10);
        if (g()) {
            long j12 = this.f6526b;
            if (j10 == j12 && a(j12, dVarArr)) {
                j11 = jA;
            } else {
                j11 = -9223372036854775807L;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        this.f6530f = j11;
        if (jA != j10) {
            if (jA >= this.f6526b) {
                long j13 = this.f6527c;
                z10 = j13 == Long.MIN_VALUE || jA <= j13;
            }
        }
        com.applovin.exoplayer2.l.a.b(z10);
        for (int i11 = 0; i11 < xVarArr.length; i11++) {
            if (xVarArr2[i11] == null) {
                this.f6529e[i11] = null;
            } else {
                a[] aVarArr2 = this.f6529e;
                if (aVarArr2[i11] == null || aVarArr2[i11].f6531a != xVarArr2[i11]) {
                    aVarArr2[i11] = new a(xVarArr2[i11]);
                }
            }
            xVarArr[i11] = this.f6529e[i11];
        }
        return jA;
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10) {
        this.f6525a.a(j10);
    }

    public void a(long j10, long j11) {
        this.f6526b = j10;
        this.f6527c = j11;
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10, boolean z10) {
        this.f6525a.a(j10, z10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(n.a aVar, long j10) {
        this.f6528d = aVar;
        this.f6525a.a(this, j10);
    }

    @Override // com.applovin.exoplayer2.h.n.a
    public void a(n nVar) {
        ((n.a) com.applovin.exoplayer2.l.a.b(this.f6528d)).a((n) this);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.applovin.exoplayer2.h.n
    public long b(long j10) {
        this.f6530f = -9223372036854775807L;
        boolean z10 = false;
        for (a aVar : this.f6529e) {
            if (aVar != null) {
                aVar.a();
            }
        }
        long jB = this.f6525a.b(j10);
        if (jB == j10) {
            z10 = true;
        } else if (jB >= this.f6526b) {
            long j11 = this.f6527c;
            if (j11 == Long.MIN_VALUE || jB <= j11) {
                z10 = true;
            }
        }
        com.applovin.exoplayer2.l.a.b(z10);
        return jB;
    }

    @Override // com.applovin.exoplayer2.h.n
    public ad b() {
        return this.f6525a.b();
    }

    @Override // com.applovin.exoplayer2.h.y.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(n nVar) {
        ((n.a) com.applovin.exoplayer2.l.a.b(this.f6528d)).a(this);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long c() {
        if (g()) {
            long j10 = this.f6530f;
            this.f6530f = -9223372036854775807L;
            long jC = c();
            return jC != -9223372036854775807L ? jC : j10;
        }
        long jC2 = this.f6525a.c();
        if (jC2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        com.applovin.exoplayer2.l.a.b(jC2 >= this.f6526b);
        long j11 = this.f6527c;
        if (j11 != Long.MIN_VALUE && jC2 > j11) {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.b(z10);
        return jC2;
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean c(long j10) {
        return this.f6525a.c(j10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long d() {
        long jD = this.f6525a.d();
        if (jD != Long.MIN_VALUE) {
            long j10 = this.f6527c;
            if (j10 == Long.MIN_VALUE || jD < j10) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long e() {
        long jE = this.f6525a.e();
        if (jE != Long.MIN_VALUE) {
            long j10 = this.f6527c;
            if (j10 == Long.MIN_VALUE || jE < j10) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.applovin.exoplayer2.h.n
    public void e_() throws IOException {
        this.f6525a.e_();
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean f() {
        return this.f6525a.f();
    }

    public boolean g() {
        return this.f6530f != -9223372036854775807L;
    }
}
