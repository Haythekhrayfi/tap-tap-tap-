package com.applovin.exoplayer2.e.i;

/* JADX INFO: loaded from: classes.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.b.r.a f5994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f6002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f6004l;

    public q() {
        this(null);
    }

    public q(String str) {
        this.f5998f = 0;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(4);
        this.f5993a = yVar;
        yVar.d()[0] = -1;
        this.f5994b = new com.applovin.exoplayer2.b.r.a();
        this.f6004l = -9223372036854775807L;
        this.f5995c = str;
    }

    private void b(com.applovin.exoplayer2.l.y yVar) {
        byte[] bArrD = yVar.d();
        int iB = yVar.b();
        for (int iC = yVar.c(); iC < iB; iC++) {
            boolean z10 = (bArrD[iC] & 255) == 255;
            boolean z11 = this.f6001i && (bArrD[iC] & 224) == 224;
            this.f6001i = z10;
            if (z11) {
                yVar.d(iC + 1);
                this.f6001i = false;
                this.f5993a.d()[1] = bArrD[iC];
                this.f5999g = 2;
                this.f5998f = 1;
                return;
            }
        }
        yVar.d(iB);
    }

    private void c(com.applovin.exoplayer2.l.y yVar) {
        int iMin = Math.min(yVar.a(), 4 - this.f5999g);
        yVar.a(this.f5993a.d(), this.f5999g, iMin);
        int i10 = this.f5999g + iMin;
        this.f5999g = i10;
        if (i10 < 4) {
            return;
        }
        this.f5993a.d(0);
        if (!this.f5994b.a(this.f5993a.q())) {
            this.f5999g = 0;
            this.f5998f = 1;
            return;
        }
        com.applovin.exoplayer2.b.r.a aVar = this.f5994b;
        this.f6003k = aVar.f4587c;
        if (!this.f6000h) {
            this.f6002j = (((long) aVar.f4591g) * 1000000) / ((long) aVar.f4588d);
            this.f5996d.a(new com.applovin.exoplayer2.v.a().a(this.f5997e).f(this.f5994b.f4586b).f(4096).k(this.f5994b.f4589e).l(this.f5994b.f4588d).c(this.f5995c).a());
            this.f6000h = true;
        }
        this.f5993a.d(0);
        this.f5996d.a(this.f5993a, 4);
        this.f5998f = 2;
    }

    private void d(com.applovin.exoplayer2.l.y yVar) {
        int iMin = Math.min(yVar.a(), this.f6003k - this.f5999g);
        this.f5996d.a(yVar, iMin);
        int i10 = this.f5999g + iMin;
        this.f5999g = i10;
        int i11 = this.f6003k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f6004l;
        if (j10 != -9223372036854775807L) {
            this.f5996d.a(j10, 1, i11, 0, null);
            this.f6004l += this.f6002j;
        }
        this.f5999g = 0;
        this.f5998f = 0;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f5998f = 0;
        this.f5999g = 0;
        this.f6001i = false;
        this.f6004l = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f6004l = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f5997e = dVar.c();
        this.f5996d = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f5996d);
        while (yVar.a() > 0) {
            int i10 = this.f5998f;
            if (i10 == 0) {
                b(yVar);
            } else if (i10 == 1) {
                c(yVar);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                d(yVar);
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }
}
