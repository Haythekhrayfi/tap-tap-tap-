package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0807Cv {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1277Vo A00(BZ bz) throws InterruptedException, IOException {
        HG.A01(bz);
        C0914Hf c0914Hf = new C0914Hf(16);
        if (C0806Cu.A00(bz, c0914Hf).A00 != C0930Hv.A08(A01(111, 4, 112))) {
            return null;
        }
        int iA02 = 0;
        bz.ADa(c0914Hf.A00, 0, 4);
        c0914Hf.A0Y(0);
        int iA08 = c0914Hf.A08();
        int iA09 = C0930Hv.A08(A01(195, 4, 13));
        String strA01 = A01(199, 15, 13);
        if (iA08 != iA09) {
            Log.e(strA01, A01(115, 25, 27) + iA08);
            return null;
        }
        C0806Cu c0806CuA00 = C0806Cu.A00(bz, c0914Hf);
        while (c0806CuA00.A00 != C0930Hv.A08(A01(218, 4, 32))) {
            bz.A3R((int) c0806CuA00.A01);
            c0806CuA00 = C0806Cu.A00(bz, c0914Hf);
        }
        HG.A04(c0806CuA00.A01 >= 16);
        bz.ADa(c0914Hf.A00, 0, 16);
        c0914Hf.A0Y(0);
        int iA0C = c0914Hf.A0C();
        int iA0C2 = c0914Hf.A0C();
        int iA0B = c0914Hf.A0B();
        int iA0B2 = c0914Hf.A0B();
        int iA0C3 = c0914Hf.A0C();
        int iA0C4 = c0914Hf.A0C();
        int i10 = (iA0C2 * iA0C4) / 8;
        if (iA0C3 != i10) {
            throw new C07249b(A01(57, 26, 48) + i10 + A01(10, 7, 62) + iA0C3);
        }
        switch (iA0C) {
            case 1:
            case 65534:
                iA02 = C0930Hv.A02(iA0C4);
                break;
            case 3:
                if (iA0C4 == 32) {
                    iA02 = 4;
                }
                break;
            default:
                Log.e(strA01, A01(166, 29, 30) + iA0C);
                return null;
        }
        if (iA02 == 0) {
            Log.e(strA01, A01(140, 26, 101) + iA0C4 + A01(0, 10, 35) + iA0C);
            return null;
        }
        bz.A3R(((int) c0806CuA00.A01) - 16);
        return new C1277Vo(iA0C2, iA0B, iA0B2, iA0C3, iA0C4, iA02);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{39, 97, 104, 117, 39, 115, 126, 119, 98, 39, 33, 58, 125, 117, 110, 32, 58, 123, 80, 77, 86, 83, Ascii.CAN, 81, 75, Ascii.CAN, 76, 87, 87, Ascii.CAN, 84, 89, 74, 95, 93, Ascii.CAN, 16, 70, 10, Ascii.DEL, 122, 19, 17, Ascii.CAN, 76, 87, Ascii.CAN, 75, 83, 81, 72, 3, Ascii.CAN, 81, 92, 2, Ascii.CAN, 81, 108, 100, 113, 119, 96, 113, 112, 52, 118, 120, 123, 119, Ascii.DEL, 52, 117, 120, 125, 115, 122, 121, 113, 122, 96, 46, 52, 103, 73, 64, 65, 92, 71, 64, 73, 14, 91, 64, 69, 64, 65, 89, 64, 14, 121, 111, 120, 14, 77, 70, 91, 64, 69, 20, 14, 6, Ascii.GS, 18, 18, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, Ascii.US, 109, 118, 121, 121, Ascii.US, 89, 80, 77, 82, 94, 75, 5, Ascii.US, 20, 47, 50, 52, 49, 49, 46, 51, 53, 36, 37, 97, 22, 0, 23, 97, 35, 40, 53, 97, 37, 36, 49, 53, 41, 97, 111, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, Ascii.SUB, 109, 123, 108, Ascii.SUB, 92, 85, 72, 87, 91, 78, Ascii.SUB, 78, 67, 74, 95, 0, Ascii.SUB, 126, 104, Ascii.DEL, 108, 126, 72, 95, 97, 76, 72, 77, 76, 91, 123, 76, 72, 77, 76, 91, 10, 15, Ascii.SUB, 15, 98, 105, 112, 36};
    }

    public static void A03(BZ bz, C1277Vo c1277Vo) throws InterruptedException, IOException {
        HG.A01(bz);
        HG.A01(c1277Vo);
        bz.AEb();
        C0914Hf c0914Hf = new C0914Hf(8);
        C0806Cu c0806CuA00 = C0806Cu.A00(bz, c0914Hf);
        while (c0806CuA00.A00 != C0930Hv.A08(A01(214, 4, 74))) {
            Log.w(A01(199, 15, 13), A01(83, 28, 10) + c0806CuA00.A00);
            long j10 = c0806CuA00.A01 + 8;
            if (c0806CuA00.A00 == C0930Hv.A08(A01(111, 4, 112))) {
                j10 = 12;
            }
            if (j10 <= 2147483647L) {
                bz.AFT((int) j10);
                c0806CuA00 = C0806Cu.A00(bz, c0914Hf);
            } else {
                throw new C07249b(A01(17, 40, 28) + c0806CuA00.A00);
            }
        }
        bz.AFT(8);
        c1277Vo.A06(bz.A7Z(), c0806CuA00.A01);
    }
}
