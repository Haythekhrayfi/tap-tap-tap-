package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class I3 {
    public static byte[] A02;
    public static String[] A03 = {"ByJYsTLYuoR6uc8r", "JtyXwt9Aly6TcqGHtKIVJmBsk4OeLfoM", "a9HBAd1W81XiearAjjAT3V1ZsLEmO9Oi", "EXNlrjnsmLCbvnLTR5jNuRmyx9d0ZBX8", "CaQoJFxeqSTbWtIeh0kRdnuLPh9NlfCW", "NDFH7JBJhJBLaqfKHqozYt4fbxKVNhf7", "NTYlS1n6YEIgBX9wiCzSTuRNkv1W0ADe", "oBB1NAAyCwUYb6ONAQdFrjyju4xXh"};
    public final int A00;
    public final List<byte[]> A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{83, 100, 100, 121, 100, 54, 102, 119, 100, 101, Ascii.DEL, 120, 113, 54, 94, 83, 64, 85, 54, 117, 121, 120, 112, Ascii.DEL, 113};
    }

    static {
        A02();
    }

    public I3(List<byte[]> initializationData, int i10) {
        this.A01 = initializationData;
        this.A00 = i10;
    }

    public static I3 A00(C0914Hf c0914Hf) throws C07249b {
        try {
            c0914Hf.A0Z(21);
            int iA0E = c0914Hf.A0E() & 3;
            int iA0E2 = c0914Hf.A0E();
            int i10 = 0;
            int iA06 = c0914Hf.A06();
            for (int i11 = 0; i11 < iA0E2; i11++) {
                c0914Hf.A0Z(1);
                int csdStartPosition = c0914Hf.A0I();
                for (int csdLength = 0; csdLength < csdStartPosition; csdLength++) {
                    int numberOfArrays = c0914Hf.A0I();
                    int lengthSizeMinusOne = numberOfArrays + 4;
                    i10 += lengthSizeMinusOne;
                    c0914Hf.A0Z(numberOfArrays);
                }
            }
            c0914Hf.A0Y(iA06);
            byte[] bArr = new byte[i10];
            int bufferPosition = 0;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[4];
            int numberOfArrays2 = str.charAt(26);
            int lengthSizeMinusOne2 = str2.charAt(26);
            if (numberOfArrays2 != lengthSizeMinusOne2) {
                A03[7] = "2";
                for (int i12 = 0; i12 < iA0E2; i12++) {
                    c0914Hf.A0Z(1);
                    int iA0I = c0914Hf.A0I();
                    for (int csdStartPosition2 = 0; csdStartPosition2 < iA0I; csdStartPosition2++) {
                        int csdLength2 = c0914Hf.A0I();
                        byte[] bArr2 = C0910Hb.A03;
                        int lengthSizeMinusOne3 = C0910Hb.A03.length;
                        System.arraycopy(bArr2, 0, bArr, bufferPosition, lengthSizeMinusOne3);
                        int lengthSizeMinusOne4 = C0910Hb.A03.length;
                        int bufferPosition2 = bufferPosition + lengthSizeMinusOne4;
                        byte[] bArr3 = c0914Hf.A00;
                        int lengthSizeMinusOne5 = c0914Hf.A06();
                        System.arraycopy(bArr3, lengthSizeMinusOne5, bArr, bufferPosition2, csdLength2);
                        bufferPosition = bufferPosition2 + csdLength2;
                        c0914Hf.A0Z(csdLength2);
                    }
                }
                int numberOfArrays3 = iA0E + 1;
                return new I3(i10 == 0 ? null : Collections.singletonList(bArr), numberOfArrays3);
            }
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new C07249b(A01(0, 25, 65), e10);
        }
    }
}
