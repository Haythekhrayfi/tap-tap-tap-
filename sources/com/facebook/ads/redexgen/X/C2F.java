package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2F {
    public static C2E A00;
    public static byte[] A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, 61, 42, 119, Ascii.CAN, Ascii.GS, 6, 11, Ascii.FS, 9, 22, 11, 13, 16, 23, Ascii.RS, 6, Ascii.SUB, 22, 23, Ascii.US, 16, Ascii.RS};
    }

    public static C2E A00(C1336Xv c1336Xv) {
        if (A00 == null) {
            synchronized (C2E.class) {
                if (A00 == null) {
                    A00 = new C2E(new ZO(c1336Xv.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 116), c1336Xv), 0)));
                }
            }
        }
        return A00;
    }
}
