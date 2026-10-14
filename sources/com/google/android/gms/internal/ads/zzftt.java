package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzftt extends zzftl implements Serializable {
    public static final zzftt zza = new zzftt();

    private zzftt() {
    }

    @Override // com.google.android.gms.internal.ads.zzftl, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    public final zzftl zza() {
        return zzftj.zza;
    }
}
