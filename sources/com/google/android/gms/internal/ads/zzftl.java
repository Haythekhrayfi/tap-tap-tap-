package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzftl implements Comparator {
    public static zzftl zzb(Comparator comparator) {
        return comparator instanceof zzftl ? (zzftl) comparator : new zzfrn(comparator);
    }

    public static zzftl zzc() {
        return zzftj.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzftl zza() {
        return new zzftu(this);
    }
}
