package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V5 implements GS {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public GR[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final GR[] A07;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{100, 104, 40, 19, Ascii.CAN, 5, 13, Ascii.CAN, Ascii.RS, 9, Ascii.CAN, Ascii.EM, 93, Ascii.FS, 17, 17, 18, Ascii.RS, Ascii.FS, 9, 20, 18, 19, 71, 93};
    }

    public V5(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public V5(boolean z10, int i10, int i11) {
        HG.A03(i10 > 0);
        HG.A03(i11 >= 0);
        this.A05 = z10;
        this.A04 = i10;
        this.A01 = i11;
        this.A03 = new GR[i11 + 100];
        if (i11 > 0) {
            this.A06 = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.A03[i12] = new GR(this.A06, i12 * i10);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new GR[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i10) {
        boolean targetBufferSizeReduced = i10 < this.A02;
        this.A02 = i10;
        if (targetBufferSizeReduced) {
            AFn();
        }
    }

    @Override // com.facebook.ads.redexgen.X.GS
    public final synchronized GR A3S() {
        GR gr;
        this.A00++;
        int i10 = this.A01;
        if (i10 > 0) {
            GR[] grArr = this.A03;
            int i11 = i10 - 1;
            this.A01 = i11;
            gr = grArr[i11];
            grArr[i11] = null;
        } else {
            gr = new GR(new byte[this.A04], 0);
        }
        return gr;
    }

    @Override // com.facebook.ads.redexgen.X.GS
    public final int A75() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.GS
    public final synchronized void AEE(GR gr) {
        GR[] grArr = this.A07;
        grArr[0] = gr;
        AEF(grArr);
    }

    @Override // com.facebook.ads.redexgen.X.GS
    public final synchronized void AEF(GR[] grArr) {
        int i10 = this.A01;
        int length = grArr.length + i10;
        GR[] grArr2 = this.A03;
        if (length >= grArr2.length) {
            this.A03 = (GR[]) Arrays.copyOf(grArr2, Math.max(grArr2.length * 2, i10 + grArr.length));
        }
        for (GR gr : grArr) {
            if (gr.A01 == this.A06 || gr.A01.length == this.A04) {
                GR[] grArr3 = this.A03;
                int i11 = this.A01;
                this.A01 = i11 + 1;
                grArr3[i11] = gr;
            } else {
                throw new IllegalArgumentException(A00(2, 23, 110) + System.identityHashCode(gr.A01) + A00(0, 2, 91) + System.identityHashCode(this.A06) + A00(0, 2, 91) + gr.A01.length + A00(0, 2, 91) + this.A04);
            }
        }
        this.A00 -= grArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.GS
    public final synchronized void AFn() {
        int iA04 = C0930Hv.A04(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int highIndex = Math.max(0, iA04 - targetAllocationCount);
        int targetAvailableCount = this.A01;
        if (highIndex >= targetAvailableCount) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int i10 = targetAvailableCount - 1;
            while (lowIndex <= i10) {
                GR highAllocation = this.A03[lowIndex];
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    GR lowAllocation = this.A03[i10];
                    if (lowAllocation.A01 != this.A06) {
                        i10--;
                    } else {
                        GR[] grArr = this.A03;
                        grArr[lowIndex] = lowAllocation;
                        int targetAllocationCount2 = i10 - 1;
                        grArr[i10] = highAllocation;
                        i10 = targetAllocationCount2;
                        lowIndex++;
                    }
                }
            }
            highIndex = Math.max(highIndex, lowIndex);
            int targetAllocationCount3 = this.A01;
            if (highIndex >= targetAllocationCount3) {
                return;
            }
        }
        Arrays.fill(this.A03, highIndex, this.A01, (Object) null);
        this.A01 = highIndex;
    }
}
