package com.applovin.exoplayer2.e.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f5775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f5778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.applovin.exoplayer2.v f5785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5787m;

    public d() {
        this(null);
    }

    public d(String str) {
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(new byte[16]);
        this.f5775a = xVar;
        this.f5776b = new com.applovin.exoplayer2.l.y(xVar.f7688a);
        this.f5780f = 0;
        this.f5781g = 0;
        this.f5782h = false;
        this.f5783i = false;
        this.f5787m = -9223372036854775807L;
        this.f5777c = str;
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        int iMin = Math.min(yVar.a(), i10 - this.f5781g);
        yVar.a(bArr, this.f5781g, iMin);
        int i11 = this.f5781g + iMin;
        this.f5781g = i11;
        return i11 == i10;
    }

    private boolean b(com.applovin.exoplayer2.l.y yVar) {
        while (true) {
            if (yVar.a() <= 0) {
                return false;
            }
            if (this.f5782h) {
                int iH = yVar.h();
                this.f5782h = iH == 172;
                if (iH == 64 || iH == 65) {
                    this.f5783i = iH == 65;
                    return true;
                }
            } else {
                this.f5782h = yVar.h() == 172;
            }
        }
    }

    private void c() {
        this.f5775a.a(0);
        com.applovin.exoplayer2.b.c.a aVarA = com.applovin.exoplayer2.b.c.a(this.f5775a);
        com.applovin.exoplayer2.v vVar = this.f5785k;
        if (vVar == null || aVarA.f4406c != vVar.f8211y || aVarA.f4405b != vVar.f8212z || !"audio/ac4".equals(vVar.f8198l)) {
            com.applovin.exoplayer2.v vVarA = new com.applovin.exoplayer2.v.a().a(this.f5778d).f("audio/ac4").k(aVarA.f4406c).l(aVarA.f4405b).c(this.f5777c).a();
            this.f5785k = vVarA;
            this.f5779e.a(vVarA);
        }
        this.f5786l = aVarA.f4407d;
        this.f5784j = (((long) aVarA.f4408e) * 1000000) / ((long) this.f5785k.f8212z);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f5780f = 0;
        this.f5781g = 0;
        this.f5782h = false;
        this.f5783i = false;
        this.f5787m = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5787m = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f5778d = dVar.c();
        this.f5779e = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f5779e);
        while (yVar.a() > 0) {
            int i10 = this.f5780f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(yVar.a(), this.f5786l - this.f5781g);
                        this.f5779e.a(yVar, iMin);
                        int i11 = this.f5781g + iMin;
                        this.f5781g = i11;
                        int i12 = this.f5786l;
                        if (i11 == i12) {
                            long j10 = this.f5787m;
                            if (j10 != -9223372036854775807L) {
                                this.f5779e.a(j10, 1, i12, 0, null);
                                this.f5787m += this.f5784j;
                            }
                            this.f5780f = 0;
                        }
                    }
                } else if (a(yVar, this.f5776b.d(), 16)) {
                    c();
                    this.f5776b.d(0);
                    this.f5779e.a(this.f5776b, 16);
                    this.f5780f = 2;
                }
            } else if (b(yVar)) {
                this.f5780f = 1;
                this.f5776b.d()[0] = -84;
                this.f5776b.d()[1] = (byte) (this.f5783i ? 65 : 64);
                this.f5781g = 2;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }
}
