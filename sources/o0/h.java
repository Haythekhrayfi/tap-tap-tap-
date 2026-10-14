package o0;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintWriter;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f33867a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f33868b = new char[24];

    public static int a(int i10, int i11, boolean z10, int i12) {
        if (i10 > 99 || (z10 && i12 >= 3)) {
            return i11 + 3;
        }
        if (i10 > 9 || (z10 && i12 >= 2)) {
            return i11 + 2;
        }
        if (z10 || i10 > 0) {
            return i11 + 1;
        }
        return 0;
    }

    public static void b(long j10, PrintWriter printWriter, int i10) {
        synchronized (f33867a) {
            printWriter.print(new String(f33868b, 0, c(j10, i10)));
        }
    }

    public static int c(long j10, int i10) {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = j10;
        if (f33868b.length < i10) {
            f33868b = new char[i10];
        }
        char[] cArr = f33868b;
        if (j11 == 0) {
            int i16 = i10 - 1;
            while (i16 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j11 > 0) {
            c10 = '+';
        } else {
            c10 = CoreConstants.DASH_CHAR;
            j11 = -j11;
        }
        int i17 = (int) (j11 % 1000);
        int iFloor = (int) Math.floor(j11 / 1000);
        if (iFloor > 86400) {
            i11 = iFloor / DateTimeConstants.SECONDS_PER_DAY;
            iFloor -= DateTimeConstants.SECONDS_PER_DAY * i11;
        } else {
            i11 = 0;
        }
        if (iFloor > 3600) {
            i12 = iFloor / DateTimeConstants.SECONDS_PER_HOUR;
            iFloor -= i12 * DateTimeConstants.SECONDS_PER_HOUR;
        } else {
            i12 = 0;
        }
        if (iFloor > 60) {
            int i18 = iFloor / 60;
            i13 = iFloor - (i18 * 60);
            i14 = i18;
        } else {
            i13 = iFloor;
            i14 = 0;
        }
        if (i10 != 0) {
            int iA = a(i11, 1, false, 0);
            int iA2 = a(i12, 1, iA > 0, 2) + iA;
            int iA3 = a(i14, 1, iA2 > 0, 2) + iA2;
            int iA4 = a(i13, 1, iA3 > 0, 2) + iA3;
            i15 = 0;
            for (int iA5 = a(i17, 2, true, iA4 > 0 ? 3 : 0) + 1 + iA4; iA5 < i10; iA5++) {
                cArr[i15] = ' ';
                i15++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c10;
        int i19 = i15 + 1;
        boolean z10 = i10 != 0;
        int iD = d(cArr, i11, 'd', i19, false, 0);
        int iD2 = d(cArr, i12, 'h', iD, iD != i19, z10 ? 2 : 0);
        int iD3 = d(cArr, i14, 'm', iD2, iD2 != i19, z10 ? 2 : 0);
        int iD4 = d(cArr, i13, 's', iD3, iD3 != i19, z10 ? 2 : 0);
        int iD5 = d(cArr, i17, 'm', iD4, true, (!z10 || iD4 == i19) ? 0 : 3);
        cArr[iD5] = 's';
        return iD5 + 1;
    }

    public static int d(char[] cArr, int i10, char c10, int i11, boolean z10, int i12) {
        int i13;
        if (!z10 && i10 <= 0) {
            return i11;
        }
        if ((!z10 || i12 < 3) && i10 <= 99) {
            i13 = i11;
        } else {
            int i14 = i10 / 100;
            cArr[i11] = (char) (i14 + 48);
            i13 = i11 + 1;
            i10 -= i14 * 100;
        }
        if ((z10 && i12 >= 2) || i10 > 9 || i11 != i13) {
            int i15 = i10 / 10;
            cArr[i13] = (char) (i15 + 48);
            i13++;
            i10 -= i15 * 10;
        }
        cArr[i13] = (char) (i10 + 48);
        int i16 = i13 + 1;
        cArr[i16] = c10;
        return i16 + 1;
    }
}
