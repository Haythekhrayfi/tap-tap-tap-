package t;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f35622d;

    public l(String str) {
        this.f35566a = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i10 = 0;
        while (iIndexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        double[] dArrCopyOf = Arrays.copyOf(dArr, i10 + 1);
        int length = (dArrCopyOf.length * 3) - 2;
        int length2 = dArrCopyOf.length - 1;
        double d10 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, length, 1);
        double[] dArr3 = new double[length];
        for (int i11 = 0; i11 < dArrCopyOf.length; i11++) {
            double d11 = dArrCopyOf[i11];
            int i12 = i11 + length2;
            dArr2[i12][0] = d11;
            double d12 = ((double) i11) * d10;
            dArr3[i12] = d12;
            if (i11 > 0) {
                int i13 = (length2 * 2) + i11;
                dArr2[i13][0] = d11 + 1.0d;
                dArr3[i13] = d12 + 1.0d;
                int i14 = i11 - 1;
                dArr2[i14][0] = (d11 - 1.0d) - d10;
                dArr3[i14] = (d12 - 1.0d) - d10;
            }
        }
        g gVar = new g(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder sbA = defpackage.a.a(" 0 ");
        sbA.append(gVar.b(0.0d, 0));
        printStream.println(sbA.toString());
        PrintStream printStream2 = System.out;
        StringBuilder sbA2 = defpackage.a.a(" 1 ");
        sbA2.append(gVar.b(1.0d, 0));
        printStream2.println(sbA2.toString());
        this.f35622d = gVar;
    }

    @Override // t.c
    public double a(double d10) {
        return this.f35622d.b(d10, 0);
    }

    @Override // t.c
    public double b(double d10) {
        return this.f35622d.h(d10, 0);
    }
}
