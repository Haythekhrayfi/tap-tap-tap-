package com.yandex.mobile.ads.impl;

import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.metadata.emsg.EventMessage;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class cw implements ut {
    private static final byte[] F;
    private static final yv G;
    private boolean A;
    private wt B;
    private j71[] C;
    private j71[] D;
    private boolean E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<yv> f19638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<b> f19639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mp0 f19640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mp0 f19641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mp0 f19642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f19643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mp0 f19644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final fs f19645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final mp0 f19646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayDeque<rb.a> f19647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayDeque<a> f19648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final j71 f19649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f19650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f19651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f19652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f19653p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private mp0 f19654q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f19655r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f19657t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f19658u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f19659v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b f19660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f19661x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f19662y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f19663z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19666c;

        public a(int i10, long j10, boolean z10) {
            this.f19664a = j10;
            this.f19665b = z10;
            this.f19666c = i10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j71 f19667a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k71 f19670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public mo f19671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19674h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19675i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f19678l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g71 f19668b = new g71();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final mp0 f19669c = new mp0();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final mp0 f19676j = new mp0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final mp0 f19677k = new mp0();

        public b(j71 j71Var, k71 k71Var, mo moVar) {
            this.f19667a = j71Var;
            this.f19670d = k71Var;
            this.f19671e = moVar;
            a(k71Var, moVar);
        }

        public final int a() {
            int i10;
            if (this.f19678l) {
                i10 = this.f19668b.f20967j[this.f19672f] ? 1 : 0;
            } else {
                i10 = this.f19670d.f22288g[this.f19672f];
            }
            return e() != null ? i10 | 1073741824 : i10;
        }

        public final int a(int i10, int i11) {
            mp0 mp0Var;
            f71 f71VarE = e();
            if (f71VarE == null) {
                return 0;
            }
            int length = f71VarE.f20575d;
            if (length != 0) {
                mp0Var = this.f19668b.f20971n;
            } else {
                byte[] bArr = f71VarE.f20576e;
                int i12 = da1.f19803a;
                this.f19677k.a(bArr.length, bArr);
                mp0 mp0Var2 = this.f19677k;
                length = bArr.length;
                mp0Var = mp0Var2;
            }
            g71 g71Var = this.f19668b;
            boolean z10 = g71Var.f20968k && g71Var.f20969l[this.f19672f];
            boolean z11 = z10 || i11 != 0;
            this.f19676j.c()[0] = (byte) ((z11 ? 128 : 0) | length);
            this.f19676j.e(0);
            this.f19667a.b(1, this.f19676j);
            this.f19667a.b(length, mp0Var);
            if (!z11) {
                return length + 1;
            }
            if (!z10) {
                this.f19669c.c(8);
                byte[] bArrC = this.f19669c.c();
                bArrC[0] = 0;
                bArrC[1] = 1;
                bArrC[2] = (byte) ((i11 >> 8) & 255);
                bArrC[3] = (byte) (i11 & 255);
                bArrC[4] = (byte) ((i10 >> 24) & 255);
                bArrC[5] = (byte) ((i10 >> 16) & 255);
                bArrC[6] = (byte) ((i10 >> 8) & 255);
                bArrC[7] = (byte) (i10 & 255);
                this.f19667a.b(8, this.f19669c);
                return length + 1 + 8;
            }
            mp0 mp0Var3 = this.f19668b.f20971n;
            int iZ = mp0Var3.z();
            mp0Var3.f(-2);
            int i13 = (iZ * 6) + 2;
            if (i11 != 0) {
                this.f19669c.c(i13);
                byte[] bArrC2 = this.f19669c.c();
                mp0Var3.a(bArrC2, 0, i13);
                int i14 = (((bArrC2[2] & 255) << 8) | (bArrC2[3] & 255)) + i11;
                bArrC2[2] = (byte) ((i14 >> 8) & 255);
                bArrC2[3] = (byte) (i14 & 255);
                mp0Var3 = this.f19669c;
            }
            this.f19667a.b(i13, mp0Var3);
            return length + 1 + i13;
        }

        public final void a(k71 k71Var, mo moVar) {
            this.f19670d = k71Var;
            this.f19671e = moVar;
            this.f19667a.a(k71Var.f22282a.f20105f);
            g();
        }

        public final long b() {
            return !this.f19678l ? this.f19670d.f22284c[this.f19672f] : this.f19668b.f20963f[this.f19674h];
        }

        public final long c() {
            if (!this.f19678l) {
                return this.f19670d.f22287f[this.f19672f];
            }
            g71 g71Var = this.f19668b;
            return g71Var.f20966i[this.f19672f];
        }

        public final int d() {
            return !this.f19678l ? this.f19670d.f22285d[this.f19672f] : this.f19668b.f20965h[this.f19672f];
        }

        public final f71 e() {
            if (!this.f19678l) {
                return null;
            }
            g71 g71Var = this.f19668b;
            mo moVar = g71Var.f20958a;
            int i10 = da1.f19803a;
            int i11 = moVar.f23115a;
            f71 f71VarA = g71Var.f20970m;
            if (f71VarA == null) {
                f71VarA = this.f19670d.f22282a.a(i11);
            }
            if (f71VarA == null || !f71VarA.f20572a) {
                return null;
            }
            return f71VarA;
        }

        public final boolean f() {
            this.f19672f++;
            if (!this.f19678l) {
                return false;
            }
            int i10 = this.f19673g + 1;
            this.f19673g = i10;
            int[] iArr = this.f19668b.f20964g;
            int i11 = this.f19674h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f19674h = i11 + 1;
            this.f19673g = 0;
            return false;
        }

        public final void g() {
            g71 g71Var = this.f19668b;
            g71Var.f20961d = 0;
            g71Var.f20973p = 0L;
            g71Var.f20974q = false;
            g71Var.f20968k = false;
            g71Var.f20972o = false;
            g71Var.f20970m = null;
            this.f19672f = 0;
            this.f19674h = 0;
            this.f19673g = 0;
            this.f19675i = 0;
            this.f19678l = false;
        }
    }

    static {
        dp1 dp1Var = dp1.f19951j;
        F = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        G = new yv.a().f("application/x-emsg").a();
    }

    public cw(int i10) {
        this(Collections.emptyList());
    }

    public cw(List list) {
        this(list, 0);
    }

    public cw(List list, int i10) {
        this.f19638a = Collections.unmodifiableList(list);
        this.f19649l = null;
        this.f19645h = new fs();
        this.f19646i = new mp0(16);
        this.f19640c = new mp0(oh0.f23795a);
        this.f19641d = new mp0(5);
        this.f19642e = new mp0();
        byte[] bArr = new byte[16];
        this.f19643f = bArr;
        this.f19644g = new mp0(bArr);
        this.f19647j = new ArrayDeque<>();
        this.f19648k = new ArrayDeque<>();
        this.f19639b = new SparseArray<>();
        this.f19658u = -9223372036854775807L;
        this.f19657t = -9223372036854775807L;
        this.f19659v = -9223372036854775807L;
        this.B = wt.f26367a;
        this.C = new j71[0];
        this.D = new j71[0];
    }

    private static DrmInitData a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            rb.b bVar = (rb.b) arrayList.get(i10);
            if (bVar.f24653a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArrC = bVar.f24657b.c();
                UUID uuidC = au0.c(bArrC);
                if (uuidC == null) {
                    p90.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuidC, null, "video/mp4", bArrC));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:245:0x0530  */
    private void a(long j10) throws qp0 {
        cw cwVar;
        byte[] bArr;
        rb.a aVar;
        SparseArray<b> sparseArray;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        int i13;
        boolean z10;
        g71 g71Var;
        b bVar;
        cw cwVar2 = this;
        cw cwVar3 = cwVar2;
        while (!cwVar3.f19647j.isEmpty() && cwVar3.f19647j.peek().f24654b == j10) {
            rb.a aVarPop = cwVar3.f19647j.pop();
            int i14 = aVarPop.f24653a;
            if (i14 == 1836019574) {
                cwVar3.a(aVarPop);
            } else {
                if (i14 == 1836019558) {
                    SparseArray<b> sparseArray2 = cwVar3.f19639b;
                    byte[] bArr3 = cwVar3.f19643f;
                    int size = aVarPop.f24656d.size();
                    int i15 = 0;
                    while (i15 < size) {
                        rb.a aVar2 = (rb.a) aVarPop.f24656d.get(i15);
                        if (aVar2.f24653a == 1953653094) {
                            rb.b bVarD = aVar2.d(1952868452);
                            Objects.requireNonNull(bVarD);
                            mp0 mp0Var = bVarD.f24657b;
                            mp0Var.e(8);
                            int iH = mp0Var.h() & 16777215;
                            b bVar2 = sparseArray2.get(mp0Var.h());
                            if (bVar2 == null) {
                                bVar2 = null;
                            } else {
                                if ((iH & 1) != 0) {
                                    long jY = mp0Var.y();
                                    g71 g71Var2 = bVar2.f19668b;
                                    g71Var2.f20959b = jY;
                                    g71Var2.f20960c = jY;
                                }
                                mo moVar = bVar2.f19671e;
                                bVar2.f19668b.f20958a = new mo((iH & 2) != 0 ? mp0Var.h() - 1 : moVar.f23115a, (iH & 8) != 0 ? mp0Var.h() : moVar.f23116b, (iH & 16) != 0 ? mp0Var.h() : moVar.f23117c, (iH & 32) != 0 ? mp0Var.h() : moVar.f23118d);
                            }
                            if (bVar2 != null) {
                                g71 g71Var3 = bVar2.f19668b;
                                long j11 = g71Var3.f20973p;
                                boolean z11 = g71Var3.f20974q;
                                bVar2.g();
                                bVar2.f19678l = true;
                                rb.b bVarD2 = aVar2.d(1952867444);
                                if (bVarD2 != null) {
                                    mp0 mp0Var2 = bVarD2.f24657b;
                                    mp0Var2.e(8);
                                    g71Var3.f20973p = rb.b(mp0Var2.h()) == 1 ? mp0Var2.y() : mp0Var2.v();
                                    g71Var3.f20974q = true;
                                } else {
                                    g71Var3.f20973p = j11;
                                    g71Var3.f20974q = z11;
                                }
                                ArrayList arrayList = aVar2.f24655c;
                                int size2 = arrayList.size();
                                int i16 = 0;
                                int i17 = 0;
                                int i18 = 0;
                                while (true) {
                                    i12 = 1953658222;
                                    if (i18 >= size2) {
                                        break;
                                    }
                                    rb.b bVar3 = (rb.b) arrayList.get(i18);
                                    SparseArray<b> sparseArray3 = sparseArray2;
                                    if (bVar3.f24653a == 1953658222) {
                                        mp0 mp0Var3 = bVar3.f24657b;
                                        mp0Var3.e(12);
                                        int iX = mp0Var3.x();
                                        if (iX > 0) {
                                            i16 += iX;
                                            i17++;
                                        }
                                    }
                                    i18++;
                                    sparseArray2 = sparseArray3;
                                }
                                sparseArray = sparseArray2;
                                bVar2.f19674h = 0;
                                bVar2.f19673g = 0;
                                bVar2.f19672f = 0;
                                g71 g71Var4 = bVar2.f19668b;
                                g71Var4.f20961d = i17;
                                g71Var4.f20962e = i16;
                                if (g71Var4.f20964g.length < i17) {
                                    g71Var4.f20963f = new long[i17];
                                    g71Var4.f20964g = new int[i17];
                                }
                                if (g71Var4.f20965h.length < i16) {
                                    int i19 = (i16 * 125) / 100;
                                    g71Var4.f20965h = new int[i19];
                                    g71Var4.f20966i = new long[i19];
                                    g71Var4.f20967j = new boolean[i19];
                                    g71Var4.f20969l = new boolean[i19];
                                }
                                int i20 = 0;
                                int i21 = 0;
                                int i22 = 0;
                                while (true) {
                                    long j12 = 0;
                                    if (i20 >= size2) {
                                        byte[] bArr4 = bArr3;
                                        aVar = aVarPop;
                                        i10 = size;
                                        i11 = i15;
                                        g71 g71Var5 = g71Var3;
                                        e71 e71Var = bVar2.f19670d.f22282a;
                                        mo moVar2 = g71Var5.f20958a;
                                        Objects.requireNonNull(moVar2);
                                        f71 f71VarA = e71Var.a(moVar2.f23115a);
                                        rb.b bVarD3 = aVar2.d(1935763834);
                                        if (bVarD3 != null) {
                                            Objects.requireNonNull(f71VarA);
                                            mp0 mp0Var4 = bVarD3.f24657b;
                                            int i23 = f71VarA.f20575d;
                                            mp0Var4.e(8);
                                            if ((mp0Var4.h() & 16777215 & 1) == 1) {
                                                mp0Var4.f(8);
                                            }
                                            int iT = mp0Var4.t();
                                            int iX2 = mp0Var4.x();
                                            if (iX2 > g71Var5.f20962e) {
                                                StringBuilder sbA = androidx.appcompat.widget.r0.a("Saiz sample count ", iX2, " is greater than fragment sample count");
                                                sbA.append(g71Var5.f20962e);
                                                throw qp0.a(sbA.toString(), (Exception) null);
                                            }
                                            if (iT == 0) {
                                                boolean[] zArr = g71Var5.f20969l;
                                                i13 = 0;
                                                for (int i24 = 0; i24 < iX2; i24++) {
                                                    int iT2 = mp0Var4.t();
                                                    i13 += iT2;
                                                    zArr[i24] = iT2 > i23;
                                                }
                                                z10 = false;
                                            } else {
                                                i13 = (iT * iX2) + 0;
                                                Arrays.fill(g71Var5.f20969l, 0, iX2, iT > i23);
                                                z10 = false;
                                            }
                                            Arrays.fill(g71Var5.f20969l, iX2, g71Var5.f20962e, z10);
                                            if (i13 > 0) {
                                                g71Var5.f20971n.c(i13);
                                                g71Var5.f20968k = true;
                                                g71Var5.f20972o = true;
                                            }
                                        }
                                        rb.b bVarD4 = aVar2.d(1935763823);
                                        if (bVarD4 != null) {
                                            mp0 mp0Var5 = bVarD4.f24657b;
                                            mp0Var5.e(8);
                                            int iH2 = mp0Var5.h();
                                            if ((16777215 & iH2 & 1) == 1) {
                                                mp0Var5.f(8);
                                            }
                                            int iX3 = mp0Var5.x();
                                            if (iX3 != 1) {
                                                throw qp0.a("Unexpected saio entry count: " + iX3, (Exception) null);
                                            }
                                            g71Var5.f20960c += rb.b(iH2) == 0 ? mp0Var5.v() : mp0Var5.y();
                                        }
                                        byte[] bArr5 = null;
                                        rb.b bVarD5 = aVar2.d(1936027235);
                                        if (bVarD5 != null) {
                                            a(bVarD5.f24657b, 0, g71Var5);
                                        }
                                        String str = f71VarA != null ? f71VarA.f20573b : null;
                                        mp0 mp0Var6 = null;
                                        mp0 mp0Var7 = null;
                                        for (int i25 = 0; i25 < aVar2.f24655c.size(); i25++) {
                                            rb.b bVar4 = (rb.b) aVar2.f24655c.get(i25);
                                            mp0 mp0Var8 = bVar4.f24657b;
                                            int i26 = bVar4.f24653a;
                                            if (i26 == 1935828848) {
                                                mp0Var8.e(12);
                                                if (mp0Var8.h() == 1936025959) {
                                                    mp0Var6 = mp0Var8;
                                                }
                                            } else if (i26 == 1936158820) {
                                                mp0Var8.e(12);
                                                if (mp0Var8.h() == 1936025959) {
                                                    mp0Var7 = mp0Var8;
                                                }
                                            }
                                        }
                                        if (mp0Var6 != null && mp0Var7 != null) {
                                            mp0Var6.e(8);
                                            int iB = rb.b(mp0Var6.h());
                                            mp0Var6.f(4);
                                            if (iB == 1) {
                                                mp0Var6.f(4);
                                            }
                                            if (mp0Var6.h() != 1) {
                                                throw qp0.a("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            mp0Var7.e(8);
                                            int iB2 = rb.b(mp0Var7.h());
                                            mp0Var7.f(4);
                                            if (iB2 == 1) {
                                                if (mp0Var7.v() == 0) {
                                                    throw qp0.a("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iB2 >= 2) {
                                                mp0Var7.f(4);
                                            }
                                            if (mp0Var7.v() != 1) {
                                                throw qp0.a("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            mp0Var7.f(1);
                                            int iT3 = mp0Var7.t();
                                            int i27 = (iT3 & 240) >> 4;
                                            int i28 = iT3 & 15;
                                            boolean z12 = mp0Var7.t() == 1;
                                            if (z12) {
                                                int iT4 = mp0Var7.t();
                                                byte[] bArr6 = new byte[16];
                                                mp0Var7.a(bArr6, 0, 16);
                                                if (iT4 == 0) {
                                                    int iT5 = mp0Var7.t();
                                                    bArr5 = new byte[iT5];
                                                    mp0Var7.a(bArr5, 0, iT5);
                                                }
                                                g71Var5.f20968k = true;
                                                g71Var5.f20970m = new f71(z12, str, iT4, bArr6, i27, i28, bArr5);
                                            }
                                        }
                                        int size3 = aVar2.f24655c.size();
                                        int i29 = 0;
                                        while (i29 < size3) {
                                            rb.b bVar5 = (rb.b) aVar2.f24655c.get(i29);
                                            if (bVar5.f24653a == 1970628964) {
                                                mp0 mp0Var9 = bVar5.f24657b;
                                                mp0Var9.e(8);
                                                bArr2 = bArr4;
                                                mp0Var9.a(bArr2, 0, 16);
                                                if (Arrays.equals(bArr2, F)) {
                                                    a(mp0Var9, 16, g71Var5);
                                                }
                                            } else {
                                                bArr2 = bArr4;
                                            }
                                            i29++;
                                            bArr4 = bArr2;
                                        }
                                        bArr = bArr4;
                                        break;
                                    }
                                    rb.b bVar6 = (rb.b) arrayList.get(i20);
                                    if (bVar6.f24653a == i12) {
                                        int i30 = i21 + 1;
                                        mp0 mp0Var10 = bVar6.f24657b;
                                        mp0Var10.e(8);
                                        int iH3 = mp0Var10.h() & 16777215;
                                        e71 e71Var2 = bVar2.f19670d.f22282a;
                                        g71 g71Var6 = bVar2.f19668b;
                                        mo moVar3 = g71Var6.f20958a;
                                        int i31 = da1.f19803a;
                                        g71Var6.f20964g[i21] = mp0Var10.x();
                                        long[] jArr = g71Var6.f20963f;
                                        long j13 = g71Var6.f20959b;
                                        jArr[i21] = j13;
                                        if ((iH3 & 1) != 0) {
                                            jArr[i21] = j13 + ((long) mp0Var10.h());
                                        }
                                        boolean z13 = (iH3 & 4) != 0;
                                        int iH4 = moVar3.f23118d;
                                        if (z13) {
                                            iH4 = mp0Var10.h();
                                        }
                                        boolean z14 = (iH3 & 256) != 0;
                                        boolean z15 = (iH3 & 512) != 0;
                                        boolean z16 = (iH3 & 1024) != 0;
                                        boolean z17 = (iH3 & 2048) != 0;
                                        long[] jArr2 = e71Var2.f20107h;
                                        int i32 = iH4;
                                        if (jArr2 != null) {
                                            g71Var = g71Var3;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j12 = e71Var2.f20108i[0];
                                            }
                                        } else {
                                            g71Var = g71Var3;
                                        }
                                        int[] iArr = g71Var6.f20965h;
                                        long[] jArr3 = g71Var6.f20966i;
                                        boolean[] zArr2 = g71Var6.f20967j;
                                        int i33 = g71Var6.f20964g[i21] + i22;
                                        long j14 = e71Var2.f20102c;
                                        bVar = bVar2;
                                        long j15 = g71Var6.f20973p;
                                        int i34 = i22;
                                        while (i34 < i33) {
                                            int iH5 = z14 ? mp0Var10.h() : moVar3.f23116b;
                                            if (iH5 < 0) {
                                                throw qp0.a("Unexpected negative value: " + iH5, (Exception) null);
                                            }
                                            int iH6 = z15 ? mp0Var10.h() : moVar3.f23117c;
                                            if (iH6 < 0) {
                                                throw qp0.a("Unexpected negative value: " + iH6, (Exception) null);
                                            }
                                            int iH7 = z16 ? mp0Var10.h() : (i34 == 0 && z13) ? i32 : moVar3.f23118d;
                                            boolean z18 = z13;
                                            mp0 mp0Var11 = mp0Var10;
                                            boolean z19 = z17;
                                            long jA = da1.a((((long) (z17 ? mp0Var10.h() : 0)) + j15) - j12, 1000000L, j14);
                                            jArr3[i34] = jA;
                                            if (!g71Var6.f20974q) {
                                                jArr3[i34] = jA + bVar.f19670d.f22289h;
                                            }
                                            iArr[i34] = iH6;
                                            zArr2[i34] = ((iH7 >> 16) & 1) == 0;
                                            j15 += (long) iH5;
                                            i34++;
                                            g71Var6 = g71Var6;
                                            moVar3 = moVar3;
                                            z14 = z14;
                                            i33 = i33;
                                            z15 = z15;
                                            z13 = z18;
                                            mp0Var10 = mp0Var11;
                                            z17 = z19;
                                        }
                                        g71Var6.f20973p = j15;
                                        i21 = i30;
                                        i22 = i33;
                                    } else {
                                        aVarPop = aVarPop;
                                        i15 = i15;
                                        aVar2 = aVar2;
                                        g71Var = g71Var3;
                                        bVar = bVar2;
                                    }
                                    i20++;
                                    i12 = 1953658222;
                                    bVar2 = bVar;
                                    size = size;
                                    arrayList = arrayList;
                                    size2 = size2;
                                    bArr3 = bArr3;
                                    aVarPop = aVarPop;
                                    i15 = i15;
                                    aVar2 = aVar2;
                                    g71Var3 = g71Var;
                                }
                            } else {
                                bArr = bArr3;
                                aVar = aVarPop;
                                sparseArray = sparseArray2;
                                i10 = size;
                                i11 = i15;
                            }
                        } else {
                            bArr = bArr3;
                            aVar = aVarPop;
                            sparseArray = sparseArray2;
                            i10 = size;
                            i11 = i15;
                        }
                        i15 = i11 + 1;
                        bArr3 = bArr;
                        sparseArray2 = sparseArray;
                        size = i10;
                        aVarPop = aVar;
                    }
                    DrmInitData drmInitDataA = a(aVarPop.f24655c);
                    cwVar = this;
                    if (drmInitDataA != null) {
                        int size4 = cwVar.f19639b.size();
                        for (int i35 = 0; i35 < size4; i35++) {
                            b bVarValueAt = cwVar.f19639b.valueAt(i35);
                            e71 e71Var3 = bVarValueAt.f19670d.f22282a;
                            mo moVar4 = bVarValueAt.f19668b.f20958a;
                            int i36 = da1.f19803a;
                            f71 f71VarA2 = e71Var3.a(moVar4.f23115a);
                            bVarValueAt.f19667a.a(bVarValueAt.f19670d.f22282a.f20105f.a().a(drmInitDataA.a(f71VarA2 != null ? f71VarA2.f20573b : null)).a());
                        }
                    }
                    if (cwVar.f19657t != -9223372036854775807L) {
                        int size5 = cwVar.f19639b.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            b bVarValueAt2 = cwVar.f19639b.valueAt(i37);
                            long j16 = cwVar.f19657t;
                            int i38 = bVarValueAt2.f19672f;
                            while (true) {
                                g71 g71Var7 = bVarValueAt2.f19668b;
                                if (i38 >= g71Var7.f20962e || g71Var7.f20966i[i38] >= j16) {
                                    break;
                                }
                                if (g71Var7.f20967j[i38]) {
                                    bVarValueAt2.f19675i = i38;
                                }
                                i38++;
                            }
                        }
                        cwVar.f19657t = -9223372036854775807L;
                    }
                    cwVar3 = cwVar;
                } else {
                    cwVar = cwVar2;
                    if (!cwVar3.f19647j.isEmpty()) {
                        cwVar3.f19647j.peek().f24656d.add(aVarPop);
                    }
                }
                cwVar2 = cwVar;
            }
        }
        cwVar3.f19650m = 0;
        cwVar3.f19653p = 0;
    }

    private static void a(mp0 mp0Var, int i10, g71 g71Var) throws qp0 {
        mp0Var.e(i10 + 8);
        int iH = mp0Var.h() & 16777215;
        if ((iH & 1) != 0) {
            throw qp0.a("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iH & 2) != 0;
        int iX = mp0Var.x();
        if (iX == 0) {
            Arrays.fill(g71Var.f20969l, 0, g71Var.f20962e, false);
            return;
        }
        if (iX != g71Var.f20962e) {
            StringBuilder sbA = androidx.appcompat.widget.r0.a("Senc sample count ", iX, " is different from fragment sample count");
            sbA.append(g71Var.f20962e);
            throw qp0.a(sbA.toString(), (Exception) null);
        }
        Arrays.fill(g71Var.f20969l, 0, iX, z10);
        g71Var.f20971n.c(mp0Var.a());
        g71Var.f20968k = true;
        g71Var.f20972o = true;
        mp0Var.a(g71Var.f20971n.c(), 0, g71Var.f20971n.e());
        g71Var.f20971n.e(0);
        g71Var.f20972o = false;
    }

    private void a(rb.a aVar) throws qp0 {
        mo moVar;
        mo moVar2;
        DrmInitData drmInitDataA = a(aVar.f24655c);
        rb.a aVarC = aVar.c(1836475768);
        Objects.requireNonNull(aVarC);
        SparseArray sparseArray = new SparseArray();
        int size = aVarC.f24655c.size();
        long jV = -9223372036854775807L;
        for (int i10 = 0; i10 < size; i10++) {
            rb.b bVar = (rb.b) aVarC.f24655c.get(i10);
            int i11 = bVar.f24653a;
            if (i11 == 1953654136) {
                mp0 mp0Var = bVar.f24657b;
                mp0Var.e(12);
                Pair pairCreate = Pair.create(Integer.valueOf(mp0Var.h()), new mo(mp0Var.h() - 1, mp0Var.h(), mp0Var.h(), mp0Var.h()));
                sparseArray.put(((Integer) pairCreate.first).intValue(), (mo) pairCreate.second);
            } else if (i11 == 1835362404) {
                mp0 mp0Var2 = bVar.f24657b;
                mp0Var2.e(8);
                jV = rb.b(mp0Var2.h()) == 0 ? mp0Var2.v() : mp0Var2.y();
            }
        }
        ArrayList arrayListA = sb.a(aVar, new yx(), jV, drmInitDataA, false, false, new ho1(this));
        int size2 = arrayListA.size();
        if (this.f19639b.size() != 0) {
            pa.b(this.f19639b.size() == size2);
            for (int i12 = 0; i12 < size2; i12++) {
                k71 k71Var = (k71) arrayListA.get(i12);
                e71 e71Var = k71Var.f22282a;
                b bVar2 = this.f19639b.get(e71Var.f20100a);
                int i13 = e71Var.f20100a;
                if (sparseArray.size() == 1) {
                    moVar = (mo) sparseArray.valueAt(0);
                } else {
                    moVar = (mo) sparseArray.get(i13);
                    Objects.requireNonNull(moVar);
                }
                bVar2.a(k71Var, moVar);
            }
            return;
        }
        for (int i14 = 0; i14 < size2; i14++) {
            k71 k71Var2 = (k71) arrayListA.get(i14);
            e71 e71Var2 = k71Var2.f22282a;
            j71 j71VarA = this.B.a(i14, e71Var2.f20101b);
            int i15 = e71Var2.f20100a;
            if (sparseArray.size() == 1) {
                moVar2 = (mo) sparseArray.valueAt(0);
            } else {
                moVar2 = (mo) sparseArray.get(i15);
                Objects.requireNonNull(moVar2);
            }
            this.f19639b.put(e71Var2.f20100a, new b(j71VarA, k71Var2, moVar2));
            this.f19658u = Math.max(this.f19658u, e71Var2.f20104e);
        }
        this.B.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ut[] a() {
        return new ut[]{new cw(0)};
    }

    /* JADX WARN: Code duplicated, block: B:101:0x023e A[LOOP:10: B:99:0x0238->B:101:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x0254  */
    /* JADX WARN: Code duplicated, block: B:105:0x0259  */
    /* JADX WARN: Code duplicated, block: B:109:0x0270  */
    /* JADX WARN: Code duplicated, block: B:111:0x0285  */
    /* JADX WARN: Code duplicated, block: B:114:0x028c  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:193:0x0572  */
    /* JADX WARN: Code duplicated, block: B:195:0x058f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0595  */
    /* JADX WARN: Code duplicated, block: B:204:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:207:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:209:0x05e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:215:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:217:0x0602 A[LOOP:1: B:216:0x0600->B:217:0x0602, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:220:0x061a  */
    /* JADX WARN: Code duplicated, block: B:221:0x0628  */
    /* JADX WARN: Code duplicated, block: B:223:0x062d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0655  */
    /* JADX WARN: Code duplicated, block: B:242:0x0658  */
    /* JADX WARN: Code duplicated, block: B:244:0x0677  */
    /* JADX WARN: Code duplicated, block: B:245:0x067b  */
    /* JADX WARN: Code duplicated, block: B:247:0x0683  */
    /* JADX WARN: Code duplicated, block: B:249:0x0688  */
    /* JADX WARN: Code duplicated, block: B:303:0x070c  */
    /* JADX WARN: Code duplicated, block: B:306:0x0712  */
    /* JADX WARN: Code duplicated, block: B:308:0x0718  */
    /* JADX WARN: Code duplicated, block: B:310:0x071e  */
    /* JADX WARN: Code duplicated, block: B:315:0x0741  */
    /* JADX WARN: Code duplicated, block: B:317:0x0747  */
    /* JADX WARN: Code duplicated, block: B:331:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x073a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0752 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0759 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x024a A[EDGE_INSN: B:371:0x024a->B:102:0x024a BREAK  A[LOOP:10: B:99:0x0238->B:101:0x023e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX WARN: Code duplicated, block: B:73:0x016d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0180  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code duplicated, block: B:96:0x0222  */
    /* JADX WARN: Code duplicated, block: B:99:0x0238 A[LOOP:10: B:99:0x0238->B:101:0x023e, LOOP_START] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
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
    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        char c10;
        e71 e71Var;
        j71 j71Var;
        long jC;
        int i10;
        int i11;
        f71 f71VarE;
        j71.a aVar;
        a aVarRemoveFirst;
        long j10;
        int i12;
        byte[] bArrC;
        int i13;
        int i14;
        int i15;
        int iB;
        int iH;
        boolean z10;
        String str;
        byte b10;
        int iD;
        int iA;
        f71 f71VarE2;
        mp0 mp0Var;
        int i16;
        g71 g71Var;
        Object[] objArr;
        String str2;
        long jA;
        long jV;
        String str3;
        long j11;
        long j12;
        ArrayDeque<a> arrayDeque;
        a aVar2;
        long jY;
        long jY2;
        long j13;
        xn xnVar;
        long jA2;
        long position;
        xn xnVar2;
        long position2;
        int i17;
        int i18;
        boolean z11;
        boolean z12;
        mp0 mp0Var2;
        boolean z13;
        long j14;
        boolean z14;
        long position3;
        int size;
        int i19;
        while (true) {
            int i20 = this.f19650m;
            int i21 = 1;
            ?? r10 = 0;
            if (i20 == 0) {
                if (this.f19653p == 0) {
                    z14 = false;
                    if (((xn) vtVar).a(this.f19646i.c(), 0, 8, true)) {
                        this.f19653p = 8;
                        this.f19646i.e(0);
                        this.f19652o = this.f19646i.v();
                        this.f19651n = this.f19646i.h();
                        j13 = this.f19652o;
                        if (j13 == 1) {
                            ((xn) vtVar).a(this.f19646i.c(), 8, 8, false);
                            this.f19653p += 8;
                            position = this.f19646i.y();
                        } else {
                            if (j13 == 0) {
                                xnVar = (xn) vtVar;
                                jA2 = xnVar.a();
                                if (jA2 == -1 && !this.f19647j.isEmpty()) {
                                    jA2 = this.f19647j.peek().f24654b;
                                }
                                if (jA2 != -1) {
                                    position = (jA2 - xnVar.getPosition()) + ((long) this.f19653p);
                                }
                            }
                            if (this.f19652o >= this.f19653p) {
                                throw qp0.a("Atom size less than header length (unsupported).");
                            }
                            xnVar2 = (xn) vtVar;
                            position2 = xnVar2.getPosition() - ((long) this.f19653p);
                            i17 = this.f19651n;
                            if ((i17 != 1836019558 || i17 == 1835295092) && !this.E) {
                                this.B.a(new p01.b(this.f19658u, position2));
                                this.E = true;
                            }
                            if (this.f19651n == 1836019558) {
                                size = this.f19639b.size();
                                for (i19 = 0; i19 < size; i19++) {
                                    g71 g71Var2 = this.f19639b.valueAt(i19).f19668b;
                                    Objects.requireNonNull(g71Var2);
                                    g71Var2.f20960c = position2;
                                    g71Var2.f20959b = position2;
                                }
                            }
                            i18 = this.f19651n;
                            if (i18 == 1835295092) {
                                this.f19660w = null;
                                this.f19655r = position2 + this.f19652o;
                                this.f19650m = 2;
                                z14 = true;
                            } else {
                                if (i18 != 1836019574 || i18 == 1953653099 || i18 == 1835297121 || i18 == 1835626086 || i18 == 1937007212 || i18 == 1836019558 || i18 == 1953653094 || i18 == 1836475768 || i18 == 1701082227) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    position3 = (xnVar2.getPosition() + this.f19652o) - 8;
                                    this.f19647j.push(new rb.a(this.f19651n, position3));
                                    if (this.f19652o == this.f19653p) {
                                        a(position3);
                                    } else {
                                        this.f19650m = 0;
                                        this.f19653p = 0;
                                    }
                                    z13 = true;
                                } else {
                                    if (i18 != 1751411826 || i18 == 1835296868 || i18 == 1836476516 || i18 == 1936286840 || i18 == 1937011556 || i18 == 1937011827 || i18 == 1668576371 || i18 == 1937011555 || i18 == 1937011578 || i18 == 1937013298 || i18 == 1937007471 || i18 == 1668232756 || i18 == 1937011571 || i18 == 1952867444 || i18 == 1952868452 || i18 == 1953196132 || i18 == 1953654136 || i18 == 1953658222 || i18 == 1886614376 || i18 == 1935763834 || i18 == 1935763823 || i18 == 1936027235 || i18 == 1970628964 || i18 == 1935828848 || i18 == 1936158820 || i18 == 1701606260 || i18 == 1835362404 || i18 == 1701671783) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        if (this.f19653p == 8) {
                                            throw qp0.a("Leaf atom defines extended atom size (unsupported).");
                                        }
                                        j14 = this.f19652o;
                                        if (j14 <= 2147483647L) {
                                            throw qp0.a("Leaf atom with length > 2147483647 (unsupported).");
                                        }
                                        mp0Var2 = new mp0((int) j14);
                                        System.arraycopy(this.f19646i.c(), 0, mp0Var2.c(), 0, 8);
                                    } else {
                                        if (this.f19652o <= 2147483647L) {
                                            throw qp0.a("Skipping atom with length > 2147483647 (unsupported).");
                                        }
                                        mp0Var2 = null;
                                    }
                                    this.f19654q = mp0Var2;
                                    z13 = true;
                                    this.f19650m = 1;
                                }
                                z14 = z13;
                            }
                        }
                        this.f19652o = position;
                        if (this.f19652o >= this.f19653p) {
                            throw qp0.a("Atom size less than header length (unsupported).");
                        }
                        xnVar2 = (xn) vtVar;
                        position2 = xnVar2.getPosition() - ((long) this.f19653p);
                        i17 = this.f19651n;
                        if (i17 != 1836019558) {
                            this.B.a(new p01.b(this.f19658u, position2));
                            this.E = true;
                        } else {
                            this.B.a(new p01.b(this.f19658u, position2));
                            this.E = true;
                        }
                        if (this.f19651n == 1836019558) {
                            size = this.f19639b.size();
                            while (i19 < size) {
                                g71 g71Var3 = this.f19639b.valueAt(i19).f19668b;
                                Objects.requireNonNull(g71Var3);
                                g71Var3.f20960c = position2;
                                g71Var3.f20959b = position2;
                            }
                        }
                        i18 = this.f19651n;
                        if (i18 == 1835295092) {
                            this.f19660w = null;
                            this.f19655r = position2 + this.f19652o;
                            this.f19650m = 2;
                            z14 = true;
                        } else {
                            if (i18 != 1836019574) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                position3 = (xnVar2.getPosition() + this.f19652o) - 8;
                                this.f19647j.push(new rb.a(this.f19651n, position3));
                                if (this.f19652o == this.f19653p) {
                                    a(position3);
                                } else {
                                    this.f19650m = 0;
                                    this.f19653p = 0;
                                }
                                z13 = true;
                            } else {
                                if (i18 != 1751411826) {
                                    z12 = true;
                                } else {
                                    z12 = true;
                                }
                                if (z12) {
                                    if (this.f19653p == 8) {
                                        throw qp0.a("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    j14 = this.f19652o;
                                    if (j14 <= 2147483647L) {
                                        throw qp0.a("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    mp0Var2 = new mp0((int) j14);
                                    System.arraycopy(this.f19646i.c(), 0, mp0Var2.c(), 0, 8);
                                } else {
                                    if (this.f19652o <= 2147483647L) {
                                        throw qp0.a("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    mp0Var2 = null;
                                }
                                this.f19654q = mp0Var2;
                                z13 = true;
                                this.f19650m = 1;
                            }
                            z14 = z13;
                        }
                    }
                } else {
                    j13 = this.f19652o;
                    if (j13 == 1) {
                        ((xn) vtVar).a(this.f19646i.c(), 8, 8, false);
                        this.f19653p += 8;
                        position = this.f19646i.y();
                    } else {
                        if (j13 == 0) {
                            xnVar = (xn) vtVar;
                            jA2 = xnVar.a();
                            if (jA2 == -1) {
                                jA2 = this.f19647j.peek().f24654b;
                            }
                            if (jA2 != -1) {
                                position = (jA2 - xnVar.getPosition()) + ((long) this.f19653p);
                            }
                        }
                        if (this.f19652o >= this.f19653p) {
                            throw qp0.a("Atom size less than header length (unsupported).");
                        }
                        xnVar2 = (xn) vtVar;
                        position2 = xnVar2.getPosition() - ((long) this.f19653p);
                        i17 = this.f19651n;
                        if (i17 != 1836019558) {
                            this.B.a(new p01.b(this.f19658u, position2));
                            this.E = true;
                        } else {
                            this.B.a(new p01.b(this.f19658u, position2));
                            this.E = true;
                        }
                        if (this.f19651n == 1836019558) {
                            size = this.f19639b.size();
                            while (i19 < size) {
                                g71 g71Var4 = this.f19639b.valueAt(i19).f19668b;
                                Objects.requireNonNull(g71Var4);
                                g71Var4.f20960c = position2;
                                g71Var4.f20959b = position2;
                            }
                        }
                        i18 = this.f19651n;
                        if (i18 == 1835295092) {
                            this.f19660w = null;
                            this.f19655r = position2 + this.f19652o;
                            this.f19650m = 2;
                            z14 = true;
                        } else {
                            if (i18 != 1836019574) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                position3 = (xnVar2.getPosition() + this.f19652o) - 8;
                                this.f19647j.push(new rb.a(this.f19651n, position3));
                                if (this.f19652o == this.f19653p) {
                                    a(position3);
                                } else {
                                    this.f19650m = 0;
                                    this.f19653p = 0;
                                }
                                z13 = true;
                            } else {
                                if (i18 != 1751411826) {
                                    z12 = true;
                                } else {
                                    z12 = true;
                                }
                                if (z12) {
                                    if (this.f19653p == 8) {
                                        throw qp0.a("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    j14 = this.f19652o;
                                    if (j14 <= 2147483647L) {
                                        throw qp0.a("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    mp0Var2 = new mp0((int) j14);
                                    System.arraycopy(this.f19646i.c(), 0, mp0Var2.c(), 0, 8);
                                } else {
                                    if (this.f19652o <= 2147483647L) {
                                        throw qp0.a("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    mp0Var2 = null;
                                }
                                this.f19654q = mp0Var2;
                                z13 = true;
                                this.f19650m = 1;
                            }
                            z14 = z13;
                        }
                    }
                    this.f19652o = position;
                    if (this.f19652o >= this.f19653p) {
                        throw qp0.a("Atom size less than header length (unsupported).");
                    }
                    xnVar2 = (xn) vtVar;
                    position2 = xnVar2.getPosition() - ((long) this.f19653p);
                    i17 = this.f19651n;
                    if (i17 != 1836019558) {
                        this.B.a(new p01.b(this.f19658u, position2));
                        this.E = true;
                    } else {
                        this.B.a(new p01.b(this.f19658u, position2));
                        this.E = true;
                    }
                    if (this.f19651n == 1836019558) {
                        size = this.f19639b.size();
                        while (i19 < size) {
                            g71 g71Var5 = this.f19639b.valueAt(i19).f19668b;
                            Objects.requireNonNull(g71Var5);
                            g71Var5.f20960c = position2;
                            g71Var5.f20959b = position2;
                        }
                    }
                    i18 = this.f19651n;
                    if (i18 == 1835295092) {
                        this.f19660w = null;
                        this.f19655r = position2 + this.f19652o;
                        this.f19650m = 2;
                        z14 = true;
                    } else {
                        if (i18 != 1836019574) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            position3 = (xnVar2.getPosition() + this.f19652o) - 8;
                            this.f19647j.push(new rb.a(this.f19651n, position3));
                            if (this.f19652o == this.f19653p) {
                                a(position3);
                            } else {
                                this.f19650m = 0;
                                this.f19653p = 0;
                            }
                            z13 = true;
                        } else {
                            if (i18 != 1751411826) {
                                z12 = true;
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                if (this.f19653p == 8) {
                                    throw qp0.a("Leaf atom defines extended atom size (unsupported).");
                                }
                                j14 = this.f19652o;
                                if (j14 <= 2147483647L) {
                                    throw qp0.a("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                mp0Var2 = new mp0((int) j14);
                                System.arraycopy(this.f19646i.c(), 0, mp0Var2.c(), 0, 8);
                            } else {
                                if (this.f19652o <= 2147483647L) {
                                    throw qp0.a("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                mp0Var2 = null;
                            }
                            this.f19654q = mp0Var2;
                            z13 = true;
                            this.f19650m = 1;
                        }
                        z14 = z13;
                    }
                }
                if (!z14) {
                    return -1;
                }
            } else if (i20 != 1) {
                long j15 = RecyclerView.FOREVER_NS;
                if (i20 != 2) {
                    b bVar = this.f19660w;
                    if (bVar == null) {
                        SparseArray<b> sparseArray = this.f19639b;
                        int size2 = sparseArray.size();
                        long j16 = Long.MAX_VALUE;
                        b bVar2 = null;
                        for (int i22 = 0; i22 < size2; i22++) {
                            b bVarValueAt = sparseArray.valueAt(i22);
                            if ((bVarValueAt.f19678l || bVarValueAt.f19672f != bVarValueAt.f19670d.f22283b) && (!bVarValueAt.f19678l || bVarValueAt.f19674h != bVarValueAt.f19668b.f20961d)) {
                                long jB = bVarValueAt.b();
                                if (jB < j16) {
                                    bVar2 = bVarValueAt;
                                    j16 = jB;
                                }
                            }
                        }
                        if (bVar2 == null) {
                            xn xnVar3 = (xn) vtVar;
                            int position4 = (int) (this.f19655r - xnVar3.getPosition());
                            if (position4 < 0) {
                                throw qp0.a("Offset to end of mdat was negative.", (Exception) null);
                            }
                            xnVar3.a(position4);
                            this.f19650m = 0;
                            this.f19653p = 0;
                            i21 = 0;
                        } else {
                            xn xnVar4 = (xn) vtVar;
                            int iB2 = (int) (bVar2.b() - xnVar4.getPosition());
                            if (iB2 < 0) {
                                p90.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                iB2 = 0;
                            }
                            xnVar4.a(iB2);
                            this.f19660w = bVar2;
                            bVar = bVar2;
                            c10 = 6;
                            if (this.f19650m == 3) {
                                iD = bVar.d();
                                this.f19661x = iD;
                                if (bVar.f19672f < bVar.f19675i) {
                                    ((xn) vtVar).a(iD);
                                    f71VarE2 = bVar.e();
                                    if (f71VarE2 != null) {
                                        mp0Var = bVar.f19668b.f20971n;
                                        i16 = f71VarE2.f20575d;
                                        if (i16 != 0) {
                                            mp0Var.f(i16);
                                        }
                                        g71Var = bVar.f19668b;
                                        int i23 = bVar.f19672f;
                                        if (g71Var.f20968k || !g71Var.f20969l[i23]) {
                                            objArr = false;
                                        } else {
                                            objArr = true;
                                        }
                                        if (objArr != false) {
                                            mp0Var.f(mp0Var.z() * 6);
                                        }
                                    }
                                    if (!bVar.f()) {
                                        this.f19660w = null;
                                    }
                                    this.f19650m = 3;
                                } else {
                                    if (bVar.f19670d.f22282a.f20106g == 1) {
                                        this.f19661x = iD - 8;
                                        ((xn) vtVar).a(8);
                                    }
                                    if ("audio/ac4".equals(bVar.f19670d.f22282a.f20105f.f27115l)) {
                                        this.f19662y = bVar.a(this.f19661x, 7);
                                        l.a(this.f19661x, this.f19644g);
                                        bVar.f19667a.a(7, this.f19644g);
                                        iA = this.f19662y + 7;
                                    } else {
                                        iA = bVar.a(this.f19661x, 0);
                                    }
                                    this.f19662y = iA;
                                    this.f19661x += this.f19662y;
                                    this.f19650m = 4;
                                    this.f19663z = 0;
                                    e71Var = bVar.f19670d.f22282a;
                                    j71Var = bVar.f19667a;
                                    jC = bVar.c();
                                    if (e71Var.f20109j != 0) {
                                        while (true) {
                                            i10 = this.f19662y;
                                            i11 = this.f19661x;
                                            if (i10 < i11) {
                                                break;
                                            }
                                            this.f19662y += j71Var.b(vtVar, i11 - i10, false);
                                        }
                                    } else {
                                        bArrC = this.f19641d.c();
                                        bArrC[0] = 0;
                                        bArrC[1] = 0;
                                        bArrC[2] = 0;
                                        int i24 = e71Var.f20109j;
                                        i13 = i24 + 1;
                                        i14 = 4 - i24;
                                        while (this.f19662y < this.f19661x) {
                                            i15 = this.f19663z;
                                            if (i15 == 0) {
                                                ((xn) vtVar).a(bArrC, i14, i13, r10);
                                                this.f19641d.e(r10);
                                                iH = this.f19641d.h();
                                                if (iH >= i21) {
                                                    throw qp0.a("Invalid NAL length", (Exception) null);
                                                }
                                                this.f19663z = iH - 1;
                                                this.f19640c.e(r10);
                                                j71Var.a(4, this.f19640c);
                                                j71Var.a(i21, this.f19641d);
                                                if (this.D.length > 0) {
                                                    str = e71Var.f20105f.f27115l;
                                                    b10 = bArrC[4];
                                                    byte[] bArr = oh0.f23795a;
                                                    if (((("video/avc".equals(str) || (b10 & Ascii.US) != c10) && !("video/hevc".equals(str) && ((b10 & 126) >> i21) == 39)) ? 0 : i21) != 0) {
                                                        z10 = i21;
                                                    } else {
                                                        z10 = 0;
                                                    }
                                                } else {
                                                    z10 = 0;
                                                }
                                                this.A = z10;
                                                this.f19662y += 5;
                                                this.f19661x += i14;
                                            } else {
                                                if (this.A) {
                                                    this.f19642e.c(i15);
                                                    ((xn) vtVar).a(this.f19642e.c(), 0, this.f19663z, false);
                                                    j71Var.a(this.f19663z, this.f19642e);
                                                    iB = this.f19663z;
                                                    int iA2 = oh0.a(this.f19642e.e(), this.f19642e.c());
                                                    this.f19642e.e("video/hevc".equals(e71Var.f20105f.f27115l) ? 1 : 0);
                                                    this.f19642e.d(iA2);
                                                    kh.a(jC, this.f19642e, this.D);
                                                } else {
                                                    iB = j71Var.b(vtVar, i15, false);
                                                }
                                                this.f19662y += iB;
                                                this.f19663z -= iB;
                                                c10 = 6;
                                                i21 = 1;
                                            }
                                            r10 = 0;
                                        }
                                    }
                                    int iA3 = bVar.a();
                                    f71VarE = bVar.e();
                                    if (f71VarE != null) {
                                        aVar = f71VarE.f20574c;
                                    } else {
                                        aVar = null;
                                    }
                                    j71Var.a(jC, iA3, this.f19661x, 0, aVar);
                                    while (!this.f19648k.isEmpty()) {
                                        aVarRemoveFirst = this.f19648k.removeFirst();
                                        this.f19656s -= aVarRemoveFirst.f19666c;
                                        j10 = aVarRemoveFirst.f19664a;
                                        if (aVarRemoveFirst.f19665b) {
                                            j10 += jC;
                                        }
                                        for (j71 j71Var2 : this.C) {
                                            j71Var2.a(j10, 1, aVarRemoveFirst.f19666c, this.f19656s, null);
                                        }
                                    }
                                    if (!bVar.f()) {
                                        this.f19660w = null;
                                    }
                                    this.f19650m = 3;
                                    i21 = 1;
                                }
                            } else {
                                e71Var = bVar.f19670d.f22282a;
                                j71Var = bVar.f19667a;
                                jC = bVar.c();
                                if (e71Var.f20109j != 0) {
                                    while (true) {
                                        i10 = this.f19662y;
                                        i11 = this.f19661x;
                                        if (i10 < i11) {
                                            break;
                                            break;
                                        }
                                        this.f19662y += j71Var.b(vtVar, i11 - i10, false);
                                    }
                                } else {
                                    bArrC = this.f19641d.c();
                                    bArrC[0] = 0;
                                    bArrC[1] = 0;
                                    bArrC[2] = 0;
                                    int i25 = e71Var.f20109j;
                                    i13 = i25 + 1;
                                    i14 = 4 - i25;
                                    while (this.f19662y < this.f19661x) {
                                        i15 = this.f19663z;
                                        if (i15 == 0) {
                                            ((xn) vtVar).a(bArrC, i14, i13, r10);
                                            this.f19641d.e(r10);
                                            iH = this.f19641d.h();
                                            if (iH >= i21) {
                                                throw qp0.a("Invalid NAL length", (Exception) null);
                                            }
                                            this.f19663z = iH - 1;
                                            this.f19640c.e(r10);
                                            j71Var.a(4, this.f19640c);
                                            j71Var.a(i21, this.f19641d);
                                            if (this.D.length > 0) {
                                                str = e71Var.f20105f.f27115l;
                                                b10 = bArrC[4];
                                                byte[] bArr2 = oh0.f23795a;
                                                if (((("video/avc".equals(str) || (b10 & Ascii.US) != c10) && !("video/hevc".equals(str) && ((b10 & 126) >> i21) == 39)) ? 0 : i21) != 0) {
                                                    z10 = i21;
                                                } else {
                                                    z10 = 0;
                                                }
                                            } else {
                                                z10 = 0;
                                            }
                                            this.A = z10;
                                            this.f19662y += 5;
                                            this.f19661x += i14;
                                        } else {
                                            if (this.A) {
                                                this.f19642e.c(i15);
                                                ((xn) vtVar).a(this.f19642e.c(), 0, this.f19663z, false);
                                                j71Var.a(this.f19663z, this.f19642e);
                                                iB = this.f19663z;
                                                int iA4 = oh0.a(this.f19642e.e(), this.f19642e.c());
                                                this.f19642e.e("video/hevc".equals(e71Var.f20105f.f27115l) ? 1 : 0);
                                                this.f19642e.d(iA4);
                                                kh.a(jC, this.f19642e, this.D);
                                            } else {
                                                iB = j71Var.b(vtVar, i15, false);
                                            }
                                            this.f19662y += iB;
                                            this.f19663z -= iB;
                                            c10 = 6;
                                            i21 = 1;
                                        }
                                        r10 = 0;
                                    }
                                }
                                int iA5 = bVar.a();
                                f71VarE = bVar.e();
                                if (f71VarE != null) {
                                    aVar = f71VarE.f20574c;
                                } else {
                                    aVar = null;
                                }
                                j71Var.a(jC, iA5, this.f19661x, 0, aVar);
                                while (!this.f19648k.isEmpty()) {
                                    aVarRemoveFirst = this.f19648k.removeFirst();
                                    this.f19656s -= aVarRemoveFirst.f19666c;
                                    j10 = aVarRemoveFirst.f19664a;
                                    if (aVarRemoveFirst.f19665b) {
                                        j10 += jC;
                                    }
                                    while (i12 < r8) {
                                        j71Var2.a(j10, 1, aVarRemoveFirst.f19666c, this.f19656s, null);
                                    }
                                }
                                if (!bVar.f()) {
                                    this.f19660w = null;
                                }
                                this.f19650m = 3;
                                i21 = 1;
                            }
                        }
                    } else {
                        c10 = 6;
                        if (this.f19650m == 3) {
                            iD = bVar.d();
                            this.f19661x = iD;
                            if (bVar.f19672f < bVar.f19675i) {
                                ((xn) vtVar).a(iD);
                                f71VarE2 = bVar.e();
                                if (f71VarE2 != null) {
                                    mp0Var = bVar.f19668b.f20971n;
                                    i16 = f71VarE2.f20575d;
                                    if (i16 != 0) {
                                        mp0Var.f(i16);
                                    }
                                    g71Var = bVar.f19668b;
                                    int i26 = bVar.f19672f;
                                    if (g71Var.f20968k) {
                                        objArr = false;
                                    } else {
                                        objArr = false;
                                    }
                                    if (objArr != false) {
                                        mp0Var.f(mp0Var.z() * 6);
                                    }
                                }
                                if (!bVar.f()) {
                                    this.f19660w = null;
                                }
                                this.f19650m = 3;
                            } else {
                                if (bVar.f19670d.f22282a.f20106g == 1) {
                                    this.f19661x = iD - 8;
                                    ((xn) vtVar).a(8);
                                }
                                if ("audio/ac4".equals(bVar.f19670d.f22282a.f20105f.f27115l)) {
                                    this.f19662y = bVar.a(this.f19661x, 7);
                                    l.a(this.f19661x, this.f19644g);
                                    bVar.f19667a.a(7, this.f19644g);
                                    iA = this.f19662y + 7;
                                } else {
                                    iA = bVar.a(this.f19661x, 0);
                                }
                                this.f19662y = iA;
                                this.f19661x += this.f19662y;
                                this.f19650m = 4;
                                this.f19663z = 0;
                                e71Var = bVar.f19670d.f22282a;
                                j71Var = bVar.f19667a;
                                jC = bVar.c();
                                if (e71Var.f20109j != 0) {
                                    while (true) {
                                        i10 = this.f19662y;
                                        i11 = this.f19661x;
                                        if (i10 < i11) {
                                            break;
                                            break;
                                        }
                                        this.f19662y += j71Var.b(vtVar, i11 - i10, false);
                                    }
                                } else {
                                    bArrC = this.f19641d.c();
                                    bArrC[0] = 0;
                                    bArrC[1] = 0;
                                    bArrC[2] = 0;
                                    int i27 = e71Var.f20109j;
                                    i13 = i27 + 1;
                                    i14 = 4 - i27;
                                    while (this.f19662y < this.f19661x) {
                                        i15 = this.f19663z;
                                        if (i15 == 0) {
                                            ((xn) vtVar).a(bArrC, i14, i13, r10);
                                            this.f19641d.e(r10);
                                            iH = this.f19641d.h();
                                            if (iH >= i21) {
                                                throw qp0.a("Invalid NAL length", (Exception) null);
                                            }
                                            this.f19663z = iH - 1;
                                            this.f19640c.e(r10);
                                            j71Var.a(4, this.f19640c);
                                            j71Var.a(i21, this.f19641d);
                                            if (this.D.length > 0) {
                                                str = e71Var.f20105f.f27115l;
                                                b10 = bArrC[4];
                                                byte[] bArr3 = oh0.f23795a;
                                                if (((("video/avc".equals(str) || (b10 & Ascii.US) != c10) && !("video/hevc".equals(str) && ((b10 & 126) >> i21) == 39)) ? 0 : i21) != 0) {
                                                    z10 = i21;
                                                } else {
                                                    z10 = 0;
                                                }
                                            } else {
                                                z10 = 0;
                                            }
                                            this.A = z10;
                                            this.f19662y += 5;
                                            this.f19661x += i14;
                                        } else {
                                            if (this.A) {
                                                this.f19642e.c(i15);
                                                ((xn) vtVar).a(this.f19642e.c(), 0, this.f19663z, false);
                                                j71Var.a(this.f19663z, this.f19642e);
                                                iB = this.f19663z;
                                                int iA6 = oh0.a(this.f19642e.e(), this.f19642e.c());
                                                this.f19642e.e("video/hevc".equals(e71Var.f20105f.f27115l) ? 1 : 0);
                                                this.f19642e.d(iA6);
                                                kh.a(jC, this.f19642e, this.D);
                                            } else {
                                                iB = j71Var.b(vtVar, i15, false);
                                            }
                                            this.f19662y += iB;
                                            this.f19663z -= iB;
                                            c10 = 6;
                                            i21 = 1;
                                        }
                                        r10 = 0;
                                    }
                                }
                                int iA7 = bVar.a();
                                f71VarE = bVar.e();
                                if (f71VarE != null) {
                                    aVar = f71VarE.f20574c;
                                } else {
                                    aVar = null;
                                }
                                j71Var.a(jC, iA7, this.f19661x, 0, aVar);
                                while (!this.f19648k.isEmpty()) {
                                    aVarRemoveFirst = this.f19648k.removeFirst();
                                    this.f19656s -= aVarRemoveFirst.f19666c;
                                    j10 = aVarRemoveFirst.f19664a;
                                    if (aVarRemoveFirst.f19665b) {
                                        j10 += jC;
                                    }
                                    while (i12 < r8) {
                                        j71Var2.a(j10, 1, aVarRemoveFirst.f19666c, this.f19656s, null);
                                    }
                                }
                                if (!bVar.f()) {
                                    this.f19660w = null;
                                }
                                this.f19650m = 3;
                                i21 = 1;
                            }
                        } else {
                            e71Var = bVar.f19670d.f22282a;
                            j71Var = bVar.f19667a;
                            jC = bVar.c();
                            if (e71Var.f20109j != 0) {
                                while (true) {
                                    i10 = this.f19662y;
                                    i11 = this.f19661x;
                                    if (i10 < i11) {
                                        break;
                                        break;
                                    }
                                    this.f19662y += j71Var.b(vtVar, i11 - i10, false);
                                }
                            } else {
                                bArrC = this.f19641d.c();
                                bArrC[0] = 0;
                                bArrC[1] = 0;
                                bArrC[2] = 0;
                                int i28 = e71Var.f20109j;
                                i13 = i28 + 1;
                                i14 = 4 - i28;
                                while (this.f19662y < this.f19661x) {
                                    i15 = this.f19663z;
                                    if (i15 == 0) {
                                        ((xn) vtVar).a(bArrC, i14, i13, r10);
                                        this.f19641d.e(r10);
                                        iH = this.f19641d.h();
                                        if (iH >= i21) {
                                            throw qp0.a("Invalid NAL length", (Exception) null);
                                        }
                                        this.f19663z = iH - 1;
                                        this.f19640c.e(r10);
                                        j71Var.a(4, this.f19640c);
                                        j71Var.a(i21, this.f19641d);
                                        if (this.D.length > 0) {
                                            str = e71Var.f20105f.f27115l;
                                            b10 = bArrC[4];
                                            byte[] bArr4 = oh0.f23795a;
                                            if (((("video/avc".equals(str) || (b10 & Ascii.US) != c10) && !("video/hevc".equals(str) && ((b10 & 126) >> i21) == 39)) ? 0 : i21) != 0) {
                                                z10 = i21;
                                            } else {
                                                z10 = 0;
                                            }
                                        } else {
                                            z10 = 0;
                                        }
                                        this.A = z10;
                                        this.f19662y += 5;
                                        this.f19661x += i14;
                                    } else {
                                        if (this.A) {
                                            this.f19642e.c(i15);
                                            ((xn) vtVar).a(this.f19642e.c(), 0, this.f19663z, false);
                                            j71Var.a(this.f19663z, this.f19642e);
                                            iB = this.f19663z;
                                            int iA8 = oh0.a(this.f19642e.e(), this.f19642e.c());
                                            this.f19642e.e("video/hevc".equals(e71Var.f20105f.f27115l) ? 1 : 0);
                                            this.f19642e.d(iA8);
                                            kh.a(jC, this.f19642e, this.D);
                                        } else {
                                            iB = j71Var.b(vtVar, i15, false);
                                        }
                                        this.f19662y += iB;
                                        this.f19663z -= iB;
                                        c10 = 6;
                                        i21 = 1;
                                    }
                                    r10 = 0;
                                }
                            }
                            int iA9 = bVar.a();
                            f71VarE = bVar.e();
                            if (f71VarE != null) {
                                aVar = f71VarE.f20574c;
                            } else {
                                aVar = null;
                            }
                            j71Var.a(jC, iA9, this.f19661x, 0, aVar);
                            while (!this.f19648k.isEmpty()) {
                                aVarRemoveFirst = this.f19648k.removeFirst();
                                this.f19656s -= aVarRemoveFirst.f19666c;
                                j10 = aVarRemoveFirst.f19664a;
                                if (aVarRemoveFirst.f19665b) {
                                    j10 += jC;
                                }
                                while (i12 < r8) {
                                    j71Var2.a(j10, 1, aVarRemoveFirst.f19666c, this.f19656s, null);
                                }
                            }
                            if (!bVar.f()) {
                                this.f19660w = null;
                            }
                            this.f19650m = 3;
                            i21 = 1;
                        }
                    }
                    if (i21 != 0) {
                        return 0;
                    }
                } else {
                    int size3 = this.f19639b.size();
                    b bVarValueAt2 = null;
                    for (int i29 = 0; i29 < size3; i29++) {
                        g71 g71Var6 = this.f19639b.valueAt(i29).f19668b;
                        if (g71Var6.f20972o) {
                            long j17 = g71Var6.f20960c;
                            if (j17 < j15) {
                                bVarValueAt2 = this.f19639b.valueAt(i29);
                                j15 = j17;
                            }
                        }
                    }
                    if (bVarValueAt2 == null) {
                        this.f19650m = 3;
                    } else {
                        xn xnVar5 = (xn) vtVar;
                        int position5 = (int) (j15 - xnVar5.getPosition());
                        if (position5 < 0) {
                            throw qp0.a("Offset to encryption data was negative.", (Exception) null);
                        }
                        xnVar5.a(position5);
                        g71 g71Var7 = bVarValueAt2.f19668b;
                        xnVar5.a(g71Var7.f20971n.c(), 0, g71Var7.f20971n.e(), false);
                        g71Var7.f20971n.e(0);
                        g71Var7.f20972o = false;
                    }
                }
            } else {
                int i30 = ((int) this.f19652o) - this.f19653p;
                mp0 mp0Var3 = this.f19654q;
                if (mp0Var3 != null) {
                    xn xnVar6 = (xn) vtVar;
                    xnVar6.a(mp0Var3.c(), 8, i30, false);
                    int i31 = this.f19651n;
                    rb.b bVar3 = new rb.b(i31, mp0Var3);
                    long position6 = xnVar6.getPosition();
                    if (!this.f19647j.isEmpty()) {
                        this.f19647j.peek().f24655c.add(bVar3);
                    } else if (i31 == 1936286840) {
                        mp0Var3.e(8);
                        int iB3 = rb.b(mp0Var3.h());
                        mp0Var3.f(4);
                        long jV2 = mp0Var3.v();
                        if (iB3 == 0) {
                            jY = mp0Var3.v();
                            jY2 = mp0Var3.v();
                        } else {
                            jY = mp0Var3.y();
                            jY2 = mp0Var3.y();
                        }
                        long j18 = jY;
                        long j19 = jY2 + position6;
                        long jA3 = da1.a(j18, 1000000L, jV2);
                        mp0Var3.f(2);
                        int iZ = mp0Var3.z();
                        int[] iArr = new int[iZ];
                        long[] jArr = new long[iZ];
                        long[] jArr2 = new long[iZ];
                        long[] jArr3 = new long[iZ];
                        long jA4 = jA3;
                        int i32 = 0;
                        while (i32 < iZ) {
                            int iH2 = mp0Var3.h();
                            if ((iH2 & Integer.MIN_VALUE) != 0) {
                                throw qp0.a("Unhandled indirect reference", (Exception) null);
                            }
                            long jV3 = mp0Var3.v();
                            iArr[i32] = iH2 & Integer.MAX_VALUE;
                            jArr[i32] = j19;
                            jArr3[i32] = jA4;
                            long j20 = j18 + jV3;
                            long[] jArr4 = jArr3;
                            int i33 = i32;
                            long[] jArr5 = jArr2;
                            jA4 = da1.a(j20, 1000000L, jV2);
                            jArr5[i33] = jA4 - jArr4[i33];
                            mp0Var3.f(4);
                            j19 += (long) iArr[i33];
                            i32 = i33 + 1;
                            jArr = jArr;
                            jArr3 = jArr4;
                            jArr2 = jArr5;
                            j18 = j20;
                            iZ = iZ;
                        }
                        Pair pairCreate = Pair.create(Long.valueOf(jA3), new rh(iArr, jArr, jArr2, jArr3));
                        this.f19659v = ((Long) pairCreate.first).longValue();
                        this.B.a((p01) pairCreate.second);
                        this.E = true;
                    } else if (i31 == 1701671783 && this.C.length != 0) {
                        mp0Var3.e(8);
                        int iB4 = rb.b(mp0Var3.h());
                        if (iB4 == 0) {
                            String strQ = mp0Var3.q();
                            Objects.requireNonNull(strQ);
                            String strQ2 = mp0Var3.q();
                            Objects.requireNonNull(strQ2);
                            long jV4 = mp0Var3.v();
                            long jA5 = da1.a(mp0Var3.v(), 1000000L, jV4);
                            long j21 = this.f19659v;
                            long j22 = j21 != -9223372036854775807L ? j21 + jA5 : -9223372036854775807L;
                            str2 = strQ;
                            jA = da1.a(mp0Var3.v(), 1000L, jV4);
                            jV = mp0Var3.v();
                            str3 = strQ2;
                            j11 = jA5;
                            j12 = j22;
                        } else if (iB4 != 1) {
                            o80.a("Skipping unsupported emsg version: ", iB4, "FragmentedMp4Extractor");
                        } else {
                            long jV5 = mp0Var3.v();
                            long jA6 = da1.a(mp0Var3.y(), 1000000L, jV5);
                            long jA7 = da1.a(mp0Var3.v(), 1000L, jV5);
                            long jV6 = mp0Var3.v();
                            String strQ3 = mp0Var3.q();
                            Objects.requireNonNull(strQ3);
                            String strQ4 = mp0Var3.q();
                            Objects.requireNonNull(strQ4);
                            str2 = strQ3;
                            jA = jA7;
                            j12 = jA6;
                            jV = jV6;
                            str3 = strQ4;
                            j11 = -9223372036854775807L;
                        }
                        byte[] bArr5 = new byte[mp0Var3.a()];
                        mp0Var3.a(bArr5, 0, mp0Var3.a());
                        mp0 mp0Var4 = new mp0(this.f19645h.a(new EventMessage(str2, str3, jA, jV, bArr5)));
                        int iA10 = mp0Var4.a();
                        for (j71 j71Var3 : this.C) {
                            mp0Var4.e(0);
                            j71Var3.a(iA10, mp0Var4);
                        }
                        if (j12 == -9223372036854775807L) {
                            arrayDeque = this.f19648k;
                            aVar2 = new a(iA10, j11, true);
                        } else if (this.f19648k.isEmpty()) {
                            for (j71 j71Var4 : this.C) {
                                j71Var4.a(j12, 1, iA10, 0, null);
                            }
                        } else {
                            arrayDeque = this.f19648k;
                            aVar2 = new a(iA10, j12, false);
                        }
                        arrayDeque.addLast(aVar2);
                        this.f19656s += iA10;
                    }
                } else {
                    ((xn) vtVar).a(i30);
                }
                a(((xn) vtVar).getPosition());
            }
        }
    }

    public final e71 a(e71 e71Var) {
        return e71Var;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        int size = this.f19639b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19639b.valueAt(i10).g();
        }
        this.f19648k.clear();
        this.f19656s = 0;
        this.f19657t = j11;
        this.f19647j.clear();
        this.f19650m = 0;
        this.f19653p = 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        int i10;
        this.B = wtVar;
        int i11 = 0;
        this.f19650m = 0;
        this.f19653p = 0;
        j71[] j71VarArr = new j71[2];
        this.C = j71VarArr;
        j71 j71Var = this.f19649l;
        if (j71Var != null) {
            j71VarArr[0] = j71Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        j71[] j71VarArr2 = (j71[]) da1.a(i10, j71VarArr);
        this.C = j71VarArr2;
        for (j71 j71Var2 : j71VarArr2) {
            j71Var2.a(G);
        }
        this.D = new j71[this.f19638a.size()];
        while (i11 < this.D.length) {
            j71 j71VarA = this.B.a(i12, 3);
            j71VarA.a(this.f19638a.get(i11));
            this.D[i11] = j71VarA;
            i11++;
            i12++;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        return a31.a((xn) vtVar);
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
