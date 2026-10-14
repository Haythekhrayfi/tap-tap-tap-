package com.applovin.exoplayer2.h;

import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class w implements com.applovin.exoplayer2.e.x {
    private boolean A;
    private com.applovin.exoplayer2.v B;
    private com.applovin.exoplayer2.v C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f6699a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.exoplayer2.d.h f6702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.d.g.a f6703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Looper f6704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f6705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.applovin.exoplayer2.v f6706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.applovin.exoplayer2.d.f f6707i;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f6715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f6717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f6718t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f6722x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f6700b = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6708j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f6709k = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long[] f6710l = new long[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long[] f6713o = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f6712n = new int[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f6711m = new int[1000];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.applovin.exoplayer2.e.x.a[] f6714p = new com.applovin.exoplayer2.e.x.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ab<b> f6701c = new ab<>(g0.f6563c);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f6719u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f6720v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f6721w = Long.MIN_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f6724z = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f6723y = true;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.applovin.exoplayer2.e.x.a f6727c;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f6728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.applovin.exoplayer2.d.h.a f6729b;

        private b(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.d.h.a aVar) {
            this.f6728a = vVar;
            this.f6729b = aVar;
        }
    }

    public interface c {
        void a(com.applovin.exoplayer2.v vVar);
    }

    public w(com.applovin.exoplayer2.k.b bVar, Looper looper, com.applovin.exoplayer2.d.h hVar, com.applovin.exoplayer2.d.g.a aVar) {
        this.f6704f = looper;
        this.f6702d = hVar;
        this.f6703e = aVar;
        this.f6699a = new v(bVar);
    }

    private int a(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f6713o;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.f6712n[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f6708j) {
                i10 = 0;
            }
        }
        return i12;
    }

    private synchronized int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, boolean z10, boolean z11, a aVar) {
        gVar.f4753c = false;
        if (!o()) {
            if (!z11 && !this.f6722x) {
                com.applovin.exoplayer2.v vVar = this.C;
                if (vVar == null || (!z10 && vVar == this.f6706h)) {
                    return -3;
                }
                a((com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(vVar), wVar);
                return -5;
            }
            gVar.a_(4);
            return -4;
        }
        com.applovin.exoplayer2.v vVar2 = this.f6701c.a(f()).f6728a;
        if (!z10 && vVar2 == this.f6706h) {
            int iF = f(this.f6718t);
            if (!c(iF)) {
                gVar.f4753c = true;
                return -3;
            }
            gVar.a_(this.f6712n[iF]);
            long j10 = this.f6713o[iF];
            gVar.f4754d = j10;
            if (j10 < this.f6719u) {
                gVar.b(Integer.MIN_VALUE);
            }
            aVar.f6725a = this.f6711m[iF];
            aVar.f6726b = this.f6710l[iF];
            aVar.f6727c = this.f6714p[iF];
            return -4;
        }
        a(vVar2, wVar);
        return -5;
    }

    public static w a(com.applovin.exoplayer2.k.b bVar, Looper looper, com.applovin.exoplayer2.d.h hVar, com.applovin.exoplayer2.d.g.a aVar) {
        return new w(bVar, (Looper) com.applovin.exoplayer2.l.a.b(looper), (com.applovin.exoplayer2.d.h) com.applovin.exoplayer2.l.a.b(hVar), (com.applovin.exoplayer2.d.g.a) com.applovin.exoplayer2.l.a.b(aVar));
    }

    private synchronized void a(long j10, int i10, long j11, int i11, com.applovin.exoplayer2.e.x.a aVar) {
        int i12 = this.f6715q;
        if (i12 > 0) {
            int iF = f(i12 - 1);
            com.applovin.exoplayer2.l.a.a(this.f6710l[iF] + ((long) this.f6711m[iF]) <= j11);
        }
        this.f6722x = (536870912 & i10) != 0;
        this.f6721w = Math.max(this.f6721w, j10);
        int iF2 = f(this.f6715q);
        this.f6713o[iF2] = j10;
        this.f6710l[iF2] = j11;
        this.f6711m[iF2] = i11;
        this.f6712n[iF2] = i10;
        this.f6714p[iF2] = aVar;
        this.f6709k[iF2] = this.D;
        if (this.f6701c.c() || !this.f6701c.a().f6728a.equals(this.C)) {
            com.applovin.exoplayer2.d.h hVar = this.f6702d;
            this.f6701c.a(c(), new b((com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.b(this.C), hVar != null ? hVar.a((Looper) com.applovin.exoplayer2.l.a.b(this.f6704f), this.f6703e, this.C) : com.applovin.exoplayer2.d.h.a.f5149b));
        }
        int i13 = this.f6715q + 1;
        this.f6715q = i13;
        int i14 = this.f6708j;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            com.applovin.exoplayer2.e.x.a[] aVarArr = new com.applovin.exoplayer2.e.x.a[i15];
            int i16 = this.f6717s;
            int i17 = i14 - i16;
            System.arraycopy(this.f6710l, i16, jArr, 0, i17);
            System.arraycopy(this.f6713o, this.f6717s, jArr2, 0, i17);
            System.arraycopy(this.f6712n, this.f6717s, iArr2, 0, i17);
            System.arraycopy(this.f6711m, this.f6717s, iArr3, 0, i17);
            System.arraycopy(this.f6714p, this.f6717s, aVarArr, 0, i17);
            System.arraycopy(this.f6709k, this.f6717s, iArr, 0, i17);
            int i18 = this.f6717s;
            System.arraycopy(this.f6710l, 0, jArr, i17, i18);
            System.arraycopy(this.f6713o, 0, jArr2, i17, i18);
            System.arraycopy(this.f6712n, 0, iArr2, i17, i18);
            System.arraycopy(this.f6711m, 0, iArr3, i17, i18);
            System.arraycopy(this.f6714p, 0, aVarArr, i17, i18);
            System.arraycopy(this.f6709k, 0, iArr, i17, i18);
            this.f6710l = jArr;
            this.f6713o = jArr2;
            this.f6712n = iArr2;
            this.f6711m = iArr3;
            this.f6714p = aVarArr;
            this.f6709k = iArr;
            this.f6717s = 0;
            this.f6708j = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
        bVar.f6729b.release();
    }

    private void a(com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.w wVar) {
        com.applovin.exoplayer2.v vVar2 = this.f6706h;
        boolean z10 = vVar2 == null;
        com.applovin.exoplayer2.d.e eVar = z10 ? null : vVar2.f8201o;
        this.f6706h = vVar;
        com.applovin.exoplayer2.d.e eVar2 = vVar.f8201o;
        com.applovin.exoplayer2.d.h hVar = this.f6702d;
        wVar.f8240b = hVar != null ? vVar.a(hVar.a(vVar)) : vVar;
        wVar.f8239a = this.f6707i;
        if (this.f6702d == null) {
            return;
        }
        if (z10 || !ai.a(eVar, eVar2)) {
            com.applovin.exoplayer2.d.f fVar = this.f6707i;
            com.applovin.exoplayer2.d.f fVarB = this.f6702d.b((Looper) com.applovin.exoplayer2.l.a.b(this.f6704f), this.f6703e, vVar);
            this.f6707i = fVarB;
            wVar.f8239a = fVarB;
            if (fVar != null) {
                fVar.b(this.f6703e);
            }
        }
    }

    private long b(int i10) {
        int iC = c() - i10;
        boolean z10 = false;
        com.applovin.exoplayer2.l.a.a(iC >= 0 && iC <= this.f6715q - this.f6718t);
        int i11 = this.f6715q - iC;
        this.f6715q = i11;
        this.f6721w = Math.max(this.f6720v, e(i11));
        if (iC == 0 && this.f6722x) {
            z10 = true;
        }
        this.f6722x = z10;
        this.f6701c.c(i10);
        int i12 = this.f6715q;
        if (i12 == 0) {
            return 0L;
        }
        int iF = f(i12 - 1);
        return this.f6710l[iF] + ((long) this.f6711m[iF]);
    }

    private synchronized long b(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f6715q;
        if (i11 != 0) {
            long[] jArr = this.f6713o;
            int i12 = this.f6717s;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f6718t) != i11) {
                    i11 = i10 + 1;
                }
                int iA = a(i12, i11, j10, z10);
                if (iA == -1) {
                    return -1L;
                }
                return d(iA);
            }
        }
        return -1L;
    }

    private synchronized boolean b(long j10) {
        if (this.f6715q == 0) {
            return j10 > this.f6720v;
        }
        if (i() >= j10) {
            return false;
        }
        b(this.f6716r + c(j10));
        return true;
    }

    private int c(long j10) {
        int i10 = this.f6715q;
        int iF = f(i10 - 1);
        while (i10 > this.f6718t && this.f6713o[iF] >= j10) {
            i10--;
            iF--;
            if (iF == -1) {
                iF = this.f6708j - 1;
            }
        }
        return i10;
    }

    private boolean c(int i10) {
        com.applovin.exoplayer2.d.f fVar = this.f6707i;
        return fVar == null || fVar.c() == 4 || ((this.f6712n[i10] & 1073741824) == 0 && this.f6707i.d());
    }

    private synchronized boolean c(com.applovin.exoplayer2.v vVar) {
        this.f6724z = false;
        if (ai.a(vVar, this.C)) {
            return false;
        }
        if (!this.f6701c.c() && this.f6701c.a().f6728a.equals(vVar)) {
            vVar = this.f6701c.a().f6728a;
        }
        this.C = vVar;
        com.applovin.exoplayer2.v vVar2 = this.C;
        this.E = com.applovin.exoplayer2.l.u.a(vVar2.f8198l, vVar2.f8195i);
        this.F = false;
        return true;
    }

    private long d(int i10) {
        this.f6720v = Math.max(this.f6720v, e(i10));
        this.f6715q -= i10;
        int i11 = this.f6716r + i10;
        this.f6716r = i11;
        int i12 = this.f6717s + i10;
        this.f6717s = i12;
        int i13 = this.f6708j;
        if (i12 >= i13) {
            this.f6717s = i12 - i13;
        }
        int i14 = this.f6718t - i10;
        this.f6718t = i14;
        if (i14 < 0) {
            this.f6718t = 0;
        }
        this.f6701c.b(i11);
        if (this.f6715q != 0) {
            return this.f6710l[this.f6717s];
        }
        int i15 = this.f6717s;
        if (i15 == 0) {
            i15 = this.f6708j;
        }
        int i16 = i15 - 1;
        return this.f6710l[i16] + ((long) this.f6711m[i16]);
    }

    private long e(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iF = f(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f6713o[iF]);
            if ((this.f6712n[iF] & 1) != 0) {
                break;
            }
            iF--;
            if (iF == -1) {
                iF = this.f6708j - 1;
            }
        }
        return jMax;
    }

    private int f(int i10) {
        int i11 = this.f6717s + i10;
        int i12 = this.f6708j;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private synchronized void l() {
        this.f6718t = 0;
        this.f6699a.b();
    }

    private synchronized long m() {
        int i10 = this.f6715q;
        if (i10 == 0) {
            return -1L;
        }
        return d(i10);
    }

    private void n() {
        com.applovin.exoplayer2.d.f fVar = this.f6707i;
        if (fVar != null) {
            fVar.b(this.f6703e);
            this.f6707i = null;
            this.f6706h = null;
        }
    }

    private boolean o() {
        return this.f6718t != this.f6715q;
    }

    @Override // com.applovin.exoplayer2.e.x
    public final int a(com.applovin.exoplayer2.k.g gVar, int i10, boolean z10, int i11) throws IOException {
        return this.f6699a.a(gVar, i10, z10);
    }

    public int a(com.applovin.exoplayer2.w wVar, com.applovin.exoplayer2.c.g gVar, int i10, boolean z10) {
        int iA = a(wVar, gVar, (i10 & 2) != 0, z10, this.f6700b);
        if (iA == -4 && !gVar.c()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                v vVar = this.f6699a;
                a aVar = this.f6700b;
                if (z11) {
                    vVar.b(gVar, aVar);
                } else {
                    vVar.a(gVar, aVar);
                }
            }
            if (!z11) {
                this.f6718t++;
            }
        }
        return iA;
    }

    public void a() {
        a(true);
        n();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void a(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f6718t + i10 <= this.f6715q) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        this.f6718t += i10;
    }

    public final void a(long j10) {
        this.f6719u = j10;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    @Override // com.applovin.exoplayer2.e.x
    public void a(long j10, int i10, int i11, int i12, com.applovin.exoplayer2.e.x.a aVar) {
        int i13;
        if (this.A) {
            a((com.applovin.exoplayer2.v) com.applovin.exoplayer2.l.a.a(this.B));
        }
        int i14 = i10 & 1;
        boolean z10 = i14 != 0;
        if (this.f6723y) {
            if (!z10) {
                return;
            } else {
                this.f6723y = false;
            }
        }
        long j11 = this.G + j10;
        if (!this.E) {
            i13 = i10;
        } else {
            if (j11 < this.f6719u) {
                return;
            }
            if (i14 == 0) {
                if (!this.F) {
                    StringBuilder sbA = defpackage.a.a("Overriding unexpected non-sync sample for format: ");
                    sbA.append(this.C);
                    com.applovin.exoplayer2.l.q.c("SampleQueue", sbA.toString());
                    this.F = true;
                }
                i13 = i10 | 1;
            } else {
                i13 = i10;
            }
        }
        if (this.H) {
            if (!z10 || !b(j11)) {
                return;
            } else {
                this.H = false;
            }
        }
        a(j11, i13, (this.f6699a.c() - ((long) i11)) - ((long) i12), i11, aVar);
    }

    public final void a(long j10, boolean z10, boolean z11) {
        this.f6699a.a(b(j10, z10, z11));
    }

    public final void a(c cVar) {
        this.f6705g = cVar;
    }

    @Override // com.applovin.exoplayer2.e.x
    public final void a(com.applovin.exoplayer2.l.y yVar, int i10, int i11) {
        this.f6699a.a(yVar, i10);
    }

    @Override // com.applovin.exoplayer2.e.x
    public final void a(com.applovin.exoplayer2.v vVar) {
        com.applovin.exoplayer2.v vVarB = b(vVar);
        this.A = false;
        this.B = vVar;
        boolean zC = c(vVarB);
        c cVar = this.f6705g;
        if (cVar == null || !zC) {
            return;
        }
        cVar.a(vVarB);
    }

    public void a(boolean z10) {
        this.f6699a.a();
        this.f6715q = 0;
        this.f6716r = 0;
        this.f6717s = 0;
        this.f6718t = 0;
        this.f6723y = true;
        this.f6719u = Long.MIN_VALUE;
        this.f6720v = Long.MIN_VALUE;
        this.f6721w = Long.MIN_VALUE;
        this.f6722x = false;
        this.f6701c.b();
        if (z10) {
            this.B = null;
            this.C = null;
            this.f6724z = true;
        }
    }

    public final synchronized boolean a(long j10, boolean z10) {
        l();
        int iF = f(this.f6718t);
        if (o() && j10 >= this.f6713o[iF] && (j10 <= this.f6721w || z10)) {
            int iA = a(iF, this.f6715q - this.f6718t, j10, true);
            if (iA == -1) {
                return false;
            }
            this.f6719u = j10;
            this.f6718t += iA;
            return true;
        }
        return false;
    }

    public final synchronized int b(long j10, boolean z10) {
        int iF = f(this.f6718t);
        if (o() && j10 >= this.f6713o[iF]) {
            if (j10 > this.f6721w && z10) {
                return this.f6715q - this.f6718t;
            }
            int iA = a(iF, this.f6715q - this.f6718t, j10, true);
            if (iA == -1) {
                return 0;
            }
            return iA;
        }
        return 0;
    }

    public com.applovin.exoplayer2.v b(com.applovin.exoplayer2.v vVar) {
        return (this.G == 0 || vVar.f8202p == RecyclerView.FOREVER_NS) ? vVar : vVar.a().a(vVar.f8202p + this.G).a();
    }

    public final void b() {
        a(false);
    }

    public synchronized boolean b(boolean z10) {
        com.applovin.exoplayer2.v vVar;
        boolean z11 = true;
        if (o()) {
            if (this.f6701c.a(f()).f6728a != this.f6706h) {
                return true;
            }
            return c(f(this.f6718t));
        }
        if (!z10 && !this.f6722x && ((vVar = this.C) == null || vVar == this.f6706h)) {
            z11 = false;
        }
        return z11;
    }

    public final int c() {
        return this.f6716r + this.f6715q;
    }

    public void d() {
        k();
        n();
    }

    public void e() throws IOException {
        com.applovin.exoplayer2.d.f fVar = this.f6707i;
        if (fVar != null && fVar.c() == 1) {
            throw ((com.applovin.exoplayer2.d.f.a) com.applovin.exoplayer2.l.a.b(this.f6707i.e()));
        }
    }

    public final int f() {
        return this.f6716r + this.f6718t;
    }

    public final synchronized com.applovin.exoplayer2.v g() {
        return this.f6724z ? null : this.C;
    }

    public final synchronized long h() {
        return this.f6721w;
    }

    public final synchronized long i() {
        return Math.max(this.f6720v, e(this.f6718t));
    }

    public final synchronized boolean j() {
        return this.f6722x;
    }

    public final void k() {
        this.f6699a.a(m());
    }
}
