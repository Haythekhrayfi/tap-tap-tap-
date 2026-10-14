package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzaje {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfh zza = new zzfh(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfa zzb = new zzfa();

    public static long zzc(zzfa zzfaVar) {
        int iZzc = zzfaVar.zzc();
        if (zzfaVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfaVar.zzB(bArr, 0, 9);
        zzfaVar.zzF(iZzc);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = (j12 & 248) >> 3;
        return ((255 & bArr[3]) << 5) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | ((j11 & 255) << 20) | (j13 << 15) | ((j12 & 3) << 13) | ((((long) bArr[4]) & 248) >> 3);
    }

    private final int zzf(zzaax zzaaxVar) {
        zzfa zzfaVar = this.zzb;
        byte[] bArr = zzfj.zzf;
        int length = bArr.length;
        zzfaVar.zzD(bArr, 0);
        this.zzc = true;
        zzaaxVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzaaxVar.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
            long j11 = jZzd - ((long) iMin);
            if (zzaaxVar.zzf() != j11) {
                zzabsVar.zza = j11;
                return 1;
            }
            this.zzb.zzC(iMin);
            zzaaxVar.zzj();
            ((zzaam) zzaaxVar).zzm(this.zzb.zzH(), 0, iMin, false);
            zzfa zzfaVar = this.zzb;
            int iZzc = zzfaVar.zzc();
            for (int iZzd = zzfaVar.zzd() - 4; iZzd >= iZzc; iZzd--) {
                if (zzg(zzfaVar.zzH(), iZzd) == 442) {
                    zzfaVar.zzF(iZzd + 4);
                    long jZzc = zzc(zzfaVar);
                    if (jZzc != -9223372036854775807L) {
                        j10 = jZzc;
                        break;
                    }
                }
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzaaxVar);
            return 0;
        }
        if (this.zzd) {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zzf(zzaaxVar);
                return 0;
            }
            long jZzb = this.zza.zzb(this.zzg) - this.zza.zzb(j12);
            this.zzh = jZzb;
            if (jZzb < 0) {
                zzer.zzf("PsDurationReader", "Invalid duration: " + jZzb + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zzf(zzaaxVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzaaxVar.zzd());
        if (zzaaxVar.zzf() != 0) {
            zzabsVar.zza = 0L;
            return 1;
        }
        this.zzb.zzC(iMin2);
        zzaaxVar.zzj();
        ((zzaam) zzaaxVar).zzm(this.zzb.zzH(), 0, iMin2, false);
        zzfa zzfaVar2 = this.zzb;
        int iZzd2 = zzfaVar2.zzd();
        for (int iZzc2 = zzfaVar2.zzc(); iZzc2 < iZzd2 - 3; iZzc2++) {
            if (zzg(zzfaVar2.zzH(), iZzc2) == 442) {
                zzfaVar2.zzF(iZzc2 + 4);
                long jZzc2 = zzc(zzfaVar2);
                if (jZzc2 != -9223372036854775807L) {
                    j10 = jZzc2;
                    break;
                }
            }
        }
        this.zzf = j10;
        this.zzd = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfh zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
