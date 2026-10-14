package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f5801a = {73, 68, 51};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f5803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f5818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f5820t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f5821u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f5822v;

    public f(boolean z10) {
        this(z10, null);
    }

    public f(boolean z10, String str) {
        this.f5803c = new com.applovin.exoplayer2.l.x(new byte[7]);
        this.f5804d = new com.applovin.exoplayer2.l.y(Arrays.copyOf(f5801a, 10));
        e();
        this.f5814n = -1;
        this.f5815o = -1;
        this.f5818r = -9223372036854775807L;
        this.f5820t = -9223372036854775807L;
        this.f5802b = z10;
        this.f5805e = str;
    }

    private void a(com.applovin.exoplayer2.e.x xVar, long j10, int i10, int i11) {
        this.f5809i = 4;
        this.f5810j = i10;
        this.f5821u = xVar;
        this.f5822v = j10;
        this.f5819s = i11;
    }

    private boolean a(byte b10, byte b11) {
        return a(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean a(int i10) {
        return (i10 & 65526) == 65520;
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, int i10) {
        yVar.d(i10 + 1);
        if (!b(yVar, this.f5803c.f7688a, 1)) {
            return false;
        }
        this.f5803c.a(4);
        int iC = this.f5803c.c(1);
        int i11 = this.f5814n;
        if (i11 != -1 && iC != i11) {
            return false;
        }
        if (this.f5815o != -1) {
            if (!b(yVar, this.f5803c.f7688a, 1)) {
                return true;
            }
            this.f5803c.a(2);
            if (this.f5803c.c(4) != this.f5815o) {
                return false;
            }
            yVar.d(i10 + 2);
        }
        if (!b(yVar, this.f5803c.f7688a, 4)) {
            return true;
        }
        this.f5803c.a(14);
        int iC2 = this.f5803c.c(13);
        if (iC2 < 7) {
            return false;
        }
        byte[] bArrD = yVar.d();
        int iB = yVar.b();
        int i12 = i10 + iC2;
        if (i12 >= iB) {
            return true;
        }
        if (bArrD[i12] == -1) {
            int i13 = i12 + 1;
            if (i13 == iB) {
                return true;
            }
            return a((byte) -1, bArrD[i13]) && ((bArrD[i13] & 8) >> 3) == iC;
        }
        if (bArrD[i12] != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iB) {
            return true;
        }
        if (bArrD[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iB || bArrD[i15] == 51;
    }

    private boolean a(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        int iMin = Math.min(yVar.a(), i10 - this.f5810j);
        yVar.a(bArr, this.f5810j, iMin);
        int i11 = this.f5810j + iMin;
        this.f5810j = i11;
        return i11 == i10;
    }

    private void b(com.applovin.exoplayer2.l.y yVar) {
        int i10;
        byte[] bArrD = yVar.d();
        int iC = yVar.c();
        int iB = yVar.b();
        while (iC < iB) {
            int i11 = iC + 1;
            int i12 = bArrD[iC] & 255;
            if (this.f5811k == 512 && a((byte) -1, (byte) i12) && (this.f5813m || a(yVar, i11 - 2))) {
                this.f5816p = (i12 & 8) >> 3;
                this.f5812l = (i12 & 1) == 0;
                if (this.f5813m) {
                    g();
                } else {
                    h();
                }
                yVar.d(i11);
                return;
            }
            int i13 = this.f5811k;
            int i14 = i12 | i13;
            if (i14 != 329) {
                if (i14 == 511) {
                    this.f5811k = 512;
                } else if (i14 == 836) {
                    i10 = 1024;
                } else if (i14 == 1075) {
                    f();
                    yVar.d(i11);
                    return;
                } else if (i13 != 256) {
                    this.f5811k = 256;
                    i11--;
                }
                iC = i11;
            } else {
                i10 = 768;
            }
            this.f5811k = i10;
            iC = i11;
        }
        yVar.d(iC);
    }

    private boolean b(com.applovin.exoplayer2.l.y yVar, byte[] bArr, int i10) {
        if (yVar.a() < i10) {
            return false;
        }
        yVar.a(bArr, 0, i10);
        return true;
    }

    private void c(com.applovin.exoplayer2.l.y yVar) {
        if (yVar.a() == 0) {
            return;
        }
        this.f5803c.f7688a[0] = yVar.d()[yVar.c()];
        this.f5803c.a(2);
        int iC = this.f5803c.c(4);
        int i10 = this.f5815o;
        if (i10 != -1 && iC != i10) {
            d();
            return;
        }
        if (!this.f5813m) {
            this.f5813m = true;
            this.f5814n = this.f5816p;
            this.f5815o = iC;
        }
        g();
    }

    private void d() {
        this.f5813m = false;
        e();
    }

    private void d(com.applovin.exoplayer2.l.y yVar) {
        int iMin = Math.min(yVar.a(), this.f5819s - this.f5810j);
        this.f5821u.a(yVar, iMin);
        int i10 = this.f5810j + iMin;
        this.f5810j = i10;
        int i11 = this.f5819s;
        if (i10 == i11) {
            long j10 = this.f5820t;
            if (j10 != -9223372036854775807L) {
                this.f5821u.a(j10, 1, i11, 0, null);
                this.f5820t += this.f5822v;
            }
            e();
        }
    }

    private void e() {
        this.f5809i = 0;
        this.f5810j = 0;
        this.f5811k = 256;
    }

    private void f() {
        this.f5809i = 2;
        this.f5810j = f5801a.length;
        this.f5819s = 0;
        this.f5804d.d(0);
    }

    private void g() {
        this.f5809i = 3;
        this.f5810j = 0;
    }

    private void h() {
        this.f5809i = 1;
        this.f5810j = 0;
    }

    private void i() {
        this.f5808h.a(this.f5804d, 10);
        this.f5804d.d(6);
        a(this.f5808h, 0L, 10, this.f5804d.v() + 10);
    }

    private void j() throws ai {
        this.f5803c.a(0);
        if (this.f5817q) {
            this.f5803c.b(10);
        } else {
            int iC = this.f5803c.c(2) + 1;
            if (iC != 2) {
                com.applovin.exoplayer2.l.q.c("AdtsReader", "Detected audio object type: " + iC + ", but assuming AAC LC.");
                iC = 2;
            }
            this.f5803c.b(5);
            byte[] bArrA = com.applovin.exoplayer2.b.a.a(iC, this.f5815o, this.f5803c.c(3));
            com.applovin.exoplayer2.b.a.C0073a c0073aA = com.applovin.exoplayer2.b.a.a(bArrA);
            com.applovin.exoplayer2.v vVarA = new com.applovin.exoplayer2.v.a().a(this.f5806f).f("audio/mp4a-latm").d(c0073aA.f4384c).k(c0073aA.f4383b).l(c0073aA.f4382a).a(Collections.singletonList(bArrA)).c(this.f5805e).a();
            this.f5818r = 1024000000 / ((long) vVarA.f8212z);
            this.f5807g.a(vVarA);
            this.f5817q = true;
        }
        this.f5803c.b(4);
        int iC2 = (this.f5803c.c(13) - 2) - 5;
        if (this.f5812l) {
            iC2 -= 2;
        }
        a(this.f5807g, this.f5818r, 0, iC2);
    }

    private void k() {
        com.applovin.exoplayer2.l.a.b(this.f5807g);
        com.applovin.exoplayer2.l.ai.a(this.f5821u);
        com.applovin.exoplayer2.l.ai.a(this.f5808h);
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a() {
        this.f5820t = -9223372036854775807L;
        d();
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f5820t = j10;
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        dVar.a();
        this.f5806f = dVar.c();
        com.applovin.exoplayer2.e.x xVarA = jVar.a(dVar.b(), 1);
        this.f5807g = xVarA;
        this.f5821u = xVarA;
        if (!this.f5802b) {
            this.f5808h = new com.applovin.exoplayer2.e.g();
            return;
        }
        dVar.a();
        com.applovin.exoplayer2.e.x xVarA2 = jVar.a(dVar.b(), 5);
        this.f5808h = xVarA2;
        xVarA2.a(new com.applovin.exoplayer2.v.a().a(dVar.c()).f("application/id3").a());
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void a(com.applovin.exoplayer2.l.y yVar) throws ai {
        k();
        while (yVar.a() > 0) {
            int i10 = this.f5809i;
            if (i10 == 0) {
                b(yVar);
            } else if (i10 == 1) {
                c(yVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (a(yVar, this.f5803c.f7688a, this.f5812l ? 7 : 5)) {
                        j();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    d(yVar);
                }
            } else if (a(yVar, this.f5804d.d(), 10)) {
                i();
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.i.j
    public void b() {
    }

    public long c() {
        return this.f5818r;
    }
}
