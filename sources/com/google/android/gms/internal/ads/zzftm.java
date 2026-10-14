package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzftm extends zzfsc {
    public static final zzfsc zza = new zzftm(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzftm(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzfph.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc, com.google.android.gms.internal.ads.zzfrx
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, i10, this.zzc);
        return i10 + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final Object[] zzg() {
        return this.zzb;
    }
}
