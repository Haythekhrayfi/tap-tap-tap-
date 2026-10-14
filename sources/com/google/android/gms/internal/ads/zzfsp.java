package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzfsp extends AbstractSequentialList implements Serializable {
    public final List zza;
    public final zzfov zzb;

    public zzfsp(List list, zzfov zzfovVar) {
        this.zza = list;
        this.zzb = zzfovVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzfso(this, this.zza.listIterator(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
