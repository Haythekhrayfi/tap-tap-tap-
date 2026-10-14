package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.av;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.a f6579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.b f6581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p f6582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f6583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n.a f6584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f6585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f6587i = -9223372036854775807L;

    public interface a {
        void a(p.a aVar);

        void a(p.a aVar, IOException iOException);
    }

    public k(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j10) {
        this.f6579a = aVar;
        this.f6581c = bVar;
        this.f6580b = j10;
    }

    private long e(long j10) {
        long j11 = this.f6587i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(long j10, av avVar) {
        return ((n) ai.a(this.f6583e)).a(j10, avVar);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long a(com.applovin.exoplayer2.j.d[] dVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f6587i;
        if (j12 == -9223372036854775807L || j10 != this.f6580b) {
            j11 = j10;
        } else {
            this.f6587i = -9223372036854775807L;
            j11 = j12;
        }
        return ((n) ai.a(this.f6583e)).a(dVarArr, zArr, xVarArr, zArr2, j11);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10) {
        ((n) ai.a(this.f6583e)).a(j10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(long j10, boolean z10) {
        ((n) ai.a(this.f6583e)).a(j10, z10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public void a(n.a aVar, long j10) {
        this.f6584f = aVar;
        n nVar = this.f6583e;
        if (nVar != null) {
            nVar.a(this, e(this.f6580b));
        }
    }

    @Override // com.applovin.exoplayer2.h.n.a
    public void a(n nVar) {
        ((n.a) ai.a(this.f6584f)).a((n) this);
        a aVar = this.f6585g;
        if (aVar != null) {
            aVar.a(this.f6579a);
        }
    }

    public void a(p.a aVar) {
        long jE = e(this.f6580b);
        n nVarB = ((p) com.applovin.exoplayer2.l.a.b(this.f6582d)).b(aVar, this.f6581c, jE);
        this.f6583e = nVarB;
        if (this.f6584f != null) {
            nVarB.a(this, jE);
        }
    }

    public void a(p pVar) {
        com.applovin.exoplayer2.l.a.b(this.f6582d == null);
        this.f6582d = pVar;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long b(long j10) {
        return ((n) ai.a(this.f6583e)).b(j10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public ad b() {
        return ((n) ai.a(this.f6583e)).b();
    }

    @Override // com.applovin.exoplayer2.h.y.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(n nVar) {
        ((n.a) ai.a(this.f6584f)).a(this);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long c() {
        return ((n) ai.a(this.f6583e)).c();
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean c(long j10) {
        n nVar = this.f6583e;
        return nVar != null && nVar.c(j10);
    }

    @Override // com.applovin.exoplayer2.h.n
    public long d() {
        return ((n) ai.a(this.f6583e)).d();
    }

    public void d(long j10) {
        this.f6587i = j10;
    }

    @Override // com.applovin.exoplayer2.h.n
    public long e() {
        return ((n) ai.a(this.f6583e)).e();
    }

    @Override // com.applovin.exoplayer2.h.n
    public void e_() throws IOException {
        try {
            n nVar = this.f6583e;
            if (nVar != null) {
                nVar.e_();
            } else {
                p pVar = this.f6582d;
                if (pVar != null) {
                    pVar.e();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f6585g;
            if (aVar == null) {
                throw e10;
            }
            if (this.f6586h) {
                return;
            }
            this.f6586h = true;
            aVar.a(this.f6579a, e10);
        }
    }

    @Override // com.applovin.exoplayer2.h.n
    public boolean f() {
        n nVar = this.f6583e;
        return nVar != null && nVar.f();
    }

    public long g() {
        return this.f6580b;
    }

    public long h() {
        return this.f6587i;
    }

    public void i() {
        if (this.f6583e != null) {
            ((p) com.applovin.exoplayer2.l.a.b(this.f6582d)).a(this.f6583e);
        }
    }
}
