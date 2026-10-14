package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class p implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f5974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f5976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.applovin.exoplayer2.v f5977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f5987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f5988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f5990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f5992u;

    public p(String str) {
        this.f5972a = str;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(1024);
        this.f5973b = yVar;
        this.f5974c = new com.applovin.exoplayer2.l.x(yVar.d());
        this.f5982k = -9223372036854775807L;
    }

    private void a(int i10) {
        this.f5973b.a(i10);
        this.f5974c.a(this.f5973b.d());
    }

    private void a(com.applovin.exoplayer2.l.x xVar) throws ai {
        if (!xVar.e()) {
            this.f5983l = true;
            b(xVar);
        } else if (!this.f5983l) {
            return;
        }
        if (this.f5984m != 0) {
            throw ai.b(null, null);
        }
        if (this.f5985n != 0) {
            throw ai.b(null, null);
        }
        a(xVar, e(xVar));
        if (this.f5987p) {
            xVar.b((int) this.f5988q);
        }
    }

    private void a(com.applovin.exoplayer2.l.x xVar, int i10) {
        int iB = xVar.b();
        if ((iB & 7) == 0) {
            this.f5973b.d(iB >> 3);
        } else {
            xVar.a(this.f5973b.d(), 0, i10 * 8);
            this.f5973b.d(0);
        }
        this.f5975d.a(this.f5973b, i10);
        long j10 = this.f5982k;
        if (j10 != -9223372036854775807L) {
            this.f5975d.a(j10, 1, i10, 0, null);
            this.f5982k += this.f5990s;
        }
    }

    private void b(com.applovin.exoplayer2.l.x xVar) throws ai {
        boolean zE;
        int iC = xVar.c(1);
        int iC2 = iC == 1 ? xVar.c(1) : 0;
        this.f5984m = iC2;
        if (iC2 != 0) {
            throw ai.b(null, null);
        }
        if (iC == 1) {
            f(xVar);
        }
        if (!xVar.e()) {
            throw ai.b(null, null);
        }
        this.f5985n = xVar.c(6);
        int iC3 = xVar.c(4);
        int iC4 = xVar.c(3);
        if (iC3 != 0 || iC4 != 0) {
            throw ai.b(null, null);
        }
        if (iC == 0) {
            int iB = xVar.b();
            int iD = d(xVar);
            xVar.a(iB);
            byte[] bArr = new byte[(iD + 7) / 8];
            xVar.a(bArr, 0, iD);
            com.applovin.exoplayer2.v vVarA = new com.applovin.exoplayer2.v.a().a(this.f5976e).f("audio/mp4a-latm").d(this.f5992u).k(this.f5991t).l(this.f5989r).a(Collections.singletonList(bArr)).c(this.f5972a).a();
            if (!vVarA.equals(this.f5977f)) {
                this.f5977f = vVarA;
                this.f5990s = 1024000000 / ((long) vVarA.f8212z);
                this.f5975d.a(vVarA);
            }
        } else {
            xVar.b(((int) f(xVar)) - d(xVar));
        }
        c(xVar);
        boolean zE2 = xVar.e();
        this.f5987p = zE2;
        this.f5988q = 0L;
        if (zE2) {
            if (iC == 1) {
                this.f5988q = f(xVar);
            } else {
                do {
                    zE = xVar.e();
                    this.f5988q = (this.f5988q << 8) + ((long) xVar.c(8));
                } while (zE);
            }
        }
        if (xVar.e()) {
            xVar.b(8);
        }
    }

    private void c(com.applovin.exoplayer2.l.x xVar) {
        int i10;
        int iC = xVar.c(3);
        this.f5986o = iC;
        if (iC == 0) {
            i10 = 8;
        } else {
            if (iC != 1) {
                if (iC == 3 || iC == 4 || iC == 5) {
                    xVar.b(6);
                    return;
                } else {
                    if (iC != 6 && iC != 7) {
                        throw new IllegalStateException();
                    }
                    xVar.b(1);
                    return;
                }
            }
            i10 = 9;
        }
        xVar.b(i10);
    }

    private int d(com.applovin.exoplayer2.l.x xVar) throws ai {
        int iA = xVar.a();
        com.applovin.exoplayer2.b.a.C0073a c0073aA = com.applovin.exoplayer2.b.a.a(xVar, true);
        this.f5992u = c0073aA.f4384c;
        this.f5989r = c0073aA.f4382a;
        this.f5991t = c0073aA.f4383b;
        return iA - xVar.a();
    }

    private int e(com.applovin.exoplayer2.l.x xVar) throws ai {
        int iC;
        if (this.f5986o != 0) {
            throw ai.b(null, null);
        }
        int i10 = 0;
        do {
            iC = xVar.c(8);
            i10 += iC;
        } while (iC == 255);
        return i10;
    }

    private static long f(com.applovin.exoplayer2.l.x xVar) {
        return xVar.c((xVar.c(2) + 1) * 8);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f5978g = 0;
        this.f5982k = -9223372036854775807L;
        this.f5983l = false;
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5982k = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f5975d = jVar.a(dVar.b(), 1);
        this.f5976e = dVar.c();
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) throws ai {
        com.applovin.exoplayer2.l.a.a(this.f5975d);
        while (yVar.a() > 0) {
            int i10 = this.f5978g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iH = yVar.h();
                    if ((iH & 224) == 224) {
                        this.f5981j = iH;
                        this.f5978g = 2;
                    } else if (iH != 86) {
                        this.f5978g = 0;
                    }
                } else if (i10 == 2) {
                    int iH2 = ((this.f5981j & (-225)) << 8) | yVar.h();
                    this.f5980i = iH2;
                    if (iH2 > this.f5973b.d().length) {
                        a(this.f5980i);
                    }
                    this.f5979h = 0;
                    this.f5978g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(yVar.a(), this.f5980i - this.f5979h);
                    yVar.a(this.f5974c.f7688a, this.f5979h, iMin);
                    int i11 = this.f5979h + iMin;
                    this.f5979h = i11;
                    if (i11 == this.f5980i) {
                        this.f5974c.a(0);
                        a(this.f5974c);
                        this.f5978g = 0;
                    }
                }
            } else if (yVar.h() == 86) {
                this.f5978g = 1;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }
}
