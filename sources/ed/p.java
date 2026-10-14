package ed;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public class p extends o {
    public static final Integer f(String str) {
        int i10;
        int i11;
        j0.i(str, "<this>");
        j0.i(str, "<this>");
        a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        boolean z10 = true;
        if (j0.k(cCharAt, 48) >= 0) {
            i10 = 0;
            z10 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i13 = Integer.MIN_VALUE;
                i10 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                i10 = 1;
                z10 = false;
            }
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + iDigit) {
                return null;
            }
            i12 = i11 - iDigit;
            i10++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    public static final Long g(String str) {
        a.a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        boolean z10 = true;
        if (j0.k(cCharAt, 48) >= 0) {
            z10 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j10 = Long.MIN_VALUE;
                i10 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z10 = false;
                i10 = 1;
            }
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        long j13 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j11 < j13) {
                if (j13 != j12) {
                    return null;
                }
                j13 = j10 / ((long) 10);
                if (j11 < j13) {
                    return null;
                }
            }
            long j14 = j11 * ((long) 10);
            long j15 = iDigit;
            if (j14 < j10 + j15) {
                return null;
            }
            j11 = j14 - j15;
            i10++;
            j12 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }
}
