package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfsi {
    public static boolean zza(Iterable iterable, zzfpi zzfpiVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            Objects.requireNonNull(zzfpiVar);
            return zzc((List) iterable, zzfpiVar);
        }
        Iterator it = iterable.iterator();
        Objects.requireNonNull(zzfpiVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzfpiVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static void zzb(List list, zzfpi zzfpiVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzfpiVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            } else {
                list.remove(i11);
            }
        }
    }

    private static boolean zzc(List list, zzfpi zzfpiVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzfpiVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzb(list, zzfpiVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzb(list, zzfpiVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }
}
