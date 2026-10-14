package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzftn extends zzfsc {
    public final /* synthetic */ zzfto zza;

    public zzftn(zzfto zzftoVar) {
        this.zza = zzftoVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzfph.zza(i10, this.zza.zzc, "index");
        zzfto zzftoVar = this.zza;
        int i11 = i10 + i10;
        Object obj = zzftoVar.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzftoVar.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrx
    public final boolean zzf() {
        return true;
    }
}
