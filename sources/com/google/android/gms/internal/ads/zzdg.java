package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdg {
    public final int zzb;
    private final zzcy zzg;
    private final int[] zzh;
    private final boolean[] zzi;
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(3, 36);
    private static final String zzf = Integer.toString(4, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzdf
    };

    public zzdg(zzcy zzcyVar, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = zzcyVar.zzb;
        this.zzb = 1;
        this.zzg = zzcyVar;
        this.zzh = (int[]) iArr.clone();
        this.zzi = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdg.class == obj.getClass()) {
            zzdg zzdgVar = (zzdg) obj;
            if (this.zzg.equals(zzdgVar.zzg) && Arrays.equals(this.zzh, zzdgVar.zzh) && Arrays.equals(this.zzi, zzdgVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zzg.hashCode() * 961) + Arrays.hashCode(this.zzh)) * 31) + Arrays.hashCode(this.zzi);
    }

    public final int zza() {
        return this.zzg.zzd;
    }

    public final zzam zzb(int i10) {
        return this.zzg.zzb(i10);
    }

    public final boolean zzc() {
        for (boolean z10 : this.zzi) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i10) {
        return this.zzi[i10];
    }
}
