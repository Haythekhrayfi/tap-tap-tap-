package r;

import androidx.activity.k;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f34958d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f34955a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f34956b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<i> f34957c = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34959e = false;

    public interface a {
        float a(b bVar, boolean z10);

        int b();

        i c(int i10);

        void clear();

        void d();

        float e(int i10);

        boolean f(i iVar);

        float g(i iVar);

        void h(i iVar, float f10);

        float i(i iVar, boolean z10);

        void j(i iVar, float f10, boolean z10);

        void k(float f10);
    }

    public b() {
    }

    public b(c cVar) {
        this.f34958d = new r.a(this, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0021  */
    @Override // r.d.a
    public void a(i iVar) {
        float f10;
        int i10 = iVar.f35021g;
        if (i10 == 1) {
            f10 = 1.0f;
        } else if (i10 == 2) {
            f10 = 1000.0f;
        } else if (i10 == 3) {
            f10 = 1000000.0f;
        } else if (i10 == 4) {
            f10 = 1.0E9f;
        } else if (i10 == 5) {
            f10 = 1.0E12f;
        } else {
            f10 = 1.0f;
        }
        this.f34958d.h(iVar, f10);
    }

    @Override // r.d.a
    public i b(d dVar, boolean[] zArr) {
        return i(zArr, null);
    }

    public b c(d dVar, int i10) {
        this.f34958d.h(dVar.k(i10, "ep"), 1.0f);
        this.f34958d.h(dVar.k(i10, "em"), -1.0f);
        return this;
    }

    @Override // r.d.a
    public void clear() {
        this.f34958d.clear();
        this.f34955a = null;
        this.f34956b = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public b d(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f34958d.h(iVar, -1.0f);
        this.f34958d.h(iVar2, 1.0f);
        this.f34958d.h(iVar3, f10);
        this.f34958d.h(iVar4, -f10);
        return this;
    }

    public b e(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f34956b = i10;
        }
        if (z10) {
            this.f34958d.h(iVar, 1.0f);
            this.f34958d.h(iVar2, -1.0f);
            this.f34958d.h(iVar3, -1.0f);
        } else {
            this.f34958d.h(iVar, -1.0f);
            this.f34958d.h(iVar2, 1.0f);
            this.f34958d.h(iVar3, 1.0f);
        }
        return this;
    }

    public b f(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f34956b = i10;
        }
        if (z10) {
            this.f34958d.h(iVar, 1.0f);
            this.f34958d.h(iVar2, -1.0f);
            this.f34958d.h(iVar3, 1.0f);
        } else {
            this.f34958d.h(iVar, -1.0f);
            this.f34958d.h(iVar2, 1.0f);
            this.f34958d.h(iVar3, -1.0f);
        }
        return this;
    }

    public b g(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f34958d.h(iVar3, 0.5f);
        this.f34958d.h(iVar4, 0.5f);
        this.f34958d.h(iVar, -0.5f);
        this.f34958d.h(iVar2, -0.5f);
        this.f34956b = -f10;
        return this;
    }

    public final boolean h(i iVar) {
        return iVar.f35029o <= 1;
    }

    public final i i(boolean[] zArr, i iVar) {
        i.a aVar;
        int iB = this.f34958d.b();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iB; i10++) {
            float fE = this.f34958d.e(i10);
            if (fE < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                i iVarC = this.f34958d.c(i10);
                if ((zArr == null || !zArr[iVarC.f35019e]) && iVarC != iVar && (((aVar = iVarC.f35026l) == i.a.SLACK || aVar == i.a.ERROR) && fE < f10)) {
                    f10 = fE;
                    iVar2 = iVarC;
                }
            }
        }
        return iVar2;
    }

    @Override // r.d.a
    public boolean isEmpty() {
        return this.f34955a == null && this.f34956b == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && this.f34958d.b() == 0;
    }

    public void j(i iVar) {
        i iVar2 = this.f34955a;
        if (iVar2 != null) {
            this.f34958d.h(iVar2, -1.0f);
            this.f34955a.f35020f = -1;
            this.f34955a = null;
        }
        float fI = this.f34958d.i(iVar, true) * (-1.0f);
        this.f34955a = iVar;
        if (fI == 1.0f) {
            return;
        }
        this.f34956b /= fI;
        this.f34958d.k(fI);
    }

    public void k(d dVar, i iVar, boolean z10) {
        if (iVar.f35023i) {
            float fG = this.f34958d.g(iVar);
            this.f34956b = (iVar.f35022h * fG) + this.f34956b;
            this.f34958d.i(iVar, z10);
            if (z10) {
                iVar.b(this);
            }
            if (this.f34958d.b() == 0) {
                this.f34959e = true;
                dVar.f34967a = true;
            }
        }
    }

    public void l(d dVar, b bVar, boolean z10) {
        float fA = this.f34958d.a(bVar, z10);
        this.f34956b = (bVar.f34956b * fA) + this.f34956b;
        if (z10) {
            bVar.f34955a.b(this);
        }
        if (this.f34955a == null || this.f34958d.b() != 0) {
            return;
        }
        this.f34959e = true;
        dVar.f34967a = true;
    }

    public String toString() {
        String string;
        boolean z10;
        StringBuilder sbA;
        String str;
        StringBuilder sb2;
        if (this.f34955a == null) {
            string = "0";
        } else {
            StringBuilder sbA2 = defpackage.a.a("");
            sbA2.append(this.f34955a);
            string = sbA2.toString();
        }
        String strA = i.f.a(string, " = ");
        if (this.f34956b != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            StringBuilder sbA3 = defpackage.a.a(strA);
            sbA3.append(this.f34956b);
            strA = sbA3.toString();
            z10 = true;
        } else {
            z10 = false;
        }
        int iB = this.f34958d.b();
        for (int i10 = 0; i10 < iB; i10++) {
            i iVarC = this.f34958d.c(i10);
            if (iVarC != null) {
                float fE = this.f34958d.e(i10);
                if (fE != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                    String string2 = iVarC.toString();
                    if (z10) {
                        sbA = defpackage.a.a(strA);
                        if (fE > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            sbA.append(" + ");
                            strA = sbA.toString();
                        } else {
                            str = " - ";
                            sbA.append(str);
                            strA = sbA.toString();
                            fE *= -1.0f;
                        }
                    } else if (fE < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                        sbA = defpackage.a.a(strA);
                        str = "- ";
                        sbA.append(str);
                        strA = sbA.toString();
                        fE *= -1.0f;
                    }
                    if (fE == 1.0f) {
                        sb2 = new StringBuilder();
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(strA);
                        sb2.append(fE);
                        strA = " ";
                    }
                    strA = k.a(sb2, strA, string2);
                    z10 = true;
                }
            }
        }
        return !z10 ? i.f.a(strA, "0.0") : strA;
    }
}
