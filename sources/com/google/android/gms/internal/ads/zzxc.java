package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxc {
    private final String[] zza;
    private final int[] zzb;
    private final zzvn[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzvn zzf;

    public zzxc(String[] strArr, int[] iArr, zzvn[] zzvnVarArr, int[] iArr2, int[][][] iArr3, zzvn zzvnVar) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zzvnVarArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zzvnVar;
    }

    public final int zza(int i10, int i11, boolean z10) {
        int i12 = this.zzc[i10].zzb(i11).zzb;
        int[] iArr = new int[1];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 <= 0; i15++) {
            if ((this.zze[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        String str = null;
        int iMin = 16;
        boolean z11 = false;
        int i16 = 0;
        while (i13 < iArrCopyOf.length) {
            String str2 = this.zzc[i10].zzb(i11).zzb(iArrCopyOf[i13]).zzm;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z11 |= !zzfj.zzC(str, str2);
            }
            iMin = Math.min(iMin, this.zze[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z11 ? Math.min(iMin, this.zzd[i10]) : iMin;
    }

    public final int zzb(int i10, int i11, int i12) {
        return this.zze[i10][i11][i12];
    }

    public final int zzc(int i10) {
        return this.zzb[i10];
    }

    public final zzvn zzd(int i10) {
        return this.zzc[i10];
    }

    public final zzvn zze() {
        return this.zzf;
    }
}
