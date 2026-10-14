package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WW extends AbstractC0790Bz {
    public static byte[] A03;
    public final long A00;
    public final List<WW> A01;
    public final List<WV> A02;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{12, 79, 67, 66, 88, 77, 69, 66, 73, 94, 95, 22, 12, 79, 3, 10, 14, Ascii.EM, 10, Ascii.FS, 85, 79};
    }

    public WW(int i10, long j10) {
        super(i10);
        this.A00 = j10;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final WW A06(int i10) {
        int size = this.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            WW ww = this.A01.get(i11);
            int childrenSize = ((AbstractC0790Bz) ww).A00;
            if (childrenSize == i10) {
                return ww;
            }
        }
        return null;
    }

    public final WV A07(int i10) {
        int size = this.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            WV wv = this.A02.get(i11);
            int childrenSize = ((AbstractC0790Bz) wv).A00;
            if (childrenSize == i10) {
                return wv;
            }
        }
        return null;
    }

    public final void A08(WW ww) {
        this.A01.add(ww);
    }

    public final void A09(WV wv) {
        this.A02.add(wv);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0790Bz
    public final String toString() {
        return AbstractC0790Bz.A02(super.A00) + A04(13, 9, 69) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 6) + Arrays.toString(this.A01.toArray());
    }
}
