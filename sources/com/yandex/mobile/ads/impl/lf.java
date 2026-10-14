package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class lf {
    public static Bitmap a(Bitmap bitmap) {
        try {
            return b(bitmap);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    private static Bitmap b(Bitmap bitmap) {
        int i10 = 0;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.1f), Math.round(bitmap.getHeight() * 0.1f), false);
        int i11 = 1;
        Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(bitmapCreateScaledBitmap.getConfig(), true);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i12 = width * height;
        int[] iArr = new int[i12];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i13 = width - 1;
        int i14 = height - 1;
        int[] iArr2 = new int[i12];
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[i12];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[1024];
        for (int i15 = 0; i15 < 1024; i15++) {
            iArr6[i15] = i15 / 4;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) int.class, 3, 3);
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < height) {
            int i19 = i10;
            int i20 = i19;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            int i26 = i25;
            int i27 = -1;
            int i28 = i26;
            while (i27 <= i11) {
                int i29 = iArr[Math.min(i13, Math.max(i27, i10)) + i17];
                int i30 = i27 + 1;
                int[] iArr8 = iArr7[i30];
                iArr8[i10] = (i29 & 16711680) >> 16;
                iArr8[1] = (i29 & 65280) >> 8;
                iArr8[2] = i29 & 255;
                int iAbs = 2 - StrictMath.abs(i27);
                int i31 = iArr8[i10];
                i28 = (i31 * iAbs) + i28;
                int i32 = iArr8[1];
                i19 = (i32 * iAbs) + i19;
                int i33 = iArr8[2];
                i20 = (iAbs * i33) + i20;
                if (i27 > 0) {
                    i24 += i31;
                    i26 += i32;
                    i25 += i33;
                } else {
                    i23 += i31;
                    i22 += i32;
                    i21 += i33;
                }
                i27 = i30;
                i11 = 1;
            }
            int i34 = i10;
            int i35 = 1;
            while (i34 < width) {
                iArr2[i17] = iArr6[i28];
                iArr3[i17] = iArr6[i19];
                iArr4[i17] = iArr6[i20];
                int i36 = i28 - i23;
                int i37 = i19 - i22;
                int i38 = i20 - i21;
                int[] iArr9 = iArr7[((i35 - 1) + 3) % 3];
                int i39 = i23 - iArr9[i10];
                int i40 = i22 - iArr9[1];
                int i41 = i21 - iArr9[2];
                if (i16 == 0) {
                    iArr5[i34] = Math.min(i34 + 1 + 1, i13);
                }
                int i42 = iArr[i18 + iArr5[i34]];
                int i43 = (i42 & 16711680) >> 16;
                iArr9[0] = i43;
                int i44 = (i42 & 65280) >> 8;
                iArr9[1] = i44;
                int i45 = i42 & 255;
                iArr9[2] = i45;
                int i46 = i24 + i43;
                int i47 = i26 + i44;
                int i48 = i25 + i45;
                i28 = i36 + i46;
                i19 = i37 + i47;
                i20 = i38 + i48;
                i35 = (i35 + 1) % 3;
                int[] iArr10 = iArr7[i35 % 3];
                int i49 = iArr10[0];
                i23 = i39 + i49;
                int i50 = iArr10[1];
                i22 = i40 + i50;
                int i51 = iArr10[2];
                i21 = i41 + i51;
                i24 = i46 - i49;
                i26 = i47 - i50;
                i25 = i48 - i51;
                i17++;
                i34++;
                i10 = 0;
            }
            i18 += width;
            i16++;
            i10 = 0;
            i11 = 1;
        }
        int i52 = 0;
        while (i52 < width) {
            int i53 = width * (-1);
            Bitmap bitmap2 = bitmapCopy;
            int[] iArr11 = iArr5;
            int i54 = -1;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            for (int i64 = 1; i54 <= i64; i64 = 1) {
                int iMax = Math.max(0, i53) + i52;
                int i65 = i54 + 1;
                int[] iArr12 = iArr7[i65];
                iArr12[0] = iArr2[iMax];
                iArr12[1] = iArr3[iMax];
                iArr12[2] = iArr4[iMax];
                int iAbs2 = 2 - StrictMath.abs(i54);
                i55 = (iArr2[iMax] * iAbs2) + i55;
                i56 = (iArr3[iMax] * iAbs2) + i56;
                i57 = (iArr4[iMax] * iAbs2) + i57;
                if (i54 > 0) {
                    i61 += iArr12[0];
                    i63 += iArr12[1];
                    i62 += iArr12[2];
                } else {
                    i60 += iArr12[0];
                    i59 += iArr12[1];
                    i58 += iArr12[2];
                }
                if (i54 < i14) {
                    i53 += width;
                }
                i54 = i65;
            }
            int i66 = i52;
            int i67 = 0;
            int i68 = 1;
            while (i67 < height) {
                iArr[i66] = (iArr[i66] & (-16777216)) | (iArr6[i55] << 16) | (iArr6[i56] << 8) | iArr6[i57];
                int i69 = i55 - i60;
                int i70 = i56 - i59;
                int i71 = i57 - i58;
                int[] iArr13 = iArr7[((i68 - 1) + 3) % 3];
                int i72 = i60 - iArr13[0];
                int i73 = i59 - iArr13[1];
                int i74 = i58 - iArr13[2];
                if (i52 == 0) {
                    iArr11[i67] = Math.min(i67 + 2, i14) * width;
                }
                int i75 = iArr11[i67] + i52;
                int i76 = iArr2[i75];
                iArr13[0] = i76;
                int i77 = iArr3[i75];
                iArr13[1] = i77;
                int i78 = iArr4[i75];
                iArr13[2] = i78;
                int i79 = i61 + i76;
                int i80 = i63 + i77;
                int i81 = i62 + i78;
                i55 = i69 + i79;
                i56 = i70 + i80;
                i57 = i71 + i81;
                i68 = (i68 + 1) % 3;
                int[] iArr14 = iArr7[i68];
                int i82 = iArr14[0];
                i60 = i72 + i82;
                int i83 = iArr14[1];
                i59 = i73 + i83;
                int i84 = iArr14[2];
                i58 = i74 + i84;
                i61 = i79 - i82;
                i63 = i80 - i83;
                i62 = i81 - i84;
                i66 += width;
                i67++;
                iArr6 = iArr6;
            }
            i52++;
            bitmapCopy = bitmap2;
            iArr5 = iArr11;
            iArr6 = iArr6;
        }
        Bitmap bitmap3 = bitmapCopy;
        bitmap3.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap3;
    }
}
