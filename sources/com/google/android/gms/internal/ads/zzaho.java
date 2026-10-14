package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzaho {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzfa zzg = new zzfa(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzaax zzaaxVar, boolean z10) throws IOException {
        zza();
        this.zzg.zzC(27);
        if (zzaba.zzc(zzaaxVar, this.zzg.zzH(), 0, 27, z10) && this.zzg.zzs() == 1332176723) {
            if (this.zzg.zzk() != 0) {
                if (z10) {
                    return false;
                }
                throw zzcd.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzk();
            this.zzb = this.zzg.zzp();
            this.zzg.zzq();
            this.zzg.zzq();
            this.zzg.zzq();
            int iZzk = this.zzg.zzk();
            this.zzc = iZzk;
            this.zzd = iZzk + 27;
            this.zzg.zzC(iZzk);
            if (zzaba.zzc(zzaaxVar, this.zzg.zzH(), 0, this.zzc, z10)) {
                for (int i10 = 0; i10 < this.zzc; i10++) {
                    this.zzf[i10] = this.zzg.zzk();
                    this.zze += this.zzf[i10];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzaax zzaaxVar, long j10) throws IOException {
        zzdy.zzd(zzaaxVar.zzf() == zzaaxVar.zze());
        this.zzg.zzC(4);
        while (true) {
            if ((j10 != -1 && zzaaxVar.zzf() + 4 >= j10) || !zzaba.zzc(zzaaxVar, this.zzg.zzH(), 0, 4, true)) {
                break;
            }
            this.zzg.zzF(0);
            if (this.zzg.zzs() == 1332176723) {
                zzaaxVar.zzj();
                return true;
            }
            ((zzaam) zzaaxVar).zzo(1, false);
        }
        do {
            if (j10 != -1 && zzaaxVar.zzf() >= j10) {
                break;
            }
        } while (zzaaxVar.zzc(1) != -1);
        return false;
    }
}
