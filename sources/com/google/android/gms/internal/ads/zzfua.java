package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfua implements Iterator {
    public final Iterator zzb;

    public zzfua(Iterator it) {
        Objects.requireNonNull(it);
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    public abstract Object zza(Object obj);
}
