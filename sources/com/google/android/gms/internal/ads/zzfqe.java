package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class zzfqe extends zzfqv implements zzfsn {
    public zzfqe(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzfqv
    public /* bridge */ /* synthetic */ Collection zza() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfqv
    public final Collection zzb(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfqv
    public final Collection zzc(Object obj, Collection collection) {
        return zzh(obj, (List) collection, null);
    }
}
