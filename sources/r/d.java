package r;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f34963p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f34964q = 1000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static f f34965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static long f34966s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f34969c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b[] f34972f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f34978l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f34981o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34967a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34968b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34970d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34971e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34973g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f34974h = new boolean[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34975i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34976j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34977k = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i[] f34979m = new i[f34964q];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f34980n = 0;

    public interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void clear();

        boolean isEmpty();
    }

    public d() {
        this.f34972f = null;
        this.f34972f = new b[32];
        t();
        c cVar = new c();
        this.f34978l = cVar;
        this.f34969c = new h(cVar);
        this.f34981o = new b(cVar);
    }

    public final i a(i.a aVar, String str) {
        i iVar = (i) this.f34978l.f34961b.a();
        if (iVar == null) {
            iVar = new i(aVar, str);
        } else {
            iVar.c();
        }
        iVar.f35026l = aVar;
        int i10 = this.f34980n;
        int i11 = f34964q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f34964q = i12;
            this.f34979m = (i[]) Arrays.copyOf(this.f34979m, i12);
        }
        i[] iVarArr = this.f34979m;
        int i13 = this.f34980n;
        this.f34980n = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    public void b(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        int i13;
        float f11;
        b bVarM = m();
        if (iVar2 == iVar3) {
            bVarM.f34958d.h(iVar, 1.0f);
            bVarM.f34958d.h(iVar4, 1.0f);
            bVarM.f34958d.h(iVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarM.f34958d.h(iVar, 1.0f);
            bVarM.f34958d.h(iVar2, -1.0f);
            bVarM.f34958d.h(iVar3, -1.0f);
            bVarM.f34958d.h(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                i13 = (-i10) + i11;
                f11 = i13;
                bVarM.f34956b = f11;
            }
        } else if (f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            bVarM.f34958d.h(iVar, -1.0f);
            bVarM.f34958d.h(iVar2, 1.0f);
            f11 = i10;
            bVarM.f34956b = f11;
        } else if (f10 >= 1.0f) {
            bVarM.f34958d.h(iVar4, -1.0f);
            bVarM.f34958d.h(iVar3, 1.0f);
            i13 = -i11;
            f11 = i13;
            bVarM.f34956b = f11;
        } else {
            float f12 = 1.0f - f10;
            bVarM.f34958d.h(iVar, f12 * 1.0f);
            bVarM.f34958d.h(iVar2, f12 * (-1.0f));
            bVarM.f34958d.h(iVar3, (-1.0f) * f10);
            bVarM.f34958d.h(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                bVarM.f34956b = (i11 * f10) + ((-i10) * f12);
            }
        }
        if (i12 != 8) {
            bVarM.c(this, i12);
        }
        c(bVarM);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01c8  */
    public void c(b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        i iVarI;
        f fVar = f34965r;
        if (fVar != null) {
            fVar.f34987f++;
            if (bVar.f34959e) {
                fVar.f34988g++;
            }
        }
        boolean z13 = true;
        if (this.f34976j + 1 >= this.f34977k || this.f34975i + 1 >= this.f34971e) {
            p();
        }
        if (bVar.f34959e) {
            z10 = false;
        } else {
            if (this.f34972f.length != 0) {
                boolean z14 = false;
                while (!z14) {
                    int iB = bVar.f34958d.b();
                    for (int i10 = 0; i10 < iB; i10++) {
                        i iVarC = bVar.f34958d.c(i10);
                        if (iVarC.f35020f != -1 || iVarC.f35023i) {
                            bVar.f34957c.add(iVarC);
                        }
                    }
                    int size = bVar.f34957c.size();
                    if (size > 0) {
                        for (int i11 = 0; i11 < size; i11++) {
                            i iVar = bVar.f34957c.get(i11);
                            if (iVar.f35023i) {
                                bVar.k(this, iVar, true);
                            } else {
                                bVar.l(this, this.f34972f[iVar.f35020f], true);
                            }
                        }
                        bVar.f34957c.clear();
                    } else {
                        z14 = true;
                    }
                }
                if (bVar.f34955a != null && bVar.f34958d.b() == 0) {
                    bVar.f34959e = true;
                    this.f34967a = true;
                }
            }
            if (bVar.isEmpty()) {
                return;
            }
            float f10 = bVar.f34956b;
            if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                bVar.f34956b = f10 * (-1.0f);
                bVar.f34958d.d();
            }
            int iB2 = bVar.f34958d.b();
            float f11 = 0.0f;
            float f12 = 0.0f;
            i iVar2 = null;
            i iVar3 = null;
            boolean zH = false;
            boolean zH2 = false;
            for (int i12 = 0; i12 < iB2; i12++) {
                float fE = bVar.f34958d.e(i12);
                i iVarC2 = bVar.f34958d.c(i12);
                if (iVarC2.f35026l == i.a.UNRESTRICTED) {
                    if (iVar2 == null || f11 > fE) {
                        zH = bVar.h(iVarC2);
                    } else if (!zH && bVar.h(iVarC2)) {
                        zH = true;
                    }
                    f11 = fE;
                    iVar2 = iVarC2;
                } else if (iVar2 == null && fE < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    if (iVar3 == null || f12 > fE) {
                        zH2 = bVar.h(iVarC2);
                    } else if (!zH2 && bVar.h(iVarC2)) {
                        zH2 = true;
                    }
                    f12 = fE;
                    iVar3 = iVarC2;
                }
            }
            if (iVar2 == null) {
                iVar2 = iVar3;
            }
            if (iVar2 == null) {
                z11 = true;
            } else {
                bVar.j(iVar2);
                z11 = false;
            }
            if (bVar.f34958d.b() == 0) {
                bVar.f34959e = true;
            }
            if (z11) {
                f fVar2 = f34965r;
                if (fVar2 != null) {
                    fVar2.f34995n++;
                }
                if (this.f34975i + 1 >= this.f34971e) {
                    p();
                }
                i iVarA = a(i.a.SLACK, null);
                int i13 = this.f34968b + 1;
                this.f34968b = i13;
                this.f34975i++;
                iVarA.f35019e = i13;
                this.f34978l.f34962c[i13] = iVarA;
                bVar.f34955a = iVarA;
                int i14 = this.f34976j;
                i(bVar);
                if (this.f34976j == i14 + 1) {
                    b bVar2 = (b) this.f34981o;
                    Objects.requireNonNull(bVar2);
                    bVar2.f34955a = null;
                    bVar2.f34958d.clear();
                    for (int i15 = 0; i15 < bVar.f34958d.b(); i15++) {
                        bVar2.f34958d.j(bVar.f34958d.c(i15), bVar.f34958d.e(i15), true);
                    }
                    s(this.f34981o);
                    if (iVarA.f35020f == -1) {
                        if (bVar.f34955a == iVarA && (iVarI = bVar.i(null, iVarA)) != null) {
                            f fVar3 = f34965r;
                            if (fVar3 != null) {
                                fVar3.f34991j++;
                            }
                            bVar.j(iVarI);
                        }
                        if (!bVar.f34959e) {
                            bVar.f34955a.e(this, bVar);
                        }
                        this.f34978l.f34960a.b(bVar);
                        this.f34976j--;
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            i iVar4 = bVar.f34955a;
            if (iVar4 == null || (iVar4.f35026l != i.a.UNRESTRICTED && bVar.f34956b < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD)) {
                z13 = false;
            }
            if (!z13) {
                return;
            } else {
                z10 = z12;
            }
        }
        if (z10) {
            return;
        }
        i(bVar);
    }

    public b d(i iVar, i iVar2, int i10, int i11) {
        if (i11 == 8 && iVar2.f35023i && iVar.f35020f == -1) {
            iVar.d(this, iVar2.f35022h + i10);
            return null;
        }
        b bVarM = m();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            bVarM.f34956b = i10;
        }
        if (z10) {
            bVarM.f34958d.h(iVar, 1.0f);
            bVarM.f34958d.h(iVar2, -1.0f);
        } else {
            bVarM.f34958d.h(iVar, -1.0f);
            bVarM.f34958d.h(iVar2, 1.0f);
        }
        if (i11 != 8) {
            bVarM.c(this, i11);
        }
        c(bVarM);
        return bVarM;
    }

    public void e(i iVar, int i10) {
        b bVarM;
        b.a aVar;
        float f10;
        int i11 = iVar.f35020f;
        if (i11 == -1) {
            iVar.d(this, i10);
            for (int i12 = 0; i12 < this.f34968b + 1; i12++) {
                i iVar2 = this.f34978l.f34962c[i12];
            }
            return;
        }
        if (i11 != -1) {
            b bVar = this.f34972f[i11];
            if (!bVar.f34959e) {
                if (bVar.f34958d.b() == 0) {
                    bVar.f34959e = true;
                } else {
                    bVarM = m();
                    if (i10 < 0) {
                        bVarM.f34956b = i10 * (-1);
                        aVar = bVarM.f34958d;
                        f10 = 1.0f;
                    } else {
                        bVarM.f34956b = i10;
                        aVar = bVarM.f34958d;
                        f10 = -1.0f;
                    }
                    aVar.h(iVar, f10);
                }
            }
            bVar.f34956b = i10;
            return;
        }
        bVarM = m();
        bVarM.f34955a = iVar;
        float f11 = i10;
        iVar.f35022h = f11;
        bVarM.f34956b = f11;
        bVarM.f34959e = true;
        c(bVarM);
    }

    public void f(i iVar, i iVar2, int i10, int i11) {
        b bVarM = m();
        i iVarN = n();
        iVarN.f35021g = 0;
        bVarM.e(iVar, iVar2, iVarN, i10);
        if (i11 != 8) {
            bVarM.f34958d.h(k(i11, null), (int) (bVarM.f34958d.g(iVarN) * (-1.0f)));
        }
        c(bVarM);
    }

    public void g(i iVar, i iVar2, int i10, int i11) {
        b bVarM = m();
        i iVarN = n();
        iVarN.f35021g = 0;
        bVarM.f(iVar, iVar2, iVarN, i10);
        if (i11 != 8) {
            bVarM.f34958d.h(k(i11, null), (int) (bVarM.f34958d.g(iVarN) * (-1.0f)));
        }
        c(bVarM);
    }

    public void h(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        b bVarM = m();
        bVarM.d(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarM.c(this, i10);
        }
        c(bVarM);
    }

    public final void i(b bVar) {
        int i10;
        if (bVar.f34959e) {
            bVar.f34955a.d(this, bVar.f34956b);
        } else {
            b[] bVarArr = this.f34972f;
            int i11 = this.f34976j;
            bVarArr[i11] = bVar;
            i iVar = bVar.f34955a;
            iVar.f35020f = i11;
            this.f34976j = i11 + 1;
            iVar.e(this, bVar);
        }
        if (this.f34967a) {
            int i12 = 0;
            while (i12 < this.f34976j) {
                if (this.f34972f[i12] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f34972f;
                if (bVarArr2[i12] != null && bVarArr2[i12].f34959e) {
                    b bVar2 = bVarArr2[i12];
                    bVar2.f34955a.d(this, bVar2.f34956b);
                    this.f34978l.f34960a.b(bVar2);
                    this.f34972f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f34976j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr3 = this.f34972f;
                        int i15 = i13 - 1;
                        bVarArr3[i15] = bVarArr3[i13];
                        if (bVarArr3[i15].f34955a.f35020f == i13) {
                            bVarArr3[i15].f34955a.f35020f = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f34972f[i14] = null;
                    }
                    this.f34976j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f34967a = false;
        }
    }

    public final void j() {
        for (int i10 = 0; i10 < this.f34976j; i10++) {
            b bVar = this.f34972f[i10];
            bVar.f34955a.f35022h = bVar.f34956b;
        }
    }

    public i k(int i10, String str) {
        f fVar = f34965r;
        if (fVar != null) {
            fVar.f34993l++;
        }
        if (this.f34975i + 1 >= this.f34971e) {
            p();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f34968b + 1;
        this.f34968b = i11;
        this.f34975i++;
        iVarA.f35019e = i11;
        iVarA.f35021g = i10;
        this.f34978l.f34962c[i11] = iVarA;
        this.f34969c.a(iVarA);
        return iVarA;
    }

    public i l(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f34975i + 1 >= this.f34971e) {
            p();
        }
        if (obj instanceof v.d) {
            v.d dVar = (v.d) obj;
            iVar = dVar.f36573i;
            if (iVar == null) {
                dVar.l();
                iVar = dVar.f36573i;
            }
            int i10 = iVar.f35019e;
            if (i10 == -1 || i10 > this.f34968b || this.f34978l.f34962c[i10] == null) {
                if (i10 != -1) {
                    iVar.c();
                }
                int i11 = this.f34968b + 1;
                this.f34968b = i11;
                this.f34975i++;
                iVar.f35019e = i11;
                iVar.f35026l = i.a.UNRESTRICTED;
                this.f34978l.f34962c[i11] = iVar;
            }
        }
        return iVar;
    }

    public b m() {
        b bVar = (b) this.f34978l.f34960a.a();
        if (bVar == null) {
            bVar = new b(this.f34978l);
            f34966s++;
        } else {
            bVar.f34955a = null;
            bVar.f34958d.clear();
            bVar.f34956b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            bVar.f34959e = false;
        }
        i.f35016p++;
        return bVar;
    }

    public i n() {
        f fVar = f34965r;
        if (fVar != null) {
            fVar.f34994m++;
        }
        if (this.f34975i + 1 >= this.f34971e) {
            p();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f34968b + 1;
        this.f34968b = i10;
        this.f34975i++;
        iVarA.f35019e = i10;
        this.f34978l.f34962c[i10] = iVarA;
        return iVarA;
    }

    public int o(Object obj) {
        i iVar = ((v.d) obj).f36573i;
        if (iVar != null) {
            return (int) (iVar.f35022h + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i10 = this.f34970d * 2;
        this.f34970d = i10;
        this.f34972f = (b[]) Arrays.copyOf(this.f34972f, i10);
        c cVar = this.f34978l;
        cVar.f34962c = (i[]) Arrays.copyOf(cVar.f34962c, this.f34970d);
        int i11 = this.f34970d;
        this.f34974h = new boolean[i11];
        this.f34971e = i11;
        this.f34977k = i11;
        f fVar = f34965r;
        if (fVar != null) {
            fVar.f34985d++;
            fVar.f34996o = Math.max(fVar.f34996o, i11);
            f fVar2 = f34965r;
            long j10 = fVar2.f34996o;
            Objects.requireNonNull(fVar2);
        }
    }

    public void q() throws Exception {
        f fVar = f34965r;
        if (fVar != null) {
            fVar.f34986e++;
        }
        if (this.f34969c.isEmpty()) {
            j();
            return;
        }
        if (this.f34973g) {
            f fVar2 = f34965r;
            if (fVar2 != null) {
                fVar2.f34998q++;
            }
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f34976j) {
                    z10 = true;
                    break;
                } else if (!this.f34972f[i10].f34959e) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                f fVar3 = f34965r;
                if (fVar3 != null) {
                    fVar3.f34997p++;
                }
                j();
                return;
            }
        }
        r(this.f34969c);
    }

    public void r(a aVar) throws Exception {
        float f10;
        int i10;
        boolean z10;
        long j10;
        f fVar = f34965r;
        long j11 = 1;
        if (fVar != null) {
            fVar.f35001t++;
            fVar.f35002u = Math.max(fVar.f35002u, this.f34975i);
            f fVar2 = f34965r;
            fVar2.f35003v = Math.max(fVar2.f35003v, this.f34976j);
        }
        int i11 = 0;
        while (true) {
            int i12 = this.f34976j;
            f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            i10 = 1;
            if (i11 >= i12) {
                z10 = false;
                break;
            }
            b[] bVarArr = this.f34972f;
            if (bVarArr[i11].f34955a.f35026l != i.a.UNRESTRICTED && bVarArr[i11].f34956b < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            boolean z11 = false;
            int i13 = 0;
            while (!z11) {
                f fVar3 = f34965r;
                if (fVar3 != null) {
                    fVar3.f34992k += j11;
                }
                i13 += i10;
                float f11 = Float.MAX_VALUE;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                int i17 = 0;
                while (i16 < this.f34976j) {
                    b bVar = this.f34972f[i16];
                    if (bVar.f34955a.f35026l != i.a.UNRESTRICTED && !bVar.f34959e && bVar.f34956b < f10) {
                        int iB = bVar.f34958d.b();
                        int i18 = 0;
                        while (i18 < iB) {
                            i iVarC = bVar.f34958d.c(i18);
                            float fG = bVar.f34958d.g(iVarC);
                            if (fG > f10) {
                                for (int i19 = 0; i19 < 9; i19++) {
                                    float f12 = iVarC.f35024j[i19] / fG;
                                    if ((f12 < f11 && i19 == i17) || i19 > i17) {
                                        i15 = iVarC.f35019e;
                                        i17 = i19;
                                        f11 = f12;
                                        i14 = i16;
                                    }
                                }
                            }
                            i18++;
                            f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                        }
                    }
                    i16++;
                    f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
                if (i14 != -1) {
                    b bVar2 = this.f34972f[i14];
                    bVar2.f34955a.f35020f = -1;
                    f fVar4 = f34965r;
                    if (fVar4 != null) {
                        j10 = 1;
                        fVar4.f34991j++;
                    } else {
                        j10 = 1;
                    }
                    bVar2.j(this.f34978l.f34962c[i15]);
                    i iVar = bVar2.f34955a;
                    iVar.f35020f = i14;
                    iVar.e(this, bVar2);
                } else {
                    j10 = 1;
                    z11 = true;
                }
                if (i13 > this.f34975i / 2) {
                    z11 = true;
                }
                j11 = j10;
                f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                i10 = 1;
            }
        }
        s(aVar);
        j();
    }

    public final int s(a aVar) {
        f fVar = f34965r;
        if (fVar != null) {
            fVar.f34989h++;
        }
        for (int i10 = 0; i10 < this.f34975i; i10++) {
            this.f34974h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            f fVar2 = f34965r;
            if (fVar2 != null) {
                fVar2.f34990i++;
            }
            i11++;
            if (i11 >= this.f34975i * 2) {
                return i11;
            }
            i iVar = ((b) aVar).f34955a;
            if (iVar != null) {
                this.f34974h[iVar.f35019e] = true;
            }
            i iVarB = aVar.b(this, this.f34974h);
            if (iVarB != null) {
                boolean[] zArr = this.f34974h;
                int i12 = iVarB.f35019e;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (iVarB != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f34976j; i14++) {
                    b bVar = this.f34972f[i14];
                    if (bVar.f34955a.f35026l != i.a.UNRESTRICTED && !bVar.f34959e && bVar.f34958d.f(iVarB)) {
                        float fG = bVar.f34958d.g(iVarB);
                        if (fG < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            float f11 = (-bVar.f34956b) / fG;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar2 = this.f34972f[i13];
                    bVar2.f34955a.f35020f = -1;
                    f fVar3 = f34965r;
                    if (fVar3 != null) {
                        fVar3.f34991j++;
                    }
                    bVar2.j(iVarB);
                    i iVar2 = bVar2.f34955a;
                    iVar2.f35020f = i13;
                    iVar2.e(this, bVar2);
                }
            } else {
                z10 = true;
            }
        }
        return i11;
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f34976j; i10++) {
            b bVar = this.f34972f[i10];
            if (bVar != null) {
                this.f34978l.f34960a.b(bVar);
            }
            this.f34972f[i10] = null;
        }
    }

    public void u() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f34978l;
            i[] iVarArr = cVar.f34962c;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.c();
            }
            i10++;
        }
        g gVar = cVar.f34961b;
        i[] iVarArr2 = this.f34979m;
        int length = this.f34980n;
        Objects.requireNonNull(gVar);
        if (length > iVarArr2.length) {
            length = iVarArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            i iVar2 = iVarArr2[i11];
            int i12 = gVar.f35009b;
            Object[] objArr = (Object[]) gVar.f35008a;
            if (i12 < objArr.length) {
                objArr[i12] = iVar2;
                gVar.f35009b = i12 + 1;
            }
        }
        this.f34980n = 0;
        Arrays.fill(this.f34978l.f34962c, (Object) null);
        this.f34968b = 0;
        this.f34969c.clear();
        this.f34975i = 1;
        for (int i13 = 0; i13 < this.f34976j; i13++) {
            b[] bVarArr = this.f34972f;
            if (bVarArr[i13] != null) {
                Objects.requireNonNull(bVarArr[i13]);
            }
        }
        t();
        this.f34976j = 0;
        this.f34981o = new b(this.f34978l);
    }
}
