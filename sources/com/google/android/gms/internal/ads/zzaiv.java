package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaiv implements zzaij {
    private zzabz zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzfa zza = new zzfa(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) {
        zzdy.zzb(this.zzb);
        if (this.zzc) {
            int iZza = zzfaVar.zza();
            int i10 = this.zzf;
            if (i10 < 10) {
                int iMin = Math.min(iZza, 10 - i10);
                System.arraycopy(zzfaVar.zzH(), zzfaVar.zzc(), this.zza.zzH(), this.zzf, iMin);
                if (this.zzf + iMin == 10) {
                    this.zza.zzF(0);
                    if (this.zza.zzk() != 73 || this.zza.zzk() != 68 || this.zza.zzk() != 51) {
                        zzer.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    } else {
                        this.zza.zzG(3);
                        this.zze = this.zza.zzj() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZza, this.zze - this.zzf);
            this.zzb.zzq(zzfaVar, iMin2);
            this.zzf += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        zzajvVar.zzc();
        zzabz zzabzVarZzv = zzaazVar.zzv(zzajvVar.zza(), 5);
        this.zzb = zzabzVarZzv;
        zzak zzakVar = new zzak();
        zzakVar.zzH(zzajvVar.zzb());
        zzakVar.zzS("application/id3");
        zzabzVarZzv.zzk(zzakVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzc() {
        int i10;
        zzdy.zzb(this.zzb);
        if (this.zzc && (i10 = this.zze) != 0 && this.zzf == i10) {
            long j10 = this.zzd;
            if (j10 != -9223372036854775807L) {
                this.zzb.zzs(j10, 1, i10, 0, null);
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
            this.zzd = j10;
        }
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
