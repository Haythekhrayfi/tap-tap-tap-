package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class D0 implements WY {
    public static byte[] A05;
    public static String[] A06 = {"ilqNaxLa84KwPxLclQkuXaDAjXKjVBay", "YYRGnxFlW9XodSzMr5d0AgWnEUGN8SAb", "TFjL0s25LaCBEteV0vZTEC31LOIwZtzx", "GUmZTVO9tTTKl3Mpcsedxo5lbewk1Lj3", "rxyeYW6RMQKKTnfalukPqNZ2KBfsB6S5", "mDRU4t7MoPNm7z5QI5KjgmazMAxk28NE", "eki8tF0EBXj6l5GM9f5RfEnwS82fHKRK", "1REkWmsZMDj0bgzORsQu3VEtsLn99tZ6"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static D0 A01(long j10, long j11, Be be2, C0914Hf c0914Hf) {
        int iA0H;
        int i10 = be2.A04;
        int i11 = be2.A03;
        int iA08 = c0914Hf.A08();
        if ((iA08 & 1) != 1 || (iA0H = c0914Hf.A0H()) == 0) {
            return null;
        }
        long jA0F = C0930Hv.A0F(iA0H, ((long) i10) * 1000000, i11);
        if ((iA08 & 6) != 6) {
            return new D0(j11, be2.A02, jA0F);
        }
        long jA0H = c0914Hf.A0H();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = c0914Hf.A0E();
        }
        if (j10 != -1 && j10 != j11 + jA0H) {
            Log.w(A02(27, 10, 25), A02(2, 25, 119) + j10 + A02(0, 2, 77) + (j11 + jA0H));
        }
        return new D0(j11, be2.A02, jA0F, jA0H, jArr);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-24, -36, 62, 47, 52, 45, 6, 74, 71, 90, 71, 6, 89, 79, 96, 75, 6, 83, 79, 89, 83, 71, 90, 73, 78, 32, 6, -32, -15, -10, -17, -37, -19, -19, -13, -19, -6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.X.WY
    public final long A7y(long j10) {
        long j11 = j10 - this.A02;
        if (!A93()) {
            return 0L;
        }
        int i10 = this.A00;
        String[] strArr = A06;
        if (strArr[5].charAt(8) == strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "W8nk4dNFk5UYs2ixe7nvUw2jVo0XpVlf";
        strArr2[2] = "94Ku6bJ3HPlMD7WZMvisRyq3A9jYmrd2";
        if (j11 <= i10) {
            return 0L;
        }
        double d10 = (j11 * 256.0d) / this.A01;
        int iA0B = C0930Hv.A0B(this.A04, (long) d10, true, true);
        long jA00 = A00(iA0B);
        long j12 = this.A04[iA0B];
        long jA01 = A00(iA0B + 1);
        long j13 = iA0B == 99 ? 256L : this.A04[iA0B + 1];
        return Math.round((jA01 - jA00) * (j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12))) + jA00;
    }

    static {
        A03();
    }

    public D0(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public D0(long j10, int i10, long j11, long j12, long[] jArr) {
        this.A02 = j10;
        this.A00 = i10;
        this.A03 = j11;
        this.A01 = j12;
        this.A04 = jArr;
    }

    private long A00(int i10) {
        return (this.A03 * ((long) i10)) / 100;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final long A6j() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final C0778Bg A7k(long j10) {
        double scaledPosition;
        if (!A93()) {
            return new C0778Bg(new C0780Bi(0L, this.A02 + ((long) this.A00)));
        }
        long jA0E = C0930Hv.A0E(j10, 0L, this.A03);
        double d10 = (jA0E * 100.0d) / this.A03;
        if (d10 <= 0.0d) {
            scaledPosition = 0.0d;
        } else if (d10 >= 100.0d) {
            scaledPosition = 256.0d;
        } else {
            int i10 = (int) d10;
            long[] jArr = this.A04;
            double prevScaledPosition = jArr[i10];
            double d11 = i10 == 99 ? 256.0d : jArr[i10 + 1];
            double d12 = i10;
            String[] strArr = A06;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "OMtgh7AGIO6dejZGwnLWpymQ4IFINQQk";
            strArr2[2] = "IsjlGA9bpSadN6h09kE1zH4HNrdroVjr";
            scaledPosition = ((d11 - prevScaledPosition) * (d10 - d12)) + prevScaledPosition;
        }
        long jRound = Math.round((scaledPosition / 256.0d) * this.A01);
        long positionOffset = this.A00;
        return new C0778Bg(new C0780Bi(jA0E, this.A02 + C0930Hv.A0E(jRound, positionOffset, this.A01 - 1)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final boolean A93() {
        return this.A04 != null;
    }
}
