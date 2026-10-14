package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.ai;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f5788a = com.applovin.exoplayer2.b.z.f4657m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f5790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.x f5793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.applovin.exoplayer2.e.j f5794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f5795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f5796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5798k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5800m;

    public e() {
        this(0);
    }

    public e(int i10) {
        this.f5789b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f5790c = new f(true);
        this.f5791d = new com.applovin.exoplayer2.l.y(2048);
        this.f5797j = -1;
        this.f5796i = -1L;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(10);
        this.f5792e = yVar;
        this.f5793f = new com.applovin.exoplayer2.l.x(yVar.d());
    }

    private static int a(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    private void a(long j10, boolean z10) {
        if (this.f5800m) {
            return;
        }
        boolean z11 = (this.f5789b & 1) != 0 && this.f5797j > 0;
        if (z11 && this.f5790c.c() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f5790c.c() == -9223372036854775807L) {
            this.f5794g.a(new com.applovin.exoplayer2.e.v.b(-9223372036854775807L));
        } else {
            this.f5794g.a(b(j10, (this.f5789b & 2) != 0));
        }
        this.f5800m = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] a() {
        return new com.applovin.exoplayer2.e.h[]{new e()};
    }

    private int b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i10 = 0;
        while (true) {
            iVar.d(this.f5792e.d(), 0, 10);
            this.f5792e.d(0);
            if (this.f5792e.m() != 4801587) {
                break;
            }
            this.f5792e.e(3);
            int iV = this.f5792e.v();
            i10 += iV + 10;
            iVar.c(iV);
        }
        iVar.a();
        iVar.c(i10);
        if (this.f5796i == -1) {
            this.f5796i = i10;
        }
        return i10;
    }

    private com.applovin.exoplayer2.e.v b(long j10, boolean z10) {
        return new com.applovin.exoplayer2.e.d(j10, this.f5796i, a(this.f5797j, this.f5790c.c()), this.f5797j, z10);
    }

    private void c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        if (this.f5798k) {
            return;
        }
        this.f5797j = -1;
        iVar.a();
        long j10 = 0;
        if (iVar.c() == 0) {
            b(iVar);
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                if (iVar.b(this.f5792e.d(), 0, 2, true)) {
                    this.f5792e.d(0);
                    if (!f.a(this.f5792e.i())) {
                        break;
                    }
                    if (iVar.b(this.f5792e.d(), 0, 4, true)) {
                        this.f5793f.a(14);
                        int iC = this.f5793f.c(13);
                        if (iC <= 6) {
                            this.f5798k = true;
                            throw ai.b("Malformed ADTS stream", null);
                        }
                        j10 += (long) iC;
                        i11++;
                        if (i11 != 1000 && iVar.b(iC - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i10 = i11;
            break;
        }
        iVar.a();
        if (i10 > 0) {
            this.f5797j = (int) (j10 / ((long) i10));
        } else {
            this.f5797j = -1;
        }
        this.f5798k = true;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.f5794g);
        long jD = iVar.d();
        int i10 = this.f5789b;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || jD == -1)) ? false : true) {
            c(iVar);
        }
        int iA = iVar.a(this.f5791d.d(), 0, 2048);
        boolean z10 = iA == -1;
        a(jD, z10);
        if (z10) {
            return -1;
        }
        this.f5791d.d(0);
        this.f5791d.c(iA);
        if (!this.f5799l) {
            this.f5790c.a(this.f5795h, 4);
            this.f5799l = true;
        }
        this.f5790c.a(this.f5791d);
        return 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f5799l = false;
        this.f5790c.a();
        this.f5795h = j11;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f5794g = jVar;
        this.f5790c.a(jVar, new ad.d(0, 1));
        jVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0023  */
    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int iB = b(iVar);
        int i10 = iB;
        int i11 = 0;
        int i12 = 0;
        do {
            iVar.d(this.f5792e.d(), 0, 2);
            this.f5792e.d(0);
            if (f.a(this.f5792e.i())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                iVar.d(this.f5792e.d(), 0, 4);
                this.f5793f.a(14);
                int iC = this.f5793f.c(13);
                if (iC <= 6) {
                    i10++;
                    iVar.a();
                    iVar.c(i10);
                    i11 = 0;
                    i12 = 0;
                } else {
                    iVar.c(iC - 6);
                    i12 += iC;
                }
            } else {
                i10++;
                iVar.a();
                iVar.c(i10);
                i11 = 0;
                i12 = 0;
            }
        } while (i10 - iB < 8192);
        return false;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
