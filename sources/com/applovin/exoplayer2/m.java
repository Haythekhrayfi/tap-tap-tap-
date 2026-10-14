package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
final class m implements com.applovin.exoplayer2.l.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.ac f7700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f7701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ar f7702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.l.s f7703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7704e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7705f;

    public interface a {
        void a(am amVar);
    }

    public m(a aVar, com.applovin.exoplayer2.l.d dVar) {
        this.f7701b = aVar;
        this.f7700a = new com.applovin.exoplayer2.l.ac(dVar);
    }

    private void b(boolean z10) {
        if (c(z10)) {
            this.f7704e = true;
            if (this.f7705f) {
                this.f7700a.a();
                return;
            }
            return;
        }
        com.applovin.exoplayer2.l.s sVar = (com.applovin.exoplayer2.l.s) com.applovin.exoplayer2.l.a.b(this.f7703d);
        long jC_ = sVar.c_();
        if (this.f7704e) {
            if (jC_ < this.f7700a.c_()) {
                this.f7700a.b();
                return;
            } else {
                this.f7704e = false;
                if (this.f7705f) {
                    this.f7700a.a();
                }
            }
        }
        this.f7700a.a(jC_);
        am amVarD = sVar.d();
        if (amVarD.equals(this.f7700a.d())) {
            return;
        }
        this.f7700a.a(amVarD);
        this.f7701b.a(amVarD);
    }

    private boolean c(boolean z10) {
        ar arVar = this.f7702c;
        return arVar == null || arVar.A() || (!this.f7702c.z() && (z10 || this.f7702c.g()));
    }

    public long a(boolean z10) {
        b(z10);
        return c_();
    }

    public void a() {
        this.f7705f = true;
        this.f7700a.a();
    }

    public void a(long j10) {
        this.f7700a.a(j10);
    }

    @Override // com.applovin.exoplayer2.l.s
    public void a(am amVar) {
        com.applovin.exoplayer2.l.s sVar = this.f7703d;
        if (sVar != null) {
            sVar.a(amVar);
            amVar = this.f7703d.d();
        }
        this.f7700a.a(amVar);
    }

    public void a(ar arVar) throws p {
        com.applovin.exoplayer2.l.s sVar;
        com.applovin.exoplayer2.l.s sVarC = arVar.c();
        if (sVarC == null || sVarC == (sVar = this.f7703d)) {
            return;
        }
        if (sVar != null) {
            throw p.a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f7703d = sVarC;
        this.f7702c = arVar;
        sVarC.a(this.f7700a.d());
    }

    public void b() {
        this.f7705f = false;
        this.f7700a.b();
    }

    public void b(ar arVar) {
        if (arVar == this.f7702c) {
            this.f7703d = null;
            this.f7702c = null;
            this.f7704e = true;
        }
    }

    @Override // com.applovin.exoplayer2.l.s
    public long c_() {
        return this.f7704e ? this.f7700a.c_() : ((com.applovin.exoplayer2.l.s) com.applovin.exoplayer2.l.a.b(this.f7703d)).c_();
    }

    @Override // com.applovin.exoplayer2.l.s
    public am d() {
        com.applovin.exoplayer2.l.s sVar = this.f7703d;
        return sVar != null ? sVar.d() : this.f7700a.d();
    }
}
