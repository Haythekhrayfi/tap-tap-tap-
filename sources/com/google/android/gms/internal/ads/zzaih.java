package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaih implements zzaij {
    private final String zzb;
    private String zzc;
    private zzabz zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private zzam zzi;
    private int zzj;
    private final zzfa zza = new zzfa(new byte[18]);
    private int zze = 0;
    private long zzk = -9223372036854775807L;

    public zzaih(String str) {
        this.zzb = str;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) {
        int i10;
        int i11;
        byte b10;
        boolean z10;
        int i12;
        byte b11;
        int i13;
        byte b12;
        int i14;
        byte b13;
        int i15;
        zzdy.zzb(this.zzd);
        while (zzfaVar.zza() > 0) {
            int i16 = this.zze;
            if (i16 == 0) {
                while (zzfaVar.zza() > 0) {
                    int i17 = this.zzg << 8;
                    this.zzg = i17;
                    int iZzk = i17 | zzfaVar.zzk();
                    this.zzg = iZzk;
                    if (iZzk == 2147385345 || iZzk == -25230976 || iZzk == 536864768 || iZzk == -14745368) {
                        byte[] bArrZzH = this.zza.zzH();
                        int i18 = this.zzg;
                        bArrZzH[0] = (byte) ((i18 >> 24) & 255);
                        bArrZzH[1] = (byte) ((i18 >> 16) & 255);
                        bArrZzH[2] = (byte) ((i18 >> 8) & 255);
                        bArrZzH[3] = (byte) (i18 & 255);
                        this.zzf = 4;
                        this.zzg = 0;
                        this.zze = 1;
                        break;
                    }
                }
            } else if (i16 != 1) {
                int iMin = Math.min(zzfaVar.zza(), this.zzj - this.zzf);
                this.zzd.zzq(zzfaVar, iMin);
                int i19 = this.zzf + iMin;
                this.zzf = i19;
                int i20 = this.zzj;
                if (i19 == i20) {
                    long j10 = this.zzk;
                    if (j10 != -9223372036854775807L) {
                        this.zzd.zzs(j10, 1, i20, 0, null);
                        this.zzk += this.zzh;
                    }
                    this.zze = 0;
                }
            } else {
                byte[] bArrZzH2 = this.zza.zzH();
                int iMin2 = Math.min(zzfaVar.zza(), 18 - this.zzf);
                zzfaVar.zzB(bArrZzH2, this.zzf, iMin2);
                int i21 = this.zzf + iMin2;
                this.zzf = i21;
                if (i21 == 18) {
                    byte[] bArrZzH3 = this.zza.zzH();
                    if (this.zzi == null) {
                        zzam zzamVarZza = zzaat.zza(bArrZzH3, this.zzc, this.zzb, null);
                        this.zzi = zzamVarZza;
                        this.zzd.zzk(zzamVarZza);
                    }
                    byte b14 = bArrZzH3[0];
                    if (b14 != -2) {
                        if (b14 == -1) {
                            i15 = ((bArrZzH3[7] & 3) << 12) | ((bArrZzH3[6] & 255) << 4) | ((bArrZzH3[9] & 60) >> 2);
                        } else if (b14 != 31) {
                            i10 = (bArrZzH3[5] & 3) << 12;
                            i11 = (bArrZzH3[6] & 255) << 4;
                            b10 = bArrZzH3[7];
                        } else {
                            i15 = ((bArrZzH3[8] & 60) >> 2) | ((3 & bArrZzH3[6]) << 12) | ((bArrZzH3[7] & 255) << 4);
                        }
                        i12 = i15 + 1;
                        z10 = true;
                        if (z10) {
                            i12 = (i12 * 16) / 14;
                        }
                        this.zzj = i12;
                        b11 = bArrZzH3[0];
                        if (b11 != -2) {
                            if (b11 != -1) {
                                i13 = (bArrZzH3[4] & 7) << 4;
                                b13 = bArrZzH3[7];
                            } else if (b11 != 31) {
                                i13 = (bArrZzH3[4] & 1) << 6;
                                b12 = bArrZzH3[5];
                            } else {
                                i13 = (bArrZzH3[5] & 7) << 4;
                                b13 = bArrZzH3[6];
                            }
                            i14 = b13 & 60;
                            this.zzh = (int) ((((long) ((((i14 >> 2) | i13) + 1) * 32)) * 1000000) / ((long) this.zzi.zzA));
                            this.zza.zzF(0);
                            this.zzd.zzq(this.zza, 18);
                            this.zze = 2;
                        } else {
                            i13 = (bArrZzH3[5] & 1) << 6;
                            b12 = bArrZzH3[4];
                        }
                        i14 = b12 & 252;
                        this.zzh = (int) ((((long) ((((i14 >> 2) | i13) + 1) * 32)) * 1000000) / ((long) this.zzi.zzA));
                        this.zza.zzF(0);
                        this.zzd.zzq(this.zza, 18);
                        this.zze = 2;
                    } else {
                        i10 = (bArrZzH3[4] & 3) << 12;
                        i11 = (bArrZzH3[7] & 255) << 4;
                        b10 = bArrZzH3[6];
                    }
                    i12 = (i10 | i11 | ((b10 & 240) >> 4)) + 1;
                    z10 = false;
                    if (z10) {
                        i12 = (i12 * 16) / 14;
                    }
                    this.zzj = i12;
                    b11 = bArrZzH3[0];
                    if (b11 != -2) {
                        if (b11 != -1) {
                            i13 = (bArrZzH3[4] & 7) << 4;
                            b13 = bArrZzH3[7];
                        } else if (b11 != 31) {
                            i13 = (bArrZzH3[4] & 1) << 6;
                            b12 = bArrZzH3[5];
                        } else {
                            i13 = (bArrZzH3[5] & 7) << 4;
                            b13 = bArrZzH3[6];
                        }
                        i14 = b13 & 60;
                        this.zzh = (int) ((((long) ((((i14 >> 2) | i13) + 1) * 32)) * 1000000) / ((long) this.zzi.zzA));
                        this.zza.zzF(0);
                        this.zzd.zzq(this.zza, 18);
                        this.zze = 2;
                    } else {
                        i13 = (bArrZzH3[5] & 1) << 6;
                        b12 = bArrZzH3[4];
                    }
                    i14 = b12 & 252;
                    this.zzh = (int) ((((long) ((((i14 >> 2) | i13) + 1) * 32)) * 1000000) / ((long) this.zzi.zzA));
                    this.zza.zzF(0);
                    this.zzd.zzq(this.zza, 18);
                    this.zze = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        zzajvVar.zzc();
        this.zzc = zzajvVar.zzb();
        this.zzd = zzaazVar.zzv(zzajvVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzk = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zze() {
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
    }
}
