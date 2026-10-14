package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw {
    public Object[] zza = new Object[8];
    public int zzb = 0;
    public zzv zzc;

    public final zzw zza(Object obj, Object obj2) {
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i12);
        }
        zzp.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i13 = this.zzb;
        int i14 = i13 + i13;
        objArr2[i14] = obj;
        objArr2[i14 + 1] = obj2;
        this.zzb = i13 + 1;
        return this;
    }

    public final zzx zzb() {
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            throw zzvVar.zza();
        }
        zzaf zzafVarZzf = zzaf.zzf(this.zzb, this.zza, this);
        zzv zzvVar2 = this.zzc;
        if (zzvVar2 == null) {
            return zzafVarZzf;
        }
        throw zzvVar2.zza();
    }
}
