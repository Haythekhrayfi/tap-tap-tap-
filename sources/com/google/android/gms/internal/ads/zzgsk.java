package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgsk implements Iterator {
    public final Iterator zza;
    public final /* synthetic */ zzgsl zzb;

    public zzgsk(zzgsl zzgslVar) {
        this.zzb = zzgslVar;
        this.zza = zzgslVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
