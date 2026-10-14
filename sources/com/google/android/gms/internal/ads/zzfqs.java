package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
class zzfqs extends AbstractCollection {
    public final Object zza;
    public Collection zzb;

    @CheckForNull
    public final zzfqs zzc;

    @CheckForNull
    public final Collection zzd;
    public final /* synthetic */ zzfqv zze;

    public zzfqs(zzfqv zzfqvVar, Object obj, @CheckForNull Collection collection, zzfqs zzfqsVar) {
        this.zze = zzfqvVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzfqsVar;
        this.zzd = zzfqsVar == null ? null : zzfqsVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        boolean zAdd = this.zzb.add(obj);
        if (zAdd) {
            this.zze.zzb++;
            if (zIsEmpty) {
                zza();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzfqv zzfqvVar = this.zze;
        zzfqvVar.zzb = (size2 - size) + zzfqvVar.zzb;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        this.zze.zzb -= size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzfqr(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        zzb();
        boolean zRemove = this.zzb.remove(obj);
        if (zRemove) {
            this.zze.zzb--;
            zzc();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.zzb.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.zzb.size();
            zzfqv zzfqvVar = this.zze;
            zzfqvVar.zzb = (size2 - size) + zzfqvVar.zzb;
            zzc();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean zRetainAll = this.zzb.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.zzb.size();
            zzfqv zzfqvVar = this.zze;
            zzfqvVar.zzb = (size2 - size) + zzfqvVar.zzb;
            zzc();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    final void zza() {
        zzfqs zzfqsVar = this.zzc;
        if (zzfqsVar != null) {
            zzfqsVar.zza();
        } else {
            this.zze.zza.put(this.zza, this.zzb);
        }
    }

    final void zzb() {
        Collection collection;
        zzfqs zzfqsVar = this.zzc;
        if (zzfqsVar != null) {
            zzfqsVar.zzb();
            if (this.zzc.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.zzb.isEmpty() || (collection = (Collection) this.zze.zza.get(this.zza)) == null) {
                return;
            }
            this.zzb = collection;
        }
    }

    final void zzc() {
        zzfqs zzfqsVar = this.zzc;
        if (zzfqsVar != null) {
            zzfqsVar.zzc();
        } else if (this.zzb.isEmpty()) {
            this.zze.zza.remove(this.zza);
        }
    }
}
