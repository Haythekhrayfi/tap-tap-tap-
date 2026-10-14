package r;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class h extends r.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i[] f35010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i[] f35011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f35013i;

    public class a implements Comparator<i> {
        public a(h hVar) {
        }

        @Override // java.util.Comparator
        public int compare(i iVar, i iVar2) {
            return iVar.f35019e - iVar2.f35019e;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f35014a;

        public b(h hVar) {
        }

        public String toString() {
            String string = "[ ";
            if (this.f35014a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder sbA = defpackage.a.a(string);
                    sbA.append(this.f35014a.f35025k[i10]);
                    sbA.append(" ");
                    string = sbA.toString();
                }
            }
            StringBuilder sbA2 = android.support.v4.media.c.a(string, "] ");
            sbA2.append(this.f35014a);
            return sbA2.toString();
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f35010f = new i[128];
        this.f35011g = new i[128];
        this.f35012h = 0;
        this.f35013i = new b(this);
    }

    @Override // r.b, r.d.a
    public void a(i iVar) {
        this.f35013i.f35014a = iVar;
        Arrays.fill(iVar.f35025k, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        iVar.f35025k[iVar.f35021g] = 1.0f;
        m(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    @Override // r.b, r.d.a
    public i b(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f35012h; i11++) {
            i[] iVarArr = this.f35010f;
            i iVar = iVarArr[i11];
            if (!zArr[iVar.f35019e]) {
                b bVar = this.f35013i;
                bVar.f35014a = iVar;
                int i12 = 8;
                boolean z10 = true;
                if (i10 == -1) {
                    while (true) {
                        if (i12 >= 0) {
                            float f10 = bVar.f35014a.f35025k[i12];
                            if (f10 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                if (f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                                    break;
                                }
                                i12--;
                            }
                        }
                        z10 = false;
                        break;
                    }
                    if (z10) {
                        i10 = i11;
                    }
                } else {
                    i iVar2 = iVarArr[i10];
                    while (true) {
                        if (i12 >= 0) {
                            float f11 = iVar2.f35025k[i12];
                            float f12 = bVar.f35014a.f35025k[i12];
                            if (f12 != f11) {
                                if (f12 < f11) {
                                    break;
                                }
                                break;
                            }
                            i12--;
                        }
                        z10 = false;
                        break;
                    }
                    if (z10) {
                        i10 = i11;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f35010f[i10];
    }

    @Override // r.b, r.d.a
    public void clear() {
        this.f35012h = 0;
        this.f34956b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // r.b, r.d.a
    public boolean isEmpty() {
        return this.f35012h == 0;
    }

    @Override // r.b
    public void l(d dVar, r.b bVar, boolean z10) {
        i iVar = bVar.f34955a;
        if (iVar == null) {
            return;
        }
        r.b.a aVar = bVar.f34958d;
        int iB = aVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            i iVarC = aVar.c(i10);
            float fE = aVar.e(i10);
            b bVar2 = this.f35013i;
            bVar2.f35014a = iVarC;
            boolean z11 = true;
            if (iVarC.f35017c) {
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr = bVar2.f35014a.f35025k;
                    fArr[i11] = (iVar.f35025k[i11] * fE) + fArr[i11];
                    if (Math.abs(fArr[i11]) < 1.0E-4f) {
                        bVar2.f35014a.f35025k[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    h.this.n(bVar2.f35014a);
                }
                z11 = false;
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f10 = iVar.f35025k[i12];
                    if (f10 != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        float f11 = f10 * fE;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        bVar2.f35014a.f35025k[i12] = f11;
                    } else {
                        bVar2.f35014a.f35025k[i12] = 0.0f;
                    }
                }
            }
            if (z11) {
                m(iVarC);
            }
            this.f34956b = (bVar.f34956b * fE) + this.f34956b;
        }
        n(iVar);
    }

    public final void m(i iVar) {
        int i10;
        int i11 = this.f35012h + 1;
        i[] iVarArr = this.f35010f;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f35010f = iVarArr2;
            this.f35011g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f35010f;
        int i12 = this.f35012h;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f35012h = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f35019e > iVar.f35019e) {
            int i14 = 0;
            while (true) {
                i10 = this.f35012h;
                if (i14 >= i10) {
                    break;
                }
                this.f35011g[i14] = this.f35010f[i14];
                i14++;
            }
            Arrays.sort(this.f35011g, 0, i10, new a(this));
            for (int i15 = 0; i15 < this.f35012h; i15++) {
                this.f35010f[i15] = this.f35011g[i15];
            }
        }
        iVar.f35017c = true;
        iVar.a(this);
    }

    public final void n(i iVar) {
        int i10 = 0;
        while (i10 < this.f35012h) {
            if (this.f35010f[i10] == iVar) {
                while (true) {
                    int i11 = this.f35012h;
                    if (i10 >= i11 - 1) {
                        this.f35012h = i11 - 1;
                        iVar.f35017c = false;
                        return;
                    } else {
                        i[] iVarArr = this.f35010f;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // r.b
    public String toString() {
        StringBuilder sbA = android.support.v4.media.c.a("", " goal -> (");
        sbA.append(this.f34956b);
        sbA.append(") : ");
        String string = sbA.toString();
        for (int i10 = 0; i10 < this.f35012h; i10++) {
            this.f35013i.f35014a = this.f35010f[i10];
            StringBuilder sbA2 = defpackage.a.a(string);
            sbA2.append(this.f35013i);
            sbA2.append(" ");
            string = sbA2.toString();
        }
        return string;
    }
}
