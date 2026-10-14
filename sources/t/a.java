package t;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f35540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0414a[] f35541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35542c = true;

    /* JADX INFO: renamed from: t.a$a, reason: collision with other inner class name */
    public static class C0414a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static double[] f35543s = new double[91];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double[] f35544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f35545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f35546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f35547d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f35548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f35549f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public double f35550g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f35551h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f35552i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f35553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public double f35554k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public double f35555l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public double f35556m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public double f35557n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public double f35558o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public double f35559p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f35560q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f35561r;

        public C0414a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            double d16 = d12;
            this.f35561r = false;
            this.f35560q = i10 == 1;
            this.f35546c = d10;
            this.f35547d = d11;
            this.f35552i = 1.0d / (d11 - d10);
            if (3 == i10) {
                this.f35561r = true;
            }
            double d17 = d14 - d16;
            double d18 = d15 - d13;
            if (this.f35561r || Math.abs(d17) < 0.001d || Math.abs(d18) < 0.001d) {
                this.f35561r = true;
                this.f35548e = d16;
                this.f35549f = d14;
                this.f35550g = d13;
                this.f35551h = d15;
                double dHypot = Math.hypot(d18, d17);
                this.f35545b = dHypot;
                this.f35557n = dHypot * this.f35552i;
                double d19 = this.f35547d;
                double d20 = this.f35546c;
                this.f35555l = d17 / (d19 - d20);
                this.f35556m = d18 / (d19 - d20);
                return;
            }
            this.f35544a = new double[101];
            boolean z10 = this.f35560q;
            this.f35553j = ((double) (z10 ? -1 : 1)) * d17;
            this.f35554k = d18 * ((double) (z10 ? 1 : -1));
            this.f35555l = z10 ? d14 : d16;
            this.f35556m = z10 ? d13 : d15;
            double d21 = d13 - d15;
            int i11 = 0;
            double dHypot2 = 0.0d;
            double d22 = 0.0d;
            double d23 = 0.0d;
            while (true) {
                double[] dArr = f35543s;
                if (i11 >= dArr.length) {
                    break;
                }
                double radians = Math.toRadians((((double) i11) * 90.0d) / ((double) (dArr.length - 1)));
                double dSin = Math.sin(radians) * d17;
                double dCos = Math.cos(radians) * d21;
                if (i11 > 0) {
                    dHypot2 += Math.hypot(dSin - d22, dCos - d23);
                    dArr[i11] = dHypot2;
                }
                i11++;
                d23 = dCos;
                d22 = dSin;
            }
            this.f35545b = dHypot2;
            int i12 = 0;
            while (true) {
                double[] dArr2 = f35543s;
                if (i12 >= dArr2.length) {
                    break;
                }
                dArr2[i12] = dArr2[i12] / dHypot2;
                i12++;
            }
            int i13 = 0;
            while (true) {
                double[] dArr3 = this.f35544a;
                if (i13 >= dArr3.length) {
                    this.f35557n = this.f35545b * this.f35552i;
                    return;
                }
                double length = ((double) i13) / ((double) (dArr3.length - 1));
                double[] dArr4 = f35543s;
                int iBinarySearch = Arrays.binarySearch(dArr4, length);
                if (iBinarySearch >= 0) {
                    this.f35544a[i13] = ((double) iBinarySearch) / ((double) (dArr4.length - 1));
                } else if (iBinarySearch == -1) {
                    this.f35544a[i13] = 0.0d;
                } else {
                    int i14 = -iBinarySearch;
                    int i15 = i14 - 2;
                    this.f35544a[i13] = (((length - dArr4[i15]) / (dArr4[i14 - 1] - dArr4[i15])) + ((double) i15)) / ((double) (dArr4.length - 1));
                }
                i13++;
            }
        }

        public double a() {
            double d10 = this.f35553j * this.f35559p;
            double dHypot = this.f35557n / Math.hypot(d10, (-this.f35554k) * this.f35558o);
            if (this.f35560q) {
                d10 = -d10;
            }
            return d10 * dHypot;
        }

        public double b() {
            double d10 = this.f35553j * this.f35559p;
            double d11 = (-this.f35554k) * this.f35558o;
            double dHypot = this.f35557n / Math.hypot(d10, d11);
            return this.f35560q ? (-d11) * dHypot : d11 * dHypot;
        }

        public double c(double d10) {
            double d11 = (d10 - this.f35546c) * this.f35552i;
            double d12 = this.f35548e;
            return ((this.f35549f - d12) * d11) + d12;
        }

        public double d(double d10) {
            double d11 = (d10 - this.f35546c) * this.f35552i;
            double d12 = this.f35550g;
            return ((this.f35551h - d12) * d11) + d12;
        }

        public double e() {
            return (this.f35553j * this.f35558o) + this.f35555l;
        }

        public double f() {
            return (this.f35554k * this.f35559p) + this.f35556m;
        }

        public void g(double d10) {
            double d11 = (this.f35560q ? this.f35547d - d10 : d10 - this.f35546c) * this.f35552i;
            double d12 = 0.0d;
            if (d11 > 0.0d) {
                d12 = 1.0d;
                if (d11 < 1.0d) {
                    double[] dArr = this.f35544a;
                    double length = d11 * ((double) (dArr.length - 1));
                    int i10 = (int) length;
                    d12 = ((dArr[i10 + 1] - dArr[i10]) * (length - ((double) i10))) + dArr[i10];
                }
            }
            double d13 = d12 * 1.5707963267948966d;
            this.f35558o = Math.sin(d13);
            this.f35559p = Math.cos(d13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    public a(int[] iArr, double[] dArr, double[][] dArr2) {
        this.f35540a = dArr;
        this.f35541b = new C0414a[dArr.length - 1];
        int i10 = 1;
        int i11 = 1;
        int i12 = 0;
        while (true) {
            C0414a[] c0414aArr = this.f35541b;
            if (i12 >= c0414aArr.length) {
                return;
            }
            int i13 = iArr[i12];
            if (i13 == 0) {
                i11 = 3;
            } else if (i13 == 1) {
                i10 = 1;
                i11 = i10;
            } else {
                if (i13 != 2) {
                    if (i13 == 3) {
                        if (i10 != 1) {
                            i10 = 1;
                        }
                        i11 = i10;
                    }
                }
                i10 = 2;
                i11 = i10;
            }
            int i14 = i12 + 1;
            c0414aArr[i12] = new C0414a(i11, dArr[i12], dArr[i14], dArr2[i12][0], dArr2[i12][1], dArr2[i14][0], dArr2[i14][1]);
            i12 = i14;
        }
    }

    @Override // t.b
    public double b(double d10, int i10) {
        double dF;
        double dB;
        int i11 = 0;
        if (this.f35542c) {
            C0414a[] c0414aArr = this.f35541b;
            if (d10 < c0414aArr[0].f35546c) {
                double d11 = c0414aArr[0].f35546c;
                double d12 = d10 - c0414aArr[0].f35546c;
                if (c0414aArr[0].f35561r) {
                    if (i10 == 0) {
                        return (d12 * this.f35541b[0].f35555l) + c0414aArr[0].c(d11);
                    }
                    return (d12 * this.f35541b[0].f35556m) + c0414aArr[0].d(d11);
                }
                c0414aArr[0].g(d11);
                if (i10 == 0) {
                    dF = this.f35541b[0].e();
                    dB = this.f35541b[0].a();
                } else {
                    dF = this.f35541b[0].f();
                    dB = this.f35541b[0].b();
                }
                return (dB * d12) + dF;
            }
            if (d10 > c0414aArr[c0414aArr.length - 1].f35547d) {
                double d13 = c0414aArr[c0414aArr.length - 1].f35547d;
                double d14 = d10 - d13;
                int length = c0414aArr.length - 1;
                if (i10 == 0) {
                    return (d14 * this.f35541b[length].f35555l) + c0414aArr[length].c(d13);
                }
                return (d14 * this.f35541b[length].f35556m) + c0414aArr[length].d(d13);
            }
        } else {
            C0414a[] c0414aArr2 = this.f35541b;
            if (d10 < c0414aArr2[0].f35546c) {
                d10 = c0414aArr2[0].f35546c;
            } else if (d10 > c0414aArr2[c0414aArr2.length - 1].f35547d) {
                d10 = c0414aArr2[c0414aArr2.length - 1].f35547d;
            }
        }
        while (true) {
            C0414a[] c0414aArr3 = this.f35541b;
            if (i11 >= c0414aArr3.length) {
                return Double.NaN;
            }
            if (d10 <= c0414aArr3[i11].f35547d) {
                if (c0414aArr3[i11].f35561r) {
                    return i10 == 0 ? c0414aArr3[i11].c(d10) : c0414aArr3[i11].d(d10);
                }
                c0414aArr3[i11].g(d10);
                C0414a[] c0414aArr4 = this.f35541b;
                return i10 == 0 ? c0414aArr4[i11].e() : c0414aArr4[i11].f();
            }
            i11++;
        }
    }

    @Override // t.b
    public void c(double d10, double[] dArr) {
        if (this.f35542c) {
            C0414a[] c0414aArr = this.f35541b;
            if (d10 < c0414aArr[0].f35546c) {
                double d11 = c0414aArr[0].f35546c;
                double d12 = d10 - c0414aArr[0].f35546c;
                if (c0414aArr[0].f35561r) {
                    double dC = c0414aArr[0].c(d11);
                    C0414a[] c0414aArr2 = this.f35541b;
                    dArr[0] = (c0414aArr2[0].f35555l * d12) + dC;
                    dArr[1] = (d12 * this.f35541b[0].f35556m) + c0414aArr2[0].d(d11);
                    return;
                }
                c0414aArr[0].g(d11);
                dArr[0] = (this.f35541b[0].a() * d12) + this.f35541b[0].e();
                dArr[1] = (this.f35541b[0].b() * d12) + this.f35541b[0].f();
                return;
            }
            if (d10 > c0414aArr[c0414aArr.length - 1].f35547d) {
                double d13 = c0414aArr[c0414aArr.length - 1].f35547d;
                double d14 = d10 - d13;
                int length = c0414aArr.length - 1;
                if (c0414aArr[length].f35561r) {
                    double dC2 = c0414aArr[length].c(d13);
                    C0414a[] c0414aArr3 = this.f35541b;
                    dArr[0] = (c0414aArr3[length].f35555l * d14) + dC2;
                    dArr[1] = (d14 * this.f35541b[length].f35556m) + c0414aArr3[length].d(d13);
                    return;
                }
                c0414aArr[length].g(d10);
                dArr[0] = (this.f35541b[length].a() * d14) + this.f35541b[length].e();
                dArr[1] = (this.f35541b[length].b() * d14) + this.f35541b[length].f();
                return;
            }
        } else {
            C0414a[] c0414aArr4 = this.f35541b;
            if (d10 < c0414aArr4[0].f35546c) {
                d10 = c0414aArr4[0].f35546c;
            }
            if (d10 > c0414aArr4[c0414aArr4.length - 1].f35547d) {
                d10 = c0414aArr4[c0414aArr4.length - 1].f35547d;
            }
        }
        int i10 = 0;
        while (true) {
            C0414a[] c0414aArr5 = this.f35541b;
            if (i10 >= c0414aArr5.length) {
                return;
            }
            if (d10 <= c0414aArr5[i10].f35547d) {
                if (c0414aArr5[i10].f35561r) {
                    dArr[0] = c0414aArr5[i10].c(d10);
                    dArr[1] = this.f35541b[i10].d(d10);
                    return;
                } else {
                    c0414aArr5[i10].g(d10);
                    dArr[0] = this.f35541b[i10].e();
                    dArr[1] = this.f35541b[i10].f();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // t.b
    public void d(double d10, float[] fArr) {
        if (this.f35542c) {
            C0414a[] c0414aArr = this.f35541b;
            if (d10 < c0414aArr[0].f35546c) {
                double d11 = c0414aArr[0].f35546c;
                double d12 = d10 - c0414aArr[0].f35546c;
                if (c0414aArr[0].f35561r) {
                    double dC = c0414aArr[0].c(d11);
                    C0414a[] c0414aArr2 = this.f35541b;
                    fArr[0] = (float) ((c0414aArr2[0].f35555l * d12) + dC);
                    fArr[1] = (float) ((d12 * this.f35541b[0].f35556m) + c0414aArr2[0].d(d11));
                    return;
                }
                c0414aArr[0].g(d11);
                fArr[0] = (float) ((this.f35541b[0].a() * d12) + this.f35541b[0].e());
                fArr[1] = (float) ((this.f35541b[0].b() * d12) + this.f35541b[0].f());
                return;
            }
            if (d10 > c0414aArr[c0414aArr.length - 1].f35547d) {
                double d13 = c0414aArr[c0414aArr.length - 1].f35547d;
                double d14 = d10 - d13;
                int length = c0414aArr.length - 1;
                if (!c0414aArr[length].f35561r) {
                    c0414aArr[length].g(d10);
                    fArr[0] = (float) this.f35541b[length].e();
                    fArr[1] = (float) this.f35541b[length].f();
                    return;
                } else {
                    double dC2 = c0414aArr[length].c(d13);
                    C0414a[] c0414aArr3 = this.f35541b;
                    fArr[0] = (float) ((c0414aArr3[length].f35555l * d14) + dC2);
                    fArr[1] = (float) ((d14 * this.f35541b[length].f35556m) + c0414aArr3[length].d(d13));
                    return;
                }
            }
        } else {
            C0414a[] c0414aArr4 = this.f35541b;
            if (d10 < c0414aArr4[0].f35546c) {
                d10 = c0414aArr4[0].f35546c;
            } else if (d10 > c0414aArr4[c0414aArr4.length - 1].f35547d) {
                d10 = c0414aArr4[c0414aArr4.length - 1].f35547d;
            }
        }
        int i10 = 0;
        while (true) {
            C0414a[] c0414aArr5 = this.f35541b;
            if (i10 >= c0414aArr5.length) {
                return;
            }
            if (d10 <= c0414aArr5[i10].f35547d) {
                if (c0414aArr5[i10].f35561r) {
                    fArr[0] = (float) c0414aArr5[i10].c(d10);
                    fArr[1] = (float) this.f35541b[i10].d(d10);
                    return;
                } else {
                    c0414aArr5[i10].g(d10);
                    fArr[0] = (float) this.f35541b[i10].e();
                    fArr[1] = (float) this.f35541b[i10].f();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // t.b
    public void e(double d10, double[] dArr) {
        C0414a[] c0414aArr = this.f35541b;
        if (d10 < c0414aArr[0].f35546c) {
            d10 = c0414aArr[0].f35546c;
        } else if (d10 > c0414aArr[c0414aArr.length - 1].f35547d) {
            d10 = c0414aArr[c0414aArr.length - 1].f35547d;
        }
        int i10 = 0;
        while (true) {
            C0414a[] c0414aArr2 = this.f35541b;
            if (i10 >= c0414aArr2.length) {
                return;
            }
            if (d10 <= c0414aArr2[i10].f35547d) {
                if (c0414aArr2[i10].f35561r) {
                    dArr[0] = c0414aArr2[i10].f35555l;
                    dArr[1] = c0414aArr2[i10].f35556m;
                    return;
                } else {
                    c0414aArr2[i10].g(d10);
                    dArr[0] = this.f35541b[i10].a();
                    dArr[1] = this.f35541b[i10].b();
                    return;
                }
            }
            i10++;
        }
    }

    @Override // t.b
    public double[] f() {
        return this.f35540a;
    }
}
