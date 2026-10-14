package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabf {
    public static int zza(zzfa zzfaVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return zzfaVar.zzk() + 1;
            case 7:
                return zzfaVar.zzo() + 1;
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

    public static long zzb(zzaax zzaaxVar, zzabj zzabjVar) throws IOException {
        zzaaxVar.zzj();
        zzaam zzaamVar = (zzaam) zzaaxVar;
        zzaamVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzaamVar.zzm(bArr, 0, 1, false);
        int i10 = bArr[0] & 1;
        boolean z10 = 1 == i10;
        zzaamVar.zzl(2, false);
        int i11 = 1 != i10 ? 6 : 7;
        zzfa zzfaVar = new zzfa(i11);
        zzfaVar.zzE(zzaba.zza(zzaaxVar, zzfaVar.zzH(), 0, i11));
        zzaaxVar.zzj();
        zzabe zzabeVar = new zzabe();
        if (zzd(zzfaVar, zzabjVar, z10, zzabeVar)) {
            return zzabeVar.zza;
        }
        throw zzcd.zza(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae A[RETURN] */
    public static boolean zzc(zzfa zzfaVar, zzabj zzabjVar, int i10, zzabe zzabeVar) {
        int iZza;
        int iZzc = zzfaVar.zzc();
        long jZzs = zzfaVar.zzs();
        long j10 = jZzs >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        long j11 = jZzs >> 12;
        long j12 = jZzs >> 8;
        long j13 = jZzs >> 4;
        long j14 = jZzs >> 1;
        long j15 = jZzs & 1;
        int i11 = (int) (j13 & 15);
        if (i11 > 7 ? !(i11 > 10 || zzabjVar.zzg != 2) : i11 == zzabjVar.zzg - 1) {
            int i12 = (int) (j14 & 7);
            if ((i12 == 0 || i12 == zzabjVar.zzi) && j15 != 1 && zzd(zzfaVar, zzabjVar, z10, zzabeVar) && (iZza = zza(zzfaVar, (int) (j11 & 15))) != -1 && iZza <= zzabjVar.zzb) {
                int i13 = zzabjVar.zze;
                int i14 = (int) (j12 & 15);
                if (i14 != 0) {
                    if (i14 <= 11) {
                        if (i14 == zzabjVar.zzf) {
                            if (zzfaVar.zzk() == zzfj.zze(zzfaVar.zzH(), iZzc, zzfaVar.zzc() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i14 == 12) {
                        if (zzfaVar.zzk() * 1000 == i13) {
                            if (zzfaVar.zzk() == zzfj.zze(zzfaVar.zzH(), iZzc, zzfaVar.zzc() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i14 <= 14) {
                        int iZzo = zzfaVar.zzo();
                        if (i14 == 14) {
                            iZzo *= 10;
                        }
                        if (iZzo == i13) {
                            if (zzfaVar.zzk() == zzfj.zze(zzfaVar.zzH(), iZzc, zzfaVar.zzc() - 1, 0)) {
                                return true;
                            }
                        }
                    }
                } else if (zzfaVar.zzk() == zzfj.zze(zzfaVar.zzH(), iZzc, zzfaVar.zzc() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzd(zzfa zzfaVar, zzabj zzabjVar, boolean z10, zzabe zzabeVar) {
        try {
            long jZzu = zzfaVar.zzu();
            if (!z10) {
                jZzu *= (long) zzabjVar.zzb;
            }
            zzabeVar.zza = jZzu;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
