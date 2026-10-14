package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaif implements zzaij {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzez zzc = new zzez(new byte[7], 7);
    private final zzfa zzd = new zzfa(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzabz zzg;
    private zzabz zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzabz zzu;
    private long zzv;

    public zzaif(boolean z10, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z10;
        this.zze = str;
    }

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzabz zzabzVar, long j10, int i10, int i11) {
        this.zzi = 4;
        this.zzj = i10;
        this.zzu = zzabzVar;
        this.zzv = j10;
        this.zzs = i11;
    }

    private final boolean zzk(zzfa zzfaVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzfaVar.zza(), i10 - this.zzj);
        zzfaVar.zzB(bArr, this.zzj, iMin);
        int i11 = this.zzj + iMin;
        this.zzj = i11;
        return i11 == i10;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | 65280);
    }

    private static final boolean zzm(zzfa zzfaVar, byte[] bArr, int i10) {
        if (zzfaVar.zza() < i10) {
            return false;
        }
        zzfaVar.zzB(bArr, 0, i10);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x026d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0271  */
    /* JADX WARN: Code duplicated, block: B:109:0x0275  */
    /* JADX WARN: Code duplicated, block: B:111:0x0279  */
    /* JADX WARN: Code duplicated, block: B:143:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0200  */
    /* JADX WARN: Code duplicated, block: B:74:0x020f  */
    /* JADX WARN: Code duplicated, block: B:76:0x021a  */
    /* JADX WARN: Code duplicated, block: B:78:0x021e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0222  */
    /* JADX WARN: Code duplicated, block: B:85:0x0230  */
    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) throws zzcd {
        int iZzj;
        zzabz zzabzVar;
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iZzd;
        byte[] bArrZzH;
        int iZzd2;
        int i15;
        byte b10;
        int i16;
        int i17;
        int i18;
        byte b11;
        Objects.requireNonNull(this.zzg);
        int i19 = zzfj.zza;
        while (zzfaVar.zza() > 0) {
            int i20 = this.zzi;
            int i21 = 13;
            int i22 = 2;
            if (i20 == 0) {
                byte[] bArrZzH2 = zzfaVar.zzH();
                int iZzc = zzfaVar.zzc();
                int iZzd3 = zzfaVar.zzd();
                while (true) {
                    if (iZzc < iZzd3) {
                        int i23 = iZzc + 1;
                        int i24 = bArrZzH2[iZzc] & 255;
                        if (this.zzk == 512 && zzl((byte) -1, (byte) i24)) {
                            if (!this.zzm) {
                                int i25 = i23 - 2;
                                zzfaVar.zzF(i25 + 1);
                                if (zzm(zzfaVar, this.zzc.zza, 1)) {
                                    this.zzc.zzj(4);
                                    int iZzd4 = this.zzc.zzd(1);
                                    int i26 = this.zzn;
                                    if (i26 == -1 || iZzd4 == i26) {
                                        if (this.zzo == -1) {
                                            if (zzm(zzfaVar, this.zzc.zza, 4)) {
                                                this.zzc.zzj(14);
                                                iZzd = this.zzc.zzd(i21);
                                                if (iZzd >= 7) {
                                                    bArrZzH = zzfaVar.zzH();
                                                    iZzd2 = zzfaVar.zzd();
                                                    i15 = i25 + iZzd;
                                                    if (i15 >= iZzd2) {
                                                        b10 = bArrZzH[i15];
                                                        if (b10 == -1) {
                                                            i18 = i15 + 1;
                                                            if (i18 != iZzd2) {
                                                                b11 = bArrZzH[i18];
                                                                if (zzl((byte) -1, b11) || ((b11 & 8) >> 3) != iZzd4) {
                                                                }
                                                            }
                                                        } else if (b10 == 73 || ((i16 = i15 + 1) != iZzd2 && (bArrZzH[i16] != 68 || ((i17 = i15 + 2) != iZzd2 && bArrZzH[i17] != 51)))) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (zzm(zzfaVar, this.zzc.zza, 1)) {
                                            this.zzc.zzj(i22);
                                            if (this.zzc.zzd(4) == this.zzo) {
                                                zzfaVar.zzF(i25 + 2);
                                                if (zzm(zzfaVar, this.zzc.zza, 4)) {
                                                    this.zzc.zzj(14);
                                                    iZzd = this.zzc.zzd(i21);
                                                    if (iZzd >= 7) {
                                                        bArrZzH = zzfaVar.zzH();
                                                        iZzd2 = zzfaVar.zzd();
                                                        i15 = i25 + iZzd;
                                                        if (i15 >= iZzd2) {
                                                            b10 = bArrZzH[i15];
                                                            if (b10 == -1) {
                                                                i18 = i15 + 1;
                                                                if (i18 != iZzd2) {
                                                                    b11 = bArrZzH[i18];
                                                                    if (zzl((byte) -1, b11)) {
                                                                    }
                                                                }
                                                            } else if (b10 == 73) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = this.zzk;
                                i12 = i11 | i24;
                                if (i12 != 329) {
                                    i13 = 2;
                                    i14 = 768;
                                } else if (i12 != 511) {
                                    i13 = 2;
                                    i14 = 512;
                                } else if (i12 != 836) {
                                    i13 = 2;
                                    i14 = 1024;
                                } else if (i12 != 1075) {
                                    this.zzi = 2;
                                    this.zzj = 3;
                                    this.zzs = 0;
                                    this.zzd.zzF(0);
                                } else if (i11 != 256) {
                                    this.zzk = 256;
                                    iZzc = i23 - 1;
                                    i21 = 13;
                                    i22 = 2;
                                } else {
                                    i13 = 2;
                                    i22 = i13;
                                    iZzc = i23;
                                    i21 = 13;
                                }
                                this.zzk = i14;
                                i22 = i13;
                                iZzc = i23;
                                i21 = 13;
                            }
                            this.zzp = (i24 & 8) >> 3;
                            this.zzl = 1 == ((i24 & 1) ^ 1);
                            if (this.zzm) {
                                zzi();
                            } else {
                                this.zzi = 1;
                                this.zzj = 0;
                            }
                        } else {
                            i11 = this.zzk;
                            i12 = i11 | i24;
                            if (i12 != 329) {
                                i13 = 2;
                                i14 = 768;
                            } else if (i12 != 511) {
                                i13 = 2;
                                i14 = 512;
                            } else if (i12 != 836) {
                                i13 = 2;
                                i14 = 1024;
                            } else if (i12 != 1075) {
                                this.zzi = 2;
                                this.zzj = 3;
                                this.zzs = 0;
                                this.zzd.zzF(0);
                            } else if (i11 != 256) {
                                this.zzk = 256;
                                iZzc = i23 - 1;
                                i21 = 13;
                                i22 = 2;
                            } else {
                                i13 = 2;
                                i22 = i13;
                                iZzc = i23;
                                i21 = 13;
                            }
                            this.zzk = i14;
                            i22 = i13;
                            iZzc = i23;
                            i21 = 13;
                        }
                        zzfaVar.zzF(i23);
                    } else {
                        zzfaVar.zzF(iZzc);
                    }
                }
            } else if (i20 != 1) {
                if (i20 != 2) {
                    if (i20 != 3) {
                        int iMin = Math.min(zzfaVar.zza(), this.zzs - this.zzj);
                        this.zzu.zzq(zzfaVar, iMin);
                        int i27 = this.zzj + iMin;
                        this.zzj = i27;
                        int i28 = this.zzs;
                        if (i27 == i28) {
                            long j11 = this.zzt;
                            if (j11 != -9223372036854775807L) {
                                this.zzu.zzs(j11, 1, i28, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzfaVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzj(0);
                            if (this.zzq) {
                                this.zzc.zzl(10);
                            } else {
                                int iZzd5 = this.zzc.zzd(2) + 1;
                                if (iZzd5 != 2) {
                                    zzer.zzf("AdtsReader", "Detected audio object type: " + iZzd5 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzl(5);
                                int iZzd6 = this.zzc.zzd(3);
                                int i29 = this.zzo;
                                byte[] bArr = {(byte) (((i29 >> 1) & 7) | 16), (byte) (((iZzd6 << 3) & 120) | ((i29 << 7) & 128))};
                                zzzt zzztVarZza = zzzu.zza(bArr);
                                zzak zzakVar = new zzak();
                                zzakVar.zzH(this.zzf);
                                zzakVar.zzS("audio/mp4a-latm");
                                zzakVar.zzx(zzztVarZza.zzc);
                                zzakVar.zzw(zzztVarZza.zzb);
                                zzakVar.zzT(zzztVarZza.zza);
                                zzakVar.zzI(Collections.singletonList(bArr));
                                zzakVar.zzK(this.zze);
                                zzam zzamVarZzY = zzakVar.zzY();
                                this.zzr = 1024000000 / ((long) zzamVarZzY.zzA);
                                this.zzg.zzk(zzamVarZzY);
                                this.zzq = true;
                            }
                            this.zzc.zzl(4);
                            int iZzd7 = this.zzc.zzd(13) - 7;
                            if (this.zzl) {
                                iZzd7 -= 2;
                            }
                            iZzj = iZzd7;
                            zzabzVar = this.zzg;
                            j10 = this.zzr;
                            i10 = 0;
                            zzj(zzabzVar, j10, i10, iZzj);
                        }
                    }
                } else if (zzk(zzfaVar, this.zzd.zzH(), 10)) {
                    this.zzh.zzq(this.zzd, 10);
                    this.zzd.zzF(6);
                    zzabzVar = this.zzh;
                    j10 = 0;
                    iZzj = 10 + this.zzd.zzj();
                    i10 = 10;
                    zzj(zzabzVar, j10, i10, iZzj);
                }
            } else if (zzfaVar.zza() != 0) {
                zzez zzezVar = this.zzc;
                zzezVar.zza[0] = zzfaVar.zzH()[zzfaVar.zzc()];
                zzezVar.zzj(2);
                int iZzd8 = this.zzc.zzd(4);
                int i30 = this.zzo;
                if (i30 == -1 || iZzd8 == i30) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = iZzd8;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        zzajvVar.zzc();
        this.zzf = zzajvVar.zzb();
        zzabz zzabzVarZzv = zzaazVar.zzv(zzajvVar.zza(), 1);
        this.zzg = zzabzVarZzv;
        this.zzu = zzabzVarZzv;
        if (!this.zzb) {
            this.zzh = new zzaav();
            return;
        }
        zzajvVar.zzc();
        zzabz zzabzVarZzv2 = zzaazVar.zzv(zzajvVar.zza(), 5);
        this.zzh = zzabzVarZzv2;
        zzak zzakVar = new zzak();
        zzakVar.zzH(zzajvVar.zzb());
        zzakVar.zzS("application/id3");
        zzabzVarZzv2.zzk(zzakVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzt = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
