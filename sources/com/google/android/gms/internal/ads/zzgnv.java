package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnv implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgoe zzgoeVar = (zzgoe) obj;
        zzgoe zzgoeVar2 = (zzgoe) obj2;
        zzgny it = zzgoeVar.iterator();
        zzgny it2 = zzgoeVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzgoeVar.zzd()).compareTo(Integer.valueOf(zzgoeVar2.zzd()));
    }
}
