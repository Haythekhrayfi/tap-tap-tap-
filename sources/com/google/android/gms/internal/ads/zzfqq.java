package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
class zzfqq extends zzfql implements SortedSet {
    public final /* synthetic */ zzfqv zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqq(zzfqv zzfqvVar, SortedMap sortedMap) {
        super(zzfqvVar, sortedMap);
        this.zzc = zzfqvVar;
    }

    @Override // java.util.SortedSet
    @CheckForNull
    public final Comparator comparator() {
        return zza().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzfqq(this.zzc, zza().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzfqq(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzfqq(this.zzc, zza().tailMap(obj));
    }

    public SortedMap zza() {
        return (SortedMap) this.zzd;
    }
}
