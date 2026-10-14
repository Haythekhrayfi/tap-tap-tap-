package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class oh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f23795a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f23796b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f23797c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f23798d = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f23802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f23803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f23804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f23805g;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, float f10) {
            this.f23799a = i10;
            this.f23800b = z10;
            this.f23801c = i11;
            this.f23802d = i12;
            this.f23803e = iArr;
            this.f23804f = i13;
            this.f23805g = f10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f23808c;

        public b(int i10, int i11, boolean z10) {
            this.f23806a = i10;
            this.f23807b = i11;
            this.f23808c = z10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f23812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f23813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f23814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f23815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f23816h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f23817i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f23818j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f23819k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f23820l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f23821m;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f23809a = i10;
            this.f23810b = i11;
            this.f23811c = i12;
            this.f23812d = i13;
            this.f23813e = i14;
            this.f23814f = i15;
            this.f23815g = f10;
            this.f23816h = z10;
            this.f23817i = z11;
            this.f23818j = i16;
            this.f23819k = i17;
            this.f23820l = i18;
            this.f23821m = z12;
        }
    }

    public static int a(int i10, byte[] bArr) {
        int i11;
        synchronized (f23797c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f23798d;
                    if (iArr.length <= i13) {
                        f23798d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f23798d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f23798d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }

    public static int a(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        pa.b(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static a a(byte[] bArr, int i10, int i11) {
        boolean z10;
        np0 np0Var = new np0(bArr, i10 + 2, i11);
        int i12 = 4;
        np0Var.d(4);
        int iB = np0Var.b(3);
        np0Var.e();
        int iB2 = np0Var.b(2);
        boolean zB = np0Var.b();
        int iB3 = np0Var.b(5);
        int i13 = 0;
        int i14 = 0;
        while (true) {
            z10 = true;
            if (i14 >= 32) {
                break;
            }
            if (np0Var.b()) {
                i13 |= 1 << i14;
            }
            i14++;
        }
        int i15 = 6;
        int[] iArr = new int[6];
        for (int i16 = 0; i16 < 6; i16++) {
            iArr[i16] = np0Var.b(8);
        }
        int iB4 = np0Var.b(8);
        int i17 = 0;
        for (int i18 = 0; i18 < iB; i18++) {
            if (np0Var.b()) {
                i17 += 89;
            }
            if (np0Var.b()) {
                i17 += 8;
            }
        }
        np0Var.d(i17);
        if (iB > 0) {
            np0Var.d((8 - iB) * 2);
        }
        np0Var.d();
        int iD = np0Var.d();
        if (iD == 3) {
            np0Var.e();
        }
        int iD2 = np0Var.d();
        int iD3 = np0Var.d();
        if (np0Var.b()) {
            int iD4 = np0Var.d();
            int iD5 = np0Var.d();
            int iD6 = np0Var.d();
            int iD7 = np0Var.d();
            iD2 -= (iD4 + iD5) * ((iD == 1 || iD == 2) ? 2 : 1);
            iD3 -= (iD6 + iD7) * (iD == 1 ? 2 : 1);
        }
        np0Var.d();
        np0Var.d();
        int iD8 = np0Var.d();
        int i19 = np0Var.b() ? 0 : iB;
        while (true) {
            np0Var.d();
            np0Var.d();
            np0Var.d();
            if (i19 > iB) {
                break;
            }
            i19++;
        }
        np0Var.d();
        np0Var.d();
        np0Var.d();
        if (np0Var.b() && np0Var.b()) {
            int i20 = 0;
            while (i20 < i12) {
                int i21 = 0;
                while (i21 < i15) {
                    if (np0Var.b()) {
                        int iMin = Math.min(64, 1 << ((i20 << 1) + 4));
                        if (i20 > 1) {
                            np0Var.c();
                        }
                        for (int i22 = 0; i22 < iMin; i22++) {
                            np0Var.c();
                        }
                    } else {
                        np0Var.d();
                    }
                    i21 += i20 == 3 ? 3 : 1;
                    i15 = 6;
                }
                i20++;
                i12 = 4;
                i15 = 6;
            }
        }
        np0Var.d(2);
        if (np0Var.b()) {
            np0Var.d(8);
            np0Var.d();
            np0Var.d();
            np0Var.e();
        }
        int iD9 = np0Var.d();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i23 = -1;
        int i24 = 0;
        int iD10 = -1;
        while (i24 < iD9) {
            if ((i24 == 0 || !np0Var.b()) ? false : z10) {
                int i25 = i23 + iD10;
                int iD11 = (1 - ((np0Var.b() ? 1 : 0) * 2)) * (np0Var.d() + 1);
                int i26 = i25 + 1;
                boolean[] zArr = new boolean[i26];
                for (int i27 = 0; i27 <= i25; i27++) {
                    if (np0Var.b()) {
                        zArr[i27] = true;
                    } else {
                        zArr[i27] = np0Var.b();
                    }
                }
                int[] iArr3 = new int[i26];
                int[] iArr4 = new int[i26];
                int i28 = 0;
                for (int i29 = iD10 - 1; i29 >= 0; i29--) {
                    int i30 = iArrCopyOf[i29] + iD11;
                    if (i30 < 0 && zArr[i23 + i29]) {
                        iArr3[i28] = i30;
                        i28++;
                    }
                }
                if (iD11 < 0 && zArr[i25]) {
                    iArr3[i28] = iD11;
                    i28++;
                }
                int i31 = i28;
                for (int i32 = 0; i32 < i23; i32++) {
                    int i33 = iArr2[i32] + iD11;
                    if (i33 < 0 && zArr[i32]) {
                        iArr3[i31] = i33;
                        i31++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr3, i31);
                int i34 = 0;
                for (int i35 = i23 - 1; i35 >= 0; i35--) {
                    int i36 = iArr2[i35] + iD11;
                    if (i36 > 0 && zArr[i35]) {
                        iArr4[i34] = i36;
                        i34++;
                    }
                }
                if (iD11 > 0 && zArr[i25]) {
                    iArr4[i34] = iD11;
                    i34++;
                }
                int i37 = i34;
                for (int i38 = 0; i38 < iD10; i38++) {
                    int i39 = iArrCopyOf[i38] + iD11;
                    if (i39 > 0 && zArr[i23 + i38]) {
                        iArr4[i37] = i39;
                        i37++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr4, i37);
                iD10 = i37;
                iArr2 = iArrCopyOf2;
                i23 = i31;
            } else {
                int iD12 = np0Var.d();
                iD10 = np0Var.d();
                iArr2 = new int[iD12];
                for (int i40 = 0; i40 < iD12; i40++) {
                    iArr2[i40] = np0Var.d() + 1;
                    np0Var.e();
                }
                int i41 = 1;
                int[] iArr5 = new int[iD10];
                int i42 = 0;
                while (i42 < iD10) {
                    iArr5[i42] = np0Var.d() + i41;
                    np0Var.e();
                    i42++;
                    i41 = 1;
                }
                i23 = iD12;
                iArrCopyOf = iArr5;
            }
            i24++;
            iD9 = iD9;
            iD2 = iD2;
            iB4 = iB4;
            iArr = iArr;
            i13 = i13;
            z10 = true;
        }
        int i43 = i13;
        int[] iArr6 = iArr;
        int i44 = iB4;
        int i45 = iD2;
        if (np0Var.b()) {
            for (int i46 = 0; i46 < np0Var.d(); i46++) {
                np0Var.d(iD8 + 4 + 1);
            }
        }
        np0Var.d(2);
        float f10 = 1.0f;
        if (np0Var.b()) {
            if (np0Var.b()) {
                int iB5 = np0Var.b(8);
                if (iB5 == 255) {
                    int iB6 = np0Var.b(16);
                    int iB7 = np0Var.b(16);
                    if (iB6 != 0 && iB7 != 0) {
                        f10 = iB6 / iB7;
                    }
                } else {
                    float[] fArr = f23796b;
                    if (iB5 < 17) {
                        f10 = fArr[iB5];
                    } else {
                        o80.a("Unexpected aspect_ratio_idc value: ", iB5, "NalUnitUtil");
                    }
                }
            }
            if (np0Var.b()) {
                np0Var.e();
            }
            if (np0Var.b()) {
                np0Var.d(4);
                if (np0Var.b()) {
                    np0Var.d(24);
                }
            }
            if (np0Var.b()) {
                np0Var.d();
                np0Var.d();
            }
            np0Var.e();
            if (np0Var.b()) {
                iD3 *= 2;
            }
        }
        return new a(iB2, zB, iB3, i43, iArr6, i44, i45, iD3, f10);
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0109  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0121  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:83:0x014d  */
    /* JADX WARN: Code duplicated, block: B:87:0x015f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165  */
    /* JADX WARN: Code duplicated, block: B:90:0x0168  */
    public static c b(byte[] bArr, int i10, int i11) {
        int iD;
        boolean zB;
        int iD2;
        boolean z10;
        boolean zB2;
        int i12;
        int i13;
        int i14;
        float f10;
        int iB;
        float[] fArr;
        int iB2;
        int iB3;
        int i15;
        int i16 = 1;
        np0 np0Var = new np0(bArr, i10 + 1, i11);
        int iB4 = np0Var.b(8);
        int iB5 = np0Var.b(8);
        int iB6 = np0Var.b(8);
        int iD3 = np0Var.d();
        if (iB4 == 100 || iB4 == 110 || iB4 == 122 || iB4 == 244 || iB4 == 44 || iB4 == 83 || iB4 == 86 || iB4 == 118 || iB4 == 128 || iB4 == 138) {
            iD = np0Var.d();
            zB = iD == 3 ? np0Var.b() : false;
            np0Var.d();
            np0Var.d();
            np0Var.e();
            if (np0Var.b()) {
                int i17 = iD != 3 ? 8 : 12;
                int i18 = 0;
                while (i18 < i17) {
                    if (np0Var.b()) {
                        int i19 = i18 < 6 ? 16 : 64;
                        int iC = 8;
                        int i20 = 8;
                        for (int i21 = 0; i21 < i19; i21++) {
                            if (iC != 0) {
                                iC = ((np0Var.c() + i20) + 256) % 256;
                            }
                            if (iC != 0) {
                                i20 = iC;
                            }
                        }
                    }
                    i18++;
                }
            }
        } else {
            iD = 1;
            zB = false;
        }
        int iD4 = np0Var.d() + 4;
        int iD5 = np0Var.d();
        if (iD5 != 0) {
            if (iD5 == 1) {
                boolean zB3 = np0Var.b();
                np0Var.c();
                np0Var.c();
                iB4 = iB4;
                long jD = np0Var.d();
                for (int i22 = 0; i22 < jD; i22++) {
                    np0Var.d();
                }
                z10 = zB3;
                iD2 = 0;
            } else {
                iD2 = 0;
            }
            np0Var.d();
            np0Var.e();
            int iD6 = np0Var.d() + 1;
            int iD7 = np0Var.d() + 1;
            zB2 = np0Var.b();
            i12 = 2 - (zB2 ? 1 : 0);
            int i23 = iD7 * i12;
            if (!zB2) {
                np0Var.e();
            }
            np0Var.e();
            i13 = iD6 * 16;
            i14 = i23 * 16;
            if (np0Var.b()) {
                int iD8 = np0Var.d();
                int iD9 = np0Var.d();
                int iD10 = np0Var.d();
                int iD11 = np0Var.d();
                if (iD != 0) {
                    if (iD == 3) {
                        i15 = 1;
                    } else {
                        i15 = 2;
                    }
                    i12 *= iD == 1 ? 2 : 1;
                    i16 = i15;
                }
                i13 -= (iD8 + iD9) * i16;
                i14 -= (iD10 + iD11) * i12;
            }
            int i24 = i13;
            int i25 = i14;
            f10 = 1.0f;
            if (np0Var.b() && np0Var.b()) {
                iB = np0Var.b(8);
                if (iB == 255) {
                    iB2 = np0Var.b(16);
                    iB3 = np0Var.b(16);
                    if (iB2 != 0 && iB3 != 0) {
                        f10 = iB2 / iB3;
                    }
                } else {
                    fArr = f23796b;
                    if (iB < 17) {
                        f10 = fArr[iB];
                    } else {
                        o80.a("Unexpected aspect_ratio_idc value: ", iB, "NalUnitUtil");
                    }
                }
            }
            return new c(iB4, iB5, iB6, iD3, i24, i25, f10, zB, zB2, iD4, iD5, iD2, z10);
        }
        iD2 = np0Var.d() + 4;
        z10 = false;
        np0Var.d();
        np0Var.e();
        int iD12 = np0Var.d() + 1;
        int iD13 = np0Var.d() + 1;
        zB2 = np0Var.b();
        i12 = 2 - (zB2 ? 1 : 0);
        int i26 = iD13 * i12;
        if (!zB2) {
            np0Var.e();
        }
        np0Var.e();
        i13 = iD12 * 16;
        i14 = i26 * 16;
        if (np0Var.b()) {
            int iD14 = np0Var.d();
            int iD15 = np0Var.d();
            int iD16 = np0Var.d();
            int iD17 = np0Var.d();
            if (iD != 0) {
                if (iD == 3) {
                    i15 = 1;
                } else {
                    i15 = 2;
                }
                i12 *= iD == 1 ? 2 : 1;
                i16 = i15;
            }
            i13 -= (iD14 + iD15) * i16;
            i14 -= (iD16 + iD17) * i12;
        }
        int i27 = i13;
        int i28 = i14;
        f10 = 1.0f;
        if (np0Var.b()) {
            iB = np0Var.b(8);
            if (iB == 255) {
                iB2 = np0Var.b(16);
                iB3 = np0Var.b(16);
                if (iB2 != 0) {
                    f10 = iB2 / iB3;
                }
            } else {
                fArr = f23796b;
                if (iB < 17) {
                    f10 = fArr[iB];
                } else {
                    o80.a("Unexpected aspect_ratio_idc value: ", iB, "NalUnitUtil");
                }
            }
        }
        return new c(iB4, iB5, iB6, iD3, i27, i28, f10, zB, zB2, iD4, iD5, iD2, z10);
    }
}
