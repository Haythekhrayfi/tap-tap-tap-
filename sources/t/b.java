package t;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f35562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double[] f35563b;

        public a(double d10, double[] dArr) {
            this.f35562a = d10;
            this.f35563b = dArr;
        }

        @Override // t.b
        public double b(double d10, int i10) {
            return this.f35563b[i10];
        }

        @Override // t.b
        public void c(double d10, double[] dArr) {
            double[] dArr2 = this.f35563b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // t.b
        public void d(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f35563b;
                if (i10 >= dArr.length) {
                    return;
                }
                fArr[i10] = (float) dArr[i10];
                i10++;
            }
        }

        @Override // t.b
        public void e(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f35563b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        @Override // t.b
        public double[] f() {
            return new double[]{this.f35562a};
        }
    }

    public static b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        if (i10 != 0) {
            return i10 != 2 ? new f(dArr, dArr2) : new a(dArr[0], dArr2[0]);
        }
        return new g(dArr, dArr2);
    }

    public abstract double b(double d10, int i10);

    public abstract void c(double d10, double[] dArr);

    public abstract void d(double d10, float[] fArr);

    public abstract void e(double d10, double[] dArr);

    public abstract double[] f();
}
