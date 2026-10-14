package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzftj extends zzftl implements Serializable {
    public static final zzftj zza = new zzftj();

    private zzftj() {
    }

    @Override // com.google.android.gms.internal.ads.zzftl, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    public final zzftl zza() {
        return zzftt.zza;
    }
}
