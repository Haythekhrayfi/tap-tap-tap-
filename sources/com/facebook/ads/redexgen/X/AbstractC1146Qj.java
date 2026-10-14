package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1146Qj {
    public static byte[] A05;
    public C1142Qf A00;
    public EnumC1145Qi A01;
    public String A02;
    public String A03;
    public byte[] A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{119};
    }

    public AbstractC1146Qj(String str, C1148Ql c1148Ql, C1142Qf c1142Qf) {
        this.A03 = A00(0, 0, 77);
        if (str != null) {
            this.A03 = str;
        }
        if (c1148Ql != null && !c1148Ql.A06().isEmpty()) {
            this.A03 += A00(0, 1, 35) + c1148Ql.A06();
        }
        this.A00 = c1142Qf;
    }

    public final C1142Qf A02() {
        return this.A00;
    }

    public final EnumC1145Qi A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A03;
    }

    public final byte[] A06() {
        return this.A04;
    }
}
