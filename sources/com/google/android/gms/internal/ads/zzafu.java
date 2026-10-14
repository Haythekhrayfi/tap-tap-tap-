package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
final class zzafu implements zzafz {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzafu(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzfj.zzo(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzafu zza(long j10, zzaer zzaerVar, long j11) {
        int length = zzaerVar.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (zzaerVar.zzb + zzaerVar.zzd[i12]);
            j12 += (long) (zzaerVar.zzc + zzaerVar.zze[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzafu(jArr, jArr2, j11);
    }

    private static Pair zzd(long j10, long[] jArr, long[] jArr2) {
        Long lValueOf;
        Long lValueOf2;
        int iZzc = zzfj.zzc(jArr, j10, true, true);
        long j11 = jArr[iZzc];
        long j12 = jArr2[iZzc];
        int i10 = iZzc + 1;
        if (i10 == jArr.length) {
            lValueOf = Long.valueOf(j11);
            lValueOf2 = Long.valueOf(j12);
        } else {
            long j13 = jArr[i10];
            long j14 = jArr2[i10];
            double d10 = j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11);
            lValueOf = Long.valueOf(j10);
            lValueOf2 = Long.valueOf(((long) (d10 * (j14 - j12))) + j12);
        }
        return Pair.create(lValueOf, lValueOf2);
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final long zzb() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final long zzc(long j10) {
        return zzfj.zzo(((Long) zzd(j10, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final zzabt zzg(long j10) {
        Pair pairZzd = zzd(zzfj.zzq(Math.max(0L, Math.min(j10, this.zzc))), this.zzb, this.zza);
        zzabw zzabwVar = new zzabw(zzfj.zzo(((Long) pairZzd.first).longValue()), ((Long) pairZzd.second).longValue());
        return new zzabt(zzabwVar, zzabwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final boolean zzh() {
        return true;
    }
}
