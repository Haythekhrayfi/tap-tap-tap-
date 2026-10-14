package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzfg extends zzfk {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzfg() {
        super(null);
    }

    public /* synthetic */ zzfg(zzff zzffVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zza(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzhi.zzf(obj, j10);
        if (list instanceof zzfe) {
            objUnmodifiableList = ((zzfe) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgd) && (list instanceof zzey)) {
                zzey zzeyVar = (zzey) list;
                if (zzeyVar.zzc()) {
                    zzeyVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzhi.zzp(obj, j10, objUnmodifiableList);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zzb(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        int size;
        List listZzd;
        List list3 = (List) zzhi.zzf(obj2, j10);
        int size2 = list3.size();
        List list4 = (List) zzhi.zzf(obj, j10);
        if (!list4.isEmpty()) {
            if (!zza.isAssignableFrom(list4.getClass())) {
                if (list4 instanceof zzhd) {
                    zzfd zzfdVar = new zzfd(list4.size() + size2);
                    zzfdVar.addAll(zzfdVar.size(), (zzhd) list4);
                    list = zzfdVar;
                } else if ((list4 instanceof zzgd) && (list4 instanceof zzey)) {
                    zzey zzeyVar = (zzey) list4;
                    if (!zzeyVar.zzc()) {
                        list2 = list4;
                        list2 = list4;
                        list2 = list4;
                        listZzd = zzeyVar.zzd(list4.size() + size2);
                    }
                }
                list2 = list4;
                list2 = list4;
                list2 = list4;
                list2 = list4;
                list2 = list4;
                list2 = list4;
                size = list2.size();
                int size3 = list3.size();
                if (size > 0 && size3 > 0) {
                    list2.addAll(list3);
                }
                if (size > 0) {
                    list3 = list2;
                }
                zzhi.zzp(obj, j10, list3);
            }
            ArrayList arrayList = new ArrayList(list4.size() + size2);
            arrayList.addAll(list4);
            list = arrayList;
            zzhi.zzp(obj, j10, list);
            list2 = list;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            list2 = list4;
            size = list2.size();
            int size4 = list3.size();
            if (size > 0) {
                list2.addAll(list3);
            }
            if (size > 0) {
                list3 = list2;
            }
            zzhi.zzp(obj, j10, list3);
        }
        if (list4 instanceof zzfe) {
            listZzd = new zzfd(size2);
        } else {
            listZzd = ((list4 instanceof zzgd) && (list4 instanceof zzey)) ? ((zzey) list4).zzd(size2) : new ArrayList(size2);
        }
        zzhi.zzp(obj, j10, listZzd);
        list2 = listZzd;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        size = list2.size();
        int size5 = list3.size();
        if (size > 0) {
            list2.addAll(list3);
        }
        if (size > 0) {
            list3 = list2;
        }
        zzhi.zzp(obj, j10, list3);
    }
}
