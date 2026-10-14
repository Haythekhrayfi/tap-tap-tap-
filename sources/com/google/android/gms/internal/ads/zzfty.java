package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfty {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfpi zzfpiVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzftv)) {
                Objects.requireNonNull(set);
                return new zzftv(set, zzfpiVar);
            }
            zzftv zzftvVar = (zzftv) set;
            return new zzftv(zzftvVar.zza, zzfpl.zza(zzftvVar.zzb, zzfpiVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzftv)) {
            Objects.requireNonNull(sortedSet);
            return new zzftw(sortedSet, zzfpiVar);
        }
        zzftv zzftvVar2 = (zzftv) sortedSet;
        return new zzftw((SortedSet) zzftvVar2.zza, zzfpl.zza(zzftvVar2.zzb, zzfpiVar));
    }

    public static boolean zzc(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zzd(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzfti) {
            collection = ((zzfti) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean zze(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
