package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlu {
    private final zzah zza;
    private final SparseArray zzb;

    public zzlu(zzah zzahVar, SparseArray sparseArray) {
        this.zza = zzahVar;
        SparseArray sparseArray2 = new SparseArray(zzahVar.zzb());
        for (int i10 = 0; i10 < zzahVar.zzb(); i10++) {
            int iZza = zzahVar.zza(i10);
            zzlt zzltVar = (zzlt) sparseArray.get(iZza);
            Objects.requireNonNull(zzltVar);
            sparseArray2.append(iZza, zzltVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlt zzc(int i10) {
        zzlt zzltVar = (zzlt) this.zzb.get(i10);
        Objects.requireNonNull(zzltVar);
        return zzltVar;
    }

    public final boolean zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
