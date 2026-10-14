package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahz implements zzaij {
    private final zzez zza;
    private final zzfa zzb;
    private final String zzc;
    private String zzd;
    private zzabz zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzam zzj;
    private int zzk;
    private long zzl;

    public zzahz() {
        this(null);
    }

    public zzahz(String str) {
        zzez zzezVar = new zzez(new byte[128], 128);
        this.zza = zzezVar;
        this.zzb = new zzfa(zzezVar.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0103  */
    /* JADX WARN: Code duplicated, block: B:36:0x0105  */
    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) {
        boolean z10;
        zzdy.zzb(this.zze);
        while (zzfaVar.zza() > 0) {
            int i10 = this.zzf;
            if (i10 == 0) {
                while (zzfaVar.zza() > 0) {
                    if (this.zzh) {
                        int iZzk = zzfaVar.zzk();
                        if (iZzk == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzfa zzfaVar2 = this.zzb;
                            zzfaVar2.zzH()[0] = 11;
                            zzfaVar2.zzH()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        if (iZzk == 11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if (zzfaVar.zzk() == 11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.zzh = z10;
                }
            } else if (i10 != 1) {
                int iMin = Math.min(zzfaVar.zza(), this.zzk - this.zzg);
                this.zze.zzq(zzfaVar, iMin);
                int i11 = this.zzg + iMin;
                this.zzg = i11;
                int i12 = this.zzk;
                if (i11 == i12) {
                    long j10 = this.zzl;
                    if (j10 != -9223372036854775807L) {
                        this.zze.zzs(j10, 1, i12, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] bArrZzH = this.zzb.zzH();
                int iMin2 = Math.min(zzfaVar.zza(), 128 - this.zzg);
                zzfaVar.zzB(bArrZzH, this.zzg, iMin2);
                int i13 = this.zzg + iMin2;
                this.zzg = i13;
                if (i13 == 128) {
                    this.zza.zzj(0);
                    zzzw zzzwVarZze = zzzx.zze(this.zza);
                    zzam zzamVar = this.zzj;
                    if (zzamVar == null || zzzwVarZze.zzc != zzamVar.zzz || zzzwVarZze.zzb != zzamVar.zzA || !zzfj.zzC(zzzwVarZze.zza, zzamVar.zzm)) {
                        zzak zzakVar = new zzak();
                        zzakVar.zzH(this.zzd);
                        zzakVar.zzS(zzzwVarZze.zza);
                        zzakVar.zzw(zzzwVarZze.zzc);
                        zzakVar.zzT(zzzwVarZze.zzb);
                        zzakVar.zzK(this.zzc);
                        zzakVar.zzO(zzzwVarZze.zzf);
                        if ("audio/ac3".equals(zzzwVarZze.zza)) {
                            zzakVar.zzv(zzzwVarZze.zzf);
                        }
                        zzam zzamVarZzY = zzakVar.zzY();
                        this.zzj = zzamVarZzY;
                        this.zze.zzk(zzamVarZzY);
                    }
                    this.zzk = zzzwVarZze.zzd;
                    this.zzi = (((long) zzzwVarZze.zze) * 1000000) / ((long) this.zzj.zzA);
                    this.zzb.zzF(0);
                    this.zze.zzq(this.zzb, 128);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        zzajvVar.zzc();
        this.zzd = zzajvVar.zzb();
        this.zze = zzaazVar.zzv(zzajvVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzl = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }
}
