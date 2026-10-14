package com.applovin.exoplayer2.e;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static int a(com.applovin.exoplayer2.l.y yVar) {
        int i10 = 0;
        while (yVar.a() != 0) {
            int iH = yVar.h();
            i10 += iH;
            if (iH != 255) {
                return i10;
            }
        }
        return -1;
    }

    public static void a(long j10, com.applovin.exoplayer2.l.y yVar, x[] xVarArr) {
        while (true) {
            if (yVar.a() <= 1) {
                return;
            }
            int iA = a(yVar);
            int iA2 = a(yVar);
            int iC = yVar.c() + iA2;
            if (iA2 == -1 || iA2 > yVar.a()) {
                com.applovin.exoplayer2.l.q.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iC = yVar.b();
            } else if (iA == 4 && iA2 >= 8) {
                int iH = yVar.h();
                int i10 = yVar.i();
                int iQ = i10 == 49 ? yVar.q() : 0;
                int iH2 = yVar.h();
                if (i10 == 47) {
                    yVar.e(1);
                }
                boolean z10 = iH == 181 && (i10 == 49 || i10 == 47) && iH2 == 3;
                if (i10 == 49) {
                    z10 &= iQ == 1195456820;
                }
                if (z10) {
                    b(j10, yVar, xVarArr);
                }
            }
            yVar.d(iC);
        }
    }

    public static void b(long j10, com.applovin.exoplayer2.l.y yVar, x[] xVarArr) {
        int iH = yVar.h();
        if ((iH & 64) != 0) {
            yVar.e(1);
            int i10 = (iH & 31) * 3;
            int iC = yVar.c();
            for (x xVar : xVarArr) {
                yVar.d(iC);
                xVar.a(yVar, i10);
                if (j10 != -9223372036854775807L) {
                    xVar.a(j10, 1, i10, 0, null);
                }
            }
        }
    }
}
