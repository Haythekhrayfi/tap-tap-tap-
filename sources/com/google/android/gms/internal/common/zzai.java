package com.google.android.gms.internal.common;

import java.util.Objects;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes2.dex */
@NullMarked
final class zzai extends zzag {
    public static final zzag zza = new zzai(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzai(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzs.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] zzg() {
        return this.zzb;
    }
}
