package com.applovin.exoplayer2.e.i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5828d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.applovin.exoplayer2.v f5833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5834j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5825a = new com.applovin.exoplayer2.l.y(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5829e = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5835k = -9223372036854775807L;

    public h(String str) {
        this.f5826b = str;
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        int iMin = Math.min(yVar.a(), i10 - this.f5830f);
        yVar.a(bArr, this.f5830f, iMin);
        int i11 = this.f5830f + iMin;
        this.f5830f = i11;
        return i11 == i10;
    }

    private boolean b(com.applovin.exoplayer2.l.y yVar) {
        while (yVar.a() > 0) {
            int i10 = this.f5831g << 8;
            this.f5831g = i10;
            int iH = i10 | yVar.h();
            this.f5831g = iH;
            if (com.applovin.exoplayer2.b.o.a(iH)) {
                byte[] bArrD = this.f5825a.d();
                int i11 = this.f5831g;
                bArrD[0] = (byte) ((i11 >> 24) & 255);
                bArrD[1] = (byte) ((i11 >> 16) & 255);
                bArrD[2] = (byte) ((i11 >> 8) & 255);
                bArrD[3] = (byte) (i11 & 255);
                this.f5830f = 4;
                this.f5831g = 0;
                return true;
            }
        }
        return false;
    }

    private void c() {
        byte[] bArrD = this.f5825a.d();
        if (this.f5833i == null) {
            com.applovin.exoplayer2.v vVarA = com.applovin.exoplayer2.b.o.a(bArrD, this.f5827c, this.f5826b, null);
            this.f5833i = vVarA;
            this.f5828d.a(vVarA);
        }
        this.f5834j = com.applovin.exoplayer2.b.o.b(bArrD);
        this.f5832h = (int) ((((long) com.applovin.exoplayer2.b.o.a(bArrD)) * 1000000) / ((long) this.f5833i.f8212z));
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f5829e = 0;
        this.f5830f = 0;
        this.f5831g = 0;
        this.f5835k = -9223372036854775807L;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5835k = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f5827c = dVar.c();
        this.f5828d = jVar.a(dVar.b(), 1);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) {
        com.applovin.exoplayer2.l.a.a(this.f5828d);
        while (yVar.a() > 0) {
            int i10 = this.f5829e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(yVar.a(), this.f5834j - this.f5830f);
                    this.f5828d.a(yVar, iMin);
                    int i11 = this.f5830f + iMin;
                    this.f5830f = i11;
                    int i12 = this.f5834j;
                    if (i11 == i12) {
                        long j10 = this.f5835k;
                        if (j10 != -9223372036854775807L) {
                            this.f5828d.a(j10, 1, i12, 0, null);
                            this.f5835k += this.f5832h;
                        }
                        this.f5829e = 0;
                    }
                } else if (a(yVar, this.f5825a.d(), 18)) {
                    c();
                    this.f5825a.d(0);
                    this.f5828d.a(this.f5825a, 18);
                    this.f5829e = 2;
                }
            } else if (b(yVar)) {
                this.f5829e = 1;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }
}
