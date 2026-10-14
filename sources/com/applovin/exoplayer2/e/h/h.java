package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x f5677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f5678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f5679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f5680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f5681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5684i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5688m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f5676a = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f5685j = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v f5689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f5690b;
    }

    public static final class b implements f {
        private b() {
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public long a(com.applovin.exoplayer2.e.i iVar) {
            return -1L;
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public void a(long j10) {
        }

        @Override // com.applovin.exoplayer2.e.h.f
        public com.applovin.exoplayer2.e.v b() {
            return new com.applovin.exoplayer2.e.v.b(-9223372036854775807L);
        }
    }

    private void a() {
        com.applovin.exoplayer2.l.a.a(this.f5677b);
        ai.a(this.f5678c);
    }

    private boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        while (this.f5676a.a(iVar)) {
            this.f5686k = iVar.c() - this.f5681f;
            if (!a(this.f5676a.c(), this.f5681f, this.f5685j)) {
                return true;
            }
            this.f5681f = iVar.c();
        }
        this.f5683h = 3;
        return false;
    }

    private int b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        if (!a(iVar)) {
            return -1;
        }
        v vVar = this.f5685j.f5689a;
        this.f5684i = vVar.f8212z;
        if (!this.f5688m) {
            this.f5677b.a(vVar);
            this.f5688m = true;
        }
        f bVar = this.f5685j.f5690b;
        if (bVar != null) {
            this.f5679d = bVar;
        } else if (iVar.d() == -1) {
            bVar = new b();
            this.f5679d = bVar;
        } else {
            e eVarB = this.f5676a.b();
            this.f5679d = new com.applovin.exoplayer2.e.h.a(this, this.f5681f, iVar.d(), eVarB.f5670h + eVarB.f5671i, eVarB.f5665c, (eVarB.f5664b & 4) != 0);
        }
        this.f5683h = 2;
        this.f5676a.d();
        return 0;
    }

    private int b(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        long jA = this.f5679d.a(iVar);
        if (jA >= 0) {
            uVar.f6134a = jA;
            return 1;
        }
        if (jA < -1) {
            c(-(jA + 2));
        }
        if (!this.f5687l) {
            this.f5678c.a((com.applovin.exoplayer2.e.v) com.applovin.exoplayer2.l.a.a(this.f5679d.b()));
            this.f5687l = true;
        }
        if (this.f5686k <= 0 && !this.f5676a.a(iVar)) {
            this.f5683h = 3;
            return -1;
        }
        this.f5686k = 0L;
        y yVarC = this.f5676a.c();
        long jB = b(yVarC);
        if (jB >= 0) {
            long j10 = this.f5682g;
            if (j10 + jB >= this.f5680e) {
                long jA2 = a(j10);
                this.f5677b.a(yVarC, yVarC.b());
                this.f5677b.a(jA2, 1, yVarC.b(), 0, null);
                this.f5680e = -1L;
            }
        }
        this.f5682g += jB;
        return 0;
    }

    public final int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        a();
        int i10 = this.f5683h;
        if (i10 == 0) {
            return b(iVar);
        }
        if (i10 == 1) {
            iVar.b((int) this.f5681f);
            this.f5683h = 2;
            return 0;
        }
        if (i10 == 2) {
            ai.a(this.f5679d);
            return b(iVar, uVar);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public long a(long j10) {
        return (j10 * 1000000) / ((long) this.f5684i);
    }

    public final void a(long j10, long j11) {
        this.f5676a.a();
        if (j10 == 0) {
            a(!this.f5687l);
        } else if (this.f5683h != 0) {
            this.f5680e = b(j11);
            ((f) ai.a(this.f5679d)).a(this.f5680e);
            this.f5683h = 2;
        }
    }

    public void a(j jVar, x xVar) {
        this.f5678c = jVar;
        this.f5677b = xVar;
        a(true);
    }

    public void a(boolean z10) {
        int i10;
        if (z10) {
            this.f5685j = new a();
            this.f5681f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f5683h = i10;
        this.f5680e = -1L;
        this.f5682g = 0L;
    }

    public abstract boolean a(y yVar, long j10, a aVar) throws IOException;

    public long b(long j10) {
        return (((long) this.f5684i) * j10) / 1000000;
    }

    public abstract long b(y yVar);

    public void c(long j10) {
        this.f5682g = j10;
    }
}
