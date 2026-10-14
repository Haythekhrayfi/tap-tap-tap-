package com.applovin.exoplayer2.e.g;

import android.util.Pair;
import android.util.SparseArray;
import androidx.appcompat.widget.r0;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class e implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f5508a = com.applovin.exoplayer2.a.p.f4002r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f5509b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final v f5510c = new v.a().f("application/x-emsg").a();
    private long A;
    private long B;
    private b C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private com.applovin.exoplayer2.e.j H;
    private x[] I;
    private x[] J;
    private boolean K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f5512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<v> f5513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray<b> f5514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y f5515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final y f5516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final y f5517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final byte[] f5518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final y f5519l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ag f5520m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.applovin.exoplayer2.g.b.c f5521n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final y f5522o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ArrayDeque<com.applovin.exoplayer2.e.g.a.C0086a> f5523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ArrayDeque<a> f5524q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final x f5525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5526s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5527t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f5528u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5529v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private y f5530w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f5531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f5532y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f5533z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5535b;

        public a(long j10, int i10) {
            this.f5534a = j10;
            this.f5535b = i10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f5536a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public n f5539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f5540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5543h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f5544i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f5547l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f5537b = new m();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y f5538c = new y();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final y f5545j = new y(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final y f5546k = new y();

        public b(x xVar, n nVar, c cVar) {
            this.f5536a = xVar;
            this.f5539d = nVar;
            this.f5540e = cVar;
            a(nVar, cVar);
        }

        public int a(int i10, int i11) {
            y yVar;
            l lVarH = h();
            if (lVarH == null) {
                return 0;
            }
            int length = lVarH.f5604d;
            if (length != 0) {
                yVar = this.f5537b.f5621p;
            } else {
                byte[] bArr = (byte[]) ai.a(lVarH.f5605e);
                this.f5546k.a(bArr, bArr.length);
                y yVar2 = this.f5546k;
                length = bArr.length;
                yVar = yVar2;
            }
            boolean zC = this.f5537b.c(this.f5541f);
            boolean z10 = zC || i11 != 0;
            this.f5545j.d()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f5545j.d(0);
            this.f5536a.a(this.f5545j, 1, 1);
            this.f5536a.a(yVar, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zC) {
                this.f5538c.a(8);
                byte[] bArrD = this.f5538c.d();
                bArrD[0] = 0;
                bArrD[1] = 1;
                bArrD[2] = (byte) ((i11 >> 8) & 255);
                bArrD[3] = (byte) (i11 & 255);
                bArrD[4] = (byte) ((i10 >> 24) & 255);
                bArrD[5] = (byte) ((i10 >> 16) & 255);
                bArrD[6] = (byte) ((i10 >> 8) & 255);
                bArrD[7] = (byte) (i10 & 255);
                this.f5536a.a(this.f5538c, 8, 1);
                return length + 1 + 8;
            }
            y yVar3 = this.f5537b.f5621p;
            int i12 = yVar3.i();
            yVar3.e(-2);
            int i13 = (i12 * 6) + 2;
            if (i11 != 0) {
                this.f5538c.a(i13);
                byte[] bArrD2 = this.f5538c.d();
                yVar3.a(bArrD2, 0, i13);
                int i14 = (((bArrD2[2] & 255) << 8) | (bArrD2[3] & 255)) + i11;
                bArrD2[2] = (byte) ((i14 >> 8) & 255);
                bArrD2[3] = (byte) (i14 & 255);
                yVar3 = this.f5538c;
            }
            this.f5536a.a(yVar3, i13, 1);
            return length + 1 + i13;
        }

        public void a() {
            this.f5537b.a();
            this.f5541f = 0;
            this.f5543h = 0;
            this.f5542g = 0;
            this.f5544i = 0;
            this.f5547l = false;
        }

        public void a(long j10) {
            int i10 = this.f5541f;
            while (true) {
                m mVar = this.f5537b;
                if (i10 >= mVar.f5611f || mVar.b(i10) >= j10) {
                    return;
                }
                if (this.f5537b.f5617l[i10]) {
                    this.f5544i = i10;
                }
                i10++;
            }
        }

        public void a(com.applovin.exoplayer2.d.e eVar) {
            l lVarA = this.f5539d.f5625a.a(((c) ai.a(this.f5537b.f5606a)).f5498a);
            this.f5536a.a(this.f5539d.f5625a.f5595f.a().a(eVar.a(lVarA != null ? lVarA.f5602b : null)).a());
        }

        public void a(n nVar, c cVar) {
            this.f5539d = nVar;
            this.f5540e = cVar;
            this.f5536a.a(nVar.f5625a.f5595f);
            a();
        }

        public long b() {
            return !this.f5547l ? this.f5539d.f5630f[this.f5541f] : this.f5537b.b(this.f5541f);
        }

        public long c() {
            return !this.f5547l ? this.f5539d.f5627c[this.f5541f] : this.f5537b.f5612g[this.f5543h];
        }

        public int d() {
            return !this.f5547l ? this.f5539d.f5628d[this.f5541f] : this.f5537b.f5614i[this.f5541f];
        }

        public int e() {
            int i10;
            if (this.f5547l) {
                i10 = this.f5537b.f5617l[this.f5541f] ? 1 : 0;
            } else {
                i10 = this.f5539d.f5631g[this.f5541f];
            }
            return h() != null ? i10 | 1073741824 : i10;
        }

        public boolean f() {
            this.f5541f++;
            if (!this.f5547l) {
                return false;
            }
            int i10 = this.f5542g + 1;
            this.f5542g = i10;
            int[] iArr = this.f5537b.f5613h;
            int i11 = this.f5543h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f5543h = i11 + 1;
            this.f5542g = 0;
            return false;
        }

        public void g() {
            l lVarH = h();
            if (lVarH == null) {
                return;
            }
            y yVar = this.f5537b.f5621p;
            int i10 = lVarH.f5604d;
            if (i10 != 0) {
                yVar.e(i10);
            }
            if (this.f5537b.c(this.f5541f)) {
                yVar.e(yVar.i() * 6);
            }
        }

        public l h() {
            if (!this.f5547l) {
                return null;
            }
            int i10 = ((c) ai.a(this.f5537b.f5606a)).f5498a;
            l lVarA = this.f5537b.f5620o;
            if (lVarA == null) {
                lVarA = this.f5539d.f5625a.a(i10);
            }
            if (lVarA == null || !lVarA.f5601a) {
                return null;
            }
            return lVarA;
        }
    }

    public e() {
        this(0);
    }

    public e(int i10) {
        this(i10, null);
    }

    public e(int i10, ag agVar) {
        this(i10, agVar, null, Collections.emptyList());
    }

    public e(int i10, ag agVar, k kVar, List<v> list) {
        this(i10, agVar, kVar, list, null);
    }

    public e(int i10, ag agVar, k kVar, List<v> list, x xVar) {
        this.f5511d = i10;
        this.f5520m = agVar;
        this.f5512e = kVar;
        this.f5513f = Collections.unmodifiableList(list);
        this.f5525r = xVar;
        this.f5521n = new com.applovin.exoplayer2.g.b.c();
        this.f5522o = new y(16);
        this.f5515h = new y(com.applovin.exoplayer2.l.v.f7660a);
        this.f5516i = new y(5);
        this.f5517j = new y();
        byte[] bArr = new byte[16];
        this.f5518k = bArr;
        this.f5519l = new y(bArr);
        this.f5523p = new ArrayDeque<>();
        this.f5524q = new ArrayDeque<>();
        this.f5514g = new SparseArray<>();
        this.A = -9223372036854775807L;
        this.f5533z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.H = com.applovin.exoplayer2.e.j.f6063a;
        this.I = new x[0];
        this.J = new x[0];
    }

    private static int a(int i10) throws com.applovin.exoplayer2.ai {
        if (i10 >= 0) {
            return i10;
        }
        throw com.applovin.exoplayer2.ai.b("Unexpected negative value: " + i10, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x012d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0144  */
    private static int a(b bVar, int i10, int i11, y yVar, int i12) throws com.applovin.exoplayer2.ai {
        long j10;
        long jD;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        boolean[] zArr;
        boolean z10;
        int i13;
        long j11;
        long j12;
        long j13;
        int i14;
        int iQ;
        int iQ2;
        int iQ3;
        boolean z11;
        boolean z12;
        b bVar2 = bVar;
        yVar.d(8);
        int iB = com.applovin.exoplayer2.e.g.a.b(yVar.q());
        k kVar = bVar2.f5539d.f5625a;
        m mVar = bVar2.f5537b;
        c cVar = (c) ai.a(mVar.f5606a);
        mVar.f5613h[i10] = yVar.w();
        long[] jArr2 = mVar.f5612g;
        jArr2[i10] = mVar.f5608c;
        if ((iB & 1) != 0) {
            jArr2[i10] = jArr2[i10] + ((long) yVar.q());
        }
        boolean z13 = (iB & 4) != 0;
        int iQ4 = cVar.f5501d;
        if (z13) {
            iQ4 = yVar.q();
        }
        boolean z14 = (iB & 256) != 0;
        boolean z15 = (iB & 512) != 0;
        boolean z16 = (iB & 1024) != 0;
        boolean z17 = (iB & 2048) != 0;
        long[] jArr3 = kVar.f5597h;
        if (jArr3 != null && jArr3.length == 1) {
            j10 = 0;
            if (jArr3[0] == 0) {
                jD = ai.d(((long[]) ai.a(kVar.f5598i))[0], 1000000L, kVar.f5592c);
            }
            iArr = mVar.f5614i;
            iArr2 = mVar.f5615j;
            jArr = mVar.f5616k;
            zArr = mVar.f5617l;
            int i15 = iQ4;
            if (kVar.f5591b == 2 || (i11 & 1) == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            i13 = i12 + mVar.f5613h[i10];
            boolean z18 = z10;
            j11 = kVar.f5592c;
            j12 = jD;
            j13 = mVar.f5623r;
            i14 = i12;
            while (i14 < i13) {
                if (z14) {
                    iQ = yVar.q();
                } else {
                    iQ = cVar.f5499b;
                }
                int iA = a(iQ);
                if (z15) {
                    iQ2 = yVar.q();
                } else {
                    iQ2 = cVar.f5500c;
                }
                int iA2 = a(iQ2);
                if (z16) {
                    iQ3 = yVar.q();
                } else if (i14 == 0 || !z13) {
                    iQ3 = cVar.f5501d;
                } else {
                    iQ3 = i15;
                }
                boolean z19 = z17;
                if (z17) {
                    iArr2[i14] = (int) ((((long) yVar.q()) * 1000000) / j11);
                    z11 = false;
                } else {
                    z11 = false;
                    iArr2[i14] = 0;
                }
                jArr[i14] = ai.d(j13, 1000000L, j11) - j12;
                if (!mVar.f5624s) {
                    jArr[i14] = jArr[i14] + bVar2.f5539d.f5632h;
                }
                iArr[i14] = iA2;
                if (((iQ3 >> 16) & 1) == 0 || (z18 && i14 != 0)) {
                    z12 = z11;
                } else {
                    z12 = true;
                }
                zArr[i14] = z12;
                j13 += (long) iA;
                i14++;
                bVar2 = bVar;
                z14 = z14;
                j11 = j11;
                z13 = z13;
                z17 = z19;
                z15 = z15;
                z16 = z16;
            }
            mVar.f5623r = j13;
            return i13;
        }
        j10 = 0;
        jD = j10;
        iArr = mVar.f5614i;
        iArr2 = mVar.f5615j;
        jArr = mVar.f5616k;
        zArr = mVar.f5617l;
        int i16 = iQ4;
        if (kVar.f5591b == 2) {
            z10 = false;
        } else {
            z10 = false;
        }
        i13 = i12 + mVar.f5613h[i10];
        boolean z110 = z10;
        j11 = kVar.f5592c;
        j12 = jD;
        j13 = mVar.f5623r;
        i14 = i12;
        while (i14 < i13) {
            if (z14) {
                iQ = yVar.q();
            } else {
                iQ = cVar.f5499b;
            }
            int iA3 = a(iQ);
            if (z15) {
                iQ2 = yVar.q();
            } else {
                iQ2 = cVar.f5500c;
            }
            int iA4 = a(iQ2);
            if (z16) {
                iQ3 = yVar.q();
            } else if (i14 == 0) {
                iQ3 = cVar.f5501d;
            } else {
                iQ3 = cVar.f5501d;
            }
            boolean z111 = z17;
            if (z17) {
                iArr2[i14] = (int) ((((long) yVar.q()) * 1000000) / j11);
                z11 = false;
            } else {
                z11 = false;
                iArr2[i14] = 0;
            }
            jArr[i14] = ai.d(j13, 1000000L, j11) - j12;
            if (!mVar.f5624s) {
                jArr[i14] = jArr[i14] + bVar2.f5539d.f5632h;
            }
            iArr[i14] = iA4;
            if (((iQ3 >> 16) & 1) == 0) {
                z12 = z11;
            } else {
                z12 = z11;
            }
            zArr[i14] = z12;
            j13 += (long) iA3;
            i14++;
            bVar2 = bVar;
            z14 = z14;
            j11 = j11;
            z13 = z13;
            z17 = z111;
            z15 = z15;
            z16 = z16;
        }
        mVar.f5623r = j13;
        return i13;
    }

    private static Pair<Long, com.applovin.exoplayer2.e.c> a(y yVar, long j10) throws com.applovin.exoplayer2.ai {
        long jY;
        long jY2;
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(4);
        long jO = yVar.o();
        if (iA == 0) {
            jY = yVar.o();
            jY2 = yVar.o();
        } else {
            jY = yVar.y();
            jY2 = yVar.y();
        }
        long j11 = jY;
        long j12 = jY2 + j10;
        long jD = ai.d(j11, 1000000L, jO);
        yVar.e(2);
        int i10 = yVar.i();
        int[] iArr = new int[i10];
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        long[] jArr3 = new long[i10];
        long j13 = jD;
        int i11 = 0;
        long j14 = j11;
        while (i11 < i10) {
            int iQ = yVar.q();
            if ((iQ & Integer.MIN_VALUE) != 0) {
                throw com.applovin.exoplayer2.ai.b("Unhandled indirect reference", null);
            }
            long jO2 = yVar.o();
            iArr[i11] = iQ & Integer.MAX_VALUE;
            jArr[i11] = j12;
            jArr3[i11] = j13;
            long j15 = j14 + jO2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i12 = i10;
            int[] iArr2 = iArr;
            long jD2 = ai.d(j15, 1000000L, jO);
            jArr4[i11] = jD2 - jArr5[i11];
            yVar.e(4);
            j12 += (long) iArr2[i11];
            i11++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            i10 = i12;
            j14 = j15;
            j13 = jD2;
        }
        return Pair.create(Long.valueOf(jD), new com.applovin.exoplayer2.e.c(iArr, jArr, jArr2, jArr3));
    }

    private static com.applovin.exoplayer2.d.e a(List<com.applovin.exoplayer2.e.g.a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            com.applovin.exoplayer2.e.g.a.b bVar = list.get(i10);
            if (bVar.f5468a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrD = bVar.f5472b.d();
                UUID uuidB = h.b(bArrD);
                if (uuidB == null) {
                    q.c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new com.applovin.exoplayer2.d.e.a(uuidB, "video/mp4", bArrD));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.applovin.exoplayer2.d.e(arrayList);
    }

    private c a(SparseArray<c> sparseArray, int i10) {
        return (c) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : com.applovin.exoplayer2.l.a.b(sparseArray.get(i10)));
    }

    private static b a(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = RecyclerView.FOREVER_NS;
        for (int i10 = 0; i10 < size; i10++) {
            b bVarValueAt = sparseArray.valueAt(i10);
            if ((bVarValueAt.f5547l || bVarValueAt.f5541f != bVarValueAt.f5539d.f5626b) && (!bVarValueAt.f5547l || bVarValueAt.f5543h != bVarValueAt.f5537b.f5610e)) {
                long jC = bVarValueAt.c();
                if (jC < j10) {
                    bVar = bVarValueAt;
                    j10 = jC;
                }
            }
        }
        return bVar;
    }

    private static b a(y yVar, SparseArray<b> sparseArray, boolean z10) {
        yVar.d(8);
        int iB = com.applovin.exoplayer2.e.g.a.b(yVar.q());
        b bVarValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(yVar.q());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jY = yVar.y();
            m mVar = bVarValueAt.f5537b;
            mVar.f5608c = jY;
            mVar.f5609d = jY;
        }
        c cVar = bVarValueAt.f5540e;
        bVarValueAt.f5537b.f5606a = new c((iB & 2) != 0 ? yVar.q() - 1 : cVar.f5498a, (iB & 8) != 0 ? yVar.q() : cVar.f5499b, (iB & 16) != 0 ? yVar.q() : cVar.f5500c, (iB & 32) != 0 ? yVar.q() : cVar.f5501d);
        return bVarValueAt;
    }

    private void a() {
        this.f5526s = 0;
        this.f5529v = 0;
    }

    private void a(long j10) throws com.applovin.exoplayer2.ai {
        while (!this.f5523p.isEmpty() && this.f5523p.peek().f5469b == j10) {
            a(this.f5523p.pop());
        }
        a();
    }

    private void a(com.applovin.exoplayer2.e.g.a.C0086a c0086a) throws com.applovin.exoplayer2.ai {
        int i10 = c0086a.f5468a;
        if (i10 == 1836019574) {
            b(c0086a);
        } else if (i10 == 1836019558) {
            c(c0086a);
        } else {
            if (this.f5523p.isEmpty()) {
                return;
            }
            this.f5523p.peek().a(c0086a);
        }
    }

    private static void a(com.applovin.exoplayer2.e.g.a.C0086a c0086a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws com.applovin.exoplayer2.ai {
        int size = c0086a.f5471d.size();
        for (int i11 = 0; i11 < size; i11++) {
            com.applovin.exoplayer2.e.g.a.C0086a c0086a2 = c0086a.f5471d.get(i11);
            if (c0086a2.f5468a == 1953653094) {
                b(c0086a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void a(com.applovin.exoplayer2.e.g.a.C0086a c0086a, b bVar, int i10) throws com.applovin.exoplayer2.ai {
        List<com.applovin.exoplayer2.e.g.a.b> list = c0086a.f5470c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            com.applovin.exoplayer2.e.g.a.b bVar2 = list.get(i13);
            if (bVar2.f5468a == 1953658222) {
                y yVar = bVar2.f5472b;
                yVar.d(12);
                int iW = yVar.w();
                if (iW > 0) {
                    i12 += iW;
                    i11++;
                }
            }
        }
        bVar.f5543h = 0;
        bVar.f5542g = 0;
        bVar.f5541f = 0;
        bVar.f5537b.a(i11, i12);
        int i14 = 0;
        int iA = 0;
        for (int i15 = 0; i15 < size; i15++) {
            com.applovin.exoplayer2.e.g.a.b bVar3 = list.get(i15);
            if (bVar3.f5468a == 1953658222) {
                iA = a(bVar, i14, i10, bVar3.f5472b, iA);
                i14++;
            }
        }
    }

    private static void a(com.applovin.exoplayer2.e.g.a.C0086a c0086a, String str, m mVar) throws com.applovin.exoplayer2.ai {
        byte[] bArr = null;
        y yVar = null;
        y yVar2 = null;
        for (int i10 = 0; i10 < c0086a.f5470c.size(); i10++) {
            com.applovin.exoplayer2.e.g.a.b bVar = c0086a.f5470c.get(i10);
            y yVar3 = bVar.f5472b;
            int i11 = bVar.f5468a;
            if (i11 == 1935828848) {
                yVar3.d(12);
                if (yVar3.q() == 1936025959) {
                    yVar = yVar3;
                }
            } else if (i11 == 1936158820) {
                yVar3.d(12);
                if (yVar3.q() == 1936025959) {
                    yVar2 = yVar3;
                }
            }
        }
        if (yVar == null || yVar2 == null) {
            return;
        }
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        yVar.e(4);
        if (iA == 1) {
            yVar.e(4);
        }
        if (yVar.q() != 1) {
            throw com.applovin.exoplayer2.ai.a("Entry count in sbgp != 1 (unsupported).");
        }
        yVar2.d(8);
        int iA2 = com.applovin.exoplayer2.e.g.a.a(yVar2.q());
        yVar2.e(4);
        if (iA2 == 1) {
            if (yVar2.o() == 0) {
                throw com.applovin.exoplayer2.ai.a("Variable length description in sgpd found (unsupported)");
            }
        } else if (iA2 >= 2) {
            yVar2.e(4);
        }
        if (yVar2.o() != 1) {
            throw com.applovin.exoplayer2.ai.a("Entry count in sgpd != 1 (unsupported).");
        }
        yVar2.e(1);
        int iH = yVar2.h();
        int i12 = (iH & 240) >> 4;
        int i13 = iH & 15;
        boolean z10 = yVar2.h() == 1;
        if (z10) {
            int iH2 = yVar2.h();
            byte[] bArr2 = new byte[16];
            yVar2.a(bArr2, 0, 16);
            if (iH2 == 0) {
                int iH3 = yVar2.h();
                bArr = new byte[iH3];
                yVar2.a(bArr, 0, iH3);
            }
            mVar.f5618m = true;
            mVar.f5620o = new l(z10, str, iH2, bArr2, i12, i13, bArr);
        }
    }

    private void a(com.applovin.exoplayer2.e.g.a.b bVar, long j10) throws com.applovin.exoplayer2.ai {
        if (!this.f5523p.isEmpty()) {
            this.f5523p.peek().a(bVar);
            return;
        }
        int i10 = bVar.f5468a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                a(bVar.f5472b);
            }
        } else {
            Pair<Long, com.applovin.exoplayer2.e.c> pairA = a(bVar.f5472b, j10);
            this.B = ((Long) pairA.first).longValue();
            this.H.a((com.applovin.exoplayer2.e.v) pairA.second);
            this.K = true;
        }
    }

    private static void a(l lVar, y yVar, m mVar) throws com.applovin.exoplayer2.ai {
        int i10;
        int i11 = lVar.f5604d;
        yVar.d(8);
        if ((com.applovin.exoplayer2.e.g.a.b(yVar.q()) & 1) == 1) {
            yVar.e(8);
        }
        int iH = yVar.h();
        int iW = yVar.w();
        if (iW > mVar.f5611f) {
            StringBuilder sbA = r0.a("Saiz sample count ", iW, " is greater than fragment sample count");
            sbA.append(mVar.f5611f);
            throw com.applovin.exoplayer2.ai.b(sbA.toString(), null);
        }
        if (iH == 0) {
            boolean[] zArr = mVar.f5619n;
            i10 = 0;
            for (int i12 = 0; i12 < iW; i12++) {
                int iH2 = yVar.h();
                i10 += iH2;
                zArr[i12] = iH2 > i11;
            }
        } else {
            i10 = (iH * iW) + 0;
            Arrays.fill(mVar.f5619n, 0, iW, iH > i11);
        }
        Arrays.fill(mVar.f5619n, iW, mVar.f5611f, false);
        if (i10 > 0) {
            mVar.a(i10);
        }
    }

    private void a(y yVar) {
        long jD;
        String str;
        long jD2;
        String str2;
        long jO;
        long jC;
        if (this.I.length == 0) {
            return;
        }
        yVar.d(8);
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        if (iA == 0) {
            String str3 = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            String str4 = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            long jO2 = yVar.o();
            jD = ai.d(yVar.o(), 1000000L, jO2);
            long j10 = this.B;
            long j11 = j10 != -9223372036854775807L ? j10 + jD : -9223372036854775807L;
            str = str3;
            jD2 = ai.d(yVar.o(), 1000L, jO2);
            str2 = str4;
            jO = yVar.o();
            jC = j11;
        } else {
            if (iA != 1) {
                q.c("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iA);
                return;
            }
            long jO3 = yVar.o();
            jC = ai.d(yVar.y(), 1000000L, jO3);
            long jD3 = ai.d(yVar.o(), 1000L, jO3);
            long jO4 = yVar.o();
            str = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            jD2 = jD3;
            jO = jO4;
            str2 = (String) com.applovin.exoplayer2.l.a.b(yVar.B());
            jD = -9223372036854775807L;
        }
        byte[] bArr = new byte[yVar.a()];
        yVar.a(bArr, 0, yVar.a());
        y yVar2 = new y(this.f5521n.a(new com.applovin.exoplayer2.g.b.a(str, str2, jD2, jO, bArr)));
        int iA2 = yVar2.a();
        for (x xVar : this.I) {
            yVar2.d(0);
            xVar.a(yVar2, iA2);
        }
        if (jC == -9223372036854775807L) {
            this.f5524q.addLast(new a(jD, iA2));
            this.f5532y += iA2;
            return;
        }
        ag agVar = this.f5520m;
        if (agVar != null) {
            jC = agVar.c(jC);
        }
        for (x xVar2 : this.I) {
            xVar2.a(jC, 1, iA2, 0, null);
        }
    }

    private static void a(y yVar, int i10, m mVar) throws com.applovin.exoplayer2.ai {
        yVar.d(i10 + 8);
        int iB = com.applovin.exoplayer2.e.g.a.b(yVar.q());
        if ((iB & 1) != 0) {
            throw com.applovin.exoplayer2.ai.a("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iB & 2) != 0;
        int iW = yVar.w();
        if (iW == 0) {
            Arrays.fill(mVar.f5619n, 0, mVar.f5611f, false);
            return;
        }
        if (iW != mVar.f5611f) {
            StringBuilder sbA = r0.a("Senc sample count ", iW, " is different from fragment sample count");
            sbA.append(mVar.f5611f);
            throw com.applovin.exoplayer2.ai.b(sbA.toString(), null);
        }
        Arrays.fill(mVar.f5619n, 0, iW, z10);
        mVar.a(yVar.a());
        mVar.a(yVar);
    }

    private static void a(y yVar, m mVar) throws com.applovin.exoplayer2.ai {
        yVar.d(8);
        int iQ = yVar.q();
        if ((com.applovin.exoplayer2.e.g.a.b(iQ) & 1) == 1) {
            yVar.e(8);
        }
        int iW = yVar.w();
        if (iW == 1) {
            mVar.f5609d += com.applovin.exoplayer2.e.g.a.a(iQ) == 0 ? yVar.o() : yVar.y();
        } else {
            throw com.applovin.exoplayer2.ai.b("Unexpected saio entry count: " + iW, null);
        }
    }

    private static void a(y yVar, m mVar, byte[] bArr) throws com.applovin.exoplayer2.ai {
        yVar.d(8);
        yVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, f5509b)) {
            a(yVar, 16, mVar);
        }
    }

    private static Pair<Integer, c> b(y yVar) {
        yVar.d(12);
        return Pair.create(Integer.valueOf(yVar.q()), new c(yVar.q() - 1, yVar.q(), yVar.q(), yVar.q()));
    }

    private void b() {
        int i10;
        x[] xVarArr = new x[2];
        this.I = xVarArr;
        x xVar = this.f5525r;
        int i11 = 0;
        if (xVar != null) {
            xVarArr[0] = xVar;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f5511d & 4) != 0) {
            xVarArr[i10] = this.H.a(100, 5);
            i10++;
            i12 = 101;
        }
        x[] xVarArr2 = (x[]) ai.a(this.I, i10);
        this.I = xVarArr2;
        for (x xVar2 : xVarArr2) {
            xVar2.a(f5510c);
        }
        this.J = new x[this.f5513f.size()];
        while (i11 < this.J.length) {
            x xVarA = this.H.a(i12, 3);
            xVarA.a(this.f5513f.get(i11));
            this.J[i11] = xVarA;
            i11++;
            i12++;
        }
    }

    private void b(long j10) {
        while (!this.f5524q.isEmpty()) {
            a aVarRemoveFirst = this.f5524q.removeFirst();
            this.f5532y -= aVarRemoveFirst.f5535b;
            long jC = aVarRemoveFirst.f5534a + j10;
            ag agVar = this.f5520m;
            if (agVar != null) {
                jC = agVar.c(jC);
            }
            for (x xVar : this.I) {
                xVar.a(jC, 1, aVarRemoveFirst.f5535b, this.f5532y, null);
            }
        }
    }

    private void b(com.applovin.exoplayer2.e.g.a.C0086a c0086a) throws com.applovin.exoplayer2.ai {
        int i10 = 0;
        com.applovin.exoplayer2.l.a.b(this.f5512e == null, "Unexpected moov box.");
        com.applovin.exoplayer2.d.e eVarA = a(c0086a.f5470c);
        com.applovin.exoplayer2.e.g.a.C0086a c0086a2 = (com.applovin.exoplayer2.e.g.a.C0086a) com.applovin.exoplayer2.l.a.b(c0086a.e(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0086a2.f5470c.size();
        long jC = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            com.applovin.exoplayer2.e.g.a.b bVar = c0086a2.f5470c.get(i11);
            int i12 = bVar.f5468a;
            if (i12 == 1953654136) {
                Pair<Integer, c> pairB = b(bVar.f5472b);
                sparseArray.put(((Integer) pairB.first).intValue(), (c) pairB.second);
            } else if (i12 == 1835362404) {
                jC = c(bVar.f5472b);
            }
        }
        List<n> listA = com.applovin.exoplayer2.e.g.b.a(c0086a, new r(), jC, eVarA, (this.f5511d & 16) != 0, false, (Function<k, k>) new Function() { // from class: com.applovin.exoplayer2.e.g.o
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                return this.f5633c.a((k) obj);
            }
        });
        int size2 = listA.size();
        if (this.f5514g.size() != 0) {
            com.applovin.exoplayer2.l.a.b(this.f5514g.size() == size2);
            while (i10 < size2) {
                n nVar = listA.get(i10);
                k kVar = nVar.f5625a;
                this.f5514g.get(kVar.f5590a).a(nVar, a(sparseArray, kVar.f5590a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            n nVar2 = listA.get(i10);
            k kVar2 = nVar2.f5625a;
            this.f5514g.put(kVar2.f5590a, new b(this.H.a(i10, kVar2.f5591b), nVar2, a(sparseArray, kVar2.f5590a)));
            this.A = Math.max(this.A, kVar2.f5594e);
            i10++;
        }
        this.H.a();
    }

    private static void b(com.applovin.exoplayer2.e.g.a.C0086a c0086a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws com.applovin.exoplayer2.ai {
        b bVarA = a(((com.applovin.exoplayer2.e.g.a.b) com.applovin.exoplayer2.l.a.b(c0086a.d(1952868452))).f5472b, sparseArray, z10);
        if (bVarA == null) {
            return;
        }
        m mVar = bVarA.f5537b;
        long j10 = mVar.f5623r;
        boolean z11 = mVar.f5624s;
        bVarA.a();
        bVarA.f5547l = true;
        com.applovin.exoplayer2.e.g.a.b bVarD = c0086a.d(1952867444);
        if (bVarD == null || (i10 & 2) != 0) {
            mVar.f5623r = j10;
            mVar.f5624s = z11;
        } else {
            mVar.f5623r = d(bVarD.f5472b);
            mVar.f5624s = true;
        }
        a(c0086a, bVarA, i10);
        l lVarA = bVarA.f5539d.f5625a.a(((c) com.applovin.exoplayer2.l.a.b(mVar.f5606a)).f5498a);
        com.applovin.exoplayer2.e.g.a.b bVarD2 = c0086a.d(1935763834);
        if (bVarD2 != null) {
            a((l) com.applovin.exoplayer2.l.a.b(lVarA), bVarD2.f5472b, mVar);
        }
        com.applovin.exoplayer2.e.g.a.b bVarD3 = c0086a.d(1935763823);
        if (bVarD3 != null) {
            a(bVarD3.f5472b, mVar);
        }
        com.applovin.exoplayer2.e.g.a.b bVarD4 = c0086a.d(1936027235);
        if (bVarD4 != null) {
            b(bVarD4.f5472b, mVar);
        }
        a(c0086a, lVarA != null ? lVarA.f5602b : null, mVar);
        int size = c0086a.f5470c.size();
        for (int i11 = 0; i11 < size; i11++) {
            com.applovin.exoplayer2.e.g.a.b bVar = c0086a.f5470c.get(i11);
            if (bVar.f5468a == 1970628964) {
                a(bVar.f5472b, mVar, bArr);
            }
        }
    }

    private static void b(y yVar, m mVar) throws com.applovin.exoplayer2.ai {
        a(yVar, 0, mVar);
    }

    private static boolean b(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[LOOP:0: B:33:0x00b5->B:34:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x0139  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:61:0x014b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152  */
    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        long jC;
        long jC2;
        int i10;
        int i11;
        long j10;
        long jC3;
        int size;
        int i12;
        if (this.f5529v == 0) {
            if (!iVar.a(this.f5522o.d(), 0, 8, true)) {
                return false;
            }
            this.f5529v = 8;
            this.f5522o.d(0);
            this.f5528u = this.f5522o.o();
            this.f5527t = this.f5522o.q();
        }
        long j11 = this.f5528u;
        if (j11 != 1) {
            if (j11 == 0) {
                long jD = iVar.d();
                if (jD == -1 && !this.f5523p.isEmpty()) {
                    jD = this.f5523p.peek().f5469b;
                }
                if (jD != -1) {
                    jC = (jD - iVar.c()) + ((long) this.f5529v);
                }
            }
            if (this.f5528u >= this.f5529v) {
                throw com.applovin.exoplayer2.ai.a("Atom size less than header length (unsupported).");
            }
            jC2 = iVar.c() - ((long) this.f5529v);
            i10 = this.f5527t;
            if ((i10 != 1836019558 || i10 == 1835295092) && !this.K) {
                this.H.a(new com.applovin.exoplayer2.e.v.b(this.A, jC2));
                this.K = true;
            }
            if (this.f5527t == 1836019558) {
                size = this.f5514g.size();
                for (i12 = 0; i12 < size; i12++) {
                    m mVar = this.f5514g.valueAt(i12).f5537b;
                    mVar.f5607b = jC2;
                    mVar.f5609d = jC2;
                    mVar.f5608c = jC2;
                }
            }
            i11 = this.f5527t;
            if (i11 == 1835295092) {
                this.C = null;
                this.f5531x = jC2 + this.f5528u;
                this.f5526s = 2;
                return true;
            }
            if (c(i11)) {
                jC3 = (iVar.c() + this.f5528u) - 8;
                this.f5523p.push(new com.applovin.exoplayer2.e.g.a.C0086a(this.f5527t, jC3));
                if (this.f5528u == this.f5529v) {
                    a(jC3);
                } else {
                    a();
                }
            } else {
                if (b(this.f5527t)) {
                    if (this.f5529v == 8) {
                        throw com.applovin.exoplayer2.ai.a("Leaf atom defines extended atom size (unsupported).");
                    }
                    j10 = this.f5528u;
                    if (j10 <= 2147483647L) {
                        throw com.applovin.exoplayer2.ai.a("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    y yVar = new y((int) j10);
                    System.arraycopy(this.f5522o.d(), 0, yVar.d(), 0, 8);
                    this.f5530w = yVar;
                } else {
                    if (this.f5528u <= 2147483647L) {
                        throw com.applovin.exoplayer2.ai.a("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f5530w = null;
                }
                this.f5526s = 1;
            }
            return true;
        }
        iVar.b(this.f5522o.d(), 8, 8);
        this.f5529v += 8;
        jC = this.f5522o.y();
        this.f5528u = jC;
        if (this.f5528u >= this.f5529v) {
            throw com.applovin.exoplayer2.ai.a("Atom size less than header length (unsupported).");
        }
        jC2 = iVar.c() - ((long) this.f5529v);
        i10 = this.f5527t;
        if (i10 != 1836019558) {
            this.H.a(new com.applovin.exoplayer2.e.v.b(this.A, jC2));
            this.K = true;
        } else {
            this.H.a(new com.applovin.exoplayer2.e.v.b(this.A, jC2));
            this.K = true;
        }
        if (this.f5527t == 1836019558) {
            size = this.f5514g.size();
            while (i12 < size) {
                m mVar2 = this.f5514g.valueAt(i12).f5537b;
                mVar2.f5607b = jC2;
                mVar2.f5609d = jC2;
                mVar2.f5608c = jC2;
            }
        }
        i11 = this.f5527t;
        if (i11 == 1835295092) {
            this.C = null;
            this.f5531x = jC2 + this.f5528u;
            this.f5526s = 2;
            return true;
        }
        if (c(i11)) {
            jC3 = (iVar.c() + this.f5528u) - 8;
            this.f5523p.push(new com.applovin.exoplayer2.e.g.a.C0086a(this.f5527t, jC3));
            if (this.f5528u == this.f5529v) {
                a(jC3);
            } else {
                a();
            }
        } else {
            if (b(this.f5527t)) {
                if (this.f5529v == 8) {
                    throw com.applovin.exoplayer2.ai.a("Leaf atom defines extended atom size (unsupported).");
                }
                j10 = this.f5528u;
                if (j10 <= 2147483647L) {
                    throw com.applovin.exoplayer2.ai.a("Leaf atom with length > 2147483647 (unsupported).");
                }
                y yVar2 = new y((int) j10);
                System.arraycopy(this.f5522o.d(), 0, yVar2.d(), 0, 8);
                this.f5530w = yVar2;
            } else {
                if (this.f5528u <= 2147483647L) {
                    throw com.applovin.exoplayer2.ai.a("Skipping atom with length > 2147483647 (unsupported).");
                }
                this.f5530w = null;
            }
            this.f5526s = 1;
        }
        return true;
    }

    private static long c(y yVar) {
        yVar.d(8);
        return com.applovin.exoplayer2.e.g.a.a(yVar.q()) == 0 ? yVar.o() : yVar.y();
    }

    private void c(com.applovin.exoplayer2.e.g.a.C0086a c0086a) throws com.applovin.exoplayer2.ai {
        a(c0086a, this.f5514g, this.f5512e != null, this.f5511d, this.f5518k);
        com.applovin.exoplayer2.d.e eVarA = a(c0086a.f5470c);
        if (eVarA != null) {
            int size = this.f5514g.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f5514g.valueAt(i10).a(eVarA);
            }
        }
        if (this.f5533z != -9223372036854775807L) {
            int size2 = this.f5514g.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f5514g.valueAt(i11).a(this.f5533z);
            }
            this.f5533z = -9223372036854775807L;
        }
    }

    private void c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i10 = ((int) this.f5528u) - this.f5529v;
        y yVar = this.f5530w;
        if (yVar != null) {
            iVar.b(yVar.d(), 8, i10);
            a(new com.applovin.exoplayer2.e.g.a.b(this.f5527t, yVar), iVar.c());
        } else {
            iVar.b(i10);
        }
        a(iVar.c());
    }

    private static boolean c(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static long d(y yVar) {
        yVar.d(8);
        return com.applovin.exoplayer2.e.g.a.a(yVar.q()) == 1 ? yVar.y() : yVar.o();
    }

    private void d(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int size = this.f5514g.size();
        long j10 = RecyclerView.FOREVER_NS;
        b bVarValueAt = null;
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.f5514g.valueAt(i10).f5537b;
            if (mVar.f5622q) {
                long j11 = mVar.f5609d;
                if (j11 < j10) {
                    bVarValueAt = this.f5514g.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f5526s = 3;
            return;
        }
        int iC = (int) (j10 - iVar.c());
        if (iC < 0) {
            throw com.applovin.exoplayer2.ai.b("Offset to encryption data was negative.", null);
        }
        iVar.b(iC);
        bVarValueAt.f5537b.a(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] d() {
        return new com.applovin.exoplayer2.e.h[]{new e()};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean e(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int iA;
        int iA2;
        b bVarA = this.C;
        Throwable th = null;
        if (bVarA == null) {
            bVarA = a(this.f5514g);
            if (bVarA == null) {
                int iC = (int) (this.f5531x - iVar.c());
                if (iC < 0) {
                    throw com.applovin.exoplayer2.ai.b("Offset to end of mdat was negative.", null);
                }
                iVar.b(iC);
                a();
                return false;
            }
            int iC2 = (int) (bVarA.c() - iVar.c());
            if (iC2 < 0) {
                q.c("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iC2 = 0;
            }
            iVar.b(iC2);
            this.C = bVarA;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f5526s == 3) {
            int iD = bVarA.d();
            this.D = iD;
            if (bVarA.f5541f < bVarA.f5544i) {
                iVar.b(iD);
                bVarA.g();
                if (!bVarA.f()) {
                    this.C = null;
                }
                this.f5526s = 3;
                return true;
            }
            if (bVarA.f5539d.f5625a.f5596g == 1) {
                this.D = iD - 8;
                iVar.b(8);
            }
            if ("audio/ac4".equals(bVarA.f5539d.f5625a.f5595f.f8198l)) {
                this.E = bVarA.a(this.D, 7);
                com.applovin.exoplayer2.b.c.a(this.D, this.f5519l);
                bVarA.f5536a.a(this.f5519l, 7);
                iA2 = this.E + 7;
            } else {
                iA2 = bVarA.a(this.D, 0);
            }
            this.E = iA2;
            this.D += this.E;
            this.f5526s = 4;
            this.F = 0;
        }
        k kVar = bVarA.f5539d.f5625a;
        x xVar = bVarA.f5536a;
        long jB = bVarA.b();
        ag agVar = this.f5520m;
        if (agVar != null) {
            jB = agVar.c(jB);
        }
        long j10 = jB;
        if (kVar.f5599j == 0) {
            while (true) {
                int i12 = this.E;
                int i13 = this.D;
                if (i12 >= i13) {
                    break;
                }
                this.E += xVar.a((com.applovin.exoplayer2.k.g) iVar, i13 - i12, false);
            }
        } else {
            byte[] bArrD = this.f5516i.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i14 = kVar.f5599j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.E < this.D) {
                int i17 = this.F;
                if (i17 == 0) {
                    iVar.b(bArrD, i16, i15);
                    this.f5516i.d(0);
                    int iQ = this.f5516i.q();
                    if (iQ < i11) {
                        throw com.applovin.exoplayer2.ai.b("Invalid NAL length", th);
                    }
                    this.F = iQ - 1;
                    this.f5515h.d(0);
                    xVar.a(this.f5515h, i10);
                    xVar.a(this.f5516i, i11);
                    this.G = (this.J.length <= 0 || !com.applovin.exoplayer2.l.v.a(kVar.f5595f.f8198l, bArrD[i10])) ? 0 : i11;
                    this.E += 5;
                    this.D += i16;
                } else {
                    if (this.G) {
                        this.f5517j.a(i17);
                        iVar.b(this.f5517j.d(), 0, this.F);
                        xVar.a(this.f5517j, this.F);
                        iA = this.F;
                        int iA3 = com.applovin.exoplayer2.l.v.a(this.f5517j.d(), this.f5517j.b());
                        this.f5517j.d("video/hevc".equals(kVar.f5595f.f8198l) ? 1 : 0);
                        this.f5517j.c(iA3);
                        com.applovin.exoplayer2.e.b.a(j10, this.f5517j, this.J);
                    } else {
                        iA = xVar.a((com.applovin.exoplayer2.k.g) iVar, i17, false);
                    }
                    this.E += iA;
                    this.F -= iA;
                    th = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int iE = bVarA.e();
        l lVarH = bVarA.h();
        xVar.a(j10, iE, this.D, 0, lVarH != null ? lVarH.f5603c : null);
        b(j10);
        if (!bVarA.f()) {
            this.C = null;
        }
        this.f5526s = 3;
        return true;
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        while (true) {
            int i10 = this.f5526s;
            if (i10 != 0) {
                if (i10 == 1) {
                    c(iVar);
                } else if (i10 == 2) {
                    d(iVar);
                } else if (e(iVar)) {
                    return 0;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    public k a(k kVar) {
        return kVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        int size = this.f5514g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5514g.valueAt(i10).a();
        }
        this.f5524q.clear();
        this.f5532y = 0;
        this.f5533z = j11;
        this.f5523p.clear();
        a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.H = jVar;
        a();
        b();
        k kVar = this.f5512e;
        if (kVar != null) {
            this.f5514g.put(0, new b(jVar.a(0, kVar.f5591b), new n(this.f5512e, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.H.a();
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return j.a(iVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
