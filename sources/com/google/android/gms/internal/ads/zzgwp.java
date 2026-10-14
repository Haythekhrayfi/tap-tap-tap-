package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwp implements zzgwe {
    private static final zzgwe zza = zzgwf.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    public /* synthetic */ zzgwp(List list, List list2, zzgwn zzgwnVar) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzgwo zza(int i10, int i11) {
        return new zzgwo(i10, i11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((zzgwr) this.zzc.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZza = zzgwb.zza(size);
        int size3 = this.zzb.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object objZzb = ((zzgwr) this.zzb.get(i11)).zzb();
            Objects.requireNonNull(objZzb);
            hashSetZza.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                Objects.requireNonNull(obj);
                hashSetZza.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetZza);
    }
}
