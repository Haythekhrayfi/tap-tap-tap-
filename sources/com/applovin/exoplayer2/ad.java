package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
final class ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.exoplayer2.h.n f4164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.exoplayer2.h.x[] f4166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ae f4169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f4171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final as[] f4172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.exoplayer2.j.j f4173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ah f4174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ad f4175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.applovin.exoplayer2.h.ad f4176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.applovin.exoplayer2.j.k f4177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f4178o;

    public ad(as[] asVarArr, long j10, com.applovin.exoplayer2.j.j jVar, com.applovin.exoplayer2.k.b bVar, ah ahVar, ae aeVar, com.applovin.exoplayer2.j.k kVar) {
        this.f4172i = asVarArr;
        this.f4178o = j10;
        this.f4173j = jVar;
        this.f4174k = ahVar;
        com.applovin.exoplayer2.h.p.a aVar = aeVar.f4179a;
        this.f4165b = aVar.f6608a;
        this.f4169f = aeVar;
        this.f4176m = com.applovin.exoplayer2.h.ad.f6509a;
        this.f4177n = kVar;
        this.f4166c = new com.applovin.exoplayer2.h.x[asVarArr.length];
        this.f4171h = new boolean[asVarArr.length];
        this.f4164a = a(aVar, ahVar, bVar, aeVar.f4180b, aeVar.f4182d);
    }

    private static com.applovin.exoplayer2.h.n a(com.applovin.exoplayer2.h.p.a aVar, ah ahVar, com.applovin.exoplayer2.k.b bVar, long j10, long j11) {
        com.applovin.exoplayer2.h.n nVarA = ahVar.a(aVar, bVar, j10);
        return j11 != -9223372036854775807L ? new com.applovin.exoplayer2.h.d(nVarA, true, 0L, j11) : nVarA;
    }

    private static void a(ah ahVar, com.applovin.exoplayer2.h.n nVar) {
        try {
            if (nVar instanceof com.applovin.exoplayer2.h.d) {
                nVar = ((com.applovin.exoplayer2.h.d) nVar).f6525a;
            }
            ahVar.a(nVar);
        } catch (RuntimeException e10) {
            com.applovin.exoplayer2.l.q.c("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    private void a(com.applovin.exoplayer2.h.x[] xVarArr) {
        int i10 = 0;
        while (true) {
            as[] asVarArr = this.f4172i;
            if (i10 >= asVarArr.length) {
                return;
            }
            if (asVarArr[i10].a() == -2) {
                xVarArr[i10] = null;
            }
            i10++;
        }
    }

    private void b(com.applovin.exoplayer2.h.x[] xVarArr) {
        int i10 = 0;
        while (true) {
            as[] asVarArr = this.f4172i;
            if (i10 >= asVarArr.length) {
                return;
            }
            if (asVarArr[i10].a() == -2 && this.f4177n.a(i10)) {
                xVarArr[i10] = new com.applovin.exoplayer2.h.g();
            }
            i10++;
        }
    }

    private void k() {
        if (!m()) {
            return;
        }
        int i10 = 0;
        while (true) {
            com.applovin.exoplayer2.j.k kVar = this.f4177n;
            if (i10 >= kVar.f7305a) {
                return;
            }
            boolean zA = kVar.a(i10);
            com.applovin.exoplayer2.j.d dVar = this.f4177n.f7307c[i10];
            if (zA && dVar != null) {
                dVar.a();
            }
            i10++;
        }
    }

    private void l() {
        if (!m()) {
            return;
        }
        int i10 = 0;
        while (true) {
            com.applovin.exoplayer2.j.k kVar = this.f4177n;
            if (i10 >= kVar.f7305a) {
                return;
            }
            boolean zA = kVar.a(i10);
            com.applovin.exoplayer2.j.d dVar = this.f4177n.f7307c[i10];
            if (zA && dVar != null) {
                dVar.b();
            }
            i10++;
        }
    }

    private boolean m() {
        return this.f4175l == null;
    }

    public long a() {
        return this.f4178o;
    }

    public long a(long j10) {
        return j10 + a();
    }

    public long a(com.applovin.exoplayer2.j.k kVar, long j10, boolean z10) {
        return a(kVar, j10, z10, new boolean[this.f4172i.length]);
    }

    public long a(com.applovin.exoplayer2.j.k kVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= kVar.f7305a) {
                break;
            }
            boolean[] zArr2 = this.f4171h;
            if (z10 || !kVar.a(this.f4177n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        a(this.f4166c);
        l();
        this.f4177n = kVar;
        k();
        long jA = this.f4164a.a(kVar.f7307c, this.f4171h, this.f4166c, zArr, j10);
        b(this.f4166c);
        this.f4168e = false;
        int i11 = 0;
        while (true) {
            com.applovin.exoplayer2.h.x[] xVarArr = this.f4166c;
            if (i11 >= xVarArr.length) {
                return jA;
            }
            if (xVarArr[i11] != null) {
                com.applovin.exoplayer2.l.a.b(kVar.a(i11));
                if (this.f4172i[i11].a() != -2) {
                    this.f4168e = true;
                }
            } else {
                com.applovin.exoplayer2.l.a.b(kVar.f7307c[i11] == null);
            }
            i11++;
        }
    }

    public void a(float f10, ba baVar) throws p {
        this.f4167d = true;
        this.f4176m = this.f4164a.b();
        com.applovin.exoplayer2.j.k kVarB = b(f10, baVar);
        ae aeVar = this.f4169f;
        long jMax = aeVar.f4180b;
        long j10 = aeVar.f4183e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(kVarB, jMax, false);
        long j11 = this.f4178o;
        ae aeVar2 = this.f4169f;
        this.f4178o = (aeVar2.f4180b - jA) + j11;
        this.f4169f = aeVar2.a(jA);
    }

    public void a(ad adVar) {
        if (adVar == this.f4175l) {
            return;
        }
        l();
        this.f4175l = adVar;
        k();
    }

    public long b() {
        return this.f4169f.f4180b + this.f4178o;
    }

    public long b(long j10) {
        return j10 - a();
    }

    public com.applovin.exoplayer2.j.k b(float f10, ba baVar) throws p {
        com.applovin.exoplayer2.j.k kVarA = this.f4173j.a(this.f4172i, h(), this.f4169f.f4179a, baVar);
        for (com.applovin.exoplayer2.j.d dVar : kVarA.f7307c) {
            if (dVar != null) {
                dVar.a(f10);
            }
        }
        return kVarA;
    }

    public void c(long j10) {
        this.f4178o = j10;
    }

    public boolean c() {
        return this.f4167d && (!this.f4168e || this.f4164a.d() == Long.MIN_VALUE);
    }

    public long d() {
        if (!this.f4167d) {
            return this.f4169f.f4180b;
        }
        long jD = this.f4168e ? this.f4164a.d() : Long.MIN_VALUE;
        return jD == Long.MIN_VALUE ? this.f4169f.f4183e : jD;
    }

    public void d(long j10) {
        com.applovin.exoplayer2.l.a.b(m());
        if (this.f4167d) {
            this.f4164a.a(b(j10));
        }
    }

    public long e() {
        if (this.f4167d) {
            return this.f4164a.e();
        }
        return 0L;
    }

    public void e(long j10) {
        com.applovin.exoplayer2.l.a.b(m());
        this.f4164a.c(b(j10));
    }

    public void f() {
        l();
        a(this.f4174k, this.f4164a);
    }

    public ad g() {
        return this.f4175l;
    }

    public com.applovin.exoplayer2.h.ad h() {
        return this.f4176m;
    }

    public com.applovin.exoplayer2.j.k i() {
        return this.f4177n;
    }

    public void j() {
        com.applovin.exoplayer2.h.n nVar = this.f4164a;
        if (nVar instanceof com.applovin.exoplayer2.h.d) {
            long j10 = this.f4169f.f4182d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((com.applovin.exoplayer2.h.d) nVar).a(0L, j10);
        }
    }
}
