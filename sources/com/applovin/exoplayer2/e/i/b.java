package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f5762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.applovin.exoplayer2.v f5768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5770l;

    public b() {
        this(null);
    }

    public b(String str) {
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(new byte[128]);
        this.f5759a = xVar;
        this.f5760b = new com.applovin.exoplayer2.l.y(xVar.f7688a);
        this.f5764f = 0;
        this.f5770l = -9223372036854775807L;
        this.f5761c = str;
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        int iMin = Math.min(yVar.a(), i10 - this.f5765g);
        yVar.a(bArr, this.f5765g, iMin);
        int i11 = this.f5765g + iMin;
        this.f5765g = i11;
        return i11 == i10;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    private boolean b(com.applovin.exoplayer2.l.y yVar) {
        while (true) {
            boolean z10 = false;
            if (yVar.a() <= 0) {
                return false;
            }
            if (this.f5766h) {
                int iH = yVar.h();
                if (iH == 119) {
                    this.f5766h = false;
                    return true;
                }
                if (iH == 11) {
                    z10 = true;
                }
            } else if (yVar.h() == 11) {
                z10 = true;
            }
            this.f5766h = z10;
        }
    }

    private void c() {
        this.f5759a.a(0);
        com.applovin.exoplayer2.b.b.a aVarA = com.applovin.exoplayer2.b.b.a(this.f5759a);
        com.applovin.exoplayer2.v vVar = this.f5768j;
        if (vVar == null || aVarA.f4397d != vVar.f8211y || aVarA.f4396c != vVar.f8212z || !ai.a((Object) aVarA.f4394a, (Object) vVar.f8198l)) {
            com.applovin.exoplayer2.v vVarA = new com.applovin.exoplayer2.v.a().a(this.f5762d).f(aVarA.f4394a).k(aVarA.f4397d).l(aVarA.f4396c).c(this.f5761c).a();
            this.f5768j = vVarA;
            this.f5763e.a(vVarA);
        }
        this.f5769k = aVarA.f4398e;
        this.f5767i = (((long) aVarA.f4399f) * 1000000) / ((long) this.f5768j.f8212z);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f5764f = 0;
        this.f5765g = 0;
        this.f5766h = false;
        this.f5770l = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5770l = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f5762d = dVar.c();
        this.f5763e = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f5763e);
        while (yVar.a() > 0) {
            int i10 = this.f5764f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(yVar.a(), this.f5769k - this.f5765g);
                        this.f5763e.a(yVar, iMin);
                        int i11 = this.f5765g + iMin;
                        this.f5765g = i11;
                        int i12 = this.f5769k;
                        if (i11 == i12) {
                            long j10 = this.f5770l;
                            if (j10 != -9223372036854775807L) {
                                this.f5763e.a(j10, 1, i12, 0, null);
                                this.f5770l += this.f5767i;
                            }
                            this.f5764f = 0;
                        }
                    }
                } else if (a(yVar, this.f5760b.d(), 128)) {
                    c();
                    this.f5760b.d(0);
                    this.f5763e.a(this.f5760b, 128);
                    this.f5764f = 2;
                }
            } else if (b(yVar)) {
                this.f5764f = 1;
                this.f5760b.d()[0] = 11;
                this.f5760b.d()[1] = 119;
                this.f5765g = 2;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }
}
