package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgvu implements Iterator {
    public int zza = 0;
    public final /* synthetic */ zzgvv zzb;

    public zzgvu(zzgvv zzgvvVar) {
        this.zzb = zzgvvVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzgvv zzgvvVar = this.zzb;
            zzgvvVar.zza.add(zzgvvVar.zzb.next());
            return next();
        }
        List list = this.zzb.zza;
        int i10 = this.zza;
        this.zza = i10 + 1;
        return list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
