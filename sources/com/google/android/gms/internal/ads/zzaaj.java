package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaj {
    public static void zza(long j10, zzfa zzfaVar, zzabz[] zzabzVarArr) {
        int iZze;
        while (true) {
            if (zzfaVar.zza() <= 1) {
                return;
            }
            int iZzc = zzc(zzfaVar);
            int iZzc2 = zzc(zzfaVar);
            int iZzc3 = zzfaVar.zzc() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzfaVar.zza()) {
                zzer.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzc3 = zzfaVar.zzd();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzk = zzfaVar.zzk();
                int iZzo = zzfaVar.zzo();
                if (iZzo == 49) {
                    iZze = zzfaVar.zze();
                    iZzo = 49;
                } else {
                    iZze = 0;
                }
                int iZzk2 = zzfaVar.zzk();
                if (iZzo == 47) {
                    zzfaVar.zzG(1);
                    iZzo = 47;
                }
                boolean z10 = iZzk == 181 && (iZzo == 49 || iZzo == 47) && iZzk2 == 3;
                if (iZzo == 49) {
                    z10 &= iZze == 1195456820;
                }
                if (z10) {
                    zzb(j10, zzfaVar, zzabzVarArr);
                }
            }
            zzfaVar.zzF(iZzc3);
        }
    }

    public static void zzb(long j10, zzfa zzfaVar, zzabz[] zzabzVarArr) {
        int iZzk = zzfaVar.zzk();
        if ((iZzk & 64) != 0) {
            int i10 = iZzk & 31;
            zzfaVar.zzG(1);
            int iZzc = zzfaVar.zzc();
            for (zzabz zzabzVar : zzabzVarArr) {
                int i11 = i10 * 3;
                zzfaVar.zzF(iZzc);
                zzabzVar.zzq(zzfaVar, i11);
                if (j10 != -9223372036854775807L) {
                    zzabzVar.zzs(j10, 1, i11, 0, null);
                }
            }
        }
    }

    private static int zzc(zzfa zzfaVar) {
        int i10 = 0;
        while (zzfaVar.zza() != 0) {
            int iZzk = zzfaVar.zzk();
            i10 += iZzk;
            if (iZzk != 255) {
                return i10;
            }
        }
        return -1;
    }
}
