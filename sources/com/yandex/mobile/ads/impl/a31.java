package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class a31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f18782a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(vt vtVar, boolean z10) throws IOException {
        return a(vtVar, false, z10);
    }

    private static boolean a(vt vtVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        long jA = vtVar.a();
        long j10 = -1;
        long j11 = 4096;
        if (jA != -1 && jA <= 4096) {
            j11 = jA;
        }
        int i10 = (int) j11;
        mp0 mp0Var = new mp0(64);
        boolean z17 = false;
        int i11 = 0;
        boolean z18 = false;
        while (true) {
            if (i11 < i10) {
                mp0Var.c(8);
                if (vtVar.b(mp0Var.c(), z17 ? 1 : 0, 8, true)) {
                    long jV = mp0Var.v();
                    int iH = mp0Var.h();
                    int i12 = 16;
                    if (jV == 1) {
                        vtVar.a(mp0Var.c(), 8, 8);
                        mp0Var.d(16);
                        jV = mp0Var.p();
                    } else {
                        if (jV == 0) {
                            long jA2 = vtVar.a();
                            if (jA2 != j10) {
                                jV = (jA2 - vtVar.e()) + ((long) 8);
                            }
                        }
                        i12 = 8;
                    }
                    long j12 = i12;
                    if (jV < j12) {
                        return z17;
                    }
                    i11 += i12;
                    if (iH == 1836019574) {
                        i10 += (int) jV;
                        if (jA != -1 && i10 > jA) {
                            i10 = (int) jA;
                        }
                    } else if (iH == 1836019558 || iH == 1836475768) {
                        z12 = z17 ? 1 : 0;
                        z13 = true;
                        z14 = true;
                    } else {
                        long j13 = jA;
                        if ((((long) i11) + jV) - j12 >= i10) {
                            z12 = false;
                            z13 = true;
                            z14 = z12 ? 1 : 0;
                        } else {
                            int i13 = (int) (jV - j12);
                            i11 += i13;
                            if (iH != 1718909296) {
                                z15 = false;
                                if (i13 != 0) {
                                    z18 = z18;
                                    vtVar.b(i13);
                                    z18 = z18;
                                }
                            } else {
                                if (i13 < 8) {
                                    return false;
                                }
                                mp0Var.c(i13);
                                vtVar.a(mp0Var.c(), 0, i13);
                                int i14 = i13 / 4;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    if (i15 != 1) {
                                        int iH2 = mp0Var.h();
                                        if ((iH2 >>> 8) == 3368816 || (iH2 == 1751476579 && z11)) {
                                            z16 = true;
                                            break;
                                        }
                                        int[] iArr = f18782a;
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= 29) {
                                                z16 = false;
                                                break;
                                            }
                                            if (iArr[i16] == iH2) {
                                                z16 = true;
                                                break;
                                            }
                                            i16++;
                                        }
                                        if (z16) {
                                            z18 = true;
                                            break;
                                        }
                                    } else {
                                        mp0Var.f(4);
                                    }
                                }
                                z15 = false;
                                z18 = z18;
                                if (!z18) {
                                    return false;
                                }
                            }
                            z18 = z18;
                            z17 = z15;
                            jA = j13;
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

    public static boolean a(xn xnVar) throws IOException {
        return a(xnVar, true, false);
    }
}
