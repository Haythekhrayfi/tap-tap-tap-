package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.drm.DrmInitData;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ez0 implements j71 {
    private boolean A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dz0 f20384a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.exo.drm.g f20387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.yandex.mobile.ads.exo.drm.f.a f20388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f20389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private yv f20390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.yandex.mobile.ads.exo.drm.e f20391h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f20399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20402s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f20406w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private yv f20409z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f20385b = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20392i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f20393j = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long[] f20394k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f20397n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int[] f20396m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f20395l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j71.a[] f20398o = new j71.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v31<b> f20386c = new v31<>(yn1.f26944d);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f20403t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f20404u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f20405v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f20408y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f20407x = true;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j71.a f20412c;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yv f20413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.yandex.mobile.ads.exo.drm.g.b f20414b;

        private b(yv yvVar, com.yandex.mobile.ads.exo.drm.g.b bVar) {
            this.f20413a = yvVar;
            this.f20414b = bVar;
        }

        public /* synthetic */ b(yv yvVar, com.yandex.mobile.ads.exo.drm.g.b bVar, int i10) {
            this(yvVar, bVar);
        }
    }

    public interface c {
    }

    public ez0(u8 u8Var, com.yandex.mobile.ads.exo.drm.g gVar, com.yandex.mobile.ads.exo.drm.f.a aVar) {
        this.f20387d = gVar;
        this.f20388e = aVar;
        this.f20384a = new dz0(u8Var);
    }

    private int a(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f20397n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f20396m[i10] & 1) != 0) {
                i12 = i13;
                if (j11 == j10) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f20392i) {
                i10 = 0;
            }
        }
        return i12;
    }

    private long a(int i10) {
        this.f20404u = Math.max(this.f20404u, b(i10));
        this.f20399p -= i10;
        int i11 = this.f20400q + i10;
        this.f20400q = i11;
        int i12 = this.f20401r + i10;
        this.f20401r = i12;
        int i13 = this.f20392i;
        if (i12 >= i13) {
            this.f20401r = i12 - i13;
        }
        int i14 = this.f20402s - i10;
        this.f20402s = i14;
        if (i14 < 0) {
            this.f20402s = 0;
        }
        this.f20386c.a(i11);
        if (this.f20399p != 0) {
            return this.f20394k[this.f20401r];
        }
        int i15 = this.f20401r;
        if (i15 == 0) {
            i15 = this.f20392i;
        }
        int i16 = i15 - 1;
        return this.f20394k[i16] + ((long) this.f20395l[i16]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
        bVar.f20414b.release();
    }

    private void a(yv yvVar, zv zvVar) {
        yv yvVarA;
        yv yvVar2 = this.f20390g;
        boolean z10 = yvVar2 == null;
        DrmInitData drmInitData = z10 ? null : yvVar2.f27118o;
        this.f20390g = yvVar;
        DrmInitData drmInitData2 = yvVar.f27118o;
        com.yandex.mobile.ads.exo.drm.g gVar = this.f20387d;
        if (gVar != null) {
            yvVarA = yvVar.a().d(gVar.a(yvVar)).a();
        } else {
            yvVarA = yvVar;
        }
        zvVar.f27433b = yvVarA;
        zvVar.f27432a = this.f20391h;
        if (this.f20387d == null) {
            return;
        }
        if (z10 || !da1.a(drmInitData, drmInitData2)) {
            com.yandex.mobile.ads.exo.drm.e eVar = this.f20391h;
            com.yandex.mobile.ads.exo.drm.e eVarA = this.f20387d.a(this.f20388e, yvVar);
            this.f20391h = eVarA;
            zvVar.f27432a = eVarA;
            if (eVar != null) {
                eVar.a(this.f20388e);
            }
        }
    }

    private long b(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iC = c(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f20397n[iC]);
            if ((this.f20396m[iC] & 1) != 0) {
                break;
            }
            iC--;
            if (iC == -1) {
                iC = this.f20392i - 1;
            }
        }
        return jMax;
    }

    private int c(int i10) {
        int i11 = this.f20401r + i10;
        int i12 = this.f20392i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int a(long j10, boolean z10) {
        int iC = c(this.f20402s);
        int i10 = this.f20402s;
        int i11 = this.f20399p;
        if ((i10 != i11) && j10 >= this.f20397n[iC]) {
            if (j10 > this.f20405v && z10) {
                return i11 - i10;
            }
            int iA = a(iC, i11 - i10, j10, true);
            if (iA == -1) {
                return 0;
            }
            return iA;
        }
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.j71
    public final int a(im imVar, int i10, boolean z10) throws IOException {
        return this.f20384a.a(imVar, i10, z10);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x002d A[Catch: all -> 0x00ce, PHI: r14
  0x002d: PHI (r14v24 com.yandex.mobile.ads.impl.yv) = 
  (r14v4 com.yandex.mobile.ads.impl.yv)
  (r14v4 com.yandex.mobile.ads.impl.yv)
  (r14v26 com.yandex.mobile.ads.impl.yv)
  (r14v26 com.yandex.mobile.ads.impl.yv)
 binds: [B:29:0x0048, B:32:0x004e, B:20:0x0027, B:22:0x002b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x000c, B:15:0x001e, B:18:0x0023, B:21:0x0029, B:23:0x002d, B:27:0x0035, B:28:0x003a, B:30:0x004a, B:33:0x004f, B:35:0x0059, B:37:0x005f, B:39:0x0068, B:45:0x0076, B:46:0x0079, B:48:0x008c, B:49:0x0091), top: B:71:0x000c }] */
    public final int a(zv zvVar, an anVar, int i10, boolean z10) {
        int i11;
        yv yvVar;
        boolean z11 = (i10 & 2) != 0;
        a aVar = this.f20385b;
        synchronized (this) {
            anVar.f19005d = false;
            i11 = -3;
            if (this.f20402s != this.f20399p) {
                yvVar = this.f20386c.b(c()).f20413a;
                if (z11 || yvVar != this.f20390g) {
                    a(yvVar, zvVar);
                    i11 = -5;
                } else {
                    int iC = c(this.f20402s);
                    com.yandex.mobile.ads.exo.drm.e eVar = this.f20391h;
                    if (eVar == null || eVar.c() == 4 || ((this.f20396m[iC] & 1073741824) == 0 && this.f20391h.d())) {
                        anVar.d(this.f20396m[iC]);
                        long j10 = this.f20397n[iC];
                        anVar.f19006e = j10;
                        if (j10 < this.f20403t) {
                            anVar.b(Integer.MIN_VALUE);
                        }
                        aVar.f20410a = this.f20395l[iC];
                        aVar.f20411b = this.f20394k[iC];
                        aVar.f20412c = this.f20398o[iC];
                        i11 = -4;
                    } else {
                        anVar.f19005d = true;
                    }
                }
            } else {
                if (!z10 && !this.f20406w) {
                    yvVar = this.f20409z;
                    if (yvVar != null && (z11 || yvVar != this.f20390g)) {
                        a(yvVar, zvVar);
                        i11 = -5;
                    }
                }
                anVar.d(4);
                i11 = -4;
            }
        }
        if (i11 == -4 && !anVar.f()) {
            boolean z12 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                dz0 dz0Var = this.f20384a;
                a aVar2 = this.f20385b;
                if (z12) {
                    dz0Var.a(anVar, aVar2);
                } else {
                    dz0Var.b(anVar, aVar2);
                }
            }
            if (!z12) {
                this.f20402s++;
            }
        }
        return i11;
    }

    public final void a() {
        long jA;
        dz0 dz0Var = this.f20384a;
        synchronized (this) {
            int i10 = this.f20399p;
            jA = i10 == 0 ? -1L : a(i10);
        }
        dz0Var.a(jA);
    }

    public final void a(long j10) {
        this.f20403t = j10;
    }

    @Override // com.yandex.mobile.ads.impl.j71
    public final void a(long j10, int i10, int i11, int i12, j71.a aVar) {
        int i13 = i10 & 1;
        int i14 = 0;
        boolean z10 = i13 != 0;
        if (this.f20407x) {
            if (!z10) {
                return;
            } else {
                this.f20407x = false;
            }
        }
        long j11 = j10 + 0;
        if (this.A) {
            if (j11 < this.f20403t) {
                return;
            }
            if (i13 == 0) {
                if (!this.B) {
                    StringBuilder sbA = v60.a("Overriding unexpected non-sync sample for format: ");
                    sbA.append(this.f20409z);
                    p90.d("SampleQueue", sbA.toString());
                    this.B = true;
                }
                i10 |= 1;
            }
        }
        long jA = (this.f20384a.a() - ((long) i11)) - ((long) i12);
        synchronized (this) {
            int i15 = this.f20399p;
            if (i15 > 0) {
                int iC = c(i15 - 1);
                pa.a(this.f20394k[iC] + ((long) this.f20395l[iC]) <= jA);
            }
            this.f20406w = (536870912 & i10) != 0;
            this.f20405v = Math.max(this.f20405v, j11);
            int iC2 = c(this.f20399p);
            this.f20397n[iC2] = j11;
            this.f20394k[iC2] = jA;
            this.f20395l[iC2] = i11;
            this.f20396m[iC2] = i10;
            this.f20398o[iC2] = aVar;
            this.f20393j[iC2] = 0;
            if (this.f20386c.c() || !this.f20386c.b().f20413a.equals(this.f20409z)) {
                com.yandex.mobile.ads.exo.drm.g gVar = this.f20387d;
                com.yandex.mobile.ads.exo.drm.g.b bVarB = gVar != null ? gVar.b(this.f20388e, this.f20409z) : com.yandex.mobile.ads.exo.drm.g.b.f18500a;
                v31<b> v31Var = this.f20386c;
                int iE = e();
                yv yvVar = this.f20409z;
                Objects.requireNonNull(yvVar);
                v31Var.a(iE, new b(yvVar, bVarB, i14));
            }
            int i16 = this.f20399p + 1;
            this.f20399p = i16;
            int i17 = this.f20392i;
            if (i16 == i17) {
                int i18 = i17 + 1000;
                int[] iArr = new int[i18];
                long[] jArr = new long[i18];
                long[] jArr2 = new long[i18];
                int[] iArr2 = new int[i18];
                int[] iArr3 = new int[i18];
                j71.a[] aVarArr = new j71.a[i18];
                int i19 = this.f20401r;
                int i20 = i17 - i19;
                System.arraycopy(this.f20394k, i19, jArr, 0, i20);
                System.arraycopy(this.f20397n, this.f20401r, jArr2, 0, i20);
                System.arraycopy(this.f20396m, this.f20401r, iArr2, 0, i20);
                System.arraycopy(this.f20395l, this.f20401r, iArr3, 0, i20);
                System.arraycopy(this.f20398o, this.f20401r, aVarArr, 0, i20);
                System.arraycopy(this.f20393j, this.f20401r, iArr, 0, i20);
                int i21 = this.f20401r;
                System.arraycopy(this.f20394k, 0, jArr, i20, i21);
                System.arraycopy(this.f20397n, 0, jArr2, i20, i21);
                System.arraycopy(this.f20396m, 0, iArr2, i20, i21);
                System.arraycopy(this.f20395l, 0, iArr3, i20, i21);
                System.arraycopy(this.f20398o, 0, aVarArr, i20, i21);
                System.arraycopy(this.f20393j, 0, iArr, i20, i21);
                this.f20394k = jArr;
                this.f20397n = jArr2;
                this.f20396m = iArr2;
                this.f20395l = iArr3;
                this.f20398o = aVarArr;
                this.f20393j = iArr;
                this.f20401r = 0;
                this.f20392i = i18;
            }
        }
    }

    public final void a(long j10, boolean z10, boolean z11) {
        long jA;
        int i10;
        dz0 dz0Var = this.f20384a;
        synchronized (this) {
            int i11 = this.f20399p;
            if (i11 != 0) {
                long[] jArr = this.f20397n;
                int i12 = this.f20401r;
                if (j10 >= jArr[i12]) {
                    if (z11 && (i10 = this.f20402s) != i11) {
                        i11 = i10 + 1;
                    }
                    int iA = a(i12, i11, j10, z10);
                    if (iA != -1) {
                        jA = a(iA);
                    }
                }
                jA = -1;
            } else {
                jA = -1;
            }
        }
        dz0Var.a(jA);
    }

    public final void a(c cVar) {
        this.f20389f = cVar;
    }

    @Override // com.yandex.mobile.ads.impl.j71
    public final void a(yv yvVar) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            this.f20408y = false;
            if (!da1.a(yvVar, this.f20409z)) {
                if (!this.f20386c.c() && this.f20386c.b().f20413a.equals(yvVar)) {
                    yvVar = this.f20386c.b().f20413a;
                }
                this.f20409z = yvVar;
                yv yvVar2 = this.f20409z;
                this.A = te0.a(yvVar2.f27115l, yvVar2.f27112i);
                this.B = false;
                z10 = true;
            }
        }
        c cVar = this.f20389f;
        if (cVar == null || !z10) {
            return;
        }
        ((gt0) cVar).k();
    }

    public final synchronized boolean a(boolean z10) {
        yv yvVar;
        boolean z11 = false;
        if (!(this.f20402s != this.f20399p)) {
            if (z10 || this.f20406w || ((yvVar = this.f20409z) != null && yvVar != this.f20390g)) {
                z11 = true;
            }
            return z11;
        }
        if (this.f20386c.b(c()).f20413a != this.f20390g) {
            return true;
        }
        int iC = c(this.f20402s);
        com.yandex.mobile.ads.exo.drm.e eVar = this.f20391h;
        if (eVar == null || eVar.c() == 4 || ((this.f20396m[iC] & 1073741824) == 0 && this.f20391h.d())) {
            z11 = true;
        }
        return z11;
    }

    public final synchronized long b() {
        return this.f20405v;
    }

    @Override // com.yandex.mobile.ads.impl.j71
    public final void b(int i10, mp0 mp0Var) {
        this.f20384a.a(i10, mp0Var);
    }

    public final void b(boolean z10) {
        this.f20384a.b();
        this.f20399p = 0;
        this.f20400q = 0;
        this.f20401r = 0;
        this.f20402s = 0;
        this.f20407x = true;
        this.f20403t = Long.MIN_VALUE;
        this.f20404u = Long.MIN_VALUE;
        this.f20405v = Long.MIN_VALUE;
        this.f20406w = false;
        this.f20386c.a();
        if (z10) {
            this.f20409z = null;
            this.f20408y = true;
        }
    }

    public final synchronized boolean b(long j10, boolean z10) {
        synchronized (this) {
            this.f20402s = 0;
            this.f20384a.c();
        }
        int iC = c(this.f20402s);
        int i10 = this.f20402s;
        int i11 = this.f20399p;
        if ((i10 != i11) && j10 >= this.f20397n[iC] && (j10 <= this.f20405v || z10)) {
            int iA = a(iC, i11 - i10, j10, true);
            if (iA == -1) {
                return false;
            }
            this.f20403t = j10;
            this.f20402s += iA;
            return true;
        }
        return false;
    }

    public final int c() {
        return this.f20400q + this.f20402s;
    }

    public final synchronized yv d() {
        return this.f20408y ? null : this.f20409z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void d(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f20402s + i10 <= this.f20399p) {
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
        pa.a(z10);
        this.f20402s += i10;
    }

    public final int e() {
        return this.f20400q + this.f20399p;
    }

    public final synchronized boolean f() {
        return this.f20406w;
    }

    public final void g() throws IOException {
        com.yandex.mobile.ads.exo.drm.e eVar = this.f20391h;
        if (eVar == null || eVar.c() != 1) {
            return;
        }
        com.yandex.mobile.ads.exo.drm.e.a aVarG = this.f20391h.g();
        Objects.requireNonNull(aVarG);
        throw aVarG;
    }

    public final void h() {
        a();
        com.yandex.mobile.ads.exo.drm.e eVar = this.f20391h;
        if (eVar != null) {
            eVar.a(this.f20388e);
            this.f20391h = null;
            this.f20390g = null;
        }
    }

    public final void i() {
        b(true);
        com.yandex.mobile.ads.exo.drm.e eVar = this.f20391h;
        if (eVar != null) {
            eVar.a(this.f20388e);
            this.f20391h = null;
            this.f20390g = null;
        }
    }
}
