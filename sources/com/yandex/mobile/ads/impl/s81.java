package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class s81 {
    public static long a(int i10, int i11, mp0 mp0Var) {
        mp0Var.e(i10);
        if (mp0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iH = mp0Var.h();
        if ((8388608 & iH) != 0 || ((2096896 & iH) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if (((iH & 32) != 0) && mp0Var.t() >= 7 && mp0Var.a() >= 7) {
            if ((mp0Var.t() & 16) == 16) {
                byte[] bArr = new byte[6];
                mp0Var.a(bArr, 0, 6);
                return ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}
