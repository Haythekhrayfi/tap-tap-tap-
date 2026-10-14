package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzah {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        if (zzfj.zza >= 24) {
            return this.zza.equals(zzahVar.zza);
        }
        if (this.zza.size() != zzahVar.zza.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (zza(i10) != zzahVar.zza(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (zzfj.zza >= 24) {
            return this.zza.hashCode();
        }
        int size = this.zza.size();
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            size = (size * 31) + zza(i10);
        }
        return size;
    }

    public final int zza(int i10) {
        zzdy.zza(i10, 0, this.zza.size());
        return this.zza.keyAt(i10);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i10) {
        return this.zza.get(i10);
    }
}
