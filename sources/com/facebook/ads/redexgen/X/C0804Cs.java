package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0804Cs {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{12, Ascii.CAN, Ascii.SUB, 17, Ascii.SUB, 13, Ascii.RS, 11, Ascii.SUB, 49, Ascii.SUB, 8, 54, Ascii.ESC, 87, 86, 95, 18, 10, 12, 11, 95, Ascii.GS, Ascii.SUB, 95, Ascii.FS, Ascii.RS, 19, 19, Ascii.SUB, Ascii.ESC, 95, Ascii.GS, Ascii.SUB, Ascii.EM, 16, 13, Ascii.SUB, 95, 13, Ascii.SUB, 11, 13, 22, Ascii.SUB, 9, 22, 17, Ascii.CAN, 95, 22, Ascii.ESC, 12, 81};
    }

    public C0804Cs(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public C0804Cs(int i10, int i11, int i12) {
        this.A04 = i10 != Integer.MIN_VALUE ? i10 + A00(0, 1, 31) : A00(0, 0, 77);
        this.A02 = i11;
        this.A03 = i12;
        this.A00 = Integer.MIN_VALUE;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException(A00(1, 53, 67));
        }
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        int i10 = this.A00;
        this.A00 = i10 == Integer.MIN_VALUE ? this.A02 : i10 + this.A03;
        this.A01 = this.A04 + this.A00;
    }
}
