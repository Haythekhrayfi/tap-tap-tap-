package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
class zzfra extends AbstractCollection {
    public final Collection zza;
    public final zzfpi zzb;

    public zzfra(Collection collection, zzfpi zzfpiVar) {
        this.zza = collection;
        this.zzb = zzfpiVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzfph.zze(this.zzb.zza(obj));
        return this.zza.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzfph.zze(this.zzb.zza(it.next()));
        }
        return this.zza.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        zzfsi.zza(this.zza, this.zzb);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (zzfrb.zza(this.zza, obj)) {
            return this.zzb.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection collection = this.zza;
        zzfpi zzfpiVar = this.zzb;
        Iterator it = collection.iterator();
        zzfph.zzc(zzfpiVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (zzfpiVar.zza(it.next())) {
                return i10 == -1;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.zza.iterator();
        zzfpi zzfpiVar = this.zzb;
        Objects.requireNonNull(it);
        Objects.requireNonNull(zzfpiVar);
        return new zzfsj(it, zzfpiVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        return contains(obj) && this.zza.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.zza.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.zzb.zza(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfsm.zzc(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfsm.zzc(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
