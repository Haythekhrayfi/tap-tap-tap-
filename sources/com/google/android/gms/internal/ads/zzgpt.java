package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpt extends AbstractList {
    private final List zza;
    private final zzgps zzb;

    public zzgpt(List list, zzgps zzgpsVar) {
        this.zza = list;
        this.zzb = zzgpsVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzaxx zzaxxVarZzb = zzaxx.zzb(((Integer) this.zza.get(i10)).intValue());
        return zzaxxVarZzb == null ? zzaxx.AD_FORMAT_TYPE_UNSPECIFIED : zzaxxVarZzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
