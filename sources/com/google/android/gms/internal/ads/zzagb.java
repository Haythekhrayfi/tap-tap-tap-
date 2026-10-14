package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzagb implements zzafz {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzagb(long j10, int i10, long j11, long j12, long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzf = jArr;
        this.zzd = j12;
        this.zze = j12 != -1 ? j10 + j12 : -1L;
    }

    public static zzagb zza(long j10, long j11, zzabp zzabpVar, zzfa zzfaVar) {
        int iZzn;
        int i10 = zzabpVar.zzg;
        int i11 = zzabpVar.zzd;
        int iZze = zzfaVar.zze();
        if ((iZze & 1) != 1 || (iZzn = zzfaVar.zzn()) == 0) {
            return null;
        }
        int i12 = iZze & 6;
        long jZzp = zzfj.zzp(iZzn, ((long) i10) * 1000000, i11);
        if (i12 != 6) {
            return new zzagb(j11, zzabpVar.zzc, jZzp, -1L, null);
        }
        long jZzs = zzfaVar.zzs();
        long[] jArr = new long[100];
        for (int i13 = 0; i13 < 100; i13++) {
            jArr[i13] = zzfaVar.zzk();
        }
        if (j10 != -1) {
            long j12 = j11 + jZzs;
            if (j10 != j12) {
                StringBuilder sbA = i2.a.a("XING data size mismatch: ", j10, ", ");
                sbA.append(j12);
                zzer.zzf("XingSeeker", sbA.toString());
            }
        }
        return new zzagb(j11, zzabpVar.zzc, jZzp, jZzs, jArr);
    }

    private final long zzd(int i10) {
        return (this.zzc * ((long) i10)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final long zzc(long j10) {
        long j11 = j10 - this.zza;
        if (!zzh() || j11 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzf;
        zzdy.zzb(jArr);
        double d10 = (j11 * 256.0d) / this.zzd;
        int iZzc = zzfj.zzc(jArr, (long) d10, true, true);
        long jZzd = zzd(iZzc);
        long j12 = jArr[iZzc];
        int i10 = iZzc + 1;
        long jZzd2 = zzd(i10);
        long j13 = iZzc == 99 ? 256L : jArr[i10];
        return Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (jZzd2 - jZzd)) + jZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        if (!zzh()) {
            zzabw zzabwVar = new zzabw(0L, this.zza + ((long) this.zzb));
            return new zzabt(zzabwVar, zzabwVar);
        }
        long jMax = Math.max(0L, Math.min(j10, this.zzc));
        double d10 = (jMax * 100.0d) / this.zzc;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.zzf;
                zzdy.zzb(jArr);
                double d12 = jArr[i10];
                d11 = (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d10 - ((double) i10))) + d12;
            }
        }
        zzabw zzabwVar2 = new zzabw(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d11 / 256.0d) * this.zzd), this.zzd - 1)));
        return new zzabt(zzabwVar2, zzabwVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return this.zzf != null;
    }
}
