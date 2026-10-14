package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfqg extends zzfst {
    public final /* synthetic */ zzfqi zza;

    public zzfqg(zzfqi zzfqiVar) {
        this.zza = zzfqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfst, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return zzfrb.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfqh(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfst, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfqv.zzo(this.zza.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfst
    public final Map zza() {
        return this.zza;
    }
}
