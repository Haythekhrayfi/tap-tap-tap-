package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaga implements zzafz {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzaga(long[] jArr, long[] jArr2, long j10, long j11) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j11;
    }

    public static zzaga zza(long j10, long j11, zzabp zzabpVar, zzfa zzfaVar) {
        int iZzk;
        zzfaVar.zzG(10);
        int iZze = zzfaVar.zze();
        if (iZze <= 0) {
            return null;
        }
        int i10 = zzabpVar.zzd;
        long jZzp = zzfj.zzp(iZze, ((long) (i10 >= 32000 ? 1152 : 576)) * 1000000, i10);
        int iZzo = zzfaVar.zzo();
        int iZzo2 = zzfaVar.zzo();
        int iZzo3 = zzfaVar.zzo();
        zzfaVar.zzG(2);
        long j12 = j11 + ((long) zzabpVar.zzc);
        long[] jArr = new long[iZzo];
        long[] jArr2 = new long[iZzo];
        int i11 = 0;
        long j13 = j11;
        while (i11 < iZzo) {
            long j14 = jZzp;
            jArr[i11] = (((long) i11) * jZzp) / ((long) iZzo);
            jArr2[i11] = Math.max(j13, j12);
            if (iZzo3 == 1) {
                iZzk = zzfaVar.zzk();
            } else if (iZzo3 == 2) {
                iZzk = zzfaVar.zzo();
            } else if (iZzo3 == 3) {
                iZzk = zzfaVar.zzm();
            } else {
                if (iZzo3 != 4) {
                    return null;
                }
                iZzk = zzfaVar.zzn();
            }
            j13 += ((long) iZzk) * ((long) iZzo2);
            i11++;
            jZzp = j14;
        }
        long j15 = jZzp;
        if (j10 != -1 && j10 != j13) {
            StringBuilder sbA = i2.a.a("VBRI data size mismatch: ", j10, ", ");
            sbA.append(j13);
            zzer.zzf("VbriSeeker", sbA.toString());
        }
        return new zzaga(jArr, jArr2, j15, j13);
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final long zzc(long j10) {
        return this.zza[zzfj.zzc(this.zzb, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        int iZzc = zzfj.zzc(this.zza, j10, true, true);
        zzabw zzabwVar = new zzabw(this.zza[iZzc], this.zzb[iZzc]);
        if (zzabwVar.zzb < j10) {
            long[] jArr = this.zza;
            if (iZzc != jArr.length - 1) {
                int i10 = iZzc + 1;
                return new zzabt(zzabwVar, new zzabw(jArr[i10], this.zzb[i10]));
            }
        }
        return new zzabt(zzabwVar, zzabwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return true;
    }
}
