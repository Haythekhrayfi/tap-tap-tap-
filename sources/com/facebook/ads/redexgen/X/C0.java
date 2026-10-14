package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0 {
    public static byte[] A09;
    public static String[] A0A = {"WDcyaL9oeoAbLzImXLrrdZNjVRrzcxRy", "ME9PFK50DMSVlKN2bxn", "gAphC5qX8pzOC3bbBnmZFpQJv5fhqgvp", "JPEMy1g84hpaqLtC7n4l8lpeHeJzlyM", "bln1Uon0G", "FjG6mf5q9yXvdNgXZQEHKWlpLPgsZNOr", "dYpTLYsEmL6RycpaLs1UjMTFbai8", "KiONmpfliC6BX3IrEZz"};
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C0914Hf A06;
    public final C0914Hf A07;
    public final boolean A08;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {109, 98, 121, 120, Ascii.DEL, 84, 104, 99, 126, 101, 96, 43, 102, 126, 120, Ascii.DEL, 43, 105, 110, 43, 58};
        String[] strArr = A0A;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "zNoXMjNr5peo3NkCnCQ1IuM2DM0yQ7k";
        strArr2[6] = "1lOT5Wh9g7SFemsLLNpHXLUAtLi5";
        A09 = bArr;
    }

    static {
        A01();
    }

    public C0(C0914Hf c0914Hf, C0914Hf c0914Hf2, boolean z10) {
        this.A07 = c0914Hf;
        this.A06 = c0914Hf2;
        this.A08 = z10;
        c0914Hf2.A0Y(12);
        this.A05 = c0914Hf2.A0H();
        c0914Hf.A0Y(12);
        this.A04 = c0914Hf.A0H();
        HG.A06(c0914Hf.A08() == 1, A00(0, 21, 32));
        this.A00 = -1;
    }

    public final boolean A02() {
        long jA0M;
        int i10;
        int i11 = this.A00 + 1;
        this.A00 = i11;
        if (i11 == this.A05) {
            return false;
        }
        if (this.A08) {
            jA0M = this.A06.A0N();
        } else {
            jA0M = this.A06.A0M();
        }
        this.A02 = jA0M;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0H();
            this.A07.A0Z(4);
            int i12 = this.A04 - 1;
            this.A04 = i12;
            if (i12 > 0) {
                int iA0H = this.A07.A0H();
                if (A0A[5].charAt(17) != 'Q') {
                    throw new RuntimeException();
                }
                A0A[4] = "w3cW";
                i10 = iA0H - 1;
            } else {
                i10 = -1;
            }
            this.A03 = i10;
        }
        return true;
    }
}
