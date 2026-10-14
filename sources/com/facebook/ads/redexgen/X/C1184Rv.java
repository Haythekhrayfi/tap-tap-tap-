package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1184Rv extends K4 {
    public static byte[] A01;
    public static String[] A02 = {"aQtlI1Us5cYHMsIV", "ql6TdDFLVKaOF", "ILd0cBh", "B0sTrIURZDTgtQOqZ9wP44Me", "PUGSIMdaF2lm0BEktB", "ig45kctSq2tkP", "eb7l2wEenDPHh06UHeaR81tCSX", "F61vU5UciYvMkd8uRJU0Fm"};
    public final /* synthetic */ C7I A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A02[7] = "csAIefbP6dEHufce3C5MSz";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 117);
            i13++;
        }
    }

    public static void A02() {
        A01 = new byte[]{67, 86, 81, 82, 92, 13, 91, 82, 99, 82, 95, 13, 96, 97, 78, 95, 97, 82, 81, 13, 93, 89, 78, 102, 86, 91, 84};
    }

    static {
        A02();
    }

    public C1184Rv(C7I c7i) {
        this.A00 = c7i;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        if (!this.A00.A08) {
            this.A00.A0G(A00(0, 27, 120));
        }
    }
}
