package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzftw extends zzftv implements SortedSet {
    public zzftw(SortedSet sortedSet, zzfpi zzfpiVar) {
        super(sortedSet, zzfpiVar);
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return ((SortedSet) this.zza).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.zza.iterator();
        zzfpi zzfpiVar = this.zzb;
        Objects.requireNonNull(it);
        Objects.requireNonNull(zzfpiVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (zzfpiVar.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new zzftw(((SortedSet) this.zza).headSet(obj), this.zzb);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.zza;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.zzb.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzftw(((SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new zzftw(((SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
