package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ac implements com.applovin.exoplayer2.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.applovin.exoplayer2.e.l f5718a = com.applovin.exoplayer2.b.z.f4656l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ag> f5721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.exoplayer2.l.y f5722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseIntArray f5723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ad.c f5724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseArray<ad> f5725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f5726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f5727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ab f5728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private aa f5729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.applovin.exoplayer2.e.j f5730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5732o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f5733p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f5734q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ad f5735r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5736s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5737t;

    public class a implements x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.x f5739b = new com.applovin.exoplayer2.l.x(new byte[4]);

        public a() {
        }

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        }

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(com.applovin.exoplayer2.l.y yVar) {
            if (yVar.h() == 0 && (yVar.h() & 128) != 0) {
                yVar.e(6);
                int iA = yVar.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    yVar.a(this.f5739b, 4);
                    int iC = this.f5739b.c(16);
                    this.f5739b.b(3);
                    if (iC == 0) {
                        this.f5739b.b(13);
                    } else {
                        int iC2 = this.f5739b.c(13);
                        if (ac.this.f5725h.get(iC2) == null) {
                            ac.this.f5725h.put(iC2, new y(ac.this.new b(iC2)));
                            ac.b(ac.this);
                        }
                    }
                }
                if (ac.this.f5719b != 2) {
                    ac.this.f5725h.remove(0);
                }
            }
        }
    }

    public class b implements x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.x f5741b = new com.applovin.exoplayer2.l.x(new byte[5]);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseArray<ad> f5742c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SparseIntArray f5743d = new SparseIntArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f5744e;

        public b(int i10) {
            this.f5744e = i10;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0046  */
        /* JADX WARN: Code duplicated, block: B:24:0x0057  */
        /* JADX WARN: Code duplicated, block: B:27:0x005d  */
        private ad.b a(com.applovin.exoplayer2.l.y yVar, int i10) {
            int iC = yVar.c();
            int i11 = i10 + iC;
            String strTrim = null;
            int i12 = -1;
            ArrayList arrayList = null;
            while (yVar.c() < i11) {
                int iH = yVar.h();
                int iC2 = yVar.c() + yVar.h();
                if (iC2 > i11) {
                    break;
                }
                if (iH == 5) {
                    long jO = yVar.o();
                    if (jO == 1094921523) {
                        i12 = 129;
                    } else if (jO == 1161904947) {
                        i12 = 135;
                    } else if (jO == 1094921524) {
                        i12 = 172;
                    } else if (jO == 1212503619) {
                        i12 = 36;
                    }
                } else if (iH == 106) {
                    i12 = 129;
                } else if (iH == 122) {
                    i12 = 135;
                } else if (iH == 127) {
                    if (yVar.h() == 21) {
                        i12 = 172;
                    }
                } else if (iH == 123) {
                    i12 = 138;
                } else if (iH == 10) {
                    strTrim = yVar.f(3).trim();
                } else if (iH == 89) {
                    arrayList = new ArrayList();
                    while (yVar.c() < iC2) {
                        String strTrim2 = yVar.f(3).trim();
                        int iH2 = yVar.h();
                        byte[] bArr = new byte[4];
                        yVar.a(bArr, 0, 4);
                        arrayList.add(new ad.a(strTrim2, iH2, bArr));
                    }
                    i12 = 89;
                } else if (iH == 111) {
                    i12 = 257;
                }
                yVar.e(iC2 - yVar.c());
            }
            yVar.d(i11);
            return new ad.b(i12, strTrim, arrayList, Arrays.copyOfRange(yVar.d(), iC, i11));
        }

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(ag agVar, com.applovin.exoplayer2.e.j jVar, ad.d dVar) {
        }

        @Override // com.applovin.exoplayer2.e.i.x
        public void a(com.applovin.exoplayer2.l.y yVar) {
            ag agVar;
            if (yVar.h() != 2) {
                return;
            }
            if (ac.this.f5719b == 1 || ac.this.f5719b == 2 || ac.this.f5731n == 1) {
                agVar = (ag) ac.this.f5721d.get(0);
            } else {
                agVar = new ag(((ag) ac.this.f5721d.get(0)).a());
                ac.this.f5721d.add(agVar);
            }
            if ((yVar.h() & 128) == 0) {
                return;
            }
            yVar.e(1);
            int i10 = yVar.i();
            int i11 = 3;
            yVar.e(3);
            yVar.a(this.f5741b, 2);
            this.f5741b.b(3);
            int i12 = 13;
            ac.this.f5737t = this.f5741b.c(13);
            yVar.a(this.f5741b, 2);
            int i13 = 4;
            this.f5741b.b(4);
            yVar.e(this.f5741b.c(12));
            if (ac.this.f5719b == 2 && ac.this.f5735r == null) {
                ad.b bVar = new ad.b(21, null, null, ai.f7600f);
                ac acVar = ac.this;
                acVar.f5735r = acVar.f5724g.a(21, bVar);
                if (ac.this.f5735r != null) {
                    ac.this.f5735r.a(agVar, ac.this.f5730m, new ad.d(i10, 21, 8192));
                }
            }
            this.f5742c.clear();
            this.f5743d.clear();
            int iA = yVar.a();
            while (iA > 0) {
                yVar.a(this.f5741b, 5);
                int iC = this.f5741b.c(8);
                this.f5741b.b(i11);
                int iC2 = this.f5741b.c(i12);
                this.f5741b.b(i13);
                int iC3 = this.f5741b.c(12);
                ad.b bVarA = a(yVar, iC3);
                if (iC == 6 || iC == 5) {
                    iC = bVarA.f5748a;
                }
                iA -= iC3 + 5;
                int i14 = ac.this.f5719b == 2 ? iC : iC2;
                if (!ac.this.f5726i.get(i14)) {
                    ad adVarA = (ac.this.f5719b == 2 && iC == 21) ? ac.this.f5735r : ac.this.f5724g.a(iC, bVarA);
                    if (ac.this.f5719b != 2 || iC2 < this.f5743d.get(i14, 8192)) {
                        this.f5743d.put(i14, iC2);
                        this.f5742c.put(i14, adVarA);
                    }
                }
                i11 = 3;
                i13 = 4;
                i12 = 13;
            }
            int size = this.f5743d.size();
            for (int i15 = 0; i15 < size; i15++) {
                int iKeyAt = this.f5743d.keyAt(i15);
                int iValueAt = this.f5743d.valueAt(i15);
                ac.this.f5726i.put(iKeyAt, true);
                ac.this.f5727j.put(iValueAt, true);
                ad adVarValueAt = this.f5742c.valueAt(i15);
                if (adVarValueAt != null) {
                    if (adVarValueAt != ac.this.f5735r) {
                        adVarValueAt.a(agVar, ac.this.f5730m, new ad.d(i10, iKeyAt, 8192));
                    }
                    ac.this.f5725h.put(iValueAt, adVarValueAt);
                }
            }
            if (ac.this.f5719b != 2) {
                ac.this.f5725h.remove(this.f5744e);
                ac acVar2 = ac.this;
                acVar2.f5731n = acVar2.f5719b == 1 ? 0 : ac.this.f5731n - 1;
                if (ac.this.f5731n != 0) {
                    return;
                } else {
                    ac.this.f5730m.a();
                }
            } else {
                if (ac.this.f5732o) {
                    return;
                }
                ac.this.f5730m.a();
                ac.this.f5731n = 0;
            }
            ac.this.f5732o = true;
        }
    }

    public ac() {
        this(0);
    }

    public ac(int i10) {
        this(1, i10, 112800);
    }

    public ac(int i10, int i11, int i12) {
        this(i10, new ag(0L), new g(i11), i12);
    }

    public ac(int i10, ag agVar, ad.c cVar, int i11) {
        this.f5724g = (ad.c) com.applovin.exoplayer2.l.a.b(cVar);
        this.f5720c = i11;
        this.f5719b = i10;
        if (i10 == 1 || i10 == 2) {
            this.f5721d = Collections.singletonList(agVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f5721d = arrayList;
            arrayList.add(agVar);
        }
        this.f5722e = new com.applovin.exoplayer2.l.y(new byte[9400], 0);
        this.f5726i = new SparseBooleanArray();
        this.f5727j = new SparseBooleanArray();
        this.f5725h = new SparseArray<>();
        this.f5723f = new SparseIntArray();
        this.f5728k = new ab(i11);
        this.f5730m = com.applovin.exoplayer2.e.j.f6063a;
        this.f5737t = -1;
        b();
    }

    private int a() throws com.applovin.exoplayer2.ai {
        int iC = this.f5722e.c();
        int iB = this.f5722e.b();
        int iA = ae.a(this.f5722e.d(), iC, iB);
        this.f5722e.d(iA);
        int i10 = iA + 188;
        if (i10 > iB) {
            int i11 = (iA - iC) + this.f5736s;
            this.f5736s = i11;
            if (this.f5719b == 2 && i11 > 376) {
                throw com.applovin.exoplayer2.ai.b("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f5736s = 0;
        }
        return i10;
    }

    private void a(long j10) {
        com.applovin.exoplayer2.e.j jVar;
        com.applovin.exoplayer2.e.v bVar;
        if (this.f5733p) {
            return;
        }
        this.f5733p = true;
        if (this.f5728k.b() != -9223372036854775807L) {
            aa aaVar = new aa(this.f5728k.c(), this.f5728k.b(), j10, this.f5737t, this.f5720c);
            this.f5729l = aaVar;
            jVar = this.f5730m;
            bVar = aaVar.a();
        } else {
            jVar = this.f5730m;
            bVar = new com.applovin.exoplayer2.e.v.b(this.f5728k.b());
        }
        jVar.a(bVar);
    }

    private boolean a(int i10) {
        return this.f5719b == 2 || this.f5732o || !this.f5727j.get(i10, false);
    }

    public static /* synthetic */ int b(ac acVar) {
        int i10 = acVar.f5731n;
        acVar.f5731n = i10 + 1;
        return i10;
    }

    private void b() {
        this.f5726i.clear();
        this.f5725h.clear();
        SparseArray<ad> sparseArrayA = this.f5724g.a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5725h.put(sparseArrayA.keyAt(i10), sparseArrayA.valueAt(i10));
        }
        this.f5725h.put(0, new y(new a()));
        this.f5735r = null;
    }

    private boolean b(com.applovin.exoplayer2.e.i iVar) throws IOException {
        byte[] bArrD = this.f5722e.d();
        if (9400 - this.f5722e.c() < 188) {
            int iA = this.f5722e.a();
            if (iA > 0) {
                System.arraycopy(bArrD, this.f5722e.c(), bArrD, 0, iA);
            }
            this.f5722e.a(bArrD, iA);
        }
        while (this.f5722e.a() < 188) {
            int iB = this.f5722e.b();
            int iA2 = iVar.a(bArrD, iB, 9400 - iB);
            if (iA2 == -1) {
                return false;
            }
            this.f5722e.c(iB + iA2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.exoplayer2.e.h[] d() {
        return new com.applovin.exoplayer2.e.h[]{new ac()};
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ef  */
    @Override // com.applovin.exoplayer2.e.h
    public int a(com.applovin.exoplayer2.e.i iVar, com.applovin.exoplayer2.e.u uVar) throws IOException {
        int i10;
        long jD = iVar.d();
        if (this.f5732o) {
            if (((jD == -1 || this.f5719b == 2) ? false : true) && !this.f5728k.a()) {
                return this.f5728k.a(iVar, uVar, this.f5737t);
            }
            a(jD);
            if (this.f5734q) {
                this.f5734q = false;
                a(0L, 0L);
                if (iVar.c() != 0) {
                    uVar.f6134a = 0L;
                    return 1;
                }
            }
            aa aaVar = this.f5729l;
            if (aaVar != null && aaVar.b()) {
                return this.f5729l.a(iVar, uVar);
            }
        }
        if (!b(iVar)) {
            return -1;
        }
        int iA = a();
        int iB = this.f5722e.b();
        if (iA > iB) {
            return 0;
        }
        int iQ = this.f5722e.q();
        if ((8388608 & iQ) == 0) {
            int i11 = ((4194304 & iQ) != 0 ? 1 : 0) | 0;
            int i12 = (2096896 & iQ) >> 8;
            boolean z10 = (iQ & 32) != 0;
            ad adVar = (iQ & 16) != 0 ? this.f5725h.get(i12) : null;
            if (adVar != null) {
                if (this.f5719b != 2) {
                    int i13 = iQ & 15;
                    int i14 = this.f5723f.get(i12, i13 - 1);
                    this.f5723f.put(i12, i13);
                    if (i14 != i13) {
                        if (i13 != ((i14 + 1) & 15)) {
                            adVar.a();
                        }
                        if (z10) {
                            int iH = this.f5722e.h();
                            if ((this.f5722e.h() & 64) != 0) {
                                i10 = 2;
                            } else {
                                i10 = 0;
                            }
                            i11 |= i10;
                            this.f5722e.e(iH - 1);
                        }
                        boolean z11 = this.f5732o;
                        if (a(i12)) {
                            this.f5722e.c(iA);
                            adVar.a(this.f5722e, i11);
                            this.f5722e.c(iB);
                        }
                        if (this.f5719b != 2 && !z11 && this.f5732o && jD != -1) {
                            this.f5734q = true;
                        }
                    }
                } else {
                    if (z10) {
                        int iH2 = this.f5722e.h();
                        if ((this.f5722e.h() & 64) != 0) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        i11 |= i10;
                        this.f5722e.e(iH2 - 1);
                    }
                    boolean z12 = this.f5732o;
                    if (a(i12)) {
                        this.f5722e.c(iA);
                        adVar.a(this.f5722e, i11);
                        this.f5722e.c(iB);
                    }
                    if (this.f5719b != 2) {
                        this.f5734q = true;
                    }
                }
            }
        }
        this.f5722e.d(iA);
        return 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        aa aaVar;
        com.applovin.exoplayer2.l.a.b(this.f5719b != 2);
        int size = this.f5721d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ag agVar = this.f5721d.get(i10);
            boolean z10 = agVar.c() == -9223372036854775807L;
            if (!z10) {
                long jA = agVar.a();
                z10 = (jA == -9223372036854775807L || jA == 0 || jA == j11) ? false : true;
            }
            if (z10) {
                agVar.a(j11);
            }
        }
        if (j11 != 0 && (aaVar = this.f5729l) != null) {
            aaVar.a(j11);
        }
        this.f5722e.a(0);
        this.f5723f.clear();
        for (int i11 = 0; i11 < this.f5725h.size(); i11++) {
            this.f5725h.valueAt(i11).a();
        }
        this.f5736s = 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(com.applovin.exoplayer2.e.j jVar) {
        this.f5730m = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        boolean z10;
        byte[] bArrD = this.f5722e.d();
        iVar.d(bArrD, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (bArrD[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                iVar.b(i10);
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
