package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabo implements zzabv {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzabo(long[] jArr, long[] jArr2, long j10) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdy.zzd(length == length2);
        boolean z10 = length2 > 0;
        this.zzd = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i10 = length2 + 1;
            long[] jArr3 = new long[i10];
            this.zza = jArr3;
            long[] jArr4 = new long[i10];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        if (!this.zzd) {
            zzabw zzabwVar = zzabw.zza;
            return new zzabt(zzabwVar, zzabwVar);
        }
        int iZzc = zzfj.zzc(this.zzb, j10, true, true);
        zzabw zzabwVar2 = new zzabw(this.zzb[iZzc], this.zza[iZzc]);
        if (zzabwVar2.zzb != j10) {
            long[] jArr = this.zzb;
            if (iZzc != jArr.length - 1) {
                int i10 = iZzc + 1;
                return new zzabt(zzabwVar2, new zzabw(jArr[i10], this.zza[i10]));
            }
        }
        return new zzabt(zzabwVar2, zzabwVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return this.zzd;
    }
}
