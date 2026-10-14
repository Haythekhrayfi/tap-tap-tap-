package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0863Fe {
    public static byte[] A00;
    public static String[] A01 = {"UAa0Z", "y84zlLC7EVblAi9s6IjzDwtWlv", "hWSmc3nAoC6lO20JdXQ8UQAJh4", "HAxIJdFwG2BHjJ6kBVBijNmfixc4v4eM", "sMFPtSIIwmEBUNkX5nfAspCddytOxG7k", "XuEZcwrwjFPAmN9wFCdffjeuCf3K5K0k", "0bJFkLVdjL4ExnLkyIfxNw93FYOhEgu9", "GtmYUKm65Uny9K5bn1TkELKUpeSnjSJ3"};
    public static final int A02;
    public static final int A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{56, Ascii.RS, Ascii.SUB, 46, 15, 18, 23, 37, 53, 38, 80, 40, 46, 86, 91, 108, 84, 86, 79, 79, 86, 81, 88, Ascii.US, 77, 90, 82, 94, 86, 81, 91, 90, 77, Ascii.US, 80, 89, Ascii.US, 82, 94, 83, 89, 80, 77, 82, 90, 91, Ascii.US, 108, 122, 118, Ascii.US, 113, 126, 115, Ascii.US, 74, 81, 86, 75, 17};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A03(long j10, C0914Hf c0914Hf, InterfaceC0782Bk[] interfaceC0782BkArr) {
        while (c0914Hf.A04() > 1) {
            int iA00 = A00(c0914Hf);
            int iA01 = A00(c0914Hf);
            int iA06 = c0914Hf.A06();
            if (A01[3].charAt(16) != 'B') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "sJRWMhzWyXWsYNwcYdMxu9waYeZJW4nD";
            strArr[5] = "JDck5DNLGL8VXNpOftdo1S17ghv9bSuy";
            int iA07 = iA06 + iA01;
            if (iA01 == -1 || iA01 > c0914Hf.A04()) {
                Log.w(A01(0, 7, 76), A01(15, 45, 8));
                iA07 = c0914Hf.A07();
            } else if (iA00 == 4 && iA01 >= 8) {
                int iA0E = c0914Hf.A0E();
                int iA0I = c0914Hf.A0I();
                int iA08 = iA0I == 49 ? c0914Hf.A08() : 0;
                int iA0E2 = c0914Hf.A0E();
                if (iA0I == 47) {
                    c0914Hf.A0Z(1);
                }
                boolean z10 = iA0E == 181 && (iA0I == 49 || iA0I == 47) && iA0E2 == 3;
                if (iA0I == 49) {
                    z10 &= iA08 == A03 || iA08 == A02;
                }
                if (z10) {
                    int iA0E3 = c0914Hf.A0E() & 31;
                    c0914Hf.A0Z(1);
                    int i10 = iA0E3 * 3;
                    int iA09 = c0914Hf.A06();
                    for (InterfaceC0782Bk interfaceC0782Bk : interfaceC0782BkArr) {
                        c0914Hf.A0Y(iA09);
                        interfaceC0782Bk.AEg(c0914Hf, i10);
                        interfaceC0782Bk.AEh(j10, 1, i10, 0, null);
                    }
                }
            }
            c0914Hf.A0Y(iA07);
        }
    }

    static {
        A02();
        A03 = C0930Hv.A08(A01(11, 4, 88));
        A02 = C0930Hv.A08(A01(7, 4, 86));
    }

    public static int A00(C0914Hf c0914Hf) {
        int i10 = 0;
        while (value != 0) {
            int b10 = c0914Hf.A0E();
            i10 += b10;
            if (b10 != 255) {
                return i10;
            }
        }
        if (A01[0].length() != 5) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "XY7JbweA6fzPXsut6MPl2wkiFN";
        strArr[1] = "9Cope1RtGoIRUkWui2tRq11YR8";
        return -1;
    }
}
