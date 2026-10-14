package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f5589a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f5589a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        return a(iVar, true, false);
    }

    public static boolean a(com.applovin.exoplayer2.e.i iVar, boolean z10) throws IOException {
        return a(iVar, false, z10);
    }

    private static boolean a(com.applovin.exoplayer2.e.i iVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        long jD = iVar.d();
        long j10 = -1;
        long j11 = 4096;
        if (jD != -1 && jD <= 4096) {
            j11 = jD;
        }
        int i10 = (int) j11;
        y yVar = new y(64);
        boolean z17 = false;
        int i11 = 0;
        boolean z18 = false;
        while (true) {
            if (i11 < i10) {
                yVar.a(8);
                if (iVar.b(yVar.d(), z17 ? 1 : 0, 8, true)) {
                    long jO = yVar.o();
                    int iQ = yVar.q();
                    int i12 = 16;
                    if (jO == 1) {
                        iVar.d(yVar.d(), 8, 8);
                        yVar.c(16);
                        jO = yVar.s();
                    } else {
                        if (jO == 0) {
                            long jD2 = iVar.d();
                            if (jD2 != j10) {
                                jO = (jD2 - iVar.b()) + ((long) 8);
                            }
                        }
                        i12 = 8;
                    }
                    long j12 = i12;
                    if (jO < j12) {
                        return z17;
                    }
                    i11 += i12;
                    if (iQ == 1836019574) {
                        i10 += (int) jO;
                        if (jD != -1 && i10 > jD) {
                            i10 = (int) jD;
                        }
                    } else if (iQ == 1836019558 || iQ == 1836475768) {
                        z12 = z17 ? 1 : 0;
                        z13 = true;
                        z14 = true;
                    } else {
                        long j13 = jD;
                        if ((((long) i11) + jO) - j12 >= i10) {
                            z12 = false;
                            z13 = true;
                            z14 = z12 ? 1 : 0;
                        } else {
                            int i13 = (int) (jO - j12);
                            i11 += i13;
                            if (iQ != 1718909296) {
                                z15 = false;
                                if (i13 != 0) {
                                    z18 = z18;
                                    iVar.c(i13);
                                    z18 = z18;
                                }
                            } else {
                                if (i13 < 8) {
                                    return false;
                                }
                                yVar.a(i13);
                                iVar.d(yVar.d(), 0, i13);
                                int i14 = i13 / 4;
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= i14) {
                                        z16 = z18;
                                        break;
                                    }
                                    if (i15 == 1) {
                                        yVar.e(4);
                                    } else if (a(yVar.q(), z11)) {
                                        z16 = true;
                                        break;
                                    }
                                    i15++;
                                }
                                z15 = false;
                                z18 = z16;
                                if (!z16) {
                                    return false;
                                }
                            }
                            z18 = z18;
                            z17 = z15;
                            jD = j13;
                        }
                    }
                    j10 = -1;
                    z18 = z18;
                }
                return (z18 || z10 != z14) ? z12 : z13;
            }
            z12 = z17 ? 1 : 0;
            z13 = true;
            z14 = z12 ? 1 : 0;
            if (z18) {
            }
        }
    }
}
