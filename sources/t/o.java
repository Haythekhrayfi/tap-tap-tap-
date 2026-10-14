package t;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f35636a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35641f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f35644i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35637b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f35638c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[][] f35639d = (float[][]) Array.newInstance((Class<?>) float.class, 10, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f35642g = new float[3];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35643h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35645j = Float.NaN;

    public float a(float f10) {
        float fAbs;
        switch (this.f35637b) {
            case 1:
                return Math.signum(f10 * 6.2831855f);
            case 2:
                fAbs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f10 * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f10 * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    public void b(int i10, float f10, float f11, int i11, float f12) {
        int[] iArr = this.f35638c;
        int i12 = this.f35640e;
        iArr[i12] = i10;
        float[][] fArr = this.f35639d;
        fArr[i12][0] = f10;
        fArr[i12][1] = f11;
        fArr[i12][2] = f12;
        this.f35637b = Math.max(this.f35637b, i11);
        this.f35640e++;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    public void c(int i10) {
        int i11 = this.f35640e;
        if (i11 == 0) {
            PrintStream printStream = System.err;
            StringBuilder sbA = defpackage.a.a("Error no points added to ");
            sbA.append(this.f35641f);
            printStream.println(sbA.toString());
            return;
        }
        int[] iArr = this.f35638c;
        float[][] fArr = this.f35639d;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (i12 > 0) {
            int i13 = i12 - 1;
            int i14 = iArr2[i13];
            i12 = i13 - 1;
            int i15 = iArr2[i12];
            if (i14 < i15) {
                int i16 = iArr[i15];
                int i17 = i14;
                int i18 = i17;
                while (i17 < i15) {
                    if (iArr[i17] <= i16) {
                        int i19 = iArr[i18];
                        iArr[i18] = iArr[i17];
                        iArr[i17] = i19;
                        float[] fArr2 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = fArr2;
                        i18++;
                    }
                    i17++;
                }
                int i20 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i20;
                float[] fArr3 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = fArr3;
                int i21 = i12 + 1;
                iArr2[i12] = i18 - 1;
                int i22 = i21 + 1;
                iArr2[i21] = i14;
                int i23 = i22 + 1;
                iArr2[i22] = i15;
                i12 = i23 + 1;
                iArr2[i23] = i18 + 1;
            }
        }
        int i24 = 1;
        int i25 = 0;
        while (true) {
            int[] iArr3 = this.f35638c;
            if (i24 >= iArr3.length) {
                break;
            }
            if (iArr3[i24] != iArr3[i24 - 1]) {
                i25++;
            }
            i24++;
        }
        if (i25 == 0) {
            i25 = 1;
        }
        double[] dArr = new double[i25];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, i25, 3);
        int i26 = 0;
        for (int i27 = 0; i27 < this.f35640e; i27++) {
            if (i27 > 0) {
                int[] iArr4 = this.f35638c;
                if (iArr4[i27] != iArr4[i27 - 1]) {
                    dArr[i26] = ((double) this.f35638c[i27]) * 0.01d;
                    double[] dArr3 = dArr2[i26];
                    float[][] fArr4 = this.f35639d;
                    dArr3[0] = fArr4[i27][0];
                    dArr2[i26][1] = fArr4[i27][1];
                    dArr2[i26][2] = fArr4[i27][2];
                    i26++;
                }
            } else {
                dArr[i26] = ((double) this.f35638c[i27]) * 0.01d;
                double[] dArr4 = dArr2[i26];
                float[][] fArr5 = this.f35639d;
                dArr4[0] = fArr5[i27][0];
                dArr2[i26][1] = fArr5[i27][1];
                dArr2[i26][2] = fArr5[i27][2];
                i26++;
            }
        }
        this.f35636a = b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String string = this.f35641f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f35640e; i10++) {
            StringBuilder sbA = android.support.v4.media.c.a(string, "[");
            sbA.append(this.f35638c[i10]);
            sbA.append(" , ");
            sbA.append(decimalFormat.format(this.f35639d[i10]));
            sbA.append("] ");
            string = sbA.toString();
        }
        return string;
    }
}
