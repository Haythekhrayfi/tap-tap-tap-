package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqg extends zzgqk {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzgqg() {
        super(null);
    }

    public /* synthetic */ zzgqg(zzgqf zzgqfVar) {
        super(null);
    }

    private static List zzf(Object obj, long j10, int i10) {
        List list;
        List listZzd;
        List list2 = (List) zzgsq.zzh(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof zzgqe) {
                listZzd = new zzgqd(i10);
            } else {
                listZzd = ((list2 instanceof zzgrd) && (list2 instanceof zzgpv)) ? ((zzgpv) list2).zzd(i10) : new ArrayList(i10);
            }
            zzgsq.zzv(obj, j10, listZzd);
            return listZzd;
        }
        if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i10);
            arrayList.addAll(list2);
            list = arrayList;
        } else {
            if (!(list2 instanceof zzgsl)) {
                if (!(list2 instanceof zzgrd) || !(list2 instanceof zzgpv)) {
                    return list2;
                }
                zzgpv zzgpvVar = (zzgpv) list2;
                if (zzgpvVar.zzc()) {
                    return list2;
                }
                zzgpv zzgpvVarZzd = zzgpvVar.zzd(list2.size() + i10);
                zzgsq.zzv(obj, j10, zzgpvVarZzd);
                return zzgpvVarZzd;
            }
            zzgqd zzgqdVar = new zzgqd(list2.size() + i10);
            zzgqdVar.addAll(zzgqdVar.size(), (zzgsl) list2);
            list = zzgqdVar;
        }
        zzgsq.zzv(obj, j10, list);
        return list;
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final List zza(Object obj, long j10) {
        return zzf(obj, j10, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final void zzb(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzgsq.zzh(obj, j10);
        if (list instanceof zzgqe) {
            objUnmodifiableList = ((zzgqe) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgrd) && (list instanceof zzgpv)) {
                zzgpv zzgpvVar = (zzgpv) list;
                if (zzgpvVar.zzc()) {
                    zzgpvVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzgsq.zzv(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzgqk
    public final void zzc(Object obj, Object obj2, long j10) {
        List list = (List) zzgsq.zzh(obj2, j10);
        List listZzf = zzf(obj, j10, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzgsq.zzv(obj, j10, list);
    }
}
