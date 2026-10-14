package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgqr {
    public static final int zza(int i10, Object obj, Object obj2) {
        zzgqq zzgqqVar = (zzgqq) obj;
        if (zzgqqVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzgqqVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzgqq) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzgqq zzgqqVarZzb = (zzgqq) obj;
        zzgqq zzgqqVar = (zzgqq) obj2;
        if (!zzgqqVar.isEmpty()) {
            if (!zzgqqVarZzb.zze()) {
                zzgqqVarZzb = zzgqqVarZzb.zzb();
            }
            zzgqqVarZzb.zzd(zzgqqVar);
        }
        return zzgqqVarZzb;
    }
}
