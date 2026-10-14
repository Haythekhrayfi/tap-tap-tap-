package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzae extends zzu {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzae(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzm.zza(i10, this.zzc, "index");
        Object obj = this.zza[i10 + i10 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final boolean zzf() {
        return true;
    }
}
