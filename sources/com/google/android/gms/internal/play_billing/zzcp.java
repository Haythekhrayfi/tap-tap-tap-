package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzcp extends zzct {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzcp() {
        super(null);
    }

    public /* synthetic */ zzcp(zzco zzcoVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzct
    public final void zza(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) zzeq.zzf(obj, j10);
        if (list instanceof zzcn) {
            objUnmodifiableList = ((zzcn) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzdm) && (list instanceof zzcf)) {
                zzcf zzcfVar = (zzcf) list;
                if (zzcfVar.zzc()) {
                    zzcfVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzeq.zzs(obj, j10, objUnmodifiableList);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.play_billing.zzct
    public final void zzb(Object obj, Object obj2, long j10) {
        List list;
        List list2;
        int size;
        List listZzd;
        List list3 = (List) zzeq.zzf(obj2, j10);
        int size2 = list3.size();
        List list4 = (List) zzeq.zzf(obj, j10);
        if (!list4.isEmpty()) {
            if (!zza.isAssignableFrom(list4.getClass())) {
                if (list4 instanceof zzel) {
                    zzcm zzcmVar = new zzcm(list4.size() + size2);
                    zzcmVar.addAll(zzcmVar.size(), (zzel) list4);
                    list = zzcmVar;
                } else if ((list4 instanceof zzdm) && (list4 instanceof zzcf)) {
                    zzcf zzcfVar = (zzcf) list4;
                    if (!zzcfVar.zzc()) {
                        list2 = list4;
                        list2 = list4;
                        list2 = list4;
                        listZzd = zzcfVar.zzd(list4.size() + size2);
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
                zzeq.zzs(obj, j10, list3);
            }
            ArrayList arrayList = new ArrayList(list4.size() + size2);
            arrayList.addAll(list4);
            list = arrayList;
            zzeq.zzs(obj, j10, list);
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
            zzeq.zzs(obj, j10, list3);
        }
        if (list4 instanceof zzcn) {
            listZzd = new zzcm(size2);
        } else {
            listZzd = ((list4 instanceof zzdm) && (list4 instanceof zzcf)) ? ((zzcf) list4).zzd(size2) : new ArrayList(size2);
        }
        zzeq.zzs(obj, j10, listZzd);
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
        zzeq.zzs(obj, j10, list3);
    }
}
