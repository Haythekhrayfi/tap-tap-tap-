package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzaf zza(int i10) {
        zzdy.zzf(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzah zzb() {
        zzdy.zzf(!this.zzb);
        this.zzb = true;
        return new zzah(this.zza, null);
    }
}
