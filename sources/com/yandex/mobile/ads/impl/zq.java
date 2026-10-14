package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.drm.DrmInitData;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f27394a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f27395b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f27396c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static yv a(byte[] bArr, String str, String str2) {
        lp0 lp0Var;
        if (bArr[0] == 127) {
            lp0Var = new lp0(bArr.length, bArr);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = bArrCopyOf[0];
            if (b10 == -2 || b10 == -1) {
                for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                    byte b11 = bArrCopyOf[i10];
                    int i11 = i10 + 1;
                    bArrCopyOf[i10] = bArrCopyOf[i11];
                    bArrCopyOf[i11] = b11;
                }
            }
            lp0Var = new lp0(bArrCopyOf.length, bArrCopyOf);
            if (bArrCopyOf[0] == 31) {
                lp0 lp0Var2 = new lp0(bArrCopyOf.length, bArrCopyOf);
                while (lp0Var2.b() >= 16) {
                    lp0Var2.d(2);
                    lp0Var.a(lp0Var2.b(14));
                }
            }
            lp0Var.a(bArrCopyOf.length, bArrCopyOf);
        }
        lp0Var.d(60);
        int i12 = f27394a[lp0Var.b(6)];
        int i13 = f27395b[lp0Var.b(4)];
        int iB = lp0Var.b(5);
        int i14 = iB < 29 ? (f27396c[iB] * 1000) / 2 : -1;
        lp0Var.d(10);
        return new yv.a().c(str).f("audio/vnd.dts").b(i14).c(i12 + (lp0Var.b(2) > 0 ? 1 : 0)).n(i13).a((DrmInitData) null).e(str2).a();
    }
}
