package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.ba;

/* JADX INFO: loaded from: classes.dex */
public final class u extends com.applovin.exoplayer2.h.a implements t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.ab f6667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.ab.f f6668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.i.a f6669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s.a f6670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.d.h f6671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.v f6672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f6673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f6675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f6676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f6677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.applovin.exoplayer2.k.aa f6678l;

    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.k.i.a f6680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private s.a f6681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.applovin.exoplayer2.d.i f6682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.applovin.exoplayer2.k.v f6683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f6685f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Object f6686g;

        public a(com.applovin.exoplayer2.k.i.a aVar) {
            this(aVar, new com.applovin.exoplayer2.e.f());
        }

        public a(com.applovin.exoplayer2.k.i.a aVar, com.applovin.exoplayer2.e.l lVar) {
            this(aVar, new d0.a(lVar));
        }

        public a(com.applovin.exoplayer2.k.i.a aVar, s.a aVar2) {
            this.f6680a = aVar;
            this.f6681b = aVar2;
            this.f6682c = new com.applovin.exoplayer2.d.d();
            this.f6683d = new com.applovin.exoplayer2.k.r();
            this.f6684e = 1048576;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ s a(com.applovin.exoplayer2.e.l lVar) {
            return new c(lVar);
        }

        public u a(com.applovin.exoplayer2.ab abVar) {
            com.applovin.exoplayer2.ab.b bVarA;
            com.applovin.exoplayer2.ab.b bVarA2;
            com.applovin.exoplayer2.l.a.b(abVar.f4048c);
            com.applovin.exoplayer2.ab.f fVar = abVar.f4048c;
            boolean z10 = fVar.f4111h == null && this.f6686g != null;
            boolean z11 = fVar.f4109f == null && this.f6685f != null;
            if (!z10 || !z11) {
                if (z10) {
                    bVarA2 = abVar.a().a(this.f6686g);
                    abVar = bVarA2.a();
                } else if (z11) {
                    bVarA = abVar.a();
                }
                com.applovin.exoplayer2.ab abVar2 = abVar;
                return new u(abVar2, this.f6680a, this.f6681b, this.f6682c.a(abVar2), this.f6683d, this.f6684e);
            }
            bVarA = abVar.a().a(this.f6686g);
            bVarA2 = bVarA.b(this.f6685f);
            abVar = bVarA2.a();
            com.applovin.exoplayer2.ab abVar3 = abVar;
            return new u(abVar3, this.f6680a, this.f6681b, this.f6682c.a(abVar3), this.f6683d, this.f6684e);
        }
    }

    private u(com.applovin.exoplayer2.ab abVar, com.applovin.exoplayer2.k.i.a aVar, s.a aVar2, com.applovin.exoplayer2.d.h hVar, com.applovin.exoplayer2.k.v vVar, int i10) {
        this.f6668b = (com.applovin.exoplayer2.ab.f) com.applovin.exoplayer2.l.a.b(abVar.f4048c);
        this.f6667a = abVar;
        this.f6669c = aVar;
        this.f6670d = aVar2;
        this.f6671e = hVar;
        this.f6672f = vVar;
        this.f6673g = i10;
        this.f6674h = true;
        this.f6675i = -9223372036854775807L;
    }

    private void f() {
        ba aaVar = new aa(this.f6675i, this.f6676j, false, this.f6677k, null, this.f6667a);
        if (this.f6674h) {
            aaVar = new h(aaVar) { // from class: com.applovin.exoplayer2.h.u.1
                @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
                public ba.a a(int i10, ba.a aVar, boolean z10) {
                    super.a(i10, aVar, z10);
                    aVar.f4681f = true;
                    return aVar;
                }

                @Override // com.applovin.exoplayer2.h.h, com.applovin.exoplayer2.ba
                public ba.c a(int i10, ba.c cVar, long j10) {
                    super.a(i10, cVar, j10);
                    cVar.f4702m = true;
                    return cVar;
                }
            };
        }
        a(aaVar);
    }

    @Override // com.applovin.exoplayer2.h.t.b
    public void a(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f6675i;
        }
        if (!this.f6674h && this.f6675i == j10 && this.f6676j == z10 && this.f6677k == z11) {
            return;
        }
        this.f6675i = j10;
        this.f6676j = z10;
        this.f6677k = z11;
        this.f6674h = false;
        f();
    }

    @Override // com.applovin.exoplayer2.h.p
    public void a(n nVar) {
        ((t) nVar).g();
    }

    @Override // com.applovin.exoplayer2.h.a
    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        this.f6678l = aaVar;
        this.f6671e.a();
        f();
    }

    @Override // com.applovin.exoplayer2.h.p
    public n b(p.a aVar, com.applovin.exoplayer2.k.b bVar, long j10) {
        com.applovin.exoplayer2.k.i iVarA = this.f6669c.a();
        com.applovin.exoplayer2.k.aa aaVar = this.f6678l;
        if (aaVar != null) {
            iVarA.a(aaVar);
        }
        return new t(this.f6668b.f4104a, iVarA, this.f6670d.createProgressiveMediaExtractor(), this.f6671e, b(aVar), this.f6672f, a(aVar), this, bVar, this.f6668b.f4109f, this.f6673g);
    }

    @Override // com.applovin.exoplayer2.h.a
    public void c() {
        this.f6671e.b();
    }

    @Override // com.applovin.exoplayer2.h.p
    public void e() {
    }

    @Override // com.applovin.exoplayer2.h.p
    public com.applovin.exoplayer2.ab g() {
        return this.f6667a;
    }
}
