package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzahb {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzaax zzaaxVar) throws IOException {
        return zzc(zzaaxVar, true, false);
    }

    public static boolean zzb(zzaax zzaaxVar, boolean z10) throws IOException {
        return zzc(zzaaxVar, false, false);
    }

    private static boolean zzc(zzaax zzaaxVar, boolean z10, boolean z11) throws IOException {
        boolean z12;
        long jZzd = zzaaxVar.zzd();
        long j10 = -1;
        long j11 = 4096;
        if (jZzd != -1 && jZzd <= 4096) {
            j11 = jZzd;
        }
        zzfa zzfaVar = new zzfa(64);
        int i10 = (int) j11;
        boolean z13 = false;
        int i11 = 0;
        boolean z14 = false;
        while (true) {
            if (i11 < i10) {
                zzfaVar.zzC(8);
                if (!zzaaxVar.zzm(zzfaVar.zzH(), z13 ? 1 : 0, 8, true)) {
                    z12 = z13 ? 1 : 0;
                    break;
                }
                long jZzs = zzfaVar.zzs();
                int iZze = zzfaVar.zze();
                int i12 = 16;
                if (jZzs == 1) {
                    zzaaxVar.zzh(zzfaVar.zzH(), 8, 8);
                    zzfaVar.zzE(16);
                    jZzs = zzfaVar.zzr();
                } else {
                    if (jZzs == 0) {
                        long jZzd2 = zzaaxVar.zzd();
                        if (jZzd2 != j10) {
                            jZzs = (jZzd2 - zzaaxVar.zze()) + 8;
                        }
                    }
                    i12 = 8;
                }
                long j12 = i12;
                if (jZzs < j12) {
                    return z13;
                }
                i11 += i12;
                if (iZze == 1836019574) {
                    i10 += (int) jZzs;
                    if (jZzd != -1 && i10 > jZzd) {
                        i10 = (int) jZzd;
                    }
                    j10 = -1;
                } else {
                    if (iZze == 1836019558 || iZze == 1836475768) {
                        z12 = true;
                        break;
                    }
                    zzfa zzfaVar2 = zzfaVar;
                    long j13 = jZzs;
                    if ((((long) i11) + jZzs) - j12 < i10) {
                        int i13 = (int) (j13 - j12);
                        i11 += i13;
                        if (iZze == 1718909296) {
                            if (i13 < 8) {
                                return false;
                            }
                            zzfaVar2.zzC(i13);
                            zzaaxVar.zzh(zzfaVar2.zzH(), 0, i13);
                            int i14 = i13 >> 2;
                            for (int i15 = 0; i15 < i14; i15++) {
                                if (i15 != 1) {
                                    int iZze2 = zzfaVar2.zze();
                                    if ((iZze2 >>> 8) != 3368816) {
                                        if (iZze2 == 1751476579) {
                                            iZze2 = 1751476579;
                                        }
                                        int[] iArr = zza;
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= 29) {
                                                continue;
                                            } else if (iArr[i16] != iZze2) {
                                                i16++;
                                            }
                                        }
                                    }
                                    z14 = true;
                                    break;
                                }
                                zzfaVar2.zzG(4);
                            }
                            if (!z14) {
                                return false;
                            }
                        } else if (i13 != 0) {
                            zzaaxVar.zzg(i13);
                        }
                        zzfaVar = zzfaVar2;
                        j10 = -1;
                        z13 = false;
                    }
                }
            }
            z12 = false;
            break;
        }
        return z14 && z10 == z12;
    }
}
