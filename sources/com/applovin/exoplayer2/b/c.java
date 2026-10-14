package com.applovin.exoplayer2.b;

import com.facebook.ads.AdError;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f4403a = {AdError.CACHE_ERROR_CODE, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4408e;

        private a(int i10, int i11, int i12, int i13, int i14) {
            this.f4404a = i10;
            this.f4406c = i11;
            this.f4405b = i12;
            this.f4407d = i13;
            this.f4408e = i14;
        }
    }

    private static int a(com.applovin.exoplayer2.l.x xVar, int i10) {
        int i11 = 0;
        while (true) {
            int iC = xVar.c(i10) + i11;
            if (!xVar.e()) {
                return iC;
            }
            i11 = (iC + 1) << i10;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return a(new com.applovin.exoplayer2.l.x(bArr)).f4408e;
    }

    public static int a(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    public static a a(com.applovin.exoplayer2.l.x xVar) {
        int i10;
        int i11;
        int iC = xVar.c(16);
        int iC2 = xVar.c(16);
        if (iC2 == 65535) {
            iC2 = xVar.c(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = iC2 + i10;
        if (iC == 44097) {
            i12 += 2;
        }
        int i13 = i12;
        int iC3 = xVar.c(2);
        if (iC3 == 3) {
            iC3 += a(xVar, 2);
        }
        int i14 = iC3;
        int iC4 = xVar.c(10);
        if (xVar.e() && xVar.c(3) > 0) {
            xVar.b(2);
        }
        int i15 = xVar.e() ? 48000 : 44100;
        int iC5 = xVar.c(4);
        int i16 = 0;
        if (i15 == 44100 && iC5 == 13) {
            i11 = f4403a[iC5];
        } else {
            if (i15 == 48000) {
                int[] iArr = f4403a;
                if (iC5 < iArr.length) {
                    i16 = iArr[iC5];
                    int i17 = iC4 % 5;
                    if (i17 == 1) {
                        if (iC5 != 3 || iC5 == 8) {
                            i16++;
                        }
                    } else if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 == 4 && (iC5 == 3 || iC5 == 8 || iC5 == 11)) {
                                i16++;
                            }
                        } else if (iC5 != 3) {
                            i16++;
                        } else {
                            i16++;
                        }
                    } else if (iC5 == 8 || iC5 == 11) {
                        i16++;
                    }
                }
            }
            i11 = i16;
        }
        return new a(i14, 2, i15, i13, i11);
    }

    public static com.applovin.exoplayer2.v a(com.applovin.exoplayer2.l.y yVar, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        yVar.e(1);
        return new com.applovin.exoplayer2.v.a().a(str).f("audio/ac4").k(2).l(((yVar.h() & 32) >> 5) == 1 ? 48000 : 44100).a(eVar).c(str2).a();
    }

    public static void a(int i10, com.applovin.exoplayer2.l.y yVar) {
        yVar.a(7);
        byte[] bArrD = yVar.d();
        bArrD[0] = -84;
        bArrD[1] = 64;
        bArrD[2] = -1;
        bArrD[3] = -1;
        bArrD[4] = (byte) ((i10 >> 16) & 255);
        bArrD[5] = (byte) ((i10 >> 8) & 255);
        bArrD[6] = (byte) (i10 & 255);
    }
}
