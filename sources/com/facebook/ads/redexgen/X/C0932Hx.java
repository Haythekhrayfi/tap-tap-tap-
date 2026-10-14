package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0932Hx {
    public static byte[] A05;
    public static String[] A06 = {"BmLXPPjgF3W3yl6sHxYVjODx4Gc4ZSvN", "I4b0P0MoHEzHAP7yyYIBBQ151YdBHOwS", "TnUUZ2ELhZytD28RyaEX2mWW0X", "N95", "x88QxZ2XVEltUSPssGjwLeARzs7qYdf0", "T8gtGJunXdUSumjdX3X9mxIBVL", "lBAIpAErMYY7sFwVqjboSux", "Abd"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final List<byte[]> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0932Hx A00(C0914Hf c0914Hf) throws C07249b {
        try {
            c0914Hf.A0Z(4);
            int iA0E = (c0914Hf.A0E() & 3) + 1;
            if (iA0E == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA0E2 = c0914Hf.A0E() & 31;
            for (int i10 = 0; i10 < iA0E2; i10++) {
                arrayList.add(A03(c0914Hf));
            }
            int iA0E3 = c0914Hf.A0E();
            for (int i11 = 0; i11 < iA0E3; i11++) {
                arrayList.add(A03(c0914Hf));
            }
            int i12 = -1;
            int i13 = -1;
            float f10 = 1.0f;
            if (iA0E2 > 0) {
                C0909Ha c0909HaA06 = C0910Hb.A06((byte[]) arrayList.get(0), iA0E, ((byte[]) arrayList.get(0)).length);
                i12 = c0909HaA06.A06;
                i13 = c0909HaA06.A02;
                f10 = c0909HaA06.A00;
            } else {
                String[] strArr = A06;
                if (strArr[3].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "uBIRbiuvHYy0oHv2RJvgJqXQ4A";
                strArr2[5] = "sPpQgCzWXqIb9lVIC566YsDxxs";
            }
            return new C0932Hx(arrayList, iA0E, i12, i13, f10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new C07249b(A01(0, 24, 65), e10);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-14, Ascii.US, Ascii.US, Ascii.FS, Ascii.US, -51, Ascii.GS, 14, Ascii.US, 32, 22, Ascii.ESC, 20, -51, -18, 3, -16, -51, 16, Ascii.FS, Ascii.ESC, 19, 22, 20};
    }

    static {
        A02();
    }

    public C0932Hx(List<byte[]> initializationData, int i10, int i11, int i12, float f10) {
        this.A04 = initializationData;
        this.A02 = i10;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = f10;
    }

    public static byte[] A03(C0914Hf c0914Hf) {
        int iA0I = c0914Hf.A0I();
        int offset = c0914Hf.A06();
        c0914Hf.A0Z(iA0I);
        return HK.A08(c0914Hf.A00, offset, iA0I);
    }
}
