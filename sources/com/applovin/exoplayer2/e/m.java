package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f6107a;
    }

    public static int a(com.applovin.exoplayer2.l.y yVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return yVar.h() + 1;
            case 7:
                return yVar.i() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long a(i iVar, p pVar) throws IOException {
        iVar.a();
        iVar.c(1);
        byte[] bArr = new byte[1];
        iVar.d(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        iVar.c(2);
        int i10 = z10 ? 7 : 6;
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(i10);
        yVar.c(k.a(iVar, yVar.d(), 0, i10));
        iVar.a();
        a aVar = new a();
        if (a(yVar, pVar, z10, aVar)) {
            return aVar.f6107a;
        }
        throw ai.b(null, null);
    }

    private static boolean a(int i10, p pVar) {
        if (i10 <= 7) {
            return i10 == pVar.f6117g - 1;
        }
        return i10 <= 10 && pVar.f6117g == 2;
    }

    public static boolean a(i iVar, p pVar, int i10, a aVar) throws IOException {
        long jB = iVar.b();
        byte[] bArr = new byte[2];
        iVar.d(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            iVar.a();
            iVar.c((int) (jB - iVar.c()));
            return false;
        }
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(16);
        System.arraycopy(bArr, 0, yVar.d(), 0, 2);
        yVar.c(k.a(iVar, yVar.d(), 2, 14));
        iVar.a();
        iVar.c((int) (jB - iVar.c()));
        return a(yVar, pVar, i10, aVar);
    }

    private static boolean a(com.applovin.exoplayer2.l.y yVar, p pVar, int i10) {
        int iA = a(yVar, i10);
        return iA != -1 && iA <= pVar.f6112b;
    }

    public static boolean a(com.applovin.exoplayer2.l.y yVar, p pVar, int i10, a aVar) {
        int iC = yVar.c();
        long jO = yVar.o();
        long j10 = jO >>> 16;
        if (j10 != i10) {
            return false;
        }
        return a((int) ((jO >> 4) & 15), pVar) && b((int) ((jO >> 1) & 7), pVar) && !(((jO & 1) > 1L ? 1 : ((jO & 1) == 1L ? 0 : -1)) == 0) && a(yVar, pVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(yVar, pVar, (int) ((jO >> 12) & 15)) && b(yVar, pVar, (int) ((jO >> 8) & 15)) && b(yVar, iC);
    }

    private static boolean a(com.applovin.exoplayer2.l.y yVar, p pVar, boolean z10, a aVar) {
        try {
            long jD = yVar.D();
            if (!z10) {
                jD *= (long) pVar.f6112b;
            }
            aVar.f6107a = jD;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static boolean b(int i10, p pVar) {
        return i10 == 0 || i10 == pVar.f6119i;
    }

    private static boolean b(com.applovin.exoplayer2.l.y yVar, int i10) {
        return yVar.h() == com.applovin.exoplayer2.l.ai.b(yVar.d(), i10, yVar.c() - 1, 0);
    }

    private static boolean b(com.applovin.exoplayer2.l.y yVar, p pVar, int i10) {
        int i11 = pVar.f6115e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == pVar.f6116f;
        }
        if (i10 == 12) {
            return yVar.h() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int i12 = yVar.i();
        if (i10 == 14) {
            i12 *= 10;
        }
        return i12 == i11;
    }
}
