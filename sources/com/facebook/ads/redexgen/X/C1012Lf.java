package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1012Lf {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{100, -105, -126, -124, -113, -109, -120, -114, -115, 63, -120, -115, 63, -110, -126, -111, -124, -124, -115, 63, -120, -115, -109, -124, -111, -128, -126, -109, -120, -107, -124, 63, -126, -121, -124, -126, -118, 75, 63, -128, -110, -110, -108, -116, -120, -115, -122, 63, -120, -115, -109, -124, -111, -128, -126, -109, -120, -107, -124, 77, -103, -104, -96, -114, -101, -46, -55, -45, -53, -39};
    }

    static {
        A01();
        A01 = C1012Lf.class.getSimpleName();
    }

    public static boolean A02(C1337Xw c1337Xw) {
        return A03(c1337Xw) && C1013Lg.A03(c1337Xw);
    }

    public static boolean A03(C1337Xw c1337Xw) {
        if (c1337Xw == null) {
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) c1337Xw.getSystemService(A00(60, 5, 18));
            if (Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
            return powerManager.isScreenOn();
        } catch (Exception e10) {
            Log.e(A01, A00(0, 60, 8), e10);
            c1337Xw.A07().A9K(A00(65, 5, 73), C06937v.A2R, new C06947w(e10));
            return true;
        }
    }
}
