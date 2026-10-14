package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1152Qp {
    public static QV A00;
    public static byte[] A01;
    public static String[] A02 = {"b", "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, 101, 110, 8, 85, 68, 11, 77, 77, 2, Ascii.DEL, 10, 123, 99, 73, 104, 8, 85, 98, 15, 86, 84, 94, 81, 8, 82, 77, 74, 8, 111, 85, 73, 81, 7, 48, Ascii.DEL, 32, 7, 58, 38, 2, 63, 42, 33, 62, 34, 103, Ascii.ESC, 33, 42, 8, 36, 58, 62, 126, 37, Ascii.SUB, 36, 99, 53, Ascii.RS, 63, 113, 70, 13, Ascii.DEL, 119, Ascii.RS, 59, 10, 123, 54, 3, 12, 43, 35, 38, 123, 61, 63, 59, 54, 62, 14, 10, 44, 53, 23, 0, 42, 14, 114, 69, 107, 64, 81, 82, 74, 87, 78, 76, 75, 66, 5, 71, 64, 67, 74, 87, 64, 5, 76, 75, 76, 81, 4, 113, 115, 113, 96, Ascii.US, 72, 71, 115, 75, 77, 98, 79, 2, 93, 72, 124, 123, 77, 71, 80, 124, 97, Ascii.FS, 64, 89, 78, 100, 20, 35, 54, 62, 37, 39, 59, 54, 57, 50, 8, 58, 56, 51, 50, 8, 56, 57, 7, 12, Ascii.GS, Ascii.RS, 6, Ascii.ESC, 2, 19, 8, 61, 85, 32, 53, 9, 53, 13, 36, 94, 55, 82, 49, 49, 50, 3, 36, 23, 40, 21, 33, 47, 95, 11, 1, 54, 90, 109};
    }

    static {
        A07();
        HashSet hashSet = new HashSet();
        A03 = hashSet;
        HashSet hashSet2 = new HashSet();
        A04 = hashSet2;
        hashSet.add(A05(6, 29, 2));
        hashSet2.add(A05(168, 29, 95));
        hashSet2.add(A05(35, 29, 116));
        hashSet2.add(A05(64, 29, 119));
        hashSet2.add(A05(116, 29, 17));
        A05 = new AtomicBoolean();
    }

    public static QX A00(C7Q c7q) {
        return A03(true, c7q);
    }

    public static QX A01(C7Q c7q) {
        return A02(true, c7q);
    }

    public static QX A02(boolean z10, C7Q c7q) {
        C1138Qb c1138Qb = new C1138Qb();
        C1141Qe c1141QeA04 = A04(c7q);
        if (!A0B(c7q)) {
            c1138Qb.A02(A04);
            c1138Qb.A01(A03);
        }
        if (KY.A04()) {
            Map<String, String> mapA02 = KY.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            c1141QeA04.A08(mapA02);
        }
        C0928Ht c0928HtA00 = QZ.A00();
        C1138Qb networkModuleConfigurationBuilder = c1138Qb.A00(c1141QeA04.A09());
        return c0928HtA00.A00(networkModuleConfigurationBuilder.A03(z10).A04(c7q.A04().A8n()).A05(), c7q.A07(), LT.A01());
    }

    public static QX A03(boolean z10, C7Q c7q) {
        return QZ.A00().A00(new C1138Qb().A03(z10).A00(A04(c7q).A09()).A04(c7q.A04().A8n()).A05(), c7q.A07(), LT.A01());
    }

    public static C1141Qe A04(C7Q c7q) {
        A08(c7q);
        C1141Qe c1141Qe = new C1141Qe();
        if (A0B(c7q) || KY.A04()) {
            c1141Qe.A02(360000).A04(120000);
        } else {
            c1141Qe.A02(IN.A08(c7q)).A04(IN.A0A(c7q));
        }
        c1141Qe.A03(IN.A09(c7q)).A05(IN.A0B(c7q)).A06(IN.A0C(c7q));
        synchronized (C1152Qp.class) {
            QV qv = A00;
            if (qv != null && (qv instanceof QV)) {
                c1141Qe.A07(qv);
            }
        }
        return c1141Qe;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A08(C7Q c7q) {
        if (!A05.get()) {
            c7q.A07().A9K(A05(161, 7, 81), C06937v.A20, new C06947w(A05(93, 23, 29)));
        }
    }

    public static synchronized void A09(QV qv) {
        A00 = qv;
    }

    public static boolean A0A(C7Q c7q) {
        int i10 = Build.VERSION.SDK_INT;
        String strA05 = A05(145, 16, 111);
        if (i10 < 17) {
            return Settings.System.getInt(c7q.getContentResolver(), strA05, 0) != 0;
        }
        int i11 = Settings.Global.getInt(c7q.getContentResolver(), strA05, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i11 != 0;
    }

    public static boolean A0B(C7Q c7q) {
        String strA85 = c7q.A04().A85();
        if (!TextUtils.isEmpty(strA85)) {
            String urlPrefix = A05(3, 3, 30);
            if (!strA85.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 50);
                if (strA85.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
