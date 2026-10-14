package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzab extends zzu {
    public final /* synthetic */ zzac zza;

    public zzab(zzac zzacVar) {
        this.zza = zzacVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzm.zza(i10, this.zza.zzc, "index");
        zzac zzacVar = this.zza;
        int i11 = i10 + i10;
        Object obj = zzacVar.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzacVar.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final boolean zzf() {
        return true;
    }
}
