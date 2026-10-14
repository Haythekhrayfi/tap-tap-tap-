package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajj implements zzajw {
    private final zzaji zza;
    private final zzfa zzb = new zzfa(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzajj(zzaji zzajiVar) {
        this.zza = zzajiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zza(zzfa zzfaVar, int i10) {
        int iZzc;
        int i11 = i10 & 1;
        if (i11 != 0) {
            iZzc = zzfaVar.zzc() + zzfaVar.zzk();
        } else {
            iZzc = -1;
        }
        if (this.zzf) {
            if (i11 == 0) {
                return;
            }
            this.zzf = false;
            zzfaVar.zzF(iZzc);
            this.zzd = 0;
        }
        while (zzfaVar.zza() > 0) {
            int i12 = this.zzd;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iZzk = zzfaVar.zzk();
                    zzfaVar.zzF(zzfaVar.zzc() - 1);
                    if (iZzk == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzfaVar.zza(), 3 - this.zzd);
                zzfaVar.zzB(this.zzb.zzH(), this.zzd, iMin);
                int i13 = this.zzd + iMin;
                this.zzd = i13;
                if (i13 == 3) {
                    this.zzb.zzF(0);
                    this.zzb.zzE(3);
                    this.zzb.zzG(1);
                    int iZzk2 = this.zzb.zzk();
                    int iZzk3 = this.zzb.zzk();
                    this.zze = (iZzk2 & 128) != 0;
                    this.zzc = (((iZzk2 & 15) << 8) | iZzk3) + 3;
                    int iZzb = this.zzb.zzb();
                    int i14 = this.zzc;
                    if (iZzb < i14) {
                        int iZzb2 = this.zzb.zzb();
                        this.zzb.zzz(Math.min(4098, Math.max(i14, iZzb2 + iZzb2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzfaVar.zza(), this.zzc - i12);
                zzfaVar.zzB(this.zzb.zzH(), this.zzd, iMin2);
                int i15 = this.zzd + iMin2;
                this.zzd = i15;
                int i16 = this.zzc;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzE(i16);
                    } else {
                        if (zzfj.zzd(this.zzb.zzH(), 0, i16, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzE(this.zzc - 4);
                    }
                    this.zzb.zzF(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzb(zzfh zzfhVar, zzaaz zzaazVar, zzajv zzajvVar) {
        this.zza.zzb(zzfhVar, zzaazVar, zzajvVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzc() {
        this.zzf = true;
    }
}
