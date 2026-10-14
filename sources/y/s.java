package y;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public class s implements Comparable<s> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static String[] f37835t = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t.c f37836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f37838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f37839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f37840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f37841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f37842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f37843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f37844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f37847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n f37848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> f37849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f37850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double[] f37851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public double[] f37852s;

    public s() {
        this.f37837d = 0;
        this.f37844k = Float.NaN;
        this.f37845l = -1;
        this.f37846m = -1;
        this.f37847n = Float.NaN;
        this.f37848o = null;
        this.f37849p = new LinkedHashMap<>();
        this.f37850q = 0;
        this.f37851r = new double[18];
        this.f37852s = new double[18];
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    public s(int i10, int i11, h hVar, s sVar, s sVar2) {
        float f10;
        int i12;
        float fA;
        float fMin;
        this.f37837d = 0;
        this.f37844k = Float.NaN;
        this.f37845l = -1;
        this.f37846m = -1;
        this.f37847n = Float.NaN;
        this.f37848o = null;
        this.f37849p = new LinkedHashMap<>();
        this.f37850q = 0;
        this.f37851r = new double[18];
        this.f37852s = new double[18];
        if (sVar.f37846m != -1) {
            float f11 = hVar.f37610a / 100.0f;
            this.f37838e = f11;
            this.f37837d = hVar.f37657i;
            this.f37850q = hVar.f37664p;
            float f12 = Float.isNaN(hVar.f37658j) ? f11 : hVar.f37658j;
            float f13 = Float.isNaN(hVar.f37659k) ? f11 : hVar.f37659k;
            float f14 = sVar2.f37842i;
            float f15 = sVar.f37842i;
            float f16 = sVar2.f37843j;
            float f17 = sVar.f37843j;
            this.f37839f = this.f37838e;
            this.f37842i = (int) (((f14 - f15) * f12) + f15);
            this.f37843j = (int) (((f16 - f17) * f13) + f17);
            int i13 = hVar.f37664p;
            if (i13 != 1) {
                if (i13 != 2) {
                    float f18 = Float.isNaN(hVar.f37660l) ? f11 : hVar.f37660l;
                    float f19 = sVar2.f37840g;
                    float f20 = sVar.f37840g;
                    this.f37840g = w.e.a(f19, f20, f18, f20);
                    if (!Float.isNaN(hVar.f37661m)) {
                        f11 = hVar.f37661m;
                    }
                } else {
                    if (Float.isNaN(hVar.f37660l)) {
                        float f21 = sVar2.f37840g;
                        float f22 = sVar.f37840g;
                        fMin = w.e.a(f21, f22, f11, f22);
                    } else {
                        fMin = hVar.f37660l * Math.min(f13, f12);
                    }
                    this.f37840g = fMin;
                    if (!Float.isNaN(hVar.f37661m)) {
                        fA = hVar.f37661m;
                    }
                }
                float f23 = sVar2.f37841h;
                float f24 = sVar.f37841h;
                fA = w.e.a(f23, f24, f11, f24);
            } else {
                float f25 = Float.isNaN(hVar.f37660l) ? f11 : hVar.f37660l;
                float f26 = sVar2.f37840g;
                float f27 = sVar.f37840g;
                this.f37840g = w.e.a(f26, f27, f25, f27);
                if (!Float.isNaN(hVar.f37661m)) {
                    f11 = hVar.f37661m;
                }
                float f28 = sVar2.f37841h;
                float f29 = sVar.f37841h;
                fA = w.e.a(f28, f29, f11, f29);
            }
            this.f37841h = fA;
            this.f37846m = sVar.f37846m;
            this.f37836c = t.c.c(hVar.f37655g);
            this.f37845l = hVar.f37656h;
            return;
        }
        int i14 = hVar.f37664p;
        if (i14 == 1) {
            float f30 = hVar.f37610a / 100.0f;
            this.f37838e = f30;
            this.f37837d = hVar.f37657i;
            float f31 = Float.isNaN(hVar.f37658j) ? f30 : hVar.f37658j;
            float f32 = Float.isNaN(hVar.f37659k) ? f30 : hVar.f37659k;
            float f33 = sVar2.f37842i - sVar.f37842i;
            float f34 = sVar2.f37843j - sVar.f37843j;
            this.f37839f = this.f37838e;
            f30 = Float.isNaN(hVar.f37660l) ? f30 : hVar.f37660l;
            float f35 = sVar.f37840g;
            float f36 = sVar.f37842i;
            float f37 = sVar.f37841h;
            float f38 = sVar.f37843j;
            float f39 = ((sVar2.f37842i / 2.0f) + sVar2.f37840g) - ((f36 / 2.0f) + f35);
            float f40 = ((sVar2.f37843j / 2.0f) + sVar2.f37841h) - ((f38 / 2.0f) + f37);
            float f41 = f39 * f30;
            float f42 = f33 * f31;
            float f43 = f42 / 2.0f;
            this.f37840g = (int) ((f35 + f41) - f43);
            float f44 = f30 * f40;
            float f45 = f34 * f32;
            float f46 = f45 / 2.0f;
            this.f37841h = (int) ((f37 + f44) - f46);
            this.f37842i = (int) (f36 + f42);
            this.f37843j = (int) (f38 + f45);
            float f47 = Float.isNaN(hVar.f37661m) ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : hVar.f37661m;
            this.f37850q = 1;
            float f48 = (int) ((sVar.f37840g + f41) - f43);
            this.f37840g = f48;
            float f49 = (int) ((sVar.f37841h + f44) - f46);
            this.f37841h = f49;
            this.f37840g = f48 + ((-f40) * f47);
            this.f37841h = f49 + (f39 * f47);
            this.f37846m = this.f37846m;
            this.f37836c = t.c.c(hVar.f37655g);
            this.f37845l = hVar.f37656h;
            return;
        }
        if (i14 == 2) {
            float f50 = hVar.f37610a / 100.0f;
            this.f37838e = f50;
            this.f37837d = hVar.f37657i;
            float f51 = Float.isNaN(hVar.f37658j) ? f50 : hVar.f37658j;
            float f52 = Float.isNaN(hVar.f37659k) ? f50 : hVar.f37659k;
            float f53 = sVar2.f37842i;
            float f54 = sVar.f37842i;
            float f55 = f53 - f54;
            float f56 = sVar2.f37843j;
            float f57 = sVar.f37843j;
            float f58 = f56 - f57;
            this.f37839f = this.f37838e;
            float f59 = sVar.f37840g;
            float f60 = sVar.f37841h;
            float f61 = (f53 / 2.0f) + sVar2.f37840g;
            float f62 = (f56 / 2.0f) + sVar2.f37841h;
            float f63 = f55 * f51;
            this.f37840g = (int) ((((f61 - ((f54 / 2.0f) + f59)) * f50) + f59) - (f63 / 2.0f));
            float f64 = f58 * f52;
            this.f37841h = (int) ((((f62 - ((f57 / 2.0f) + f60)) * f50) + f60) - (f64 / 2.0f));
            this.f37842i = (int) (f54 + f63);
            this.f37843j = (int) (f57 + f64);
            this.f37850q = 2;
            if (!Float.isNaN(hVar.f37660l)) {
                this.f37840g = (int) (hVar.f37660l * ((int) (i10 - this.f37842i)));
            }
            if (!Float.isNaN(hVar.f37661m)) {
                this.f37841h = (int) (hVar.f37661m * ((int) (i11 - this.f37843j)));
            }
            this.f37846m = this.f37846m;
            this.f37836c = t.c.c(hVar.f37655g);
            this.f37845l = hVar.f37656h;
            return;
        }
        float f65 = hVar.f37610a / 100.0f;
        this.f37838e = f65;
        this.f37837d = hVar.f37657i;
        float f66 = Float.isNaN(hVar.f37658j) ? f65 : hVar.f37658j;
        float f67 = Float.isNaN(hVar.f37659k) ? f65 : hVar.f37659k;
        float f68 = sVar2.f37842i;
        float f69 = sVar.f37842i;
        float f70 = f68 - f69;
        float f71 = sVar2.f37843j;
        float f72 = sVar.f37843j;
        float f73 = f71 - f72;
        this.f37839f = this.f37838e;
        float f74 = sVar.f37840g;
        float f75 = sVar.f37841h;
        float f76 = ((f68 / 2.0f) + sVar2.f37840g) - ((f69 / 2.0f) + f74);
        float f77 = ((f71 / 2.0f) + sVar2.f37841h) - ((f72 / 2.0f) + f75);
        float f78 = f70 * f66;
        float f79 = f78 / 2.0f;
        this.f37840g = (int) (((f76 * f65) + f74) - f79);
        float f80 = (f77 * f65) + f75;
        float f81 = f73 * f67;
        float f82 = f81 / 2.0f;
        this.f37841h = (int) (f80 - f82);
        this.f37842i = (int) (f69 + f78);
        this.f37843j = (int) (f72 + f81);
        float f83 = Float.isNaN(hVar.f37660l) ? f65 : hVar.f37660l;
        float f84 = Float.isNaN(hVar.f37663o) ? StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD : hVar.f37663o;
        f65 = Float.isNaN(hVar.f37661m) ? f65 : hVar.f37661m;
        if (Float.isNaN(hVar.f37662n)) {
            i12 = 0;
            f10 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        } else {
            f10 = hVar.f37662n;
            i12 = 0;
        }
        this.f37850q = i12;
        this.f37840g = (int) (((f10 * f77) + ((f83 * f76) + sVar.f37840g)) - f79);
        this.f37841h = (int) (((f77 * f65) + ((f76 * f84) + sVar.f37841h)) - f82);
        this.f37836c = t.c.c(hVar.f37655g);
        this.f37845l = hVar.f37656h;
    }

    public void a(androidx.constraintlayout.widget.c.a aVar) {
        this.f37836c = t.c.c(aVar.f1513d.f1577d);
        androidx.constraintlayout.widget.c.C0027c c0027c = aVar.f1513d;
        this.f37845l = c0027c.f1578e;
        this.f37846m = c0027c.f1575b;
        this.f37844k = c0027c.f1582i;
        this.f37837d = c0027c.f1579f;
        int i10 = c0027c.f1576c;
        float f10 = aVar.f1512c.f1592e;
        this.f37847n = aVar.f1514e.C;
        for (String str : aVar.f1516g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = aVar.f1516g.get(str);
            if (aVar2 != null && aVar2.c()) {
                this.f37849p.put(str, aVar2);
            }
        }
    }

    public final boolean b(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void c(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fA = this.f37840g;
        float fCos = this.f37841h;
        float f10 = this.f37842i;
        float f11 = this.f37843j;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fA = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        n nVar = this.f37848o;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.b(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fA;
            double d13 = fCos;
            fA = (float) (androidx.appcompat.app.w.a(d13, d12, d11) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (Math.cos(d13) * d12)) - ((double) (f11 / 2.0f)));
        }
        fArr[i10] = (f10 / 2.0f) + fA + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        fArr[i10 + 1] = (f11 / 2.0f) + fCos + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // java.lang.Comparable
    public int compareTo(s sVar) {
        return Float.compare(this.f37839f, sVar.f37839f);
    }

    public void d(float f10, float f11, float f12, float f13) {
        this.f37840g = f10;
        this.f37841h = f11;
        this.f37842i = f12;
        this.f37843j = f13;
    }

    public void e(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD * f13) / 2.0f);
        float f18 = f14 - ((StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD * f15) / 2.0f);
        fArr[0] = (((f13 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
        fArr[1] = (((f15 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public void f(n nVar, s sVar) {
        double d10 = (((this.f37842i / 2.0f) + this.f37840g) - sVar.f37840g) - (sVar.f37842i / 2.0f);
        double d11 = (((this.f37843j / 2.0f) + this.f37841h) - sVar.f37841h) - (sVar.f37843j / 2.0f);
        this.f37848o = nVar;
        this.f37840g = (float) Math.hypot(d11, d10);
        this.f37841h = (float) (Float.isNaN(this.f37847n) ? Math.atan2(d11, d10) + 1.5707963267948966d : Math.toRadians(this.f37847n));
    }
}
