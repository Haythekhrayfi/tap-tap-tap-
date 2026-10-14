package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class zzvw implements zzxa {
    public final zzcy zza;
    public final int zzb;
    public final int[] zzc;
    private final zzam[] zzd;
    private int zze;

    public zzvw(zzcy zzcyVar, int[] iArr, int i10) {
        int length = iArr.length;
        zzdy.zzf(length > 0);
        Objects.requireNonNull(zzcyVar);
        this.zza = zzcyVar;
        this.zzb = length;
        this.zzd = new zzam[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.zzd[i11] = zzcyVar.zzb(iArr[i11]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzam) obj2).zzi - ((zzam) obj).zzi;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i12 = 0; i12 < this.zzb; i12++) {
            this.zzc[i12] = zzcyVar.zza(this.zzd[i12]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzvw zzvwVar = (zzvw) obj;
            if (this.zza == zzvwVar.zza && Arrays.equals(this.zzc, zzvwVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final int zza(int i10) {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final int zzb(int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            if (this.zzc[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final int zzc() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final zzam zzd(int i10) {
        return this.zzd[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final zzcy zze() {
        return this.zza;
    }
}
