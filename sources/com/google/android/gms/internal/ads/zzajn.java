package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzajn {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfh zza = new zzfh(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfa zzb = new zzfa();

    public zzajn(int i10) {
    }

    private final int zze(zzaax zzaaxVar) {
        zzfa zzfaVar = this.zzb;
        byte[] bArr = zzfj.zzf;
        int length = bArr.length;
        zzfaVar.zzD(bArr, 0);
        this.zzc = true;
        zzaaxVar.zzj();
        return 0;
    }

    public final int zza(zzaax zzaaxVar, zzabs zzabsVar, int i10) throws IOException {
        if (i10 <= 0) {
            zze(zzaaxVar);
            return 0;
        }
        long j10 = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzaaxVar.zzd();
            int iMin = (int) Math.min(112800L, jZzd);
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
            int iZzd = zzfaVar.zzd();
            for (int i11 = iZzd - 188; i11 >= iZzc; i11--) {
                byte[] bArrZzH = zzfaVar.zzH();
                int i12 = 0;
                for (int i13 = -4; i13 <= 4; i13++) {
                    int i14 = (i13 * 188) + i11;
                    if (i14 >= iZzc && i14 < iZzd && bArrZzH[i14] == 71) {
                        i12++;
                        if (i12 == 5) {
                            long jZzb = zzajx.zzb(zzfaVar, i11, i10);
                            if (jZzb == -9223372036854775807L) {
                                break;
                            }
                            j10 = jZzb;
                            break;
                        }
                    } else {
                        i12 = 0;
                    }
                }
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zze(zzaaxVar);
            return 0;
        }
        if (this.zzd) {
            long j12 = this.zzf;
            if (j12 == -9223372036854775807L) {
                zze(zzaaxVar);
                return 0;
            }
            long jZzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j12);
            this.zzh = jZzb2;
            if (jZzb2 < 0) {
                zzer.zzf("TsDurationReader", "Invalid duration: " + jZzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzaaxVar);
            return 0;
        }
        int iMin2 = (int) Math.min(112800L, zzaaxVar.zzd());
        if (zzaaxVar.zzf() != 0) {
            zzabsVar.zza = 0L;
            return 1;
        }
        this.zzb.zzC(iMin2);
        zzaaxVar.zzj();
        ((zzaam) zzaaxVar).zzm(this.zzb.zzH(), 0, iMin2, false);
        zzfa zzfaVar2 = this.zzb;
        int iZzd2 = zzfaVar2.zzd();
        for (int iZzc2 = zzfaVar2.zzc(); iZzc2 < iZzd2; iZzc2++) {
            if (zzfaVar2.zzH()[iZzc2] == 71) {
                long jZzb3 = zzajx.zzb(zzfaVar2, iZzc2, i10);
                if (jZzb3 != -9223372036854775807L) {
                    j10 = jZzb3;
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

    public final zzfh zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
