package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaiw implements zzaij {
    private final String zza;
    private final zzfa zzb;
    private final zzez zzc;
    private zzabz zzd;
    private String zze;
    private zzam zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzaiw(String str) {
        this.zza = str;
        zzfa zzfaVar = new zzfa(1024);
        this.zzb = zzfaVar;
        byte[] bArrZzH = zzfaVar.zzH();
        this.zzc = new zzez(bArrZzH, bArrZzH.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzez zzezVar) throws zzcd {
        int iZza = zzezVar.zza();
        zzzt zzztVarZzb = zzzu.zzb(zzezVar, true);
        this.zzu = zzztVarZzb.zzc;
        this.zzr = zzztVarZzb.zza;
        this.zzt = zzztVarZzb.zzb;
        return iZza - zzezVar.zza();
    }

    private static long zzg(zzez zzezVar) {
        return zzezVar.zzd((zzezVar.zzd(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zza(zzfa zzfaVar) throws zzcd {
        int i10;
        int i11;
        int iZzd;
        boolean zZzn;
        zzdy.zzb(this.zzd);
        while (zzfaVar.zza() > 0) {
            int i12 = this.zzg;
            if (i12 != 0) {
                if (i12 == 1) {
                    int iZzk = zzfaVar.zzk();
                    if ((iZzk & 224) == 224) {
                        this.zzj = iZzk;
                        this.zzg = 2;
                    } else if (iZzk != 86) {
                        this.zzg = 0;
                    }
                } else if (i12 != 2) {
                    int iMin = Math.min(zzfaVar.zza(), this.zzi - this.zzh);
                    zzfaVar.zzB(this.zzc.zza, this.zzh, iMin);
                    int i13 = this.zzh + iMin;
                    this.zzh = i13;
                    if (i13 == this.zzi) {
                        this.zzc.zzj(0);
                        zzez zzezVar = this.zzc;
                        if (zzezVar.zzn()) {
                            if (this.zzl) {
                            }
                            this.zzg = 0;
                        } else {
                            this.zzl = true;
                            int iZzd2 = zzezVar.zzd(1);
                            if (iZzd2 == 1) {
                                iZzd = zzezVar.zzd(1);
                                i11 = 1;
                            } else {
                                i11 = iZzd2;
                                iZzd = 0;
                            }
                            this.zzm = iZzd;
                            if (iZzd != 0) {
                                throw zzcd.zza(null, null);
                            }
                            if (i11 == 1) {
                                zzg(zzezVar);
                                i11 = 1;
                            }
                            if (!zzezVar.zzn()) {
                                throw zzcd.zza(null, null);
                            }
                            this.zzn = zzezVar.zzd(6);
                            int iZzd3 = zzezVar.zzd(4);
                            int iZzd4 = zzezVar.zzd(3);
                            if (iZzd3 != 0 || iZzd4 != 0) {
                                throw zzcd.zza(null, null);
                            }
                            if (i11 == 0) {
                                int iZzc = zzezVar.zzc();
                                int iZzf = zzf(zzezVar);
                                zzezVar.zzj(iZzc);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzezVar.zzg(bArr, 0, iZzf);
                                zzak zzakVar = new zzak();
                                zzakVar.zzH(this.zze);
                                zzakVar.zzS("audio/mp4a-latm");
                                zzakVar.zzx(this.zzu);
                                zzakVar.zzw(this.zzt);
                                zzakVar.zzT(this.zzr);
                                zzakVar.zzI(Collections.singletonList(bArr));
                                zzakVar.zzK(this.zza);
                                zzam zzamVarZzY = zzakVar.zzY();
                                if (!zzamVarZzY.equals(this.zzf)) {
                                    this.zzf = zzamVarZzY;
                                    this.zzs = 1024000000 / ((long) zzamVarZzY.zzA);
                                    this.zzd.zzk(zzamVarZzY);
                                }
                            } else {
                                zzezVar.zzl(((int) zzg(zzezVar)) - zzf(zzezVar));
                            }
                            int iZzd5 = zzezVar.zzd(3);
                            this.zzo = iZzd5;
                            if (iZzd5 == 0) {
                                zzezVar.zzl(8);
                            } else if (iZzd5 == 1) {
                                zzezVar.zzl(9);
                            } else if (iZzd5 == 3 || iZzd5 == 4 || iZzd5 == 5) {
                                zzezVar.zzl(6);
                            } else {
                                if (iZzd5 != 6 && iZzd5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzezVar.zzl(1);
                            }
                            boolean zZzn2 = zzezVar.zzn();
                            this.zzp = zZzn2;
                            this.zzq = 0L;
                            if (zZzn2) {
                                if (i11 != 1) {
                                    do {
                                        zZzn = zzezVar.zzn();
                                        this.zzq = (this.zzq << 8) + ((long) zzezVar.zzd(8));
                                    } while (zZzn);
                                } else {
                                    this.zzq = zzg(zzezVar);
                                }
                            }
                            if (zzezVar.zzn()) {
                                zzezVar.zzl(8);
                            }
                        }
                        if (this.zzm != 0) {
                            throw zzcd.zza(null, null);
                        }
                        if (this.zzn != 0) {
                            throw zzcd.zza(null, null);
                        }
                        if (this.zzo != 0) {
                            throw zzcd.zza(null, null);
                        }
                        int i14 = 0;
                        while (true) {
                            int iZzd6 = zzezVar.zzd(8);
                            i10 = i14 + iZzd6;
                            if (iZzd6 != 255) {
                                break;
                            } else {
                                i14 = i10;
                            }
                        }
                        int iZzc2 = zzezVar.zzc();
                        if ((iZzc2 & 7) == 0) {
                            this.zzb.zzF(iZzc2 >> 3);
                        } else {
                            zzezVar.zzg(this.zzb.zzH(), 0, i10 * 8);
                            this.zzb.zzF(0);
                        }
                        this.zzd.zzq(this.zzb, i10);
                        long j10 = this.zzk;
                        if (j10 != -9223372036854775807L) {
                            this.zzd.zzs(j10, 1, i10, 0, null);
                            this.zzk += this.zzs;
                        }
                        if (this.zzp) {
                            zzezVar.zzl((int) this.zzq);
                        }
                        this.zzg = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzk2 = ((this.zzj & (-225)) << 8) | zzfaVar.zzk();
                    this.zzi = iZzk2;
                    zzfa zzfaVar2 = this.zzb;
                    if (iZzk2 > zzfaVar2.zzH().length) {
                        zzfaVar2.zzC(iZzk2);
                        zzez zzezVar2 = this.zzc;
                        byte[] bArrZzH = this.zzb.zzH();
                        zzezVar2.zzi(bArrZzH, bArrZzH.length);
                    }
                    this.zzh = 0;
                    this.zzg = 3;
                }
            } else if (zzfaVar.zzk() == 86) {
                this.zzg = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaij
    public final void zzb(zzaaz zzaazVar, zzajv zzajvVar) {
        zzajvVar.zzc();
        this.zzd = zzaazVar.zzv(zzajvVar.zza(), 1);
        this.zze = zzajvVar.zzb();
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
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}
