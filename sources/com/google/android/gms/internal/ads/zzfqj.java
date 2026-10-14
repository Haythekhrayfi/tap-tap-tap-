package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
class zzfqj implements Iterator {
    public final Iterator zza;

    @CheckForNull
    public Object zzb = null;

    @CheckForNull
    public Collection zzc = null;
    public Iterator zzd = zzfsl.INSTANCE;
    public final /* synthetic */ zzfqv zze;

    public zzfqj(zzfqv zzfqvVar) {
        this.zze = zzfqvVar;
        this.zza = zzfqvVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return this.zzd.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzd.remove();
        Collection collection = this.zzc;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        this.zze.zzb--;
    }
}
