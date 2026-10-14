package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SF extends K4 {
    public static byte[] A01;
    public static String[] A02 = {"WjVP47fRQbzFkvh8jITH65ubc4v5SvCG", "KHLch0xvttS1s7pDGgDEm0ErGuqh2Feh", "", "N5tYdahQHQ8ekE9zsl4KMP3kvK277KXb", "RTyub6Z4XGd49fcp4oLDuBYuJ7e8bv6c", "EESkLRk7pQiV173Cki8Pyh", "g0C3qbvxb6pNRGtaTLmHtkzFJg0jsK6T", "9AN"};
    public final /* synthetic */ SC A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[1].charAt(5) != '0') {
                throw new RuntimeException();
            }
            A02[4] = "dM73aw5ks7hDwKSnbdFWLVfeJ3xGYIch";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i14 = (bArrCopyOfRange[i13] - i12) - 81;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[5].length()) {
                A02[0] = "hwwcl2mktrJEeqefr8kwHu1pjzQ1LhvY";
                bArrCopyOfRange[i13] = (byte) i14;
                i13++;
            } else {
                A02[7] = "CzI";
                bArrCopyOfRange[i13] = (byte) i14;
                i13 += 0;
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{Ascii.ESC, 46, 41, 42, 52, -27, 60, 38, 56, -27, 51, 42, 59, 42, 55, -27, 53, 55, 42, 53, 38, 55, 42, 41};
    }

    static {
        A02();
    }

    public SF(SC sc2) {
        this.A00 = sc2;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (!this.A00.A07) {
            this.A00.A0F.ADC(A00(0, 24, 116));
        }
    }
}
