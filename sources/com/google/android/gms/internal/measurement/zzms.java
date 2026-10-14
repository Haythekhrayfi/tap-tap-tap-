package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class zzms extends AbstractList implements RandomAccess, zzkt {
    private final zzkt zza;

    public zzms(zzkt zzktVar) {
        this.zza = zzktVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzks) this.zza).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzmr(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzmq(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final zzkt zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final void zzi(zzjd zzjdVar) {
        throw new UnsupportedOperationException();
    }
}
