package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zzgsl extends AbstractList implements RandomAccess, zzgqe {
    private final zzgqe zza;

    public zzgsl(zzgqe zzgqeVar) {
        this.zza = zzgqeVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzgqd) this.zza).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzgsk(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzgsj(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final zzgqe zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void zzi(zzgoe zzgoeVar) {
        throw new UnsupportedOperationException();
    }
}
