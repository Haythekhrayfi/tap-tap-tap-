package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaja implements zzajw {
    private final zzaij zza;
    private final zzez zzb = new zzez(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfh zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaja(zzaij zzaijVar) {
        this.zza = zzaijVar;
    }

    private final void zzd(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zze(zzfa zzfaVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzfaVar.zza(), i10 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfaVar.zzG(iMin);
        } else {
            zzfaVar.zzB(bArr, this.zzd, iMin);
        }
        int i11 = this.zzd + iMin;
        this.zzd = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zza(zzfa zzfaVar, int i10) throws zzcd {
        long jZzb;
        long j10;
        int i11;
        zzdy.zzb(this.zze);
        int i12 = -1;
        int i13 = 2;
        int i14 = 1;
        if ((i10 & 1) != 0) {
            int i15 = this.zzc;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.zzj;
                    if (i16 != -1) {
                        zzer.zzf("PesReader", "Unexpected start indicator: expected " + i16 + " more bytes");
                    }
                    this.zza.zzc();
                } else {
                    zzer.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i17 = i10;
        while (zzfaVar.zza() > 0) {
            int i18 = this.zzc;
            if (i18 != 0) {
                if (i18 != i14) {
                    if (i18 != i13) {
                        int iZza = zzfaVar.zza();
                        int i19 = this.zzj;
                        int i20 = i19 != i12 ? iZza - i19 : 0;
                        if (i20 > 0) {
                            iZza -= i20;
                            zzfaVar.zzE(zzfaVar.zzc() + iZza);
                        }
                        this.zza.zza(zzfaVar);
                        int i21 = this.zzj;
                        if (i21 != i12) {
                            int i22 = i21 - iZza;
                            this.zzj = i22;
                            if (i22 == 0) {
                                this.zza.zzc();
                                zzd(i14);
                            }
                        }
                    } else {
                        if (zze(zzfaVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfaVar, null, this.zzi)) {
                            this.zzb.zzj(0);
                            if (this.zzf) {
                                this.zzb.zzl(4);
                                long jZzd = this.zzb.zzd(3);
                                this.zzb.zzl(i14);
                                int iZzd = this.zzb.zzd(15) << 15;
                                this.zzb.zzl(i14);
                                long jZzd2 = this.zzb.zzd(15);
                                this.zzb.zzl(i14);
                                if (this.zzh || !this.zzg) {
                                    j10 = jZzd2;
                                } else {
                                    this.zzb.zzl(4);
                                    long jZzd3 = ((long) this.zzb.zzd(3)) << 30;
                                    this.zzb.zzl(i14);
                                    int iZzd2 = this.zzb.zzd(15) << 15;
                                    this.zzb.zzl(i14);
                                    long jZzd4 = this.zzb.zzd(15);
                                    this.zzb.zzl(i14);
                                    j10 = jZzd2;
                                    this.zze.zzb(jZzd3 | ((long) iZzd2) | jZzd4);
                                    this.zzh = true;
                                }
                                jZzb = this.zze.zzb((jZzd << 30) | ((long) iZzd) | j10);
                            } else {
                                jZzb = -9223372036854775807L;
                            }
                            i17 |= true != this.zzk ? 0 : 4;
                            this.zza.zzd(jZzb, i17);
                            zzd(3);
                            i12 = -1;
                            i13 = 2;
                            i14 = 1;
                        }
                    }
                } else if (zze(zzfaVar, this.zzb.zza, 9)) {
                    int i23 = 0;
                    this.zzb.zzj(0);
                    int iZzd3 = this.zzb.zzd(24);
                    i14 = 1;
                    if (iZzd3 != 1) {
                        zzer.zzf("PesReader", "Unexpected start code prefix: " + iZzd3);
                        i12 = -1;
                        this.zzj = -1;
                        i11 = 2;
                    } else {
                        this.zzb.zzl(8);
                        int iZzd4 = this.zzb.zzd(16);
                        this.zzb.zzl(5);
                        this.zzk = this.zzb.zzn();
                        this.zzb.zzl(2);
                        this.zzf = this.zzb.zzn();
                        this.zzg = this.zzb.zzn();
                        this.zzb.zzl(6);
                        int iZzd5 = this.zzb.zzd(8);
                        this.zzi = iZzd5;
                        if (iZzd4 == 0) {
                            i12 = -1;
                            this.zzj = -1;
                        } else {
                            int i24 = (iZzd4 - 3) - iZzd5;
                            this.zzj = i24;
                            if (i24 < 0) {
                                zzer.zzf("PesReader", "Found negative packet payload size: " + i24);
                                i12 = -1;
                                this.zzj = -1;
                            } else {
                                i12 = -1;
                            }
                        }
                        i23 = 2;
                        i11 = 2;
                    }
                    zzd(i23);
                    i13 = i11;
                } else {
                    i12 = -1;
                    i14 = 1;
                    i13 = 2;
                }
            } else {
                zzfaVar.zzG(zzfaVar.zza());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzb(zzfh zzfhVar, zzaaz zzaazVar, zzajv zzajvVar) {
        this.zze = zzfhVar;
        this.zza.zzb(zzaazVar, zzajvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajw
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
