package com.yandex.mobile.ads.impl;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f22578a = {AdError.CACHE_ERROR_CODE, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f22581c;

        private a(int i10, int i11, int i12) {
            this.f22579a = i10;
            this.f22580b = i11;
            this.f22581c = i12;
        }

        public /* synthetic */ a(int i10, int i11, int i12, int i13) {
            this(i11, i12, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    public static a a(lp0 lp0Var) {
        int i10;
        int iB;
        int iB2 = lp0Var.b(16);
        int iB3 = lp0Var.b(16);
        if (iB3 == 65535) {
            iB3 = lp0Var.b(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i11 = iB3 + i10;
        if (iB2 == 44097) {
            i11 += 2;
        }
        int iB4 = lp0Var.b(2);
        int i12 = 0;
        if (iB4 == 3) {
            int i13 = 0;
            while (true) {
                iB = lp0Var.b(2) + i13;
                if (!lp0Var.f()) {
                    break;
                }
                i13 = (iB + 1) << 2;
            }
            iB4 += iB;
        }
        int iB5 = lp0Var.b(10);
        if (lp0Var.f() && lp0Var.b(3) > 0) {
            lp0Var.d(2);
        }
        int i14 = lp0Var.f() ? 48000 : 44100;
        int iB6 = lp0Var.b(4);
        if (i14 == 44100 && iB6 == 13) {
            i12 = f22578a[iB6];
        } else if (i14 == 48000) {
            int[] iArr = f22578a;
            if (iB6 < 14) {
                i12 = iArr[iB6];
                int i15 = iB5 % 5;
                if (i15 == 1) {
                    if (iB6 != 3 || iB6 == 8) {
                        i12++;
                    }
                } else if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 == 4 && (iB6 == 3 || iB6 == 8 || iB6 == 11)) {
                            i12++;
                        }
                    } else if (iB6 != 3) {
                        i12++;
                    } else {
                        i12++;
                    }
                } else if (iB6 == 8 || iB6 == 11) {
                    i12++;
                }
            }
        }
        return new a(iB4, i14, i11, i12);
    }

    public static void a(int i10, mp0 mp0Var) {
        mp0Var.c(7);
        byte[] bArrC = mp0Var.c();
        bArrC[0] = -84;
        bArrC[1] = 64;
        bArrC[2] = -1;
        bArrC[3] = -1;
        bArrC[4] = (byte) ((i10 >> 16) & 255);
        bArrC[5] = (byte) ((i10 >> 8) & 255);
        bArrC[6] = (byte) (i10 & 255);
    }
}
