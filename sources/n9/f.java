package n9;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f33730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9.c f33731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o9.a f33732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f33735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f33736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f33737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f33738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f33739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f33740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f33742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f33743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f33744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f33745p;

    public f(e eVar, p9.c cVar, o9.a aVar) {
        j0.i(eVar, "styleParams");
        j0.i(cVar, "singleIndicatorDrawer");
        j0.i(aVar, "animator");
        this.f33730a = eVar;
        this.f33731b = cVar;
        this.f33732c = aVar;
        this.f33735f = eVar.f33727c.b().b();
        this.f33736g = eVar.f33727c.b().b() / 2;
        this.f33738i = 1.0f;
        this.f33745p = this.f33734e - 1;
    }

    public final void a(int i10, float f10) {
        float fD;
        int i11 = this.f33733d;
        int i12 = this.f33734e;
        float f11 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        if (i11 > i12) {
            int i13 = i12 / 2;
            int i14 = (i11 - (i12 / 2)) - (i12 % 2);
            float f12 = i12 % 2 == 0 ? this.f33737h / 2 : 0.0f;
            if (i11 > i12) {
                if (i10 < i13) {
                    fD = d(i13);
                } else if (i10 >= i14) {
                    fD = d(i14);
                } else {
                    float f13 = this.f33736g;
                    float f14 = this.f33737h;
                    f11 = (((f14 * f10) + ((i10 * f14) + f13)) - (this.f33739j / 2)) - f12;
                }
                f11 = (fD - (this.f33739j / 2)) - f12;
            }
        }
        this.f33743n = f11;
        float f15 = this.f33743n - this.f33736g;
        float f16 = this.f33737h;
        int i15 = (int) (f15 / f16);
        if (i15 < 0) {
            i15 = 0;
        }
        this.f33744o = i15;
        int i16 = (int) ((this.f33739j / f16) + i15 + 1);
        int i17 = this.f33733d - 1;
        if (i16 > i17) {
            i16 = i17;
        }
        this.f33745p = i16;
    }

    public final void b() {
        int iB;
        e eVar = this.f33730a;
        b bVar = eVar.f33729e;
        if (bVar instanceof b.a) {
            iB = (int) ((this.f33739j - eVar.f33726b.b().b()) / ((b.a) bVar).f33712a);
        } else {
            if (!(bVar instanceof b.C0368b)) {
                throw new jc.g();
            }
            iB = ((b.C0368b) bVar).f33714b;
        }
        int i10 = this.f33733d;
        if (iB > i10) {
            iB = i10;
        }
        this.f33734e = iB;
    }

    public final void c(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.f33739j = i10;
        this.f33740k = i11;
        b();
        e eVar = this.f33730a;
        b bVar = eVar.f33729e;
        if (bVar instanceof b.a) {
            this.f33737h = ((b.a) bVar).f33712a;
            this.f33738i = 1.0f;
        } else if (bVar instanceof b.C0368b) {
            float f10 = this.f33739j;
            float f11 = ((b.C0368b) bVar).f33713a;
            float f12 = (f10 + f11) / this.f33734e;
            this.f33737h = f12;
            this.f33738i = (f12 - f11) / eVar.f33726b.b().b();
        }
        this.f33732c.b(this.f33737h);
        this.f33736g = (i10 - (this.f33737h * (this.f33734e - 1))) / 2.0f;
        this.f33735f = i11 / 2.0f;
        a(this.f33741l, this.f33742m);
    }

    public final float d(int i10) {
        return (this.f33737h * i10) + this.f33736g;
    }
}
