package com.applovin.exoplayer2.l;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7660a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f7661b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f7662c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int[] f7663d = new int[10];

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f7666c;

        public a(int i10, int i11, boolean z10) {
            this.f7664a = i10;
            this.f7665b = i11;
            this.f7666c = z10;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f7673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f7674h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f7675i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f7676j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f7677k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f7678l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f7679m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f7667a = i10;
            this.f7668b = i11;
            this.f7669c = i12;
            this.f7670d = i13;
            this.f7671e = i14;
            this.f7672f = i15;
            this.f7673g = f10;
            this.f7674h = z10;
            this.f7675i = z11;
            this.f7676j = i16;
            this.f7677k = i17;
            this.f7678l = i18;
            this.f7679m = z12;
        }
    }

    public static int a(byte[] bArr, int i10) {
        int i11;
        synchronized (f7662c) {
            int iC = 0;
            int i12 = 0;
            while (iC < i10) {
                try {
                    iC = c(bArr, iC, i10);
                    if (iC < i10) {
                        int[] iArr = f7663d;
                        if (iArr.length <= i12) {
                            f7663d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f7663d[i12] = iC;
                        iC += 3;
                        i12++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f7663d[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i18 + 1;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i11 - i13);
        }
        return i11;
    }

    public static int a(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        com.applovin.exoplayer2.l.a.b(i12 >= 0);
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
            if ((bArr[i14] & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && bArr[i14] == 1) {
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

    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x0106  */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0176 A[PHI: r1
  0x0176: PHI (r1v12 float) = (r1v11 float), (r1v11 float), (r1v11 float), (r1v11 float), (r1v11 float), (r1v14 float) binds: [B:73:0x0133, B:75:0x0139, B:85:0x0160, B:79:0x014f, B:80:0x0151, B:81:0x0153] A[DONT_GENERATE, DONT_INLINE]] */
    public static b a(byte[] bArr, int i10, int i11) {
        int iD;
        boolean z10;
        int iD2;
        boolean z11;
        int i12;
        int i13;
        boolean zB;
        int i14;
        int i15;
        float f10;
        float f11;
        int i16;
        int i17;
        int i18;
        int i19;
        z zVar = new z(bArr, i10, i11);
        zVar.a(8);
        int iC = zVar.c(8);
        int iC2 = zVar.c(8);
        int iC3 = zVar.c(8);
        int iD3 = zVar.d();
        if (iC == 100 || iC == 110 || iC == 122 || iC == 244 || iC == 44 || iC == 83 || iC == 86 || iC == 118 || iC == 128 || iC == 138) {
            iD = zVar.d();
            boolean zB2 = iD == 3 ? zVar.b() : false;
            zVar.d();
            zVar.d();
            zVar.a();
            if (zVar.b()) {
                int i20 = iD == 3 ? 12 : 8;
                int i21 = 0;
                while (i21 < i20) {
                    if (zVar.b()) {
                        a(zVar, i21 < 6 ? 16 : 64);
                    }
                    i21++;
                }
            }
            z10 = zB2;
        } else {
            z10 = false;
            iD = 1;
        }
        int iD4 = zVar.d() + 4;
        int iD5 = zVar.d();
        if (iD5 != 0) {
            if (iD5 == 1) {
                boolean zB3 = zVar.b();
                zVar.e();
                zVar.e();
                long jD = zVar.d();
                iD = iD;
                for (int i22 = 0; i22 < jD; i22++) {
                    zVar.d();
                }
                z11 = zB3;
                i12 = 0;
            } else {
                iD2 = 0;
            }
            zVar.d();
            zVar.a();
            i13 = 1;
            int iD6 = zVar.d() + 1;
            int iD7 = zVar.d() + 1;
            zB = zVar.b();
            int i23 = (2 - (zB ? 1 : 0)) * iD7;
            if (!zB) {
                zVar.a();
            }
            zVar.a();
            i14 = iD6 * 16;
            i15 = i23 * 16;
            if (zVar.b()) {
                int iD8 = zVar.d();
                int iD9 = zVar.d();
                int iD10 = zVar.d();
                int iD11 = zVar.d();
                if (iD == 0) {
                    i19 = 2 - (zB ? 1 : 0);
                } else {
                    i16 = iD;
                    if (i16 == 3) {
                        i17 = 1;
                        i18 = 1;
                    } else {
                        i17 = 1;
                        i18 = 2;
                    }
                    if (i16 == i17) {
                        i17 = 2;
                    }
                    int i24 = i18;
                    i19 = i17 * (2 - (zB ? 1 : 0));
                    i13 = i24;
                }
                i14 -= (iD8 + iD9) * i13;
                i15 -= (iD10 + iD11) * i19;
            } else {
                z11 = z11;
            }
            int i25 = i14;
            f10 = 1.0f;
            if (zVar.b() || !zVar.b()) {
                f11 = f10;
            } else {
                int iC4 = zVar.c(8);
                if (iC4 == 255) {
                    int iC5 = zVar.c(16);
                    int iC6 = zVar.c(16);
                    if (iC5 != 0 && iC6 != 0) {
                        f10 = iC5 / iC6;
                    }
                } else {
                    float[] fArr = f7661b;
                    if (iC4 < fArr.length) {
                        f11 = fArr[iC4];
                    } else {
                        q.c("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iC4);
                    }
                }
                f11 = f10;
            }
            return new b(iC, iC2, iC3, iD3, i25, i15, f11, z10, zB, iD4, iD5, i12, z11);
        }
        iD2 = zVar.d() + 4;
        i12 = iD2;
        z11 = false;
        zVar.d();
        zVar.a();
        i13 = 1;
        int iD12 = zVar.d() + 1;
        int iD13 = zVar.d() + 1;
        zB = zVar.b();
        int i26 = (2 - (zB ? 1 : 0)) * iD13;
        if (!zB) {
            zVar.a();
        }
        zVar.a();
        i14 = iD12 * 16;
        i15 = i26 * 16;
        if (zVar.b()) {
            int iD14 = zVar.d();
            int iD15 = zVar.d();
            int iD16 = zVar.d();
            int iD17 = zVar.d();
            if (iD == 0) {
                i19 = 2 - (zB ? 1 : 0);
            } else {
                i16 = iD;
                if (i16 == 3) {
                    i17 = 1;
                    i18 = 1;
                } else {
                    i17 = 1;
                    i18 = 2;
                }
                if (i16 == i17) {
                    i17 = 2;
                }
                int i27 = i18;
                i19 = i17 * (2 - (zB ? 1 : 0));
                i13 = i27;
            }
            i14 -= (iD14 + iD15) * i13;
            i15 -= (iD16 + iD17) * i19;
        } else {
            z11 = z11;
        }
        int i28 = i14;
        f10 = 1.0f;
        if (zVar.b()) {
            f11 = f10;
        } else {
            f11 = f10;
        }
        return new b(iC, iC2, iC3, iD3, i28, i15, f11, z10, zB, iD4, iD5, i12, z11);
    }

    private static void a(z zVar, int i10) {
        int iE = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (iE != 0) {
                iE = ((zVar.e() + i11) + 256) % 256;
            }
            if (iE != 0) {
                i11 = iE;
            }
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & 255;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & Ascii.US) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean a(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & Ascii.US) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
    }

    public static int b(byte[] bArr, int i10) {
        return bArr[i10 + 3] & Ascii.US;
    }

    public static a b(byte[] bArr, int i10, int i11) {
        z zVar = new z(bArr, i10, i11);
        zVar.a(8);
        int iD = zVar.d();
        int iD2 = zVar.d();
        zVar.a();
        return new a(iD, iD2, zVar.b());
    }

    public static int c(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    private static int c(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }
}
