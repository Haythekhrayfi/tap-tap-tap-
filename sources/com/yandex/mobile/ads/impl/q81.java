package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q81 implements ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<a71> f24346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mp0 f24347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseIntArray f24348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r81.c f24349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SparseArray<r81> f24350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f24351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f24352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p81 f24353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private o81 f24354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private wt f24355l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f24356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f24357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f24358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f24359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r81 f24360q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f24361r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f24362s;

    public class a implements n01 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final lp0 f24363a = new lp0(new byte[4]);

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.n01
        public final void a(a71 a71Var, wt wtVar, r81.d dVar) {
        }

        @Override // com.yandex.mobile.ads.impl.n01
        public final void a(mp0 mp0Var) {
            if (mp0Var.t() == 0 && (mp0Var.t() & 128) != 0) {
                mp0Var.f(6);
                int iA = mp0Var.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    lp0 lp0Var = this.f24363a;
                    mp0Var.a(lp0Var.f22755a, 0, 4);
                    lp0Var.c(0);
                    int iB = this.f24363a.b(16);
                    this.f24363a.d(3);
                    if (iB == 0) {
                        this.f24363a.d(13);
                    } else {
                        int iB2 = this.f24363a.b(13);
                        if (q81.this.f24350g.get(iB2) == null) {
                            q81.this.f24350g.put(iB2, new o01(q81.this.new b(iB2)));
                            q81.e(q81.this);
                        }
                    }
                }
                if (q81.this.f24344a != 2) {
                    q81.this.f24350g.remove(0);
                }
            }
        }
    }

    public class b implements n01 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final lp0 f24365a = new lp0(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<r81> f24366b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f24367c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f24368d;

        public b(int i10) {
            this.f24368d = i10;
        }

        @Override // com.yandex.mobile.ads.impl.n01
        public final void a(a71 a71Var, wt wtVar, r81.d dVar) {
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0170  */
        /* JADX WARN: Code duplicated, block: B:52:0x0179  */
        /* JADX WARN: Code duplicated, block: B:57:0x0186  */
        /* JADX WARN: Code duplicated, block: B:99:0x0258  */
        @Override // com.yandex.mobile.ads.impl.n01
        public final void a(mp0 mp0Var) {
            a71 a71Var;
            int i10;
            int i11;
            r81 r81VarA;
            int i12;
            if (mp0Var.t() != 2) {
                return;
            }
            int i13 = 0;
            if (q81.this.f24344a == 1 || q81.this.f24344a == 2 || q81.this.f24356m == 1) {
                a71Var = (a71) q81.this.f24346c.get(0);
            } else {
                a71Var = new a71(((a71) q81.this.f24346c.get(0)).a());
                q81.this.f24346c.add(a71Var);
            }
            if ((mp0Var.t() & 128) == 0) {
                return;
            }
            mp0Var.f(1);
            int iZ = mp0Var.z();
            int i14 = 3;
            mp0Var.f(3);
            lp0 lp0Var = this.f24365a;
            mp0Var.a(lp0Var.f22755a, 0, 2);
            lp0Var.c(0);
            this.f24365a.d(3);
            int i15 = 13;
            q81.this.f24362s = this.f24365a.b(13);
            lp0 lp0Var2 = this.f24365a;
            mp0Var.a(lp0Var2.f22755a, 0, 2);
            lp0Var2.c(0);
            int i16 = 4;
            this.f24365a.d(4);
            int i17 = 12;
            mp0Var.f(this.f24365a.b(12));
            int i18 = 21;
            if (q81.this.f24344a == 2 && q81.this.f24360q == null) {
                r81.b bVar = new r81.b(21, null, null, da1.f19808f);
                q81 q81Var = q81.this;
                q81Var.f24360q = q81Var.f24349f.a(21, bVar);
                if (q81.this.f24360q != null) {
                    q81.this.f24360q.a(a71Var, q81.this.f24355l, new r81.d(iZ, 21, 8192));
                }
            }
            this.f24366b.clear();
            this.f24367c.clear();
            int iA = mp0Var.a();
            while (iA > 0) {
                lp0 lp0Var3 = this.f24365a;
                int i19 = 5;
                mp0Var.a(lp0Var3.f22755a, i13, 5);
                lp0Var3.c(i13);
                int iB = this.f24365a.b(8);
                this.f24365a.d(i14);
                int iB2 = this.f24365a.b(i15);
                this.f24365a.d(i16);
                int iB3 = this.f24365a.b(i17);
                int iD = mp0Var.d();
                int i20 = iD + iB3;
                int i21 = -1;
                String strTrim = null;
                ArrayList arrayList = null;
                while (true) {
                    if (mp0Var.d() >= i20) {
                        i10 = i16;
                        break;
                    }
                    int iT = mp0Var.t();
                    int iD2 = mp0Var.d() + mp0Var.t();
                    if (iD2 > i20) {
                        i10 = 4;
                        break;
                    }
                    if (iT == i19) {
                        long jV = mp0Var.v();
                        if (jV == 1094921523) {
                            i21 = 129;
                        } else if (jV == 1161904947) {
                            i21 = 135;
                        } else if (jV == 1094921524) {
                            i21 = 172;
                        } else if (jV == 1212503619) {
                            i21 = 36;
                        }
                        i12 = 4;
                    } else {
                        if (iT == 106) {
                            i21 = 129;
                        } else if (iT == 122) {
                            i21 = 135;
                        } else if (iT == 127) {
                            if (mp0Var.t() == i18) {
                                i21 = 172;
                            }
                        } else if (iT == 123) {
                            i21 = 138;
                        } else if (iT == 10) {
                            strTrim = mp0Var.a(3, qh.f24496c).trim();
                        } else {
                            int i22 = 3;
                            if (iT == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (mp0Var.d() < iD2) {
                                    String strTrim2 = mp0Var.a(i22, qh.f24496c).trim();
                                    mp0Var.t();
                                    byte[] bArr = new byte[4];
                                    mp0Var.a(bArr, 0, 4);
                                    arrayList2.add(new r81.a(strTrim2, bArr));
                                    i22 = 3;
                                }
                                i12 = 4;
                                arrayList = arrayList2;
                                i21 = 89;
                            } else {
                                i12 = 4;
                                if (iT == 111) {
                                    i21 = 257;
                                }
                            }
                        }
                        i12 = 4;
                    }
                    mp0Var.f(iD2 - mp0Var.d());
                    i16 = i12;
                    i19 = 5;
                    i18 = 21;
                }
                mp0Var.e(i20);
                r81.b bVar2 = new r81.b(i21, strTrim, arrayList, Arrays.copyOfRange(mp0Var.c(), iD, i20));
                if (iB == 6 || iB == 5) {
                    iB = i21;
                }
                iA -= iB3 + 5;
                int i23 = q81.this.f24344a == 2 ? iB : iB2;
                if (q81.this.f24351h.get(i23)) {
                    i11 = 21;
                } else {
                    if (q81.this.f24344a == 2) {
                        i11 = 21;
                        if (iB == 21) {
                            r81VarA = q81.this.f24360q;
                        }
                        if (q81.this.f24344a == 2 || iB2 < this.f24367c.get(i23, 8192)) {
                            this.f24367c.put(i23, iB2);
                            this.f24366b.put(i23, r81VarA);
                        }
                    } else {
                        i11 = 21;
                    }
                    r81VarA = q81.this.f24349f.a(iB, bVar2);
                    if (q81.this.f24344a == 2) {
                        this.f24367c.put(i23, iB2);
                        this.f24366b.put(i23, r81VarA);
                    } else {
                        this.f24367c.put(i23, iB2);
                        this.f24366b.put(i23, r81VarA);
                    }
                }
                i16 = i10;
                i18 = i11;
                i13 = 0;
                i14 = 3;
                i15 = 13;
                i17 = 12;
            }
            int size = this.f24367c.size();
            for (int i24 = 0; i24 < size; i24++) {
                int iKeyAt = this.f24367c.keyAt(i24);
                int iValueAt = this.f24367c.valueAt(i24);
                q81.this.f24351h.put(iKeyAt, true);
                q81.this.f24352i.put(iValueAt, true);
                r81 r81VarValueAt = this.f24366b.valueAt(i24);
                if (r81VarValueAt != null) {
                    if (r81VarValueAt != q81.this.f24360q) {
                        r81VarValueAt.a(a71Var, q81.this.f24355l, new r81.d(iZ, iKeyAt, 8192));
                    }
                    q81.this.f24350g.put(iValueAt, r81VarValueAt);
                }
            }
            if (q81.this.f24344a != 2) {
                q81.this.f24350g.remove(this.f24368d);
                q81 q81Var2 = q81.this;
                q81Var2.f24356m = q81Var2.f24344a == 1 ? 0 : q81.this.f24356m - 1;
                if (q81.this.f24356m != 0) {
                    return;
                } else {
                    q81.this.f24355l.a();
                }
            } else {
                if (q81.this.f24357n) {
                    return;
                }
                q81.this.f24355l.a();
                q81.this.f24356m = 0;
            }
            q81.this.f24357n = true;
        }
    }

    static {
        dp1 dp1Var = dp1.A;
    }

    public q81(int i10) {
        this(new a71(0L), new qo());
    }

    public q81(a71 a71Var, qo qoVar) {
        this.f24349f = (r81.c) pa.a(qoVar);
        this.f24345b = 112800;
        this.f24344a = 1;
        this.f24346c = Collections.singletonList(a71Var);
        this.f24347d = new mp0(0, new byte[9400]);
        this.f24351h = new SparseBooleanArray();
        this.f24352i = new SparseBooleanArray();
        this.f24350g = new SparseArray<>();
        this.f24348e = new SparseIntArray();
        this.f24353j = new p81();
        this.f24355l = wt.f26367a;
        this.f24362s = -1;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ut[] a() {
        return new ut[]{new q81(0)};
    }

    private void b() {
        this.f24351h.clear();
        this.f24350g.clear();
        SparseArray<r81> sparseArrayA = this.f24349f.a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f24350g.put(sparseArrayA.keyAt(i10), sparseArrayA.valueAt(i10));
        }
        this.f24350g.put(0, new o01(new a()));
        this.f24360q = null;
    }

    public static /* synthetic */ void e(q81 q81Var) {
        q81Var.f24356m++;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [int] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        xn xnVar;
        ?? r15;
        ?? r14;
        ?? r10;
        ?? r11;
        ?? r12;
        long j10;
        wt wtVar;
        p01 bVar;
        xn xnVar2 = (xn) vtVar;
        long jA = xnVar2.a();
        boolean z10 = true;
        boolean z11 = false;
        if (this.f24357n) {
            if (((jA == -1 || this.f24344a == 2) ? false : true) && !this.f24353j.c()) {
                return this.f24353j.a(xnVar2, cs0Var, this.f24362s);
            }
            if (this.f24358o) {
                xnVar2 = xnVar2;
                j10 = 0;
                z11 = false;
                z10 = true;
            } else {
                this.f24358o = true;
                if (this.f24353j.a() != -9223372036854775807L) {
                    j10 = 0;
                    o81 o81Var = new o81(this.f24353j.b(), this.f24353j.a(), jA, this.f24362s, this.f24345b);
                    this.f24354k = o81Var;
                    wtVar = this.f24355l;
                    bVar = o81Var.a();
                } else {
                    j10 = 0;
                    wtVar = this.f24355l;
                    bVar = new p01.b(this.f24353j.a(), 0L);
                }
                wtVar.a(bVar);
            }
            if (this.f24359p) {
                this.f24359p = z11;
                a(j10, j10);
                if (xnVar2.getPosition() != j10) {
                    cs0Var.f19623a = j10;
                    return z10 ? 1 : 0;
                }
            }
            o81 o81Var2 = this.f24354k;
            if (o81Var2 != null && o81Var2.b()) {
                return this.f24354k.a(xnVar2, cs0Var);
            }
            xnVar = xnVar2;
            r14 = z10;
            r15 = z11;
        } else {
            xnVar = xnVar2;
            r15 = 0;
            r14 = 1;
        }
        byte[] bArrC = this.f24347d.c();
        if (9400 - this.f24347d.d() < 188) {
            int iA = this.f24347d.a();
            if (iA > 0) {
                System.arraycopy(bArrC, this.f24347d.d(), bArrC, r15, iA);
            }
            this.f24347d.a(iA, bArrC);
        }
        while (true) {
            if (this.f24347d.a() >= 188) {
                r10 = r14;
                break;
            }
            int iE = this.f24347d.e();
            int i10 = xnVar.read(bArrC, iE, 9400 - iE);
            if (i10 == -1) {
                r10 = r15;
                break;
            }
            this.f24347d.d(iE + i10);
        }
        if (r10 == 0) {
            return -1;
        }
        int iD = this.f24347d.d();
        int iE2 = this.f24347d.e();
        byte[] bArrC2 = this.f24347d.c();
        int i11 = iD;
        while (i11 < iE2 && bArrC2[i11] != 71) {
            i11++;
        }
        this.f24347d.e(i11);
        int i12 = i11 + 188;
        if (i12 > iE2) {
            int i13 = (i11 - iD) + this.f24361r;
            this.f24361r = i13;
            if (this.f24344a == 2 && i13 > 376) {
                throw qp0.a("Cannot find sync byte. Most likely not a Transport Stream.", (Exception) null);
            }
        } else {
            this.f24361r = r15;
        }
        int iE3 = this.f24347d.e();
        if (i12 > iE3) {
            return r15;
        }
        int iH = this.f24347d.h();
        if ((8388608 & iH) == 0) {
            int i14 = ((4194304 & iH) != 0 ? r14 : r15) | 0;
            int i15 = (2096896 & iH) >> 8;
            ?? r13 = (iH & 32) != 0 ? r14 : r15;
            r81 r81Var = ((iH & 16) != 0 ? r14 : r15) != 0 ? this.f24350g.get(i15) : null;
            if (r81Var != null) {
                if (this.f24344a != 2) {
                    int i16 = iH & 15;
                    int i17 = this.f24348e.get(i15, i16 - 1);
                    this.f24348e.put(i15, i16);
                    if (i17 != i16) {
                        if (i16 != ((i17 + r14) & 15)) {
                            r81Var.a();
                        }
                        if (r13 != 0) {
                            int iT = this.f24347d.t();
                            if ((this.f24347d.t() & 64) != 0) {
                                r12 = 2;
                            } else {
                                r12 = r15;
                            }
                            i14 |= r12;
                            this.f24347d.f(iT - r14);
                        }
                        boolean z12 = this.f24357n;
                        if (this.f24344a == 2 && !z12 && this.f24352i.get(i15, r15)) {
                            r11 = r15;
                        } else {
                            r11 = r14;
                        }
                        if (r11 != 0) {
                            this.f24347d.d(i12);
                            r81Var.a(i14, this.f24347d);
                            this.f24347d.d(iE3);
                        }
                        if (this.f24344a != 2 && !z12 && this.f24357n && jA != -1) {
                            this.f24359p = r14;
                        }
                    }
                } else {
                    if (r13 != 0) {
                        int iT2 = this.f24347d.t();
                        if ((this.f24347d.t() & 64) != 0) {
                            r12 = 2;
                        } else {
                            r12 = r15;
                        }
                        i14 |= r12;
                        this.f24347d.f(iT2 - r14);
                    }
                    boolean z13 = this.f24357n;
                    if (this.f24344a == 2) {
                        r11 = r14;
                    } else {
                        r11 = r14;
                    }
                    if (r11 != 0) {
                        this.f24347d.d(i12);
                        r81Var.a(i14, this.f24347d);
                        this.f24347d.d(iE3);
                    }
                    if (this.f24344a != 2) {
                        this.f24359p = r14;
                    }
                }
            }
        }
        this.f24347d.e(i12);
        return r15;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        o81 o81Var;
        pa.b(this.f24344a != 2);
        int size = this.f24346c.size();
        for (int i10 = 0; i10 < size; i10++) {
            a71 a71Var = this.f24346c.get(i10);
            boolean z10 = a71Var.c() == -9223372036854775807L;
            if (!z10) {
                long jA = a71Var.a();
                z10 = (jA == -9223372036854775807L || jA == 0 || jA == j11) ? false : true;
            }
            if (z10) {
                a71Var.c(j11);
            }
        }
        if (j11 != 0 && (o81Var = this.f24354k) != null) {
            o81Var.a(j11);
        }
        this.f24347d.c(0);
        this.f24348e.clear();
        for (int i11 = 0; i11 < this.f24350g.size(); i11++) {
            this.f24350g.valueAt(i11).a();
        }
        this.f24361r = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f24355l = wtVar;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        boolean z10;
        byte[] bArrC = this.f24347d.c();
        xn xnVar = (xn) vtVar;
        xnVar.b(bArrC, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (bArrC[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                xnVar.a(i10);
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
