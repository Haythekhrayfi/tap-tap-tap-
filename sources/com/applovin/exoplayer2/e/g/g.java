package com.applovin.exoplayer2.e.g;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.z;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements com.applovin.exoplayer2.e.h, v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f5549a = z.f4654j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f5551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f5552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f5553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f5554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<com.applovin.exoplayer2.e.g.a.C0086a> f5555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f5556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.g.a.InterfaceC0092a> f5557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f5558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5561m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y f5562n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5563o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.applovin.exoplayer2.e.j f5567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a[] f5568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long[][] f5569u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5570v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f5571w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f5572x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.applovin.exoplayer2.g.f.b f5573y;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f5574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f5575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x f5576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5577d;

        public a(k kVar, n nVar, x xVar) {
            this.f5574a = kVar;
            this.f5575b = nVar;
            this.f5576c = xVar;
        }
    }

    public g() {
        this(0);
    }

    public g(int i10) {
        this.f5550b = i10;
        this.f5558j = (i10 & 4) != 0 ? 3 : 0;
        this.f5556h = new i();
        this.f5557i = new ArrayList();
        this.f5554f = new y(16);
        this.f5555g = new ArrayDeque<>();
        this.f5551c = new y(com.applovin.exoplayer2.l.v.f7660a);
        this.f5552d = new y(4);
        this.f5553e = new y();
        this.f5563o = -1;
    }

    private static int a(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int a(n nVar, long j10) {
        int iA = nVar.a(j10);
        return iA == -1 ? nVar.b(j10) : iA;
    }

    private static int a(y yVar) {
        yVar.d(8);
        int iA = a(yVar.q());
        if (iA != 0) {
            return iA;
        }
        yVar.e(4);
        while (yVar.a() > 0) {
            int iA2 = a(yVar.q());
            if (iA2 != 0) {
                return iA2;
            }
        }
        return 0;
    }

    private static long a(n nVar, long j10, long j11) {
        int iA = a(nVar, j10);
        return iA == -1 ? j11 : Math.min(nVar.f5627c[iA], j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k a(k kVar) {
        return kVar;
    }

    private void a(com.applovin.exoplayer2.e.g.a.C0086a c0086a) throws ai {
        com.applovin.exoplayer2.g.a aVar;
        com.applovin.exoplayer2.g.a aVar2;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.f5572x == 1;
        r rVar = new r();
        com.applovin.exoplayer2.e.g.a.b bVarD = c0086a.d(1969517665);
        if (bVarD != null) {
            Pair<com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.g.a> pairA = b.a(bVarD);
            com.applovin.exoplayer2.g.a aVar3 = (com.applovin.exoplayer2.g.a) pairA.first;
            com.applovin.exoplayer2.g.a aVar4 = (com.applovin.exoplayer2.g.a) pairA.second;
            if (aVar3 != null) {
                rVar.a(aVar3);
            }
            aVar = aVar4;
            aVar2 = aVar3;
        } else {
            aVar = null;
            aVar2 = null;
        }
        com.applovin.exoplayer2.e.g.a.C0086a c0086aE = c0086a.e(1835365473);
        com.applovin.exoplayer2.g.a aVarA = c0086aE != null ? b.a(c0086aE) : null;
        List<n> listA = b.a(c0086a, rVar, -9223372036854775807L, (com.applovin.exoplayer2.d.e) null, (this.f5550b & 1) != 0, z10, new Function() { // from class: com.applovin.exoplayer2.e.g.p
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                return g.a((k) obj);
            }
        });
        com.applovin.exoplayer2.e.j jVar = (com.applovin.exoplayer2.e.j) com.applovin.exoplayer2.l.a.b(this.f5567s);
        int i11 = 0;
        int size = -1;
        long j10 = -9223372036854775807L;
        for (int size2 = listA.size(); i11 < size2; size2 = size2) {
            n nVar = listA.get(i11);
            if (nVar.f5626b == 0) {
                arrayList = arrayList2;
            } else {
                k kVar = nVar.f5625a;
                int i12 = size;
                arrayList = arrayList2;
                long j11 = kVar.f5594e;
                if (j11 == -9223372036854775807L) {
                    j11 = nVar.f5632h;
                }
                long jMax = Math.max(j10, j11);
                a aVar5 = new a(kVar, nVar, jVar.a(i11, kVar.f5591b));
                int i13 = nVar.f5629e + 30;
                com.applovin.exoplayer2.v.a aVarA2 = kVar.f5595f.a();
                aVarA2.f(i13);
                if (kVar.f5591b == 2 && j11 > 0 && (i10 = nVar.f5626b) > 1) {
                    aVarA2.a(i10 / (j11 / 1000000.0f));
                }
                f.a(kVar.f5591b, rVar, aVarA2);
                int i14 = kVar.f5591b;
                com.applovin.exoplayer2.g.a[] aVarArr = new com.applovin.exoplayer2.g.a[2];
                aVarArr[0] = aVar;
                aVarArr[1] = this.f5557i.isEmpty() ? null : new com.applovin.exoplayer2.g.a(this.f5557i);
                f.a(i14, aVar2, aVarA, aVarA2, aVarArr);
                aVar5.f5576c.a(aVarA2.a());
                size = (kVar.f5591b == 2 && i12 == -1) ? arrayList.size() : i12;
                arrayList.add(aVar5);
                j10 = jMax;
            }
            i11++;
            arrayList2 = arrayList;
            listA = listA;
        }
        this.f5570v = size;
        this.f5571w = j10;
        a[] aVarArr2 = (a[]) arrayList2.toArray(new a[0]);
        this.f5568t = aVarArr2;
        this.f5569u = a(aVarArr2);
        jVar.a();
        jVar.a(this);
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f5575b.f5626b];
            jArr2[i10] = aVarArr[i10].f5575b.f5630f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = RecyclerView.FOREVER_NS;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13] && jArr2[i13] <= j11) {
                    j11 = jArr2[i13];
                    i12 = i13;
                }
            }
            int i14 = iArr[i12];
            jArr[i12][i14] = j10;
            j10 += (long) aVarArr[i12].f5575b.f5628d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr[i12].length) {
                jArr2[i12] = aVarArr[i12].f5575b.f5630f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void b(long j10) throws ai {
        while (!this.f5555g.isEmpty() && this.f5555g.peek().f5469b == j10) {
            com.applovin.exoplayer2.e.g.a.C0086a c0086aPop = this.f5555g.pop();
            if (c0086aPop.f5468a == 1836019574) {
                a(c0086aPop);
                this.f5555g.clear();
                this.f5558j = 2;
            } else if (!this.f5555g.isEmpty()) {
                this.f5555g.peek().a(c0086aPop);
            }
        }
        if (this.f5558j != 2) {
            d();
        }
    }

    private static boolean b(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        long jC;
        com.applovin.exoplayer2.e.g.a.C0086a c0086aPeek;
        y yVar;
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        long j11;
        if (this.f5561m == 0) {
            if (!iVar.a(this.f5554f.d(), 0, 8, true)) {
                e();
                return false;
            }
            this.f5561m = 8;
            this.f5554f.d(0);
            this.f5560l = this.f5554f.o();
            this.f5559k = this.f5554f.q();
        }
        long j12 = this.f5560l;
        if (j12 != 1) {
            if (j12 == 0) {
                long jD = iVar.d();
                if (jD == -1 && (c0086aPeek = this.f5555g.peek()) != null) {
                    jD = c0086aPeek.f5469b;
                }
                if (jD != -1) {
                    jC = (jD - iVar.c()) + ((long) this.f5561m);
                }
            }
            if (this.f5560l >= this.f5561m) {
                throw ai.a("Atom size less than header length (unsupported).");
            }
            if (c(this.f5559k)) {
                long jC2 = iVar.c();
                j10 = this.f5560l;
                i10 = this.f5561m;
                j11 = (jC2 + j10) - ((long) i10);
                if (j10 != i10 && this.f5559k == 1835365473) {
                    c(iVar);
                }
                this.f5555g.push(new com.applovin.exoplayer2.e.g.a.C0086a(this.f5559k, j11));
                if (this.f5560l == this.f5561m) {
                    b(j11);
                } else {
                    d();
                }
            } else {
                if (b(this.f5559k)) {
                    if (this.f5561m == 8) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    com.applovin.exoplayer2.l.a.b(z10);
                    if (this.f5560l <= 2147483647L) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    com.applovin.exoplayer2.l.a.b(z11);
                    yVar = new y((int) this.f5560l);
                    System.arraycopy(this.f5554f.d(), 0, yVar.d(), 0, 8);
                } else {
                    e(iVar.c() - ((long) this.f5561m));
                    yVar = null;
                }
                this.f5562n = yVar;
                this.f5558j = 1;
            }
            return true;
        }
        iVar.b(this.f5554f.d(), 8, 8);
        this.f5561m += 8;
        jC = this.f5554f.y();
        this.f5560l = jC;
        if (this.f5560l >= this.f5561m) {
            throw ai.a("Atom size less than header length (unsupported).");
        }
        if (c(this.f5559k)) {
            long jC3 = iVar.c();
            j10 = this.f5560l;
            i10 = this.f5561m;
            j11 = (jC3 + j10) - ((long) i10);
            if (j10 != i10) {
                c(iVar);
            }
            this.f5555g.push(new com.applovin.exoplayer2.e.g.a.C0086a(this.f5559k, j11));
            if (this.f5560l == this.f5561m) {
                b(j11);
            } else {
                d();
            }
        } else {
            if (b(this.f5559k)) {
                if (this.f5561m == 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                com.applovin.exoplayer2.l.a.b(z10);
                if (this.f5560l <= 2147483647L) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                com.applovin.exoplayer2.l.a.b(z11);
                yVar = new y((int) this.f5560l);
                System.arraycopy(this.f5554f.d(), 0, yVar.d(), 0, 8);
            } else {
                e(iVar.c() - ((long) this.f5561m));
                yVar = null;
            }
            this.f5562n = yVar;
            this.f5558j = 1;
        }
        return true;
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        boolean z10;
        long j10 = this.f5560l - ((long) this.f5561m);
        long jC = iVar.c() + j10;
        y yVar = this.f5562n;
        if (yVar == null) {
            if (j10 < 262144) {
                iVar.b((int) j10);
            } else {
                uVar.f6134a = iVar.c() + j10;
                z10 = true;
            }
            b(jC);
            return (z10 || this.f5558j == 2) ? false : true;
        }
        iVar.b(yVar.d(), this.f5561m, (int) j10);
        if (this.f5559k == 1718909296) {
            this.f5572x = a(yVar);
        } else if (!this.f5555g.isEmpty()) {
            this.f5555g.peek().a(new com.applovin.exoplayer2.e.g.a.b(this.f5559k, yVar));
        }
        z10 = false;
        b(jC);
        if (z10) {
        }
    }

    private int c(long j10) {
        int i10 = -1;
        int i11 = -1;
        long j11 = RecyclerView.FOREVER_NS;
        boolean z10 = true;
        long j12 = RecyclerView.FOREVER_NS;
        boolean z11 = true;
        long j13 = RecyclerView.FOREVER_NS;
        for (int i12 = 0; i12 < ((a[]) com.applovin.exoplayer2.l.ai.a(this.f5568t)).length; i12++) {
            a aVar = this.f5568t[i12];
            int i13 = aVar.f5577d;
            n nVar = aVar.f5575b;
            if (i13 != nVar.f5626b) {
                long j14 = nVar.f5627c[i13];
                long j15 = ((long[][]) com.applovin.exoplayer2.l.ai.a(this.f5569u))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
        }
        return (j11 == RecyclerView.FOREVER_NS || !z10 || j12 < j11 + SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE) ? i11 : i10;
    }

    private int c(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        int iA = this.f5556h.a(iVar, uVar, this.f5557i);
        if (iA == 1 && uVar.f6134a == 0) {
            d();
        }
        return iA;
    }

    private void c(com.applovin.exoplayer2.e.i iVar) throws IOException {
        this.f5553e.a(8);
        iVar.d(this.f5553e.d(), 0, 8);
        b.a(this.f5553e);
        iVar.b(this.f5553e.c());
        iVar.a();
    }

    private static boolean c(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private int d(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        long jC = iVar.c();
        if (this.f5563o == -1) {
            int iC = c(jC);
            this.f5563o = iC;
            if (iC == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) com.applovin.exoplayer2.l.ai.a(this.f5568t))[this.f5563o];
        x xVar = aVar.f5576c;
        int i10 = aVar.f5577d;
        n nVar = aVar.f5575b;
        long j10 = nVar.f5627c[i10];
        int i11 = nVar.f5628d[i10];
        long j11 = (j10 - jC) + ((long) this.f5564p);
        if (j11 < 0 || j11 >= 262144) {
            uVar.f6134a = j10;
            return 1;
        }
        if (aVar.f5574a.f5596g == 1) {
            j11 += 8;
            i11 -= 8;
        }
        iVar.b((int) j11);
        k kVar = aVar.f5574a;
        if (kVar.f5599j == 0) {
            if ("audio/ac4".equals(kVar.f5595f.f8198l)) {
                if (this.f5565q == 0) {
                    com.applovin.exoplayer2.b.c.a(i11, this.f5553e);
                    xVar.a(this.f5553e, 7);
                    this.f5565q += 7;
                }
                i11 += 7;
            }
            while (true) {
                int i12 = this.f5565q;
                if (i12 >= i11) {
                    break;
                }
                int iA = xVar.a((com.applovin.exoplayer2.k.g) iVar, i11 - i12, false);
                this.f5564p += iA;
                this.f5565q += iA;
                this.f5566r -= iA;
            }
        } else {
            byte[] bArrD = this.f5552d.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i13 = aVar.f5574a.f5599j;
            int i14 = 4 - i13;
            while (this.f5565q < i11) {
                int i15 = this.f5566r;
                if (i15 == 0) {
                    iVar.b(bArrD, i14, i13);
                    this.f5564p += i13;
                    this.f5552d.d(0);
                    int iQ = this.f5552d.q();
                    if (iQ < 0) {
                        throw ai.b("Invalid NAL length", null);
                    }
                    this.f5566r = iQ;
                    this.f5551c.d(0);
                    xVar.a(this.f5551c, 4);
                    this.f5565q += 4;
                    i11 += i14;
                } else {
                    int iA2 = xVar.a((com.applovin.exoplayer2.k.g) iVar, i15, false);
                    this.f5564p += iA2;
                    this.f5565q += iA2;
                    this.f5566r -= iA2;
                }
            }
        }
        n nVar2 = aVar.f5575b;
        xVar.a(nVar2.f5630f[i10], nVar2.f5631g[i10], i11, 0, null);
        aVar.f5577d++;
        this.f5563o = -1;
        this.f5564p = 0;
        this.f5565q = 0;
        this.f5566r = 0;
        return 0;
    }

    private void d() {
        this.f5558j = 0;
        this.f5561m = 0;
    }

    private void d(long j10) {
        for (a aVar : this.f5568t) {
            n nVar = aVar.f5575b;
            int iA = nVar.a(j10);
            if (iA == -1) {
                iA = nVar.b(j10);
            }
            aVar.f5577d = iA;
        }
    }

    private void e() {
        if (this.f5572x != 2 || (this.f5550b & 2) == 0) {
            return;
        }
        com.applovin.exoplayer2.e.j jVar = (com.applovin.exoplayer2.e.j) com.applovin.exoplayer2.l.a.b(this.f5567s);
        jVar.a(0, 4).a(new com.applovin.exoplayer2.v.a().a(this.f5573y == null ? null : new com.applovin.exoplayer2.g.a(this.f5573y)).a());
        jVar.a();
        jVar.a(new v.b(-9223372036854775807L));
    }

    private void e(long j10) {
        if (this.f5559k == 1836086884) {
            int i10 = this.f5561m;
            this.f5573y = new com.applovin.exoplayer2.g.f.b(0L, j10, -9223372036854775807L, j10 + ((long) i10), this.f5560l - ((long) i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] f() {
        return new com.applovin.exoplayer2.e.h[]{new g()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        while (true) {
            int i10 = this.f5558j;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return d(iVar, uVar);
                    }
                    if (i10 == 3) {
                        return c(iVar, uVar);
                    }
                    throw new IllegalStateException();
                }
                if (b(iVar, uVar)) {
                    return 1;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.exoplayer2.e.v
    public v.a a(long j10) {
        long j11;
        long jA;
        long j12;
        long j13;
        int iB;
        if (((a[]) com.applovin.exoplayer2.l.a.b(this.f5568t)).length == 0) {
            return new v.a(w.f6139a);
        }
        int i10 = this.f5570v;
        if (i10 != -1) {
            n nVar = this.f5568t[i10].f5575b;
            int iA = a(nVar, j10);
            if (iA == -1) {
                return new v.a(w.f6139a);
            }
            long j14 = nVar.f5630f[iA];
            j11 = nVar.f5627c[iA];
            if (j14 >= j10 || iA >= nVar.f5626b - 1 || (iB = nVar.b(j10)) == -1 || iB == iA) {
                j13 = -1;
                j12 = -9223372036854775807L;
            } else {
                j12 = nVar.f5630f[iB];
                j13 = nVar.f5627c[iB];
            }
            jA = j13;
            j10 = j14;
        } else {
            j11 = RecyclerView.FOREVER_NS;
            jA = -1;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f5568t;
            if (i11 >= aVarArr.length) {
                break;
            }
            if (i11 != this.f5570v) {
                n nVar2 = aVarArr[i11].f5575b;
                long jA2 = a(nVar2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    jA = a(nVar2, j12, jA);
                }
                j11 = jA2;
            }
            i11++;
        }
        w wVar = new w(j10, j11);
        return j12 == -9223372036854775807L ? new v.a(wVar) : new v.a(wVar, new w(j12, jA));
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f5555g.clear();
        this.f5561m = 0;
        this.f5563o = -1;
        this.f5564p = 0;
        this.f5565q = 0;
        this.f5566r = 0;
        if (j10 != 0) {
            if (this.f5568t != null) {
                d(j11);
            }
        } else if (this.f5558j != 3) {
            d();
        } else {
            this.f5556h.a();
            this.f5557i.clear();
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f5567s = jVar;
    }

    @Override // com.applovin.exoplayer2.e.v
    public boolean a() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return j.a(iVar, (this.f5550b & 2) != 0);
    }

    @Override // com.applovin.exoplayer2.e.v
    public long b() {
        return this.f5571w;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
