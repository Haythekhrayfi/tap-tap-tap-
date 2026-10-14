package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzgre {
    private static final zzgre zza = new zzgre();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgrq zzb = new zzgqo();

    private zzgre() {
    }

    public static zzgre zza() {
        return zza;
    }

    public final zzgrp zzb(Class cls) {
        zzgpw.zzc(cls, "messageType");
        zzgrp zzgrpVarZza = (zzgrp) this.zzc.get(cls);
        if (zzgrpVarZza == null) {
            zzgrpVarZza = this.zzb.zza(cls);
            zzgpw.zzc(cls, "messageType");
            zzgrp zzgrpVar = (zzgrp) this.zzc.putIfAbsent(cls, zzgrpVarZza);
            if (zzgrpVar != null) {
                return zzgrpVar;
            }
        }
        return zzgrpVarZza;
    }
}
