package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8F, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum C8F {
    A05,
    A04,
    A03;

    public static byte[] A00;
    public static String[] A01 = {"PRV2czZbjjW7Ot8uaJuxnRGNdIXO90ph", "gwx3lgvxFr5Ur4U2", "dsOpW9WfLYJghusiq4Ru5jQxxgYMnVUV", "Pl2vgN3HXqbbKxjZzIk4bg0eix12xhJu", "GcMaFESaYtqWHDueobHkP3OuSFimx", "24r37uIww3uTwRKO2qndV6iCHFSPOn3z", "z2MMJP2kfG1jeTB65BQHm0", "ohb3NNZFp"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            if (A01[3].charAt(9) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "qn8tosrMnBeOYh3nA69X7hpHPvfrKSD7";
            strArr[0] = "8KW7HxISbWo03NIKRfZKM6CMMG4fzKY9";
            bArrCopyOfRange[i13] = (byte) (i14 - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{18, Ascii.ESC, Ascii.CAN, 18, Ascii.SUB, -57, -53, -50, -48, -61, -47, -47, -57, -51, -52, -70, -83, -71, -67, -83, -69, -68};
    }

    static {
        A01();
    }
}
