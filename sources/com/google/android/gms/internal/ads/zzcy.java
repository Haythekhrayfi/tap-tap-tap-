package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcy {
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzam[] zzg;
    private int zzh;
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcx
    };

    public zzcy(String str, zzam... zzamVarArr) {
        this.zzc = str;
        this.zzg = zzamVarArr;
        int iZzb = zzcc.zzb(zzamVarArr[0].zzm);
        this.zzd = iZzb == -1 ? zzcc.zzb(zzamVarArr[0].zzl) : iZzb;
        zzd(zzamVarArr[0].zzd);
        int i10 = zzamVarArr[0].zzf;
    }

    private static String zzd(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcy.class == obj.getClass()) {
            zzcy zzcyVar = (zzcy) obj;
            if (this.zzc.equals(zzcyVar.zzc) && Arrays.equals(this.zzg, zzcyVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zzc.hashCode() + 527;
        int iHashCode2 = Arrays.hashCode(this.zzg) + (iHashCode * 31);
        this.zzh = iHashCode2;
        return iHashCode2;
    }

    public final int zza(zzam zzamVar) {
        for (int i10 = 0; i10 <= 0; i10++) {
            if (zzamVar == this.zzg[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final zzam zzb(int i10) {
        return this.zzg[i10];
    }

    public final zzcy zzc(String str) {
        return new zzcy(str, this.zzg);
    }
}
