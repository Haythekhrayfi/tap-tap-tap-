package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class zzfqr implements Iterator {
    public final Iterator zza;
    public final Collection zzb;
    public final /* synthetic */ zzfqs zzc;

    public zzfqr(zzfqs zzfqsVar) {
        this.zzc = zzfqsVar;
        Collection collection = zzfqsVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public zzfqr(zzfqs zzfqsVar, Iterator it) {
        this.zzc = zzfqsVar;
        this.zzb = zzfqsVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        this.zzc.zze.zzb--;
        this.zzc.zzc();
    }

    final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
