package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.image.thirdparty.JavaBlurProcess;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1220Tf implements LU {
    public static String[] A00 = {"hdmHMjdsCvnnIiAm68nbzST5FT4P5mLb", "EH3LUmZxwOvThvXMHcswnn58jDASieiK", "ljU4lnctUqCxo644HWpRzVkau739AG18", "cf0wMMVzQ5eDMzw1G9WbfLTL5VaSUv", "l50byEuqIAJWTFcEqiPP3cq5SFvrKOhf", "BkuhnFfUhQO532vAuKLRONmm63PuLWNO", "lueSUxwI7577CW", "p49ZYnIXKwO4jtZLxoBrhqW2OVcn4ZYc"};
    public static final short[] A02 = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};
    public static final byte[] A01 = {9, 11, 12, 13, 13, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN, Ascii.CAN};

    public static void A00(int[] iArr, int src_i, int y10, int minX, int i10, int i11, int i12) {
        int maxY = src_i - 1;
        int i13 = y10 - 1;
        int stack_start = (minX * 2) + 1;
        short s10 = A02[minX];
        byte b10 = A01[minX];
        int[] iArr2 = new int[stack_start];
        long j10 = 0;
        if (i12 == 1) {
            int i14 = (i11 * y10) / i10;
            int i15 = ((i11 + 1) * y10) / i10;
            while (i14 < i15) {
                long sum_out_b = j10;
                long j11 = j10;
                long j12 = j10;
                long j13 = j10;
                long j14 = j10;
                long j15 = j10;
                long j16 = j10;
                long j17 = j10;
                int wm = src_i * i14;
                for (int i16 = 0; i16 <= minX; i16++) {
                    iArr2[i16] = iArr[wm];
                    j17 += (long) (((iArr[wm] >>> 16) & 255) * (i16 + 1));
                    j16 += (long) (((iArr[wm] >>> 8) & 255) * (i16 + 1));
                    j15 += (long) ((iArr[wm] & 255) * (i16 + 1));
                    j11 += (long) ((iArr[wm] >>> 16) & 255);
                    sum_out_b += (long) ((iArr[wm] >>> 8) & 255);
                    j10 += (long) (iArr[wm] & 255);
                }
                for (int i17 = 1; i17 <= minX; i17++) {
                    if (i17 <= maxY) {
                        wm++;
                    }
                    iArr2[i17 + minX] = iArr[wm];
                    j17 += (long) (((iArr[wm] >>> 16) & 255) * ((minX + 1) - i17));
                    j16 += (long) (((iArr[wm] >>> 8) & 255) * ((minX + 1) - i17));
                    j15 += (long) ((iArr[wm] & 255) * ((minX + 1) - i17));
                    j14 += (long) ((iArr[wm] >>> 16) & 255);
                    j13 += (long) ((iArr[wm] >>> 8) & 255);
                    j12 += (long) (iArr[wm] & 255);
                }
                int i18 = minX;
                int i19 = minX;
                if (i19 > maxY) {
                    i19 = maxY;
                }
                int i20 = (i14 * src_i) + i19;
                int i21 = i14 * src_i;
                for (int i22 = 0; i22 < src_i; i22++) {
                    iArr[i21] = (int) (((long) (iArr[i21] & (-16777216))) | ((((((long) s10) * j17) >>> b10) & 255) << 16) | ((((((long) s10) * j16) >>> b10) & 255) << 8) | (((((long) s10) * j15) >>> b10) & 255));
                    i21++;
                    long j18 = j17 - j11;
                    long j19 = j16 - sum_out_b;
                    long j20 = j15 - j10;
                    int i23 = (i18 + stack_start) - minX;
                    if (i23 >= stack_start) {
                        i23 -= stack_start;
                    }
                    long j21 = j11 - ((long) ((iArr2[i23] >>> 16) & 255));
                    long sum_out_b2 = sum_out_b - ((long) ((iArr2[i23] >>> 8) & 255));
                    long j22 = j10 - ((long) (iArr2[i23] & 255));
                    int stack_i = i19;
                    if (stack_i < maxY) {
                        i20++;
                        i19++;
                    }
                    iArr2[i23] = iArr[i20];
                    long j23 = j14 + ((long) ((iArr[i20] >>> 16) & 255));
                    long j24 = j13 + ((long) ((iArr[i20] >>> 8) & 255));
                    long j25 = j12 + ((long) (iArr[i20] & 255));
                    j17 = j18 + j23;
                    j16 = j19 + j24;
                    j15 = j20 + j25;
                    int i24 = i18 + 1;
                    if (i24 >= stack_start) {
                        i24 = 0;
                    }
                    int stack_i2 = iArr2[i24];
                    i18 = i24;
                    j11 = j21 + ((long) ((stack_i2 >>> 16) & 255));
                    int stack_i3 = iArr2[i24];
                    sum_out_b = sum_out_b2 + ((long) ((stack_i3 >>> 8) & 255));
                    int stack_i4 = iArr2[i24];
                    j10 = j22 + ((long) (stack_i4 & 255));
                    int stack_i5 = iArr2[i24];
                    j14 = j23 - ((long) ((stack_i5 >>> 16) & 255));
                    int stack_i6 = iArr2[i24];
                    j13 = j24 - ((long) ((stack_i6 >>> 8) & 255));
                    int stack_i7 = iArr2[i24];
                    j12 = j25 - ((long) (stack_i7 & 255));
                }
                i14++;
                j10 = 0;
            }
            return;
        }
        if (i12 == 2) {
            int i25 = (i11 * src_i) / i10;
            int i26 = ((i11 + 1) * src_i) / i10;
            while (maxX < i26) {
                long j26 = 0;
                long j27 = 0;
                long j28 = 0;
                long j29 = 0;
                long j30 = 0;
                long j31 = 0;
                long j32 = 0;
                long j33 = 0;
                long j34 = 0;
                int wm2 = i25;
                for (int i27 = 0; i27 <= minX; i27++) {
                    iArr2[i27] = iArr[wm2];
                    int maxX = i27 + 1;
                    j34 += (long) (((iArr[wm2] >>> 16) & 255) * maxX);
                    j33 += (long) (((iArr[wm2] >>> 8) & 255) * (i27 + 1));
                    j32 += (long) ((iArr[wm2] & 255) * (i27 + 1));
                    j28 += (long) ((iArr[wm2] >>> 16) & 255);
                    j27 += (long) ((iArr[wm2] >>> 8) & 255);
                    j26 += (long) (iArr[wm2] & 255);
                }
                for (int i28 = 1; i28 <= minX; i28++) {
                    if (i28 <= i13) {
                        wm2 += src_i;
                    }
                    int stack_i8 = i28 + minX;
                    iArr2[stack_i8] = iArr[wm2];
                    int stack_i9 = minX + 1;
                    j34 += (long) (((iArr[wm2] >>> 16) & 255) * (stack_i9 - i28));
                    int stack_i10 = minX + 1;
                    j33 += (long) (((iArr[wm2] >>> 8) & 255) * (stack_i10 - i28));
                    int stack_i11 = minX + 1;
                    j32 += (long) ((iArr[wm2] & 255) * (stack_i11 - i28));
                    j31 += (long) ((iArr[wm2] >>> 16) & 255);
                    j30 += (long) ((iArr[wm2] >>> 8) & 255);
                    j29 += (long) (iArr[wm2] & 255);
                }
                int hm2 = minX;
                int sp = minX;
                if (sp > i13) {
                    sp = i13;
                }
                int i29 = (sp * src_i) + i25;
                int i30 = i25;
                for (int sp2 = 0; sp2 < y10; sp2++) {
                    iArr[i30] = (int) (((long) (iArr[i30] & (-16777216))) | ((((((long) s10) * j34) >>> b10) & 255) << 16) | ((((((long) s10) * j33) >>> b10) & 255) << 8) | (((((long) s10) * j32) >>> b10) & 255));
                    i30 += src_i;
                    long j35 = j34 - j28;
                    long j36 = j33 - j27;
                    long j37 = j32 - j26;
                    int stack_start2 = (hm2 + stack_start) - minX;
                    if (stack_start2 >= stack_start) {
                        stack_start2 -= stack_start;
                    }
                    long j38 = j28 - ((long) ((iArr2[stack_start2] >>> 16) & 255));
                    long j39 = j27 - ((long) ((iArr2[stack_start2] >>> 8) & 255));
                    long j40 = j26 - ((long) (iArr2[stack_start2] & 255));
                    if (sp < i13) {
                        i29 += src_i;
                        sp++;
                    }
                    iArr2[stack_start2] = iArr[i29];
                    long j41 = j31 + ((long) ((iArr[i29] >>> 16) & 255));
                    long j42 = j30 + ((long) ((iArr[i29] >>> 8) & 255));
                    long j43 = j29 + ((long) (iArr[i29] & 255));
                    j34 = j35 + j41;
                    j33 = j36 + j42;
                    j32 = j37 + j43;
                    hm2++;
                    if (hm2 >= stack_start) {
                        hm2 = 0;
                    }
                    j28 = j38 + ((long) ((iArr2[hm2] >>> 16) & 255));
                    j27 = j39 + ((long) ((iArr2[hm2] >>> 8) & 255));
                    j26 = j40 + ((long) (iArr2[hm2] & 255));
                    j31 = j41 - ((long) ((iArr2[hm2] >>> 16) & 255));
                    j30 = j42 - ((long) ((iArr2[hm2] >>> 8) & 255));
                    j29 = j43 - ((long) (iArr2[hm2] & 255));
                }
                i25++;
                String[] strArr = A00;
                if (strArr[4].charAt(24) == strArr[0].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A00;
                strArr2[4] = "dRrOf81uK3m7JlCVGnAp7HBN8Ud450kD";
                strArr2[0] = "ERfsWS88AUosonNdTmqfcWCTdCaDCKBU";
            }
        }
    }

    public final Bitmap A02(Bitmap bitmap, float f10) {
        int w10 = bitmap.getWidth();
        int h10 = bitmap.getHeight();
        try {
            int[] iArr = new int[w10 * h10];
            bitmap.getPixels(iArr, 0, w10, 0, 0, w10, h10);
            int i10 = LZ.A00;
            ArrayList arrayList = new ArrayList(i10);
            ArrayList<JavaBlurProcess.BlurTask> vertical = new ArrayList<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int h11 = h10;
                int cores = i11;
                arrayList.add(new LY(iArr, w10, h11, (int) f10, i10, cores, 1));
                h10 = h11;
                int cores2 = i11;
                vertical.add(new LY(iArr, w10, h10, (int) f10, i10, cores2, 2));
            }
            try {
                LZ.A01.invokeAll(arrayList);
                try {
                    LZ.A01.invokeAll(vertical);
                    try {
                        return Bitmap.createBitmap(iArr, w10, h10, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError unused) {
                        return null;
                    }
                } catch (InterruptedException unused2) {
                    return null;
                }
            } catch (InterruptedException unused3) {
                return null;
            }
        } catch (OutOfMemoryError unused4) {
            return null;
        }
    }
}
