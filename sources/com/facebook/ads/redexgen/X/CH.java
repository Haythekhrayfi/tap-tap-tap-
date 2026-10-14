package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CH {
    public static byte[] A00;
    public static String[] A01 = {"vniJFRP", "oJtPNZwcQG6hLH64wW6tXvk3sbQ9WwGW", "zry57w6QfhfaFpFxdZgKHC1xYn", "fo4QeY", "i9CLNlynjhorIFu8zs9NEh7lWGRKe1E6", "M5SbcVIJ6zX6bTvbAFwxovtl6mtBjy6T", "O1VKgn8XNf4GQEXWcT9RCCs6YBao3Pp0", "jcDd8FEzgCzhSc3FOh8Nko0kxmmUpCTh"};

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-28, 7, 7, -4, -43, 8, 3, 1, -23, 8, -3, 0, -85, -60, -55, -53, -58, -58, -59, -56, -54, -69, -70, 118, -58, -55, -55, -66, 118, -52, -69, -56, -55, -65, -59, -60, -112, 118};
    }

    static {
        A04();
    }

    public static int A00(byte[] bArr) {
        CG parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            return parsedAtom.A00;
        }
        if (A01[0].length() == 21) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "fw1Vu3";
        strArr[2] = "Fgm9cv2CAdprrHHvAJvClRGcka";
        return -1;
    }

    public static CG A01(byte[] bArr) {
        C0914Hf c0914Hf = new C0914Hf(bArr);
        if (c0914Hf.A07() < 32) {
            return null;
        }
        c0914Hf.A0Y(0);
        if (c0914Hf.A08() != c0914Hf.A04() + 4 || c0914Hf.A08() != AbstractC0790Bz.A0s) {
            return null;
        }
        int dataSize = AbstractC0790Bz.A01(c0914Hf.A08());
        if (dataSize > 1) {
            Log.w(A02(0, 12, 98), A02(12, 26, 36) + dataSize);
            return null;
        }
        UUID uuid = new UUID(c0914Hf.A0L(), c0914Hf.A0L());
        if (dataSize == 1) {
            int atomType = c0914Hf.A0H() * 16;
            if (A01[0].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "thpi9L";
            strArr[2] = "TMAT5NZ1bWTkNSNpNaLonMSfAF";
            c0914Hf.A0Z(atomType);
        }
        int iA0H = c0914Hf.A0H();
        if (iA0H != c0914Hf.A04()) {
            return null;
        }
        byte[] bArr2 = new byte[iA0H];
        c0914Hf.A0c(bArr2, 0, iA0H);
        return new CG(uuid, dataSize, bArr2);
    }

    public static UUID A03(byte[] bArr) {
        CG parsedAtom = A01(bArr);
        if (parsedAtom != null) {
            return parsedAtom.A01;
        }
        return null;
    }
}
