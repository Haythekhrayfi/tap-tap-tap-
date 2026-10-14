package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0755Ah {
    public static byte[] A00;
    public static String[] A01 = {"LgmYw98W3bgowMYQY6Q3BawqAxXNUuUl", "GpzgTRDYOaIyAt6xSJRYAk3b6rAdzkZ0", "RtCZFOI40BGARGfB2sOg6MLybkAs9Fzf", "Gx3YqKVlWhsXJsTGKtjglmBlxW0pOlYg", "tq174XAFZe", "aVWuh4A2S2MgQagwT", "vwD2gnTxyUihDEDfn", "xhuYGO7iBGvSpDZMcS9LxFC"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Format A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        C0913He c0913HeA04 = A04(bArr);
        c0913HeA04.A08(60);
        int i10 = A02[c0913HeA04.A04(6)];
        int i11 = A03[c0913HeA04.A04(4)];
        int iA04 = c0913HeA04.A04(5);
        int[] iArr = A04;
        int i12 = iA04 >= iArr.length ? -1 : (iArr[iA04] * 1000) / 2;
        c0913HeA04.A08(10);
        return Format.A07(str, A05(0, 13, 102), null, i12, -1, i10 + (c0913HeA04.A04(2) > 0 ? 1 : 0), i11, null, drmInitData, 0, str2);
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{65, 85, 68, 73, 79, 15, 86, 78, 68, 14, 68, 84, 83};
    }

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        A04 = new int[]{64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int nblks;
        int iPosition = byteBuffer.position();
        int position = byteBuffer.get(iPosition);
        switch (position) {
            case -2:
                int position2 = iPosition + 5;
                int i10 = (byteBuffer.get(position2) & 1) << 6;
                int position3 = iPosition + 4;
                nblks = i10 | ((byteBuffer.get(position3) & 252) >> 2);
                break;
            case -1:
                int position4 = iPosition + 4;
                int i11 = (byteBuffer.get(position4) & 7) << 4;
                int position5 = iPosition + 7;
                nblks = i11 | ((byteBuffer.get(position5) & 60) >> 2);
                break;
            case 31:
                int position6 = iPosition + 5;
                int i12 = (byteBuffer.get(position6) & 7) << 4;
                int position7 = iPosition + 6;
                nblks = i12 | ((byteBuffer.get(position7) & 60) >> 2);
                break;
            default:
                int position8 = iPosition + 4;
                int i13 = (byteBuffer.get(position8) & 1) << 6;
                int position9 = iPosition + 5;
                nblks = i13 | ((byteBuffer.get(position9) & 252) >> 2);
                break;
        }
        int position10 = nblks + 1;
        return position10 * 32;
    }

    public static int A01(byte[] bArr) {
        int i10;
        boolean z10 = false;
        switch (bArr[0]) {
            case -2:
                i10 = (((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[6] & 240) >> 4)) + 1;
                break;
            case -1:
                int i11 = (bArr[7] & 3) << 12;
                int i12 = (bArr[6] & 255) << 4;
                if (A01[1].charAt(17) != 'C') {
                    A01[2] = "MBjMF3o66WyYJ7fC9eQP49KWn3JCWQGt";
                    i10 = (i11 | i12 | ((bArr[9] & 60) >> 2)) + 1;
                    z10 = true;
                } else {
                    i10 = (i11 | i12 | ((bArr[9] & 60) >> 2)) + 1;
                    z10 = true;
                }
                break;
            case 31:
                int i13 = (bArr[6] & 3) << 12;
                byte b10 = bArr[7];
                String[] strArr = A01;
                if (strArr[5].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                A01[0] = "meKDaeVMRSRS1vVcwwYXxolxpiaSquNW";
                i10 = (i13 | ((b10 & 255) << 4) | ((bArr[8] & 60) >> 2)) + 1;
                z10 = true;
                break;
            default:
                i10 = (((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[7] & 240) >> 4)) + 1;
                break;
        }
        return z10 ? (i10 * 16) / 14 : i10;
    }

    public static int A02(byte[] bArr) {
        int i10;
        switch (bArr[0]) {
            case -2:
                int nblks = bArr[5];
                i10 = ((nblks & 1) << 6) | ((bArr[4] & 252) >> 2);
                break;
            case -1:
                i10 = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
                break;
            case 31:
                i10 = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
                break;
            default:
                byte b10 = bArr[4];
                String[] strArr = A01;
                if (strArr[5].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[5] = "0rS52mmndmktv37b0";
                strArr2[6] = "cQepkBNQqnKQzzIfS";
                i10 = ((b10 & 1) << 6) | ((bArr[5] & 252) >> 2);
                break;
        }
        int nblks2 = i10 + 1;
        return nblks2 * 32;
    }

    public static C0913He A04(byte[] bArr) {
        if (bArr[0] == 127) {
            return new C0913He(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (A08(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b10 = bArrCopyOf[i10];
                bArrCopyOf[i10] = bArrCopyOf[i10 + 1];
                bArrCopyOf[i10 + 1] = b10;
            }
        }
        C0913He c0913He = new C0913He(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            C0913He c0913He2 = new C0913He(bArrCopyOf);
            while (c0913He2.A01() >= 16) {
                c0913He2.A08(2);
                c0913He.A0A(c0913He2.A04(14), 14);
            }
        }
        c0913He.A0B(bArrCopyOf);
        return c0913He;
    }

    public static boolean A07(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
