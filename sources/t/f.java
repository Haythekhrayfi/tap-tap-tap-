package t;

/* JADX INFO: loaded from: classes.dex */
public class f extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f35591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[][] f35592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35593c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double[] f35594d;

    public f(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f35594d = new double[length2];
        this.f35591a = dArr;
        this.f35592b = dArr2;
        if (length2 > 2) {
            double d10 = 0.0d;
            int i10 = 0;
            double d11 = 0.0d;
            while (i10 < dArr.length) {
                double d12 = dArr2[i10][0];
                double d13 = dArr2[i10][0];
                if (i10 > 0) {
                    Math.hypot(d12 - d10, d13 - d11);
                }
                i10++;
                d10 = d12;
                d11 = d13;
            }
        }
    }

    @Override // t.b
    public double b(double d10, int i10) {
        double[] dArr = this.f35591a;
        int length = dArr.length;
        int i11 = 0;
        if (this.f35593c) {
            if (d10 <= dArr[0]) {
                return (g(dArr[0], i10) * (d10 - dArr[0])) + this.f35592b[0][i10];
            }
            int i12 = length - 1;
            if (d10 >= dArr[i12]) {
                return (g(dArr[i12], i10) * (d10 - dArr[i12])) + this.f35592b[i12][i10];
            }
        } else {
            if (d10 <= dArr[0]) {
                return this.f35592b[0][i10];
            }
            int i13 = length - 1;
            if (d10 >= dArr[i13]) {
                return this.f35592b[i13][i10];
            }
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f35591a;
            if (d10 == dArr2[i11]) {
                return this.f35592b[i11][i10];
            }
            int i14 = i11 + 1;
            if (d10 < dArr2[i14]) {
                double d11 = (d10 - dArr2[i11]) / (dArr2[i14] - dArr2[i11]);
                double[][] dArr3 = this.f35592b;
                return (dArr3[i14][i10] * d11) + ((1.0d - d11) * dArr3[i11][i10]);
            }
            i11 = i14;
        }
        return 0.0d;
    }

    @Override // t.b
    public void c(double d10, double[] dArr) {
        double[] dArr2 = this.f35591a;
        int length = dArr2.length;
        int i10 = 0;
        int length2 = this.f35592b[0].length;
        if (this.f35593c) {
            if (d10 <= dArr2[0]) {
                e(dArr2[0], this.f35594d);
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = ((d10 - this.f35591a[0]) * this.f35594d[i11]) + this.f35592b[0][i11];
                }
                return;
            }
            int i12 = length - 1;
            if (d10 >= dArr2[i12]) {
                e(dArr2[i12], this.f35594d);
                while (i10 < length2) {
                    dArr[i10] = ((d10 - this.f35591a[i12]) * this.f35594d[i10]) + this.f35592b[i12][i10];
                    i10++;
                }
                return;
            }
        } else {
            if (d10 <= dArr2[0]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = this.f35592b[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            if (d10 >= dArr2[i14]) {
                while (i10 < length2) {
                    dArr[i10] = this.f35592b[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d10 == this.f35591a[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    dArr[i16] = this.f35592b[i15][i16];
                }
            }
            double[] dArr3 = this.f35591a;
            int i17 = i15 + 1;
            if (d10 < dArr3[i17]) {
                double d11 = (d10 - dArr3[i15]) / (dArr3[i17] - dArr3[i15]);
                while (i10 < length2) {
                    double[][] dArr4 = this.f35592b;
                    dArr[i10] = (dArr4[i17][i10] * d11) + ((1.0d - d11) * dArr4[i15][i10]);
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    @Override // t.b
    public void d(double d10, float[] fArr) {
        double[] dArr = this.f35591a;
        int length = dArr.length;
        int i10 = 0;
        int length2 = this.f35592b[0].length;
        if (this.f35593c) {
            if (d10 <= dArr[0]) {
                e(dArr[0], this.f35594d);
                for (int i11 = 0; i11 < length2; i11++) {
                    fArr[i11] = (float) (((d10 - this.f35591a[0]) * this.f35594d[i11]) + this.f35592b[0][i11]);
                }
                return;
            }
            int i12 = length - 1;
            if (d10 >= dArr[i12]) {
                e(dArr[i12], this.f35594d);
                while (i10 < length2) {
                    fArr[i10] = (float) (((d10 - this.f35591a[i12]) * this.f35594d[i10]) + this.f35592b[i12][i10]);
                    i10++;
                }
                return;
            }
        } else {
            if (d10 <= dArr[0]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) this.f35592b[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            if (d10 >= dArr[i14]) {
                while (i10 < length2) {
                    fArr[i10] = (float) this.f35592b[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d10 == this.f35591a[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    fArr[i16] = (float) this.f35592b[i15][i16];
                }
            }
            double[] dArr2 = this.f35591a;
            int i17 = i15 + 1;
            if (d10 < dArr2[i17]) {
                double d11 = (d10 - dArr2[i15]) / (dArr2[i17] - dArr2[i15]);
                while (i10 < length2) {
                    double[][] dArr3 = this.f35592b;
                    fArr[i10] = (float) ((dArr3[i17][i10] * d11) + ((1.0d - d11) * dArr3[i15][i10]));
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    @Override // t.b
    public void e(double d10, double[] dArr) {
        double[] dArr2 = this.f35591a;
        int length = dArr2.length;
        int length2 = this.f35592b[0].length;
        if (d10 <= dArr2[0]) {
            d10 = dArr2[0];
        } else {
            int i10 = length - 1;
            if (d10 >= dArr2[i10]) {
                d10 = dArr2[i10];
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            double[] dArr3 = this.f35591a;
            int i12 = i11 + 1;
            if (d10 <= dArr3[i12]) {
                double d11 = dArr3[i12] - dArr3[i11];
                double d12 = dArr3[i11];
                for (int i13 = 0; i13 < length2; i13++) {
                    double[][] dArr4 = this.f35592b;
                    dArr[i13] = (dArr4[i12][i13] - dArr4[i11][i13]) / d11;
                }
                return;
            }
            i11 = i12;
        }
    }

    @Override // t.b
    public double[] f() {
        return this.f35591a;
    }

    public double g(double d10, int i10) {
        double[] dArr = this.f35591a;
        int length = dArr.length;
        int i11 = 0;
        if (d10 < dArr[0]) {
            d10 = dArr[0];
        } else {
            int i12 = length - 1;
            if (d10 >= dArr[i12]) {
                d10 = dArr[i12];
            }
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f35591a;
            int i13 = i11 + 1;
            if (d10 <= dArr2[i13]) {
                double d11 = dArr2[i13] - dArr2[i11];
                double d12 = dArr2[i11];
                double[][] dArr3 = this.f35592b;
                return (dArr3[i13][i10] - dArr3[i11][i10]) / d11;
            }
            i11 = i13;
        }
        return 0.0d;
    }
}
