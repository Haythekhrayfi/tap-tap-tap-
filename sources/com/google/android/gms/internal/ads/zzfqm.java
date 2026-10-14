package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfqm extends zzfqp implements NavigableMap {
    public final /* synthetic */ zzfqv zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqm(zzfqv zzfqvVar, NavigableMap navigableMap) {
        super(zzfqvVar, navigableMap);
        this.zzc = zzfqvVar;
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return zza(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new zzfqm(this.zzc, ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).descendingMap());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return zza(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return zza(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new zzfqm(this.zzc, ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).headMap(obj, z10));
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return zza(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, com.google.android.gms.internal.ads.zzfqi, com.google.android.gms.internal.ads.zzfsw, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return zza(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return zza(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry pollFirstEntry() {
        return zzc(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry pollLastEntry() {
        return zzc(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new zzfqm(this.zzc, ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).subMap(obj, z10, obj2, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new zzfqm(this.zzc, ((NavigableMap) ((SortedMap) ((zzfqi) this).zza)).tailMap(obj, z10));
    }

    @Override // com.google.android.gms.internal.ads.zzfqp, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @CheckForNull
    public final Map.Entry zzc(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionZza = this.zzc.zza();
        collectionZza.addAll((Collection) entry.getValue());
        it.remove();
        return new zzfry(entry.getKey(), this.zzc.zzb(collectionZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NavigableSet zzg() {
        return new zzfqn(this.zzc, (NavigableMap) ((SortedMap) ((zzfqi) this).zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final /* synthetic */ SortedMap zzf() {
        return (NavigableMap) ((SortedMap) ((zzfqi) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    /* JADX INFO: renamed from: zzh */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }
}
