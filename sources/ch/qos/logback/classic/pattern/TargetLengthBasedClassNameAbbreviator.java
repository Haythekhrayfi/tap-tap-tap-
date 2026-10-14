package ch.qos.logback.classic.pattern;

import defpackage.a;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public class TargetLengthBasedClassNameAbbreviator implements Abbreviator {
    public final int targetLength;

    public TargetLengthBasedClassNameAbbreviator(int i10) {
        this.targetLength = i10;
    }

    public static int computeDotIndexes(String str, int[] iArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int iIndexOf = str.indexOf(46, i10);
            if (iIndexOf == -1 || i11 >= 16) {
                break;
            }
            iArr[i11] = iIndexOf;
            i11++;
            i10 = iIndexOf + 1;
        }
        return i11;
    }

    public static void printArray(String str, int[] iArr) {
        System.out.print(str);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            PrintStream printStream = System.out;
            if (i10 == 0) {
                printStream.print(iArr[i10]);
            } else {
                StringBuilder sbA = a.a(", ");
                sbA.append(iArr[i10]);
                printStream.print(sbA.toString());
            }
        }
        System.out.println();
    }

    @Override // ch.qos.logback.classic.pattern.Abbreviator
    public String abbreviate(String str) {
        String strSubstring;
        StringBuilder sb2 = new StringBuilder(this.targetLength);
        if (str == null) {
            throw new IllegalArgumentException("Class name may not be null");
        }
        if (str.length() < this.targetLength) {
            return str;
        }
        int[] iArr = new int[16];
        int[] iArr2 = new int[17];
        int iComputeDotIndexes = computeDotIndexes(str, iArr);
        if (iComputeDotIndexes == 0) {
            return str;
        }
        computeLengthArray(str, iArr, iArr2, iComputeDotIndexes);
        for (int i10 = 0; i10 <= iComputeDotIndexes; i10++) {
            if (i10 == 0) {
                strSubstring = str.substring(0, iArr2[i10] - 1);
            } else {
                int i11 = i10 - 1;
                strSubstring = str.substring(iArr[i11], iArr[i11] + iArr2[i10]);
            }
            sb2.append(strSubstring);
        }
        return sb2.toString();
    }

    public void computeLengthArray(String str, int[] iArr, int[] iArr2, int i10) {
        int length = str.length() - this.targetLength;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = (iArr[i11] - (i11 > 0 ? iArr[i11 - 1] : -1)) - 1;
            int i13 = (length <= 0 || i12 < 1) ? i12 : 1;
            length -= i12 - i13;
            iArr2[i11] = i13 + 1;
            i11++;
        }
        iArr2[i10] = str.length() - iArr[i10 - 1];
    }
}
