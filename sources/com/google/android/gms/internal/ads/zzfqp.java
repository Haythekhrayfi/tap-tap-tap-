package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
class zzfqp extends zzfqi implements SortedMap {

    @CheckForNull
    public SortedSet zzd;
    public final /* synthetic */ zzfqv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqp(zzfqv zzfqvVar, SortedMap sortedMap) {
        super(zzfqvVar, sortedMap);
        this.zze = zzfqvVar;
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfqp(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfqp(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfqp(this.zze, zzf().tailMap(obj));
    }

    public SortedMap zzf() {
        return (SortedMap) ((zzfqi) this).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfsw
    public SortedSet zzg() {
        return new zzfqq(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfqi, com.google.android.gms.internal.ads.zzfsw, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetZzg = zzg();
        this.zzd = sortedSetZzg;
        return sortedSetZzg;
    }
}
