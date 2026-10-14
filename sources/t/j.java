package t;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f35608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f35609b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f35610c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35612e;

    public float a(float f10) {
        return (float) this.f35608a.b(f10, 0);
    }

    public void b(int i10, float f10) {
        int[] iArr = this.f35609b;
        if (iArr.length < this.f35611d + 1) {
            this.f35609b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f35610c;
            this.f35610c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f35609b;
        int i11 = this.f35611d;
        iArr2[i11] = i10;
        this.f35610c[i11] = f10;
        this.f35611d = i11 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    public void c(int i10) {
        int i11 = this.f35611d;
        if (i11 == 0) {
            return;
        }
        int[] iArr = this.f35609b;
        float[] fArr = this.f35610c;
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
                        float f10 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = f10;
                        i18++;
                    }
                    i17++;
                }
                int i20 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i20;
                float f11 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = f11;
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
        for (int i25 = 1; i25 < this.f35611d; i25++) {
            int[] iArr3 = this.f35609b;
            if (iArr3[i25 - 1] != iArr3[i25]) {
                i24++;
            }
        }
        double[] dArr = new double[i24];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, i24, 1);
        int i26 = 0;
        for (int i27 = 0; i27 < this.f35611d; i27++) {
            if (i27 > 0) {
                int[] iArr4 = this.f35609b;
                if (iArr4[i27] != iArr4[i27 - 1]) {
                    dArr[i26] = ((double) this.f35609b[i27]) * 0.01d;
                    dArr2[i26][0] = this.f35610c[i27];
                    i26++;
                }
            } else {
                dArr[i26] = ((double) this.f35609b[i27]) * 0.01d;
                dArr2[i26][0] = this.f35610c[i27];
                i26++;
            }
        }
        this.f35608a = b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String string = this.f35612e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f35611d; i10++) {
            StringBuilder sbA = android.support.v4.media.c.a(string, "[");
            sbA.append(this.f35609b[i10]);
            sbA.append(" , ");
            sbA.append(decimalFormat.format(this.f35610c[i10]));
            sbA.append("] ");
            string = sbA.toString();
        }
        return string;
    }
}
