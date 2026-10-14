package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0995Ko {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{108, 78, 65, 8, 91, 15, 75, 74, 91, 74, 93, 66, 70, 65, 74, 15, 70, 73, 15, 78, 95, 95, 15, 70, 92, 15, 122, 65, 70, 91, 86, 1, Ascii.CAN, 34, 113, 4, 63, 56, 37, 40, 113, 48, 33, 33, 107, 113, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 103, 112, 116, 118, 97, 59, 71, 112, 116, 118, 97, 84, 118, 97, 124, 99, 124, 97, 108, 4, 8, 10, 73, 18, 9, 14, 19, Ascii.RS, 84, 3, 73, 23, 11, 6, Ascii.RS, 2, 21, 73, 50, 9, 14, 19, Ascii.RS, 55, 11, 6, Ascii.RS, 2, 21, 38, 4, 19, 14, 17, 14, 19, Ascii.RS};
    }

    static {
        A01();
        A01 = C0995Ko.class.getSimpleName();
    }

    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 76));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 62));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i10, int i11) {
        return i10 >= 640 && i11 >= 640;
    }

    public static boolean A05(C7Q c7q) {
        boolean z10 = false;
        try {
            PackageManager packageManager = c7q.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean isUnity = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(c7q.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    boolean activityDeclared = A00(78, 38, 62).equals(activityInfo.name);
                    if (activityDeclared) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (!z10) {
                boolean activityDeclared2 = A03();
                if (!activityDeclared2) {
                    isUnity = false;
                }
            }
            boolean activityDeclared3 = c7q.A04().A8n();
            if (activityDeclared3) {
                String str = A00(32, 14, 8) + isUnity;
            }
            return isUnity;
        } catch (Throwable th) {
            if (c7q.A04().A8n()) {
                Log.e(A01, A00(0, 32, 118), th);
            }
            return false;
        }
    }
}
