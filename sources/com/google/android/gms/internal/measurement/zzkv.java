package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzkv extends zzkz {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzkv() {
        super(null);
    }

    public /* synthetic */ zzkv(zzku zzkuVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final void zza(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzmx.zzf(obj, j10);
        if (list instanceof zzkt) {
            objUnmodifiableList = ((zzkt) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzls) && (list instanceof zzkl)) {
                zzkl zzklVar = (zzkl) list;
                if (zzklVar.zzc()) {
                    zzklVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzmx.zzs(obj, j10, objUnmodifiableList);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.measurement.zzkz
    public final void zzb(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        int size;
        List listZzd;
        List list3 = (List) zzmx.zzf(obj2, j10);
        int size2 = list3.size();
        List list4 = (List) zzmx.zzf(obj, j10);
        if (!list4.isEmpty()) {
            if (!zza.isAssignableFrom(list4.getClass())) {
                if (list4 instanceof zzms) {
                    zzks zzksVar = new zzks(list4.size() + size2);
                    zzksVar.addAll(zzksVar.size(), (zzms) list4);
                    list = zzksVar;
                } else if ((list4 instanceof zzls) && (list4 instanceof zzkl)) {
                    zzkl zzklVar = (zzkl) list4;
                    if (!zzklVar.zzc()) {
                        list2 = list4;
                        list2 = list4;
                        list2 = list4;
                        listZzd = zzklVar.zzd(list4.size() + size2);
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
                zzmx.zzs(obj, j10, list3);
            }
            ArrayList arrayList = new ArrayList(list4.size() + size2);
            arrayList.addAll(list4);
            list = arrayList;
            zzmx.zzs(obj, j10, list);
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
            zzmx.zzs(obj, j10, list3);
        }
        if (list4 instanceof zzkt) {
            listZzd = new zzks(size2);
        } else {
            listZzd = ((list4 instanceof zzls) && (list4 instanceof zzkl)) ? ((zzkl) list4).zzd(size2) : new ArrayList(size2);
        }
        zzmx.zzs(obj, j10, listZzd);
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
        zzmx.zzs(obj, j10, list3);
    }
}
