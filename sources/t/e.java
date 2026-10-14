package t;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f35572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35574c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35575d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35576e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c> f35577f = new ArrayList<>();

    public class a implements Comparator<c> {
        public a(e eVar) {
        }

        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.f35586a, cVar2.f35586a);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f35578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f35579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double[] f35580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f35581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float[] f35582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float[] f35583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public t.b f35584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double[] f35585h;

        public b(int i10, String str, int i11, int i12) {
            long j10;
            char c10;
            h hVar = new h();
            this.f35578a = hVar;
            hVar.f35604e = i10;
            if (str != null) {
                double[] dArr = new double[str.length() / 2];
                int iIndexOf = str.indexOf(40) + 1;
                int iIndexOf2 = str.indexOf(44, iIndexOf);
                char c11 = 0;
                int i13 = 0;
                while (iIndexOf2 != -1) {
                    dArr[i13] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                    iIndexOf = iIndexOf2 + 1;
                    iIndexOf2 = str.indexOf(44, iIndexOf);
                    i13++;
                }
                dArr[i13] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
                double[] dArrCopyOf = Arrays.copyOf(dArr, i13 + 1);
                int length = (dArrCopyOf.length * 3) - 2;
                int length2 = dArrCopyOf.length - 1;
                double d10 = 1.0d / ((double) length2);
                double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, length, 1);
                double[] dArr3 = new double[length];
                int i14 = 0;
                while (i14 < dArrCopyOf.length) {
                    double d11 = dArrCopyOf[i14];
                    int i15 = i14 + length2;
                    dArr2[i15][c11] = d11;
                    double d12 = ((double) i14) * d10;
                    dArr3[i15] = d12;
                    if (i14 > 0) {
                        int i16 = (length2 * 2) + i14;
                        j10 = 4607182418800017408L;
                        c10 = 0;
                        dArr2[i16][0] = d11 + 1.0d;
                        dArr3[i16] = d12 + 1.0d;
                        int i17 = i14 - 1;
                        dArr2[i17][0] = (d11 - 1.0d) - d10;
                        dArr3[i17] = (d12 - 1.0d) - d10;
                    } else {
                        j10 = 4607182418800017408L;
                        c10 = 0;
                    }
                    i14++;
                    c11 = c10;
                }
                hVar.f35603d = new g(dArr3, dArr2);
            }
            this.f35579b = new float[i12];
            this.f35580c = new double[i12];
            this.f35581d = new float[i12];
            this.f35582e = new float[i12];
            this.f35583f = new float[i12];
            float[] fArr = new float[i12];
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f35587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f35588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f35589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f35590e;

        public c(int i10, float f10, float f11, float f12, float f13) {
            this.f35586a = i10;
            this.f35587b = f13;
            this.f35588c = f11;
            this.f35589d = f10;
            this.f35590e = f12;
        }
    }

    public float a(float f10) {
        double dSignum;
        double dAbs;
        b bVar = this.f35572a;
        t.b bVar2 = bVar.f35584g;
        if (bVar2 != null) {
            bVar2.c(f10, bVar.f35585h);
        } else {
            double[] dArr = bVar.f35585h;
            dArr[0] = bVar.f35582e[0];
            dArr[1] = bVar.f35583f[0];
            dArr[2] = bVar.f35579b[0];
        }
        double[] dArr2 = bVar.f35585h;
        double d10 = dArr2[0];
        double d11 = dArr2[1];
        h hVar = bVar.f35578a;
        double d12 = f10;
        double d13 = 0.0d;
        if (d12 < 0.0d) {
            d12 = 0.0d;
        } else if (d12 > 1.0d) {
            d12 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(hVar.f35601b, d12);
        if (iBinarySearch > 0) {
            d13 = 1.0d;
        } else if (iBinarySearch != 0) {
            int i10 = (-iBinarySearch) - 1;
            float[] fArr = hVar.f35600a;
            int i11 = i10 - 1;
            double d14 = fArr[i10] - fArr[i11];
            double[] dArr3 = hVar.f35601b;
            double d15 = d14 / (dArr3[i10] - dArr3[i11]);
            d13 = ((((d12 * d12) - (dArr3[i11] * dArr3[i11])) * d15) / 2.0d) + ((d12 - dArr3[i11]) * (((double) fArr[i11]) - (dArr3[i11] * d15))) + hVar.f35602c[i11];
        }
        double d16 = d13 + d11;
        switch (hVar.f35604e) {
            case 1:
                dSignum = Math.signum(0.5d - (d16 % 1.0d));
                break;
            case 2:
                dAbs = Math.abs((((d16 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                dSignum = 1.0d - dAbs;
                break;
            case 3:
                dSignum = (((d16 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                dAbs = ((d16 * 2.0d) + 1.0d) % 2.0d;
                dSignum = 1.0d - dAbs;
                break;
            case 5:
                dSignum = Math.cos((d11 + d16) * hVar.f35605f);
                break;
            case 6:
                double dAbs2 = 1.0d - Math.abs(((d16 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                dSignum = 1.0d - dAbs;
                break;
            case 7:
                dSignum = hVar.f35603d.b(d16 % 1.0d, 0);
                break;
            default:
                dSignum = Math.sin(hVar.f35605f * d16);
                break;
        }
        return (float) ((dSignum * bVar.f35585h[2]) + d10);
    }

    public void b(Object obj) {
    }

    public void c(float f10) {
        int i10;
        t.b bVarA;
        int size = this.f35577f.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f35577f, new a(this));
        double[] dArr = new double[size];
        char c10 = 2;
        char c11 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, 3);
        this.f35572a = new b(this.f35574c, this.f35575d, this.f35576e, size);
        Iterator<c> it = this.f35577f.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            c next = it.next();
            float f11 = next.f35589d;
            dArr[i11] = ((double) f11) * 0.01d;
            double[] dArr3 = dArr2[i11];
            float f12 = next.f35587b;
            dArr3[c11] = f12;
            double[] dArr4 = dArr2[i11];
            float f13 = next.f35588c;
            dArr4[1] = f13;
            double[] dArr5 = dArr2[i11];
            float f14 = next.f35590e;
            Iterator<c> it2 = it;
            dArr5[c10] = f14;
            b bVar = this.f35572a;
            bVar.f35580c[i11] = ((double) next.f35586a) / 100.0d;
            bVar.f35581d[i11] = f11;
            bVar.f35582e[i11] = f13;
            bVar.f35583f[i11] = f14;
            bVar.f35579b[i11] = f12;
            i11++;
            dArr = dArr;
            it = it2;
            dArr2 = dArr2;
            c10 = 2;
            c11 = 0;
        }
        double[] dArr6 = dArr;
        double[][] dArr7 = dArr2;
        b bVar2 = this.f35572a;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) double.class, bVar2.f35580c.length, 3);
        float[] fArr = bVar2.f35579b;
        bVar2.f35585h = new double[fArr.length + 2];
        double[] dArr9 = new double[fArr.length + 2];
        if (bVar2.f35580c[0] > 0.0d) {
            bVar2.f35578a.a(0.0d, bVar2.f35581d[0]);
        }
        double[] dArr10 = bVar2.f35580c;
        int length = dArr10.length - 1;
        if (dArr10[length] < 1.0d) {
            bVar2.f35578a.a(1.0d, bVar2.f35581d[length]);
        }
        for (int i12 = 0; i12 < dArr8.length; i12++) {
            dArr8[i12][0] = bVar2.f35582e[i12];
            dArr8[i12][1] = bVar2.f35583f[i12];
            dArr8[i12][2] = bVar2.f35579b[i12];
            bVar2.f35578a.a(bVar2.f35580c[i12], bVar2.f35581d[i12]);
        }
        h hVar = bVar2.f35578a;
        double d10 = 0.0d;
        int i13 = 0;
        while (true) {
            float[] fArr2 = hVar.f35600a;
            if (i13 >= fArr2.length) {
                break;
            }
            d10 += (double) fArr2[i13];
            i13++;
        }
        int i14 = 1;
        double d11 = 0.0d;
        while (true) {
            float[] fArr3 = hVar.f35600a;
            if (i14 >= fArr3.length) {
                break;
            }
            int i15 = i14 - 1;
            float f15 = (fArr3[i15] + fArr3[i14]) / 2.0f;
            double[] dArr11 = hVar.f35601b;
            d11 = ((dArr11[i14] - dArr11[i15]) * ((double) f15)) + d11;
            i14++;
        }
        int i16 = 0;
        while (true) {
            float[] fArr4 = hVar.f35600a;
            if (i16 >= fArr4.length) {
                break;
            }
            fArr4[i16] = (float) (((double) fArr4[i16]) * (d10 / d11));
            i16++;
        }
        hVar.f35602c[0] = 0.0d;
        int i17 = 1;
        while (true) {
            float[] fArr5 = hVar.f35600a;
            if (i17 >= fArr5.length) {
                break;
            }
            int i18 = i17 - 1;
            float f16 = (fArr5[i18] + fArr5[i17]) / 2.0f;
            double[] dArr12 = hVar.f35601b;
            double d12 = dArr12[i17] - dArr12[i18];
            double[] dArr13 = hVar.f35602c;
            dArr13[i17] = (d12 * ((double) f16)) + dArr13[i18];
            i17++;
        }
        double[] dArr14 = bVar2.f35580c;
        if (dArr14.length > 1) {
            i10 = 0;
            bVarA = t.b.a(0, dArr14, dArr8);
        } else {
            i10 = 0;
            bVarA = null;
        }
        bVar2.f35584g = bVarA;
        t.b.a(i10, dArr6, dArr7);
    }

    public String toString() {
        String string = this.f35573b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (c cVar : this.f35577f) {
            StringBuilder sbA = android.support.v4.media.c.a(string, "[");
            sbA.append(cVar.f35586a);
            sbA.append(" , ");
            sbA.append(decimalFormat.format(cVar.f35587b));
            sbA.append("] ");
            string = sbA.toString();
        }
        return string;
    }
}
