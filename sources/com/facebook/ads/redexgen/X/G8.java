package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G8 {
    public static byte[] A00;
    public static String[] A01 = {"mrSAwXtvA48pKDbYm7Wldl5aXQuRkGdI", "fbJ004pbEzPzRxWccwuVKG55hrVCh", "rUGvTWjAKrexOA4wkcPi8vLiUWrJjNTX", "GXri66PfJCwBQDboa2OTJvm", "EWHNad80frv4tcDt6njDAOtFLZM1nox1", "w8DKXrbkod7LTDg6ra7kwJaOsoQJy0WV", "9chw5e5", "pdwJMmZou7a5Bc5N0u9b6z7FU4fjoJm4"};
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[4].charAt(7) == 'a') {
                throw new RuntimeException();
            }
            A01[4] = "NgHJChfDsWA9aQDgFnI07vXtmTssrLt0";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 103);
            i13++;
        }
    }

    public static void A03() {
        A00 = new byte[]{7, -39, -35, 16, 8, -3, -5, 12, -3, -4, -72, -17, -35, -38, -18, -20, -20, -58, -72, -33, 7, 12, -72, -12, 9, 22, 7, 9, 18, Ascii.CAN, 5, 11, 9, 23, -60, 17, Ascii.EM, 23, Ascii.CAN, -60, 9, 18, 8, -60, Ascii.ESC, 13, Ascii.CAN, 12, -60, -55, -45, -91, 55, 39, 40, 45, Ascii.RS, 1, 1, -7, 85, -30, 2, 7, 3, 2, Ascii.CAN, -3, -27, 118, 66, 70, -58, -34, -52, -55, -35, -37, -37, -81, -81, -89, 3, -112, -80, -75, -79, -80, -58, -85};
    }

    static {
        A03();
        A02 = Pattern.compile(A02(52, 16, 114));
        A03 = Pattern.compile(A02(68, 22, 32));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(0, 1, 123))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(23, 27, 61));
    }

    public static long A01(String str) throws NumberFormatException {
        long j10 = 0;
        String[] strArrA0m = C0930Hv.A0m(str, A02(50, 2, 16));
        for (String str2 : C0930Hv.A0l(strArrA0m[0], A02(1, 1, 56))) {
            long value = Long.parseLong(str2);
            j10 = (60 * j10) + value;
        }
        long j11 = j10 * 1000;
        if (strArrA0m.length == 2) {
            long value2 = Long.parseLong(strArrA0m[1]);
            j11 += value2;
        }
        return 1000 * j11;
    }

    public static void A04(C0914Hf c0914Hf) throws FV {
        String strA0P = c0914Hf.A0P();
        if (strA0P != null && A03.matcher(strA0P).matches()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        String line = A02(2, 21, 49);
        throw new FV(sb2.append(line).append(strA0P).toString());
    }
}
