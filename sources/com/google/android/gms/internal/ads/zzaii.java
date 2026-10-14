package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaii implements zzaij {
    private final List zza;
    private final zzabz[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzaii(List list) {
        this.zza = list;
        this.zzb = new zzabz[list.size()];
    }

    private final boolean zzf(zzfa zzfaVar, int i10) {
        if (zzfaVar.zza() == 0) {
            return false;
        }
        if (zzfaVar.zzk() != i10) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzfaVar, 32)) {
                if (this.zzd != 1 || zzf(zzfaVar, 0)) {
                    int iZzc = zzfaVar.zzc();
                    int iZza = zzfaVar.zza();
                    for (zzabz zzabzVar : this.zzb) {
                        zzfaVar.zzF(iZzc);
                        zzabzVar.zzq(zzfaVar, iZza);
                    }
                    this.zze += iZza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzajs zzajsVar = (zzajs) this.zza.get(i10);
            zzajvVar.zzc();
            zzabz zzabzVarZzv = zzaazVar.zzv(zzajvVar.zza(), 3);
            zzak zzakVar = new zzak();
            zzakVar.zzH(zzajvVar.zzb());
            zzakVar.zzS("application/dvbsubs");
            zzakVar.zzI(Collections.singletonList(zzajsVar.zzb));
            zzakVar.zzK(zzajsVar.zza);
            zzabzVarZzv.zzk(zzakVar.zzY());
            this.zzb[i10] = zzabzVarZzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzc() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzabz zzabzVar : this.zzb) {
                    zzabzVar.zzs(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzd(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j10 != -9223372036854775807L) {
            this.zzf = j10;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
