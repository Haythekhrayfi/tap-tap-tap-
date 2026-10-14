package com.applovin.exoplayer2.e.f;

import ch.qos.logback.core.util.FileUtil;
import com.applovin.exoplayer2.a.p;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.r;
import com.applovin.exoplayer2.b.z;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.s;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f5435a = p.f4001q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.applovin.exoplayer2.g.e.g.a f5436b = z.f4653i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f5438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f5439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r.a f5440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.exoplayer2.e.r f5441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s f5442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final x f5443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private j f5444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x f5445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private x f5446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.applovin.exoplayer2.g.a f5448n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f5449o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f5450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f5451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f5453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f5454t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f5455u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f5456v;

    public d() {
        this(0);
    }

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public d(int i10, long j10) {
        this.f5437c = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f5438d = j10;
        this.f5439e = new y(10);
        this.f5440f = new r.a();
        this.f5441g = new com.applovin.exoplayer2.e.r();
        this.f5449o = -9223372036854775807L;
        this.f5442h = new s();
        com.applovin.exoplayer2.e.g gVar = new com.applovin.exoplayer2.e.g();
        this.f5443i = gVar;
        this.f5446l = gVar;
    }

    private static int a(y yVar, int i10) {
        if (yVar.b() >= i10 + 4) {
            yVar.d(i10);
            int iQ = yVar.q();
            if (iQ == 1483304551 || iQ == 1231971951) {
                return iQ;
            }
        }
        if (yVar.b() < 40) {
            return 0;
        }
        yVar.d(36);
        return yVar.q() == 1447187017 ? 1447187017 : 0;
    }

    private long a(long j10) {
        return ((j10 * 1000000) / ((long) this.f5440f.f4588d)) + this.f5449o;
    }

    private static long a(com.applovin.exoplayer2.g.a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int iA = aVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            com.applovin.exoplayer2.g.a.InterfaceC0092a interfaceC0092aA = aVar.a(i10);
            if (interfaceC0092aA instanceof com.applovin.exoplayer2.g.e.l) {
                com.applovin.exoplayer2.g.e.l lVar = (com.applovin.exoplayer2.g.e.l) interfaceC0092aA;
                if (lVar.f6377f.equals("TLEN")) {
                    return com.applovin.exoplayer2.h.b(Long.parseLong(lVar.f6389b));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static c a(com.applovin.exoplayer2.g.a aVar, long j10) {
        if (aVar == null) {
            return null;
        }
        int iA = aVar.a();
        for (int i10 = 0; i10 < iA; i10++) {
            com.applovin.exoplayer2.g.a.InterfaceC0092a interfaceC0092aA = aVar.a(i10);
            if (interfaceC0092aA instanceof com.applovin.exoplayer2.g.e.j) {
                return c.a(j10, (com.applovin.exoplayer2.g.e.j) interfaceC0092aA, a(aVar));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static boolean a(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private boolean a(i iVar, boolean z10) throws IOException {
        int iB;
        int i10;
        int iA;
        int i11 = z10 ? FileUtil.BUF_SIZE : 131072;
        iVar.a();
        if (iVar.c() == 0) {
            com.applovin.exoplayer2.g.a aVarA = this.f5442h.a(iVar, (this.f5437c & 8) == 0 ? null : f5436b);
            this.f5448n = aVarA;
            if (aVarA != null) {
                this.f5441g.a(aVarA);
            }
            iB = (int) iVar.b();
            if (!z10) {
                iVar.b(iB);
            }
            i10 = 0;
        } else {
            iB = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (d(iVar)) {
                if (i12 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f5439e.d(0);
            int iQ = this.f5439e.q();
            if ((i10 == 0 || a(iQ, i10)) && (iA = r.a(iQ)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    this.f5440f.a(iQ);
                    i10 = iQ;
                }
                iVar.c(iA - 4);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (z10) {
                        return false;
                    }
                    throw ai.b("Searched too many bytes.", null);
                }
                if (z10) {
                    iVar.a();
                    iVar.c(iB + i14);
                } else {
                    iVar.b(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (z10) {
            iVar.b(iB + i13);
        } else {
            iVar.a();
        }
        this.f5447m = i10;
        return true;
    }

    private int b(i iVar) throws IOException {
        if (this.f5447m == 0) {
            try {
                a(iVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f5453s == null) {
            e eVarE = e(iVar);
            this.f5453s = eVarE;
            this.f5444j.a(eVarE);
            this.f5446l.a(new v.a().f(this.f5440f.f4586b).f(4096).k(this.f5440f.f4589e).l(this.f5440f.f4588d).n(this.f5441g.f6127a).o(this.f5441g.f6128b).a((this.f5437c & 8) != 0 ? null : this.f5448n).a());
            this.f5451q = iVar.c();
        } else if (this.f5451q != 0) {
            long jC = iVar.c();
            long j10 = this.f5451q;
            if (jC < j10) {
                iVar.b((int) (j10 - jC));
            }
        }
        return c(iVar);
    }

    private e b(i iVar, boolean z10) throws IOException {
        iVar.d(this.f5439e.d(), 0, 4);
        this.f5439e.d(0);
        this.f5440f.a(this.f5439e.q());
        return new a(iVar.d(), iVar.c(), this.f5440f, z10);
    }

    private void b() {
        com.applovin.exoplayer2.l.a.a(this.f5445k);
        com.applovin.exoplayer2.l.ai.a(this.f5444j);
    }

    private int c(i iVar) throws IOException {
        if (this.f5452r == 0) {
            iVar.a();
            if (d(iVar)) {
                return -1;
            }
            this.f5439e.d(0);
            int iQ = this.f5439e.q();
            if (!a(iQ, this.f5447m) || r.a(iQ) == -1) {
                iVar.b(1);
                this.f5447m = 0;
                return 0;
            }
            this.f5440f.a(iQ);
            if (this.f5449o == -9223372036854775807L) {
                this.f5449o = this.f5453s.c(iVar.c());
                if (this.f5438d != -9223372036854775807L) {
                    this.f5449o = (this.f5438d - this.f5453s.c(0L)) + this.f5449o;
                }
            }
            r.a aVar = this.f5440f;
            this.f5452r = aVar.f4587c;
            e eVar = this.f5453s;
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                bVar.a(a(this.f5450p + ((long) aVar.f4591g)), iVar.c() + ((long) this.f5440f.f4587c));
                if (this.f5455u && bVar.b(this.f5456v)) {
                    this.f5455u = false;
                    this.f5446l = this.f5445k;
                }
            }
        }
        int iA = this.f5446l.a((com.applovin.exoplayer2.k.g) iVar, this.f5452r, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f5452r - iA;
        this.f5452r = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f5446l.a(a(this.f5450p), 1, this.f5440f.f4587c, 0, null);
        this.f5450p += (long) this.f5440f.f4591g;
        this.f5452r = 0;
        return 0;
    }

    private boolean d(i iVar) throws IOException {
        e eVar = this.f5453s;
        if (eVar != null) {
            long jC = eVar.c();
            if (jC != -1 && iVar.b() > jC - 4) {
                return true;
            }
        }
        try {
            return !iVar.b(this.f5439e.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] d() {
        return new h[]{new d()};
    }

    private e e(i iVar) throws IOException {
        long jA;
        long j10;
        long jB;
        long jC;
        e eVarF = f(iVar);
        c cVarA = a(this.f5448n, iVar.c());
        if (this.f5454t) {
            return new e.a();
        }
        if ((this.f5437c & 4) != 0) {
            if (cVarA != null) {
                jB = cVarA.b();
                jC = cVarA.c();
            } else {
                if (eVarF != null) {
                    jB = eVarF.b();
                    jC = eVarF.c();
                } else {
                    jA = a(this.f5448n);
                    j10 = -1;
                }
                eVarF = new b(jA, iVar.c(), j10);
            }
            j10 = jC;
            jA = jB;
            eVarF = new b(jA, iVar.c(), j10);
        } else if (cVarA != null) {
            eVarF = cVarA;
        } else if (eVarF == null) {
            eVarF = null;
        }
        if (eVarF == null || !(eVarF.a() || (this.f5437c & 1) == 0)) {
            return b(iVar, (this.f5437c & 2) != 0);
        }
        return eVarF;
    }

    private e f(i iVar) throws IOException {
        y yVar = new y(this.f5440f.f4587c);
        iVar.d(yVar.d(), 0, this.f5440f.f4587c);
        r.a aVar = this.f5440f;
        int i10 = aVar.f4585a & 1;
        int i11 = 21;
        int i12 = aVar.f4589e;
        if (i10 != 0) {
            if (i12 != 1) {
                i11 = 36;
            }
        } else if (i12 == 1) {
            i11 = 13;
        }
        int i13 = i11;
        int iA = a(yVar, i13);
        if (iA != 1483304551 && iA != 1231971951) {
            if (iA != 1447187017) {
                iVar.a();
                return null;
            }
            f fVarA = f.a(iVar.d(), iVar.c(), this.f5440f, yVar);
            iVar.b(this.f5440f.f4587c);
            return fVarA;
        }
        g gVarA = g.a(iVar.d(), iVar.c(), this.f5440f, yVar);
        if (gVarA != null && !this.f5441g.a()) {
            iVar.a();
            iVar.c(i13 + 141);
            iVar.d(this.f5439e.d(), 0, 3);
            this.f5439e.d(0);
            this.f5441g.a(this.f5439e.m());
        }
        iVar.b(this.f5440f.f4587c);
        return (gVarA == null || gVarA.a() || iA != 1231971951) ? gVarA : b(iVar, false);
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        b();
        int iB = b(iVar);
        if (iB == -1 && (this.f5453s instanceof b)) {
            long jA = a(this.f5450p);
            if (this.f5453s.b() != jA) {
                ((b) this.f5453s).d(jA);
                this.f5444j.a(this.f5453s);
            }
        }
        return iB;
    }

    public void a() {
        this.f5454t = true;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f5447m = 0;
        this.f5449o = -9223372036854775807L;
        this.f5450p = 0L;
        this.f5452r = 0;
        this.f5456v = j11;
        e eVar = this.f5453s;
        if (!(eVar instanceof b) || ((b) eVar).b(j11)) {
            return;
        }
        this.f5455u = true;
        this.f5446l = this.f5443i;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f5444j = jVar;
        x xVarA = jVar.a(0, 1);
        this.f5445k = xVarA;
        this.f5446l = xVarA;
        this.f5444j.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        return a(iVar, true);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
