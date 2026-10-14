package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzaai {
    public final zzaac zza;
    public final zzaah zzb;
    public zzaae zzc;
    private final int zzd;

    public zzaai(zzaaf zzaafVar, zzaah zzaahVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzaahVar;
        this.zzd = i10;
        this.zza = new zzaac(zzaafVar, j10, 0L, j12, j13, j14, j15);
    }

    public static final int zzf(zzaax zzaaxVar, long j10, zzabs zzabsVar) {
        if (j10 == zzaaxVar.zzf()) {
            return 0;
        }
        zzabsVar.zza = j10;
        return 1;
    }

    public static final boolean zzg(zzaax zzaaxVar, long j10) throws IOException {
        long jZzf = j10 - zzaaxVar.zzf();
        if (jZzf < 0 || jZzf > 262144) {
            return false;
        }
        ((zzaam) zzaaxVar).zzo((int) jZzf, false);
        return true;
    }

    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        while (true) {
            zzaae zzaaeVar = this.zzc;
            zzdy.zzb(zzaaeVar);
            long j10 = zzaaeVar.zzf;
            long j11 = zzaaeVar.zzg - j10;
            long j12 = zzaaeVar.zzh;
            if (j11 <= this.zzd) {
                zzc(false, j10);
                return zzf(zzaaxVar, j10, zzabsVar);
            }
            if (!zzg(zzaaxVar, j12)) {
                return zzf(zzaaxVar, j12, zzabsVar);
            }
            zzaaxVar.zzj();
            zzaag zzaagVarZza = this.zzb.zza(zzaaxVar, zzaaeVar.zzb);
            int i10 = zzaagVarZza.zzb;
            if (i10 == -3) {
                zzc(false, j12);
                return zzf(zzaaxVar, j12, zzabsVar);
            }
            if (i10 == -2) {
                zzaae.zzh(zzaaeVar, zzaagVarZza.zzc, zzaagVarZza.zzd);
            } else {
                if (i10 != -1) {
                    zzg(zzaaxVar, zzaagVarZza.zzd);
                    zzc(true, zzaagVarZza.zzd);
                    return zzf(zzaaxVar, zzaagVarZza.zzd, zzabsVar);
                }
                zzaae.zzg(zzaaeVar, zzaagVarZza.zzc, zzaagVarZza.zzd);
            }
        }
    }

    public final zzabv zzb() {
        return this.zza;
    }

    public final void zzc(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j10) {
        zzaae zzaaeVar = this.zzc;
        if (zzaaeVar == null || zzaaeVar.zza != j10) {
            long jZzf = this.zza.zzf(j10);
            zzaac zzaacVar = this.zza;
            this.zzc = new zzaae(j10, jZzf, 0L, zzaacVar.zzc, zzaacVar.zzd, zzaacVar.zze, zzaacVar.zzf);
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
