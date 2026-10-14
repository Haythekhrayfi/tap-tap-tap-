package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzahi implements zzahp {
    private final zzaho zza;
    private final long zzb;
    private final long zzc;
    private final zzahu zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzahi(zzahu zzahuVar, long j10, long j11, long j12, long j13, boolean z10) {
        zzdy.zzd(j10 >= 0 && j11 > j10);
        this.zzd = zzahuVar;
        this.zzb = j10;
        this.zzc = j11;
        if (j12 == j11 - j10 || z10) {
            this.zzf = j13;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzaho();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    @Override // com.google.android.gms.internal.ads.zzahp
    public final long zzd(zzaax zzaaxVar) throws IOException {
        long j10;
        zzaho zzahoVar;
        long jMax;
        int i10 = this.zze;
        long j11 = -1;
        if (i10 == 0) {
            long jZzf = zzaaxVar.zzf();
            this.zzg = jZzf;
            this.zze = 1;
            long j12 = this.zzc - 65307;
            if (j12 > jZzf) {
                return j12;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j13 = this.zzi;
                long j14 = this.zzj;
                if (j13 == j14) {
                    jMax = -1;
                } else {
                    long jZzf2 = zzaaxVar.zzf();
                    if (this.zza.zzc(zzaaxVar, j14)) {
                        this.zza.zzb(zzaaxVar, false);
                        zzaaxVar.zzj();
                        long j15 = this.zzh;
                        zzaho zzahoVar2 = this.zza;
                        long j16 = zzahoVar2.zzb;
                        long j17 = j15 - j16;
                        int i11 = zzahoVar2.zzd + zzahoVar2.zze;
                        if (j17 < 0 || j17 >= 72000) {
                            if (j17 < 0) {
                                this.zzj = jZzf2;
                                this.zzl = j16;
                            } else {
                                this.zzi = zzaaxVar.zzf() + ((long) i11);
                                this.zzk = j16;
                            }
                            long j18 = this.zzj;
                            long j19 = this.zzi;
                            long j20 = j18 - j19;
                            if (j20 < 100000) {
                                this.zzj = j19;
                                jMax = j19;
                            } else {
                                j11 = -1;
                                jMax = Math.max(j19, Math.min(((j17 * j20) / (this.zzl - this.zzk)) + (zzaaxVar.zzf() - (((long) i11) * (j17 <= 0 ? 2L : 1L))), j18 - 1));
                            }
                        } else {
                            jMax = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                if (jMax != j11) {
                    return jMax;
                }
                this.zze = 3;
            } else if (i10 != 3) {
                return -1L;
            }
            while (true) {
                this.zza.zzc(zzaaxVar, j11);
                this.zza.zzb(zzaaxVar, false);
                zzaho zzahoVar3 = this.zza;
                if (zzahoVar3.zzb > this.zzh) {
                    zzaaxVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                ((zzaam) zzaaxVar).zzo(zzahoVar3.zzd + zzahoVar3.zze, false);
                this.zzi = zzaaxVar.zzf();
                this.zzk = this.zza.zzb;
                j11 = -1;
            }
        }
        this.zza.zza();
        if (!this.zza.zzc(zzaaxVar, -1L)) {
            throw new EOFException();
        }
        this.zza.zzb(zzaaxVar, false);
        zzaho zzahoVar4 = this.zza;
        ((zzaam) zzaaxVar).zzo(zzahoVar4.zzd + zzahoVar4.zze, false);
        do {
            j10 = this.zza.zzb;
            zzaho zzahoVar5 = this.zza;
            if ((zzahoVar5.zza & 4) == 4 || !zzahoVar5.zzc(zzaaxVar, -1L) || zzaaxVar.zzf() >= this.zzc || !this.zza.zzb(zzaaxVar, true)) {
                break;
            }
            zzahoVar = this.zza;
        } while (zzaba.zze(zzaaxVar, zzahoVar.zzd + zzahoVar.zze));
        this.zzf = j10;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final /* bridge */ /* synthetic */ zzabv zze() {
        zzahg zzahgVar = null;
        if (this.zzf != 0) {
            return new zzahh(this, zzahgVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final void zzg(long j10) {
        this.zzh = Math.max(0L, Math.min(j10, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
