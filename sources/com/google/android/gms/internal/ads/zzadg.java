package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadg implements zzaaw {
    private zzaaz zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzafa zzg;
    private zzaax zzh;
    private zzadj zzi;
    private zzagy zzj;
    private final zzfa zza = new zzfa(6);
    private long zzf = -1;

    private final int zze(zzaax zzaaxVar) throws IOException {
        this.zza.zzC(2);
        ((zzaam) zzaaxVar).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzby[0]);
        zzaaz zzaazVar = this.zzb;
        Objects.requireNonNull(zzaazVar);
        zzaazVar.zzC();
        this.zzb.zzN(new zzabu(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    private final void zzg(zzby... zzbyVarArr) {
        zzaaz zzaazVar = this.zzb;
        Objects.requireNonNull(zzaazVar);
        zzabz zzabzVarZzv = zzaazVar.zzv(1024, 4);
        zzak zzakVar = new zzak();
        zzakVar.zzz("image/jpeg");
        zzakVar.zzM(new zzbz(-9223372036854775807L, zzbyVarArr));
        zzabzVarZzv.zzk(zzakVar.zzY());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    @Override // com.google.android.gms.internal.ads.zzaaw
    public final int zza(zzaax zzaaxVar, zzabs zzabsVar) throws IOException {
        int i10;
        String strZzv;
        zzadi zzadiVarZza;
        zzafa zzafaVar;
        long j10;
        int i11 = this.zzc;
        if (i11 == 0) {
            this.zza.zzC(2);
            ((zzaam) zzaaxVar).zzn(this.zza.zzH(), 0, 2, false);
            int iZzo = this.zza.zzo();
            this.zzd = iZzo;
            if (iZzo == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzf();
                return 0;
            }
            if ((iZzo >= 65488 && iZzo <= 65497) || iZzo == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i11 == 1) {
            this.zza.zzC(2);
            ((zzaam) zzaaxVar).zzn(this.zza.zzH(), 0, 2, false);
            this.zze = this.zza.zzo() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzaaxVar != this.zzh) {
                    this.zzh = zzaaxVar;
                    this.zzi = new zzadj(zzaaxVar, this.zzf);
                }
                zzagy zzagyVar = this.zzj;
                Objects.requireNonNull(zzagyVar);
                int iZza = zzagyVar.zza(this.zzi, zzabsVar);
                if (iZza == 1) {
                    zzabsVar.zza += this.zzf;
                }
                return iZza;
            }
            long jZzf = zzaaxVar.zzf();
            long j11 = this.zzf;
            if (jZzf != j11) {
                zzabsVar.zza = j11;
                return 1;
            }
            if (zzaaxVar.zzm(this.zza.zzH(), 0, 1, true)) {
                zzaaxVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzagy(0);
                }
                zzadj zzadjVar = new zzadj(zzaaxVar, this.zzf);
                this.zzi = zzadjVar;
                if (this.zzj.zzd(zzadjVar)) {
                    zzagy zzagyVar2 = this.zzj;
                    long j12 = this.zzf;
                    zzaaz zzaazVar = this.zzb;
                    Objects.requireNonNull(zzaazVar);
                    zzagyVar2.zzb(new zzadl(j12, zzaazVar));
                    zzafa zzafaVar2 = this.zzg;
                    Objects.requireNonNull(zzafaVar2);
                    zzg(zzafaVar2);
                    this.zzc = 5;
                } else {
                    zzf();
                }
            } else {
                zzf();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzfa zzfaVar = new zzfa(this.zze);
            ((zzaam) zzaaxVar).zzn(zzfaVar.zzH(), 0, this.zze, false);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzfaVar.zzv((char) 0)) && (strZzv = zzfaVar.zzv((char) 0)) != null) {
                long jZzd = zzaaxVar.zzd();
                if (jZzd == -1 || (zzadiVarZza = zzadm.zza(strZzv)) == null || zzadiVarZza.zzb.size() < 2) {
                    zzafaVar = null;
                } else {
                    long j13 = -1;
                    long j14 = -1;
                    long j15 = -1;
                    long j16 = -1;
                    boolean zEquals = false;
                    for (int size = zzadiVarZza.zzb.size() - 1; size >= 0; size--) {
                        zzadh zzadhVar = (zzadh) zzadiVarZza.zzb.get(size);
                        zEquals |= "video/mp4".equals(zzadhVar.zza);
                        if (size == 0) {
                            jZzd -= zzadhVar.zzd;
                            j10 = 0;
                        } else {
                            j10 = jZzd - zzadhVar.zzc;
                        }
                        long j17 = jZzd;
                        jZzd = j10;
                        if (zEquals && jZzd != j17) {
                            j16 = j17 - jZzd;
                            j15 = jZzd;
                            zEquals = false;
                        }
                        if (size == 0) {
                            j14 = j17;
                        }
                        if (size == 0) {
                            j13 = jZzd;
                        }
                    }
                    if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
                        zzafaVar = null;
                    } else {
                        zzafaVar = new zzafa(j13, j14, zzadiVarZza.zza, j15, j16);
                    }
                }
                this.zzg = zzafaVar;
                if (zzafaVar != null) {
                    this.zzf = zzafaVar.zzd;
                }
                i10 = 0;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
            ((zzaam) zzaaxVar).zzo(this.zze, false);
        }
        this.zzc = i10;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzb(zzaaz zzaazVar) {
        this.zzb = zzaazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final void zzc(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzagy zzagyVar = this.zzj;
            Objects.requireNonNull(zzagyVar);
            zzagyVar.zzc(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaw
    public final boolean zzd(zzaax zzaaxVar) throws IOException {
        if (zze(zzaaxVar) != 65496) {
            return false;
        }
        int iZze = zze(zzaaxVar);
        this.zzd = iZze;
        if (iZze == 65504) {
            this.zza.zzC(2);
            zzaam zzaamVar = (zzaam) zzaaxVar;
            zzaamVar.zzm(this.zza.zzH(), 0, 2, false);
            zzaamVar.zzl(this.zza.zzo() - 2, false);
            iZze = zze(zzaaxVar);
            this.zzd = iZze;
        }
        if (iZze == 65505) {
            zzaam zzaamVar2 = (zzaam) zzaaxVar;
            zzaamVar2.zzl(2, false);
            this.zza.zzC(6);
            zzaamVar2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }
}
