package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahf {
    public final zzahc zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzahf(zzahc zzahcVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzdy.zzd(length == length2);
        int length3 = jArr.length;
        zzdy.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzdy.zzd(length4 == length2);
        this.zza = zzahcVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i10;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j10;
        this.zzb = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int zza(long j10) {
        for (int iZzc = zzfj.zzc(this.zzf, j10, true, false); iZzc >= 0; iZzc--) {
            if ((this.zzg[iZzc] & 1) != 0) {
                return iZzc;
            }
        }
        return -1;
    }

    public final int zzb(long j10) {
        for (int iZza = zzfj.zza(this.zzf, j10, true, false); iZza < this.zzf.length; iZza++) {
            if ((this.zzg[iZza] & 1) != 0) {
                return iZza;
            }
        }
        return -1;
    }
}
