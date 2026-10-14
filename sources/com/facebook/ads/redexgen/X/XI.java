package com.facebook.ads.redexgen.X;

import ch.qos.logback.classic.Level;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XI implements C9X {
    public static byte[] A0A;
    public static String[] A0B = {"QBw2naITCC87BBmeZEHB", "QG9qcoN67OZ9HCiBeCwQ37yZ8k9VzRIx", "huClURZcVSvs210svchTpygB", "SPjUxwmyMxCkovVHB3ukUPObWP0MyL9L", "Qo3gDbJmZiOUOvD4YrLGADsp8gVNY68y", "aCbITSFANaeoynFt6tlPTZT3Ud0BkJzi", "LC42BZreN0Trrj0tndAjNl8pur2kDdxK", "yIqlj0SUGgDzqSotNJk32MbE6gj6YGfF"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final V5 A07;
    public final C0918Hj A08;
    public final boolean A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{-97, -30, -32, -19, -19, -18, -13, -97, -31, -28, -97, -21, -28, -14, -14, -97, -13, -25, -32, -19, -97, -55, -27, -8, -23, -23, -24, -11, -55, -14, -11, -45, -17, -28, -4, -27, -28, -26, -18, -60, -23, -9, -24, -11, -43, -24, -27, -8, -23, -23, -24, -11, -48, -10, 3, 22, 7, 7, 6, 19, -25, 16, 19, -15, 13, 2, Ascii.SUB, 3, 2, 4, 12, -18, 20, Ascii.EM, 13, 36, -18, 33, 18, 18, 17, Ascii.RS, -7, Ascii.US, -64, -68, -63, -107, -56, -71, -71, -72, -59, -96, -58};
    }

    static {
        A02();
    }

    public XI() {
        this(new V5(true, 65536));
    }

    @Deprecated
    public XI(V5 v10) {
        this(v10, 15000, 50000, 2500, Level.TRACE_INT, -1, true);
    }

    @Deprecated
    public XI(V5 v10, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this(v10, i10, i11, i12, i13, i14, z10, null);
    }

    @Deprecated
    public XI(V5 v10, int i10, int i11, int i12, int i13, int i14, boolean z10, C0918Hj c0918Hj) {
        String strA01 = A01(54, 19, 78);
        String strA02 = A01(21, 1, 70);
        A03(i12, 0, strA01, strA02);
        String strA03 = A01(22, 32, 48);
        A03(i13, 0, strA03, strA02);
        String strA04 = A01(84, 11, 0);
        A03(i10, i12, strA04, strA01);
        A03(i10, i13, strA04, strA03);
        A03(i11, i10, A01(73, 11, 89), strA04);
        this.A07 = v10;
        this.A06 = ((long) i10) * 1000;
        this.A05 = ((long) i11) * 1000;
        this.A04 = ((long) i12) * 1000;
        this.A03 = ((long) i13) * 1000;
        this.A02 = i14;
        this.A09 = z10;
        this.A08 = c0918Hj;
    }

    private final int A00(XE[] xeArr, GN gn) {
        int iA01 = 0;
        for (int i10 = 0; i10 < targetBufferSize; i10++) {
            if (gn.A00(i10) != null) {
                int targetBufferSize = xeArr[i10].A82();
                iA01 += C0930Hv.A01(targetBufferSize);
            }
        }
        return iA01;
    }

    public static void A03(int i10, int i11, String str, String str2) {
        HG.A05(i10 >= i11, str + A01(0, 21, 44) + str2);
    }

    private void A04(boolean z10) {
        this.A00 = 0;
        C0918Hj c0918Hj = this.A08;
        if (c0918Hj != null && this.A01) {
            c0918Hj.A03(0);
        }
        this.A01 = false;
        if (z10) {
            this.A07.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C9X
    public final V5 A5u() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C9X
    public final long A5z() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.C9X
    public final void ACV() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.C9X
    public final void ACt() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.X.C9X
    public final void AD2(XE[] xeArr, TrackGroupArray trackGroupArray, GN gn) {
        int iA00 = this.A02;
        if (iA00 == -1) {
            iA00 = A00(xeArr, gn);
        }
        this.A00 = iA00;
        this.A07.A04(iA00);
    }

    @Override // com.facebook.ads.redexgen.X.C9X
    public final boolean AEd() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C9X
    public final boolean AFM(long j10, float f10) {
        boolean targetBufferSizeReached;
        boolean z10 = true;
        boolean z11 = this.A07.A02() >= this.A00;
        boolean z12 = this.A01;
        long jMin = this.A06;
        if (f10 > 1.0f) {
            jMin = Math.min(C0930Hv.A0C(jMin, f10), this.A05);
        }
        if (j10 < jMin) {
            if (!this.A09 && z11) {
                z10 = false;
            }
            this.A01 = z10;
        } else if (j10 > this.A05 || z11) {
            this.A01 = false;
        }
        C0918Hj c0918Hj = this.A08;
        if (A0B[0].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[1] = "QKQzs8A5eNnCMvZO6Czn4VC5jQwn3nPR";
        strArr[4] = "QpEe5JzrMZm1KKJ9dYBmwnmG628Fesko";
        if (c0918Hj != null && (targetBufferSizeReached = this.A01) != z12) {
            if (targetBufferSizeReached) {
                c0918Hj.A00(0);
            } else {
                c0918Hj.A03(0);
            }
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C9X
    public final boolean AFP(long j10, float f10, boolean z10) {
        long jA0D = C0930Hv.A0D(j10, f10);
        long j11 = z10 ? this.A03 : this.A04;
        return j11 <= 0 || jA0D >= j11 || (!this.A09 && this.A07.A02() >= this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C9X
    public final void onPrepared() {
        A04(false);
    }
}
