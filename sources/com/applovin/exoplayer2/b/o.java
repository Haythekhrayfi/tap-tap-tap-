package com.applovin.exoplayer2.b;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f4561a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f4562b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f4563c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static int a(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iPosition = byteBuffer.position();
        byte b10 = byteBuffer.get(iPosition);
        if (b10 != -2) {
            if (b10 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                i13 = iPosition + 7;
            } else if (b10 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                i11 = iPosition + 5;
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                i13 = iPosition + 6;
            }
            i12 = byteBuffer.get(i13) & 60;
            return (((i12 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        i11 = iPosition + 4;
        i12 = byteBuffer.get(i11) & 252;
        return (((i12 >> 2) | i10) + 1) * 32;
    }

    public static int a(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static com.applovin.exoplayer2.v a(byte[] bArr, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        com.applovin.exoplayer2.l.x xVarC = c(bArr);
        xVarC.b(60);
        int i10 = f4561a[xVarC.c(6)];
        int i11 = f4562b[xVarC.c(4)];
        int iC = xVarC.c(5);
        int[] iArr = f4563c;
        int i12 = iC >= iArr.length ? -1 : (iArr[iC] * 1000) / 2;
        xVarC.b(10);
        return new com.applovin.exoplayer2.v.a().a(str).f("audio/vnd.dts").d(i12).k(i10 + (xVarC.c(2) > 0 ? 1 : 0)).l(i11).a(eVar).c(str2).a();
    }

    public static boolean a(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int b(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    private static com.applovin.exoplayer2.l.x c(byte[] bArr) {
        if (bArr[0] == 127) {
            return new com.applovin.exoplayer2.l.x(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (d(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b10 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b10;
            }
        }
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            com.applovin.exoplayer2.l.x xVar2 = new com.applovin.exoplayer2.l.x(bArrCopyOf);
            while (xVar2.a() >= 16) {
                xVar2.b(2);
                xVar.a(xVar2.c(14), 14);
            }
        }
        xVar.a(bArrCopyOf);
        return xVar;
    }

    private static boolean d(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
