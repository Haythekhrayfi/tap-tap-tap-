package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0776Bc {
    public static byte[] A02;
    public static String[] A03 = {"I7u5SMwnia1LjR8q2dDSZ1ZxyvAUDNjZ", "lA52iG6YY0NJNsRtQCweAmt1bj2X", "2qXiYNq9KlAFUySgaSTQYzQ4aWQihc1C", "j3GaPat5F4JzB2k2u38FDmanRSccFQ7x", "Rgx4knYMi3WRjmVXMYvkXYj", "jdUpLioS3ej7GnR7zzwjeYlHhGFO", "z8YFUav71iIZ039OmPtsZmkN2j2dK8kW", "CjGTtkLliNi5lySdeHdx4jpczrbS9nvg"};
    public static final DO A04;
    public static final Pattern A05;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 38);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{87, 41, 82, 57, 36, 48, 104, 36, 111, 72, 36, 79, 84, 114, 49, 116, 41, 33, 82, 57, 36, 48, 104, 36, 111, 72, 36, 79, 84, 114, 49, 116, 32, 41, 33, 82, 57, 36, 48, 104, 36, 111, 72, 36, 79, 84, 114, 49, 116, 32, 74, 70, 68, 7, 72, 89, 89, 69, 76, 7, 64, 125, 92, 71, 76, 90, 43, 22, 55, 44, 17, 15, 18, 0};
    }

    static {
        A01();
        A04 = new C1302Wn();
        A05 = Pattern.compile(A00(0, 50, 47));
    }

    private boolean A02(String str) {
        Matcher matcher = A05.matcher(str);
        if (matcher.find()) {
            try {
                int i10 = Integer.parseInt(matcher.group(1), 16);
                int i11 = Integer.parseInt(matcher.group(2), 16);
                if (i10 > 0 || i11 > 0) {
                    this.A00 = i10;
                    this.A01 = i11;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i10) {
        int encoderPadding = i10 >> 12;
        int encoderDelay = i10 & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        return false;
    }

    public final boolean A05(Metadata metadata) {
        for (int i10 = 0; i10 < i; i10++) {
            Metadata.Entry entryA01 = metadata.A01(i10);
            boolean z10 = entryA01 instanceof CommentFrame;
            String strA00 = A00(66, 8, 100);
            if (z10) {
                CommentFrame commentFrame = (CommentFrame) entryA01;
                String[] strArr = A03;
                String str = strArr[6];
                String str2 = strArr[3];
                int iCharAt = str.charAt(21);
                int i11 = str2.charAt(21);
                if (iCharAt != i11) {
                    throw new RuntimeException();
                }
                A03[2] = "qNstZA7UFnX3Ahz0Wj5J3oCW9XwBWpVm";
                if (strA00.equals(commentFrame.A00) && A02(commentFrame.A02)) {
                    return true;
                }
            } else if (entryA01 instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryA01;
                if (A00(50, 16, 15).equals(internalFrame.A01) && strA00.equals(internalFrame.A00) && A02(internalFrame.A02)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
