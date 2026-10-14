package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D1 implements WY {
    public static byte[] A03;
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 75, Ascii.GS, 9, Ascii.EM, 2, 107, 47, 42, 63, 42, 107, 56, 34, 49, 46, 107, 38, 34, 56, 38, 42, 63, 40, 35, 113, 107, 0, 52, 36, 63, 5, 51, 51, 61, 51, 36};
    }

    public D1(long[] jArr, long[] jArr2, long j10) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j10;
    }

    public static D1 A00(long j10, long j11, Be be2, C0914Hf c0914Hf) {
        int iA0H;
        long j12 = j11;
        c0914Hf.A0Z(10);
        int numFrames = c0914Hf.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = be2.A03;
        long jA0F = C0930Hv.A0F(numFrames, 1000000 * ((long) (sampleRate >= 32000 ? 1152 : 576)), sampleRate);
        int iA0I = c0914Hf.A0I();
        int numFrames2 = c0914Hf.A0I();
        int iA0I2 = c0914Hf.A0I();
        c0914Hf.A0Z(2);
        long j13 = j12 + ((long) be2.A02);
        long[] jArr = new long[iA0I];
        long[] jArr2 = new long[iA0I];
        for (int scale = 0; scale < iA0I; scale++) {
            jArr[scale] = (((long) scale) * jA0F) / ((long) iA0I);
            jArr2[scale] = Math.max(j12, j13);
            switch (iA0I2) {
                case 1:
                    iA0H = c0914Hf.A0E();
                    break;
                case 2:
                    iA0H = c0914Hf.A0I();
                    break;
                case 3:
                    iA0H = c0914Hf.A0G();
                    break;
                case 4:
                    iA0H = c0914Hf.A0H();
                    break;
                default:
                    return null;
            }
            j12 += (long) (iA0H * numFrames2);
        }
        if (j10 != -1 && j10 != j12) {
            Log.w(A01(27, 10, 87), A01(2, 25, 74) + j10 + A01(0, 2, 106) + j12);
        }
        return new D1(jArr, jArr2, jA0F);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final long A6j() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final C0778Bg A7k(long j10) {
        int iA0B = C0930Hv.A0B(this.A02, j10, true, true);
        C0780Bi c0780Bi = new C0780Bi(this.A02[iA0B], this.A01[iA0B]);
        if (c0780Bi.A01 < j10) {
            int tableIndex = this.A02.length;
            if (iA0B != tableIndex - 1) {
                int tableIndex2 = iA0B + 1;
                long j11 = this.A02[tableIndex2];
                int tableIndex3 = iA0B + 1;
                C0780Bi nextSeekPoint = new C0780Bi(j11, this.A01[tableIndex3]);
                return new C0778Bg(c0780Bi, nextSeekPoint);
            }
        }
        return new C0778Bg(c0780Bi);
    }

    @Override // com.facebook.ads.redexgen.X.WY
    public final long A7y(long j10) {
        return this.A02[C0930Hv.A0B(this.A01, j10, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final boolean A93() {
        return true;
    }
}
