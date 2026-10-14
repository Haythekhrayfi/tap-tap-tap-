package com.applovin.exoplayer2.e.i;

/* JADX INFO: loaded from: classes.dex */
public final class ae {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long a(com.applovin.exoplayer2.l.y yVar, int i10, int i11) {
        yVar.d(i10);
        if (yVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iQ = yVar.q();
        if ((8388608 & iQ) != 0 || ((2096896 & iQ) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if (((iQ & 32) != 0) && yVar.h() >= 7 && yVar.a() >= 7) {
            if ((yVar.h() & 16) == 16) {
                byte[] bArr = new byte[6];
                yVar.a(bArr, 0, 6);
                return a(bArr);
            }
        }
        return -9223372036854775807L;
    }

    private static long a(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static boolean a(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }
}
