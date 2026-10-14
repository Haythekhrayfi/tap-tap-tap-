package t;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f35602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f35603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35604e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f35600a = new float[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f35601b = new double[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f35605f = 6.283185307179586d;

    public void a(double d10, float f10) {
        int length = this.f35600a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f35601b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f35601b = Arrays.copyOf(this.f35601b, length);
        this.f35600a = Arrays.copyOf(this.f35600a, length);
        this.f35602c = new double[length];
        double[] dArr = this.f35601b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f35601b[iBinarySearch] = d10;
        this.f35600a[iBinarySearch] = f10;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("pos =");
        sbA.append(Arrays.toString(this.f35601b));
        sbA.append(" period=");
        sbA.append(Arrays.toString(this.f35600a));
        return sbA.toString();
    }
}
